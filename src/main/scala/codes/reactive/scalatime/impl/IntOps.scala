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

package codes.reactive.scalatime.impl

import java.time.Month._
import java.time.{LocalDate, Month, Period, YearMonth}

import scala.language.implicitConversions


/** Enriches a [[scala.Int]] with methods for obtaining [[Period]] instances. */
final case class PeriodFactory(underlying: Int) extends AnyVal {
  /** Obtains a [[Period]] representing a number of days. */
  def day: Period = days

  /** Obtains a [[Period]] representing a number of days. */
  def days: Period = Period.ofDays(underlying) // TODO? Better way to overload day/days when used on literals.
  // ie. both Period and Duration can be constructed from Int literals

  /** Obtains a [[Period]] representing a number of weeks. */
  def week: Period = weeks

  /** Obtains a [[Period]] representing a number of weeks. */
  def weeks: Period = Period.ofWeeks(underlying)

  /** Obtains a [[Period]] representing a number of months. */
  def month: Period = months

  /** Obtains a [[Period]] representing a number of months. */
  def months: Period = Period.ofMonths(underlying)

  /** Obtains a [[Period]] representing a number of years. */
  def year: Period = years

  /** Obtains a [[Period]] representing a number of years. */
  def years: Period = Period.ofYears(underlying)
}

/** Enriches a [[scala.Int]] with methods for obtaining [[java.time.temporal.Temporal]] instances. */
final case class YearMonthFactory(underlying: Int) extends AnyVal {
  def jan:                YearMonth = toYearMonth(JANUARY)
  def january:            YearMonth = jan
  def jan(d: Int):        LocalDate = toLocalDate(jan, d)
  def january(d: Int):    LocalDate = jan(d)

  def feb:                YearMonth = toYearMonth(FEBRUARY)
  def february:           YearMonth = feb
  def feb(d: Int):        LocalDate = toLocalDate(feb, d)
  def february(d: Int):   LocalDate = feb(d)

  def mar:                YearMonth = toYearMonth(MARCH)
  def march:              YearMonth = mar
  def mar(d: Int):        LocalDate = toLocalDate(mar, d)
  def march(d: Int):      LocalDate = mar(d)

  def apr:                YearMonth = toYearMonth(APRIL)
  def april:              YearMonth = apr
  def apr(d: Int):        LocalDate = toLocalDate(apr, d)
  def april(d: Int):      LocalDate = apr(d)

  def may:                YearMonth = toYearMonth(MAY)
  def may(d: Int):        LocalDate = toLocalDate(may, d)

  def jun:                YearMonth = toYearMonth(JUNE)
  def june:               YearMonth = jun
  def jun(d: Int):        LocalDate = toLocalDate(jun, d)
  def june(d: Int):       LocalDate = jun(d)

  def jul:                YearMonth = toYearMonth(Month.JULY)
  def july:               YearMonth = jul
  def jul(d: Int):        LocalDate = toLocalDate(jul, d)
  def july(d: Int):       LocalDate = jul(d)

  def aug:                YearMonth = toYearMonth(AUGUST)
  def august:             YearMonth = aug
  def aug(d: Int):        LocalDate = toLocalDate(aug, d)
  def august(d: Int):     LocalDate = aug(d)

  def sep:                YearMonth = toYearMonth(SEPTEMBER)
  def september:          YearMonth = sep
  def sep(d: Int):        LocalDate = toLocalDate(sep, d)
  def september(d: Int):  LocalDate = sep(d)

  def oct:                YearMonth = toYearMonth(OCTOBER)
  def october:            YearMonth = oct
  def oct(d: Int):        LocalDate = toLocalDate(oct, d)
  def october(d: Int):    LocalDate = oct(d)

  def nov:                YearMonth = toYearMonth(NOVEMBER)
  def november:           YearMonth = nov
  def nov(d: Int):        LocalDate = toLocalDate(nov, d)
  def november(d: Int):   LocalDate = nov(d)

  def dec:                YearMonth = toYearMonth(DECEMBER)
  def december:           YearMonth = dec
  def dec(d: Int):        LocalDate = toLocalDate(dec, d)
  def december(d: Int):   LocalDate = dec(d)

  private[this] def toYearMonth(m: Month) = YearMonth.of(underlying, m)
  private[this] def toLocalDate(ym: YearMonth, d: Int) = LocalDate.of(ym.getYear, ym.getMonth, d)
}

trait ToIntOps extends Any {
  implicit final def toPeriodFactory(v: Int): PeriodFactory = PeriodFactory(v)
  implicit final def toYearMonthFactory(v: Int): YearMonthFactory = YearMonthFactory(v)
}
