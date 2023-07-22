@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.constructs.Construct

@CdkDslMarker
public class CfnScheduleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSchedule.Builder = CfnSchedule.Builder.create(scope, id)

  /**
   * The description you specify for the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-description)
   * @param description The description you specify for the schedule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The date, in UTC, before which the schedule can invoke its target.
   *
   * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
   * `EndDate` you specify.
   * EventBridge Scheduler ignores `EndDate` for one-time schedules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-enddate)
   * @param endDate The date, in UTC, before which the schedule can invoke its target. 
   */
  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
   * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
   * Scheduler invokes the schedule. 
   */
  public fun flexibleTimeWindow(flexibleTimeWindow: IResolvable) {
    cdkBuilder.flexibleTimeWindow(flexibleTimeWindow)
  }

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
   * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
   * Scheduler invokes the schedule. 
   */
  public fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty) {
    cdkBuilder.flexibleTimeWindow(flexibleTimeWindow)
  }

  /**
   * The name of the schedule group associated with this schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-groupname)
   * @param groupName The name of the schedule group associated with this schedule. 
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * The Amazon Resource Name (ARN) for the customer managed KMS key that EventBridge Scheduler will
   * use to encrypt and decrypt your data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-kmskeyarn)
   * @param kmsKeyArn The Amazon Resource Name (ARN) for the customer managed KMS key that
   * EventBridge Scheduler will use to encrypt and decrypt your data. 
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * The name of the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-name)
   * @param name The name of the schedule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The expression that defines when the schedule runs. The following formats are supported.
   *
   * * `at` expression - `at(yyyy-mm-ddThh:mm:ss)`
   * * `rate` expression - `rate(value unit)`
   * * `cron` expression - `cron(fields)`
   *
   * You can use `at` expressions to create one-time schedules that invoke a target once, at the
   * time and in the time zone, that you specify. You can use `rate` and `cron` expressions to create
   * recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular
   * intervals, such as every 15 minutes or every five days. Cron-based schedules are useful when you
   * want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day
   * of the month.
   *
   * A `cron` expression consists of six fields separated by white spaces: `(minutes hours
   * day_of_month month day_of_week year)` .
   *
   * A `rate` expression consists of a *value* as a positive integer, and a *unit* with the
   * following options: `minute` | `minutes` | `hour` | `hours` | `day` | `days`
   *
   * For more information and examples, see [Schedule types on EventBridge
   * Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html) in the
   * *EventBridge Scheduler User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-scheduleexpression)
   * @param scheduleExpression The expression that defines when the schedule runs. The following
   * formats are supported. 
   */
  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  /**
   * The timezone in which the scheduling expression is evaluated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-scheduleexpressiontimezone)
   * @param scheduleExpressionTimezone The timezone in which the scheduling expression is evaluated.
   * 
   */
  public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
    cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
  }

  /**
   * The date, in UTC, after which the schedule can begin invoking its target.
   *
   * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
   * `StartDate` you specify.
   * EventBridge Scheduler ignores `StartDate` for one-time schedules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-startdate)
   * @param startDate The date, in UTC, after which the schedule can begin invoking its target. 
   */
  public fun startDate(startDate: String) {
    cdkBuilder.startDate(startDate)
  }

  /**
   * Specifies whether the schedule is enabled or disabled.
   *
   * *Allowed Values* : `ENABLED` | `DISABLED`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-state)
   * @param state Specifies whether the schedule is enabled or disabled. 
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * The schedule's target details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
   * @param target The schedule's target details. 
   */
  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  /**
   * The schedule's target details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
   * @param target The schedule's target details. 
   */
  public fun target(target: CfnSchedule.TargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnSchedule = cdkBuilder.build()
}
