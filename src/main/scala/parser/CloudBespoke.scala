package parser

/**
 * Created by rs79538 on 09/29/2015.
 */
class CloudBespoke(path1: String, path2: String) {
  println("CLOUD-BESPOKE")
  println()


  println("akka.conf")
  println("==========")
  new ConfigParser().parseConfig(path1 + "\\akka.conf", path2 + "\\akka.conf")
  println()

  println("application.conf")
  println("================")
  new ConfigParser().parseConfig(path1 + "\\application.conf", path2 + "\\application.conf")
  println()

  println("bespoke.conf")
  println("=================")
  new ConfigParser().parseConfig(path1 + "\\bespoke.conf", path2 + "\\bespoke.conf")
  println()

  println("env.conf")
  println("=======")
  new ConfigParser().parseConfig(path1 + "\\env.conf", path2 + "\\env.conf")
  println()

  println("messages.conf")
  println("=============")
  new ConfigParser().parseConfig(path1 + "\\messages.conf", path2 + "\\messages.conf")
  println()

  println("kamon.conf")
  println("=============")
  new ConfigParser().parseConfig(path1 + "\\kamon.conf", path2 + "\\kamon.conf")
  println()

  println("mongo.conf")
  println("==========")
  new ConfigParser().parseConfig(path1 + "\\mongo.conf", path2 + "\\mongo.conf")



}
