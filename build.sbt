name := "newtype-scoverage-issue"

version := "0.1"

scalaVersion := "2.13.6"

scalacOptions := Seq(
  "-Ymacro-annotations"
)

libraryDependencies += "io.estatico" %% "newtype" % "0.4.4"

