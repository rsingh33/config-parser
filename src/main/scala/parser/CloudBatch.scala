package parser

/**
 * Created by rs79538 on 09/29/2015.
 */
class CloudBatch(path1: String, path2: String) {
  println("CLOUD-BATCH")
  println()


  println("akka.conf")
  println("==========")
  new ConfigParser().parseConfig(path1 + "\\akka.conf", path2 + "\\akka.conf")
  println()

  println("application.conf")
  println("================")
  new ConfigParser().parseConfig(path1 + "\\application.conf", path2 + "\\application.conf")
  println()

  println("batch.conf")
  println("=================")
  new ConfigParser().parseConfig(path1 + "\\batch.conf", path2 + "\\batch.conf")
  println()

  println("file-monitor.conf")
  println("==================")
  new ConfigParser().parseConfig(path1 + "\\file-monitor.conf", path2 + "\\file-monitor.conf")
  println()

  println("messages.conf")
  println("=============")
  new ConfigParser().parseConfig(path1 + "\\messages.conf", path2 + "\\messages.conf")
  println()

  println("mongo.conf")
  println("==========")
  new ConfigParser().parseConfig(path1 + "\\mongo.conf", path2 + "\\mongo.conf")

  println("kamon.conf")
  println("==========")
  new ConfigParser().parseConfig(path1 + "\\kamon.conf", path2 + "\\kamon.conf")
  println()

  println("spray.conf")
  println("==========")
  new ConfigParser().parseConfig(path1 + "\\spray.conf", path2 + "\\spray.conf")



}