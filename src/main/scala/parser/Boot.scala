package parser

/**
 * Created by rs79538 on 09/29/2015.
 */
 // adding a comment for git to track
object boot {
  def main(args: Array[String]): Unit = {
    if (args.length != 3) {
      println("You must enter path of 2 directories and the name of application")
      System.exit(0)
    }
    val path1: String = args(0)
    val path2: String = args(1)
    val app: String = args(2)

    app match {
      case "cloud-auth" => new CloudAuth(path1, path2)
      case "cloud-rest" => new CloudRest(path1, path2)
      case "cloud-bespoke" => new CloudBespoke(path1, path2)
      case "cloud-batch" => new CloudBatch(path1, path2)
      case "cloud-bridge" => new CloudBridge(path1, path2)
    }

  }

}