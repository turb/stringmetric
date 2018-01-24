import sbt.Keys._
import sbt._

object Settings {

	val commonSettings: Seq[Def.Setting[_]] = Seq(
		organization := "com.rockymadden.stringmetric",
		homepage := Some(url("https://rockymadden.com/stringmetric/")),
		scalaVersion := "2.12.4",
		scalacOptions ++= Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-Xlint"),
		licenses := Seq("Apache 2.0" -> url("https://opensource.org/licenses/Apache-2.0")),
		pomExtra :=
			<url>http://rockymadden.com/stringmetric/</url>
				<licenses>
					<license>
						<name>MIT</name>
						<distribution>repo</distribution>
					</license>
				</licenses>
				<scm>
					<url>git@github.com:rockymadden/stringmetric.git</url>
					<connection>scm:git:git@github.com:rockymadden/stringmetric.git</connection>
				</scm>
				<developers>
					<developer>
						<id>rockymadden</id>
						<name>Rocky Madden</name>
						<url>http://rockymadden.com/</url>
					</developer>
				</developers>,
		credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
		publishMavenStyle := true,
		publishTo := Some("Sonatype" at "https://oss.sonatype.org/service/local/staging/deploy/maven2"),
		resolvers ++= Seq(DefaultMavenRepository)
	)
}
