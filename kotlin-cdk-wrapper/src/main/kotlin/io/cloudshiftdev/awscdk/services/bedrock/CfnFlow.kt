@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a prompt flow that you can use to send an input through various steps to yield an output.
 *
 * You define a flow by configuring nodes, each of which corresponds to a step of the flow, and
 * creating connections between the nodes to create paths to different outputs. You can define the flow
 * in one of the following ways:
 *
 * * Define a
 * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
 * in the `Definition` property.
 * * Provide the definition in the `DefinitionString` property as a JSON-formatted string matching
 * the
 * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
 * property.
 * * Provide an Amazon S3 location in the `DefinitionS3Location` property that matches the
 * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
 * .
 *
 * If you use the `DefinitionString` or `DefinitionS3Location` property, you can use the
 * `DefinitionSubstitutions` property to define key-value pairs to replace at runtime.
 *
 * For more information, see [How it
 * works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html) and [Create a
 * prompt flow in Amazon
 * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-create.html) in the Amazon
 * Bedrock User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * Object collector;
 * Object input;
 * Object iterator;
 * Object output;
 * CfnFlow cfnFlow = CfnFlow.Builder.create(this, "MyCfnFlow")
 * .executionRoleArn("executionRoleArn")
 * .name("name")
 * // the properties below are optional
 * .customerEncryptionKeyArn("customerEncryptionKeyArn")
 * .definition(FlowDefinitionProperty.builder()
 * .connections(List.of(FlowConnectionProperty.builder()
 * .name("name")
 * .source("source")
 * .target("target")
 * .type("type")
 * // the properties below are optional
 * .configuration(FlowConnectionConfigurationProperty.builder()
 * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
 * .condition("condition")
 * .build())
 * .data(FlowDataConnectionConfigurationProperty.builder()
 * .sourceOutput("sourceOutput")
 * .targetInput("targetInput")
 * .build())
 * .build())
 * .build()))
 * .nodes(List.of(FlowNodeProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .configuration(FlowNodeConfigurationProperty.builder()
 * .agent(AgentFlowNodeConfigurationProperty.builder()
 * .agentAliasArn("agentAliasArn")
 * .build())
 * .collector(collector)
 * .condition(ConditionFlowNodeConfigurationProperty.builder()
 * .conditions(List.of(FlowConditionProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .expression("expression")
 * .build()))
 * .build())
 * .input(input)
 * .iterator(iterator)
 * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
 * .knowledgeBaseId("knowledgeBaseId")
 * // the properties below are optional
 * .modelId("modelId")
 * .build())
 * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
 * .lambdaArn("lambdaArn")
 * .build())
 * .lex(LexFlowNodeConfigurationProperty.builder()
 * .botAliasArn("botAliasArn")
 * .localeId("localeId")
 * .build())
 * .output(output)
 * .prompt(PromptFlowNodeConfigurationProperty.builder()
 * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
 * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
 * .modelId("modelId")
 * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
 * .text(TextPromptTemplateConfigurationProperty.builder()
 * .text("text")
 * // the properties below are optional
 * .inputVariables(List.of(PromptInputVariableProperty.builder()
 * .name("name")
 * .build()))
 * .build())
 * .build())
 * .templateType("templateType")
 * // the properties below are optional
 * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
 * .text(PromptModelInferenceConfigurationProperty.builder()
 * .maxTokens(123)
 * .stopSequences(List.of("stopSequences"))
 * .temperature(123)
 * .topK(123)
 * .topP(123)
 * .build())
 * .build())
 * .build())
 * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
 * .promptArn("promptArn")
 * .build())
 * .build())
 * .build())
 * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
 * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
 * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build())
 * .build())
 * .storage(StorageFlowNodeConfigurationProperty.builder()
 * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
 * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build())
 * .build())
 * .build())
 * .inputs(List.of(FlowNodeInputProperty.builder()
 * .expression("expression")
 * .name("name")
 * .type("type")
 * .build()))
 * .outputs(List.of(FlowNodeOutputProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build()))
 * .build())
 * .definitionS3Location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .definitionString("definitionString")
 * .definitionSubstitutions(Map.of(
 * "definitionSubstitutionsKey", "definitionSubstitutions"))
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .testAliasTags(Map.of(
 * "testAliasTagsKey", "testAliasTags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html)
 */
public open class CfnFlow(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnFlow(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFlowProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlowProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the flow.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time at which the flow was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The unique identifier of the flow.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The status of the flow. The following statuses are possible:.
   *
   * * NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just
   * created the flow, you can't test it. If you updated the flow, the `DRAFT` version won't contain
   * the latest changes for testing. Send a
   * [PrepareFlow](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html)
   * request to package the latest changes into the `DRAFT` version.
   * * Preparing – The flow is being prepared so that the `DRAFT` version contains the latest
   * changes for testing.
   * * Prepared – The flow is prepared and the `DRAFT` version contains the latest changes for
   * testing.
   * * Failed – The last API operation that you invoked on the flow failed. Send a
   * [GetFlow](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html) request
   * and check the error message in the `validations` field.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The time at which the flow was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * List of flow validations.
   */
  public open fun attrValidations(): IResolvable =
      unwrap(this).getAttrValidations().let(IResolvable::wrap)

  /**
   * The latest version of the flow.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the KMS key that the flow is encrypted with.
   */
  public open fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the KMS key that the flow is encrypted with.
   */
  public open fun customerEncryptionKeyArn(`value`: String) {
    unwrap(this).setCustomerEncryptionKeyArn(`value`)
  }

  /**
   * The definition of the nodes and connections between the nodes in the flow.
   */
  public open fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * The definition of the nodes and connections between the nodes in the flow.
   */
  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The definition of the nodes and connections between the nodes in the flow.
   */
  public open fun definition(`value`: FlowDefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(FlowDefinitionProperty.Companion::unwrap))
  }

  /**
   * The definition of the nodes and connections between the nodes in the flow.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb9912b5534f23c2dc1e78d7571157513947ad6ad249aedb9b8eab7383f6eb39")
  public open fun definition(`value`: FlowDefinitionProperty.Builder.() -> Unit): Unit =
      definition(FlowDefinitionProperty(`value`))

  /**
   * The Amazon S3 location of the flow definition.
   */
  public open fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

  /**
   * The Amazon S3 location of the flow definition.
   */
  public open fun definitionS3Location(`value`: IResolvable) {
    unwrap(this).setDefinitionS3Location(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon S3 location of the flow definition.
   */
  public open fun definitionS3Location(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionS3Location(`value`.let(S3LocationProperty.Companion::unwrap))
  }

  /**
   * The Amazon S3 location of the flow definition.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c910a04a7cc09fbd585bcf8c558dba24c80440d9f64a527b208ff4653859f61")
  public open fun definitionS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionS3Location(S3LocationProperty(`value`))

  /**
   * The definition of the flow as a JSON-formatted string.
   */
  public open fun definitionString(): String? = unwrap(this).getDefinitionString()

  /**
   * The definition of the flow as a JSON-formatted string.
   */
  public open fun definitionString(`value`: String) {
    unwrap(this).setDefinitionString(`value`)
  }

  /**
   * A map that specifies the mappings for placeholder variables in the prompt flow definition.
   */
  public open fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  /**
   * A map that specifies the mappings for placeholder variables in the prompt flow definition.
   */
  public open fun definitionSubstitutions(`value`: IResolvable) {
    unwrap(this).setDefinitionSubstitutions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A map that specifies the mappings for placeholder variables in the prompt flow definition.
   */
  public open fun definitionSubstitutions(`value`: Map<String, Any>) {
    unwrap(this).setDefinitionSubstitutions(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * A description of the flow.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the flow.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the service role with permissions to create a flow.
   */
  public open fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the service role with permissions to create a flow.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
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
   * The name of the flow.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the flow.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Metadata that you can assign to a resource as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A map of tag keys and values.
   */
  public open fun testAliasTags(): Any? = unwrap(this).getTestAliasTags()

  /**
   * A map of tag keys and values.
   */
  public open fun testAliasTags(`value`: IResolvable) {
    unwrap(this).setTestAliasTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A map of tag keys and values.
   */
  public open fun testAliasTags(`value`: Map<String, String>) {
    unwrap(this).setTestAliasTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnFlow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the KMS key that the flow is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the flow
     * is encrypted with. 
     */
    public fun customerEncryptionKeyArn(customerEncryptionKeyArn: String)

    /**
     * The definition of the nodes and connections between the nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
     * @param definition The definition of the nodes and connections between the nodes in the flow. 
     */
    public fun definition(definition: IResolvable)

    /**
     * The definition of the nodes and connections between the nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
     * @param definition The definition of the nodes and connections between the nodes in the flow. 
     */
    public fun definition(definition: FlowDefinitionProperty)

    /**
     * The definition of the nodes and connections between the nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
     * @param definition The definition of the nodes and connections between the nodes in the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd8a7a91cab22151f1c1f826f69dea3f7af0ef51470781009cbb857c56d3e7af")
    public fun definition(definition: FlowDefinitionProperty.Builder.() -> Unit)

    /**
     * The Amazon S3 location of the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
     * @param definitionS3Location The Amazon S3 location of the flow definition. 
     */
    public fun definitionS3Location(definitionS3Location: IResolvable)

    /**
     * The Amazon S3 location of the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
     * @param definitionS3Location The Amazon S3 location of the flow definition. 
     */
    public fun definitionS3Location(definitionS3Location: S3LocationProperty)

    /**
     * The Amazon S3 location of the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
     * @param definitionS3Location The Amazon S3 location of the flow definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffe0f102315503698f67bf49684954e26831df8ff6377c3acad7d45c50145fc4")
    public fun definitionS3Location(definitionS3Location: S3LocationProperty.Builder.() -> Unit)

    /**
     * The definition of the flow as a JSON-formatted string.
     *
     * The string must match the format in
     * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionstring)
     * @param definitionString The definition of the flow as a JSON-formatted string. 
     */
    public fun definitionString(definitionString: String)

    /**
     * A map that specifies the mappings for placeholder variables in the prompt flow definition.
     *
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionsubstitutions)
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition. 
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    /**
     * A map that specifies the mappings for placeholder variables in the prompt flow definition.
     *
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionsubstitutions)
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition. 
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, Any>)

    /**
     * A description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-description)
     * @param description A description of the flow. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the service role with permissions to create a flow.
     *
     * For more information, see [Create a service row for
     * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html) in the
     * Amazon Bedrock User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the service role with permissions
     * to create a flow. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-name)
     * @param name The name of the flow. 
     */
    public fun name(name: String)

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    public fun testAliasTags(testAliasTags: IResolvable)

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    public fun testAliasTags(testAliasTags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnFlow.Builder =
        software.amazon.awscdk.services.bedrock.CfnFlow.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the KMS key that the flow is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the flow
     * is encrypted with. 
     */
    override fun customerEncryptionKeyArn(customerEncryptionKeyArn: String) {
      cdkBuilder.customerEncryptionKeyArn(customerEncryptionKeyArn)
    }

    /**
     * The definition of the nodes and connections between the nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
     * @param definition The definition of the nodes and connections between the nodes in the flow. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * The definition of the nodes and connections between the nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
     * @param definition The definition of the nodes and connections between the nodes in the flow. 
     */
    override fun definition(definition: FlowDefinitionProperty) {
      cdkBuilder.definition(definition.let(FlowDefinitionProperty.Companion::unwrap))
    }

    /**
     * The definition of the nodes and connections between the nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
     * @param definition The definition of the nodes and connections between the nodes in the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd8a7a91cab22151f1c1f826f69dea3f7af0ef51470781009cbb857c56d3e7af")
    override fun definition(definition: FlowDefinitionProperty.Builder.() -> Unit): Unit =
        definition(FlowDefinitionProperty(definition))

    /**
     * The Amazon S3 location of the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
     * @param definitionS3Location The Amazon S3 location of the flow definition. 
     */
    override fun definitionS3Location(definitionS3Location: IResolvable) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon S3 location of the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
     * @param definitionS3Location The Amazon S3 location of the flow definition. 
     */
    override fun definitionS3Location(definitionS3Location: S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(S3LocationProperty.Companion::unwrap))
    }

    /**
     * The Amazon S3 location of the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
     * @param definitionS3Location The Amazon S3 location of the flow definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffe0f102315503698f67bf49684954e26831df8ff6377c3acad7d45c50145fc4")
    override fun definitionS3Location(definitionS3Location: S3LocationProperty.Builder.() -> Unit):
        Unit = definitionS3Location(S3LocationProperty(definitionS3Location))

    /**
     * The definition of the flow as a JSON-formatted string.
     *
     * The string must match the format in
     * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionstring)
     * @param definitionString The definition of the flow as a JSON-formatted string. 
     */
    override fun definitionString(definitionString: String) {
      cdkBuilder.definitionString(definitionString)
    }

    /**
     * A map that specifies the mappings for placeholder variables in the prompt flow definition.
     *
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionsubstitutions)
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition. 
     */
    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A map that specifies the mappings for placeholder variables in the prompt flow definition.
     *
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionsubstitutions)
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition. 
     */
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, Any>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * A description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-description)
     * @param description A description of the flow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the service role with permissions to create a flow.
     *
     * For more information, see [Create a service row for
     * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html) in the
     * Amazon Bedrock User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the service role with permissions
     * to create a flow. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-name)
     * @param name The name of the flow. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Metadata that you can assign to a resource as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    override fun testAliasTags(testAliasTags: IResolvable) {
      cdkBuilder.testAliasTags(testAliasTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-testaliastags)
     * @param testAliasTags A map of tag keys and values. 
     */
    override fun testAliasTags(testAliasTags: Map<String, String>) {
      cdkBuilder.testAliasTags(testAliasTags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnFlow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow): CfnFlow =
        CfnFlow(cdkObject)

    internal fun unwrap(wrapped: CfnFlow): software.amazon.awscdk.services.bedrock.CfnFlow =
        wrapped.cdkObject as software.amazon.awscdk.services.bedrock.CfnFlow
  }

  /**
   * Defines an agent node in your flow.
   *
   * You specify the agent to invoke at this point in the flow. For more information, see [Node
   * types in Amazon Bedrock
   * works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon
   * Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * AgentFlowNodeConfigurationProperty agentFlowNodeConfigurationProperty =
   * AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-agentflownodeconfiguration.html)
   */
  public interface AgentFlowNodeConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-agentflownodeconfiguration.html#cfn-bedrock-flow-agentflownodeconfiguration-agentaliasarn)
     */
    public fun agentAliasArn(): String

    /**
     * A builder for [AgentFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentAliasArn The Amazon Resource Name (ARN) of the alias of the agent to invoke. 
       */
      public fun agentAliasArn(agentAliasArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.AgentFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.AgentFlowNodeConfigurationProperty.builder()

      /**
       * @param agentAliasArn The Amazon Resource Name (ARN) of the alias of the agent to invoke. 
       */
      override fun agentAliasArn(agentAliasArn: String) {
        cdkBuilder.agentAliasArn(agentAliasArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.AgentFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.AgentFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        AgentFlowNodeConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-agentflownodeconfiguration.html#cfn-bedrock-flow-agentflownodeconfiguration-agentaliasarn)
       */
      override fun agentAliasArn(): String = unwrap(this).getAgentAliasArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AgentFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.AgentFlowNodeConfigurationProperty):
          AgentFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AgentFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.AgentFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.AgentFlowNodeConfigurationProperty
    }
  }

  /**
   * Defines a condition node in your flow.
   *
   * You can specify conditions that determine which node comes next in the flow. For more
   * information, see [Node types in Amazon Bedrock
   * works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon
   * Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ConditionFlowNodeConfigurationProperty conditionFlowNodeConfigurationProperty =
   * ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-conditionflownodeconfiguration.html)
   */
  public interface ConditionFlowNodeConfigurationProperty {
    /**
     * An array of conditions.
     *
     * Each member contains the name of a condition and an expression that defines the condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-conditionflownodeconfiguration.html#cfn-bedrock-flow-conditionflownodeconfiguration-conditions)
     */
    public fun conditions(): Any

    /**
     * A builder for [ConditionFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      public fun conditions(vararg conditions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.ConditionFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.ConditionFlowNodeConfigurationProperty.builder()

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditions An array of conditions. 
       * Each member contains the name of a condition and an expression that defines the condition.
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.ConditionFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.ConditionFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ConditionFlowNodeConfigurationProperty {
      /**
       * An array of conditions.
       *
       * Each member contains the name of a condition and an expression that defines the condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-conditionflownodeconfiguration.html#cfn-bedrock-flow-conditionflownodeconfiguration-conditions)
       */
      override fun conditions(): Any = unwrap(this).getConditions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConditionFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.ConditionFlowNodeConfigurationProperty):
          ConditionFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConditionFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.ConditionFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.ConditionFlowNodeConfigurationProperty
    }
  }

  /**
   * Defines a condition in the condition node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConditionProperty flowConditionProperty = FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowcondition.html)
   */
  public interface FlowConditionProperty {
    /**
     * Defines the condition.
     *
     * You must refer to at least one of the inputs in the condition. For more information, expand
     * the Condition node section in [Node types in prompt
     * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowcondition.html#cfn-bedrock-flow-flowcondition-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * A name for the condition that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowcondition.html#cfn-bedrock-flow-flowcondition-name)
     */
    public fun name(): String

    /**
     * A builder for [FlowConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression Defines the condition.
       * You must refer to at least one of the inputs in the condition. For more information, expand
       * the Condition node section in [Node types in prompt
       * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
       * .
       */
      public fun expression(expression: String)

      /**
       * @param name A name for the condition that you can reference. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionProperty.builder()

      /**
       * @param expression Defines the condition.
       * You must refer to at least one of the inputs in the condition. For more information, expand
       * the Condition node section in [Node types in prompt
       * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
       * .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param name A name for the condition that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionProperty,
    ) : CdkObject(cdkObject),
        FlowConditionProperty {
      /**
       * Defines the condition.
       *
       * You must refer to at least one of the inputs in the condition. For more information, expand
       * the Condition node section in [Node types in prompt
       * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowcondition.html#cfn-bedrock-flow-flowcondition-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * A name for the condition that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowcondition.html#cfn-bedrock-flow-flowcondition-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionProperty):
          FlowConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConditionProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionProperty
    }
  }

  /**
   * The configuration of a connection between a condition node and another node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConditionalConnectionConfigurationProperty flowConditionalConnectionConfigurationProperty =
   * FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconditionalconnectionconfiguration.html)
   */
  public interface FlowConditionalConnectionConfigurationProperty {
    /**
     * The condition that triggers this connection.
     *
     * For more information about how to write conditions, see the *Condition* node type in the
     * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in the
     * Amazon Bedrock User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconditionalconnectionconfiguration.html#cfn-bedrock-flow-flowconditionalconnectionconfiguration-condition)
     */
    public fun condition(): String

    /**
     * A builder for [FlowConditionalConnectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition The condition that triggers this connection. 
       * For more information about how to write conditions, see the *Condition* node type in the
       * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in
       * the Amazon Bedrock User Guide.
       */
      public fun condition(condition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionalConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionalConnectionConfigurationProperty.builder()

      /**
       * @param condition The condition that triggers this connection. 
       * For more information about how to write conditions, see the *Condition* node type in the
       * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in
       * the Amazon Bedrock User Guide.
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionalConnectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionalConnectionConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowConditionalConnectionConfigurationProperty {
      /**
       * The condition that triggers this connection.
       *
       * For more information about how to write conditions, see the *Condition* node type in the
       * [Node types](https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html) topic in
       * the Amazon Bedrock User Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconditionalconnectionconfiguration.html#cfn-bedrock-flow-flowconditionalconnectionconfiguration-condition)
       */
      override fun condition(): String = unwrap(this).getCondition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlowConditionalConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionalConnectionConfigurationProperty):
          FlowConditionalConnectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowConditionalConnectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConditionalConnectionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionalConnectionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConditionalConnectionConfigurationProperty
    }
  }

  /**
   * The configuration of the connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConnectionConfigurationProperty flowConnectionConfigurationProperty =
   * FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnectionconfiguration.html)
   */
  public interface FlowConnectionConfigurationProperty {
    /**
     * The configuration of a connection originating from a Condition node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnectionconfiguration.html#cfn-bedrock-flow-flowconnectionconfiguration-conditional)
     */
    public fun conditional(): Any? = unwrap(this).getConditional()

    /**
     * The configuration of a connection originating from a node that isn't a Condition node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnectionconfiguration.html#cfn-bedrock-flow-flowconnectionconfiguration-data)
     */
    public fun `data`(): Any? = unwrap(this).getData()

    /**
     * A builder for [FlowConnectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      public fun conditional(conditional: IResolvable)

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      public fun conditional(conditional: FlowConditionalConnectionConfigurationProperty)

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b918bfbec3a05265cd61377bed07b33a6d62b0a11765e8ac572fa980904870f4")
      public
          fun conditional(conditional: FlowConditionalConnectionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      public fun `data`(`data`: IResolvable)

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      public fun `data`(`data`: FlowDataConnectionConfigurationProperty)

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a4074f1e502f30ff011aebc05800e440d0aee33eb0f20c6751d817b46960077")
      public fun `data`(`data`: FlowDataConnectionConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionConfigurationProperty.builder()

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      override fun conditional(conditional: IResolvable) {
        cdkBuilder.conditional(conditional.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      override fun conditional(conditional: FlowConditionalConnectionConfigurationProperty) {
        cdkBuilder.conditional(conditional.let(FlowConditionalConnectionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param conditional The configuration of a connection originating from a Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b918bfbec3a05265cd61377bed07b33a6d62b0a11765e8ac572fa980904870f4")
      override
          fun conditional(conditional: FlowConditionalConnectionConfigurationProperty.Builder.() -> Unit):
          Unit = conditional(FlowConditionalConnectionConfigurationProperty(conditional))

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      override fun `data`(`data`: IResolvable) {
        cdkBuilder.`data`(`data`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      override fun `data`(`data`: FlowDataConnectionConfigurationProperty) {
        cdkBuilder.`data`(`data`.let(FlowDataConnectionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param data The configuration of a connection originating from a node that isn't a
       * Condition node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a4074f1e502f30ff011aebc05800e440d0aee33eb0f20c6751d817b46960077")
      override fun `data`(`data`: FlowDataConnectionConfigurationProperty.Builder.() -> Unit): Unit
          = `data`(FlowDataConnectionConfigurationProperty(`data`))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowConnectionConfigurationProperty {
      /**
       * The configuration of a connection originating from a Condition node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnectionconfiguration.html#cfn-bedrock-flow-flowconnectionconfiguration-conditional)
       */
      override fun conditional(): Any? = unwrap(this).getConditional()

      /**
       * The configuration of a connection originating from a node that isn't a Condition node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnectionconfiguration.html#cfn-bedrock-flow-flowconnectionconfiguration-data)
       */
      override fun `data`(): Any? = unwrap(this).getData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlowConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionConfigurationProperty):
          FlowConnectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowConnectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConnectionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionConfigurationProperty
    }
  }

  /**
   * Contains information about a connection between two nodes in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowConnectionProperty flowConnectionProperty = FlowConnectionProperty.builder()
   * .name("name")
   * .source("source")
   * .target("target")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html)
   */
  public interface FlowConnectionProperty {
    /**
     * The configuration of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * A name for the connection that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-name)
     */
    public fun name(): String

    /**
     * The node that the connection starts at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-source)
     */
    public fun source(): String

    /**
     * The node that the connection ends at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-target)
     */
    public fun target(): String

    /**
     * Whether the source node that the connection begins from is a condition node ( `Conditional` )
     * or not ( `Data` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowConnectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configuration The configuration of the connection.
       */
      public fun configuration(configuration: IResolvable)

      /**
       * @param configuration The configuration of the connection.
       */
      public fun configuration(configuration: FlowConnectionConfigurationProperty)

      /**
       * @param configuration The configuration of the connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85b76b679a07b1300d1554d54ec5b195e4242416f10fa20f20e9ff863c22a195")
      public
          fun configuration(configuration: FlowConnectionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param name A name for the connection that you can reference. 
       */
      public fun name(name: String)

      /**
       * @param source The node that the connection starts at. 
       */
      public fun source(source: String)

      /**
       * @param target The node that the connection ends at. 
       */
      public fun target(target: String)

      /**
       * @param type Whether the source node that the connection begins from is a condition node (
       * `Conditional` ) or not ( `Data` ). 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionProperty.builder()

      /**
       * @param configuration The configuration of the connection.
       */
      override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configuration The configuration of the connection.
       */
      override fun configuration(configuration: FlowConnectionConfigurationProperty) {
        cdkBuilder.configuration(configuration.let(FlowConnectionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param configuration The configuration of the connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85b76b679a07b1300d1554d54ec5b195e4242416f10fa20f20e9ff863c22a195")
      override
          fun configuration(configuration: FlowConnectionConfigurationProperty.Builder.() -> Unit):
          Unit = configuration(FlowConnectionConfigurationProperty(configuration))

      /**
       * @param name A name for the connection that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param source The node that the connection starts at. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param target The node that the connection ends at. 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param type Whether the source node that the connection begins from is a condition node (
       * `Conditional` ) or not ( `Data` ). 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionProperty,
    ) : CdkObject(cdkObject),
        FlowConnectionProperty {
      /**
       * The configuration of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * A name for the connection that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The node that the connection starts at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The node that the connection ends at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-target)
       */
      override fun target(): String = unwrap(this).getTarget()

      /**
       * Whether the source node that the connection begins from is a condition node ( `Conditional`
       * ) or not ( `Data` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowconnection.html#cfn-bedrock-flow-flowconnection-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowConnectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionProperty):
          FlowConnectionProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowConnectionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowConnectionProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowConnectionProperty
    }
  }

  /**
   * The configuration of a connection originating from a node that isn't a Condition node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowDataConnectionConfigurationProperty flowDataConnectionConfigurationProperty =
   * FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdataconnectionconfiguration.html)
   */
  public interface FlowDataConnectionConfigurationProperty {
    /**
     * The name of the output in the source node that the connection begins from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdataconnectionconfiguration.html#cfn-bedrock-flow-flowdataconnectionconfiguration-sourceoutput)
     */
    public fun sourceOutput(): String

    /**
     * The name of the input in the target node that the connection ends at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdataconnectionconfiguration.html#cfn-bedrock-flow-flowdataconnectionconfiguration-targetinput)
     */
    public fun targetInput(): String

    /**
     * A builder for [FlowDataConnectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceOutput The name of the output in the source node that the connection begins
       * from. 
       */
      public fun sourceOutput(sourceOutput: String)

      /**
       * @param targetInput The name of the input in the target node that the connection ends at. 
       */
      public fun targetInput(targetInput: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDataConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDataConnectionConfigurationProperty.builder()

      /**
       * @param sourceOutput The name of the output in the source node that the connection begins
       * from. 
       */
      override fun sourceOutput(sourceOutput: String) {
        cdkBuilder.sourceOutput(sourceOutput)
      }

      /**
       * @param targetInput The name of the input in the target node that the connection ends at. 
       */
      override fun targetInput(targetInput: String) {
        cdkBuilder.targetInput(targetInput)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDataConnectionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowDataConnectionConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowDataConnectionConfigurationProperty {
      /**
       * The name of the output in the source node that the connection begins from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdataconnectionconfiguration.html#cfn-bedrock-flow-flowdataconnectionconfiguration-sourceoutput)
       */
      override fun sourceOutput(): String = unwrap(this).getSourceOutput()

      /**
       * The name of the input in the target node that the connection ends at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdataconnectionconfiguration.html#cfn-bedrock-flow-flowdataconnectionconfiguration-targetinput)
       */
      override fun targetInput(): String = unwrap(this).getTargetInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlowDataConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowDataConnectionConfigurationProperty):
          FlowDataConnectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowDataConnectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowDataConnectionConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDataConnectionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDataConnectionConfigurationProperty
    }
  }

  /**
   * The definition of the nodes and connections between nodes in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object collector;
   * Object input;
   * Object iterator;
   * Object output;
   * FlowDefinitionProperty flowDefinitionProperty = FlowDefinitionProperty.builder()
   * .connections(List.of(FlowConnectionProperty.builder()
   * .name("name")
   * .source("source")
   * .target("target")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowConnectionConfigurationProperty.builder()
   * .conditional(FlowConditionalConnectionConfigurationProperty.builder()
   * .condition("condition")
   * .build())
   * .data(FlowDataConnectionConfigurationProperty.builder()
   * .sourceOutput("sourceOutput")
   * .targetInput("targetInput")
   * .build())
   * .build())
   * .build()))
   * .nodes(List.of(FlowNodeProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowNodeConfigurationProperty.builder()
   * .agent(AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build())
   * .collector(collector)
   * .condition(ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build())
   * .input(input)
   * .iterator(iterator)
   * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .modelId("modelId")
   * .build())
   * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .lex(LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build())
   * .output(output)
   * .prompt(PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
   * .modelId("modelId")
   * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * .build())
   * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .storage(StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .build())
   * .inputs(List.of(FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build()))
   * .outputs(List.of(FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
   */
  public interface FlowDefinitionProperty {
    /**
     * An array of connection definitions in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html#cfn-bedrock-flow-flowdefinition-connections)
     */
    public fun connections(): Any? = unwrap(this).getConnections()

    /**
     * An array of node definitions in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html#cfn-bedrock-flow-flowdefinition-nodes)
     */
    public fun nodes(): Any? = unwrap(this).getNodes()

    /**
     * A builder for [FlowDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connections An array of connection definitions in the flow.
       */
      public fun connections(connections: IResolvable)

      /**
       * @param connections An array of connection definitions in the flow.
       */
      public fun connections(connections: List<Any>)

      /**
       * @param connections An array of connection definitions in the flow.
       */
      public fun connections(vararg connections: Any)

      /**
       * @param nodes An array of node definitions in the flow.
       */
      public fun nodes(nodes: IResolvable)

      /**
       * @param nodes An array of node definitions in the flow.
       */
      public fun nodes(nodes: List<Any>)

      /**
       * @param nodes An array of node definitions in the flow.
       */
      public fun nodes(vararg nodes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDefinitionProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDefinitionProperty.builder()

      /**
       * @param connections An array of connection definitions in the flow.
       */
      override fun connections(connections: IResolvable) {
        cdkBuilder.connections(connections.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param connections An array of connection definitions in the flow.
       */
      override fun connections(connections: List<Any>) {
        cdkBuilder.connections(connections.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param connections An array of connection definitions in the flow.
       */
      override fun connections(vararg connections: Any): Unit = connections(connections.toList())

      /**
       * @param nodes An array of node definitions in the flow.
       */
      override fun nodes(nodes: IResolvable) {
        cdkBuilder.nodes(nodes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nodes An array of node definitions in the flow.
       */
      override fun nodes(nodes: List<Any>) {
        cdkBuilder.nodes(nodes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param nodes An array of node definitions in the flow.
       */
      override fun nodes(vararg nodes: Any): Unit = nodes(nodes.toList())

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.FlowDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowDefinitionProperty,
    ) : CdkObject(cdkObject),
        FlowDefinitionProperty {
      /**
       * An array of connection definitions in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html#cfn-bedrock-flow-flowdefinition-connections)
       */
      override fun connections(): Any? = unwrap(this).getConnections()

      /**
       * An array of node definitions in the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html#cfn-bedrock-flow-flowdefinition-nodes)
       */
      override fun nodes(): Any? = unwrap(this).getNodes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowDefinitionProperty):
          FlowDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowDefinitionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowDefinitionProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDefinitionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowDefinitionProperty
    }
  }

  /**
   * Contains configurations for a node in your flow.
   *
   * For more information, see [Node types in Amazon Bedrock
   * works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon
   * Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object collector;
   * Object input;
   * Object iterator;
   * Object output;
   * FlowNodeConfigurationProperty flowNodeConfigurationProperty =
   * FlowNodeConfigurationProperty.builder()
   * .agent(AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build())
   * .collector(collector)
   * .condition(ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build())
   * .input(input)
   * .iterator(iterator)
   * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .modelId("modelId")
   * .build())
   * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .lex(LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build())
   * .output(output)
   * .prompt(PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
   * .modelId("modelId")
   * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * .build())
   * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .storage(StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html)
   */
  public interface FlowNodeConfigurationProperty {
    /**
     * Contains configurations for an agent node in your flow.
     *
     * Invokes an alias of an agent and returns the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-agent)
     */
    public fun agent(): Any? = unwrap(this).getAgent()

    /**
     * Contains configurations for a collector node in your flow.
     *
     * Collects an iteration of inputs and consolidates them into an array of outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-collector)
     */
    public fun collector(): Any? = unwrap(this).getCollector()

    /**
     * Contains configurations for a Condition node in your flow.
     *
     * Defines conditions that lead to different branches of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-condition)
     */
    public fun condition(): Any? = unwrap(this).getCondition()

    /**
     * Contains configurations for an input flow node in your flow.
     *
     * The first node in the flow. `inputs` can't be specified for this node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-input)
     */
    public fun input(): Any? = unwrap(this).getInput()

    /**
     * Contains configurations for an iterator node in your flow.
     *
     * Takes an input that is an array and iteratively sends each item of the array as an output to
     * the following node. The size of the array is also returned in the output.
     *
     * The output flow node at the end of the flow iteration will return a response for each member
     * of the array. To return only one response, you can include a collector node downstream from the
     * iterator node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-iterator)
     */
    public fun iterator(): Any? = unwrap(this).getIterator()

    /**
     * Contains configurations for a knowledge base node in your flow.
     *
     * Queries a knowledge base and returns the retrieved results or generated response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-knowledgebase)
     */
    public fun knowledgeBase(): Any? = unwrap(this).getKnowledgeBase()

    /**
     * Contains configurations for a Lambda function node in your flow.
     *
     * Invokes an AWS Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-lambdafunction)
     */
    public fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

    /**
     * Contains configurations for a Lex node in your flow.
     *
     * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-lex)
     */
    public fun lex(): Any? = unwrap(this).getLex()

    /**
     * Contains configurations for an output flow node in your flow.
     *
     * The last node in the flow. `outputs` can't be specified for this node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-output)
     */
    public fun output(): Any? = unwrap(this).getOutput()

    /**
     * Contains configurations for a prompt node in your flow.
     *
     * Runs a prompt and generates the model response as the output. You can use a prompt from
     * Prompt management or you can configure one in this node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-prompt)
     */
    public fun prompt(): Any? = unwrap(this).getPrompt()

    /**
     * Contains configurations for a Retrieval node in your flow.
     *
     * Retrieves data from an Amazon S3 location and returns it as the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-retrieval)
     */
    public fun retrieval(): Any? = unwrap(this).getRetrieval()

    /**
     * Contains configurations for a Storage node in your flow.
     *
     * Stores an input in an Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-storage)
     */
    public fun storage(): Any? = unwrap(this).getStorage()

    /**
     * A builder for [FlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      public fun agent(agent: IResolvable)

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      public fun agent(agent: AgentFlowNodeConfigurationProperty)

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("619acf463d1b3ebcd4ff309cab8c2b5a1abcae02ca23247ed0eadb43f17d01b0")
      public fun agent(agent: AgentFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param collector Contains configurations for a collector node in your flow.
       * Collects an iteration of inputs and consolidates them into an array of outputs.
       */
      public fun collector(collector: Any)

      /**
       * @param condition Contains configurations for a Condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      public fun condition(condition: IResolvable)

      /**
       * @param condition Contains configurations for a Condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      public fun condition(condition: ConditionFlowNodeConfigurationProperty)

      /**
       * @param condition Contains configurations for a Condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f846f2c8dd0e3474c40ea04293f21251f9b90067d9566892608d779ed792dd6d")
      public fun condition(condition: ConditionFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param input Contains configurations for an input flow node in your flow.
       * The first node in the flow. `inputs` can't be specified for this node.
       */
      public fun input(input: Any)

      /**
       * @param iterator Contains configurations for an iterator node in your flow.
       * Takes an input that is an array and iteratively sends each item of the array as an output
       * to the following node. The size of the array is also returned in the output.
       *
       * The output flow node at the end of the flow iteration will return a response for each
       * member of the array. To return only one response, you can include a collector node downstream
       * from the iterator node.
       */
      public fun iterator(iterator: Any)

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      public fun knowledgeBase(knowledgeBase: IResolvable)

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      public fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty)

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25141d0a178025401067d32b26414c5fc96fe9be0498057c0aafc7280a4d4ae4")
      public
          fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      public fun lambdaFunction(lambdaFunction: IResolvable)

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      public fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty)

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4237e1347c9bdc9bd05c4ac7e3ecb35e9f698314044c859d5fefb3a25a3f8de3")
      public
          fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      public fun lex(lex: IResolvable)

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      public fun lex(lex: LexFlowNodeConfigurationProperty)

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5553dcf393090dcc197c5be2beb5f6063dd6677efb35717411dcd848f91b9efe")
      public fun lex(lex: LexFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param output Contains configurations for an output flow node in your flow.
       * The last node in the flow. `outputs` can't be specified for this node.
       */
      public fun output(output: Any)

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      public fun prompt(prompt: IResolvable)

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      public fun prompt(prompt: PromptFlowNodeConfigurationProperty)

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5debac002e8ac80f7844a9564e8beefac1959e07dd903ce4d7a86246103ef529")
      public fun prompt(prompt: PromptFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param retrieval Contains configurations for a Retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      public fun retrieval(retrieval: IResolvable)

      /**
       * @param retrieval Contains configurations for a Retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      public fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty)

      /**
       * @param retrieval Contains configurations for a Retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d37f7218587ea6dcd7e1eec62aa87d882025b15f8f7aedd55622f82d6b6483f")
      public fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param storage Contains configurations for a Storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      public fun storage(storage: IResolvable)

      /**
       * @param storage Contains configurations for a Storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      public fun storage(storage: StorageFlowNodeConfigurationProperty)

      /**
       * @param storage Contains configurations for a Storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40f852e20d8113ba32413735a11a0d1f65a3d6e22b14343cd9c8ed0ca348fc44")
      public fun storage(storage: StorageFlowNodeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeConfigurationProperty.builder()

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      override fun agent(agent: IResolvable) {
        cdkBuilder.agent(agent.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      override fun agent(agent: AgentFlowNodeConfigurationProperty) {
        cdkBuilder.agent(agent.let(AgentFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param agent Contains configurations for an agent node in your flow.
       * Invokes an alias of an agent and returns the response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("619acf463d1b3ebcd4ff309cab8c2b5a1abcae02ca23247ed0eadb43f17d01b0")
      override fun agent(agent: AgentFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          agent(AgentFlowNodeConfigurationProperty(agent))

      /**
       * @param collector Contains configurations for a collector node in your flow.
       * Collects an iteration of inputs and consolidates them into an array of outputs.
       */
      override fun collector(collector: Any) {
        cdkBuilder.collector(collector)
      }

      /**
       * @param condition Contains configurations for a Condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param condition Contains configurations for a Condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      override fun condition(condition: ConditionFlowNodeConfigurationProperty) {
        cdkBuilder.condition(condition.let(ConditionFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param condition Contains configurations for a Condition node in your flow.
       * Defines conditions that lead to different branches of the flow.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f846f2c8dd0e3474c40ea04293f21251f9b90067d9566892608d779ed792dd6d")
      override fun condition(condition: ConditionFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = condition(ConditionFlowNodeConfigurationProperty(condition))

      /**
       * @param input Contains configurations for an input flow node in your flow.
       * The first node in the flow. `inputs` can't be specified for this node.
       */
      override fun input(input: Any) {
        cdkBuilder.input(input)
      }

      /**
       * @param iterator Contains configurations for an iterator node in your flow.
       * Takes an input that is an array and iteratively sends each item of the array as an output
       * to the following node. The size of the array is also returned in the output.
       *
       * The output flow node at the end of the flow iteration will return a response for each
       * member of the array. To return only one response, you can include a collector node downstream
       * from the iterator node.
       */
      override fun iterator(iterator: Any) {
        cdkBuilder.iterator(iterator)
      }

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      override fun knowledgeBase(knowledgeBase: IResolvable) {
        cdkBuilder.knowledgeBase(knowledgeBase.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      override fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty) {
        cdkBuilder.knowledgeBase(knowledgeBase.let(KnowledgeBaseFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param knowledgeBase Contains configurations for a knowledge base node in your flow.
       * Queries a knowledge base and returns the retrieved results or generated response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25141d0a178025401067d32b26414c5fc96fe9be0498057c0aafc7280a4d4ae4")
      override
          fun knowledgeBase(knowledgeBase: KnowledgeBaseFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty(knowledgeBase))

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      override fun lambdaFunction(lambdaFunction: IResolvable) {
        cdkBuilder.lambdaFunction(lambdaFunction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      override fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty) {
        cdkBuilder.lambdaFunction(lambdaFunction.let(LambdaFunctionFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param lambdaFunction Contains configurations for a Lambda function node in your flow.
       * Invokes an AWS Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4237e1347c9bdc9bd05c4ac7e3ecb35e9f698314044c859d5fefb3a25a3f8de3")
      override
          fun lambdaFunction(lambdaFunction: LambdaFunctionFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty(lambdaFunction))

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      override fun lex(lex: IResolvable) {
        cdkBuilder.lex(lex.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      override fun lex(lex: LexFlowNodeConfigurationProperty) {
        cdkBuilder.lex(lex.let(LexFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param lex Contains configurations for a Lex node in your flow.
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5553dcf393090dcc197c5be2beb5f6063dd6677efb35717411dcd848f91b9efe")
      override fun lex(lex: LexFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          lex(LexFlowNodeConfigurationProperty(lex))

      /**
       * @param output Contains configurations for an output flow node in your flow.
       * The last node in the flow. `outputs` can't be specified for this node.
       */
      override fun output(output: Any) {
        cdkBuilder.output(output)
      }

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      override fun prompt(prompt: IResolvable) {
        cdkBuilder.prompt(prompt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      override fun prompt(prompt: PromptFlowNodeConfigurationProperty) {
        cdkBuilder.prompt(prompt.let(PromptFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param prompt Contains configurations for a prompt node in your flow.
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5debac002e8ac80f7844a9564e8beefac1959e07dd903ce4d7a86246103ef529")
      override fun prompt(prompt: PromptFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          prompt(PromptFlowNodeConfigurationProperty(prompt))

      /**
       * @param retrieval Contains configurations for a Retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      override fun retrieval(retrieval: IResolvable) {
        cdkBuilder.retrieval(retrieval.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param retrieval Contains configurations for a Retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      override fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty) {
        cdkBuilder.retrieval(retrieval.let(RetrievalFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param retrieval Contains configurations for a Retrieval node in your flow.
       * Retrieves data from an Amazon S3 location and returns it as the output.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d37f7218587ea6dcd7e1eec62aa87d882025b15f8f7aedd55622f82d6b6483f")
      override fun retrieval(retrieval: RetrievalFlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = retrieval(RetrievalFlowNodeConfigurationProperty(retrieval))

      /**
       * @param storage Contains configurations for a Storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      override fun storage(storage: IResolvable) {
        cdkBuilder.storage(storage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param storage Contains configurations for a Storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      override fun storage(storage: StorageFlowNodeConfigurationProperty) {
        cdkBuilder.storage(storage.let(StorageFlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param storage Contains configurations for a Storage node in your flow.
       * Stores an input in an Amazon S3 location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40f852e20d8113ba32413735a11a0d1f65a3d6e22b14343cd9c8ed0ca348fc44")
      override fun storage(storage: StorageFlowNodeConfigurationProperty.Builder.() -> Unit): Unit =
          storage(StorageFlowNodeConfigurationProperty(storage))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlowNodeConfigurationProperty {
      /**
       * Contains configurations for an agent node in your flow.
       *
       * Invokes an alias of an agent and returns the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-agent)
       */
      override fun agent(): Any? = unwrap(this).getAgent()

      /**
       * Contains configurations for a collector node in your flow.
       *
       * Collects an iteration of inputs and consolidates them into an array of outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-collector)
       */
      override fun collector(): Any? = unwrap(this).getCollector()

      /**
       * Contains configurations for a Condition node in your flow.
       *
       * Defines conditions that lead to different branches of the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-condition)
       */
      override fun condition(): Any? = unwrap(this).getCondition()

      /**
       * Contains configurations for an input flow node in your flow.
       *
       * The first node in the flow. `inputs` can't be specified for this node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-input)
       */
      override fun input(): Any? = unwrap(this).getInput()

      /**
       * Contains configurations for an iterator node in your flow.
       *
       * Takes an input that is an array and iteratively sends each item of the array as an output
       * to the following node. The size of the array is also returned in the output.
       *
       * The output flow node at the end of the flow iteration will return a response for each
       * member of the array. To return only one response, you can include a collector node downstream
       * from the iterator node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-iterator)
       */
      override fun iterator(): Any? = unwrap(this).getIterator()

      /**
       * Contains configurations for a knowledge base node in your flow.
       *
       * Queries a knowledge base and returns the retrieved results or generated response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-knowledgebase)
       */
      override fun knowledgeBase(): Any? = unwrap(this).getKnowledgeBase()

      /**
       * Contains configurations for a Lambda function node in your flow.
       *
       * Invokes an AWS Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-lambdafunction)
       */
      override fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

      /**
       * Contains configurations for a Lex node in your flow.
       *
       * Invokes an Amazon Lex bot to identify the intent of the input and return the intent as the
       * output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-lex)
       */
      override fun lex(): Any? = unwrap(this).getLex()

      /**
       * Contains configurations for an output flow node in your flow.
       *
       * The last node in the flow. `outputs` can't be specified for this node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-output)
       */
      override fun output(): Any? = unwrap(this).getOutput()

      /**
       * Contains configurations for a prompt node in your flow.
       *
       * Runs a prompt and generates the model response as the output. You can use a prompt from
       * Prompt management or you can configure one in this node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-prompt)
       */
      override fun prompt(): Any? = unwrap(this).getPrompt()

      /**
       * Contains configurations for a Retrieval node in your flow.
       *
       * Retrieves data from an Amazon S3 location and returns it as the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-retrieval)
       */
      override fun retrieval(): Any? = unwrap(this).getRetrieval()

      /**
       * Contains configurations for a Storage node in your flow.
       *
       * Stores an input in an Amazon S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeconfiguration.html#cfn-bedrock-flow-flownodeconfiguration-storage)
       */
      override fun storage(): Any? = unwrap(this).getStorage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeConfigurationProperty):
          FlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for an input to a node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowNodeInputProperty flowNodeInputProperty = FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeinput.html)
   */
  public interface FlowNodeInputProperty {
    /**
     * An expression that formats the input for the node.
     *
     * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
     * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeinput.html#cfn-bedrock-flow-flownodeinput-expression)
     */
    public fun expression(): String

    /**
     * A name for the input that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeinput.html#cfn-bedrock-flow-flownodeinput-name)
     */
    public fun name(): String

    /**
     * The data type of the input.
     *
     * If the input doesn't match this type at runtime, a validation error will be thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeinput.html#cfn-bedrock-flow-flownodeinput-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowNodeInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression An expression that formats the input for the node. 
       * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
       * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
       */
      public fun expression(expression: String)

      /**
       * @param name A name for the input that you can reference. 
       */
      public fun name(name: String)

      /**
       * @param type The data type of the input. 
       * If the input doesn't match this type at runtime, a validation error will be thrown.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeInputProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeInputProperty.builder()

      /**
       * @param expression An expression that formats the input for the node. 
       * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
       * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param name A name for the input that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The data type of the input. 
       * If the input doesn't match this type at runtime, a validation error will be thrown.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeInputProperty,
    ) : CdkObject(cdkObject),
        FlowNodeInputProperty {
      /**
       * An expression that formats the input for the node.
       *
       * For an explanation of how to create expressions, see [Expressions in Prompt flows in Amazon
       * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-expressions.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeinput.html#cfn-bedrock-flow-flownodeinput-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * A name for the input that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeinput.html#cfn-bedrock-flow-flownodeinput-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The data type of the input.
       *
       * If the input doesn't match this type at runtime, a validation error will be thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeinput.html#cfn-bedrock-flow-flownodeinput-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeInputProperty):
          FlowNodeInputProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowNodeInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeInputProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeInputProperty
    }
  }

  /**
   * Contains configurations for an output from a node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowNodeOutputProperty flowNodeOutputProperty = FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeoutput.html)
   */
  public interface FlowNodeOutputProperty {
    /**
     * A name for the output that you can reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeoutput.html#cfn-bedrock-flow-flownodeoutput-name)
     */
    public fun name(): String

    /**
     * The data type of the output.
     *
     * If the output doesn't match this type at runtime, a validation error will be thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeoutput.html#cfn-bedrock-flow-flownodeoutput-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowNodeOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name A name for the output that you can reference. 
       */
      public fun name(name: String)

      /**
       * @param type The data type of the output. 
       * If the output doesn't match this type at runtime, a validation error will be thrown.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeOutputProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeOutputProperty.builder()

      /**
       * @param name A name for the output that you can reference. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The data type of the output. 
       * If the output doesn't match this type at runtime, a validation error will be thrown.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeOutputProperty,
    ) : CdkObject(cdkObject),
        FlowNodeOutputProperty {
      /**
       * A name for the output that you can reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeoutput.html#cfn-bedrock-flow-flownodeoutput-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The data type of the output.
       *
       * If the output doesn't match this type at runtime, a validation error will be thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownodeoutput.html#cfn-bedrock-flow-flownodeoutput-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeOutputProperty):
          FlowNodeOutputProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowNodeOutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeOutputProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeOutputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeOutputProperty
    }
  }

  /**
   * Contains configurations about a node in the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object collector;
   * Object input;
   * Object iterator;
   * Object output;
   * FlowNodeProperty flowNodeProperty = FlowNodeProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .configuration(FlowNodeConfigurationProperty.builder()
   * .agent(AgentFlowNodeConfigurationProperty.builder()
   * .agentAliasArn("agentAliasArn")
   * .build())
   * .collector(collector)
   * .condition(ConditionFlowNodeConfigurationProperty.builder()
   * .conditions(List.of(FlowConditionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .expression("expression")
   * .build()))
   * .build())
   * .input(input)
   * .iterator(iterator)
   * .knowledgeBase(KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .modelId("modelId")
   * .build())
   * .lambdaFunction(LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build())
   * .lex(LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build())
   * .output(output)
   * .prompt(PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
   * .modelId("modelId")
   * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * .build())
   * .retrieval(RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .storage(StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build())
   * .build())
   * .inputs(List.of(FlowNodeInputProperty.builder()
   * .expression("expression")
   * .name("name")
   * .type("type")
   * .build()))
   * .outputs(List.of(FlowNodeOutputProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html)
   */
  public interface FlowNodeProperty {
    /**
     * Contains configurations for the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * An array of objects, each of which contains information about an input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-inputs)
     */
    public fun inputs(): Any? = unwrap(this).getInputs()

    /**
     * A name for the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-name)
     */
    public fun name(): String

    /**
     * A list of objects, each of which contains information about an output from the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-outputs)
     */
    public fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * The type of node.
     *
     * This value must match the name of the key that you provide in the configuration you provide
     * in the `FlowNodeConfiguration` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-type)
     */
    public fun type(): String

    /**
     * A builder for [FlowNodeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configuration Contains configurations for the node.
       */
      public fun configuration(configuration: IResolvable)

      /**
       * @param configuration Contains configurations for the node.
       */
      public fun configuration(configuration: FlowNodeConfigurationProperty)

      /**
       * @param configuration Contains configurations for the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f73d6eeec65444cf4483408136f21c263577319bc4a5045cb5bc07cce0e63b40")
      public fun configuration(configuration: FlowNodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      public fun inputs(inputs: IResolvable)

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      public fun inputs(inputs: List<Any>)

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      public fun inputs(vararg inputs: Any)

      /**
       * @param name A name for the node. 
       */
      public fun name(name: String)

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      public fun outputs(outputs: IResolvable)

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      public fun outputs(outputs: List<Any>)

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      public fun outputs(vararg outputs: Any)

      /**
       * @param type The type of node. 
       * This value must match the name of the key that you provide in the configuration you provide
       * in the `FlowNodeConfiguration` field.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeProperty.builder()

      /**
       * @param configuration Contains configurations for the node.
       */
      override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configuration Contains configurations for the node.
       */
      override fun configuration(configuration: FlowNodeConfigurationProperty) {
        cdkBuilder.configuration(configuration.let(FlowNodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param configuration Contains configurations for the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f73d6eeec65444cf4483408136f21c263577319bc4a5045cb5bc07cce0e63b40")
      override fun configuration(configuration: FlowNodeConfigurationProperty.Builder.() -> Unit):
          Unit = configuration(FlowNodeConfigurationProperty(configuration))

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      override fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      override fun inputs(inputs: List<Any>) {
        cdkBuilder.inputs(inputs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputs An array of objects, each of which contains information about an input into
       * the node.
       */
      override fun inputs(vararg inputs: Any): Unit = inputs(inputs.toList())

      /**
       * @param name A name for the node. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      override fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      override fun outputs(outputs: List<Any>) {
        cdkBuilder.outputs(outputs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param outputs A list of objects, each of which contains information about an output from
       * the node.
       */
      override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

      /**
       * @param type The type of node. 
       * This value must match the name of the key that you provide in the configuration you provide
       * in the `FlowNodeConfiguration` field.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeProperty,
    ) : CdkObject(cdkObject),
        FlowNodeProperty {
      /**
       * Contains configurations for the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * An array of objects, each of which contains information about an input into the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-inputs)
       */
      override fun inputs(): Any? = unwrap(this).getInputs()

      /**
       * A name for the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A list of objects, each of which contains information about an output from the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-outputs)
       */
      override fun outputs(): Any? = unwrap(this).getOutputs()

      /**
       * The type of node.
       *
       * This value must match the name of the key that you provide in the configuration you provide
       * in the `FlowNodeConfiguration` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flownode.html#cfn-bedrock-flow-flownode-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowNodeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeProperty):
          FlowNodeProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowNodeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowNodeProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnFlow.FlowNodeProperty
    }
  }

  /**
   * Contains information about validation of the flow.
   *
   * This data type is used in the following API operations:
   *
   * * [GetFlow
   * response](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html#API_agent_GetFlow_ResponseSyntax)
   * * [GetFlowVersion
   * response](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlowVersion.html#API_agent_GetFlowVersion_ResponseSyntax)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * FlowValidationProperty flowValidationProperty = FlowValidationProperty.builder()
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowvalidation.html)
   */
  public interface FlowValidationProperty {
    /**
     * A message describing the validation error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowvalidation.html#cfn-bedrock-flow-flowvalidation-message)
     */
    public fun message(): String

    /**
     * A builder for [FlowValidationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param message A message describing the validation error. 
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowValidationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowValidationProperty.builder()

      /**
       * @param message A message describing the validation error. 
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.FlowValidationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowValidationProperty,
    ) : CdkObject(cdkObject),
        FlowValidationProperty {
      /**
       * A message describing the validation error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowvalidation.html#cfn-bedrock-flow-flowvalidation-message)
       */
      override fun message(): String = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlowValidationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.FlowValidationProperty):
          FlowValidationProperty = CdkObjectWrappers.wrap(cdkObject) as? FlowValidationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowValidationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowValidationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.FlowValidationProperty
    }
  }

  /**
   * Contains configurations for a knowledge base node in a flow.
   *
   * This node takes a query as the input and returns, as the output, the retrieved responses
   * directly (as an array) or a response generated based on the retrieved responses. For more
   * information, see [Node types in Amazon Bedrock
   * works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the Amazon
   * Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * KnowledgeBaseFlowNodeConfigurationProperty knowledgeBaseFlowNodeConfigurationProperty =
   * KnowledgeBaseFlowNodeConfigurationProperty.builder()
   * .knowledgeBaseId("knowledgeBaseId")
   * // the properties below are optional
   * .modelId("modelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-knowledgebaseflownodeconfiguration.html)
   */
  public interface KnowledgeBaseFlowNodeConfigurationProperty {
    /**
     * The unique identifier of the knowledge base to query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flow-knowledgebaseflownodeconfiguration-knowledgebaseid)
     */
    public fun knowledgeBaseId(): String

    /**
     * The unique identifier of the model to use to generate a response from the query results.
     *
     * Omit this field if you want to return the retrieved results as an array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flow-knowledgebaseflownodeconfiguration-modelid)
     */
    public fun modelId(): String? = unwrap(this).getModelId()

    /**
     * A builder for [KnowledgeBaseFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param knowledgeBaseId The unique identifier of the knowledge base to query. 
       */
      public fun knowledgeBaseId(knowledgeBaseId: String)

      /**
       * @param modelId The unique identifier of the model to use to generate a response from the
       * query results.
       * Omit this field if you want to return the retrieved results as an array.
       */
      public fun modelId(modelId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.KnowledgeBaseFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.KnowledgeBaseFlowNodeConfigurationProperty.builder()

      /**
       * @param knowledgeBaseId The unique identifier of the knowledge base to query. 
       */
      override fun knowledgeBaseId(knowledgeBaseId: String) {
        cdkBuilder.knowledgeBaseId(knowledgeBaseId)
      }

      /**
       * @param modelId The unique identifier of the model to use to generate a response from the
       * query results.
       * Omit this field if you want to return the retrieved results as an array.
       */
      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.KnowledgeBaseFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.KnowledgeBaseFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        KnowledgeBaseFlowNodeConfigurationProperty {
      /**
       * The unique identifier of the knowledge base to query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flow-knowledgebaseflownodeconfiguration-knowledgebaseid)
       */
      override fun knowledgeBaseId(): String = unwrap(this).getKnowledgeBaseId()

      /**
       * The unique identifier of the model to use to generate a response from the query results.
       *
       * Omit this field if you want to return the retrieved results as an array.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-knowledgebaseflownodeconfiguration.html#cfn-bedrock-flow-knowledgebaseflownodeconfiguration-modelid)
       */
      override fun modelId(): String? = unwrap(this).getModelId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KnowledgeBaseFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.KnowledgeBaseFlowNodeConfigurationProperty):
          KnowledgeBaseFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KnowledgeBaseFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KnowledgeBaseFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.KnowledgeBaseFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.KnowledgeBaseFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a Lambda function node in the flow.
   *
   * You specify the Lambda function to invoke and the inputs into the function. The output is the
   * response that is defined in the Lambda function. For more information, see [Node types in Amazon
   * Bedrock works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the
   * Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * LambdaFunctionFlowNodeConfigurationProperty lambdaFunctionFlowNodeConfigurationProperty =
   * LambdaFunctionFlowNodeConfigurationProperty.builder()
   * .lambdaArn("lambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lambdafunctionflownodeconfiguration.html)
   */
  public interface LambdaFunctionFlowNodeConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Lambda function to invoke.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lambdafunctionflownodeconfiguration.html#cfn-bedrock-flow-lambdafunctionflownodeconfiguration-lambdaarn)
     */
    public fun lambdaArn(): String

    /**
     * A builder for [LambdaFunctionFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function to invoke. 
       */
      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.LambdaFunctionFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.LambdaFunctionFlowNodeConfigurationProperty.builder()

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function to invoke. 
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.LambdaFunctionFlowNodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.LambdaFunctionFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        LambdaFunctionFlowNodeConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Lambda function to invoke.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lambdafunctionflownodeconfiguration.html#cfn-bedrock-flow-lambdafunctionflownodeconfiguration-lambdaarn)
       */
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaFunctionFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.LambdaFunctionFlowNodeConfigurationProperty):
          LambdaFunctionFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaFunctionFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.LambdaFunctionFlowNodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.LambdaFunctionFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a Lex node in the flow.
   *
   * You specify a Amazon Lex bot to invoke. This node takes an utterance as the input and returns
   * as the output the intent identified by the Amazon Lex bot. For more information, see [Node types
   * in Amazon Bedrock works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in
   * the Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * LexFlowNodeConfigurationProperty lexFlowNodeConfigurationProperty =
   * LexFlowNodeConfigurationProperty.builder()
   * .botAliasArn("botAliasArn")
   * .localeId("localeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lexflownodeconfiguration.html)
   */
  public interface LexFlowNodeConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lexflownodeconfiguration.html#cfn-bedrock-flow-lexflownodeconfiguration-botaliasarn)
     */
    public fun botAliasArn(): String

    /**
     * The Region to invoke the Amazon Lex bot in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lexflownodeconfiguration.html#cfn-bedrock-flow-lexflownodeconfiguration-localeid)
     */
    public fun localeId(): String

    /**
     * A builder for [LexFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param botAliasArn The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke. 
       */
      public fun botAliasArn(botAliasArn: String)

      /**
       * @param localeId The Region to invoke the Amazon Lex bot in. 
       */
      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.LexFlowNodeConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.LexFlowNodeConfigurationProperty.builder()

      /**
       * @param botAliasArn The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke. 
       */
      override fun botAliasArn(botAliasArn: String) {
        cdkBuilder.botAliasArn(botAliasArn)
      }

      /**
       * @param localeId The Region to invoke the Amazon Lex bot in. 
       */
      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.LexFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.LexFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        LexFlowNodeConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon Lex bot alias to invoke.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lexflownodeconfiguration.html#cfn-bedrock-flow-lexflownodeconfiguration-botaliasarn)
       */
      override fun botAliasArn(): String = unwrap(this).getBotAliasArn()

      /**
       * The Region to invoke the Amazon Lex bot in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-lexflownodeconfiguration.html#cfn-bedrock-flow-lexflownodeconfiguration-localeid)
       */
      override fun localeId(): String = unwrap(this).getLocaleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LexFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.LexFlowNodeConfigurationProperty):
          LexFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LexFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LexFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.LexFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.LexFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt node in the flow.
   *
   * You can use a prompt from Prompt management or you can define one in this node. If the prompt
   * contains variables, the inputs into this node will fill in the variables. The output from this
   * node is the response generated by the model. For more information, see [Node types in Amazon
   * Bedrock works](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html) in the
   * Amazon Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeConfigurationProperty promptFlowNodeConfigurationProperty =
   * PromptFlowNodeConfigurationProperty.builder()
   * .sourceConfiguration(PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
   * .modelId("modelId")
   * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeconfiguration.html)
   */
  public interface PromptFlowNodeConfigurationProperty {
    /**
     * Specifies whether the prompt is from Prompt management or defined inline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeconfiguration.html#cfn-bedrock-flow-promptflownodeconfiguration-sourceconfiguration)
     */
    public fun sourceConfiguration(): Any

    /**
     * A builder for [PromptFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      public fun sourceConfiguration(sourceConfiguration: IResolvable)

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      public fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty)

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("253365db9fcffebf761610fac8367f9299029865913fa4f8f1e997d2cd5520aa")
      public
          fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeConfigurationProperty.builder()

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      override fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      override
          fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty) {
        cdkBuilder.sourceConfiguration(sourceConfiguration.let(PromptFlowNodeSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sourceConfiguration Specifies whether the prompt is from Prompt management or
       * defined inline. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("253365db9fcffebf761610fac8367f9299029865913fa4f8f1e997d2cd5520aa")
      override
          fun sourceConfiguration(sourceConfiguration: PromptFlowNodeSourceConfigurationProperty.Builder.() -> Unit):
          Unit = sourceConfiguration(PromptFlowNodeSourceConfigurationProperty(sourceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeConfigurationProperty {
      /**
       * Specifies whether the prompt is from Prompt management or defined inline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeconfiguration.html#cfn-bedrock-flow-promptflownodeconfiguration-sourceconfiguration)
       */
      override fun sourceConfiguration(): Any = unwrap(this).getSourceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeConfigurationProperty):
          PromptFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt defined inline in the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeInlineConfigurationProperty promptFlowNodeInlineConfigurationProperty =
   * PromptFlowNodeInlineConfigurationProperty.builder()
   * .modelId("modelId")
   * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html)
   */
  public interface PromptFlowNodeInlineConfigurationProperty {
    /**
     * Contains inference configurations for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * The unique identifier of the model to run inference with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-modelid)
     */
    public fun modelId(): String

    /**
     * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-templateconfiguration)
     */
    public fun templateConfiguration(): Any

    /**
     * The type of prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-templatetype)
     */
    public fun templateType(): String

    /**
     * A builder for [PromptFlowNodeInlineConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      public fun inferenceConfiguration(inferenceConfiguration: IResolvable)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22093073a38c032e9fe70409375416d7ebf982c51dac5992364ea0e76bba75c0")
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param modelId The unique identifier of the model to run inference with. 
       */
      public fun modelId(modelId: String)

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      public fun templateConfiguration(templateConfiguration: IResolvable)

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      public fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty)

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf02a55c1255e074ff00ec2b089b35343e3244be9995b056b3de41df1ae1ce44")
      public
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param templateType The type of prompt template. 
       */
      public fun templateType(templateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeInlineConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeInlineConfigurationProperty.builder()

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      override fun inferenceConfiguration(inferenceConfiguration: IResolvable) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(PromptInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22093073a38c032e9fe70409375416d7ebf982c51dac5992364ea0e76bba75c0")
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit):
          Unit =
          inferenceConfiguration(PromptInferenceConfigurationProperty(inferenceConfiguration))

      /**
       * @param modelId The unique identifier of the model to run inference with. 
       */
      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(PromptTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains a prompt and variables in the prompt that can be
       * replaced with values at runtime. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf02a55c1255e074ff00ec2b089b35343e3244be9995b056b3de41df1ae1ce44")
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(PromptTemplateConfigurationProperty(templateConfiguration))

      /**
       * @param templateType The type of prompt template. 
       */
      override fun templateType(templateType: String) {
        cdkBuilder.templateType(templateType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeInlineConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeInlineConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeInlineConfigurationProperty {
      /**
       * Contains inference configurations for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * The unique identifier of the model to run inference with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-modelid)
       */
      override fun modelId(): String = unwrap(this).getModelId()

      /**
       * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-templateconfiguration)
       */
      override fun templateConfiguration(): Any = unwrap(this).getTemplateConfiguration()

      /**
       * The type of prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodeinlineconfiguration.html#cfn-bedrock-flow-promptflownodeinlineconfiguration-templatetype)
       */
      override fun templateType(): String = unwrap(this).getTemplateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeInlineConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeInlineConfigurationProperty):
          PromptFlowNodeInlineConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeInlineConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeInlineConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeInlineConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeInlineConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt from Prompt management to use in a node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeResourceConfigurationProperty promptFlowNodeResourceConfigurationProperty =
   * PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownoderesourceconfiguration.html)
   */
  public interface PromptFlowNodeResourceConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the prompt from Prompt management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownoderesourceconfiguration.html#cfn-bedrock-flow-promptflownoderesourceconfiguration-promptarn)
     */
    public fun promptArn(): String

    /**
     * A builder for [PromptFlowNodeResourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param promptArn The Amazon Resource Name (ARN) of the prompt from Prompt management. 
       */
      public fun promptArn(promptArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeResourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeResourceConfigurationProperty.builder()

      /**
       * @param promptArn The Amazon Resource Name (ARN) of the prompt from Prompt management. 
       */
      override fun promptArn(promptArn: String) {
        cdkBuilder.promptArn(promptArn)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeResourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeResourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeResourceConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the prompt from Prompt management.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownoderesourceconfiguration.html#cfn-bedrock-flow-promptflownoderesourceconfiguration-promptarn)
       */
      override fun promptArn(): String = unwrap(this).getPromptArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeResourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeResourceConfigurationProperty):
          PromptFlowNodeResourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeResourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeResourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeResourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeResourceConfigurationProperty
    }
  }

  /**
   * Contains configurations for a prompt and whether it is from Prompt management or defined
   * inline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptFlowNodeSourceConfigurationProperty promptFlowNodeSourceConfigurationProperty =
   * PromptFlowNodeSourceConfigurationProperty.builder()
   * .inline(PromptFlowNodeInlineConfigurationProperty.builder()
   * .modelId("modelId")
   * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build())
   * .templateType("templateType")
   * // the properties below are optional
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build())
   * .build())
   * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
   * .promptArn("promptArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodesourceconfiguration.html)
   */
  public interface PromptFlowNodeSourceConfigurationProperty {
    /**
     * Contains configurations for a prompt that is defined inline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodesourceconfiguration.html#cfn-bedrock-flow-promptflownodesourceconfiguration-inline)
     */
    public fun `inline`(): Any? = unwrap(this).getInline()

    /**
     * Contains configurations for a prompt from Prompt management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodesourceconfiguration.html#cfn-bedrock-flow-promptflownodesourceconfiguration-resource)
     */
    public fun resource(): Any? = unwrap(this).getResource()

    /**
     * A builder for [PromptFlowNodeSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      public fun `inline`(`inline`: IResolvable)

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      public fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty)

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("454b797b680587d8d88010f73976a62608550354e2481b020808d8525dd6468a")
      public fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty.Builder.() -> Unit)

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      public fun resource(resource: IResolvable)

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      public fun resource(resource: PromptFlowNodeResourceConfigurationProperty)

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fece7ea2e82e5638c803085f00832cfa6fc0ba53e8c020eb97ad906afee8395d")
      public fun resource(resource: PromptFlowNodeResourceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeSourceConfigurationProperty.builder()

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      override fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      override fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty) {
        cdkBuilder.`inline`(`inline`.let(PromptFlowNodeInlineConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inline Contains configurations for a prompt that is defined inline.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("454b797b680587d8d88010f73976a62608550354e2481b020808d8525dd6468a")
      override fun `inline`(`inline`: PromptFlowNodeInlineConfigurationProperty.Builder.() -> Unit):
          Unit = `inline`(PromptFlowNodeInlineConfigurationProperty(`inline`))

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      override fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      override fun resource(resource: PromptFlowNodeResourceConfigurationProperty) {
        cdkBuilder.resource(resource.let(PromptFlowNodeResourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param resource Contains configurations for a prompt from Prompt management.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fece7ea2e82e5638c803085f00832cfa6fc0ba53e8c020eb97ad906afee8395d")
      override
          fun resource(resource: PromptFlowNodeResourceConfigurationProperty.Builder.() -> Unit):
          Unit = resource(PromptFlowNodeResourceConfigurationProperty(resource))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptFlowNodeSourceConfigurationProperty {
      /**
       * Contains configurations for a prompt that is defined inline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodesourceconfiguration.html#cfn-bedrock-flow-promptflownodesourceconfiguration-inline)
       */
      override fun `inline`(): Any? = unwrap(this).getInline()

      /**
       * Contains configurations for a prompt from Prompt management.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptflownodesourceconfiguration.html#cfn-bedrock-flow-promptflownodesourceconfiguration-resource)
       */
      override fun resource(): Any? = unwrap(this).getResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptFlowNodeSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeSourceConfigurationProperty):
          PromptFlowNodeSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptFlowNodeSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptFlowNodeSourceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptFlowNodeSourceConfigurationProperty
    }
  }

  /**
   * Contains inference configurations for the prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptInferenceConfigurationProperty promptInferenceConfigurationProperty =
   * PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptinferenceconfiguration.html)
   */
  public interface PromptInferenceConfigurationProperty {
    /**
     * Contains inference configurations for a text prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptinferenceconfiguration.html#cfn-bedrock-flow-promptinferenceconfiguration-text)
     */
    public fun text(): Any

    /**
     * A builder for [PromptInferenceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      public fun text(text: IResolvable)

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      public fun text(text: PromptModelInferenceConfigurationProperty)

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9b75262a4c933f9f0c9300bc2d689436c6c6a84043ec679a22f50dddd903545")
      public fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInferenceConfigurationProperty.builder()

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      override fun text(text: IResolvable) {
        cdkBuilder.text(text.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      override fun text(text: PromptModelInferenceConfigurationProperty) {
        cdkBuilder.text(text.let(PromptModelInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param text Contains inference configurations for a text prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9b75262a4c933f9f0c9300bc2d689436c6c6a84043ec679a22f50dddd903545")
      override fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit): Unit =
          text(PromptModelInferenceConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInferenceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptInferenceConfigurationProperty {
      /**
       * Contains inference configurations for a text prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptinferenceconfiguration.html#cfn-bedrock-flow-promptinferenceconfiguration-text)
       */
      override fun text(): Any = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptInferenceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptInferenceConfigurationProperty):
          PromptInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInferenceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInferenceConfigurationProperty
    }
  }

  /**
   * Contains information about a variable in the prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptInputVariableProperty promptInputVariableProperty = PromptInputVariableProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptinputvariable.html)
   */
  public interface PromptInputVariableProperty {
    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptinputvariable.html#cfn-bedrock-flow-promptinputvariable-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [PromptInputVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the variable.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInputVariableProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInputVariableProperty.builder()

      /**
       * @param name The name of the variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInputVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptInputVariableProperty,
    ) : CdkObject(cdkObject),
        PromptInputVariableProperty {
      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptinputvariable.html#cfn-bedrock-flow-promptinputvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptInputVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptInputVariableProperty):
          PromptInputVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInputVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInputVariableProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInputVariableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptInputVariableProperty
    }
  }

  /**
   * Contains inference configurations related to model inference for a prompt.
   *
   * For more information, see [Inference
   * parameters](https://docs.aws.amazon.com/bedrock/latest/userguide/inference-parameters.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptModelInferenceConfigurationProperty promptModelInferenceConfigurationProperty =
   * PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topK(123)
   * .topP(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html)
   */
  public interface PromptModelInferenceConfigurationProperty {
    /**
     * The maximum number of tokens to return in the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-maxtokens)
     */
    public fun maxTokens(): Number? = unwrap(this).getMaxTokens()

    /**
     * A list of strings that define sequences after which the model will stop generating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-stopsequences)
     */
    public fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

    /**
     * Controls the randomness of the response.
     *
     * Choose a lower value for more predictable outputs and a higher value for more surprising
     * outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-temperature)
     */
    public fun temperature(): Number? = unwrap(this).getTemperature()

    /**
     * The number of most-likely candidates that the model considers for the next token during
     * generation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-topk)
     */
    public fun topK(): Number? = unwrap(this).getTopK()

    /**
     * The percentage of most-likely candidates that the model considers for the next token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-topp)
     */
    public fun topP(): Number? = unwrap(this).getTopP()

    /**
     * A builder for [PromptModelInferenceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxTokens The maximum number of tokens to return in the response.
       */
      public fun maxTokens(maxTokens: Number)

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      public fun stopSequences(stopSequences: List<String>)

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      public fun stopSequences(vararg stopSequences: String)

      /**
       * @param temperature Controls the randomness of the response.
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       */
      public fun temperature(temperature: Number)

      /**
       * @param topK The number of most-likely candidates that the model considers for the next
       * token during generation.
       */
      public fun topK(topK: Number)

      /**
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      public fun topP(topP: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptModelInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptModelInferenceConfigurationProperty.builder()

      /**
       * @param maxTokens The maximum number of tokens to return in the response.
       */
      override fun maxTokens(maxTokens: Number) {
        cdkBuilder.maxTokens(maxTokens)
      }

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      override fun stopSequences(stopSequences: List<String>) {
        cdkBuilder.stopSequences(stopSequences)
      }

      /**
       * @param stopSequences A list of strings that define sequences after which the model will
       * stop generating.
       */
      override fun stopSequences(vararg stopSequences: String): Unit =
          stopSequences(stopSequences.toList())

      /**
       * @param temperature Controls the randomness of the response.
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       */
      override fun temperature(temperature: Number) {
        cdkBuilder.temperature(temperature)
      }

      /**
       * @param topK The number of most-likely candidates that the model considers for the next
       * token during generation.
       */
      override fun topK(topK: Number) {
        cdkBuilder.topK(topK)
      }

      /**
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      override fun topP(topP: Number) {
        cdkBuilder.topP(topP)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptModelInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptModelInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptModelInferenceConfigurationProperty {
      /**
       * The maximum number of tokens to return in the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-maxtokens)
       */
      override fun maxTokens(): Number? = unwrap(this).getMaxTokens()

      /**
       * A list of strings that define sequences after which the model will stop generating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-stopsequences)
       */
      override fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

      /**
       * Controls the randomness of the response.
       *
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-temperature)
       */
      override fun temperature(): Number? = unwrap(this).getTemperature()

      /**
       * The number of most-likely candidates that the model considers for the next token during
       * generation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-topk)
       */
      override fun topK(): Number? = unwrap(this).getTopK()

      /**
       * The percentage of most-likely candidates that the model considers for the next token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-promptmodelinferenceconfiguration.html#cfn-bedrock-flow-promptmodelinferenceconfiguration-topp)
       */
      override fun topP(): Number? = unwrap(this).getTopP()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptModelInferenceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptModelInferenceConfigurationProperty):
          PromptModelInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptModelInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptModelInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptModelInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptModelInferenceConfigurationProperty
    }
  }

  /**
   * Contains the message for a prompt.
   *
   * For more information, see [Prompt management in Amazon
   * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptTemplateConfigurationProperty promptTemplateConfigurationProperty =
   * PromptTemplateConfigurationProperty.builder()
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-prompttemplateconfiguration.html)
   */
  public interface PromptTemplateConfigurationProperty {
    /**
     * Contains configurations for the text in a message for a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-prompttemplateconfiguration.html#cfn-bedrock-flow-prompttemplateconfiguration-text)
     */
    public fun text(): Any

    /**
     * A builder for [PromptTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      public fun text(text: IResolvable)

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      public fun text(text: TextPromptTemplateConfigurationProperty)

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea1d46d0bd3345d31f7e83047391e145fc4b3bda204297c65ef403852cec3b3c")
      public fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptTemplateConfigurationProperty.builder()

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      override fun text(text: IResolvable) {
        cdkBuilder.text(text.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      override fun text(text: TextPromptTemplateConfigurationProperty) {
        cdkBuilder.text(text.let(TextPromptTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param text Contains configurations for the text in a message for a prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea1d46d0bd3345d31f7e83047391e145fc4b3bda204297c65ef403852cec3b3c")
      override fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit): Unit =
          text(TextPromptTemplateConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptTemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptTemplateConfigurationProperty {
      /**
       * Contains configurations for the text in a message for a prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-prompttemplateconfiguration.html#cfn-bedrock-flow-prompttemplateconfiguration-text)
       */
      override fun text(): Any = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.PromptTemplateConfigurationProperty):
          PromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptTemplateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.PromptTemplateConfigurationProperty
    }
  }

  /**
   * Contains configurations for a Retrieval node in a flow.
   *
   * This node retrieves data from the Amazon S3 location that you specify and returns it as the
   * output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RetrievalFlowNodeConfigurationProperty retrievalFlowNodeConfigurationProperty =
   * RetrievalFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodeconfiguration.html)
   */
  public interface RetrievalFlowNodeConfigurationProperty {
    /**
     * Contains configurations for the service to use for retrieving data to return as the output
     * from the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodeconfiguration.html#cfn-bedrock-flow-retrievalflownodeconfiguration-serviceconfiguration)
     */
    public fun serviceConfiguration(): Any

    /**
     * A builder for [RetrievalFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      public fun serviceConfiguration(serviceConfiguration: IResolvable)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      public
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c23df3b09b13eb0b2da4aa3af7a8d974a630939b17d1ecebf9785593eb04296")
      public
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeConfigurationProperty.builder()

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      override fun serviceConfiguration(serviceConfiguration: IResolvable) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      override
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(RetrievalFlowNodeServiceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for retrieving
       * data to return as the output from the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c23df3b09b13eb0b2da4aa3af7a8d974a630939b17d1ecebf9785593eb04296")
      override
          fun serviceConfiguration(serviceConfiguration: RetrievalFlowNodeServiceConfigurationProperty.Builder.() -> Unit):
          Unit =
          serviceConfiguration(RetrievalFlowNodeServiceConfigurationProperty(serviceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetrievalFlowNodeConfigurationProperty {
      /**
       * Contains configurations for the service to use for retrieving data to return as the output
       * from the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodeconfiguration.html#cfn-bedrock-flow-retrievalflownodeconfiguration-serviceconfiguration)
       */
      override fun serviceConfiguration(): Any = unwrap(this).getServiceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RetrievalFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeConfigurationProperty):
          RetrievalFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetrievalFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetrievalFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for the Amazon S3 location from which to retrieve data to return as the
   * output from the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RetrievalFlowNodeS3ConfigurationProperty retrievalFlowNodeS3ConfigurationProperty =
   * RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodes3configuration.html)
   */
  public interface RetrievalFlowNodeS3ConfigurationProperty {
    /**
     * The name of the Amazon S3 bucket from which to retrieve data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodes3configuration.html#cfn-bedrock-flow-retrievalflownodes3configuration-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [RetrievalFlowNodeS3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the Amazon S3 bucket from which to retrieve data. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeS3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeS3ConfigurationProperty.builder()

      /**
       * @param bucketName The name of the Amazon S3 bucket from which to retrieve data. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeS3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeS3ConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetrievalFlowNodeS3ConfigurationProperty {
      /**
       * The name of the Amazon S3 bucket from which to retrieve data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodes3configuration.html#cfn-bedrock-flow-retrievalflownodes3configuration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RetrievalFlowNodeS3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeS3ConfigurationProperty):
          RetrievalFlowNodeS3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetrievalFlowNodeS3ConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetrievalFlowNodeS3ConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeS3ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeS3ConfigurationProperty
    }
  }

  /**
   * Contains configurations for the service to use for retrieving data to return as the output from
   * the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RetrievalFlowNodeServiceConfigurationProperty retrievalFlowNodeServiceConfigurationProperty =
   * RetrievalFlowNodeServiceConfigurationProperty.builder()
   * .s3(RetrievalFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodeserviceconfiguration.html)
   */
  public interface RetrievalFlowNodeServiceConfigurationProperty {
    /**
     * Contains configurations for the Amazon S3 location from which to retrieve data to return as
     * the output from the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodeserviceconfiguration.html#cfn-bedrock-flow-retrievalflownodeserviceconfiguration-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [RetrievalFlowNodeServiceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      public fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty)

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f5975a0f283a15e66d0fe7deaf95aca2541a999b306aba3372f36ff2311c3d0")
      public fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeServiceConfigurationProperty.builder()

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      override fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty) {
        cdkBuilder.s3(s3.let(RetrievalFlowNodeS3ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location from which to retrieve data to
       * return as the output from the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f5975a0f283a15e66d0fe7deaf95aca2541a999b306aba3372f36ff2311c3d0")
      override fun s3(s3: RetrievalFlowNodeS3ConfigurationProperty.Builder.() -> Unit): Unit =
          s3(RetrievalFlowNodeS3ConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeServiceConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetrievalFlowNodeServiceConfigurationProperty {
      /**
       * Contains configurations for the Amazon S3 location from which to retrieve data to return as
       * the output from the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-retrievalflownodeserviceconfiguration.html#cfn-bedrock-flow-retrievalflownodeserviceconfiguration-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RetrievalFlowNodeServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeServiceConfigurationProperty):
          RetrievalFlowNodeServiceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetrievalFlowNodeServiceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetrievalFlowNodeServiceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeServiceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.RetrievalFlowNodeServiceConfigurationProperty
    }
  }

  /**
   * The S3 location of the flow definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The S3 bucket containing the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-s3location.html#cfn-bedrock-flow-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The object key for the S3 location containing the definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-s3location.html#cfn-bedrock-flow-s3location-key)
     */
    public fun key(): String

    /**
     * The Amazon S3 location from which to retrieve data for an S3 retrieve node or to which to
     * store data for an S3 storage node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-s3location.html#cfn-bedrock-flow-s3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The S3 bucket containing the flow definition. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The object key for the S3 location containing the definition. 
       */
      public fun key(key: String)

      /**
       * @param version The Amazon S3 location from which to retrieve data for an S3 retrieve node
       * or to which to store data for an S3 storage node.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.S3LocationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnFlow.S3LocationProperty.builder()

      /**
       * @param bucket The S3 bucket containing the flow definition. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The object key for the S3 location containing the definition. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version The Amazon S3 location from which to retrieve data for an S3 retrieve node
       * or to which to store data for an S3 storage node.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnFlow.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * The S3 bucket containing the flow definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-s3location.html#cfn-bedrock-flow-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The object key for the S3 location containing the definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-s3location.html#cfn-bedrock-flow-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The Amazon S3 location from which to retrieve data for an S3 retrieve node or to which to
       * store data for an S3 storage node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-s3location.html#cfn-bedrock-flow-s3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnFlow.S3LocationProperty
    }
  }

  /**
   * Contains configurations for a Storage node in a flow.
   *
   * This node stores the input in an Amazon S3 location that you specify.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StorageFlowNodeConfigurationProperty storageFlowNodeConfigurationProperty =
   * StorageFlowNodeConfigurationProperty.builder()
   * .serviceConfiguration(StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodeconfiguration.html)
   */
  public interface StorageFlowNodeConfigurationProperty {
    /**
     * Contains configurations for the service to use for storing the input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodeconfiguration.html#cfn-bedrock-flow-storageflownodeconfiguration-serviceconfiguration)
     */
    public fun serviceConfiguration(): Any

    /**
     * A builder for [StorageFlowNodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      public fun serviceConfiguration(serviceConfiguration: IResolvable)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      public
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty)

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a08060d53194f3039089fc827172e86f1a6ea21751339d7897da6121b14f7833")
      public
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeConfigurationProperty.builder()

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      override fun serviceConfiguration(serviceConfiguration: IResolvable) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      override
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty) {
        cdkBuilder.serviceConfiguration(serviceConfiguration.let(StorageFlowNodeServiceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param serviceConfiguration Contains configurations for the service to use for storing the
       * input into the node. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a08060d53194f3039089fc827172e86f1a6ea21751339d7897da6121b14f7833")
      override
          fun serviceConfiguration(serviceConfiguration: StorageFlowNodeServiceConfigurationProperty.Builder.() -> Unit):
          Unit =
          serviceConfiguration(StorageFlowNodeServiceConfigurationProperty(serviceConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        StorageFlowNodeConfigurationProperty {
      /**
       * Contains configurations for the service to use for storing the input into the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodeconfiguration.html#cfn-bedrock-flow-storageflownodeconfiguration-serviceconfiguration)
       */
      override fun serviceConfiguration(): Any = unwrap(this).getServiceConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StorageFlowNodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeConfigurationProperty):
          StorageFlowNodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageFlowNodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageFlowNodeConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeConfigurationProperty
    }
  }

  /**
   * Contains configurations for the Amazon S3 location in which to store the input into the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StorageFlowNodeS3ConfigurationProperty storageFlowNodeS3ConfigurationProperty =
   * StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodes3configuration.html)
   */
  public interface StorageFlowNodeS3ConfigurationProperty {
    /**
     * The name of the Amazon S3 bucket in which to store the input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodes3configuration.html#cfn-bedrock-flow-storageflownodes3configuration-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [StorageFlowNodeS3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the Amazon S3 bucket in which to store the input into the
       * node. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeS3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeS3ConfigurationProperty.builder()

      /**
       * @param bucketName The name of the Amazon S3 bucket in which to store the input into the
       * node. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeS3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeS3ConfigurationProperty,
    ) : CdkObject(cdkObject),
        StorageFlowNodeS3ConfigurationProperty {
      /**
       * The name of the Amazon S3 bucket in which to store the input into the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodes3configuration.html#cfn-bedrock-flow-storageflownodes3configuration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StorageFlowNodeS3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeS3ConfigurationProperty):
          StorageFlowNodeS3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageFlowNodeS3ConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageFlowNodeS3ConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeS3ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeS3ConfigurationProperty
    }
  }

  /**
   * Contains configurations for the service to use for storing the input into the node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * StorageFlowNodeServiceConfigurationProperty storageFlowNodeServiceConfigurationProperty =
   * StorageFlowNodeServiceConfigurationProperty.builder()
   * .s3(StorageFlowNodeS3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodeserviceconfiguration.html)
   */
  public interface StorageFlowNodeServiceConfigurationProperty {
    /**
     * Contains configurations for the Amazon S3 location in which to store the input into the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodeserviceconfiguration.html#cfn-bedrock-flow-storageflownodeserviceconfiguration-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [StorageFlowNodeServiceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      public fun s3(s3: StorageFlowNodeS3ConfigurationProperty)

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04b0ad991e60d8e9f355555588815d52b0cc3b23a067231cd571ef2355344bed")
      public fun s3(s3: StorageFlowNodeS3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeServiceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeServiceConfigurationProperty.builder()

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      override fun s3(s3: StorageFlowNodeS3ConfigurationProperty) {
        cdkBuilder.s3(s3.let(StorageFlowNodeS3ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3 Contains configurations for the Amazon S3 location in which to store the input
       * into the node.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04b0ad991e60d8e9f355555588815d52b0cc3b23a067231cd571ef2355344bed")
      override fun s3(s3: StorageFlowNodeS3ConfigurationProperty.Builder.() -> Unit): Unit =
          s3(StorageFlowNodeS3ConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeServiceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeServiceConfigurationProperty,
    ) : CdkObject(cdkObject),
        StorageFlowNodeServiceConfigurationProperty {
      /**
       * Contains configurations for the Amazon S3 location in which to store the input into the
       * node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-storageflownodeserviceconfiguration.html#cfn-bedrock-flow-storageflownodeserviceconfiguration-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StorageFlowNodeServiceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeServiceConfigurationProperty):
          StorageFlowNodeServiceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageFlowNodeServiceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageFlowNodeServiceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeServiceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.StorageFlowNodeServiceConfigurationProperty
    }
  }

  /**
   * Contains configurations for a text prompt template.
   *
   * To include a variable, enclose a word in double curly braces as in `{{variable}}` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TextPromptTemplateConfigurationProperty textPromptTemplateConfigurationProperty =
   * TextPromptTemplateConfigurationProperty.builder()
   * .text("text")
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-textprompttemplateconfiguration.html)
   */
  public interface TextPromptTemplateConfigurationProperty {
    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-textprompttemplateconfiguration.html#cfn-bedrock-flow-textprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * The message for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-textprompttemplateconfiguration.html#cfn-bedrock-flow-textprompttemplateconfiguration-text)
     */
    public fun text(): String

    /**
     * A builder for [TextPromptTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      public fun inputVariables(inputVariables: IResolvable)

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      public fun inputVariables(inputVariables: List<Any>)

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      public fun inputVariables(vararg inputVariables: Any)

      /**
       * @param text The message for the prompt. 
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnFlow.TextPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnFlow.TextPromptTemplateConfigurationProperty.builder()

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      override fun inputVariables(inputVariables: IResolvable) {
        cdkBuilder.inputVariables(inputVariables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      override fun inputVariables(inputVariables: List<Any>) {
        cdkBuilder.inputVariables(inputVariables.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputVariables An array of the variables in the prompt template.
       */
      override fun inputVariables(vararg inputVariables: Any): Unit =
          inputVariables(inputVariables.toList())

      /**
       * @param text The message for the prompt. 
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnFlow.TextPromptTemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.TextPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        TextPromptTemplateConfigurationProperty {
      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-textprompttemplateconfiguration.html#cfn-bedrock-flow-textprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * The message for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-textprompttemplateconfiguration.html#cfn-bedrock-flow-textprompttemplateconfiguration-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TextPromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlow.TextPromptTemplateConfigurationProperty):
          TextPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnFlow.TextPromptTemplateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnFlow.TextPromptTemplateConfigurationProperty
    }
  }
}
