import sbt._
import sbt.Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
// scalafmt: { maxColumn = 120, style = defaultWithAlign }

object Dependencies {
  val metaconfigV = "0.7.2"
  val scalametaV = "1.8.0"
  val scalatestV = "3.0.4"
  val coursier = "1.0.0-RC12"

  val scalapb = Def.setting {
    ExclusionRule(
      organization = "com.trueaccord.scalapb",
      artifact = s"scalapb-runtime_${scalaBinaryVersion.value}"
    )
  }

  val scalametaTestkit = "org.scalameta" %% "testkit" % scalametaV
  val scalariform = "org.scalariform" %% "scalariform" % "0.1.8"

  val scalatest = Def.setting("org.scalatest" %%% "scalatest" % scalatestV)
  val scalameta = Def.setting("org.scalameta" %%% "scalameta" % scalametaV excludeAll scalapb.value)
  val metaconfig = Def.setting("com.geirsson" %%% "metaconfig-core" % metaconfigV)
  val metaconfigTypesafe = Def.setting("com.geirsson" %%% "metaconfig-typesafe-config" % metaconfigV)
  val metaconfigHocon = Def.setting("com.geirsson" %%% "metaconfig-hocon" % metaconfigV)

}
