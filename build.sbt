import Dependencies._

/*   NOTES

Configuration follows
https://medium.com/@mrpowers/creating-a-spark-project-with-sbt-intellij-sbt-spark-package-and-friends-cc9108751c28

- Spark doesn’t work with Scala 2.12 yet
- SBT 1.x uses Scala 2.12, so it’s best to stick with SBT 0.13.x when using Spark.
*/


// sbt Spark plugin -------

// Name of your Spark Package
spName := "com.john-cd/my-spark"

// Please specify any Spark dependencies using sparkVersion and sparkComponents. For example:
sparkVersion := "2.3.0" // the Spark Version your package depends on.

// creates a dependency on spark-mllib, etc...
sparkComponents += "sql"
//sparkComponents ++= Seq("mllib", "streaming", "sql")
// Spark Core will be included by default if no value for sparkComponents is supplied.

// You can make a zip archive ready for a release on the Spark Packages website by simply calling sbt spDist. 
// By default, the zip file will be produced in <project>/target, but you can override this by providing a value for spDistDirectory like
// spDistDirectory := "distribution"

// -------------------------

scalacOptions += "-deprecation"


// Ornate
// https://index.scala-lang.org/szeiger/ornate/ornate/0.5?target=_2.11
// You can run Ornate from sbt with the ornate task.

//libraryDependencies += "com.novocode" %% "ornate" % "0.5"



lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.john-cd",
      scalaVersion := "2.11.12",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "sparkExample",
    libraryDependencies += scalaTest % Test
//    ,libraryDependencies ++= Seq(
//        "org.apache.spark" %% "spark-core" % sparkVersion % "provided" withSources(),
//      "org.apache.spark" %% "spark-sql" % sparkVersion
//    )
  )
 
 //.enablePlugins(OrnatePlugin)






