/*******************************************************************
 * See the NOTICE file distributed with this work for additional   *
 * information regarding Copyright ownership.  The author/authors  *
 * license this file to you under the terms of the Apache License, *
 * Version 2.0 (the "License"); you may not use this file except   *
 * in compliance with the License.  You may obtain a copy of the   *
 * License at:                                                     *
 *                                                                 *
 *     http://www.apache.org/licenses/LICENSE-2.0                  *
 *                                                                 *
 * Unless required by applicable law or agreed to in writing,      *
 * software distributed under the License is distributed on an     *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY          *
 * KIND, either express or implied.  See the License for the       *
 * specific language governing permissions and limitations         *
 * under the License.                                              *
 *******************************************************************/

package codes.reactive.scalatime

import java.time.{ZoneId => ZI}

/** Provides default time zone [[ZoneID]] instances, as well as methods to create them.
  * @since  0.1.0
  */
private[scalatime] trait ZoneIDs extends AbstractZoneIDs {

  val EAT: ZoneID = apply(entries.find(_.contains("Nairobi")).get)

  val UTC: ZoneID = apply("Z")

  def apply(temporal: TemporalAccessor): ZoneID = ZI.from(temporal)

  def apply(zoneID: String): ZoneID = ZI.of(zoneID)

  def apply(zoneID: String, aliasMap: Map[String, String]): ZoneID = ZI.of(zoneID,
    collection.JavaConversions.mapAsJavaMap(aliasMap))

  def apply(prefix: String, offset: ZoneOffset): ZoneID = ZI.ofOffset(prefix, offset)

  def system: ZoneID = ZI.systemDefault

  def entries: Set[String] = collection.JavaConversions.asScalaSet(ZI.getAvailableZoneIds).toSet

}