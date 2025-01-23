import scala.collection.Seq

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"
//2.13.12
lazy val root = (project in file("."))
  .settings(
    name := "parcial",
    libraryDependencies ++=Seq(

      "mysql" % "mysql-connector-java" % "8.0.33",
      "org.tpolecat" %% "doobie-core" % "1.0.0-RC1",
      "com.typesafe.slick" %% "slick" % "3.4.1"
    )
  )
