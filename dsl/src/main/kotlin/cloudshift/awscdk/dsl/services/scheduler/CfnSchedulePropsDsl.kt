@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.amazon.awscdk.services.scheduler.CfnScheduleProps

/**
 * Properties for defining a `CfnSchedule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
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
@CdkDslMarker
public class CfnSchedulePropsDsl {
    private val cdkBuilder: CfnScheduleProps.Builder = CfnScheduleProps.builder()

    /** @param description The description you specify for the schedule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param endDate The date, in UTC, before which the schedule can invoke its target. Depending
     *   on the schedule's recurrence expression, invocations might stop on, or before, the
     *   `EndDate` you specify. EventBridge Scheduler ignores `EndDate` for one-time schedules.
     */
    public fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
    }

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     *   Scheduler invokes the schedule.
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: IResolvable) {
        cdkBuilder.flexibleTimeWindow(flexibleTimeWindow)
    }

    /**
     * @param flexibleTimeWindow Allows you to configure a time window during which EventBridge
     *   Scheduler invokes the schedule.
     */
    public fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty) {
        cdkBuilder.flexibleTimeWindow(flexibleTimeWindow)
    }

    /** @param groupName The name of the schedule group associated with this schedule. */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) for the customer managed KMS key that
     *   EventBridge Scheduler will use to encrypt and decrypt your data.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /** @param name The name of the schedule. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param scheduleExpression The expression that defines when the schedule runs. The following
     *   formats are supported.
     * * `at` expression - `at(yyyy-mm-ddThh:mm:ss)`
     * * `rate` expression - `rate(value unit)`
     * * `cron` expression - `cron(fields)`
     *
     * You can use `at` expressions to create one-time schedules that invoke a target once, at the
     * time and in the time zone, that you specify. You can use `rate` and `cron` expressions to
     * create recurring schedules. Rate-based schedules are useful when you want to invoke a target
     * at regular intervals, such as every 15 minutes or every five days. Cron-based schedules are
     * useful when you want to invoke a target periodically at a specific time, such as at 8:00 am
     * (UTC+0) every 1st day of the month.
     *
     * A `cron` expression consists of six fields separated by white spaces: `(minutes hours
     * day_of_month month day_of_week year)` .
     *
     * A `rate` expression consists of a *value* as a positive integer, and a *unit* with the
     * following options: `minute` | `minutes` | `hour` | `hours` | `day` | `days`
     *
     * For more information and examples, see
     * [Schedule types on EventBridge Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html)
     * in the *EventBridge Scheduler User Guide* .
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param scheduleExpressionTimezone The timezone in which the scheduling expression is
     *   evaluated.
     */
    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
        cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    /**
     * @param startDate The date, in UTC, after which the schedule can begin invoking its target.
     *   Depending on the schedule's recurrence expression, invocations might occur on, or after,
     *   the `StartDate` you specify. EventBridge Scheduler ignores `StartDate` for one-time
     *   schedules.
     */
    public fun startDate(startDate: String) {
        cdkBuilder.startDate(startDate)
    }

    /**
     * @param state Specifies whether the schedule is enabled or disabled. *Allowed Values* :
     *   `ENABLED` | `DISABLED`
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /** @param target The schedule's target details. */
    public fun target(target: IResolvable) {
        cdkBuilder.target(target)
    }

    /** @param target The schedule's target details. */
    public fun target(target: CfnSchedule.TargetProperty) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnScheduleProps = cdkBuilder.build()
}
