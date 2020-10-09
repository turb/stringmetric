githubOwner := "GithubQuansic"
githubRepository := "_"
resolvers += Resolver.githubPackages(githubOwner.value, githubRepository.value)

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

// Needed by TRM build
addSbtPlugin("com.transparencyrights.sbt" % "transparency-sbt-plugin" % "1.5.0")
// End
