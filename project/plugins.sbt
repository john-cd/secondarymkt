// https://github.com/databricks/sbt-spark-package

resolvers += "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/"
addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.6")


// Ornate doc generator
// addSbtPlugin("com.novocode" % "sbt-ornate" % "0.5")