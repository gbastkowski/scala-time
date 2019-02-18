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

version := "0.1.0-SNAPSHOT"
organization := "name.bastkowski"
description := "Basic Scala wrapper for convenient use of JDK 1.8+ time libraries."
startYear := Some(2019)

homepage := Some(url("https://oss.reactive.codes/scala-time"))
apiURL := Some(url(s"http://oss.reactive.codes/scala-time/${version.value}"))

scalaVersion := crossScalaVersions.value.head
crossScalaVersions := Seq("2.12.7", "2.11.11")

libraryDependencies ++= Seq(
  "org.scalaz"    %% "scalaz-core"  % "7.2.25",
  "org.scalatest" %% "scalatest"    % "3.0.5"   % Test)

scalacOptions in(Compile, compile) += "-language:postfixOps"

