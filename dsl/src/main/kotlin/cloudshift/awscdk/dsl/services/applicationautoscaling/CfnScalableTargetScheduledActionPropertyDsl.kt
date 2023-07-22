@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

@CdkDslMarker
public class CfnScalableTargetScheduledActionPropertyDsl {
  private val cdkBuilder: CfnScalableTarget.ScheduledActionProperty.Builder =
      CfnScalableTarget.ScheduledActionProperty.builder()

  /**
   * @param endTime The date and time that the action is scheduled to end, in UTC.
   */
  public fun endTime(endTime: Instant) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param endTime The date and time that the action is scheduled to end, in UTC.
   */
  public fun endTime(endTime: IResolvable) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param scalableTargetAction The new minimum and maximum capacity.
   * You can set both values or just one. At the scheduled time, if the current capacity is below
   * the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If the current
   * capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum
   * capacity.
   */
  public fun scalableTargetAction(scalableTargetAction: IResolvable) {
    cdkBuilder.scalableTargetAction(scalableTargetAction)
  }

  /**
   * @param scalableTargetAction The new minimum and maximum capacity.
   * You can set both values or just one. At the scheduled time, if the current capacity is below
   * the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If the current
   * capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum
   * capacity.
   */
  public
      fun scalableTargetAction(scalableTargetAction: CfnScalableTarget.ScalableTargetActionProperty) {
    cdkBuilder.scalableTargetAction(scalableTargetAction)
  }

  /**
   * @param schedule The schedule for this action. The following formats are supported:. 
   * * At expressions - " `at( *yyyy* - *mm* - *dd* T *hh* : *mm* : *ss* )` "
   * * Rate expressions - " `rate( *value* *unit* )` "
   * * Cron expressions - " `cron( *fields* )` "
   *
   * At expressions are useful for one-time schedules. Cron expressions are useful for scheduled
   * actions that run periodically at a specified date and time, and rate expressions are useful for
   * scheduled actions that run at a regular interval.
   *
   * At and cron expressions use Universal Coordinated Time (UTC) by default.
   *
   * The cron format consists of six fields separated by white spaces: [Minutes] [Hours]
   * [Day_of_Month] [Month] [Day_of_Week] [Year].
   *
   * For rate expressions, *value* is a positive integer and *unit* is `minute` | `minutes` | `hour`
   * | `hours` | `day` | `days` .
   */
  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * @param scheduledActionName The name of the scheduled action. 
   * This name must be unique among all other scheduled actions on the specified scalable target.
   */
  public fun scheduledActionName(scheduledActionName: String) {
    cdkBuilder.scheduledActionName(scheduledActionName)
  }

  /**
   * @param startTime The date and time that the action is scheduled to begin, in UTC.
   */
  public fun startTime(startTime: Instant) {
    cdkBuilder.startTime(startTime)
  }

  /**
   * @param startTime The date and time that the action is scheduled to begin, in UTC.
   */
  public fun startTime(startTime: IResolvable) {
    cdkBuilder.startTime(startTime)
  }

  /**
   * @param timezone The time zone used when referring to the date and time of a scheduled action,
   * when the scheduled action uses an at or cron expression.
   */
  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): CfnScalableTarget.ScheduledActionProperty = cdkBuilder.build()
}
