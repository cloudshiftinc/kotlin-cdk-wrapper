@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Number
import software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule
import software.amazon.awscdk.services.applicationautoscaling.Schedule

@CdkDslMarker
public class ScalingScheduleDsl {
  private val cdkBuilder: ScalingSchedule.Builder = ScalingSchedule.builder()

  public fun endTime(endTime: Instant) {
    cdkBuilder.endTime(endTime)
  }

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun schedule(schedule: Schedule) {
    cdkBuilder.schedule(schedule)
  }

  public fun startTime(startTime: Instant) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): ScalingSchedule = cdkBuilder.build()
}
