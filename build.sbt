name := "scala-tests"

version := "1.0"

scalaVersion := "2.10.0"

resolvers ++= Seq(
 "Scala-Tools Maven2 Releases Repository" at "http://scala-tools.org/repo-releases",
 "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"
)

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)
