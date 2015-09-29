package parser

/**
 * Created by rs79538 on 09/29/2015.
 */
class CloudBridge(path1: String, path2: String) {
  println("CLOUD-BRIDGE")
  println()


  println("dictionary.conf")
  println("=============")
  new ConfigParser().parseConfig(path1 + "\\dictionary.conf", path2 + "\\dictionary.conf")
  println()

  println("application.conf")
  println("================")
  new ConfigParser().parseConfig(path1 + "\\application.conf", path2 + "\\application.conf")
  println()
}
