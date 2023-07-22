@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps

@CdkDslMarker
public class CfnStateMachinePropsDsl {
  private val cdkBuilder: CfnStateMachineProps.Builder = CfnStateMachineProps.builder()

  private val _tags: MutableList<CfnStateMachine.TagsEntryProperty> = mutableListOf()

  /**
   * @param definition The Amazon States Language definition of the state machine.
   * The state machine definition must be in JSON or YAML, and the format of the object must match
   * the format of your CloudFormation template file. See [Amazon States
   * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
   * .
   */
  public fun definition(definition: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(definition)
    cdkBuilder.definition(builder.map)
  }

  /**
   * @param definition The Amazon States Language definition of the state machine.
   * The state machine definition must be in JSON or YAML, and the format of the object must match
   * the format of your CloudFormation template file. See [Amazon States
   * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
   * .
   */
  public fun definition(definition: Any) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param definitionS3Location The name of the S3 bucket where the state machine definition is
   * stored.
   * The state machine definition must be a JSON or YAML file.
   */
  public fun definitionS3Location(definitionS3Location: IResolvable) {
    cdkBuilder.definitionS3Location(definitionS3Location)
  }

  /**
   * @param definitionS3Location The name of the S3 bucket where the state machine definition is
   * stored.
   * The state machine definition must be a JSON or YAML file.
   */
  public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
    cdkBuilder.definitionS3Location(definitionS3Location)
  }

  /**
   * @param definitionString The Amazon States Language definition of the state machine.
   * The state machine definition must be in JSON. See [Amazon States
   * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
   * .
   */
  public fun definitionString(definitionString: String) {
    cdkBuilder.definitionString(definitionString)
  }

  /**
   * @param definitionSubstitutions A map (string to string) that specifies the mappings for
   * placeholder variables in the state machine definition.
   * This enables the customer to inject values obtained at runtime, for example from intrinsic
   * functions, in the state machine definition. Variables can be template parameter names, resource
   * logical IDs, resource attributes, or a variable in a key-value map.
   *
   * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
   */
  public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  /**
   * @param definitionSubstitutions A map (string to string) that specifies the mappings for
   * placeholder variables in the state machine definition.
   * This enables the customer to inject values obtained at runtime, for example from intrinsic
   * functions, in the state machine definition. Variables can be template parameter names, resource
   * logical IDs, resource attributes, or a variable in a key-value map.
   *
   * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
   */
  public fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  /**
   * @param loggingConfiguration Defines what execution history events are logged and where they are
   * logged.
   *
   * By default, the `level` is set to `OFF` . For more information see [Log
   * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS
   * Step Functions User Guide.
   */
  public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  /**
   * @param loggingConfiguration Defines what execution history events are logged and where they are
   * logged.
   *
   * By default, the `level` is set to `OFF` . For more information see [Log
   * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS
   * Step Functions User Guide.
   */
  public
      fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this state machine. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param stateMachineName The name of the state machine.
   * A name must *not* contain:
   *
   * * white space
   * * brackets `&lt; &gt; { } [ ]`
   * * wildcard characters `? *`
   * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
   * * control characters ( `U+0000-001F` , `U+007F-009F` )
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   */
  public fun stateMachineName(stateMachineName: String) {
    cdkBuilder.stateMachineName(stateMachineName)
  }

  /**
   * @param stateMachineType Determines whether a `STANDARD` or `EXPRESS` state machine is created.
   * The default is `STANDARD` . You cannot update the `type` of a state machine once it has been
   * created. For more information on `STANDARD` and `EXPRESS` workflows, see [Standard Versus Express
   * Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
   * in the AWS Step Functions Developer Guide.
   */
  public fun stateMachineType(stateMachineType: String) {
    cdkBuilder.stateMachineType(stateMachineType)
  }

  /**
   * @param tags The list of tags to add to a resource.
   * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
   */
  public fun tags(tags: CfnStateMachineTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnStateMachineTagsEntryPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags The list of tags to add to a resource.
   * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
   */
  public fun tags(tags: Collection<CfnStateMachine.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  /**
   * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
   * enabled.
   */
  public fun tracingConfiguration(tracingConfiguration: IResolvable) {
    cdkBuilder.tracingConfiguration(tracingConfiguration)
  }

  /**
   * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
   * enabled.
   */
  public
      fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty) {
    cdkBuilder.tracingConfiguration(tracingConfiguration)
  }

  public fun build(): CfnStateMachineProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
