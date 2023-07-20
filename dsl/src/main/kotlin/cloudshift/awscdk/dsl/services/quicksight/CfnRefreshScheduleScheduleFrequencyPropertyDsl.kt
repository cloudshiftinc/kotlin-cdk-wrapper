@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule

@CdkDslMarker
public class CfnRefreshScheduleScheduleFrequencyPropertyDsl {
  private val cdkBuilder: CfnRefreshSchedule.ScheduleFrequencyProperty.Builder =
      CfnRefreshSchedule.ScheduleFrequencyProperty.builder()

  public fun interval(interval: String) {
    cdkBuilder.interval(interval)
  }

  public fun refreshOnDay(refreshOnDay: IResolvable) {
    cdkBuilder.refreshOnDay(refreshOnDay)
  }

  public fun refreshOnDay(refreshOnDay: CfnRefreshSchedule.RefreshOnDayProperty) {
    cdkBuilder.refreshOnDay(refreshOnDay)
  }

  public fun timeOfTheDay(timeOfTheDay: String) {
    cdkBuilder.timeOfTheDay(timeOfTheDay)
  }

  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun build(): CfnRefreshSchedule.ScheduleFrequencyProperty = cdkBuilder.build()
}
