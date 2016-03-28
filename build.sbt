name := """CIT337"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)


scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  jdbc,
  "org.scalikejdbc" %% "scalikejdbc"       % "2.3.5",
  "com.h2database"  %  "h2"                % "1.4.191",
  "ch.qos.logback"  %  "logback-classic"   % "1.1.3",
  "mysql" % "mysql-connector-java" % "5.1.18"
)


