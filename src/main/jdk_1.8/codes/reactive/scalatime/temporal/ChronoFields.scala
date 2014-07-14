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

import java.time.temporal.{ChronoField => CF}

/** Provides a standard set of date period fields as [[TemporalField]] instances
  * @since  0.1.0
  */
trait ChronoFields extends AbstractChronoFields {

  val AlignedDayOfWeekInMonth: ChronoField = CF.ALIGNED_DAY_OF_WEEK_IN_MONTH

  val AlignedDayOfWeekInYear: ChronoField = CF.ALIGNED_DAY_OF_WEEK_IN_YEAR

  val AlignedWeekOfMonth: ChronoField = CF.ALIGNED_WEEK_OF_MONTH

  val AlignedWeedOfYear: ChronoField = CF.ALIGNED_WEEK_OF_YEAR

  val AmPmOfDay: ChronoField = CF.AMPM_OF_DAY

  val ClockHourOfAmPm: ChronoField = CF.CLOCK_HOUR_OF_AMPM

  val ClockHourOfDay: ChronoField = CF.CLOCK_HOUR_OF_DAY

  val DayOfMonth: ChronoField = CF.DAY_OF_MONTH

  val DayOfWeek: ChronoField = CF.DAY_OF_WEEK

  val DayOfYear: ChronoField = CF.DAY_OF_YEAR

  val EpochDay: ChronoField = CF.EPOCH_DAY

  val Era: ChronoField = CF.ERA

  val HourOfMonth: ChronoField = CF.HOUR_OF_AMPM

  val HourOfDay: ChronoField = CF.HOUR_OF_DAY

  val InstantSeconds: ChronoField = CF.INSTANT_SECONDS

  val MicroOfDay: ChronoField = CF.MICRO_OF_DAY

  val MicroOfSecond: ChronoField = CF.MICRO_OF_SECOND

  val MilliOfDay: ChronoField = CF.MILLI_OF_DAY

  val MilliOfSecond: ChronoField = CF.MILLI_OF_SECOND

  val MinuteOfDay: ChronoField = CF.MINUTE_OF_DAY

  val MinuteOfMonth: ChronoField = CF.MINUTE_OF_HOUR

  val MonthOfYear: ChronoField = CF.MONTH_OF_YEAR

  val MonthOfday: ChronoField = CF.NANO_OF_DAY

  val NanoOfSecond: ChronoField = CF.NANO_OF_SECOND

  val OffsetSeconds: ChronoField = CF.OFFSET_SECONDS

  val ProlepticMonth: ChronoField = CF.PROLEPTIC_MONTH

  val SecondOfDay: ChronoField = CF.SECOND_OF_DAY

  val SecondOfMinute: ChronoField = CF.SECOND_OF_MINUTE

  val Year: ChronoField = CF.YEAR

  val YearOfEra: ChronoField = CF.YEAR_OF_ERA
}
