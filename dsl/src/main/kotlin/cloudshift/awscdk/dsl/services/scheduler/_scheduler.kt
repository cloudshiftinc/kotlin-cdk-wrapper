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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.amazon.awscdk.services.scheduler.CfnScheduleGroup
import software.amazon.awscdk.services.scheduler.CfnScheduleGroupProps
import software.amazon.awscdk.services.scheduler.CfnScheduleProps
import software.constructs.Construct

public object scheduler {
    /**
     * A *schedule* is the main resource you create, configure, and manage using Amazon EventBridge
     * Scheduler.
     *
     * Every schedule has a *schedule expression* that determines when, and with what frequency, the
     * schedule runs. EventBridge Scheduler supports three types of schedules: rate, cron, and
     * one-time schedules. For more information about different schedule types, see
     * [Schedule types](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html)
     * in the *EventBridge Scheduler User Guide* .
     *
     * When you create a schedule, you configure a target for the schedule to invoke. A target is an
     * API operation that EventBridge Scheduler calls on your behalf every time your schedule runs.
     * EventBridge Scheduler supports two types of targets: *templated* targets invoke common API
     * operations across a core groups of services, and customizeable *universal* targets that you
     * can use to call more than 6,000 operations across over 270 services. For more information
     * about configuring targets, see
     * [Managing targets](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-targets.html)
     * in the *EventBridge Scheduler User Guide* .
     *
     * For more information about managing schedules, changing the schedule state, setting up
     * flexible time windows, and configuring a dead-letter queue for a schedule, see
     * [Managing a schedule](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule.html)
     * in the *EventBridge Scheduler User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
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
    public inline fun cfnSchedule(
        scope: Construct,
        id: String,
        block: CfnScheduleDsl.() -> Unit = {},
    ): CfnSchedule {
        val builder = CfnScheduleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies the VPC subnets and security groups for the task, and whether a
     * public IP address is to be used.
     *
     * This structure is relevant only for ECS tasks that use the awsvpc network mode.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
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
    public inline fun cfnScheduleAwsVpcConfigurationProperty(
        block: CfnScheduleAwsVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSchedule.AwsVpcConfigurationProperty {
        val builder = CfnScheduleAwsVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a capacity provider strategy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
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
    public inline fun cfnScheduleCapacityProviderStrategyItemProperty(
        block: CfnScheduleCapacityProviderStrategyItemPropertyDsl.() -> Unit = {}
    ): CfnSchedule.CapacityProviderStrategyItemProperty {
        val builder = CfnScheduleCapacityProviderStrategyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses
     * as a dead-letter queue for your schedule.
     *
     * If specified, EventBridge Scheduler delivers failed events that could not be successfully
     * delivered to a target to the queue.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-deadletterconfig.html)
     */
    public inline fun cfnScheduleDeadLetterConfigProperty(
        block: CfnScheduleDeadLetterConfigPropertyDsl.() -> Unit = {}
    ): CfnSchedule.DeadLetterConfigProperty {
        val builder = CfnScheduleDeadLetterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The templated target type for the Amazon ECS
     * [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
     * operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
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
    public inline fun cfnScheduleEcsParametersProperty(
        block: CfnScheduleEcsParametersPropertyDsl.() -> Unit = {}
    ): CfnSchedule.EcsParametersProperty {
        val builder = CfnScheduleEcsParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The templated target type for the EventBridge
     * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
     * API operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * EventBridgeParametersProperty eventBridgeParametersProperty =
     * EventBridgeParametersProperty.builder()
     * .detailType("detailType")
     * .source("source")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-eventbridgeparameters.html)
     */
    public inline fun cfnScheduleEventBridgeParametersProperty(
        block: CfnScheduleEventBridgeParametersPropertyDsl.() -> Unit = {}
    ): CfnSchedule.EventBridgeParametersProperty {
        val builder = CfnScheduleEventBridgeParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to configure a time window during which EventBridge Scheduler invokes the
     * schedule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * FlexibleTimeWindowProperty flexibleTimeWindowProperty = FlexibleTimeWindowProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .maximumWindowInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-flexibletimewindow.html)
     */
    public inline fun cfnScheduleFlexibleTimeWindowProperty(
        block: CfnScheduleFlexibleTimeWindowPropertyDsl.() -> Unit = {}
    ): CfnSchedule.FlexibleTimeWindowProperty {
        val builder = CfnScheduleFlexibleTimeWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A *schedule group* is an Amazon EventBridge Scheduler resource you use to organize your
     * schedules.
     *
     * Your AWS account comes with a `default` scheduler group. You associate a new schedule with
     * the `default` group or with schedule groups that you create and manage. You can create up to
     * [500 schedule groups](https://docs.aws.amazon.com/scheduler/latest/UserGuide/scheduler-quotas.html)
     * in your AWS account. With EventBridge Scheduler, you apply
     * [tags](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) to schedule groups,
     * not to individual schedules to organize your resources.
     *
     * For more information about managing schedule groups, see
     * [Managing a schedule group](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule-group.html)
     * in the *EventBridge Scheduler User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * CfnScheduleGroup cfnScheduleGroup = CfnScheduleGroup.Builder.create(this, "MyCfnScheduleGroup")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedulegroup.html)
     */
    public inline fun cfnScheduleGroup(
        scope: Construct,
        id: String,
        block: CfnScheduleGroupDsl.() -> Unit = {},
    ): CfnScheduleGroup {
        val builder = CfnScheduleGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnScheduleGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * CfnScheduleGroupProps cfnScheduleGroupProps = CfnScheduleGroupProps.builder()
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-scheduler-schedulegroup.html)
     */
    public inline fun cfnScheduleGroupProps(
        block: CfnScheduleGroupPropsDsl.() -> Unit = {}
    ): CfnScheduleGroupProps {
        val builder = CfnScheduleGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The templated target type for the Amazon Kinesis
     * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
     * operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * KinesisParametersProperty kinesisParametersProperty = KinesisParametersProperty.builder()
     * .partitionKey("partitionKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html)
     */
    public inline fun cfnScheduleKinesisParametersProperty(
        block: CfnScheduleKinesisParametersPropertyDsl.() -> Unit = {}
    ): CfnSchedule.KinesisParametersProperty {
        val builder = CfnScheduleKinesisParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the network configuration for an ECS task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
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
    public inline fun cfnScheduleNetworkConfigurationProperty(
        block: CfnScheduleNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSchedule.NetworkConfigurationProperty {
        val builder = CfnScheduleNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing a constraint on task placement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementconstraint.html)
     */
    public inline fun cfnSchedulePlacementConstraintProperty(
        block: CfnSchedulePlacementConstraintPropertyDsl.() -> Unit = {}
    ): CfnSchedule.PlacementConstraintProperty {
        val builder = CfnSchedulePlacementConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The task placement strategy for a task or service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-placementstrategy.html)
     */
    public inline fun cfnSchedulePlacementStrategyProperty(
        block: CfnSchedulePlacementStrategyPropertyDsl.() -> Unit = {}
    ): CfnSchedule.PlacementStrategyProperty {
        val builder = CfnSchedulePlacementStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnScheduleProps(
        block: CfnSchedulePropsDsl.() -> Unit = {}
    ): CfnScheduleProps {
        val builder = CfnSchedulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A `RetryPolicy` object that includes information about the retry policy settings, including
     * the maximum age of an event, and the maximum number of times EventBridge Scheduler will try
     * to deliver the event to a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * RetryPolicyProperty retryPolicyProperty = RetryPolicyProperty.builder()
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-retrypolicy.html)
     */
    public inline fun cfnScheduleRetryPolicyProperty(
        block: CfnScheduleRetryPolicyPropertyDsl.() -> Unit = {}
    ): CfnSchedule.RetryPolicyProperty {
        val builder = CfnScheduleRetryPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The name and value pair of a parameter to use to start execution of a SageMaker Model
     * Building Pipeline.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * SageMakerPipelineParameterProperty sageMakerPipelineParameterProperty =
     * SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameter.html)
     */
    public inline fun cfnScheduleSageMakerPipelineParameterProperty(
        block: CfnScheduleSageMakerPipelineParameterPropertyDsl.() -> Unit = {}
    ): CfnSchedule.SageMakerPipelineParameterProperty {
        val builder = CfnScheduleSageMakerPipelineParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The templated target type for the Amazon SageMaker
     * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
     * API operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
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
    public inline fun cfnScheduleSageMakerPipelineParametersProperty(
        block: CfnScheduleSageMakerPipelineParametersPropertyDsl.() -> Unit = {}
    ): CfnSchedule.SageMakerPipelineParametersProperty {
        val builder = CfnScheduleSageMakerPipelineParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The templated target type for the Amazon SQS
     * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
     * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
     * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
     * enabled. For more information, see
     * [Using the Amazon SQS message deduplication ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
     * SqsParametersProperty sqsParametersProperty = SqsParametersProperty.builder()
     * .messageGroupId("messageGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sqsparameters.html)
     */
    public inline fun cfnScheduleSqsParametersProperty(
        block: CfnScheduleSqsParametersPropertyDsl.() -> Unit = {}
    ): CfnSchedule.SqsParametersProperty {
        val builder = CfnScheduleSqsParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The schedule's target.
     *
     * EventBridge Scheduler supports templated target that invoke common API operations, as well as
     * universal targets that you can customize to invoke over 6,000 API operations across more than
     * 270 services. You can only specify one templated or universal target for a schedule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.scheduler.*;
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
    public inline fun cfnScheduleTargetProperty(
        block: CfnScheduleTargetPropertyDsl.() -> Unit = {}
    ): CfnSchedule.TargetProperty {
        val builder = CfnScheduleTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
