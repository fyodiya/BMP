ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "BMP"
  )

// https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.12.0"

// https://mvnrepository.com/artifact/org.apache.xmlgraphics/batik-transcoder
libraryDependencies += "org.apache.xmlgraphics" % "batik-transcoder" % "1.11"







