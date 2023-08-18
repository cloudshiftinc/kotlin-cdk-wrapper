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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.constructs.Construct

/**
 * Provisions a state machine.
 *
 * A state machine consists of a collection of states that can do work ( `Task` states), determine
 * to which states to transition next ( `Choice` states), stop an execution with an error ( `Fail`
 * states), and so on. State machines are specified using a JSON-based, structured language.
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
@CdkDslMarker
public class CfnStateMachineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStateMachine.Builder = CfnStateMachine.Builder.create(scope, id)

    private val _tags: MutableList<CfnStateMachine.TagsEntryProperty> = mutableListOf()

    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON or YAML, and the format of the object must match
     * the format of your CloudFormation template file. See
     * [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definition)
     *
     * @param definition The Amazon States Language definition of the state machine.
     */
    public fun definition(definition: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(definition)
        cdkBuilder.definition(builder.map)
    }

    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON or YAML, and the format of the object must match
     * the format of your CloudFormation template file. See
     * [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definition)
     *
     * @param definition The Amazon States Language definition of the state machine.
     */
    public fun definition(definition: Any) {
        cdkBuilder.definition(definition)
    }

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     *
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     *   stored.
     */
    public fun definitionS3Location(definitionS3Location: IResolvable) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     *
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     *   stored.
     */
    public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON. See
     * [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
     *
     * @param definitionString The Amazon States Language definition of the state machine.
     */
    public fun definitionString(definitionString: String) {
        cdkBuilder.definitionString(definitionString)
    }

    /**
     * A map (string to string) that specifies the mappings for placeholder variables in the state
     * machine definition.
     *
     * This enables the customer to inject values obtained at runtime, for example from intrinsic
     * functions, in the state machine definition. Variables can be template parameter names,
     * resource logical IDs, resource attributes, or a variable in a key-value map.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionsubstitutions)
     *
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     *   placeholder variables in the state machine definition.
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
        cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * A map (string to string) that specifies the mappings for placeholder variables in the state
     * machine definition.
     *
     * This enables the customer to inject values obtained at runtime, for example from intrinsic
     * functions, in the state machine definition. Variables can be template parameter names,
     * resource logical IDs, resource attributes, or a variable in a key-value map.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionsubstitutions)
     *
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     *   placeholder variables in the state machine definition.
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
        cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see
     * [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html)
     * in the AWS Step Functions User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-loggingconfiguration)
     *
     * @param loggingConfiguration Defines what execution history events are logged and where they
     *   are logged.
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see
     * [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html)
     * in the AWS Step Functions User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-loggingconfiguration)
     *
     * @param loggingConfiguration Defines what execution history events are logged and where they
     *   are logged.
     */
    public fun loggingConfiguration(
        loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty
    ) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The name of the state machine.
     *
     * A name must *not* contain:
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename)
     *
     * @param stateMachineName The name of the state machine.
     */
    public fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
    }

    /**
     * Determines whether a `STANDARD` or `EXPRESS` state machine is created.
     *
     * The default is `STANDARD` . You cannot update the `type` of a state machine once it has been
     * created. For more information on `STANDARD` and `EXPRESS` workflows, see
     * [Standard Versus Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
     * in the AWS Step Functions Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinetype)
     *
     * @param stateMachineType Determines whether a `STANDARD` or `EXPRESS` state machine is
     *   created.
     */
    public fun stateMachineType(stateMachineType: String) {
        cdkBuilder.stateMachineType(stateMachineType)
    }

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
     *
     * @param tags The list of tags to add to a resource.
     */
    public fun tags(tags: CfnStateMachineTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnStateMachineTagsEntryPropertyDsl().apply(tags).build())
    }

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
     *
     * @param tags The list of tags to add to a resource.
     */
    public fun tags(tags: Collection<CfnStateMachine.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     *
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     *   enabled.
     */
    public fun tracingConfiguration(tracingConfiguration: IResolvable) {
        cdkBuilder.tracingConfiguration(tracingConfiguration)
    }

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     *
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     *   enabled.
     */
    public fun tracingConfiguration(
        tracingConfiguration: CfnStateMachine.TracingConfigurationProperty
    ) {
        cdkBuilder.tracingConfiguration(tracingConfiguration)
    }

    public fun build(): CfnStateMachine {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
