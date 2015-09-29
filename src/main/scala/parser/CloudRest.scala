package parser

/**
 * Created by rs79538 on 09/29/2015.
 */
class CloudRest(path1: String, path2: String) {
  println("CLOUD-REST")
  println()


  println("backlist.conf")
  println("=============")
  new ConfigParser().parseConfig(path1 + "\\backlist.conf", path2 + "\\backlist.conf")
  println()

  println("application.conf")
  println("================")
  new ConfigParser().parseConfig(path1 + "\\application.conf", path2 + "\\application.conf")
  println()
}
