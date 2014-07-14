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

import java.time.{OffsetDateTime => OD}

/** Factory object for obtaining [[OffsetDateTime]] instances. */
object OffsetDateTime extends OffsetDateTimeFactory {


  def apply(): OffsetDateTime = OD.now(Clock())

  def apply(clock: Clock): OffsetDateTime = OD.now(clock)

  def apply(from: TemporalAccessor): OffsetDateTime = OD.from(from)

  def apply(date: LocalDate, time: LocalTime, zone: ZoneOffset): OffsetDateTime = OD.of(date, time, zone)

  def apply(dateTime: LocalDateTime, zone: ZoneOffset): OffsetDateTime = OD.of(dateTime, zone)

  def of(year: Int,
         month: Int,
         day: Int,
         hour: Int,
         minute: Int,
         second: Int,
         nano: Int,
         zone: ZoneOffset): OffsetDateTime =
    OD.of(year, month, day, hour, minute, second, nano, zone)

  def of(year: Int,
         month: Month,
         day: Int,
         hour: Int,
         minute: Int,
         second: Int,
         nano: Int,
         zone: ZoneOffset): OffsetDateTime =
    OD.of(year, month.getValue, day, hour, minute, second, nano, zone)

  def parse(text: String): OffsetDateTime = OD.parse(text)

  def parse(text: String, formatter: DateTimeFormatter): OffsetDateTime = OD.parse(text, formatter)

  val Max: OffsetDateTime = OD.MAX

  val Min: OffsetDateTime = OD.MIN

}