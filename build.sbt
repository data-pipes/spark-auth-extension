name := "spark-auth-extension"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  //"org.apache.spark" %% "spark-streaming" % "2.3.2" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.4.0" % "provided",
  "com.typesafe.play" %% "play-json" % "2.6.9" % "provided",
  "org.scalaj" %% "scalaj-http" % "2.4.1"  % "provided",

  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
  // "com.holdenkarau" %% "spark-testing-base" % "2.3.2_0.11.0" % "test"
),