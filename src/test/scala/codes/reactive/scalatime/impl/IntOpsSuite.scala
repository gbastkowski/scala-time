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

import java.time.{Month, Period, YearMonth}

import org.scalatest.{Matchers, Outcome, fixture}


class IntOpsSuite extends fixture.FunSuite with Matchers {

  test("`day` obtains a period equal to the specified number of days")(_.day shouldBe Period.ofDays(10))

  test("`days` obtains a period equal to the specified number of days")(_.days shouldBe Period.ofDays(10))

  test("`week` obtains a period equal to the specified number of weeks")(_.week shouldBe Period.ofWeeks(10))

  test("`weeks` obtains a period equal to the specified number of weeks")(_.weeks shouldBe Period.ofWeeks(10))

  test("`month` obtains a period equal to the specified number of months")(_.month shouldBe Period.ofMonths(10))

  test("`months` obtains a period equal to the specified number of months")(_.months shouldBe Period.ofMonths(10))

  test("`year` obtains a period equal to the specified number of years")(_.year shouldBe Period.ofYears(10))

  test("`years` obtains a period equal to the specified number of years")(_.years shouldBe Period.ofYears(10))

  override type FixtureParam = PeriodFactory

  override protected def withFixture(test: OneArgTest): Outcome = withFixture(test.toNoArgTest(PeriodFactory(10)))
}
