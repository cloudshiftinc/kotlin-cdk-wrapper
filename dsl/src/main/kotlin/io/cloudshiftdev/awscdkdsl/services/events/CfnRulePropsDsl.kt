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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRuleProps

/**
 * Properties for defining a `CfnRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * Object eventPattern;
 * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
 * .description("description")
 * .eventBusName("eventBusName")
 * .eventPattern(eventPattern)
 * .name("name")
 * .roleArn("roleArn")
 * .scheduleExpression("scheduleExpression")
 * .state("state")
 * .targets(List.of(TargetProperty.builder()
 * .arn("arn")
 * .id("id")
 * // the properties below are optional
 * .appSyncParameters(AppSyncParametersProperty.builder()
 * .graphQlOperation("graphQlOperation")
 * .build())
 * .batchParameters(BatchParametersProperty.builder()
 * .jobDefinition("jobDefinition")
 * .jobName("jobName")
 * // the properties below are optional
 * .arrayProperties(BatchArrayPropertiesProperty.builder()
 * .size(123)
 * .build())
 * .retryStrategy(BatchRetryStrategyProperty.builder()
 * .attempts(123)
 * .build())
 * .build())
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
 * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
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
 * .placementStrategies(List.of(PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build()))
 * .platformVersion("platformVersion")
 * .propagateTags("propagateTags")
 * .referenceId("referenceId")
 * .tagList(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskCount(123)
 * .build())
 * .httpParameters(HttpParametersProperty.builder()
 * .headerParameters(Map.of(
 * "headerParametersKey", "headerParameters"))
 * .pathParameterValues(List.of("pathParameterValues"))
 * .queryStringParameters(Map.of(
 * "queryStringParametersKey", "queryStringParameters"))
 * .build())
 * .input("input")
 * .inputPath("inputPath")
 * .inputTransformer(InputTransformerProperty.builder()
 * .inputTemplate("inputTemplate")
 * // the properties below are optional
 * .inputPathsMap(Map.of(
 * "inputPathsMapKey", "inputPathsMap"))
 * .build())
 * .kinesisParameters(KinesisParametersProperty.builder()
 * .partitionKeyPath("partitionKeyPath")
 * .build())
 * .redshiftDataParameters(RedshiftDataParametersProperty.builder()
 * .database("database")
 * // the properties below are optional
 * .dbUser("dbUser")
 * .secretManagerArn("secretManagerArn")
 * .sql("sql")
 * .sqls(List.of("sqls"))
 * .statementName("statementName")
 * .withEvent(false)
 * .build())
 * .retryPolicy(RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build())
 * .roleArn("roleArn")
 * .runCommandParameters(RunCommandParametersProperty.builder()
 * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html)
 */
@CdkDslMarker
public class CfnRulePropsDsl {
    private val cdkBuilder: CfnRuleProps.Builder = CfnRuleProps.builder()

    private val _targets: MutableList<Any> = mutableListOf()

    /** @param description The description of the rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param eventBusName The name or ARN of the event bus associated with the rule. If you omit
     *   this, the default event bus is used.
     */
    public fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * @param eventPattern The event pattern of the rule. For more information, see
     *   [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     *   in the *Amazon EventBridge User Guide* .
     */
    public fun eventPattern(eventPattern: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(eventPattern)
        cdkBuilder.eventPattern(builder.map)
    }

    /**
     * @param eventPattern The event pattern of the rule. For more information, see
     *   [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     *   in the *Amazon EventBridge User Guide* .
     */
    public fun eventPattern(eventPattern: Any) {
        cdkBuilder.eventPattern(eventPattern)
    }

    /** @param name The name of the rule. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that is used for target invocation.
     *   If you're setting an event bus in another account as the target and that account granted
     *   permission to your account through an organization instead of directly by the account ID,
     *   you must specify a `RoleArn` with proper permissions in the `Target` structure, instead of
     *   here in this parameter.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param scheduleExpression The scheduling expression. For example, "cron(0 20 * * ? *)",
     *   "rate(5 minutes)". For more information, see
     *   [Creating an Amazon EventBridge rule that runs on a schedule](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-rule-schedule.html)
     *   .
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param state The state of the rule. Valid values include:
     * * `DISABLED` : The rule is disabled. EventBridge does not match any events against the rule.
     * * `ENABLED` : The rule is enabled. EventBridge matches events against the rule, *except* for
     *   AWS management events delivered through CloudTrail.
     * * `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS` : The rule is enabled for all events,
     *   including AWS management events delivered through CloudTrail.
     *
     * Management events provide visibility into management operations that are performed on
     * resources in your AWS account. These are also known as control plane operations. For more
     * information, see
     * [Logging management events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html#logging-management-events)
     * in the *CloudTrail User Guide* , and
     * [Filtering management events from AWS services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-cloudtrail)
     * in the *Amazon EventBridge User Guide* .
     *
     * This value is only valid for rules on the
     * [default](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-what-is-how-it-works-concepts.html#eb-bus-concepts-buses)
     * event bus or
     * [custom event buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-event-bus.html)
     * . It does not apply to
     * [partner event buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-saas.html)
     * .
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /**
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     *   they are already associated with the rule. Targets are the resources that are invoked when
     *   a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     * For a list of services you can configure as targets for events, see
     * [EventBridge targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule,
     * you can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     *   APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in
     *   `PutTargets` .
     *
     * For more information, see
     * [Authentication and Access Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a
     * target of the rules in your account. To send the matched events to the other account, specify
     * that account's event bus as the `Arn` value when you run `PutTargets` . If your account sends
     * events to another account, your account is charged for each sent event. Each event sent to
     * another account is charged as a custom event. The account receiving the event is not charged.
     * For more information, see
     * [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/) .
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID,
     * then you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see
     * [Sending and Receiving Events Between AWS Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     * * If none of the following arguments are specified for a target, then the entire event is
     *   passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon
     *   ECS task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     *   with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     *   the part of the event specified in the path is passed to the target (for example, only the
     *   detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     *   the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     */
    public fun targets(vararg targets: Any) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     *   they are already associated with the rule. Targets are the resources that are invoked when
     *   a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     * For a list of services you can configure as targets for events, see
     * [EventBridge targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule,
     * you can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     *   APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in
     *   `PutTargets` .
     *
     * For more information, see
     * [Authentication and Access Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a
     * target of the rules in your account. To send the matched events to the other account, specify
     * that account's event bus as the `Arn` value when you run `PutTargets` . If your account sends
     * events to another account, your account is charged for each sent event. Each event sent to
     * another account is charged as a custom event. The account receiving the event is not charged.
     * For more information, see
     * [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/) .
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID,
     * then you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see
     * [Sending and Receiving Events Between AWS Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     * * If none of the following arguments are specified for a target, then the entire event is
     *   passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon
     *   ECS task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     *   with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     *   the part of the event specified in the path is passed to the target (for example, only the
     *   detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     *   the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     */
    public fun targets(targets: Collection<Any>) {
        _targets.addAll(targets)
    }

    /**
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     *   they are already associated with the rule. Targets are the resources that are invoked when
     *   a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     * For a list of services you can configure as targets for events, see
     * [EventBridge targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule,
     * you can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     *   APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in
     *   `PutTargets` .
     *
     * For more information, see
     * [Authentication and Access Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a
     * target of the rules in your account. To send the matched events to the other account, specify
     * that account's event bus as the `Arn` value when you run `PutTargets` . If your account sends
     * events to another account, your account is charged for each sent event. Each event sent to
     * another account is charged as a custom event. The account receiving the event is not charged.
     * For more information, see
     * [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/) .
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID,
     * then you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see
     * [Sending and Receiving Events Between AWS Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     * * If none of the following arguments are specified for a target, then the entire event is
     *   passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon
     *   ECS task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     *   with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     *   the part of the event specified in the path is passed to the target (for example, only the
     *   detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     *   the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnRuleProps {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
