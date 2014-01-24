import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "assetLoaderTest"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    javaCore,
    javaJdbc,
    javaEbean,
    anorm,
    cache
  )

  val assetsLoader = "com.ee" %% "assets-loader" % "0.11.5-SNAPSHOT"
  val edeustaceReleases= "ed eustace" at "http://edeustace.com/repository/releases/"
  val edeustaceSnapshots = "ed eustace snapshots" at "http://edeustace.com/repository/snapshots/"

  val main = play.Project(appName, appVersion, appDependencies).settings(
    libraryDependencies += assetsLoader,
    resolvers += edeustaceSnapshots
  )

}
