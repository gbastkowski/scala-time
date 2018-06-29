/******************************************************************
 * See the NOTICE file distributed with this work for additional  *
 * information regarding Copyright ownership.  The author/authors *
 * license this file to you under the terms of the Apache License *
 * Version 2.0 (the "License"); you may not use this file except  *
 * in compliance with the License.  You may obtain a copy of the  *
 * License at:                                                    *
 *                                                                *
 *     http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                                *
 * Unless required by applicable law or agreed to in writing,     *
 * software distributed under the License is distributed on an    *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,   *
 * either express or implied.  See the License for the specific   *
 * language governing permissions and limitations under the       *
 * License.                                                       *
 ******************************************************************/
lazy val scalaTime = project in file(".")
//  .enablePlugins(SbtCodesOsgi)


//site.settings

//ghpages.settings

version := "0.6.0-SNAPSHOT"

organization := "codes.reactive"

description := "Basic Scala wrapper for convenient use of JDK 1.8.0 time libraries."

startYear := Some(2014)

homepage := Some(url("https://oss.reactive.codes/scala-time"))

apiURL := Some(url(s"http://oss.reactive.codes/scala-time/${version.value}"))

//apacheLicensed

// publishOSS

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.12.2", "2.11.11", "2.10.6")

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.0" % Test)

// codesCompileOpts

// codesDocOpts

// codesUnidocOpts

scalacOptions in(Compile, compile) += "-language:postfixOps"

//OsgiKeys.bundleSymbolicName := "codes.reactive.scalatime"
//
//OsgiKeys.privatePackage := Seq("codes.reactive.scalatime*")
//
//OsgiKeys.exportPackage := Seq("codes.reactive.scalatime*")

// scalastyleConfig <<= baseDirectory(_ / ".idea/scalastyle_config.xml")

// SiteKeys.siteMappings := {
//   val dir = baseDirectory.value / "project/site"
//   Seq(
//     (dir / "site.html") → "index.html",
//     (dir / "site.css") → "site.css",
//     (dir / "site.js") → "site.js")
// }

// SiteKeys.siteMappings <++= (mappings in(ScalaUnidoc, packageDoc), version) map { (m, v) =>
//   for ((f, d) <- m) yield (f, s"$v/$d")
// }

// git.remoteRepo := codesGithubRepo.value.developerConnection.drop(8)

// addDevelopers(("arashi01", "Ali Salim Rashid", "a.rashid@zantekk.com"))
