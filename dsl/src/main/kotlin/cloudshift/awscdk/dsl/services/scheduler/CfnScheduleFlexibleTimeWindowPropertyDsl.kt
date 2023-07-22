@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleFlexibleTimeWindowPropertyDsl {
  private val cdkBuilder: CfnSchedule.FlexibleTimeWindowProperty.Builder =
      CfnSchedule.FlexibleTimeWindowProperty.builder()

  /**
   * @param maximumWindowInMinutes The maximum time window during which a schedule can be invoked.
   * *Minimum* : `1`
   *
   * *Maximum* : `1440`
   */
  public fun maximumWindowInMinutes(maximumWindowInMinutes: Number) {
    cdkBuilder.maximumWindowInMinutes(maximumWindowInMinutes)
  }

  /**
   * @param mode Determines whether the schedule is invoked within a flexible time window. 
   * *Allowed Values* : `OFF` | `FLEXIBLE`
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnSchedule.FlexibleTimeWindowProperty = cdkBuilder.build()
}
