import Dependencies._

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.github.dimitarg"
ThisBuild / organizationName := "Dimitar Lyubomirov Georgiev"

lazy val root = (project in file("."))
  .settings(
    name := "svoboda",
    libraryDependencies ++= Seq(
      munit % Test,
      newtype,
    )
  )

ThisBuild / scalacOptions ++= Seq(
  "-Ymacro-annotations"
)
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
