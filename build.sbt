lazy val root = (project in file(".")).
  settings(
    name := "scala-dino",
    version := "1.0",
    scalaVersion := "2.11.7"
  )

// spec2 dependencies
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.6.5" % "test")
scalacOptions in Test ++= Seq("-Yrangepos")