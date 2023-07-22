@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.Schedule
import software.amazon.awscdk.services.autoscaling.ScheduledActionProps

/**
 * Properties for a scheduled action on an AutoScalingGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * Schedule schedule;
 * ScheduledActionProps scheduledActionProps = ScheduledActionProps.builder()
 * .autoScalingGroup(autoScalingGroup)
 * .schedule(schedule)
 * // the properties below are optional
 * .desiredCapacity(123)
 * .endTime(new Date())
 * .maxCapacity(123)
 * .minCapacity(123)
 * .startTime(new Date())
 * .timeZone("timeZone")
 * .build();
 * ```
 */
@CdkDslMarker
public class ScheduledActionPropsDsl {
  private val cdkBuilder: ScheduledActionProps.Builder = ScheduledActionProps.builder()

  /**
   * @param autoScalingGroup The AutoScalingGroup to apply the scheduled actions to. 
   */
  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

  /**
   * @param desiredCapacity The new desired capacity.
   * At the scheduled time, set the desired capacity to the given capacity.
   *
   * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
   */
  public fun desiredCapacity(desiredCapacity: Number) {
    cdkBuilder.desiredCapacity(desiredCapacity)
  }

  /**
   * @param endTime When this scheduled action expires.
   */
  public fun endTime(endTime: Instant) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param maxCapacity The new maximum capacity.
   * At the scheduled time, set the maximum capacity to the given capacity.
   *
   * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The new minimum capacity.
   * At the scheduled time, set the minimum capacity to the given capacity.
   *
   * At least one of maxCapacity, minCapacity, or desiredCapacity must be supplied.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  /**
   * @param schedule When to perform this action. 
   * Supports cron expressions.
   *
   * For more information about cron expressions, see https://en.wikipedia.org/wiki/Cron.
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

  /**
   * @param timeZone Specifies the time zone for a cron expression.
   * If a time zone is not provided, UTC is used by default.
   *
   * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone
   * Database (such as Etc/GMT+9 or Pacific/Tahiti).
   *
   * For more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
   */
  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun build(): ScheduledActionProps = cdkBuilder.build()
}
