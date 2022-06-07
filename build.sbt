import Dependencies._

import java.nio.file.Path

// This an example of a simple project definition.
// It should build on both sbt 0.13.15 and sbt 1.0.0

lazy val root = (project in file("."))
  .settings(
    organization := "com.example",
    scalaVersion := "2.12.2",
    version      := "0.1.0-SNAPSHOT",
    name := "Hello",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += "com.github.pureconfig" %% "pureconfig" % "0.17.1"