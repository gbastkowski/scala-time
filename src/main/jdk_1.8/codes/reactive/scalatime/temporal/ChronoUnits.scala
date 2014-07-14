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
package temporal

import java.time.temporal.{ChronoUnit => CU}


/** Provides a standard set of date period units as [[TemporalUnit]] instances
  * @since  0.1.0
  */
trait ChronoUnits extends AbstractChronoUnits {

  val Centuries: ChronoUnit = CU.CENTURIES

  val Days: ChronoUnit = CU.DAYS

  val Decades: ChronoUnit = CU.DECADES

  val Eras: ChronoUnit = CU.ERAS

  val Forever: ChronoUnit = CU.FOREVER

  val HalfDays: ChronoUnit = CU.HALF_DAYS

  val Hours: ChronoUnit = CU.HOURS

  val Micros: ChronoUnit = CU.MICROS

  val Millenia: ChronoUnit = CU.MILLENNIA

  val Millis: ChronoUnit = CU.MILLIS

  val Minutes: ChronoUnit = CU.MINUTES

  val Months: ChronoUnit = CU.MONTHS

  val Nanos: ChronoUnit = CU.NANOS

  val Seconds: ChronoUnit = CU.SECONDS

  val Weeks: ChronoUnit = CU.WEEKS

  val Years: ChronoUnit = CU.YEARS
}
