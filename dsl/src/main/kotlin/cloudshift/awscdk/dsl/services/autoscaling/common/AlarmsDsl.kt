@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling.common

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.common.Alarms

@CdkDslMarker
public class AlarmsDsl {
  private val cdkBuilder: Alarms.Builder = Alarms.builder()

  public fun lowerAlarmIntervalIndex(lowerAlarmIntervalIndex: Number) {
    cdkBuilder.lowerAlarmIntervalIndex(lowerAlarmIntervalIndex)
  }

  public fun upperAlarmIntervalIndex(upperAlarmIntervalIndex: Number) {
    cdkBuilder.upperAlarmIntervalIndex(upperAlarmIntervalIndex)
  }

  public fun build(): Alarms = cdkBuilder.build()
}
