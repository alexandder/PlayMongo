name := "BigDataProject"

version := "1.0-SNAPSHOT"

resolvers ++= Seq(
  "repo.scalatools rels" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "repo.scalatools snaps" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.novus" %% "salat-core" % "1.9.4"
)     

play.Project.playScalaSettings
