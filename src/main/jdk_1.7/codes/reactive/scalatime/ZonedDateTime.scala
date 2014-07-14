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

import org.threeten.bp.{ZonedDateTime => ZD}


/** Factory object for creation of [[ZonedDateTime]] instances
  * @since 0.1.0
  */
object ZonedDateTime extends ZonedDateTimeFactory {


  def apply(): ZonedDateTime = ZD.now(Clock())

  def apply(clock: Clock): ZonedDateTime = ZD.now(clock)

  def apply(from: TemporalAccessor): ZonedDateTime = ZD.from(from)

  def apply(date: LocalDate, time: LocalTime, zone: ZoneID): ZonedDateTime = ZD.of(date, time, zone)

  def apply(dateTime: LocalDateTime, zone: ZoneID): ZonedDateTime = ZD.of(dateTime, zone)

  def of(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, nano: Int, zone: ZoneID): ZonedDateTime =
    ZD.of(year, month, day, hour, minute, second, nano, zone)

  def of(year: Int, month: Month, day: Int, hour: Int, minute: Int, second: Int, nano: Int, zone: ZoneID): ZonedDateTime =
    ZD.of(year, month.getValue, day, hour, minute, second, nano, zone)

  def parse(text: String): ZonedDateTime = ZD.parse(text)

  def parse(text: String, formatter: DateTimeFormatter): ZonedDateTime = ZD.parse(text, formatter)

}