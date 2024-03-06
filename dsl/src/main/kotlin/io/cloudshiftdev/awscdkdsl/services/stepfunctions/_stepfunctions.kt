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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.ActivityProps
import software.amazon.awscdk.services.stepfunctions.AfterwardsOptions
import software.amazon.awscdk.services.stepfunctions.CatchProps
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.amazon.awscdk.services.stepfunctions.CfnActivityProps
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps
import software.amazon.awscdk.services.stepfunctions.Choice
import software.amazon.awscdk.services.stepfunctions.ChoiceProps
import software.amazon.awscdk.services.stepfunctions.ChoiceTransitionOptions
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.CustomState
import software.amazon.awscdk.services.stepfunctions.CustomStateProps
import software.amazon.awscdk.services.stepfunctions.DefinitionConfig
import software.amazon.awscdk.services.stepfunctions.DistributedMap
import software.amazon.awscdk.services.stepfunctions.DistributedMapProps
import software.amazon.awscdk.services.stepfunctions.Fail
import software.amazon.awscdk.services.stepfunctions.FailProps
import software.amazon.awscdk.services.stepfunctions.FileDefinitionBody
import software.amazon.awscdk.services.stepfunctions.FindStateOptions
import software.amazon.awscdk.services.stepfunctions.ItemBatcher
import software.amazon.awscdk.services.stepfunctions.ItemBatcherProps
import software.amazon.awscdk.services.stepfunctions.ItemReaderProps
import software.amazon.awscdk.services.stepfunctions.LogOptions
import software.amazon.awscdk.services.stepfunctions.Map
import software.amazon.awscdk.services.stepfunctions.MapBaseProps
import software.amazon.awscdk.services.stepfunctions.MapProps
import software.amazon.awscdk.services.stepfunctions.Parallel
import software.amazon.awscdk.services.stepfunctions.ParallelProps
import software.amazon.awscdk.services.stepfunctions.Pass
import software.amazon.awscdk.services.stepfunctions.PassProps
import software.amazon.awscdk.services.stepfunctions.ProcessorConfig
import software.amazon.awscdk.services.stepfunctions.ResultWriter
import software.amazon.awscdk.services.stepfunctions.ResultWriterProps
import software.amazon.awscdk.services.stepfunctions.RetryProps
import software.amazon.awscdk.services.stepfunctions.S3CsvItemReader
import software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps
import software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps
import software.amazon.awscdk.services.stepfunctions.S3JsonItemReader
import software.amazon.awscdk.services.stepfunctions.S3ManifestItemReader
import software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader
import software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps
import software.amazon.awscdk.services.stepfunctions.SingleStateOptions
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineProps
import software.amazon.awscdk.services.stepfunctions.StateProps
import software.amazon.awscdk.services.stepfunctions.Succeed
import software.amazon.awscdk.services.stepfunctions.SucceedProps
import software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig
import software.amazon.awscdk.services.stepfunctions.TaskStateBaseProps
import software.amazon.awscdk.services.stepfunctions.Wait
import software.amazon.awscdk.services.stepfunctions.WaitProps
import software.constructs.Construct

public object stepfunctions {
    /**
     * Define a new Step Functions Activity.
     *
     * Example:
     * ```
     * Activity activity = new Activity(this, "Activity");
     * Role role = Role.Builder.create(this, "Role")
     * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
     * .build();
     * activity.grant(role, "states:SendTaskSuccess");
     * ```
     */
    public inline fun activity(
        scope: Construct,
        id: String,
        block: ActivityDsl.() -> Unit = {},
    ): Activity {
        val builder = ActivityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a new Step Functions Activity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * ActivityProps activityProps = ActivityProps.builder()
     * .activityName("activityName")
     * .build();
     * ```
     */
    public inline fun activityProps(block: ActivityPropsDsl.() -> Unit = {}): ActivityProps {
        val builder = ActivityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for selecting the choice paths.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * AfterwardsOptions afterwardsOptions = AfterwardsOptions.builder()
     * .includeErrorHandlers(false)
     * .includeOtherwise(false)
     * .build();
     * ```
     */
    public inline fun afterwardsOptions(
        block: AfterwardsOptionsDsl.() -> Unit = {}
    ): AfterwardsOptions {
        val builder = AfterwardsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Error handler details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CatchProps catchProps = CatchProps.builder()
     * .errors(List.of("errors"))
     * .resultPath("resultPath")
     * .build();
     * ```
     */
    public inline fun catchProps(block: CatchPropsDsl.() -> Unit = {}): CatchProps {
        val builder = CatchPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An activity is a task that you write in any programming language and host on any machine that
     * has access to AWS Step Functions .
     *
     * Activities must poll Step Functions using the `GetActivityTask` API action and respond using
     * `SendTask*` API actions. This function lets Step Functions know the existence of your
     * activity and returns an identifier for use in a state machine and when polling from the
     * activity.
     *
     * For information about creating an activity, see
     * [Creating an Activity State Machine](https://docs.aws.amazon.com/step-functions/latest/dg/tutorial-creating-activity-state-machine.html)
     * in the *AWS Step Functions Developer Guide* and
     * [CreateActivity](https://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateActivity.html)
     * in the *AWS Step Functions API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CfnActivity cfnActivity = CfnActivity.Builder.create(this, "MyCfnActivity")
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html)
     */
    public inline fun cfnActivity(
        scope: Construct,
        id: String,
        block: CfnActivityDsl.() -> Unit = {},
    ): CfnActivity {
        val builder = CfnActivityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnActivity`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CfnActivityProps cfnActivityProps = CfnActivityProps.builder()
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html)
     */
    public inline fun cfnActivityProps(
        block: CfnActivityPropsDsl.() -> Unit = {}
    ): CfnActivityProps {
        val builder = CfnActivityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `TagsEntry` property specifies *tags* to identify an activity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html)
     */
    public inline fun cfnActivityTagsEntryProperty(
        block: CfnActivityTagsEntryPropertyDsl.() -> Unit = {}
    ): CfnActivity.TagsEntryProperty {
        val builder = CfnActivityTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provisions a state machine.
     *
     * A state machine consists of a collection of states that can do work ( `Task` states),
     * determine to which states to transition next ( `Choice` states), stop an execution with an
     * error ( `Fail` states), and so on. State machines are specified using a JSON-based,
     * structured language.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object definition;
     * CfnStateMachine cfnStateMachine = CfnStateMachine.Builder.create(this, "MyCfnStateMachine")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .definition(definition)
     * .definitionS3Location(S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .definitionString("definitionString")
     * .definitionSubstitutions(Map.of(
     * "definitionSubstitutionsKey", "definitionSubstitutions"))
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .destinations(List.of(LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build()))
     * .includeExecutionData(false)
     * .level("level")
     * .build())
     * .stateMachineName("stateMachineName")
     * .stateMachineType("stateMachineType")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tracingConfiguration(TracingConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html)
     */
    public inline fun cfnStateMachine(
        scope: Construct,
        id: String,
        block: CfnStateMachineDsl.() -> Unit = {},
    ): CfnStateMachine {
        val builder = CfnStateMachineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a state machine
     * [alias](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html)
     * . An alias routes traffic to one or two versions of the same state machine.
     *
     * You can create up to 100 aliases for each state machine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CfnStateMachineAlias cfnStateMachineAlias = CfnStateMachineAlias.Builder.create(this,
     * "MyCfnStateMachineAlias")
     * .deploymentPreference(DeploymentPreferenceProperty.builder()
     * .stateMachineVersionArn("stateMachineVersionArn")
     * .type("type")
     * // the properties below are optional
     * .alarms(List.of("alarms"))
     * .interval(123)
     * .percentage(123)
     * .build())
     * .description("description")
     * .name("name")
     * .routingConfiguration(List.of(RoutingConfigurationVersionProperty.builder()
     * .stateMachineVersionArn("stateMachineVersionArn")
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html)
     */
    public inline fun cfnStateMachineAlias(
        scope: Construct,
        id: String,
        block: CfnStateMachineAliasDsl.() -> Unit = {},
    ): CfnStateMachineAlias {
        val builder = CfnStateMachineAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enables gradual state machine deployments.
     *
     * CloudFormation automatically shifts traffic from the version the alias currently points to,
     * to a new state machine version that you specify.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * DeploymentPreferenceProperty deploymentPreferenceProperty =
     * DeploymentPreferenceProperty.builder()
     * .stateMachineVersionArn("stateMachineVersionArn")
     * .type("type")
     * // the properties below are optional
     * .alarms(List.of("alarms"))
     * .interval(123)
     * .percentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html)
     */
    public inline fun cfnStateMachineAliasDeploymentPreferenceProperty(
        block: CfnStateMachineAliasDeploymentPreferencePropertyDsl.() -> Unit = {}
    ): CfnStateMachineAlias.DeploymentPreferenceProperty {
        val builder = CfnStateMachineAliasDeploymentPreferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStateMachineAlias`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CfnStateMachineAliasProps cfnStateMachineAliasProps = CfnStateMachineAliasProps.builder()
     * .deploymentPreference(DeploymentPreferenceProperty.builder()
     * .stateMachineVersionArn("stateMachineVersionArn")
     * .type("type")
     * // the properties below are optional
     * .alarms(List.of("alarms"))
     * .interval(123)
     * .percentage(123)
     * .build())
     * .description("description")
     * .name("name")
     * .routingConfiguration(List.of(RoutingConfigurationVersionProperty.builder()
     * .stateMachineVersionArn("stateMachineVersionArn")
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html)
     */
    public inline fun cfnStateMachineAliasProps(
        block: CfnStateMachineAliasPropsDsl.() -> Unit = {}
    ): CfnStateMachineAliasProps {
        val builder = CfnStateMachineAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The state machine version to which you want to route the execution traffic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * RoutingConfigurationVersionProperty routingConfigurationVersionProperty =
     * RoutingConfigurationVersionProperty.builder()
     * .stateMachineVersionArn("stateMachineVersionArn")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-routingconfigurationversion.html)
     */
    public inline fun cfnStateMachineAliasRoutingConfigurationVersionProperty(
        block: CfnStateMachineAliasRoutingConfigurationVersionPropertyDsl.() -> Unit = {}
    ): CfnStateMachineAlias.RoutingConfigurationVersionProperty {
        val builder = CfnStateMachineAliasRoutingConfigurationVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a CloudWatch log group.
     *
     * For more information see
     * [Standard Versus Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
     * in the AWS Step Functions Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CloudWatchLogsLogGroupProperty cloudWatchLogsLogGroupProperty =
     * CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-cloudwatchlogsloggroup.html)
     */
    public inline fun cfnStateMachineCloudWatchLogsLogGroupProperty(
        block: CfnStateMachineCloudWatchLogsLogGroupPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.CloudWatchLogsLogGroupProperty {
        val builder = CfnStateMachineCloudWatchLogsLogGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a destination for `LoggingConfiguration` .
     *
     * For more information on logging with `EXPRESS` workflows, see
     * [Logging Express Workflows Using CloudWatch Logs](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * LogDestinationProperty logDestinationProperty = LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination.html)
     */
    public inline fun cfnStateMachineLogDestinationProperty(
        block: CfnStateMachineLogDestinationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.LogDestinationProperty {
        val builder = CfnStateMachineLogDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Step Functions provides the log levels — `OFF` , `ALL` , `ERROR` , and `FATAL` . No event
     * types log when set to `OFF` and all event types do when set to `ALL` .
     *
     * By default, the `level` is set to `OFF` . For more information see
     * [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html)
     * in the AWS Step Functions User Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * LoggingConfigurationProperty loggingConfigurationProperty =
     * LoggingConfigurationProperty.builder()
     * .destinations(List.of(LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build()))
     * .includeExecutionData(false)
     * .level("level")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html)
     */
    public inline fun cfnStateMachineLoggingConfigurationProperty(
        block: CfnStateMachineLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.LoggingConfigurationProperty {
        val builder = CfnStateMachineLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStateMachine`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object definition;
     * CfnStateMachineProps cfnStateMachineProps = CfnStateMachineProps.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .definition(definition)
     * .definitionS3Location(S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .definitionString("definitionString")
     * .definitionSubstitutions(Map.of(
     * "definitionSubstitutionsKey", "definitionSubstitutions"))
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .destinations(List.of(LogDestinationProperty.builder()
     * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
     * .logGroupArn("logGroupArn")
     * .build())
     * .build()))
     * .includeExecutionData(false)
     * .level("level")
     * .build())
     * .stateMachineName("stateMachineName")
     * .stateMachineType("stateMachineType")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tracingConfiguration(TracingConfigurationProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html)
     */
    public inline fun cfnStateMachineProps(
        block: CfnStateMachinePropsDsl.() -> Unit = {}
    ): CfnStateMachineProps {
        val builder = CfnStateMachinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the S3 bucket location where a state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html)
     */
    public inline fun cfnStateMachineS3LocationProperty(
        block: CfnStateMachineS3LocationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.S3LocationProperty {
        val builder = CfnStateMachineS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `TagsEntry` property specifies *tags* to identify a state machine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tagsentry.html)
     */
    public inline fun cfnStateMachineTagsEntryProperty(
        block: CfnStateMachineTagsEntryPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.TagsEntryProperty {
        val builder = CfnStateMachineTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * To configure your state machine to send trace data to X-Ray, set `Enabled` to `true` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * TracingConfigurationProperty tracingConfigurationProperty =
     * TracingConfigurationProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tracingconfiguration.html)
     */
    public inline fun cfnStateMachineTracingConfigurationProperty(
        block: CfnStateMachineTracingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStateMachine.TracingConfigurationProperty {
        val builder = CfnStateMachineTracingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a state machine
     * [version](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html)
     * . A published version uses the latest state machine
     * [*revision*](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html)
     * . A revision is an immutable, read-only snapshot of a state machine’s definition and
     * configuration.
     *
     * You can publish up to 1000 versions for each state machine.
     *
     * Before you delete a version, make sure that version's ARN isn't being referenced in any
     * long-running workflows or application code outside of the stack.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CfnStateMachineVersion cfnStateMachineVersion = CfnStateMachineVersion.Builder.create(this,
     * "MyCfnStateMachineVersion")
     * .stateMachineArn("stateMachineArn")
     * // the properties below are optional
     * .description("description")
     * .stateMachineRevisionId("stateMachineRevisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
     */
    public inline fun cfnStateMachineVersion(
        scope: Construct,
        id: String,
        block: CfnStateMachineVersionDsl.() -> Unit = {},
    ): CfnStateMachineVersion {
        val builder = CfnStateMachineVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStateMachineVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * CfnStateMachineVersionProps cfnStateMachineVersionProps = CfnStateMachineVersionProps.builder()
     * .stateMachineArn("stateMachineArn")
     * // the properties below are optional
     * .description("description")
     * .stateMachineRevisionId("stateMachineRevisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
     */
    public inline fun cfnStateMachineVersionProps(
        block: CfnStateMachineVersionPropsDsl.() -> Unit = {}
    ): CfnStateMachineVersionProps {
        val builder = CfnStateMachineVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Choice in the state machine.
     *
     * A choice state can be used to make decisions based on the execution state.
     *
     * Example:
     * ```
     * Map map = Map.Builder.create(this, "Map State")
     * .maxConcurrency(1)
     * .itemsPath(JsonPath.stringAt("$.inputForMap"))
     * .itemSelector(Map.of(
     * "item", JsonPath.stringAt("$.Map.Item.Value")))
     * .resultPath("$.mapOutput")
     * .build();
     * // The Map iterator can contain a IChainable, which can be an individual or multiple steps
     * chained together.
     * // Below example is with a Choice and Pass step
     * Choice choice = new Choice(this, "Choice");
     * Condition condition1 = Condition.stringEquals("$.item.status", "SUCCESS");
     * Pass step1 = new Pass(this, "Step1");
     * Pass step2 = new Pass(this, "Step2");
     * Pass finish = new Pass(this, "Finish");
     * Chain definition = choice.when(condition1, step1).otherwise(step2).afterwards().next(finish);
     * map.itemProcessor(definition);
     * ```
     */
    public inline fun choice(
        scope: Construct,
        id: String,
        block: ChoiceDsl.() -> Unit = {},
    ): Choice {
        val builder = ChoiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Choice state.
     *
     * Example:
     * ```
     * Choice choice = Choice.Builder.create(this, "What color is it?")
     * .comment("color comment")
     * .build();
     * Pass handleBlueItem = new Pass(this, "HandleBlueItem");
     * Pass handleOtherItemColor = new Pass(this, "HanldeOtherItemColor");
     * choice.when(Condition.stringEquals("$.color", "BLUE"), handleBlueItem,
     * ChoiceTransitionOptions.builder()
     * .comment("blue item comment")
     * .build());
     * choice.otherwise(handleOtherItemColor);
     * ```
     */
    public inline fun choiceProps(block: ChoicePropsDsl.() -> Unit = {}): ChoiceProps {
        val builder = ChoicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for Choice Transition.
     *
     * Example:
     * ```
     * Choice choice = Choice.Builder.create(this, "What color is it?")
     * .comment("color comment")
     * .build();
     * Pass handleBlueItem = new Pass(this, "HandleBlueItem");
     * Pass handleOtherItemColor = new Pass(this, "HanldeOtherItemColor");
     * choice.when(Condition.stringEquals("$.color", "BLUE"), handleBlueItem,
     * ChoiceTransitionOptions.builder()
     * .comment("blue item comment")
     * .build());
     * choice.otherwise(handleOtherItemColor);
     * ```
     */
    public inline fun choiceTransitionOptions(
        block: ChoiceTransitionOptionsDsl.() -> Unit = {}
    ): ChoiceTransitionOptions {
        val builder = ChoiceTransitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a target role assumed by the State Machine's execution role for invoking the task's
     * resource.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function submitLambda;
     * Role iamRole;
     * // use a fixed role for all task invocations
     * TaskRole role = TaskRole.fromRole(iamRole);
     * // or use a json expression to resolve the role at runtime based on task inputs
     * //const role = sfn.TaskRole.fromRoleArnJsonPath('$.RoleArn');
     * LambdaInvoke submitJob = LambdaInvoke.Builder.create(this, "Submit Job")
     * .lambdaFunction(submitLambda)
     * .outputPath("$.Payload")
     * // use credentials
     * .credentials(Credentials.builder().role(role).build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-task-state.html#task-state-fields)
     */
    public inline fun credentials(block: CredentialsDsl.() -> Unit = {}): Credentials {
        val builder = CredentialsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * State defined by supplying Amazon States Language (ASL) in the state machine.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.dynamodb.*;
     * // create a table
     * Table table = Table.Builder.create(this, "montable")
     * .partitionKey(Attribute.builder()
     * .name("id")
     * .type(AttributeType.STRING)
     * .build())
     * .build();
     * Pass finalStatus = new Pass(this, "final step");
     * // States language JSON to put an item into DynamoDB
     * // snippet generated from
     * https://docs.aws.amazon.com/step-functions/latest/dg/tutorial-code-snippet.html#tutorial-code-snippet-1
     * Map&lt;String, Object&gt; stateJson = Map.of(
     * "Type", "Task",
     * "Resource", "arn:aws:states:::dynamodb:putItem",
     * "Parameters", Map.of(
     * "TableName", table.getTableName(),
     * "Item", Map.of(
     * "id", Map.of(
     * "S", "MyEntry"))),
     * "ResultPath", null);
     * // custom state which represents a task to insert data into DynamoDB
     * CustomState custom = CustomState.Builder.create(this, "my custom task")
     * .stateJson(stateJson)
     * .build();
     * // catch errors with addCatch
     * Pass errorHandler = new Pass(this, "handle failure");
     * custom.addCatch(errorHandler);
     * // retry the task if something goes wrong
     * custom.addRetry(RetryProps.builder()
     * .errors(List.of(Errors.ALL))
     * .interval(Duration.seconds(10))
     * .maxAttempts(5)
     * .build());
     * Chain chain = Chain.start(custom).next(finalStatus);
     * StateMachine sm = StateMachine.Builder.create(this, "StateMachine")
     * .definitionBody(DefinitionBody.fromChainable(chain))
     * .timeout(Duration.seconds(30))
     * .comment("a super cool state machine")
     * .build();
     * // don't forget permissions. You need to assign them
     * table.grantWriteData(sm);
     * ```
     */
    public inline fun customState(
        scope: Construct,
        id: String,
        block: CustomStateDsl.() -> Unit = {},
    ): CustomState {
        val builder = CustomStateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a custom state definition.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.dynamodb.*;
     * // create a table
     * Table table = Table.Builder.create(this, "montable")
     * .partitionKey(Attribute.builder()
     * .name("id")
     * .type(AttributeType.STRING)
     * .build())
     * .build();
     * Pass finalStatus = new Pass(this, "final step");
     * // States language JSON to put an item into DynamoDB
     * // snippet generated from
     * https://docs.aws.amazon.com/step-functions/latest/dg/tutorial-code-snippet.html#tutorial-code-snippet-1
     * Map&lt;String, Object&gt; stateJson = Map.of(
     * "Type", "Task",
     * "Resource", "arn:aws:states:::dynamodb:putItem",
     * "Parameters", Map.of(
     * "TableName", table.getTableName(),
     * "Item", Map.of(
     * "id", Map.of(
     * "S", "MyEntry"))),
     * "ResultPath", null);
     * // custom state which represents a task to insert data into DynamoDB
     * CustomState custom = CustomState.Builder.create(this, "my custom task")
     * .stateJson(stateJson)
     * .build();
     * // catch errors with addCatch
     * Pass errorHandler = new Pass(this, "handle failure");
     * custom.addCatch(errorHandler);
     * // retry the task if something goes wrong
     * custom.addRetry(RetryProps.builder()
     * .errors(List.of(Errors.ALL))
     * .interval(Duration.seconds(10))
     * .maxAttempts(5)
     * .build());
     * Chain chain = Chain.start(custom).next(finalStatus);
     * StateMachine sm = StateMachine.Builder.create(this, "StateMachine")
     * .definitionBody(DefinitionBody.fromChainable(chain))
     * .timeout(Duration.seconds(30))
     * .comment("a super cool state machine")
     * .build();
     * // don't forget permissions. You need to assign them
     * table.grantWriteData(sm);
     * ```
     */
    public inline fun customStateProps(
        block: CustomStatePropsDsl.() -> Unit = {}
    ): CustomStateProps {
        val builder = CustomStatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Partial object from the StateMachine L1 construct properties containing definition
     * information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object definition;
     * DefinitionConfig definitionConfig = DefinitionConfig.builder()
     * .definition(definition)
     * .definitionS3Location(S3LocationProperty.builder()
     * .bucket("bucket")
     * .key("key")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .definitionString("definitionString")
     * .build();
     * ```
     */
    public inline fun definitionConfig(
        block: DefinitionConfigDsl.() -> Unit = {}
    ): DefinitionConfig {
        val builder = DefinitionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Distributed Mode Map state in the state machine.
     *
     * A `Map` state can be used to run a set of steps for each element of an input array. A Map
     * state will execute the same steps for multiple entries of an array in the state input.
     *
     * While the Parallel state executes multiple branches of steps using the same input, a Map
     * state will execute the same steps for multiple entries of an array in the state input.
     *
     * A `Map` state in `Distributed` mode will execute a child workflow for each iteration of the
     * Map state. This serves to increase concurrency and allows for larger workloads to be run in a
     * single state machine.
     *
     * Example:
     * ```
     * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
     * .maxConcurrency(1)
     * .itemsPath(JsonPath.stringAt("$.inputForMap"))
     * .build();
     * distributedMap.itemProcessor(new Pass(this, "Pass State"));
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-distributed.html)
     */
    public inline fun distributedMap(
        scope: Construct,
        id: String,
        block: DistributedMapDsl.() -> Unit = {},
    ): DistributedMap {
        val builder = DistributedMapDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for configuring a Distribute Map state.
     *
     * Example:
     * ```
     * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
     * .maxConcurrency(1)
     * .itemsPath(JsonPath.stringAt("$.inputForMap"))
     * .build();
     * distributedMap.itemProcessor(new Pass(this, "Pass State"));
     * ```
     */
    public inline fun distributedMapProps(
        block: DistributedMapPropsDsl.() -> Unit = {}
    ): DistributedMapProps {
        val builder = DistributedMapPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Fail state in the state machine.
     *
     * Reaching a Fail state terminates the state execution in failure.
     *
     * Example:
     * ```
     * Fail fail = Fail.Builder.create(this, "Fail")
     * .errorPath(JsonPath.stringAt("$.someError"))
     * .causePath(JsonPath.stringAt("$.someCause"))
     * .build();
     * ```
     */
    public inline fun fail(
        scope: Construct,
        id: String,
        block: FailDsl.() -> Unit = {},
    ): Fail {
        val builder = FailDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Fail state.
     *
     * Example:
     * ```
     * Fail fail = Fail.Builder.create(this, "Fail")
     * .errorPath(JsonPath.stringAt("$.someError"))
     * .causePath(JsonPath.stringAt("$.someCause"))
     * .build();
     * ```
     */
    public inline fun failProps(block: FailPropsDsl.() -> Unit = {}): FailProps {
        val builder = FailPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * IChainable chainable;
     * DefinitionBody fileDefinitionBody = FileDefinitionBody.fromChainable(chainable);
     * ```
     */
    public inline fun fileDefinitionBody(
        path: String,
        block: FileDefinitionBodyDsl.() -> Unit = {}
    ): FileDefinitionBody {
        val builder = FileDefinitionBodyDsl(path)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for finding reachable states.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * FindStateOptions findStateOptions = FindStateOptions.builder()
     * .includeErrorHandlers(false)
     * .build();
     * ```
     */
    public inline fun findStateOptions(
        block: FindStateOptionsDsl.() -> Unit = {}
    ): FindStateOptions {
        val builder = FindStateOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for processing a group of items in a single child workflow execution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object batchInput;
     * ItemBatcher itemBatcher = ItemBatcher.Builder.create()
     * .batchInput(batchInput)
     * .maxInputBytesPerBatch(123)
     * .maxInputBytesPerBatchPath("maxInputBytesPerBatchPath")
     * .maxItemsPerBatch(123)
     * .maxItemsPerBatchPath("maxItemsPerBatchPath")
     * .build();
     * ```
     */
    public inline fun itemBatcher(block: ItemBatcherDsl.() -> Unit = {}): ItemBatcher {
        val builder = ItemBatcherDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for ItemBatcher configuration properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object batchInput;
     * ItemBatcherProps itemBatcherProps = ItemBatcherProps.builder()
     * .batchInput(batchInput)
     * .maxInputBytesPerBatch(123)
     * .maxInputBytesPerBatchPath("maxInputBytesPerBatchPath")
     * .maxItemsPerBatch(123)
     * .maxItemsPerBatchPath("maxItemsPerBatchPath")
     * .build();
     * ```
     */
    public inline fun itemBatcherProps(
        block: ItemBatcherPropsDsl.() -> Unit = {}
    ): ItemBatcherProps {
        val builder = ItemBatcherPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base interface for Item Reader configuration properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Bucket bucket;
     * ItemReaderProps itemReaderProps = ItemReaderProps.builder()
     * .bucket(bucket)
     * // the properties below are optional
     * .maxItems(123)
     * .build();
     * ```
     */
    public inline fun itemReaderProps(block: ItemReaderPropsDsl.() -> Unit = {}): ItemReaderProps {
        val builder = ItemReaderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.logs.*;
     * LogGroup logGroup = new LogGroup(this, "MyLogGroup");
     * Chain definition = Chain.start(new Pass(this, "Pass"));
     * StateMachine.Builder.create(this, "MyStateMachine")
     * .definitionBody(DefinitionBody.fromChainable(definition))
     * .logs(LogOptions.builder()
     * .destination(logGroup)
     * .level(LogLevel.ALL)
     * .build())
     * .build();
     * ```
     */
    public inline fun logOptions(block: LogOptionsDsl.() -> Unit = {}): LogOptions {
        val builder = LogOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Map state in the state machine.
     *
     * A `Map` state can be used to run a set of steps for each element of an input array. A Map
     * state will execute the same steps for multiple entries of an array in the state input.
     *
     * While the Parallel state executes multiple branches of steps using the same input, a Map
     * state will execute the same steps for multiple entries of an array in the state input.
     *
     * Example:
     * ```
     * Map map = Map.Builder.create(this, "Map State")
     * .maxConcurrency(1)
     * .itemsPath(JsonPath.stringAt("$.inputForMap"))
     * .itemSelector(Map.of(
     * "item", JsonPath.stringAt("$.Map.Item.Value")))
     * .resultPath("$.mapOutput")
     * .build();
     * // The Map iterator can contain a IChainable, which can be an individual or multiple steps
     * chained together.
     * // Below example is with a Choice and Pass step
     * Choice choice = new Choice(this, "Choice");
     * Condition condition1 = Condition.stringEquals("$.item.status", "SUCCESS");
     * Pass step1 = new Pass(this, "Step1");
     * Pass step2 = new Pass(this, "Step2");
     * Pass finish = new Pass(this, "Finish");
     * Chain definition = choice.when(condition1, step1).otherwise(step2).afterwards().next(finish);
     * map.itemProcessor(definition);
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-map-state.html)
     */
    public inline fun map(
        scope: Construct,
        id: String,
        block: MapDsl.() -> Unit = {},
    ): Map {
        val builder = MapDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Map state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object itemSelector;
     * Object resultSelector;
     * MapBaseProps mapBaseProps = MapBaseProps.builder()
     * .comment("comment")
     * .inputPath("inputPath")
     * .itemSelector(Map.of(
     * "itemSelectorKey", itemSelector))
     * .itemsPath("itemsPath")
     * .maxConcurrency(123)
     * .outputPath("outputPath")
     * .resultPath("resultPath")
     * .resultSelector(Map.of(
     * "resultSelectorKey", resultSelector))
     * .stateName("stateName")
     * .build();
     * ```
     */
    public inline fun mapBaseProps(block: MapBasePropsDsl.() -> Unit = {}): MapBaseProps {
        val builder = MapBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Map state.
     *
     * Example:
     * ```
     * Map map = Map.Builder.create(this, "Map State")
     * .maxConcurrency(1)
     * .itemsPath(JsonPath.stringAt("$.inputForMap"))
     * .itemSelector(Map.of(
     * "item", JsonPath.stringAt("$.Map.Item.Value")))
     * .resultPath("$.mapOutput")
     * .build();
     * // The Map iterator can contain a IChainable, which can be an individual or multiple steps
     * chained together.
     * // Below example is with a Choice and Pass step
     * Choice choice = new Choice(this, "Choice");
     * Condition condition1 = Condition.stringEquals("$.item.status", "SUCCESS");
     * Pass step1 = new Pass(this, "Step1");
     * Pass step2 = new Pass(this, "Step2");
     * Pass finish = new Pass(this, "Finish");
     * Chain definition = choice.when(condition1, step1).otherwise(step2).afterwards().next(finish);
     * map.itemProcessor(definition);
     * ```
     */
    public inline fun mapProps(block: MapPropsDsl.() -> Unit = {}): MapProps {
        val builder = MapPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Parallel state in the state machine.
     *
     * A Parallel state can be used to run one or more state machines at the same time.
     *
     * The Result of a Parallel state is an array of the results of its substatemachines.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.Stack;
     * import software.constructs.Construct;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * public class MyJobProps {
     * private String jobFlavor;
     * public String getJobFlavor() {
     * return this.jobFlavor;
     * }
     * public MyJobProps jobFlavor(String jobFlavor) {
     * this.jobFlavor = jobFlavor;
     * return this;
     * }
     * }
     * public class MyJob extends StateMachineFragment {
     * public final State startState;
     * public final INextable[] endStates;
     * public MyJob(Construct parent, String id, MyJobProps props) {
     * super(parent, id);
     * Choice choice = new Choice(this, "Choice").when(Condition.stringEquals("$.branch", "left"), new
     * Pass(this, "Left Branch")).when(Condition.stringEquals("$.branch", "right"), new Pass(this, "Right
     * Branch"));
     * // ...
     * this.startState = choice;
     * this.endStates = choice.afterwards().getEndStates();
     * }
     * }
     * public class MyStack extends Stack {
     * public MyStack(Construct scope, String id) {
     * super(scope, id);
     * // Do 3 different variants of MyJob in parallel
     * Parallel parallel = new Parallel(this, "All jobs").branch(new MyJob(this, "Quick", new
     * MyJobProps().jobFlavor("quick")).prefixStates()).branch(new MyJob(this, "Medium", new
     * MyJobProps().jobFlavor("medium")).prefixStates()).branch(new MyJob(this, "Slow", new
     * MyJobProps().jobFlavor("slow")).prefixStates());
     * StateMachine.Builder.create(this, "MyStateMachine")
     * .definitionBody(DefinitionBody.fromChainable(parallel))
     * .build();
     * }
     * }
     * ```
     */
    public inline fun parallel(
        scope: Construct,
        id: String,
        block: ParallelDsl.() -> Unit = {},
    ): Parallel {
        val builder = ParallelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Parallel state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object resultSelector;
     * ParallelProps parallelProps = ParallelProps.builder()
     * .comment("comment")
     * .inputPath("inputPath")
     * .outputPath("outputPath")
     * .resultPath("resultPath")
     * .resultSelector(Map.of(
     * "resultSelectorKey", resultSelector))
     * .stateName("stateName")
     * .build();
     * ```
     */
    public inline fun parallelProps(block: ParallelPropsDsl.() -> Unit = {}): ParallelProps {
        val builder = ParallelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Pass in the state machine.
     *
     * A Pass state can be used to transform the current execution's state.
     *
     * Example:
     * ```
     * Choice choice = new Choice(this, "Did it work?");
     * // Add conditions with .when()
     * Pass successState = new Pass(this, "SuccessState");
     * Pass failureState = new Pass(this, "FailureState");
     * choice.when(Condition.stringEquals("$.status", "SUCCESS"), successState);
     * choice.when(Condition.numberGreaterThan("$.attempts", 5), failureState);
     * // Use .otherwise() to indicate what should be done if none of the conditions match
     * Pass tryAgainState = new Pass(this, "TryAgainState");
     * choice.otherwise(tryAgainState);
     * ```
     */
    public inline fun pass(
        scope: Construct,
        id: String,
        block: PassDsl.() -> Unit = {},
    ): Pass {
        val builder = PassDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Pass state.
     *
     * Example:
     * ```
     * // Makes the current JSON state { ..., "subObject": { "hello": "world" } }
     * Pass pass = Pass.Builder.create(this, "Add Hello World")
     * .result(Result.fromObject(Map.of("hello", "world")))
     * .resultPath("$.subObject")
     * .build();
     * // Set the next state
     * Pass nextState = new Pass(this, "NextState");
     * pass.next(nextState);
     * ```
     */
    public inline fun passProps(block: PassPropsDsl.() -> Unit = {}): PassProps {
        val builder = PassPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration for the processor Map state.
     *
     * Example:
     * ```
     * Map map = Map.Builder.create(this, "Map State")
     * .maxConcurrency(1)
     * .itemsPath(JsonPath.stringAt("$.inputForMap"))
     * .itemSelector(Map.of(
     * "item", JsonPath.stringAt("$.Map.Item.Value")))
     * .resultPath("$.mapOutput")
     * .build();
     * map.itemProcessor(new Pass(this, "Pass State"), ProcessorConfig.builder()
     * .mode(ProcessorMode.DISTRIBUTED)
     * .executionType(ProcessorType.STANDARD)
     * .build());
     * ```
     */
    public inline fun processorConfig(block: ProcessorConfigDsl.() -> Unit = {}): ProcessorConfig {
        val builder = ProcessorConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for writing Distributed Map state results to S3.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * // create a bucket
     * Bucket bucket = new Bucket(this, "Bucket");
     * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
     * .itemReader(S3JsonItemReader.Builder.create()
     * .bucket(bucket)
     * .key("my-key.json")
     * .build())
     * .resultWriter(ResultWriter.Builder.create()
     * .bucket(bucket)
     * .prefix("my-prefix")
     * .build())
     * .build();
     * distributedMap.itemProcessor(new Pass(this, "Pass State"));
     * ```
     */
    public inline fun resultWriter(block: ResultWriterDsl.() -> Unit = {}): ResultWriter {
        val builder = ResultWriterDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for Result Writer configuration properties.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * // create a bucket
     * Bucket bucket = new Bucket(this, "Bucket");
     * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
     * .itemReader(S3JsonItemReader.Builder.create()
     * .bucket(bucket)
     * .key("my-key.json")
     * .build())
     * .resultWriter(ResultWriter.Builder.create()
     * .bucket(bucket)
     * .prefix("my-prefix")
     * .build())
     * .build();
     * distributedMap.itemProcessor(new Pass(this, "Pass State"));
     * ```
     */
    public inline fun resultWriterProps(
        block: ResultWriterPropsDsl.() -> Unit = {}
    ): ResultWriterProps {
        val builder = ResultWriterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Retry details.
     *
     * Example:
     * ```
     * Parallel parallel = new Parallel(this, "Do the work in parallel");
     * // Add branches to be executed in parallel
     * Pass shipItem = new Pass(this, "ShipItem");
     * Pass sendInvoice = new Pass(this, "SendInvoice");
     * Pass restock = new Pass(this, "Restock");
     * parallel.branch(shipItem);
     * parallel.branch(sendInvoice);
     * parallel.branch(restock);
     * // Retry the whole workflow if something goes wrong with exponential backoff
     * parallel.addRetry(RetryProps.builder()
     * .maxAttempts(1)
     * .maxDelay(Duration.seconds(5))
     * .jitterStrategy(JitterType.FULL)
     * .build());
     * // How to recover from errors
     * Pass sendFailureNotification = new Pass(this, "SendFailureNotification");
     * parallel.addCatch(sendFailureNotification);
     * // What to do in case everything succeeded
     * Pass closeOrder = new Pass(this, "CloseOrder");
     * parallel.next(closeOrder);
     * ```
     */
    public inline fun retryProps(block: RetryPropsDsl.() -> Unit = {}): RetryProps {
        val builder = RetryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Item Reader configuration for iterating over items in a CSV file stored in S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Bucket bucket;
     * CsvHeaders csvHeaders;
     * S3CsvItemReader s3CsvItemReader = S3CsvItemReader.Builder.create()
     * .bucket(bucket)
     * .key("key")
     * // the properties below are optional
     * .csvHeaders(csvHeaders)
     * .maxItems(123)
     * .build();
     * ```
     */
    public inline fun s3CsvItemReader(block: S3CsvItemReaderDsl.() -> Unit = {}): S3CsvItemReader {
        val builder = S3CsvItemReaderDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for configuring an Item Reader that iterates over items in a CSV file in S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Bucket bucket;
     * CsvHeaders csvHeaders;
     * S3CsvItemReaderProps s3CsvItemReaderProps = S3CsvItemReaderProps.builder()
     * .bucket(bucket)
     * .key("key")
     * // the properties below are optional
     * .csvHeaders(csvHeaders)
     * .maxItems(123)
     * .build();
     * ```
     */
    public inline fun s3CsvItemReaderProps(
        block: S3CsvItemReaderPropsDsl.() -> Unit = {}
    ): S3CsvItemReaderProps {
        val builder = S3CsvItemReaderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base interface for Item Reader configuration properties the iterate over entries in a S3
     * file.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * // create a bucket
     * Bucket bucket = new Bucket(this, "Bucket");
     * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
     * .itemReader(S3JsonItemReader.Builder.create()
     * .bucket(bucket)
     * .key("my-key.json")
     * .build())
     * .resultWriter(ResultWriter.Builder.create()
     * .bucket(bucket)
     * .prefix("my-prefix")
     * .build())
     * .build();
     * distributedMap.itemProcessor(new Pass(this, "Pass State"));
     * ```
     */
    public inline fun s3FileItemReaderProps(
        block: S3FileItemReaderPropsDsl.() -> Unit = {}
    ): S3FileItemReaderProps {
        val builder = S3FileItemReaderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Item Reader configuration for iterating over items in a JSON array stored in a S3 file.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * // create a bucket
     * Bucket bucket = new Bucket(this, "Bucket");
     * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
     * .itemReader(S3JsonItemReader.Builder.create()
     * .bucket(bucket)
     * .key("my-key.json")
     * .build())
     * .resultWriter(ResultWriter.Builder.create()
     * .bucket(bucket)
     * .prefix("my-prefix")
     * .build())
     * .build();
     * distributedMap.itemProcessor(new Pass(this, "Pass State"));
     * ```
     */
    public inline fun s3JsonItemReader(
        block: S3JsonItemReaderDsl.() -> Unit = {}
    ): S3JsonItemReader {
        val builder = S3JsonItemReaderDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Item Reader configuration for iterating over items in a S3 inventory manifest file stored in
     * S3.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Bucket bucket;
     * S3ManifestItemReader s3ManifestItemReader = S3ManifestItemReader.Builder.create()
     * .bucket(bucket)
     * .key("key")
     * // the properties below are optional
     * .maxItems(123)
     * .build();
     * ```
     */
    public inline fun s3ManifestItemReader(
        block: S3ManifestItemReaderDsl.() -> Unit = {}
    ): S3ManifestItemReader {
        val builder = S3ManifestItemReaderDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Item Reader configuration for iterating over objects in an S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Bucket bucket;
     * S3ObjectsItemReader s3ObjectsItemReader = S3ObjectsItemReader.Builder.create()
     * .bucket(bucket)
     * // the properties below are optional
     * .maxItems(123)
     * .prefix("prefix")
     * .build();
     * ```
     */
    public inline fun s3ObjectsItemReader(
        block: S3ObjectsItemReaderDsl.() -> Unit = {}
    ): S3ObjectsItemReader {
        val builder = S3ObjectsItemReaderDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for configuring an Item Reader that iterates over objects in an S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Bucket bucket;
     * S3ObjectsItemReaderProps s3ObjectsItemReaderProps = S3ObjectsItemReaderProps.builder()
     * .bucket(bucket)
     * // the properties below are optional
     * .maxItems(123)
     * .prefix("prefix")
     * .build();
     * ```
     */
    public inline fun s3ObjectsItemReaderProps(
        block: S3ObjectsItemReaderPropsDsl.() -> Unit = {}
    ): S3ObjectsItemReaderProps {
        val builder = S3ObjectsItemReaderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating a single state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object resultSelector;
     * SingleStateOptions singleStateOptions = SingleStateOptions.builder()
     * .comment("comment")
     * .inputPath("inputPath")
     * .outputPath("outputPath")
     * .prefixStates("prefixStates")
     * .resultPath("resultPath")
     * .resultSelector(Map.of(
     * "resultSelectorKey", resultSelector))
     * .stateId("stateId")
     * .stateName("stateName")
     * .build();
     * ```
     */
    public inline fun singleStateOptions(
        block: SingleStateOptionsDsl.() -> Unit = {}
    ): SingleStateOptions {
        val builder = SingleStateOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a StepFunctions State Machine.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact inputArtifact = new Artifact();
     * Pass startState = new Pass(this, "StartState");
     * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
     * .definition(startState)
     * .build();
     * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
     * .actionName("Invoke")
     * .stateMachine(simpleStateMachine)
     * .stateMachineInput(StateMachineInput.filePath(inputArtifact.atPath("assets/input.json")))
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("StepFunctions")
     * .actions(List.of(stepFunctionAction))
     * .build());
     * ```
     */
    public inline fun stateMachine(
        scope: Construct,
        id: String,
        block: StateMachineDsl.() -> Unit = {},
    ): StateMachine {
        val builder = StateMachineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a State Machine.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * Artifact inputArtifact = new Artifact();
     * Pass startState = new Pass(this, "StartState");
     * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
     * .definition(startState)
     * .build();
     * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
     * .actionName("Invoke")
     * .stateMachine(simpleStateMachine)
     * .stateMachineInput(StateMachineInput.filePath(inputArtifact.atPath("assets/input.json")))
     * .build();
     * pipeline.addStage(StageOptions.builder()
     * .stageName("StepFunctions")
     * .actions(List.of(stepFunctionAction))
     * .build());
     * ```
     */
    public inline fun stateMachineProps(
        block: StateMachinePropsDsl.() -> Unit = {}
    ): StateMachineProps {
        val builder = StateMachinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties shared by all states.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object parameters;
     * Object resultSelector;
     * StateProps stateProps = StateProps.builder()
     * .comment("comment")
     * .inputPath("inputPath")
     * .outputPath("outputPath")
     * .parameters(Map.of(
     * "parametersKey", parameters))
     * .resultPath("resultPath")
     * .resultSelector(Map.of(
     * "resultSelectorKey", resultSelector))
     * .stateName("stateName")
     * .build();
     * ```
     */
    public inline fun stateProps(block: StatePropsDsl.() -> Unit = {}): StateProps {
        val builder = StatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Succeed state in the state machine.
     *
     * Reaching a Succeed state terminates the state execution in success.
     *
     * Example:
     * ```
     * Succeed success = new Succeed(this, "We did it!");
     * ```
     */
    public inline fun succeed(
        scope: Construct,
        id: String,
        block: SucceedDsl.() -> Unit = {},
    ): Succeed {
        val builder = SucceedDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Succeed state.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * SucceedProps succeedProps = SucceedProps.builder()
     * .comment("comment")
     * .inputPath("inputPath")
     * .outputPath("outputPath")
     * .stateName("stateName")
     * .build();
     * ```
     */
    public inline fun succeedProps(block: SucceedPropsDsl.() -> Unit = {}): SucceedProps {
        val builder = SucceedPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Task Metrics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object metricDimensions;
     * TaskMetricsConfig taskMetricsConfig = TaskMetricsConfig.builder()
     * .metricDimensions(Map.of(
     * "metricDimensionsKey", metricDimensions))
     * .metricPrefixPlural("metricPrefixPlural")
     * .metricPrefixSingular("metricPrefixSingular")
     * .build();
     * ```
     */
    public inline fun taskMetricsConfig(
        block: TaskMetricsConfigDsl.() -> Unit = {}
    ): TaskMetricsConfig {
        val builder = TaskMetricsConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props that are common to all tasks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * Object resultSelector;
     * TaskRole taskRole;
     * Timeout timeout;
     * TaskStateBaseProps taskStateBaseProps = TaskStateBaseProps.builder()
     * .comment("comment")
     * .credentials(Credentials.builder()
     * .role(taskRole)
     * .build())
     * .heartbeat(Duration.minutes(30))
     * .heartbeatTimeout(timeout)
     * .inputPath("inputPath")
     * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
     * .outputPath("outputPath")
     * .resultPath("resultPath")
     * .resultSelector(Map.of(
     * "resultSelectorKey", resultSelector))
     * .stateName("stateName")
     * .taskTimeout(timeout)
     * .timeout(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun taskStateBaseProps(
        block: TaskStateBasePropsDsl.() -> Unit = {}
    ): TaskStateBaseProps {
        val builder = TaskStateBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Wait state in the state machine.
     *
     * A Wait state can be used to delay execution of the state machine for a while.
     *
     * Example:
     * ```
     * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
     * seconds")
     * .expression("$.waitMilliseconds / 1000")
     * .resultPath("$.waitSeconds")
     * .build();
     * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
     * // Note: this is a string inside a string.
     * .expression("`Now waiting ${$.waitSeconds} seconds...`")
     * .runtime(Runtime.NODEJS_LATEST)
     * .resultPath("$.message")
     * .build();
     * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
     * .topic(new Topic(this, "cool-topic"))
     * .message(TaskInput.fromJsonPathAt("$.message"))
     * .resultPath("$.sns")
     * .build();
     * Wait wait = Wait.Builder.create(this, "Wait")
     * .time(WaitTime.secondsPath("$.waitSeconds"))
     * .build();
     * StateMachine.Builder.create(this, "StateMachine")
     * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
     * .build();
     * ```
     */
    public inline fun wait(
        scope: Construct,
        id: String,
        block: WaitDsl.() -> Unit = {},
    ): Wait {
        val builder = WaitDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a Wait state.
     *
     * Example:
     * ```
     * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
     * seconds")
     * .expression("$.waitMilliseconds / 1000")
     * .resultPath("$.waitSeconds")
     * .build();
     * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
     * // Note: this is a string inside a string.
     * .expression("`Now waiting ${$.waitSeconds} seconds...`")
     * .runtime(Runtime.NODEJS_LATEST)
     * .resultPath("$.message")
     * .build();
     * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
     * .topic(new Topic(this, "cool-topic"))
     * .message(TaskInput.fromJsonPathAt("$.message"))
     * .resultPath("$.sns")
     * .build();
     * Wait wait = Wait.Builder.create(this, "Wait")
     * .time(WaitTime.secondsPath("$.waitSeconds"))
     * .build();
     * StateMachine.Builder.create(this, "StateMachine")
     * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
     * .build();
     * ```
     */
    public inline fun waitProps(block: WaitPropsDsl.() -> Unit = {}): WaitProps {
        val builder = WaitPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
