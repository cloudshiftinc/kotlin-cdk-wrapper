@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStateMachine`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
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
public interface CfnStateMachineProps {
  /**
   * The Amazon States Language definition of the state machine.
   *
   * The state machine definition must be in JSON or YAML, and the format of the object must match
   * the format of your CloudFormation template file. See [Amazon States
   * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definition)
   */
  public fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * The name of the S3 bucket where the state machine definition is stored.
   *
   * The state machine definition must be a JSON or YAML file.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
   */
  public fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

  /**
   * The Amazon States Language definition of the state machine.
   *
   * The state machine definition must be in JSON. See [Amazon States
   * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
   */
  public fun definitionString(): String? = unwrap(this).getDefinitionString()

  /**
   * A map (string to string) that specifies the mappings for placeholder variables in the state
   * machine definition.
   *
   * This enables the customer to inject values obtained at runtime, for example from intrinsic
   * functions, in the state machine definition. Variables can be template parameter names, resource
   * logical IDs, resource attributes, or a variable in a key-value map.
   *
   * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionsubstitutions)
   */
  public fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  /**
   * Defines what execution history events are logged and where they are logged.
   *
   *
   * By default, the `level` is set to `OFF` . For more information see [Log
   * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS
   * Step Functions User Guide.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-loggingconfiguration)
   */
  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
   */
  public fun roleArn(): String

  /**
   * The name of the state machine.
   *
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
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename)
   */
  public fun stateMachineName(): String? = unwrap(this).getStateMachineName()

  /**
   * Determines whether a `STANDARD` or `EXPRESS` state machine is created.
   *
   * The default is `STANDARD` . You cannot update the `type` of a state machine once it has been
   * created. For more information on `STANDARD` and `EXPRESS` workflows, see [Standard Versus Express
   * Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
   * in the AWS Step Functions Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinetype)
   */
  public fun stateMachineType(): String? = unwrap(this).getStateMachineType()

  /**
   * The list of tags to add to a resource.
   *
   * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
   */
  public fun tags(): List<CfnStateMachine.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnStateMachine.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
   */
  public fun tracingConfiguration(): Any? = unwrap(this).getTracingConfiguration()

  /**
   * A builder for [CfnStateMachineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param definition The Amazon States Language definition of the state machine.
     * The state machine definition must be in JSON or YAML, and the format of the object must match
     * the format of your CloudFormation template file. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     */
    public fun definition(definition: Any)

    /**
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored.
     * The state machine definition must be a JSON or YAML file.
     */
    public fun definitionS3Location(definitionS3Location: IResolvable)

    /**
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored.
     * The state machine definition must be a JSON or YAML file.
     */
    public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty)

    /**
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored.
     * The state machine definition must be a JSON or YAML file.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ceca4784905d71e579346fca6fdc2394fc23355d49f7710b4fd69787588cdb3")
    public
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param definitionString The Amazon States Language definition of the state machine.
     * The state machine definition must be in JSON. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     */
    public fun definitionString(definitionString: String)

    /**
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     * placeholder variables in the state machine definition.
     * This enables the customer to inject values obtained at runtime, for example from intrinsic
     * functions, in the state machine definition. Variables can be template parameter names, resource
     * logical IDs, resource attributes, or a variable in a key-value map.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    /**
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     * placeholder variables in the state machine definition.
     * This enables the customer to inject values obtained at runtime, for example from intrinsic
     * functions, in the state machine definition. Variables can be template parameter names, resource
     * logical IDs, resource attributes, or a variable in a key-value map.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see [Log
     * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the
     * AWS Step Functions User Guide.
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see [Log
     * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the
     * AWS Step Functions User Guide.
     */
    public
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty)

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see [Log
     * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the
     * AWS Step Functions User Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39ad5b48c2c230228bbf3e3453d76c2504b224388fb0654168c6a89ddc5d1c9e")
    public
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this state machine. 
     */
    public fun roleArn(roleArn: String)

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
    public fun stateMachineName(stateMachineName: String)

    /**
     * @param stateMachineType Determines whether a `STANDARD` or `EXPRESS` state machine is
     * created.
     * The default is `STANDARD` . You cannot update the `type` of a state machine once it has been
     * created. For more information on `STANDARD` and `EXPRESS` workflows, see [Standard Versus
     * Express
     * Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
     * in the AWS Step Functions Developer Guide.
     */
    public fun stateMachineType(stateMachineType: String)

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(tags: List<CfnStateMachine.TagsEntryProperty>)

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(vararg tags: CfnStateMachine.TagsEntryProperty)

    /**
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled.
     */
    public fun tracingConfiguration(tracingConfiguration: IResolvable)

    /**
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled.
     */
    public
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty)

    /**
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a22598fdcfa371b31092b87923be1fdc8c5eacb4cfdd5c49f08d189447235064")
    public
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.builder()

    /**
     * @param definition The Amazon States Language definition of the state machine.
     * The state machine definition must be in JSON or YAML, and the format of the object must match
     * the format of your CloudFormation template file. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     */
    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    /**
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored.
     * The state machine definition must be a JSON or YAML file.
     */
    override fun definitionS3Location(definitionS3Location: IResolvable) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(IResolvable::unwrap))
    }

    /**
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored.
     * The state machine definition must be a JSON or YAML file.
     */
    override fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(CfnStateMachine.S3LocationProperty::unwrap))
    }

    /**
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored.
     * The state machine definition must be a JSON or YAML file.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ceca4784905d71e579346fca6fdc2394fc23355d49f7710b4fd69787588cdb3")
    override
        fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionS3Location(CfnStateMachine.S3LocationProperty(definitionS3Location))

    /**
     * @param definitionString The Amazon States Language definition of the state machine.
     * The state machine definition must be in JSON. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     */
    override fun definitionString(definitionString: String) {
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
    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
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
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see [Log
     * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the
     * AWS Step Functions User Guide.
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see [Log
     * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the
     * AWS Step Functions User Guide.
     */
    override
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnStateMachine.LoggingConfigurationProperty::unwrap))
    }

    /**
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged.
     *
     * By default, the `level` is set to `OFF` . For more information see [Log
     * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the
     * AWS Step Functions User Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39ad5b48c2c230228bbf3e3453d76c2504b224388fb0654168c6a89ddc5d1c9e")
    override
        fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit =
        loggingConfiguration(CfnStateMachine.LoggingConfigurationProperty(loggingConfiguration))

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this state machine. 
     */
    override fun roleArn(roleArn: String) {
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
    override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

    /**
     * @param stateMachineType Determines whether a `STANDARD` or `EXPRESS` state machine is
     * created.
     * The default is `STANDARD` . You cannot update the `type` of a state machine once it has been
     * created. For more information on `STANDARD` and `EXPRESS` workflows, see [Standard Versus
     * Express
     * Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
     * in the AWS Step Functions Developer Guide.
     */
    override fun stateMachineType(stateMachineType: String) {
      cdkBuilder.stateMachineType(stateMachineType)
    }

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    override fun tags(tags: List<CfnStateMachine.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnStateMachine.TagsEntryProperty::unwrap))
    }

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    override fun tags(vararg tags: CfnStateMachine.TagsEntryProperty): Unit = tags(tags.toList())

    /**
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled.
     */
    override fun tracingConfiguration(tracingConfiguration: IResolvable) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled.
     */
    override
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(CfnStateMachine.TracingConfigurationProperty::unwrap))
    }

    /**
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a22598fdcfa371b31092b87923be1fdc8c5eacb4cfdd5c49f08d189447235064")
    override
        fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit):
        Unit =
        tracingConfiguration(CfnStateMachine.TracingConfigurationProperty(tracingConfiguration))

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps,
  ) : CdkObject(cdkObject), CfnStateMachineProps {
    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON or YAML, and the format of the object must match
     * the format of your CloudFormation template file. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definition)
     */
    override fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     */
    override fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
     */
    override fun definitionString(): String? = unwrap(this).getDefinitionString()

    /**
     * A map (string to string) that specifies the mappings for placeholder variables in the state
     * machine definition.
     *
     * This enables the customer to inject values obtained at runtime, for example from intrinsic
     * functions, in the state machine definition. Variables can be template parameter names, resource
     * logical IDs, resource attributes, or a variable in a key-value map.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionsubstitutions)
     */
    override fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     *
     * By default, the `level` is set to `OFF` . For more information see [Log
     * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the
     * AWS Step Functions User Guide.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-loggingconfiguration)
     */
    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The name of the state machine.
     *
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
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinename)
     */
    override fun stateMachineName(): String? = unwrap(this).getStateMachineName()

    /**
     * Determines whether a `STANDARD` or `EXPRESS` state machine is created.
     *
     * The default is `STANDARD` . You cannot update the `type` of a state machine once it has been
     * created. For more information on `STANDARD` and `EXPRESS` workflows, see [Standard Versus
     * Express
     * Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
     * in the AWS Step Functions Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-statemachinetype)
     */
    override fun stateMachineType(): String? = unwrap(this).getStateMachineType()

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
     */
    override fun tags(): List<CfnStateMachine.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnStateMachine.TagsEntryProperty::wrap) ?: emptyList()

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     */
    override fun tracingConfiguration(): Any? = unwrap(this).getTracingConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps):
        CfnStateMachineProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStateMachineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineProps):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps
  }
}
