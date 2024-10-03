@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A *schedule* is the main resource you create, configure, and manage using Amazon EventBridge
 * Scheduler.
 *
 * Every schedule has a *schedule expression* that determines when, and with what frequency, the
 * schedule runs. EventBridge Scheduler supports three types of schedules: rate, cron, and one-time
 * schedules. For more information about different schedule types, see [Schedule
 * types](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html) in the
 * *EventBridge Scheduler User Guide* .
 *
 * When you create a schedule, you configure a target for the schedule to invoke. A target is an API
 * operation that EventBridge Scheduler calls on your behalf every time your schedule runs. EventBridge
 * Scheduler supports two types of targets: *templated* targets invoke common API operations across a
 * core groups of services, and customizeable *universal* targets that you can use to call more than
 * 6,000 operations across over 270 services. For more information about configuring targets, see
 * [Managing targets](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets.html) in
 * the *EventBridge Scheduler User Guide* .
 *
 * For more information about managing schedules, changing the schedule state, setting up flexible
 * time windows, and configuring a dead-letter queue for a schedule, see [Managing a
 * schedule](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule.html) in the
 * *EventBridge Scheduler User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.scheduler.*;
 * Object tags;
 * CfnSchedule cfnSchedule = CfnSchedule.Builder.create(this, "MyCfnSchedule")
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
public open class CfnSchedule(
  cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScheduleProps,
  ) :
      this(software.amazon.awscdk.services.scheduler.CfnSchedule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnScheduleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScheduleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnScheduleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the Amazon EventBridge Scheduler schedule.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The description you specify for the schedule.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description you specify for the schedule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The date, in UTC, before which the schedule can invoke its target.
   */
  public open fun endDate(): String? = unwrap(this).getEndDate()

  /**
   * The date, in UTC, before which the schedule can invoke its target.
   */
  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   */
  public open fun flexibleTimeWindow(): Any = unwrap(this).getFlexibleTimeWindow()

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   */
  public open fun flexibleTimeWindow(`value`: IResolvable) {
    unwrap(this).setFlexibleTimeWindow(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   */
  public open fun flexibleTimeWindow(`value`: FlexibleTimeWindowProperty) {
    unwrap(this).setFlexibleTimeWindow(`value`.let(FlexibleTimeWindowProperty.Companion::unwrap))
  }

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a74e38d6499dd4332fee4201b0ad1d330123fd38ab840b580d2d65e82e1ed46d")
  public open fun flexibleTimeWindow(`value`: FlexibleTimeWindowProperty.Builder.() -> Unit): Unit =
      flexibleTimeWindow(FlexibleTimeWindowProperty(`value`))

  /**
   * The name of the schedule group associated with this schedule.
   */
  public open fun groupName(): String? = unwrap(this).getGroupName()

  /**
   * The name of the schedule group associated with this schedule.
   */
  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) for the customer managed KMS key that EventBridge Scheduler will
   * use to encrypt and decrypt your data.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) for the customer managed KMS key that EventBridge Scheduler will
   * use to encrypt and decrypt your data.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The name of the schedule.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the schedule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The expression that defines when the schedule runs.
   *
   * The following formats are supported.
   */
  public open fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

  /**
   * The expression that defines when the schedule runs.
   *
   * The following formats are supported.
   */
  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  /**
   * The timezone in which the scheduling expression is evaluated.
   */
  public open fun scheduleExpressionTimezone(): String? =
      unwrap(this).getScheduleExpressionTimezone()

  /**
   * The timezone in which the scheduling expression is evaluated.
   */
  public open fun scheduleExpressionTimezone(`value`: String) {
    unwrap(this).setScheduleExpressionTimezone(`value`)
  }

  /**
   * The date, in UTC, after which the schedule can begin invoking its target.
   */
  public open fun startDate(): String? = unwrap(this).getStartDate()

  /**
   * The date, in UTC, after which the schedule can begin invoking its target.
   */
  public open fun startDate(`value`: String) {
    unwrap(this).setStartDate(`value`)
  }

  /**
   * Specifies whether the schedule is enabled or disabled.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * Specifies whether the schedule is enabled or disabled.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * The schedule's target details.
   */
  public open fun target(): Any = unwrap(this).getTarget()

  /**
   * The schedule's target details.
   */
  public open fun target(`value`: IResolvable) {
    unwrap(this).setTarget(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The schedule's target details.
   */
  public open fun target(`value`: TargetProperty) {
    unwrap(this).setTarget(`value`.let(TargetProperty.Companion::unwrap))
  }

  /**
   * The schedule's target details.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d3452854ece16a1d97ca5444195ab36fb99e00089cd5c34bb33f14eae440853")
  public open fun target(`value`: TargetProperty.Builder.() -> Unit): Unit =
      target(TargetProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.scheduler.CfnSchedule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description you specify for the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-description)
     * @param description The description you specify for the schedule. 
     */
    public fun description(description: String)

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
    public fun endDate(endDate: String)

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: IResolvable)

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty)

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bec8a2b49d8714c23848c634547529347f21a2f1958a89005e036f46821ac6")
    public fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty.Builder.() -> Unit)

    /**
     * The name of the schedule group associated with this schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-groupname)
     * @param groupName The name of the schedule group associated with this schedule. 
     */
    public fun groupName(groupName: String)

    /**
     * The Amazon Resource Name (ARN) for the customer managed KMS key that EventBridge Scheduler
     * will use to encrypt and decrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) for the customer managed KMS key that
     * EventBridge Scheduler will use to encrypt and decrypt your data. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-name)
     * @param name The name of the schedule. 
     */
    public fun name(name: String)

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
     * @param scheduleExpression The expression that defines when the schedule runs. The following
     * formats are supported. 
     */
    public fun scheduleExpression(scheduleExpression: String)

    /**
     * The timezone in which the scheduling expression is evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-scheduleexpressiontimezone)
     * @param scheduleExpressionTimezone The timezone in which the scheduling expression is
     * evaluated. 
     */
    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

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
    public fun startDate(startDate: String)

    /**
     * Specifies whether the schedule is enabled or disabled.
     *
     * *Allowed Values* : `ENABLED` | `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-state)
     * @param state Specifies whether the schedule is enabled or disabled. 
     */
    public fun state(state: String)

    /**
     * The schedule's target details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
     * @param target The schedule's target details. 
     */
    public fun target(target: IResolvable)

    /**
     * The schedule's target details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
     * @param target The schedule's target details. 
     */
    public fun target(target: TargetProperty)

    /**
     * The schedule's target details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
     * @param target The schedule's target details. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62c1f19a6420e6c4c5c89ce0edf3314101637861a18f150713bbf4dab90395d7")
    public fun target(target: TargetProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.CfnSchedule.Builder =
        software.amazon.awscdk.services.scheduler.CfnSchedule.Builder.create(scope, id)

    /**
     * The description you specify for the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-description)
     * @param description The description you specify for the schedule. 
     */
    override fun description(description: String) {
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
    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    override fun flexibleTimeWindow(flexibleTimeWindow: IResolvable) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(IResolvable.Companion::unwrap))
    }

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    override fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(FlexibleTimeWindowProperty.Companion::unwrap))
    }

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-flexibletimewindow)
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     * Scheduler invokes the schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bec8a2b49d8714c23848c634547529347f21a2f1958a89005e036f46821ac6")
    override
        fun flexibleTimeWindow(flexibleTimeWindow: FlexibleTimeWindowProperty.Builder.() -> Unit):
        Unit = flexibleTimeWindow(FlexibleTimeWindowProperty(flexibleTimeWindow))

    /**
     * The name of the schedule group associated with this schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-groupname)
     * @param groupName The name of the schedule group associated with this schedule. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    /**
     * The Amazon Resource Name (ARN) for the customer managed KMS key that EventBridge Scheduler
     * will use to encrypt and decrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) for the customer managed KMS key that
     * EventBridge Scheduler will use to encrypt and decrypt your data. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-name)
     * @param name The name of the schedule. 
     */
    override fun name(name: String) {
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
     * @param scheduleExpression The expression that defines when the schedule runs. The following
     * formats are supported. 
     */
    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * The timezone in which the scheduling expression is evaluated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-scheduleexpressiontimezone)
     * @param scheduleExpressionTimezone The timezone in which the scheduling expression is
     * evaluated. 
     */
    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
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
    override fun startDate(startDate: String) {
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
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * The schedule's target details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
     * @param target The schedule's target details. 
     */
    override fun target(target: IResolvable) {
      cdkBuilder.target(target.let(IResolvable.Companion::unwrap))
    }

    /**
     * The schedule's target details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
     * @param target The schedule's target details. 
     */
    override fun target(target: TargetProperty) {
      cdkBuilder.target(target.let(TargetProperty.Companion::unwrap))
    }

    /**
     * The schedule's target details.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedule.html#cfn-scheduler-schedule-target)
     * @param target The schedule's target details. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62c1f19a6420e6c4c5c89ce0edf3314101637861a18f150713bbf4dab90395d7")
    override fun target(target: TargetProperty.Builder.() -> Unit): Unit =
        target(TargetProperty(target))

    public fun build(): software.amazon.awscdk.services.scheduler.CfnSchedule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.scheduler.CfnSchedule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule): CfnSchedule
        = CfnSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnSchedule): software.amazon.awscdk.services.scheduler.CfnSchedule
        = wrapped.cdkObject as software.amazon.awscdk.services.scheduler.CfnSchedule
  }

  /**
   * This structure specifies the VPC subnets and security groups for the task, and whether a public
   * IP address is to be used.
   *
   * This structure is relevant only for ECS tasks that use the awsvpc network mode.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
   * .subnets(List.of("subnets"))
   * // the properties below are optional
   * .assignPublicIp("assignPublicIp")
   * .securityGroups(List.of("securityGroups"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-awsvpcconfiguration.html)
   */
  public interface AwsVpcConfigurationProperty {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-awsvpcconfiguration.html#cfn-scheduler-schedule-awsvpcconfiguration-assignpublicip)
     */
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    /**
     * Specifies the security groups associated with the task.
     *
     * These security groups must all be in the same VPC. You can specify as many as five security
     * groups. If you do not specify a security group, the default security group for the VPC is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-awsvpcconfiguration.html#cfn-scheduler-schedule-awsvpcconfiguration-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * Specifies the subnets associated with the task.
     *
     * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-awsvpcconfiguration.html#cfn-scheduler-schedule-awsvpcconfiguration-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [AwsVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assignPublicIp Specifies whether the task's elastic network interface receives a
       * public IP address.
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       */
      public fun assignPublicIp(assignPublicIp: String)

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty.builder()

      /**
       * @param assignPublicIp Specifies whether the task's elastic network interface receives a
       * public IP address.
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       */
      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject),
        AwsVpcConfigurationProperty {
      /**
       * Specifies whether the task's elastic network interface receives a public IP address.
       *
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-awsvpcconfiguration.html#cfn-scheduler-schedule-awsvpcconfiguration-assignpublicip)
       */
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      /**
       * Specifies the security groups associated with the task.
       *
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-awsvpcconfiguration.html#cfn-scheduler-schedule-awsvpcconfiguration-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * Specifies the subnets associated with the task.
       *
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-awsvpcconfiguration.html#cfn-scheduler-schedule-awsvpcconfiguration-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AwsVpcConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.AwsVpcConfigurationProperty
    }
  }

  /**
   * The details of a capacity provider strategy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
   * CapacityProviderStrategyItemProperty.builder()
   * .capacityProvider("capacityProvider")
   * // the properties below are optional
   * .base(123)
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-capacityproviderstrategyitem.html)
   */
  public interface CapacityProviderStrategyItemProperty {
    /**
     * The base value designates how many tasks, at a minimum, to run on the specified capacity
     * provider.
     *
     * Only one capacity provider in a capacity provider strategy can have a base defined. If no
     * value is specified, the default value of `0` is used.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-capacityproviderstrategyitem.html#cfn-scheduler-schedule-capacityproviderstrategyitem-base)
     */
    public fun base(): Number? = unwrap(this).getBase()

    /**
     * The short name of the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-capacityproviderstrategyitem.html#cfn-scheduler-schedule-capacityproviderstrategyitem-capacityprovider)
     */
    public fun capacityProvider(): String

    /**
     * The weight value designates the relative percentage of the total number of tasks launched
     * that should use the specified capacity provider.
     *
     * The weight value is taken into consideration after the base value, if defined, is satisfied.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-capacityproviderstrategyitem.html#cfn-scheduler-schedule-capacityproviderstrategyitem-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [CapacityProviderStrategyItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param base The base value designates how many tasks, at a minimum, to run on the specified
       * capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of `0` is used.
       */
      public fun base(base: Number)

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      public fun capacityProvider(capacityProvider: String)

      /**
       * @param weight The weight value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty.builder()

      /**
       * @param base The base value designates how many tasks, at a minimum, to run on the specified
       * capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of `0` is used.
       */
      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      /**
       * @param weight The weight value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject),
        CapacityProviderStrategyItemProperty {
      /**
       * The base value designates how many tasks, at a minimum, to run on the specified capacity
       * provider.
       *
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of `0` is used.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-capacityproviderstrategyitem.html#cfn-scheduler-schedule-capacityproviderstrategyitem-base)
       */
      override fun base(): Number? = unwrap(this).getBase()

      /**
       * The short name of the capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-capacityproviderstrategyitem.html#cfn-scheduler-schedule-capacityproviderstrategyitem-capacityprovider)
       */
      override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      /**
       * The weight value designates the relative percentage of the total number of tasks launched
       * that should use the specified capacity provider.
       *
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-capacityproviderstrategyitem.html#cfn-scheduler-schedule-capacityproviderstrategyitem-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CapacityProviderStrategyItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.CapacityProviderStrategyItemProperty
    }
  }

  /**
   * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses
   * as a dead-letter queue for your schedule.
   *
   * If specified, EventBridge Scheduler delivers failed events that could not be successfully
   * delivered to a target to the queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-deadletterconfig.html)
   */
  public interface DeadLetterConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the SQS queue specified as the destination for the
     * dead-letter queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-deadletterconfig.html#cfn-scheduler-schedule-deadletterconfig-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [DeadLetterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the SQS queue specified as the destination for
       * the dead-letter queue.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the SQS queue specified as the destination for
       * the dead-letter queue.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty,
    ) : CdkObject(cdkObject),
        DeadLetterConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the SQS queue specified as the destination for the
       * dead-letter queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-deadletterconfig.html#cfn-scheduler-schedule-deadletterconfig-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty):
          DeadLetterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DeadLetterConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.DeadLetterConfigProperty
    }
  }

  /**
   * The templated target type for the Amazon ECS
   * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
   * operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * Object tags;
   * EcsParametersProperty ecsParametersProperty = EcsParametersProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html)
   */
  public interface EcsParametersProperty {
    /**
     * The capacity provider strategy to use for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-capacityproviderstrategy)
     */
    public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     *
     * For more information, see [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the *Amazon ECS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-enableecsmanagedtags)
     */
    public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    /**
     * Whether or not to enable the execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-enableexecutecommand)
     */
    public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

    /**
     * Specifies an Amazon ECS task group for the task.
     *
     * The maximum length is 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-group)
     */
    public fun group(): String? = unwrap(this).getGroup()

    /**
     * Specifies the launch type on which your task is running.
     *
     * The launch type that you specify here must match one of the launch type (compatibilities) of
     * the target task. The `FARGATE` value is supported only in the Regions where Fargate with Amazon
     * ECS is supported. For more information, see [AWS Fargate on Amazon
     * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS_Fargate.html) in the
     * *Amazon ECS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-launchtype)
     */
    public fun launchType(): String? = unwrap(this).getLaunchType()

    /**
     * This structure specifies the network configuration for an ECS task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-networkconfiguration)
     */
    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can specify up to 10 constraints per task (including constraints in the task definition
     * and those specified at runtime).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-placementconstraints)
     */
    public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    /**
     * The task placement strategy for a task or service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-placementstrategy)
     */
    public fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

    /**
     * Specifies the platform version for the task.
     *
     * Specify only the numeric portion of the platform version, such as `1.1.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-platformversion)
     */
    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated. Tags can only be propagated to the
     * task during task creation. To add tags to a task after task creation, use the Amazon ECS
     * [`TagResource`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
     * API action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-propagatetags)
     */
    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    /**
     * The reference ID to use for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-referenceid)
     */
    public fun referenceId(): String? = unwrap(this).getReferenceId()

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. For more
     * information, see
     * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) in the
     * *Amazon ECS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-tags)
     */
    public fun tags(): Any? = unwrap(this).getTags()

    /**
     * The number of tasks to create based on `TaskDefinition` .
     *
     * The default is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-taskcount)
     */
    public fun taskCount(): Number? = unwrap(this).getTaskCount()

    /**
     * The Amazon Resource Name (ARN) of the task definition to use if the event target is an Amazon
     * ECS task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-taskdefinitionarn)
     */
    public fun taskDefinitionArn(): String

    /**
     * A builder for [EcsParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       */
      public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       */
      public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       */
      public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the *Amazon ECS Developer Guide* .
       */
      public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the *Amazon ECS Developer Guide* .
       */
      public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      public fun enableExecuteCommand(enableExecuteCommand: Boolean)

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

      /**
       * @param group Specifies an Amazon ECS task group for the task.
       * The maximum length is 255 characters.
       */
      public fun group(group: String)

      /**
       * @param launchType Specifies the launch type on which your task is running.
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where Fargate with
       * Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS_Fargate.html) in the
       * *Amazon ECS Developer Guide* .
       */
      public fun launchType(launchType: String)

      /**
       * @param networkConfiguration This structure specifies the network configuration for an ECS
       * task.
       */
      public fun networkConfiguration(networkConfiguration: IResolvable)

      /**
       * @param networkConfiguration This structure specifies the network configuration for an ECS
       * task.
       */
      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      /**
       * @param networkConfiguration This structure specifies the network configuration for an ECS
       * task.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85312879eacab7cb787886bb005f56473e2093bcad24168c6da44a76e67c3ac4")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(placementConstraints: IResolvable)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(placementConstraints: List<Any>)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(vararg placementConstraints: Any)

      /**
       * @param placementStrategy The task placement strategy for a task or service.
       */
      public fun placementStrategy(placementStrategy: IResolvable)

      /**
       * @param placementStrategy The task placement strategy for a task or service.
       */
      public fun placementStrategy(placementStrategy: List<Any>)

      /**
       * @param placementStrategy The task placement strategy for a task or service.
       */
      public fun placementStrategy(vararg placementStrategy: Any)

      /**
       * @param platformVersion Specifies the platform version for the task.
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       */
      public fun platformVersion(platformVersion: String)

      /**
       * @param propagateTags Specifies whether to propagate the tags from the task definition to
       * the task.
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the Amazon ECS
       * [`TagResource`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
       * API action.
       */
      public fun propagateTags(propagateTags: String)

      /**
       * @param referenceId The reference ID to use for the task.
       */
      public fun referenceId(referenceId: String)

      /**
       * @param tags The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. For more
       * information, see
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) in the
       * *Amazon ECS API Reference* .
       */
      public fun tags(tags: Any)

      /**
       * @param taskCount The number of tasks to create based on `TaskDefinition` .
       * The default is `1` .
       */
      public fun taskCount(taskCount: Number)

      /**
       * @param taskDefinitionArn The Amazon Resource Name (ARN) of the task definition to use if
       * the event target is an Amazon ECS task. 
       */
      public fun taskDefinitionArn(taskDefinitionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty.builder()

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       */
      override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       */
      override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       */
      override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
          capacityProviderStrategy(capacityProviderStrategy.toList())

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the *Amazon ECS Developer Guide* .
       */
      override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
      }

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the *Amazon ECS Developer Guide* .
       */
      override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
      }

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param group Specifies an Amazon ECS task group for the task.
       * The maximum length is 255 characters.
       */
      override fun group(group: String) {
        cdkBuilder.group(group)
      }

      /**
       * @param launchType Specifies the launch type on which your task is running.
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where Fargate with
       * Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS_Fargate.html) in the
       * *Amazon ECS Developer Guide* .
       */
      override fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
      }

      /**
       * @param networkConfiguration This structure specifies the network configuration for an ECS
       * task.
       */
      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkConfiguration This structure specifies the network configuration for an ECS
       * task.
       */
      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param networkConfiguration This structure specifies the network configuration for an ECS
       * task.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85312879eacab7cb787886bb005f56473e2093bcad24168c6da44a76e67c3ac4")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(placementConstraints: List<Any>) {
        cdkBuilder.placementConstraints(placementConstraints.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(vararg placementConstraints: Any): Unit =
          placementConstraints(placementConstraints.toList())

      /**
       * @param placementStrategy The task placement strategy for a task or service.
       */
      override fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param placementStrategy The task placement strategy for a task or service.
       */
      override fun placementStrategy(placementStrategy: List<Any>) {
        cdkBuilder.placementStrategy(placementStrategy.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param placementStrategy The task placement strategy for a task or service.
       */
      override fun placementStrategy(vararg placementStrategy: Any): Unit =
          placementStrategy(placementStrategy.toList())

      /**
       * @param platformVersion Specifies the platform version for the task.
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       */
      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      /**
       * @param propagateTags Specifies whether to propagate the tags from the task definition to
       * the task.
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the Amazon ECS
       * [`TagResource`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
       * API action.
       */
      override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      /**
       * @param referenceId The reference ID to use for the task.
       */
      override fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
      }

      /**
       * @param tags The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. For more
       * information, see
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) in the
       * *Amazon ECS API Reference* .
       */
      override fun tags(tags: Any) {
        cdkBuilder.tags(tags)
      }

      /**
       * @param taskCount The number of tasks to create based on `TaskDefinition` .
       * The default is `1` .
       */
      override fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
      }

      /**
       * @param taskDefinitionArn The Amazon Resource Name (ARN) of the task definition to use if
       * the event target is an Amazon ECS task. 
       */
      override fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty,
    ) : CdkObject(cdkObject),
        EcsParametersProperty {
      /**
       * The capacity provider strategy to use for the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-capacityproviderstrategy)
       */
      override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

      /**
       * Specifies whether to enable Amazon ECS managed tags for the task.
       *
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the *Amazon ECS Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-enableecsmanagedtags)
       */
      override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

      /**
       * Whether or not to enable the execute command functionality for the containers in this task.
       *
       * If true, this enables execute command functionality on all containers in the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-enableexecutecommand)
       */
      override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

      /**
       * Specifies an Amazon ECS task group for the task.
       *
       * The maximum length is 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-group)
       */
      override fun group(): String? = unwrap(this).getGroup()

      /**
       * Specifies the launch type on which your task is running.
       *
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where Fargate with
       * Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS_Fargate.html) in the
       * *Amazon ECS Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-launchtype)
       */
      override fun launchType(): String? = unwrap(this).getLaunchType()

      /**
       * This structure specifies the network configuration for an ECS task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-networkconfiguration)
       */
      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      /**
       * An array of placement constraint objects to use for the task.
       *
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-placementconstraints)
       */
      override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

      /**
       * The task placement strategy for a task or service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-placementstrategy)
       */
      override fun placementStrategy(): Any? = unwrap(this).getPlacementStrategy()

      /**
       * Specifies the platform version for the task.
       *
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-platformversion)
       */
      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      /**
       * Specifies whether to propagate the tags from the task definition to the task.
       *
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the Amazon ECS
       * [`TagResource`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
       * API action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-propagatetags)
       */
      override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      /**
       * The reference ID to use for the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-referenceid)
       */
      override fun referenceId(): String? = unwrap(this).getReferenceId()

      /**
       * The metadata that you apply to the task to help you categorize and organize them.
       *
       * Each tag consists of a key and an optional value, both of which you define. For more
       * information, see
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) in the
       * *Amazon ECS API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-tags)
       */
      override fun tags(): Any? = unwrap(this).getTags()

      /**
       * The number of tasks to create based on `TaskDefinition` .
       *
       * The default is `1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-taskcount)
       */
      override fun taskCount(): Number? = unwrap(this).getTaskCount()

      /**
       * The Amazon Resource Name (ARN) of the task definition to use if the event target is an
       * Amazon ECS task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-ecsparameters.html#cfn-scheduler-schedule-ecsparameters-taskdefinitionarn)
       */
      override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty):
          EcsParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? EcsParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.EcsParametersProperty
    }
  }

  /**
   * The templated target type for the EventBridge
   * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html) API
   * operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * EventBridgeParametersProperty eventBridgeParametersProperty =
   * EventBridgeParametersProperty.builder()
   * .detailType("detailType")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-eventbridgeparameters.html)
   */
  public interface EventBridgeParametersProperty {
    /**
     * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in
     * the event detail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-eventbridgeparameters.html#cfn-scheduler-schedule-eventbridgeparameters-detailtype)
     */
    public fun detailType(): String

    /**
     * The source of the event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-eventbridgeparameters.html#cfn-scheduler-schedule-eventbridgeparameters-source)
     */
    public fun source(): String

    /**
     * A builder for [EventBridgeParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param detailType A free-form string, with a maximum of 128 characters, used to decide what
       * fields to expect in the event detail. 
       */
      public fun detailType(detailType: String)

      /**
       * @param source The source of the event. 
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty.builder()

      /**
       * @param detailType A free-form string, with a maximum of 128 characters, used to decide what
       * fields to expect in the event detail. 
       */
      override fun detailType(detailType: String) {
        cdkBuilder.detailType(detailType)
      }

      /**
       * @param source The source of the event. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty,
    ) : CdkObject(cdkObject),
        EventBridgeParametersProperty {
      /**
       * A free-form string, with a maximum of 128 characters, used to decide what fields to expect
       * in the event detail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-eventbridgeparameters.html#cfn-scheduler-schedule-eventbridgeparameters-detailtype)
       */
      override fun detailType(): String = unwrap(this).getDetailType()

      /**
       * The source of the event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-eventbridgeparameters.html#cfn-scheduler-schedule-eventbridgeparameters-source)
       */
      override fun source(): String = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty):
          EventBridgeParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventBridgeParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.EventBridgeParametersProperty
    }
  }

  /**
   * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * FlexibleTimeWindowProperty flexibleTimeWindowProperty = FlexibleTimeWindowProperty.builder()
   * .mode("mode")
   * // the properties below are optional
   * .maximumWindowInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-flexibletimewindow.html)
   */
  public interface FlexibleTimeWindowProperty {
    /**
     * The maximum time window during which a schedule can be invoked.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1440`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-flexibletimewindow.html#cfn-scheduler-schedule-flexibletimewindow-maximumwindowinminutes)
     */
    public fun maximumWindowInMinutes(): Number? = unwrap(this).getMaximumWindowInMinutes()

    /**
     * Determines whether the schedule is invoked within a flexible time window.
     *
     * You must use quotation marks when you specify this value in your JSON or YAML template.
     *
     * *Allowed Values* : `"OFF"` | `"FLEXIBLE"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-flexibletimewindow.html#cfn-scheduler-schedule-flexibletimewindow-mode)
     */
    public fun mode(): String

    /**
     * A builder for [FlexibleTimeWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumWindowInMinutes The maximum time window during which a schedule can be
       * invoked.
       * *Minimum* : `1`
       *
       * *Maximum* : `1440`
       */
      public fun maximumWindowInMinutes(maximumWindowInMinutes: Number)

      /**
       * @param mode Determines whether the schedule is invoked within a flexible time window. 
       * You must use quotation marks when you specify this value in your JSON or YAML template.
       *
       * *Allowed Values* : `"OFF"` | `"FLEXIBLE"`
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty.builder()

      /**
       * @param maximumWindowInMinutes The maximum time window during which a schedule can be
       * invoked.
       * *Minimum* : `1`
       *
       * *Maximum* : `1440`
       */
      override fun maximumWindowInMinutes(maximumWindowInMinutes: Number) {
        cdkBuilder.maximumWindowInMinutes(maximumWindowInMinutes)
      }

      /**
       * @param mode Determines whether the schedule is invoked within a flexible time window. 
       * You must use quotation marks when you specify this value in your JSON or YAML template.
       *
       * *Allowed Values* : `"OFF"` | `"FLEXIBLE"`
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty,
    ) : CdkObject(cdkObject),
        FlexibleTimeWindowProperty {
      /**
       * The maximum time window during which a schedule can be invoked.
       *
       * *Minimum* : `1`
       *
       * *Maximum* : `1440`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-flexibletimewindow.html#cfn-scheduler-schedule-flexibletimewindow-maximumwindowinminutes)
       */
      override fun maximumWindowInMinutes(): Number? = unwrap(this).getMaximumWindowInMinutes()

      /**
       * Determines whether the schedule is invoked within a flexible time window.
       *
       * You must use quotation marks when you specify this value in your JSON or YAML template.
       *
       * *Allowed Values* : `"OFF"` | `"FLEXIBLE"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-flexibletimewindow.html#cfn-scheduler-schedule-flexibletimewindow-mode)
       */
      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlexibleTimeWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty):
          FlexibleTimeWindowProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlexibleTimeWindowProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlexibleTimeWindowProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.FlexibleTimeWindowProperty
    }
  }

  /**
   * The templated target type for the Amazon Kinesis
   * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
   * operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * KinesisParametersProperty kinesisParametersProperty = KinesisParametersProperty.builder()
   * .partitionKey("partitionKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html)
   */
  public interface KinesisParametersProperty {
    /**
     * Specifies the shard to which EventBridge Scheduler sends the event.
     *
     * For more information, see [Amazon Kinesis Data Streams terminology and
     * concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html) in the *Amazon
     * Kinesis Streams Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html#cfn-scheduler-schedule-kinesisparameters-partitionkey)
     */
    public fun partitionKey(): String

    /**
     * A builder for [KinesisParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partitionKey Specifies the shard to which EventBridge Scheduler sends the event. 
       * For more information, see [Amazon Kinesis Data Streams terminology and
       * concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html) in the *Amazon
       * Kinesis Streams Developer Guide* .
       */
      public fun partitionKey(partitionKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty.builder()

      /**
       * @param partitionKey Specifies the shard to which EventBridge Scheduler sends the event. 
       * For more information, see [Amazon Kinesis Data Streams terminology and
       * concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html) in the *Amazon
       * Kinesis Streams Developer Guide* .
       */
      override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty,
    ) : CdkObject(cdkObject),
        KinesisParametersProperty {
      /**
       * Specifies the shard to which EventBridge Scheduler sends the event.
       *
       * For more information, see [Amazon Kinesis Data Streams terminology and
       * concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html) in the *Amazon
       * Kinesis Streams Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html#cfn-scheduler-schedule-kinesisparameters-partitionkey)
       */
      override fun partitionKey(): String = unwrap(this).getPartitionKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty):
          KinesisParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.KinesisParametersProperty
    }
  }

  /**
   * Specifies the network configuration for an ECS task.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * NetworkConfigurationProperty networkConfigurationProperty =
   * NetworkConfigurationProperty.builder()
   * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
   * .subnets(List.of("subnets"))
   * // the properties below are optional
   * .assignPublicIp("assignPublicIp")
   * .securityGroups(List.of("securityGroups"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-networkconfiguration.html)
   */
  public interface NetworkConfigurationProperty {
    /**
     * Specifies the Amazon VPC subnets and security groups for the task, and whether a public IP
     * address is to be used.
     *
     * This structure is relevant only for ECS tasks that use the awsvpc network mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-networkconfiguration.html#cfn-scheduler-schedule-networkconfiguration-awsvpcconfiguration)
     */
    public fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the
       * task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the awsvpc network mode.
       */
      public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable)

      /**
       * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the
       * task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the awsvpc network mode.
       */
      public fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty)

      /**
       * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the
       * task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the awsvpc network mode.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04060809f9c1959bebda48faabac1ca5fdf8baed4d13ecc17eaf06ccbf42270a")
      public
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty.builder()

      /**
       * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the
       * task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the awsvpc network mode.
       */
      override fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the
       * task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the awsvpc network mode.
       */
      override fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration.let(AwsVpcConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param awsvpcConfiguration Specifies the Amazon VPC subnets and security groups for the
       * task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the awsvpc network mode.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04060809f9c1959bebda48faabac1ca5fdf8baed4d13ecc17eaf06ccbf42270a")
      override
          fun awsvpcConfiguration(awsvpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsvpcConfiguration(AwsVpcConfigurationProperty(awsvpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject),
        NetworkConfigurationProperty {
      /**
       * Specifies the Amazon VPC subnets and security groups for the task, and whether a public IP
       * address is to be used.
       *
       * This structure is relevant only for ECS tasks that use the awsvpc network mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-networkconfiguration.html#cfn-scheduler-schedule-networkconfiguration-awsvpcconfiguration)
       */
      override fun awsvpcConfiguration(): Any? = unwrap(this).getAwsvpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty):
          NetworkConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NetworkConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.NetworkConfigurationProperty
    }
  }

  /**
   * An object representing a constraint on task placement.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
   * .expression("expression")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementconstraint.html)
   */
  public interface PlacementConstraintProperty {
    /**
     * A cluster query language expression to apply to the constraint.
     *
     * You cannot specify an expression if the constraint type is `distinctInstance` . For more
     * information, see [Cluster query
     * language](https://docs.aws.amazon.com/latest/developerguide/cluster-query-language.html) in the
     * *Amazon ECS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementconstraint.html#cfn-scheduler-schedule-placementconstraint-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * The type of constraint.
     *
     * Use `distinctInstance` to ensure that each task in a particular group is running on a
     * different container instance. Use `memberOf` to restrict the selection to a group of valid
     * candidates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementconstraint.html#cfn-scheduler-schedule-placementconstraint-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PlacementConstraintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * You cannot specify an expression if the constraint type is `distinctInstance` . For more
       * information, see [Cluster query
       * language](https://docs.aws.amazon.com/latest/developerguide/cluster-query-language.html) in
       * the *Amazon ECS Developer Guide* .
       */
      public fun expression(expression: String)

      /**
       * @param type The type of constraint.
       * Use `distinctInstance` to ensure that each task in a particular group is running on a
       * different container instance. Use `memberOf` to restrict the selection to a group of valid
       * candidates.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty.builder()

      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * You cannot specify an expression if the constraint type is `distinctInstance` . For more
       * information, see [Cluster query
       * language](https://docs.aws.amazon.com/latest/developerguide/cluster-query-language.html) in
       * the *Amazon ECS Developer Guide* .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param type The type of constraint.
       * Use `distinctInstance` to ensure that each task in a particular group is running on a
       * different container instance. Use `memberOf` to restrict the selection to a group of valid
       * candidates.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty,
    ) : CdkObject(cdkObject),
        PlacementConstraintProperty {
      /**
       * A cluster query language expression to apply to the constraint.
       *
       * You cannot specify an expression if the constraint type is `distinctInstance` . For more
       * information, see [Cluster query
       * language](https://docs.aws.amazon.com/latest/developerguide/cluster-query-language.html) in
       * the *Amazon ECS Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementconstraint.html#cfn-scheduler-schedule-placementconstraint-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * The type of constraint.
       *
       * Use `distinctInstance` to ensure that each task in a particular group is running on a
       * different container instance. Use `memberOf` to restrict the selection to a group of valid
       * candidates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementconstraint.html#cfn-scheduler-schedule-placementconstraint-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty):
          PlacementConstraintProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PlacementConstraintProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementConstraintProperty
    }
  }

  /**
   * The task placement strategy for a task or service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
   * .field("field")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementstrategy.html)
   */
  public interface PlacementStrategyProperty {
    /**
     * The field to apply the placement strategy against.
     *
     * For the spread placement strategy, valid values are `instanceId` (or `instanceId` , which has
     * the same effect), or any platform or custom attribute that is applied to a container instance,
     * such as `attribute:ecs.availability-zone` . For the binpack placement strategy, valid values are
     * `cpu` and `memory` . For the random placement strategy, this field is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementstrategy.html#cfn-scheduler-schedule-placementstrategy-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The type of placement strategy.
     *
     * The random placement strategy randomly places tasks on available candidates. The spread
     * placement strategy spreads placement across available candidates evenly based on the field
     * parameter. The binpack strategy places tasks on available candidates that have the least
     * available amount of the resource that is specified with the field parameter. For example, if you
     * binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementstrategy.html#cfn-scheduler-schedule-placementstrategy-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PlacementStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param field The field to apply the placement strategy against.
       * For the spread placement strategy, valid values are `instanceId` (or `instanceId` , which
       * has the same effect), or any platform or custom attribute that is applied to a container
       * instance, such as `attribute:ecs.availability-zone` . For the binpack placement strategy,
       * valid values are `cpu` and `memory` . For the random placement strategy, this field is not
       * used.
       */
      public fun `field`(`field`: String)

      /**
       * @param type The type of placement strategy.
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty.builder()

      /**
       * @param field The field to apply the placement strategy against.
       * For the spread placement strategy, valid values are `instanceId` (or `instanceId` , which
       * has the same effect), or any platform or custom attribute that is applied to a container
       * instance, such as `attribute:ecs.availability-zone` . For the binpack placement strategy,
       * valid values are `cpu` and `memory` . For the random placement strategy, this field is not
       * used.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param type The type of placement strategy.
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty,
    ) : CdkObject(cdkObject),
        PlacementStrategyProperty {
      /**
       * The field to apply the placement strategy against.
       *
       * For the spread placement strategy, valid values are `instanceId` (or `instanceId` , which
       * has the same effect), or any platform or custom attribute that is applied to a container
       * instance, such as `attribute:ecs.availability-zone` . For the binpack placement strategy,
       * valid values are `cpu` and `memory` . For the random placement strategy, this field is not
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementstrategy.html#cfn-scheduler-schedule-placementstrategy-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The type of placement strategy.
       *
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementstrategy.html#cfn-scheduler-schedule-placementstrategy-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty):
          PlacementStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PlacementStrategyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.PlacementStrategyProperty
    }
  }

  /**
   * A `RetryPolicy` object that includes information about the retry policy settings, including the
   * maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver
   * the event to a target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * RetryPolicyProperty retryPolicyProperty = RetryPolicyProperty.builder()
   * .maximumEventAgeInSeconds(123)
   * .maximumRetryAttempts(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-retrypolicy.html)
   */
  public interface RetryPolicyProperty {
    /**
     * The maximum amount of time, in seconds, to continue to make retry attempts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-retrypolicy.html#cfn-scheduler-schedule-retrypolicy-maximumeventageinseconds)
     */
    public fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

    /**
     * The maximum number of retry attempts to make before the request fails.
     *
     * Retry attempts with exponential backoff continue until either the maximum number of attempts
     * is made or until the duration of the `MaximumEventAgeInSeconds` is reached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-retrypolicy.html#cfn-scheduler-schedule-retrypolicy-maximumretryattempts)
     */
    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * A builder for [RetryPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumEventAgeInSeconds The maximum amount of time, in seconds, to continue to make
       * retry attempts.
       */
      public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

      /**
       * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
       * fails.
       * Retry attempts with exponential backoff continue until either the maximum number of
       * attempts is made or until the duration of the `MaximumEventAgeInSeconds` is reached.
       */
      public fun maximumRetryAttempts(maximumRetryAttempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty.builder()

      /**
       * @param maximumEventAgeInSeconds The maximum amount of time, in seconds, to continue to make
       * retry attempts.
       */
      override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
      }

      /**
       * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
       * fails.
       * Retry attempts with exponential backoff continue until either the maximum number of
       * attempts is made or until the duration of the `MaximumEventAgeInSeconds` is reached.
       */
      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public fun build(): software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty,
    ) : CdkObject(cdkObject),
        RetryPolicyProperty {
      /**
       * The maximum amount of time, in seconds, to continue to make retry attempts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-retrypolicy.html#cfn-scheduler-schedule-retrypolicy-maximumeventageinseconds)
       */
      override fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

      /**
       * The maximum number of retry attempts to make before the request fails.
       *
       * Retry attempts with exponential backoff continue until either the maximum number of
       * attempts is made or until the duration of the `MaximumEventAgeInSeconds` is reached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-retrypolicy.html#cfn-scheduler-schedule-retrypolicy-maximumretryattempts)
       */
      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetryPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty):
          RetryPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? RetryPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryPolicyProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.RetryPolicyProperty
    }
  }

  /**
   * The name and value pair of a parameter to use to start execution of a SageMaker Model Building
   * Pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * SageMakerPipelineParameterProperty sageMakerPipelineParameterProperty =
   * SageMakerPipelineParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameter.html)
   */
  public interface SageMakerPipelineParameterProperty {
    /**
     * Name of parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameter.html#cfn-scheduler-schedule-sagemakerpipelineparameter-name)
     */
    public fun name(): String

    /**
     * Value of parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameter.html#cfn-scheduler-schedule-sagemakerpipelineparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SageMakerPipelineParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      public fun name(name: String)

      /**
       * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty.builder()

      /**
       * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty,
    ) : CdkObject(cdkObject),
        SageMakerPipelineParameterProperty {
      /**
       * Name of parameter to start execution of a SageMaker Model Building Pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameter.html#cfn-scheduler-schedule-sagemakerpipelineparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Value of parameter to start execution of a SageMaker Model Building Pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameter.html#cfn-scheduler-schedule-sagemakerpipelineparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty):
          SageMakerPipelineParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SageMakerPipelineParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParameterProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParameterProperty
    }
  }

  /**
   * The templated target type for the Amazon SageMaker
   * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
   * API operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * SageMakerPipelineParametersProperty sageMakerPipelineParametersProperty =
   * SageMakerPipelineParametersProperty.builder()
   * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html)
   */
  public interface SageMakerPipelineParametersProperty {
    /**
     * List of parameter names and values to use when executing the SageMaker Model Building
     * Pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html#cfn-scheduler-schedule-sagemakerpipelineparameters-pipelineparameterlist)
     */
    public fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()

    /**
     * A builder for [SageMakerPipelineParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pipelineParameterList List of parameter names and values to use when executing the
       * SageMaker Model Building Pipeline.
       */
      public fun pipelineParameterList(pipelineParameterList: IResolvable)

      /**
       * @param pipelineParameterList List of parameter names and values to use when executing the
       * SageMaker Model Building Pipeline.
       */
      public fun pipelineParameterList(pipelineParameterList: List<Any>)

      /**
       * @param pipelineParameterList List of parameter names and values to use when executing the
       * SageMaker Model Building Pipeline.
       */
      public fun pipelineParameterList(vararg pipelineParameterList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty.Builder
          =
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty.builder()

      /**
       * @param pipelineParameterList List of parameter names and values to use when executing the
       * SageMaker Model Building Pipeline.
       */
      override fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param pipelineParameterList List of parameter names and values to use when executing the
       * SageMaker Model Building Pipeline.
       */
      override fun pipelineParameterList(pipelineParameterList: List<Any>) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param pipelineParameterList List of parameter names and values to use when executing the
       * SageMaker Model Building Pipeline.
       */
      override fun pipelineParameterList(vararg pipelineParameterList: Any): Unit =
          pipelineParameterList(pipelineParameterList.toList())

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty,
    ) : CdkObject(cdkObject),
        SageMakerPipelineParametersProperty {
      /**
       * List of parameter names and values to use when executing the SageMaker Model Building
       * Pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html#cfn-scheduler-schedule-sagemakerpipelineparameters-pipelineparameterlist)
       */
      override fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty):
          SageMakerPipelineParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SageMakerPipelineParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.SageMakerPipelineParametersProperty
    }
  }

  /**
   * The templated target type for the Amazon SQS
   * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
   * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
   * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
   * enabled. For more information, see [Using the Amazon SQS message deduplication
   * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * SqsParametersProperty sqsParametersProperty = SqsParametersProperty.builder()
   * .messageGroupId("messageGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sqsparameters.html)
   */
  public interface SqsParametersProperty {
    /**
     * The FIFO message group ID to use as the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sqsparameters.html#cfn-scheduler-schedule-sqsparameters-messagegroupid)
     */
    public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

    /**
     * A builder for [SqsParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param messageGroupId The FIFO message group ID to use as the target.
       */
      public fun messageGroupId(messageGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty.builder()

      /**
       * @param messageGroupId The FIFO message group ID to use as the target.
       */
      override fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty,
    ) : CdkObject(cdkObject),
        SqsParametersProperty {
      /**
       * The FIFO message group ID to use as the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sqsparameters.html#cfn-scheduler-schedule-sqsparameters-messagegroupid)
       */
      override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty):
          SqsParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? SqsParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsParametersProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.SqsParametersProperty
    }
  }

  /**
   * The schedule's target.
   *
   * EventBridge Scheduler supports templated target that invoke common API operations, as well as
   * universal targets that you can customize to invoke over 6,000 API operations across more than 270
   * services. You can only specify one templated or universal target for a schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.scheduler.*;
   * Object tags;
   * TargetProperty targetProperty = TargetProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html)
   */
  public interface TargetProperty {
    /**
     * The Amazon Resource Name (ARN) of the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-arn)
     */
    public fun arn(): String

    /**
     * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses
     * as a dead-letter queue for your schedule.
     *
     * If specified, EventBridge Scheduler delivers failed events that could not be successfully
     * delivered to a target to the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-deadletterconfig)
     */
    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    /**
     * The templated target type for the Amazon ECS
     * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-ecsparameters)
     */
    public fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

    /**
     * The templated target type for the EventBridge
     * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-eventbridgeparameters)
     */
    public fun eventBridgeParameters(): Any? = unwrap(this).getEventBridgeParameters()

    /**
     * The text, or well-formed JSON, passed to the target.
     *
     * If you are configuring a templated Lambda , AWS Step Functions , or Amazon EventBridge
     * target, the input must be a well-formed JSON. For all other target types, a JSON is not
     * required. If you do not specify anything for this field, Amazon EventBridge Scheduler delivers a
     * default notification to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * The templated target type for the Amazon Kinesis
     * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-kinesisparameters)
     */
    public fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

    /**
     * A `RetryPolicy` object that includes information about the retry policy settings, including
     * the maximum age of an event, and the maximum number of times EventBridge Scheduler will try to
     * deliver the event to a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-retrypolicy)
     */
    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this
     * target when the schedule is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-rolearn)
     */
    public fun roleArn(): String

    /**
     * The templated target type for the Amazon SageMaker
     * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-sagemakerpipelineparameters)
     */
    public fun sageMakerPipelineParameters(): Any? = unwrap(this).getSageMakerPipelineParameters()

    /**
     * The templated target type for the Amazon SQS
     * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
     * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
     * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
     * enabled. For more information, see [Using the Amazon SQS message deduplication
     * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-sqsparameters)
     */
    public fun sqsParameters(): Any? = unwrap(this).getSqsParameters()

    /**
     * A builder for [TargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the target. 
       */
      public fun arn(arn: String)

      /**
       * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
       * EventBridge Scheduler uses as a dead-letter queue for your schedule.
       * If specified, EventBridge Scheduler delivers failed events that could not be successfully
       * delivered to a target to the queue.
       */
      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      /**
       * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
       * EventBridge Scheduler uses as a dead-letter queue for your schedule.
       * If specified, EventBridge Scheduler delivers failed events that could not be successfully
       * delivered to a target to the queue.
       */
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      /**
       * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
       * EventBridge Scheduler uses as a dead-letter queue for your schedule.
       * If specified, EventBridge Scheduler delivers failed events that could not be successfully
       * delivered to a target to the queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("678b1b6e4c8abb7d37742f06ab8e75b8927b5925e871c0db1a6f25b5830bc1a6")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      /**
       * @param ecsParameters The templated target type for the Amazon ECS
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
       * operation.
       */
      public fun ecsParameters(ecsParameters: IResolvable)

      /**
       * @param ecsParameters The templated target type for the Amazon ECS
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
       * operation.
       */
      public fun ecsParameters(ecsParameters: EcsParametersProperty)

      /**
       * @param ecsParameters The templated target type for the Amazon ECS
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
       * operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42efab9de5b2a42fa3800150ad80ad2a5e6af52d9b2a1abe90a31d7a4de09091")
      public fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit)

      /**
       * @param eventBridgeParameters The templated target type for the EventBridge
       * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * API operation.
       */
      public fun eventBridgeParameters(eventBridgeParameters: IResolvable)

      /**
       * @param eventBridgeParameters The templated target type for the EventBridge
       * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * API operation.
       */
      public fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty)

      /**
       * @param eventBridgeParameters The templated target type for the EventBridge
       * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * API operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8dc7021d0d8dad51f9e7fd3ed7eff45c5257077ea5c72412c8b2367ed03fc00")
      public
          fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty.Builder.() -> Unit)

      /**
       * @param input The text, or well-formed JSON, passed to the target.
       * If you are configuring a templated Lambda , AWS Step Functions , or Amazon EventBridge
       * target, the input must be a well-formed JSON. For all other target types, a JSON is not
       * required. If you do not specify anything for this field, Amazon EventBridge Scheduler delivers
       * a default notification to the target.
       */
      public fun input(input: String)

      /**
       * @param kinesisParameters The templated target type for the Amazon Kinesis
       * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
       * operation.
       */
      public fun kinesisParameters(kinesisParameters: IResolvable)

      /**
       * @param kinesisParameters The templated target type for the Amazon Kinesis
       * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
       * operation.
       */
      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty)

      /**
       * @param kinesisParameters The templated target type for the Amazon Kinesis
       * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
       * operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c98b52af61e5e7d28642a0e18e6d158ca79515a608d6ae740f68d6e21efe6f6")
      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit)

      /**
       * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
       * settings, including the maximum age of an event, and the maximum number of times EventBridge
       * Scheduler will try to deliver the event to a target.
       */
      public fun retryPolicy(retryPolicy: IResolvable)

      /**
       * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
       * settings, including the maximum age of an event, and the maximum number of times EventBridge
       * Scheduler will try to deliver the event to a target.
       */
      public fun retryPolicy(retryPolicy: RetryPolicyProperty)

      /**
       * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
       * settings, including the maximum age of an event, and the maximum number of times EventBridge
       * Scheduler will try to deliver the event to a target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ef94c64773bf2d1846e72841097ccc999a30443539e54c32707d6748ffcc766")
      public fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler
       * will use for this target when the schedule is invoked. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
       * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
       * API operation.
       */
      public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable)

      /**
       * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
       * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
       * API operation.
       */
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty)

      /**
       * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
       * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
       * API operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7c2f060bbdd051dfc0f3b6cc34e03f93ed8684d1b1ba4fb6f48478304c67e0f")
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty.Builder.() -> Unit)

      /**
       * @param sqsParameters The templated target type for the Amazon SQS
       * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
       * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
       * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
       * enabled. For more information, see [Using the Amazon SQS message deduplication
       * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
       * in the *Amazon SQS Developer Guide* .
       */
      public fun sqsParameters(sqsParameters: IResolvable)

      /**
       * @param sqsParameters The templated target type for the Amazon SQS
       * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
       * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
       * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
       * enabled. For more information, see [Using the Amazon SQS message deduplication
       * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
       * in the *Amazon SQS Developer Guide* .
       */
      public fun sqsParameters(sqsParameters: SqsParametersProperty)

      /**
       * @param sqsParameters The templated target type for the Amazon SQS
       * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
       * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
       * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
       * enabled. For more information, see [Using the Amazon SQS message deduplication
       * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
       * in the *Amazon SQS Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b03d5a5df57542717b168a26ad0f0bc9650a6fb5977cacfb1b3573557f277c5")
      public fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty.Builder =
          software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the target. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
       * EventBridge Scheduler uses as a dead-letter queue for your schedule.
       * If specified, EventBridge Scheduler delivers failed events that could not be successfully
       * delivered to a target to the queue.
       */
      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
       * EventBridge Scheduler uses as a dead-letter queue for your schedule.
       * If specified, EventBridge Scheduler delivers failed events that could not be successfully
       * delivered to a target to the queue.
       */
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty.Companion::unwrap))
      }

      /**
       * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
       * EventBridge Scheduler uses as a dead-letter queue for your schedule.
       * If specified, EventBridge Scheduler delivers failed events that could not be successfully
       * delivered to a target to the queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("678b1b6e4c8abb7d37742f06ab8e75b8927b5925e871c0db1a6f25b5830bc1a6")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      /**
       * @param ecsParameters The templated target type for the Amazon ECS
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
       * operation.
       */
      override fun ecsParameters(ecsParameters: IResolvable) {
        cdkBuilder.ecsParameters(ecsParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ecsParameters The templated target type for the Amazon ECS
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
       * operation.
       */
      override fun ecsParameters(ecsParameters: EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters.let(EcsParametersProperty.Companion::unwrap))
      }

      /**
       * @param ecsParameters The templated target type for the Amazon ECS
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
       * operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42efab9de5b2a42fa3800150ad80ad2a5e6af52d9b2a1abe90a31d7a4de09091")
      override fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit): Unit =
          ecsParameters(EcsParametersProperty(ecsParameters))

      /**
       * @param eventBridgeParameters The templated target type for the EventBridge
       * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * API operation.
       */
      override fun eventBridgeParameters(eventBridgeParameters: IResolvable) {
        cdkBuilder.eventBridgeParameters(eventBridgeParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param eventBridgeParameters The templated target type for the EventBridge
       * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * API operation.
       */
      override fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty) {
        cdkBuilder.eventBridgeParameters(eventBridgeParameters.let(EventBridgeParametersProperty.Companion::unwrap))
      }

      /**
       * @param eventBridgeParameters The templated target type for the EventBridge
       * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * API operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8dc7021d0d8dad51f9e7fd3ed7eff45c5257077ea5c72412c8b2367ed03fc00")
      override
          fun eventBridgeParameters(eventBridgeParameters: EventBridgeParametersProperty.Builder.() -> Unit):
          Unit = eventBridgeParameters(EventBridgeParametersProperty(eventBridgeParameters))

      /**
       * @param input The text, or well-formed JSON, passed to the target.
       * If you are configuring a templated Lambda , AWS Step Functions , or Amazon EventBridge
       * target, the input must be a well-formed JSON. For all other target types, a JSON is not
       * required. If you do not specify anything for this field, Amazon EventBridge Scheduler delivers
       * a default notification to the target.
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param kinesisParameters The templated target type for the Amazon Kinesis
       * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
       * operation.
       */
      override fun kinesisParameters(kinesisParameters: IResolvable) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kinesisParameters The templated target type for the Amazon Kinesis
       * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
       * operation.
       */
      override fun kinesisParameters(kinesisParameters: KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(KinesisParametersProperty.Companion::unwrap))
      }

      /**
       * @param kinesisParameters The templated target type for the Amazon Kinesis
       * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
       * operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c98b52af61e5e7d28642a0e18e6d158ca79515a608d6ae740f68d6e21efe6f6")
      override
          fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit):
          Unit = kinesisParameters(KinesisParametersProperty(kinesisParameters))

      /**
       * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
       * settings, including the maximum age of an event, and the maximum number of times EventBridge
       * Scheduler will try to deliver the event to a target.
       */
      override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
       * settings, including the maximum age of an event, and the maximum number of times EventBridge
       * Scheduler will try to deliver the event to a target.
       */
      override fun retryPolicy(retryPolicy: RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(RetryPolicyProperty.Companion::unwrap))
      }

      /**
       * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
       * settings, including the maximum age of an event, and the maximum number of times EventBridge
       * Scheduler will try to deliver the event to a target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ef94c64773bf2d1846e72841097ccc999a30443539e54c32707d6748ffcc766")
      override fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit): Unit =
          retryPolicy(RetryPolicyProperty(retryPolicy))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler
       * will use for this target when the schedule is invoked. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
       * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
       * API operation.
       */
      override fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
       * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
       * API operation.
       */
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(SageMakerPipelineParametersProperty.Companion::unwrap))
      }

      /**
       * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
       * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
       * API operation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7c2f060bbdd051dfc0f3b6cc34e03f93ed8684d1b1ba4fb6f48478304c67e0f")
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty.Builder.() -> Unit):
          Unit =
          sageMakerPipelineParameters(SageMakerPipelineParametersProperty(sageMakerPipelineParameters))

      /**
       * @param sqsParameters The templated target type for the Amazon SQS
       * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
       * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
       * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
       * enabled. For more information, see [Using the Amazon SQS message deduplication
       * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
       * in the *Amazon SQS Developer Guide* .
       */
      override fun sqsParameters(sqsParameters: IResolvable) {
        cdkBuilder.sqsParameters(sqsParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sqsParameters The templated target type for the Amazon SQS
       * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
       * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
       * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
       * enabled. For more information, see [Using the Amazon SQS message deduplication
       * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
       * in the *Amazon SQS Developer Guide* .
       */
      override fun sqsParameters(sqsParameters: SqsParametersProperty) {
        cdkBuilder.sqsParameters(sqsParameters.let(SqsParametersProperty.Companion::unwrap))
      }

      /**
       * @param sqsParameters The templated target type for the Amazon SQS
       * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
       * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
       * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
       * enabled. For more information, see [Using the Amazon SQS message deduplication
       * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
       * in the *Amazon SQS Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b03d5a5df57542717b168a26ad0f0bc9650a6fb5977cacfb1b3573557f277c5")
      override fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit): Unit =
          sqsParameters(SqsParametersProperty(sqsParameters))

      public fun build(): software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty,
    ) : CdkObject(cdkObject),
        TargetProperty {
      /**
       * The Amazon Resource Name (ARN) of the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * An object that contains information about an Amazon SQS queue that EventBridge Scheduler
       * uses as a dead-letter queue for your schedule.
       *
       * If specified, EventBridge Scheduler delivers failed events that could not be successfully
       * delivered to a target to the queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-deadletterconfig)
       */
      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      /**
       * The templated target type for the Amazon ECS
       * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
       * operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-ecsparameters)
       */
      override fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

      /**
       * The templated target type for the EventBridge
       * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-eventbridgeparameters)
       */
      override fun eventBridgeParameters(): Any? = unwrap(this).getEventBridgeParameters()

      /**
       * The text, or well-formed JSON, passed to the target.
       *
       * If you are configuring a templated Lambda , AWS Step Functions , or Amazon EventBridge
       * target, the input must be a well-formed JSON. For all other target types, a JSON is not
       * required. If you do not specify anything for this field, Amazon EventBridge Scheduler delivers
       * a default notification to the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * The templated target type for the Amazon Kinesis
       * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
       * operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-kinesisparameters)
       */
      override fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

      /**
       * A `RetryPolicy` object that includes information about the retry policy settings, including
       * the maximum age of an event, and the maximum number of times EventBridge Scheduler will try to
       * deliver the event to a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-retrypolicy)
       */
      override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      /**
       * The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this
       * target when the schedule is invoked.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The templated target type for the Amazon SageMaker
       * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-sagemakerpipelineparameters)
       */
      override fun sageMakerPipelineParameters(): Any? =
          unwrap(this).getSageMakerPipelineParameters()

      /**
       * The templated target type for the Amazon SQS
       * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
       * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
       * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
       * enabled. For more information, see [Using the Amazon SQS message deduplication
       * ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
       * in the *Amazon SQS Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html#cfn-scheduler-schedule-target-sqsparameters)
       */
      override fun sqsParameters(): Any? = unwrap(this).getSqsParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty):
          TargetProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.scheduler.CfnSchedule.TargetProperty
    }
  }
}
