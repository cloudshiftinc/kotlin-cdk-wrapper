@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provisions a state machine.
 *
 * A state machine consists of a collection of states that can do work ( `Task` states), determine
 * to which states to transition next ( `Choice` states), stop an execution with an error ( `Fail`
 * states), and so on. State machines are specified using a JSON-based, structured language.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
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
public open class CfnStateMachine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateMachineProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.CfnStateMachine(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnStateMachineProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateMachineProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStateMachineProps(props)
  )

  /**
   * Returns the ARN of the resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the name of the state machine. For example:.
   *
   * `{ "Fn::GetAtt": ["MyStateMachine", "Name"] }`
   *
   * Returns the name of your state machine:
   *
   * `HelloWorld-StateMachine`
   *
   * If you did not specify the name it will be similar to the following:
   *
   * `MyStateMachine-1234abcdefgh`
   *
   * For more information about using `Fn::GetAtt` , see
   * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
   * .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Identifier for a state machine revision, which is an immutable, read-only snapshot of a state
   * machine’s definition and configuration.
   */
  public open fun attrStateMachineRevisionId(): String =
      unwrap(this).getAttrStateMachineRevisionId()

  /**
   * The Amazon States Language definition of the state machine.
   */
  public open fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * The Amazon States Language definition of the state machine.
   */
  public open fun definition(`value`: Any) {
    unwrap(this).setDefinition(`value`)
  }

  /**
   * The name of the S3 bucket where the state machine definition is stored.
   */
  public open fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

  /**
   * The name of the S3 bucket where the state machine definition is stored.
   */
  public open fun definitionS3Location(`value`: IResolvable) {
    unwrap(this).setDefinitionS3Location(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the S3 bucket where the state machine definition is stored.
   */
  public open fun definitionS3Location(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   * The name of the S3 bucket where the state machine definition is stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db59852a0ba408f15c9c85adff0afa12bb1e6a4ae08b50a6530421397112f1a1")
  public open fun definitionS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionS3Location(S3LocationProperty(`value`))

  /**
   * The Amazon States Language definition of the state machine.
   */
  public open fun definitionString(): String? = unwrap(this).getDefinitionString()

  /**
   * The Amazon States Language definition of the state machine.
   */
  public open fun definitionString(`value`: String) {
    unwrap(this).setDefinitionString(`value`)
  }

  /**
   * A map (string to string) that specifies the mappings for placeholder variables in the state
   * machine definition.
   */
  public open fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  /**
   * A map (string to string) that specifies the mappings for placeholder variables in the state
   * machine definition.
   */
  public open fun definitionSubstitutions(`value`: IResolvable) {
    unwrap(this).setDefinitionSubstitutions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A map (string to string) that specifies the mappings for placeholder variables in the state
   * machine definition.
   */
  public open fun definitionSubstitutions(`value`: Map<String, String>) {
    unwrap(this).setDefinitionSubstitutions(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Defines what execution history events are logged and where they are logged.
   */
  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * Defines what execution history events are logged and where they are logged.
   */
  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines what execution history events are logged and where they are logged.
   */
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  /**
   * Defines what execution history events are logged and where they are logged.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("05de295561abe677725ef1b2055690cad1033da93c767642f2df8443812ccf8b")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The name of the state machine.
   */
  public open fun stateMachineName(): String? = unwrap(this).getStateMachineName()

  /**
   * The name of the state machine.
   */
  public open fun stateMachineName(`value`: String) {
    unwrap(this).setStateMachineName(`value`)
  }

  /**
   * Determines whether a `STANDARD` or `EXPRESS` state machine is created.
   */
  public open fun stateMachineType(): String? = unwrap(this).getStateMachineType()

  /**
   * Determines whether a `STANDARD` or `EXPRESS` state machine is created.
   */
  public open fun stateMachineType(`value`: String) {
    unwrap(this).setStateMachineType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of tags to add to a resource.
   */
  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  /**
   * The list of tags to add to a resource.
   */
  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  /**
   * The list of tags to add to a resource.
   */
  public open fun tagsRaw(vararg `value`: TagsEntryProperty): Unit = tagsRaw(`value`.toList())

  /**
   * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
   */
  public open fun tracingConfiguration(): Any? = unwrap(this).getTracingConfiguration()

  /**
   * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
   */
  public open fun tracingConfiguration(`value`: IResolvable) {
    unwrap(this).setTracingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
   */
  public open fun tracingConfiguration(`value`: TracingConfigurationProperty) {
    unwrap(this).setTracingConfiguration(`value`.let(TracingConfigurationProperty::unwrap))
  }

  /**
   * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d1967000550ba1045aab18f6d825af60fc8cf0d7b79d2d8eee4f6b75583045c")
  public open fun tracingConfiguration(`value`: TracingConfigurationProperty.Builder.() -> Unit):
      Unit = tracingConfiguration(TracingConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.CfnStateMachine].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON or YAML, and the format of the object must match
     * the format of your CloudFormation template file. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definition)
     * @param definition The Amazon States Language definition of the state machine. 
     */
    public fun definition(definition: Any)

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored. 
     */
    public fun definitionS3Location(definitionS3Location: IResolvable)

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored. 
     */
    public fun definitionS3Location(definitionS3Location: S3LocationProperty)

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb91d2880c08f8cce2cd0af04a2a3eecc09e8fd6582da5821f01a10d04625122")
    public fun definitionS3Location(definitionS3Location: S3LocationProperty.Builder.() -> Unit)

    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
     * @param definitionString The Amazon States Language definition of the state machine. 
     */
    public fun definitionString(definitionString: String)

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
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     * placeholder variables in the state machine definition. 
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

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
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     * placeholder variables in the state machine definition. 
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

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
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged. 
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

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
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged. 
     */
    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

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
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd444e26170c896e677096152567e3952b5e3918cdcb2b7b08247377e9040b7e")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this state machine. 
     */
    public fun roleArn(roleArn: String)

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
     * @param stateMachineName The name of the state machine. 
     */
    public fun stateMachineName(stateMachineName: String)

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
     * @param stateMachineType Determines whether a `STANDARD` or `EXPRESS` state machine is
     * created. 
     */
    public fun stateMachineType(stateMachineType: String)

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
     * @param tags The list of tags to add to a resource. 
     */
    public fun tags(tags: List<TagsEntryProperty>)

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
     * @param tags The list of tags to add to a resource. 
     */
    public fun tags(vararg tags: TagsEntryProperty)

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled. 
     */
    public fun tracingConfiguration(tracingConfiguration: IResolvable)

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled. 
     */
    public fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty)

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e5b2dbb55d6717ac848eee9a562bad6fe394f4ef85b956a0e7d0b7fc2f329f9")
    public
        fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachine.Builder.create(scope, id)

    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON or YAML, and the format of the object must match
     * the format of your CloudFormation template file. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definition)
     * @param definition The Amazon States Language definition of the state machine. 
     */
    override fun definition(definition: Any) {
      cdkBuilder.definition(definition)
    }

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored. 
     */
    override fun definitionS3Location(definitionS3Location: IResolvable) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(IResolvable::unwrap))
    }

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored. 
     */
    override fun definitionS3Location(definitionS3Location: S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(S3LocationProperty::unwrap))
    }

    /**
     * The name of the S3 bucket where the state machine definition is stored.
     *
     * The state machine definition must be a JSON or YAML file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitions3location)
     * @param definitionS3Location The name of the S3 bucket where the state machine definition is
     * stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb91d2880c08f8cce2cd0af04a2a3eecc09e8fd6582da5821f01a10d04625122")
    override fun definitionS3Location(definitionS3Location: S3LocationProperty.Builder.() -> Unit):
        Unit = definitionS3Location(S3LocationProperty(definitionS3Location))

    /**
     * The Amazon States Language definition of the state machine.
     *
     * The state machine definition must be in JSON. See [Amazon States
     * Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-definitionstring)
     * @param definitionString The Amazon States Language definition of the state machine. 
     */
    override fun definitionString(definitionString: String) {
      cdkBuilder.definitionString(definitionString)
    }

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
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     * placeholder variables in the state machine definition. 
     */
    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable::unwrap))
    }

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
     * @param definitionSubstitutions A map (string to string) that specifies the mappings for
     * placeholder variables in the state machine definition. 
     */
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

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
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged. 
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

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
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged. 
     */
    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

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
     * @param loggingConfiguration Defines what execution history events are logged and where they
     * are logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd444e26170c896e677096152567e3952b5e3918cdcb2b7b08247377e9040b7e")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this state machine. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

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
     * @param stateMachineName The name of the state machine. 
     */
    override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

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
     * @param stateMachineType Determines whether a `STANDARD` or `EXPRESS` state machine is
     * created. 
     */
    override fun stateMachineType(stateMachineType: String) {
      cdkBuilder.stateMachineType(stateMachineType)
    }

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
     * @param tags The list of tags to add to a resource. 
     */
    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tags)
     * @param tags The list of tags to add to a resource. 
     */
    override fun tags(vararg tags: TagsEntryProperty): Unit = tags(tags.toList())

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled. 
     */
    override fun tracingConfiguration(tracingConfiguration: IResolvable) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled. 
     */
    override fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty) {
      cdkBuilder.tracingConfiguration(tracingConfiguration.let(TracingConfigurationProperty::unwrap))
    }

    /**
     * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachine.html#cfn-stepfunctions-statemachine-tracingconfiguration)
     * @param tracingConfiguration Selects whether or not the state machine's AWS X-Ray tracing is
     * enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e5b2dbb55d6717ac848eee9a562bad6fe394f4ef85b956a0e7d0b7fc2f329f9")
    override
        fun tracingConfiguration(tracingConfiguration: TracingConfigurationProperty.Builder.() -> Unit):
        Unit = tracingConfiguration(TracingConfigurationProperty(tracingConfiguration))

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachine =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine):
        CfnStateMachine = CfnStateMachine(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachine):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachine = wrapped.cdkObject
  }

  /**
   * Defines a CloudWatch log group.
   *
   *
   * For more information see [Standard Versus Express
   * Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
   * in the AWS Step Functions Developer Guide.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * CloudWatchLogsLogGroupProperty cloudWatchLogsLogGroupProperty =
   * CloudWatchLogsLogGroupProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-cloudwatchlogsloggroup.html)
   */
  public interface CloudWatchLogsLogGroupProperty {
    /**
     * The ARN of the the CloudWatch log group to which you want your logs emitted to.
     *
     * The ARN must end with `:*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-cloudwatchlogsloggroup.html#cfn-stepfunctions-statemachine-cloudwatchlogsloggroup-loggrouparn)
     */
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    /**
     * A builder for [CloudWatchLogsLogGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupArn The ARN of the the CloudWatch log group to which you want your logs
       * emitted to.
       * The ARN must end with `:*`
       */
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

      /**
       * @param logGroupArn The ARN of the the CloudWatch log group to which you want your logs
       * emitted to.
       * The ARN must end with `:*`
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsLogGroupProperty {
      /**
       * The ARN of the the CloudWatch log group to which you want your logs emitted to.
       *
       * The ARN must end with `:*`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-cloudwatchlogsloggroup.html#cfn-stepfunctions-statemachine-cloudwatchlogsloggroup-loggrouparn)
       */
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsLogGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty):
          CloudWatchLogsLogGroupProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsLogGroupProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsLogGroupProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.CloudWatchLogsLogGroupProperty
    }
  }

  /**
   * Defines a destination for `LoggingConfiguration` .
   *
   *
   * For more information on logging with `EXPRESS` workflows, see [Logging Express Workflows Using
   * CloudWatch Logs](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * LogDestinationProperty logDestinationProperty = LogDestinationProperty.builder()
   * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination.html)
   */
  public interface LogDestinationProperty {
    /**
     * An object describing a CloudWatch log group.
     *
     * For more information, see
     * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
     * in the AWS CloudFormation User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination.html#cfn-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup)
     */
    public fun cloudWatchLogsLogGroup(): Any? = unwrap(this).getCloudWatchLogsLogGroup()

    /**
     * A builder for [LogDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
       * For more information, see
       * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
       * in the AWS CloudFormation User Guide.
       */
      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable)

      /**
       * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
       * For more information, see
       * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
       * in the AWS CloudFormation User Guide.
       */
      public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty)

      /**
       * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
       * For more information, see
       * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
       * in the AWS CloudFormation User Guide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd76848786f3d940ef85b178e7d7f8f3f3f96bb92885fa871fe9d82ef8dca13")
      public
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty.builder()

      /**
       * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
       * For more information, see
       * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
       * in the AWS CloudFormation User Guide.
       */
      override fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
       * For more information, see
       * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
       * in the AWS CloudFormation User Guide.
       */
      override fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup.let(CloudWatchLogsLogGroupProperty::unwrap))
      }

      /**
       * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
       * For more information, see
       * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
       * in the AWS CloudFormation User Guide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8dd76848786f3d940ef85b178e7d7f8f3f3f96bb92885fa871fe9d82ef8dca13")
      override
          fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CloudWatchLogsLogGroupProperty.Builder.() -> Unit):
          Unit = cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty(cloudWatchLogsLogGroup))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty,
    ) : CdkObject(cdkObject), LogDestinationProperty {
      /**
       * An object describing a CloudWatch log group.
       *
       * For more information, see
       * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
       * in the AWS CloudFormation User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination.html#cfn-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup)
       */
      override fun cloudWatchLogsLogGroup(): Any? = unwrap(this).getCloudWatchLogsLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty):
          LogDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? LogDestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDestinationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LogDestinationProperty
    }
  }

  /**
   * Defines what execution history events are logged and where they are logged.
   *
   * Step Functions provides the log levels — `OFF` , `ALL` , `ERROR` , and `FATAL` . No event types
   * log when set to `OFF` and all event types do when set to `ALL` .
   *
   *
   * By default, the `level` is set to `OFF` . For more information see [Log
   * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS
   * Step Functions User Guide.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
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
  public interface LoggingConfigurationProperty {
    /**
     * An array of objects that describes where your execution history events will be logged.
     *
     * Limited to size 1. Required, if your log level is not set to `OFF` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-destinations)
     */
    public fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * Determines whether execution data is included in your log.
     *
     * When set to `false` , data is excluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-includeexecutiondata)
     */
    public fun includeExecutionData(): Any? = unwrap(this).getIncludeExecutionData()

    /**
     * Defines which category of execution history events are logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-level)
     */
    public fun level(): String? = unwrap(this).getLevel()

    /**
     * A builder for [LoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinations An array of objects that describes where your execution history events
       * will be logged.
       * Limited to size 1. Required, if your log level is not set to `OFF` .
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations An array of objects that describes where your execution history events
       * will be logged.
       * Limited to size 1. Required, if your log level is not set to `OFF` .
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations An array of objects that describes where your execution history events
       * will be logged.
       * Limited to size 1. Required, if your log level is not set to `OFF` .
       */
      public fun destinations(vararg destinations: Any)

      /**
       * @param includeExecutionData Determines whether execution data is included in your log.
       * When set to `false` , data is excluded.
       */
      public fun includeExecutionData(includeExecutionData: Boolean)

      /**
       * @param includeExecutionData Determines whether execution data is included in your log.
       * When set to `false` , data is excluded.
       */
      public fun includeExecutionData(includeExecutionData: IResolvable)

      /**
       * @param level Defines which category of execution history events are logged.
       */
      public fun level(level: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty.builder()

      /**
       * @param destinations An array of objects that describes where your execution history events
       * will be logged.
       * Limited to size 1. Required, if your log level is not set to `OFF` .
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      /**
       * @param destinations An array of objects that describes where your execution history events
       * will be logged.
       * Limited to size 1. Required, if your log level is not set to `OFF` .
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      /**
       * @param destinations An array of objects that describes where your execution history events
       * will be logged.
       * Limited to size 1. Required, if your log level is not set to `OFF` .
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      /**
       * @param includeExecutionData Determines whether execution data is included in your log.
       * When set to `false` , data is excluded.
       */
      override fun includeExecutionData(includeExecutionData: Boolean) {
        cdkBuilder.includeExecutionData(includeExecutionData)
      }

      /**
       * @param includeExecutionData Determines whether execution data is included in your log.
       * When set to `false` , data is excluded.
       */
      override fun includeExecutionData(includeExecutionData: IResolvable) {
        cdkBuilder.includeExecutionData(includeExecutionData.let(IResolvable::unwrap))
      }

      /**
       * @param level Defines which category of execution history events are logged.
       */
      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
      /**
       * An array of objects that describes where your execution history events will be logged.
       *
       * Limited to size 1. Required, if your log level is not set to `OFF` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-destinations)
       */
      override fun destinations(): Any? = unwrap(this).getDestinations()

      /**
       * Determines whether execution data is included in your log.
       *
       * When set to `false` , data is excluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-includeexecutiondata)
       */
      override fun includeExecutionData(): Any? = unwrap(this).getIncludeExecutionData()

      /**
       * Defines which category of execution history events are logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html#cfn-stepfunctions-statemachine-loggingconfiguration-level)
       */
      override fun level(): String? = unwrap(this).getLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty):
          LoggingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoggingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.LoggingConfigurationProperty
    }
  }

  /**
   * Defines the S3 bucket location where a state machine definition is stored.
   *
   * The state machine definition must be a JSON or YAML file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
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
  public interface S3LocationProperty {
    /**
     * The name of the S3 bucket where the state machine definition JSON or YAML file is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html#cfn-stepfunctions-statemachine-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The name of the state machine definition file (Amazon S3 object name).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html#cfn-stepfunctions-statemachine-s3location-key)
     */
    public fun key(): String

    /**
     * For versioning-enabled buckets, a specific version of the state machine definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html#cfn-stepfunctions-statemachine-s3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket where the state machine definition JSON or YAML
       * file is stored. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The name of the state machine definition file (Amazon S3 object name). 
       */
      public fun key(key: String)

      /**
       * @param version For versioning-enabled buckets, a specific version of the state machine
       * definition.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty.Builder =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty.builder()

      /**
       * @param bucket The name of the S3 bucket where the state machine definition JSON or YAML
       * file is stored. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The name of the state machine definition file (Amazon S3 object name). 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version For versioning-enabled buckets, a specific version of the state machine
       * definition.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The name of the S3 bucket where the state machine definition JSON or YAML file is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html#cfn-stepfunctions-statemachine-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The name of the state machine definition file (Amazon S3 object name).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html#cfn-stepfunctions-statemachine-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * For versioning-enabled buckets, a specific version of the state machine definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-s3location.html#cfn-stepfunctions-statemachine-s3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.S3LocationProperty
    }
  }

  /**
   * The `TagsEntry` property specifies *tags* to identify a state machine.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tagsentry.html)
   */
  public interface TagsEntryProperty {
    /**
     * The `key` for a key-value pair in a tag entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tagsentry.html#cfn-stepfunctions-statemachine-tagsentry-key)
     */
    public fun key(): String

    /**
     * The `value` for a key-value pair in a tag entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tagsentry.html#cfn-stepfunctions-statemachine-tagsentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagsEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The `key` for a key-value pair in a tag entry. 
       */
      public fun key(key: String)

      /**
       * @param value The `value` for a key-value pair in a tag entry. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.builder()

      /**
       * @param key The `key` for a key-value pair in a tag entry. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The `value` for a key-value pair in a tag entry. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty,
    ) : CdkObject(cdkObject), TagsEntryProperty {
      /**
       * The `key` for a key-value pair in a tag entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tagsentry.html#cfn-stepfunctions-statemachine-tagsentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The `value` for a key-value pair in a tag entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tagsentry.html#cfn-stepfunctions-statemachine-tagsentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty):
          TagsEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? TagsEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty
    }
  }

  /**
   * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
   *
   * To configure your state machine to send trace data to X-Ray, set `Enabled` to `true` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * TracingConfigurationProperty tracingConfigurationProperty =
   * TracingConfigurationProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tracingconfiguration.html)
   */
  public interface TracingConfigurationProperty {
    /**
     * When set to `true` , X-Ray tracing is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tracingconfiguration.html#cfn-stepfunctions-statemachine-tracingconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [TracingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled When set to `true` , X-Ray tracing is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled When set to `true` , X-Ray tracing is enabled.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty.builder()

      /**
       * @param enabled When set to `true` , X-Ray tracing is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled When set to `true` , X-Ray tracing is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty,
    ) : CdkObject(cdkObject), TracingConfigurationProperty {
      /**
       * When set to `true` , X-Ray tracing is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tracingconfiguration.html#cfn-stepfunctions-statemachine-tracingconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TracingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty):
          TracingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TracingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TracingConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TracingConfigurationProperty
    }
  }
}
