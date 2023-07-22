@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CronOptions

@CdkDslMarker
public class CronOptionsDsl {
  private val cdkBuilder: CronOptions.Builder = CronOptions.builder()

  /**
   * @param day The day of the month to run this rule at.
   */
  public fun day(day: String) {
    cdkBuilder.day(day)
  }

  /**
   * @param hour The hour to run this rule at.
   */
  public fun hour(hour: String) {
    cdkBuilder.hour(hour)
  }

  /**
   * @param minute The minute to run this rule at.
   */
  public fun minute(minute: String) {
    cdkBuilder.minute(minute)
  }

  /**
   * @param month The month to run this rule at.
   */
  public fun month(month: String) {
    cdkBuilder.month(month)
  }

  /**
   * @param weekDay The day of the week to run this rule at.
   */
  public fun weekDay(weekDay: String) {
    cdkBuilder.weekDay(weekDay)
  }

  /**
   * @param year The year to run this rule at.
   */
  public fun year(year: String) {
    cdkBuilder.year(year)
  }

  public fun build(): CronOptions = cdkBuilder.build()
}
