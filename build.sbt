name := "logback-kafka-example"

version := "0.0.1"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "Sonatype OSS Public" at "https://oss.sonatype.org/content/repositories/public",
  "Apache repo" at "https://repository.apache.org/content/repositories/releases",
  "clojars" at "http://clojars.org/repo/"
)

libraryDependencies ++= Seq(
  "org.clojars.canawar" % "logback-kafka" % "0.2.11",
  "ch.qos.logback" % "logback-classic" % "1.0.13",
  "org.apache.kafka" %% "kafka" % "0.8.1.1"
    exclude("javax.jms", "jms")
    exclude("com.sun.jdmk", "jmxtools")
    exclude("com.sun.jmx", "jmxri")
)
