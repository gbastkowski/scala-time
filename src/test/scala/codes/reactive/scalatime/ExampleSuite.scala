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
package codes.reactive.scalatime

import java.time.Month.JANUARY
import java.time.{Duration, LocalDate, Month, YearMonth}
import java.time.Month._

import org.scalatest.{FunSpec, Matchers}

/**
  * Have a look here to see how to use this library.
  */
class ExampleSuite extends FunSpec with Matchers {
  describe("Duration") {
    it("can be created with a minutes suffix") {
      1.minutes shouldEqual Duration.ofMinutes(1)
    }
  }

  describe("YearMonth") {
    it("supports JAN") { 2018.jan shouldEqual YearMonth.of(2018, JANUARY)   }
    it("supports FEB") { 2018.feb shouldEqual YearMonth.of(2018, FEBRUARY)  }
    it("supports MAR") { 2018.mar shouldEqual YearMonth.of(2018, MARCH)     }
    it("supports APR") { 2018.apr shouldEqual YearMonth.of(2018, APRIL)     }
    it("supports MAY") { 2018.may shouldEqual YearMonth.of(2018, MAY)       }
    it("supports JUN") { 2018.jun shouldEqual YearMonth.of(2018, JUNE)      }
    it("supports JUL") { 2018.jul shouldEqual YearMonth.of(2018, JULY)      }
    it("supports AUG") { 2018.aug shouldEqual YearMonth.of(2018, AUGUST)    }
    it("supports SEP") { 2018.sep shouldEqual YearMonth.of(2018, SEPTEMBER) }
    it("supports OCT") { 2018.oct shouldEqual YearMonth.of(2018, OCTOBER)   }
    it("supports NOV") { 2018.nov shouldEqual YearMonth.of(2018, NOVEMBER)  }
    it("supports DEC") { 2018.dec shouldEqual YearMonth.of(2018, DECEMBER)  }
  }

  describe("LocalDate") {
    it("supports JAN") { (2018 jan 1) shouldEqual LocalDate.of(2018, JANUARY,    1) }
    it("supports FEB") { (2018 feb 1) shouldEqual LocalDate.of(2018, FEBRUARY,   1) }
    it("supports MAR") { (2018 mar 1) shouldEqual LocalDate.of(2018, MARCH,      1) }
    it("supports APR") { (2018 apr 1) shouldEqual LocalDate.of(2018, APRIL,      1) }
    it("supports MAY") { (2018 may 1) shouldEqual LocalDate.of(2018, MAY,        1) }
    it("supports JUN") { (2018 jun 1) shouldEqual LocalDate.of(2018, JUNE,       1) }
    it("supports JUL") { (2018 jul 1) shouldEqual LocalDate.of(2018, JULY,       1) }
    it("supports AUG") { (2018 aug 1) shouldEqual LocalDate.of(2018, AUGUST,     1) }
    it("supports SEP") { (2018 sep 1) shouldEqual LocalDate.of(2018, SEPTEMBER,  1) }
    it("supports OCT") { (2018 oct 1) shouldEqual LocalDate.of(2018, OCTOBER,    1) }
    it("supports NOV") { (2018 nov 1) shouldEqual LocalDate.of(2018, NOVEMBER,   1) }
    it("supports DEC") { (2018 dec 1) shouldEqual LocalDate.of(2018, DECEMBER,   1) }
  }
}
