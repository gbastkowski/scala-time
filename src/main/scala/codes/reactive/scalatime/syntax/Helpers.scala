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
package syntax

import format.DateTimeFormatter
import temporal.{ChronoUnits, ChronoFields, IsoUnits, IsoFields}


protected[syntax] trait UnitHelpers {

  /** Provides a standard set of date period fields as [[TemporalField]] instances, including those
    * specific to the ISO-8601 calendar system.
    */
  lazy val field = new ChronoFields with IsoFields {}

  /** Provides a standard set of date period units as [[TemporalUnit]] instances, including those
    * specific to the ISO-8601 calendar system.
    */
  lazy val unit = new ChronoUnits with IsoUnits {}

}

protected[syntax] trait FormatterHelpers {

  /** Provides a standard set of [[DateTimeFormatter]] instances, as well as methods to create them **/
  def formatter: DateTimeFormatter.type = DateTimeFormatter

}

protected[syntax] trait ZoneHelpers {

  /** Provides a standard set of time zone [[ZoneID]] instances, as well as methods to create them. **/
  def zone: ZoneID.type = ZoneID

  /** Provides a standard set of time zone [[ZoneOffset]] instances, as well as methods to create them. **/
  def offset: ZoneOffset.type = ZoneOffset
}
