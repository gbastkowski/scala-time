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

import java.time.{LocalDate => LD}

/** Factory object for creation of [[LocalDate]] instances
  * @since 0.1.0
  */
object LocalDate extends LocalDateFactory {
  def apply(): LocalDate = LD.now(Clock())

  def apply(clock: Clock): LocalDate = LD.now(clock)

  def apply(from: TemporalAccessor): LocalDate = LD.from(from)

  def of(year: Int, month: Int, day: Int): LocalDate = LD.of(year, month, day)

  def of(year: Int, month: Month, day: Int): LocalDate = LD.of(year, month, day)

  def parse(text: String): LocalDate = LD.parse(text)

  def parse(text: String, formatter: DateTimeFormatter): LocalDate = LD.parse(text, formatter)

}

