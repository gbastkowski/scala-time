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

import org.threeten.bp.{LocalDateTime => LD}


/** Factory object for creation of [[LocalDateTime]] instances
  * @since 0.1.0
  */
object LocalDateTime extends LocalDateTimeFactory {

  def apply(): LocalDateTime = LD.now(Clock())

  def apply(clock: Clock): LocalDateTime = LD.now(clock)

  def apply(from: TemporalAccessor): LocalDateTime = LD.from(from)

  def apply(date: LocalDate, time: LocalTime): LocalDateTime = LD.of(date, time)

  def of(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, nano: Int): LocalDateTime =
    LD.of(year, month, day, hour, minute, second, nano)

  def of(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int): LocalDateTime =
    LD.of(year, month, day, hour, minute, second)

  def of(year: Int, month: Int, day: Int, hour: Int, minute: Int): LocalDateTime =
    LD.of(year, month, day, hour, minute)

  def of(year: Int, month: Month, day: Int, hour: Int, minute: Int, second: Int, nano: Int): LocalDateTime =
    LD.of(year, month, day, hour, minute, second, nano)

  def of(year: Int, month: Month, day: Int, hour: Int, minute: Int, second: Int): LocalDateTime =
    LD.of(year, month, day, hour, minute, second)

  def of(year: Int, month: Month, day: Int, hour: Int, minute: Int): LocalDateTime =
    LD.of(year, month, day, hour, minute)

  def parse(text: String): LocalDateTime = LD.parse(text)

  def parse(text: String, formatter: DateTimeFormatter): LocalDateTime = LD.parse(text, formatter)

}
