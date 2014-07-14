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

import org.threeten.bp.{LocalTime => LT}

/** Factory object for creating [[LocalTime]] instances **/
object LocalTime extends LocalTimeFactory {

  def apply(): LocalTime = LT.now(Clock())

  def apply(clock: Clock): LocalTime = LT.now(clock)

  def apply(from: TemporalAccessor): LocalTime = LT.from(from)

  def parse(text: String): LocalTime = LT.parse(text)

  def parse(text: String, formatter: DateTimeFormatter): LocalTime = LT.parse(text, formatter)

  def of(hour: Int, minute: Int, second: Int, nano: Int): LocalTime = LT.of(hour, minute, second, nano)

  def of(hour: Int, minute: Int, second: Int): LocalTime = LT.of(hour, minute, second)

  def of(hour: Int, minute: Int): LocalTime = LT.of(hour, minute)

  def ofNano(nanoOfDay: Long): LocalTime = LT.ofNanoOfDay(nanoOfDay)

  def ofSecond(secondOfDay: Long): LocalTime = LT.ofSecondOfDay(secondOfDay)

  val Max: LocalTime = LT.MAX

  val Midnight: LocalTime = LT.MIDNIGHT

  val Min: LocalTime = Midnight

  val Noon: LocalTime = LT.NOON
}