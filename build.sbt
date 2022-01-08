ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "squirrel",
    idePackagePrefix := Some("fish.eyebrow.squirrel"),
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-simple" % "1.7.32",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",

      "org.typelevel" %% "cats-core" % "2.7.0",
      "org.typelevel" %% "cats-effect" % "3.3.0",

      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
    ),
  )
