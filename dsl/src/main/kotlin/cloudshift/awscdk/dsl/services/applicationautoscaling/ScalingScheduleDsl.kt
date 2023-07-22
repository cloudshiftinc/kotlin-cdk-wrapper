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

  /**
   * @param endTime When this scheduled action expires.
   */
  public fun endTime(endTime: Instant) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param maxCapacity The new maximum capacity.
   * During the scheduled time, the current capacity is above the maximum
   * capacity, Application Auto Scaling scales in to the maximum capacity.
   *
   * At least one of maxCapacity and minCapacity must be supplied.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The new minimum capacity.
   * During the scheduled time, if the current capacity is below the minimum
   * capacity, Application Auto Scaling scales out to the minimum capacity.
   *
   * At least one of maxCapacity and minCapacity must be supplied.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  /**
   * @param schedule When to perform this action. 
   */
  public fun schedule(schedule: Schedule) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param startTime When this scheduled action becomes active.
   */
  public fun startTime(startTime: Instant) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): ScalingSchedule = cdkBuilder.build()
}
