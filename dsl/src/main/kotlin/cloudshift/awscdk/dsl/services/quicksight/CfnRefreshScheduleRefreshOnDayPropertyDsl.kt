@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule

@CdkDslMarker
public class CfnRefreshScheduleRefreshOnDayPropertyDsl {
  private val cdkBuilder: CfnRefreshSchedule.RefreshOnDayProperty.Builder =
      CfnRefreshSchedule.RefreshOnDayProperty.builder()

  /**
   * @param dayOfMonth The day of the month that you want your dataset to refresh.
   * This value is required for monthly refresh intervals.
   */
  public fun dayOfMonth(dayOfMonth: String) {
    cdkBuilder.dayOfMonth(dayOfMonth)
  }

  /**
   * @param dayOfWeek The day of the week that you want to schedule the refresh on.
   * This value is required for weekly and monthly refresh intervals.
   */
  public fun dayOfWeek(dayOfWeek: String) {
    cdkBuilder.dayOfWeek(dayOfWeek)
  }

  public fun build(): CfnRefreshSchedule.RefreshOnDayProperty = cdkBuilder.build()
}
