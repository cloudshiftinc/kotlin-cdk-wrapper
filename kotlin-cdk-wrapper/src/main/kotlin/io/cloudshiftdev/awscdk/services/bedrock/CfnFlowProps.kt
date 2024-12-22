@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlow`.
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
 * CfnFlowProps cfnFlowProps = CfnFlowProps.builder()
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
 * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
 * .guardrailIdentifier("guardrailIdentifier")
 * .guardrailVersion("guardrailVersion")
 * .build())
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
 * .topP(123)
 * .build())
 * .build())
 * .build())
 * .resource(PromptFlowNodeResourceConfigurationProperty.builder()
 * .promptArn("promptArn")
 * .build())
 * .build())
 * // the properties below are optional
 * .guardrailConfiguration(GuardrailConfigurationProperty.builder()
 * .guardrailIdentifier("guardrailIdentifier")
 * .guardrailVersion("guardrailVersion")
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
public interface CfnFlowProps {
  /**
   * The Amazon Resource Name (ARN) of the KMS key that the flow is encrypted with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-customerencryptionkeyarn)
   */
  public fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

  /**
   * The definition of the nodes and connections between the nodes in the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
   */
  public fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * The Amazon S3 location of the flow definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
   */
  public fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

  /**
   * The definition of the flow as a JSON-formatted string.
   *
   * The string must match the format in
   * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionstring)
   */
  public fun definitionString(): String? = unwrap(this).getDefinitionString()

  /**
   * A map that specifies the mappings for placeholder variables in the prompt flow definition.
   *
   * This enables the customer to inject values obtained at runtime. Variables can be template
   * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map. Only
   * supported with the `DefinitionString` and `DefinitionS3Location` fields.
   *
   * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionsubstitutions)
   */
  public fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

  /**
   * A description of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the service role with permissions to create a flow.
   *
   * For more information, see [Create a service row for
   * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html) in the Amazon
   * Bedrock User Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-executionrolearn)
   */
  public fun executionRoleArn(): String

  /**
   * The name of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-name)
   */
  public fun name(): String

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
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A map of tag keys and values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-testaliastags)
   */
  public fun testAliasTags(): Any? = unwrap(this).getTestAliasTags()

  /**
   * A builder for [CfnFlowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the flow
     * is encrypted with.
     */
    public fun customerEncryptionKeyArn(customerEncryptionKeyArn: String)

    /**
     * @param definition The definition of the nodes and connections between the nodes in the flow.
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition The definition of the nodes and connections between the nodes in the flow.
     */
    public fun definition(definition: CfnFlow.FlowDefinitionProperty)

    /**
     * @param definition The definition of the nodes and connections between the nodes in the flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b44461e6f081662d0b758fc27725257844f027e3911b9bd262d00e8397a4d026")
    public fun definition(definition: CfnFlow.FlowDefinitionProperty.Builder.() -> Unit)

    /**
     * @param definitionS3Location The Amazon S3 location of the flow definition.
     */
    public fun definitionS3Location(definitionS3Location: IResolvable)

    /**
     * @param definitionS3Location The Amazon S3 location of the flow definition.
     */
    public fun definitionS3Location(definitionS3Location: CfnFlow.S3LocationProperty)

    /**
     * @param definitionS3Location The Amazon S3 location of the flow definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("534bdb112aa12d670ceb2aa30506d4c9d7c21e5e24d7eaaef8cc4e19a371b18a")
    public
        fun definitionS3Location(definitionS3Location: CfnFlow.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param definitionString The definition of the flow as a JSON-formatted string.
     * The string must match the format in
     * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
     * .
     */
    public fun definitionString(definitionString: String)

    /**
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition.
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable)

    /**
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition.
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, Any>)

    /**
     * @param description A description of the flow.
     */
    public fun description(description: String)

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the service role with permissions
     * to create a flow. 
     * For more information, see [Create a service row for
     * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html) in the
     * Amazon Bedrock User Guide.
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * @param name The name of the flow. 
     */
    public fun name(name: String)

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param testAliasTags A map of tag keys and values.
     */
    public fun testAliasTags(testAliasTags: IResolvable)

    /**
     * @param testAliasTags A map of tag keys and values.
     */
    public fun testAliasTags(testAliasTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnFlowProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnFlowProps.builder()

    /**
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the flow
     * is encrypted with.
     */
    override fun customerEncryptionKeyArn(customerEncryptionKeyArn: String) {
      cdkBuilder.customerEncryptionKeyArn(customerEncryptionKeyArn)
    }

    /**
     * @param definition The definition of the nodes and connections between the nodes in the flow.
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definition The definition of the nodes and connections between the nodes in the flow.
     */
    override fun definition(definition: CfnFlow.FlowDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnFlow.FlowDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param definition The definition of the nodes and connections between the nodes in the flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b44461e6f081662d0b758fc27725257844f027e3911b9bd262d00e8397a4d026")
    override fun definition(definition: CfnFlow.FlowDefinitionProperty.Builder.() -> Unit): Unit =
        definition(CfnFlow.FlowDefinitionProperty(definition))

    /**
     * @param definitionS3Location The Amazon S3 location of the flow definition.
     */
    override fun definitionS3Location(definitionS3Location: IResolvable) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definitionS3Location The Amazon S3 location of the flow definition.
     */
    override fun definitionS3Location(definitionS3Location: CfnFlow.S3LocationProperty) {
      cdkBuilder.definitionS3Location(definitionS3Location.let(CfnFlow.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param definitionS3Location The Amazon S3 location of the flow definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("534bdb112aa12d670ceb2aa30506d4c9d7c21e5e24d7eaaef8cc4e19a371b18a")
    override
        fun definitionS3Location(definitionS3Location: CfnFlow.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionS3Location(CfnFlow.S3LocationProperty(definitionS3Location))

    /**
     * @param definitionString The definition of the flow as a JSON-formatted string.
     * The string must match the format in
     * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
     * .
     */
    override fun definitionString(definitionString: String) {
      cdkBuilder.definitionString(definitionString)
    }

    /**
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition.
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     */
    override fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definitionSubstitutions A map that specifies the mappings for placeholder variables in
     * the prompt flow definition.
     * This enables the customer to inject values obtained at runtime. Variables can be template
     * parameter names, resource logical IDs, resource attributes, or a variable in a key-value map.
     * Only supported with the `DefinitionString` and `DefinitionS3Location` fields.
     *
     * Substitutions must follow the syntax: `${key_name}` or `${variable_1,variable_2,...}` .
     */
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, Any>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param description A description of the flow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executionRoleArn The Amazon Resource Name (ARN) of the service role with permissions
     * to create a flow. 
     * For more information, see [Create a service row for
     * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html) in the
     * Amazon Bedrock User Guide.
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * @param name The name of the flow. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param testAliasTags A map of tag keys and values.
     */
    override fun testAliasTags(testAliasTags: IResolvable) {
      cdkBuilder.testAliasTags(testAliasTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param testAliasTags A map of tag keys and values.
     */
    override fun testAliasTags(testAliasTags: Map<String, String>) {
      cdkBuilder.testAliasTags(testAliasTags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnFlowProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowProps,
  ) : CdkObject(cdkObject),
      CfnFlowProps {
    /**
     * The Amazon Resource Name (ARN) of the KMS key that the flow is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-customerencryptionkeyarn)
     */
    override fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

    /**
     * The definition of the nodes and connections between the nodes in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definition)
     */
    override fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * The Amazon S3 location of the flow definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitions3location)
     */
    override fun definitionS3Location(): Any? = unwrap(this).getDefinitionS3Location()

    /**
     * The definition of the flow as a JSON-formatted string.
     *
     * The string must match the format in
     * [FlowDefinition](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-flow-flowdefinition.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-definitionstring)
     */
    override fun definitionString(): String? = unwrap(this).getDefinitionString()

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
     */
    override fun definitionSubstitutions(): Any? = unwrap(this).getDefinitionSubstitutions()

    /**
     * A description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the service role with permissions to create a flow.
     *
     * For more information, see [Create a service row for
     * flows](https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html) in the
     * Amazon Bedrock User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-executionrolearn)
     */
    override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-flow.html#cfn-bedrock-flow-testaliastags)
     */
    override fun testAliasTags(): Any? = unwrap(this).getTestAliasTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnFlowProps): CfnFlowProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowProps): software.amazon.awscdk.services.bedrock.CfnFlowProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnFlowProps
  }
}
