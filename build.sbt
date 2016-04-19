name := """ada"""

version := "1.0-SNAPSHOT"

//lazy val root = (project in file(".")).enablePlugins(PlayJava)
lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa,
  json,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.38",
  "org.apache.commons" % "commons-lang3" % "3.4",
  "commons-io" % "commons-io" % "2.4",
  "org.apache.commons" % "commons-collections4" % "4.1"


)

