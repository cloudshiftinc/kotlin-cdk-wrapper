@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSchedule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.scheduler.*;
 * Object tags;
 * CfnScheduleProps cfnScheduleProps = CfnScheduleProps.builder()
 * .flexibleTimeWindow(FlexibleTimeWindowProperty.builder()
 * .mode("mode")
 * // the properties below are optional
 * .maximumWindowInMinutes(123)
 * .build())
 * .scheduleExpression("scheduleExpression")
 * .target(TargetProperty.builder()
 * .arn("arn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .deadLetterConfig(DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build())
 * .ecsParameters(EcsParametersProperty.builder()
 * .taskDefinitionArn("taskDefinitionArn")
 * // the properties below are optional
 * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .enableEcsManagedTags(false)
 * .enableExecuteCommand(false)
 * .group("group")
 * .launchType("launchType")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build())
 * .placementConstraints(List.of(PlacementConstraintProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .placementStrategy(List.of(PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build()))
 * .platformVersion("platformVersion")
 * .propagateTags("propagateTags")
 * .referenceId("referenceId")
 * .tags(tags)
 * .taskCount(123)
 * .build())
 * .eventBridgeParameters(EventBridgeParametersProperty.builder()
 * .detailType("detailType")
 * .source("source")
 * .build())
 * .input("input")
 * .kinesisParameters(KinesisParametersProperty.builder()
 * .partitionKey("partitionKey")
 * .build())
 * .retryPolicy(RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build())
 * .sageMakerPipelineParameters(SageMakerPipelineParametersProperty.builder()
 * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .sqsParameters(SqsParametersProperty.builder()
 * .messageGroupId("messageGroupId")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .endDate("endDate")
 * .groupName("groupName")
 * .kmsKeyArn("kmsKeyArn")
 * .name("name")
 * .scheduleExpressionTimezone("scheduleExpressionTimezone")
 * .startDate("startDate")
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html)
 */
public interface CfnScheduleProps {
  /**
   * The description you specify for the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The date, in UTC, before which the schedule can invoke its target.
   *
   * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
   * `EndDate` you specify.
   * EventBridge Scheduler ignores `EndDate` for one-time schedules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-enddate)
   */
  public fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
   */
  public fun flexibleTimeWindow(): Any

  /**
   * The name of the schedule group associated with this schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-groupname)
   */
  public fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The Amazon Resource Name (ARN) for the customer managed KMS key that EventBridge Scheduler will
   * use to encrypt and decrypt your data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The name of the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-name)
   */
  public fun name(): String? = unwrap(this).getName()

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
   */
  public fun scheduleExpression(): String

  /**
   * The timezone in which the scheduling expression is evaluated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-scheduleexpressiontimezone)
   */
  public fun scheduleExpressionTimezone(): String? = unwrap(this).getScheduleExpressionTimezone()

  /**
   * The date, in UTC, after which the schedule can begin invoking its target.
   *
   * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
   * `StartDate` you specify.
   * EventBridge Scheduler ignores `StartDate` for one-time schedules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-startdate)
   */
  public fun startDate(): String? = unwrap(this).getStartDate()

  /**
   * Specifies whether the schedule is enabled or disabled.
   *
   * *Allowed Values* : `ENABLED` | `DISABLED`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-state)
   */
  public fun state(): String? = unwrap(this).getState()

  /**
   * The schedule's target details.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
   */
  public fun target(): Any

  /**
   * A builder for [CfnScheduleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description you specify for the schedule.
     */
    public fun description(description: String)

    /**
     * @param endDate The date, in UTC, before which the schedule can invoke its target.
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * `EndDate` you specify.
     * EventBridge Scheduler ignores `EndDate` for one-time schedules.
     */
    public fun endDate(endDate: String)

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: IResolvable)

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty)

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2e9da3121125e51f392822b9d4bf4714a69e22b112f1a09587178b96a5ff631")
    public
        fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit)

    /**
     * @param groupName The name of the schedule group associated with this schedule.
     */
    public fun groupName(groupName: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) for the customer managed KMS key that
     * EventBridge Scheduler will use to encrypt and decrypt your data.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param name The name of the schedule.
     */
    public fun name(name: String)

    /**
     * @param scheduleExpression The expression that defines when the schedule runs. The following
     * formats are supported. 
     * * `at` expression - `at(yyyy-mm-ddThh:mm:ss)`
     * * `rate` expression - `rate(value unit)`
     * * `cron` expression - `cron(fields)`
     *
     * You can use `at` expressions to create one-time schedules that invoke a target once, at the
     * time and in the time zone, that you specify. You can use `rate` and `cron` expressions to create
     * recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular
     * intervals, such as every 15 minutes or every five days. Cron-based schedules are useful when you
     * want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st
     * day of the month.
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
     */
    public fun scheduleExpression(scheduleExpression: String)

    /**
     * @param scheduleExpressionTimezone The timezone in which the scheduling expression is
     * evaluated.
     */
    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

    /**
     * @param startDate The date, in UTC, after which the schedule can begin invoking its target.
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * `StartDate` you specify.
     * EventBridge Scheduler ignores `StartDate` for one-time schedules.
     */
    public fun startDate(startDate: String)

    /**
     * @param state Specifies whether the schedule is enabled or disabled.
     * *Allowed Values* : `ENABLED` | `DISABLED`
     */
    public fun state(state: String)

    /**
     * @param target The schedule's target details. 
     */
    public fun target(target: IResolvable)

    /**
     * @param target The schedule's target details. 
     */
    public fun target(target: CfnSchedule.TargetProperty)

    /**
     * @param target The schedule's target details. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b76da045623705cd1a8382cd6ac50d2c3a5f1733ab91ecf82c6b1b80fcaf5e")
    public fun target(target: CfnSchedule.TargetProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.CfnScheduleProps.Builder =
        software.amazon.awscdk.services.scheduler.CfnScheduleProps.builder()

    /**
     * @param description The description you specify for the schedule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param endDate The date, in UTC, before which the schedule can invoke its target.
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * `EndDate` you specify.
     * EventBridge Scheduler ignores `EndDate` for one-time schedules.
     */
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    override fun flexibleTimeWindow(flexibleTimeWindow: IResolvable) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    override fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(CfnSchedule.FlexibleTimeWindowProperty.Companion::unwrap))
    }

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2e9da3121125e51f392822b9d4bf4714a69e22b112f1a09587178b96a5ff631")
    override
        fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit):
        Unit = flexibleTimeWindow(CfnSchedule.FlexibleTimeWindowProperty(flexibleTimeWindow))

    /**
     * @param groupName The name of the schedule group associated with this schedule.
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) for the customer managed KMS key that
     * EventBridge Scheduler will use to encrypt and decrypt your data.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param name The name of the schedule.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param scheduleExpression The expression that defines when the schedule runs. The following
     * formats are supported. 
     * * `at` expression - `at(yyyy-mm-ddThh:mm:ss)`
     * * `rate` expression - `rate(value unit)`
     * * `cron` expression - `cron(fields)`
     *
     * You can use `at` expressions to create one-time schedules that invoke a target once, at the
     * time and in the time zone, that you specify. You can use `rate` and `cron` expressions to create
     * recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular
     * intervals, such as every 15 minutes or every five days. Cron-based schedules are useful when you
     * want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st
     * day of the month.
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
     */
    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param scheduleExpressionTimezone The timezone in which the scheduling expression is
     * evaluated.
     */
    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    /**
     * @param startDate The date, in UTC, after which the schedule can begin invoking its target.
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * `StartDate` you specify.
     * EventBridge Scheduler ignores `StartDate` for one-time schedules.
     */
    override fun startDate(startDate: String) {
      cdkBuilder.startDate(startDate)
    }

    /**
     * @param state Specifies whether the schedule is enabled or disabled.
     * *Allowed Values* : `ENABLED` | `DISABLED`
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param target The schedule's target details. 
     */
    override fun target(target: IResolvable) {
      cdkBuilder.target(target.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param target The schedule's target details. 
     */
    override fun target(target: CfnSchedule.TargetProperty) {
      cdkBuilder.target(target.let(CfnSchedule.TargetProperty.Companion::unwrap))
    }

    /**
     * @param target The schedule's target details. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b76da045623705cd1a8382cd6ac50d2c3a5f1733ab91ecf82c6b1b80fcaf5e")
    override fun target(target: CfnSchedule.TargetProperty.Builder.() -> Unit): Unit =
        target(CfnSchedule.TargetProperty(target))

    public fun build(): software.amazon.awscdk.services.scheduler.CfnScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.CfnScheduleProps,
  ) : CdkObject(cdkObject), CfnScheduleProps {
    /**
     * The description you specify for the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The date, in UTC, before which the schedule can invoke its target.
     *
     * Depending on the schedule's recurrence expression, invocations might stop on, or before, the
     * `EndDate` you specify.
     * EventBridge Scheduler ignores `EndDate` for one-time schedules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-enddate)
     */
    override fun endDate(): String? = unwrap(this).getEndDate()

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
     */
    override fun flexibleTimeWindow(): Any = unwrap(this).getFlexibleTimeWindow()

    /**
     * The name of the schedule group associated with this schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-groupname)
     */
    override fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The Amazon Resource Name (ARN) for the customer managed KMS key that EventBridge Scheduler
     * will use to encrypt and decrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-name)
     */
    override fun name(): String? = unwrap(this).getName()

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
     * want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st
     * day of the month.
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
     */
    override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

    /**
     * The timezone in which the scheduling expression is evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-scheduleexpressiontimezone)
     */
    override fun scheduleExpressionTimezone(): String? =
        unwrap(this).getScheduleExpressionTimezone()

    /**
     * The date, in UTC, after which the schedule can begin invoking its target.
     *
     * Depending on the schedule's recurrence expression, invocations might occur on, or after, the
     * `StartDate` you specify.
     * EventBridge Scheduler ignores `StartDate` for one-time schedules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-startdate)
     */
    override fun startDate(): String? = unwrap(this).getStartDate()

    /**
     * Specifies whether the schedule is enabled or disabled.
     *
     * *Allowed Values* : `ENABLED` | `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-state)
     */
    override fun state(): String? = unwrap(this).getState()

    /**
     * The schedule's target details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
     */
    override fun target(): Any = unwrap(this).getTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnScheduleProps):
        CfnScheduleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScheduleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduleProps):
        software.amazon.awscdk.services.scheduler.CfnScheduleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.CfnScheduleProps
  }
}
