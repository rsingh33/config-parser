package parser

import java.io.File

import com.typesafe.config.{ConfigException, ConfigFactory}

/**
 * Created by rs79538 on 09/15/2015.
 */

class ConfigParser() {

  def parseConfig(file1: String, file2: String) {

    try {
      val config1 = ConfigFactory.parseFile(new File(file1))
      val config2 = ConfigFactory.parseFile(new File(file2))


      val set1 = config1.entrySet();
      val set2 = config2.entrySet();


      import scala.collection.JavaConversions._


      val diff1 = set1.diff(set2)
      val diff2 = set2.diff(set1)

      diff1.map(el => (el.getKey -> el.getValue.unwrapped().toString))
      diff2.map(el => (el.getKey -> el.getValue.unwrapped().toString))



      val unsortedSet1 = diff1.map(e1 => (e1.getKey, e1.getValue.unwrapped().toString))
      val unsortedSet2 = diff2.map(e1 => (e1.getKey, e1.getValue.unwrapped().toString))

      val seq1 = unsortedSet1.toList.sortBy(_._1)
      val seq2 = unsortedSet2.toList.sortBy((_._1))

      val acc: List[(String, String, String)] = Nil

      val finalList = align(seq1, seq2, acc)

      finalList.map(elm => println(elm._1 + "     " + elm._2 + "     " + elm._3))
    } catch {
      case e: ConfigException => println("exception caught: " + e);
    }



  }


  def align(as: List[(String, String)], bs: List[(String, String)], acc: List[(String, String, String)]): List[(String, String, String)] = {
    (as, bs) match {
      case (Nil, ys) => acc ++ (ys.map(el => (el._1, "not-in-old version", el._2)))
      case (xs, Nil) => acc ++ (xs.map(el => (el._1, el._2, "not-in-new version")))
      case (Nil, Nil) => acc
      case (x :: xs, y :: ys) if (x._1 < y._1) => align(xs, y :: ys, acc ++ List((x._1, y._2, "not-in-new version")))
      case (x :: xs, y :: ys) if (x._1 > y._1) => align(x :: xs, ys, acc ++ List((y._1, "not-in-old version", y._2)))
      case (x :: xs, y :: ys) if (x._1.equals(y._1)) => align(xs, ys, acc ++ List((x._1, x._2, y._2)))

    }

  }
}



