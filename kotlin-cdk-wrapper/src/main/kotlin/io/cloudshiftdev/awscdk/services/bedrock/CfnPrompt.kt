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
 * Creates a prompt in your prompt library that you can add to a flow.
 *
 * For more information, see [Prompt management in Amazon
 * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html) , [Create a
 * prompt using Prompt
 * management](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html) and
 * [Prompt flows in Amazon Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/flows.html) in
 * the Amazon Bedrock User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * Object additionalModelRequestFields;
 * Object any;
 * Object auto;
 * Object json;
 * CfnPrompt cfnPrompt = CfnPrompt.Builder.create(this, "MyCfnPrompt")
 * .name("name")
 * // the properties below are optional
 * .customerEncryptionKeyArn("customerEncryptionKeyArn")
 * .defaultVariant("defaultVariant")
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .variants(List.of(PromptVariantProperty.builder()
 * .name("name")
 * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
 * .chat(ChatPromptTemplateConfigurationProperty.builder()
 * .messages(List.of(MessageProperty.builder()
 * .content(List.of(ContentBlockProperty.builder()
 * .cachePoint(CachePointBlockProperty.builder()
 * .type("type")
 * .build())
 * .text("text")
 * .build()))
 * .role("role")
 * .build()))
 * // the properties below are optional
 * .inputVariables(List.of(PromptInputVariableProperty.builder()
 * .name("name")
 * .build()))
 * .system(List.of(SystemContentBlockProperty.builder()
 * .cachePoint(CachePointBlockProperty.builder()
 * .type("type")
 * .build())
 * .text("text")
 * .build()))
 * .toolConfiguration(ToolConfigurationProperty.builder()
 * .tools(List.of(ToolProperty.builder()
 * .cachePoint(CachePointBlockProperty.builder()
 * .type("type")
 * .build())
 * .toolSpec(ToolSpecificationProperty.builder()
 * .inputSchema(ToolInputSchemaProperty.builder()
 * .json(json)
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .build()))
 * // the properties below are optional
 * .toolChoice(ToolChoiceProperty.builder()
 * .any(any)
 * .auto(auto)
 * .tool(SpecificToolChoiceProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .build())
 * .build())
 * .text(TextPromptTemplateConfigurationProperty.builder()
 * .cachePoint(CachePointBlockProperty.builder()
 * .type("type")
 * .build())
 * .inputVariables(List.of(PromptInputVariableProperty.builder()
 * .name("name")
 * .build()))
 * .text("text")
 * .textS3Location(TextS3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .templateType("templateType")
 * // the properties below are optional
 * .additionalModelRequestFields(additionalModelRequestFields)
 * .genAiResource(PromptGenAiResourceProperty.builder()
 * .agent(PromptAgentResourceProperty.builder()
 * .agentIdentifier("agentIdentifier")
 * .build())
 * .build())
 * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
 * .text(PromptModelInferenceConfigurationProperty.builder()
 * .maxTokens(123)
 * .stopSequences(List.of("stopSequences"))
 * .temperature(123)
 * .topP(123)
 * .build())
 * .build())
 * .metadata(List.of(PromptMetadataEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .modelId("modelId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html)
 */
public open class CfnPrompt(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnPrompt(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPromptProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPromptProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the prompt or the prompt version (if you specified a version
   * in the request).
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time at which the prompt was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The unique identifier of the prompt.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The time at which the prompt was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The version of the prompt that this summary applies to.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
   */
  public open fun customerEncryptionKeyArn(): String? = unwrap(this).getCustomerEncryptionKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
   */
  public open fun customerEncryptionKeyArn(`value`: String) {
    unwrap(this).setCustomerEncryptionKeyArn(`value`)
  }

  /**
   * The name of the default variant for the prompt.
   */
  public open fun defaultVariant(): String? = unwrap(this).getDefaultVariant()

  /**
   * The name of the default variant for the prompt.
   */
  public open fun defaultVariant(`value`: String) {
    unwrap(this).setDefaultVariant(`value`)
  }

  /**
   * The description of the prompt.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the prompt.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name of the prompt.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the prompt.
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
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(): Any? = unwrap(this).getVariants()

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(`value`: IResolvable) {
    unwrap(this).setVariants(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(`value`: List<Any>) {
    unwrap(this).setVariants(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun variants(vararg `value`: Any): Unit = variants(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnPrompt].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the prompt
     * is encrypted with. 
     */
    public fun customerEncryptionKeyArn(customerEncryptionKeyArn: String)

    /**
     * The name of the default variant for the prompt.
     *
     * This value must match the `name` field in the relevant
     * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-defaultvariant)
     * @param defaultVariant The name of the default variant for the prompt. 
     */
    public fun defaultVariant(defaultVariant: String)

    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-description)
     * @param description The description of the prompt. 
     */
    public fun description(description: String)

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-name)
     * @param name The name of the prompt. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    public fun variants(variants: IResolvable)

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    public fun variants(variants: List<Any>)

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    public fun variants(vararg variants: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnPrompt.Builder =
        software.amazon.awscdk.services.bedrock.CfnPrompt.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the KMS key that the prompt is encrypted with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-customerencryptionkeyarn)
     * @param customerEncryptionKeyArn The Amazon Resource Name (ARN) of the KMS key that the prompt
     * is encrypted with. 
     */
    override fun customerEncryptionKeyArn(customerEncryptionKeyArn: String) {
      cdkBuilder.customerEncryptionKeyArn(customerEncryptionKeyArn)
    }

    /**
     * The name of the default variant for the prompt.
     *
     * This value must match the `name` field in the relevant
     * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-defaultvariant)
     * @param defaultVariant The name of the default variant for the prompt. 
     */
    override fun defaultVariant(defaultVariant: String) {
      cdkBuilder.defaultVariant(defaultVariant)
    }

    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-description)
     * @param description The description of the prompt. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-name)
     * @param name The name of the prompt. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-tags)
     * @param tags Metadata that you can assign to a resource as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    override fun variants(variants: IResolvable) {
      cdkBuilder.variants(variants.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    override fun variants(variants: List<Any>) {
      cdkBuilder.variants(variants.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of objects, each containing details about a variant of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-prompt.html#cfn-bedrock-prompt-variants)
     * @param variants A list of objects, each containing details about a variant of the prompt. 
     */
    override fun variants(vararg variants: Any): Unit = variants(variants.toList())

    public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnPrompt.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrompt {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrompt(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt): CfnPrompt =
        CfnPrompt(cdkObject)

    internal fun unwrap(wrapped: CfnPrompt): software.amazon.awscdk.services.bedrock.CfnPrompt =
        wrapped.cdkObject as software.amazon.awscdk.services.bedrock.CfnPrompt
  }

  /**
   * Defines a section of content to be cached for reuse in subsequent API calls.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * CachePointBlockProperty cachePointBlockProperty = CachePointBlockProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-cachepointblock.html)
   */
  public interface CachePointBlockProperty {
    /**
     * Specifies the type of cache point within the CachePointBlock.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-cachepointblock.html#cfn-bedrock-prompt-cachepointblock-type)
     */
    public fun type(): String

    /**
     * A builder for [CachePointBlockProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Specifies the type of cache point within the CachePointBlock. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.CachePointBlockProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.CachePointBlockProperty.builder()

      /**
       * @param type Specifies the type of cache point within the CachePointBlock. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.CachePointBlockProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.CachePointBlockProperty,
    ) : CdkObject(cdkObject),
        CachePointBlockProperty {
      /**
       * Specifies the type of cache point within the CachePointBlock.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-cachepointblock.html#cfn-bedrock-prompt-cachepointblock-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CachePointBlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.CachePointBlockProperty):
          CachePointBlockProperty = CdkObjectWrappers.wrap(cdkObject) as? CachePointBlockProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CachePointBlockProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.CachePointBlockProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.CachePointBlockProperty
    }
  }

  /**
   * Contains configurations to use a prompt in a conversational format.
   *
   * For more information, see [Create a prompt using Prompt
   * management](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object any;
   * Object auto;
   * Object json;
   * ChatPromptTemplateConfigurationProperty chatPromptTemplateConfigurationProperty =
   * ChatPromptTemplateConfigurationProperty.builder()
   * .messages(List.of(MessageProperty.builder()
   * .content(List.of(ContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build()))
   * .role("role")
   * .build()))
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .system(List.of(SystemContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build()))
   * .toolConfiguration(ToolConfigurationProperty.builder()
   * .tools(List.of(ToolProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .toolSpec(ToolSpecificationProperty.builder()
   * .inputSchema(ToolInputSchemaProperty.builder()
   * .json(json)
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .build())
   * .build()))
   * // the properties below are optional
   * .toolChoice(ToolChoiceProperty.builder()
   * .any(any)
   * .auto(auto)
   * .tool(SpecificToolChoiceProperty.builder()
   * .name("name")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html)
   */
  public interface ChatPromptTemplateConfigurationProperty {
    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * Contains messages in the chat for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-messages)
     */
    public fun messages(): Any

    /**
     * Contains system prompts to provide context to the model or to describe how it should behave.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-system)
     */
    public fun system(): Any? = unwrap(this).getSystem()

    /**
     * Configuration information for the tools that the model can use when generating a response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-toolconfiguration)
     */
    public fun toolConfiguration(): Any? = unwrap(this).getToolConfiguration()

    /**
     * A builder for [ChatPromptTemplateConfigurationProperty]
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
       * @param messages Contains messages in the chat for the prompt. 
       */
      public fun messages(messages: IResolvable)

      /**
       * @param messages Contains messages in the chat for the prompt. 
       */
      public fun messages(messages: List<Any>)

      /**
       * @param messages Contains messages in the chat for the prompt. 
       */
      public fun messages(vararg messages: Any)

      /**
       * @param system Contains system prompts to provide context to the model or to describe how it
       * should behave.
       */
      public fun system(system: IResolvable)

      /**
       * @param system Contains system prompts to provide context to the model or to describe how it
       * should behave.
       */
      public fun system(system: List<Any>)

      /**
       * @param system Contains system prompts to provide context to the model or to describe how it
       * should behave.
       */
      public fun system(vararg system: Any)

      /**
       * @param toolConfiguration Configuration information for the tools that the model can use
       * when generating a response.
       */
      public fun toolConfiguration(toolConfiguration: IResolvable)

      /**
       * @param toolConfiguration Configuration information for the tools that the model can use
       * when generating a response.
       */
      public fun toolConfiguration(toolConfiguration: ToolConfigurationProperty)

      /**
       * @param toolConfiguration Configuration information for the tools that the model can use
       * when generating a response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7327d579dcc2c127ef6fcc5375ce16bd15a7e6451d92b02f17baf5b63b15ed")
      public fun toolConfiguration(toolConfiguration: ToolConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.ChatPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.ChatPromptTemplateConfigurationProperty.builder()

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
       * @param messages Contains messages in the chat for the prompt. 
       */
      override fun messages(messages: IResolvable) {
        cdkBuilder.messages(messages.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param messages Contains messages in the chat for the prompt. 
       */
      override fun messages(messages: List<Any>) {
        cdkBuilder.messages(messages.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param messages Contains messages in the chat for the prompt. 
       */
      override fun messages(vararg messages: Any): Unit = messages(messages.toList())

      /**
       * @param system Contains system prompts to provide context to the model or to describe how it
       * should behave.
       */
      override fun system(system: IResolvable) {
        cdkBuilder.system(system.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param system Contains system prompts to provide context to the model or to describe how it
       * should behave.
       */
      override fun system(system: List<Any>) {
        cdkBuilder.system(system.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param system Contains system prompts to provide context to the model or to describe how it
       * should behave.
       */
      override fun system(vararg system: Any): Unit = system(system.toList())

      /**
       * @param toolConfiguration Configuration information for the tools that the model can use
       * when generating a response.
       */
      override fun toolConfiguration(toolConfiguration: IResolvable) {
        cdkBuilder.toolConfiguration(toolConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param toolConfiguration Configuration information for the tools that the model can use
       * when generating a response.
       */
      override fun toolConfiguration(toolConfiguration: ToolConfigurationProperty) {
        cdkBuilder.toolConfiguration(toolConfiguration.let(ToolConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param toolConfiguration Configuration information for the tools that the model can use
       * when generating a response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7327d579dcc2c127ef6fcc5375ce16bd15a7e6451d92b02f17baf5b63b15ed")
      override
          fun toolConfiguration(toolConfiguration: ToolConfigurationProperty.Builder.() -> Unit):
          Unit = toolConfiguration(ToolConfigurationProperty(toolConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.ChatPromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ChatPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        ChatPromptTemplateConfigurationProperty {
      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * Contains messages in the chat for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-messages)
       */
      override fun messages(): Any = unwrap(this).getMessages()

      /**
       * Contains system prompts to provide context to the model or to describe how it should
       * behave.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-system)
       */
      override fun system(): Any? = unwrap(this).getSystem()

      /**
       * Configuration information for the tools that the model can use when generating a response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-chatprompttemplateconfiguration.html#cfn-bedrock-prompt-chatprompttemplateconfiguration-toolconfiguration)
       */
      override fun toolConfiguration(): Any? = unwrap(this).getToolConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ChatPromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ChatPromptTemplateConfigurationProperty):
          ChatPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChatPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChatPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.ChatPromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.ChatPromptTemplateConfigurationProperty
    }
  }

  /**
   * A block of content for a message that you pass to, or receive from, a model with the
   * [Converse](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html) or
   * [ConverseStream](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_ConverseStream.html)
   * API operations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ContentBlockProperty contentBlockProperty = ContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-contentblock.html)
   */
  public interface ContentBlockProperty {
    /**
     * CachePoint to include in the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-contentblock.html#cfn-bedrock-prompt-contentblock-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * Text to include in the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-contentblock.html#cfn-bedrock-prompt-contentblock-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * A builder for [ContentBlockProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cachePoint CachePoint to include in the message.
       */
      public fun cachePoint(cachePoint: IResolvable)

      /**
       * @param cachePoint CachePoint to include in the message.
       */
      public fun cachePoint(cachePoint: CachePointBlockProperty)

      /**
       * @param cachePoint CachePoint to include in the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("802ad111cbb03da785d41abbe224f32a79ff773df5ecf5a36a839d2c6d8f876a")
      public fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit)

      /**
       * @param text Text to include in the message.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.ContentBlockProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.ContentBlockProperty.builder()

      /**
       * @param cachePoint CachePoint to include in the message.
       */
      override fun cachePoint(cachePoint: IResolvable) {
        cdkBuilder.cachePoint(cachePoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cachePoint CachePoint to include in the message.
       */
      override fun cachePoint(cachePoint: CachePointBlockProperty) {
        cdkBuilder.cachePoint(cachePoint.let(CachePointBlockProperty.Companion::unwrap))
      }

      /**
       * @param cachePoint CachePoint to include in the message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("802ad111cbb03da785d41abbe224f32a79ff773df5ecf5a36a839d2c6d8f876a")
      override fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit): Unit =
          cachePoint(CachePointBlockProperty(cachePoint))

      /**
       * @param text Text to include in the message.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.ContentBlockProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ContentBlockProperty,
    ) : CdkObject(cdkObject),
        ContentBlockProperty {
      /**
       * CachePoint to include in the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-contentblock.html#cfn-bedrock-prompt-contentblock-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * Text to include in the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-contentblock.html#cfn-bedrock-prompt-contentblock-text)
       */
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentBlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ContentBlockProperty):
          ContentBlockProperty = CdkObjectWrappers.wrap(cdkObject) as? ContentBlockProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentBlockProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.ContentBlockProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.ContentBlockProperty
    }
  }

  /**
   * A message input, or returned from, a call to
   * [Converse](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html) or
   * [ConverseStream](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_ConverseStream.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * MessageProperty messageProperty = MessageProperty.builder()
   * .content(List.of(ContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build()))
   * .role("role")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-message.html)
   */
  public interface MessageProperty {
    /**
     * The message content. Note the following restrictions:.
     *
     * * You can include up to 20 images. Each image's size, height, and width must be no more than
     * 3.75 MB, 8000 px, and 8000 px, respectively.
     * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
     * * If you include a `ContentBlock` with a `document` field in the array, you must also include
     * a `ContentBlock` with a `text` field.
     * * You can only include images and documents if the `role` is `user` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-message.html#cfn-bedrock-prompt-message-content)
     */
    public fun content(): Any

    /**
     * The role that the message plays in the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-message.html#cfn-bedrock-prompt-message-role)
     */
    public fun role(): String

    /**
     * A builder for [MessageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content The message content. Note the following restrictions:. 
       * * You can include up to 20 images. Each image's size, height, and width must be no more
       * than 3.75 MB, 8000 px, and 8000 px, respectively.
       * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
       * * If you include a `ContentBlock` with a `document` field in the array, you must also
       * include a `ContentBlock` with a `text` field.
       * * You can only include images and documents if the `role` is `user` .
       */
      public fun content(content: IResolvable)

      /**
       * @param content The message content. Note the following restrictions:. 
       * * You can include up to 20 images. Each image's size, height, and width must be no more
       * than 3.75 MB, 8000 px, and 8000 px, respectively.
       * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
       * * If you include a `ContentBlock` with a `document` field in the array, you must also
       * include a `ContentBlock` with a `text` field.
       * * You can only include images and documents if the `role` is `user` .
       */
      public fun content(content: List<Any>)

      /**
       * @param content The message content. Note the following restrictions:. 
       * * You can include up to 20 images. Each image's size, height, and width must be no more
       * than 3.75 MB, 8000 px, and 8000 px, respectively.
       * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
       * * If you include a `ContentBlock` with a `document` field in the array, you must also
       * include a `ContentBlock` with a `text` field.
       * * You can only include images and documents if the `role` is `user` .
       */
      public fun content(vararg content: Any)

      /**
       * @param role The role that the message plays in the message. 
       */
      public fun role(role: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.MessageProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.MessageProperty.builder()

      /**
       * @param content The message content. Note the following restrictions:. 
       * * You can include up to 20 images. Each image's size, height, and width must be no more
       * than 3.75 MB, 8000 px, and 8000 px, respectively.
       * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
       * * If you include a `ContentBlock` with a `document` field in the array, you must also
       * include a `ContentBlock` with a `text` field.
       * * You can only include images and documents if the `role` is `user` .
       */
      override fun content(content: IResolvable) {
        cdkBuilder.content(content.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param content The message content. Note the following restrictions:. 
       * * You can include up to 20 images. Each image's size, height, and width must be no more
       * than 3.75 MB, 8000 px, and 8000 px, respectively.
       * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
       * * If you include a `ContentBlock` with a `document` field in the array, you must also
       * include a `ContentBlock` with a `text` field.
       * * You can only include images and documents if the `role` is `user` .
       */
      override fun content(content: List<Any>) {
        cdkBuilder.content(content.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param content The message content. Note the following restrictions:. 
       * * You can include up to 20 images. Each image's size, height, and width must be no more
       * than 3.75 MB, 8000 px, and 8000 px, respectively.
       * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
       * * If you include a `ContentBlock` with a `document` field in the array, you must also
       * include a `ContentBlock` with a `text` field.
       * * You can only include images and documents if the `role` is `user` .
       */
      override fun content(vararg content: Any): Unit = content(content.toList())

      /**
       * @param role The role that the message plays in the message. 
       */
      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.MessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.MessageProperty,
    ) : CdkObject(cdkObject),
        MessageProperty {
      /**
       * The message content. Note the following restrictions:.
       *
       * * You can include up to 20 images. Each image's size, height, and width must be no more
       * than 3.75 MB, 8000 px, and 8000 px, respectively.
       * * You can include up to five documents. Each document's size must be no more than 4.5 MB.
       * * If you include a `ContentBlock` with a `document` field in the array, you must also
       * include a `ContentBlock` with a `text` field.
       * * You can only include images and documents if the `role` is `user` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-message.html#cfn-bedrock-prompt-message-content)
       */
      override fun content(): Any = unwrap(this).getContent()

      /**
       * The role that the message plays in the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-message.html#cfn-bedrock-prompt-message-role)
       */
      override fun role(): String = unwrap(this).getRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.MessageProperty):
          MessageProperty = CdkObjectWrappers.wrap(cdkObject) as? MessageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.MessageProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnPrompt.MessageProperty
    }
  }

  /**
   * Contains specifications for an Amazon Bedrock agent with which to use the prompt.
   *
   * For more information, see [Create a prompt using Prompt
   * management](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html)
   * and [Automate tasks in your application using conversational
   * agents](https://docs.aws.amazon.com/bedrock/latest/userguide/agents.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptAgentResourceProperty promptAgentResourceProperty = PromptAgentResourceProperty.builder()
   * .agentIdentifier("agentIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptagentresource.html)
   */
  public interface PromptAgentResourceProperty {
    /**
     * The ARN of the agent with which to use the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptagentresource.html#cfn-bedrock-prompt-promptagentresource-agentidentifier)
     */
    public fun agentIdentifier(): String

    /**
     * A builder for [PromptAgentResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentIdentifier The ARN of the agent with which to use the prompt. 
       */
      public fun agentIdentifier(agentIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptAgentResourceProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptAgentResourceProperty.builder()

      /**
       * @param agentIdentifier The ARN of the agent with which to use the prompt. 
       */
      override fun agentIdentifier(agentIdentifier: String) {
        cdkBuilder.agentIdentifier(agentIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptAgentResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptAgentResourceProperty,
    ) : CdkObject(cdkObject),
        PromptAgentResourceProperty {
      /**
       * The ARN of the agent with which to use the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptagentresource.html#cfn-bedrock-prompt-promptagentresource-agentidentifier)
       */
      override fun agentIdentifier(): String = unwrap(this).getAgentIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptAgentResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptAgentResourceProperty):
          PromptAgentResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptAgentResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptAgentResourceProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptAgentResourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptAgentResourceProperty
    }
  }

  /**
   * Contains specifications for a generative AI resource with which to use the prompt.
   *
   * For more information, see [Create a prompt using Prompt
   * management](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptGenAiResourceProperty promptGenAiResourceProperty = PromptGenAiResourceProperty.builder()
   * .agent(PromptAgentResourceProperty.builder()
   * .agentIdentifier("agentIdentifier")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptgenairesource.html)
   */
  public interface PromptGenAiResourceProperty {
    /**
     * Specifies an Amazon Bedrock agent with which to use the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptgenairesource.html#cfn-bedrock-prompt-promptgenairesource-agent)
     */
    public fun agent(): Any

    /**
     * A builder for [PromptGenAiResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. 
       */
      public fun agent(agent: IResolvable)

      /**
       * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. 
       */
      public fun agent(agent: PromptAgentResourceProperty)

      /**
       * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07035640727828abe87d9faf0d8f841465f54ea980e49bcc4278c27d6c2973ab")
      public fun agent(agent: PromptAgentResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptGenAiResourceProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptGenAiResourceProperty.builder()

      /**
       * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. 
       */
      override fun agent(agent: IResolvable) {
        cdkBuilder.agent(agent.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. 
       */
      override fun agent(agent: PromptAgentResourceProperty) {
        cdkBuilder.agent(agent.let(PromptAgentResourceProperty.Companion::unwrap))
      }

      /**
       * @param agent Specifies an Amazon Bedrock agent with which to use the prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07035640727828abe87d9faf0d8f841465f54ea980e49bcc4278c27d6c2973ab")
      override fun agent(agent: PromptAgentResourceProperty.Builder.() -> Unit): Unit =
          agent(PromptAgentResourceProperty(agent))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptGenAiResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptGenAiResourceProperty,
    ) : CdkObject(cdkObject),
        PromptGenAiResourceProperty {
      /**
       * Specifies an Amazon Bedrock agent with which to use the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptgenairesource.html#cfn-bedrock-prompt-promptgenairesource-agent)
       */
      override fun agent(): Any = unwrap(this).getAgent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptGenAiResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptGenAiResourceProperty):
          PromptGenAiResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptGenAiResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptGenAiResourceProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptGenAiResourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptGenAiResourceProperty
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
   * .topP(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinferenceconfiguration.html)
   */
  public interface PromptInferenceConfigurationProperty {
    /**
     * Contains inference configurations for a text prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinferenceconfiguration.html#cfn-bedrock-prompt-promptinferenceconfiguration-text)
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
      @JvmName("ab599a4b78a1bf3e23ad8b9ea15d050ccc01528c07661c74cfa41231f8a3dedc")
      public fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty.builder()

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
      @JvmName("ab599a4b78a1bf3e23ad8b9ea15d050ccc01528c07661c74cfa41231f8a3dedc")
      override fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit): Unit =
          text(PromptModelInferenceConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptInferenceConfigurationProperty {
      /**
       * Contains inference configurations for a text prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinferenceconfiguration.html#cfn-bedrock-prompt-promptinferenceconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty):
          PromptInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInferenceConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinputvariable.html)
   */
  public interface PromptInputVariableProperty {
    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinputvariable.html#cfn-bedrock-prompt-promptinputvariable-name)
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
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty.builder()

      /**
       * @param name The name of the variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty,
    ) : CdkObject(cdkObject),
        PromptInputVariableProperty {
      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptinputvariable.html#cfn-bedrock-prompt-promptinputvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptInputVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty):
          PromptInputVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInputVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInputVariableProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptInputVariableProperty
    }
  }

  /**
   * Contains a key-value pair that defines a metadata tag and value to attach to a prompt variant.
   *
   * For more information, see [Create a prompt using Prompt
   * management](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-create.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PromptMetadataEntryProperty promptMetadataEntryProperty = PromptMetadataEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmetadataentry.html)
   */
  public interface PromptMetadataEntryProperty {
    /**
     * The key of a metadata tag for a prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmetadataentry.html#cfn-bedrock-prompt-promptmetadataentry-key)
     */
    public fun key(): String

    /**
     * The value of a metadata tag for a prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmetadataentry.html#cfn-bedrock-prompt-promptmetadataentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [PromptMetadataEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key of a metadata tag for a prompt variant. 
       */
      public fun key(key: String)

      /**
       * @param value The value of a metadata tag for a prompt variant. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptMetadataEntryProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptMetadataEntryProperty.builder()

      /**
       * @param key The key of a metadata tag for a prompt variant. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of a metadata tag for a prompt variant. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptMetadataEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptMetadataEntryProperty,
    ) : CdkObject(cdkObject),
        PromptMetadataEntryProperty {
      /**
       * The key of a metadata tag for a prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmetadataentry.html#cfn-bedrock-prompt-promptmetadataentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of a metadata tag for a prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmetadataentry.html#cfn-bedrock-prompt-promptmetadataentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptMetadataEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptMetadataEntryProperty):
          PromptMetadataEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptMetadataEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptMetadataEntryProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptMetadataEntryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptMetadataEntryProperty
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
   * .topP(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html)
   */
  public interface PromptModelInferenceConfigurationProperty {
    /**
     * The maximum number of tokens to return in the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-maxtokens)
     */
    public fun maxTokens(): Number? = unwrap(this).getMaxTokens()

    /**
     * A list of strings that define sequences after which the model will stop generating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-stopsequences)
     */
    public fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

    /**
     * Controls the randomness of the response.
     *
     * Choose a lower value for more predictable outputs and a higher value for more surprising
     * outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-temperature)
     */
    public fun temperature(): Number? = unwrap(this).getTemperature()

    /**
     * The percentage of most-likely candidates that the model considers for the next token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-topp)
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
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      public fun topP(topP: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty.builder()

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
       * @param topP The percentage of most-likely candidates that the model considers for the next
       * token.
       */
      override fun topP(topP: Number) {
        cdkBuilder.topP(topP)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptModelInferenceConfigurationProperty {
      /**
       * The maximum number of tokens to return in the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-maxtokens)
       */
      override fun maxTokens(): Number? = unwrap(this).getMaxTokens()

      /**
       * A list of strings that define sequences after which the model will stop generating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-stopsequences)
       */
      override fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

      /**
       * Controls the randomness of the response.
       *
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-temperature)
       */
      override fun temperature(): Number? = unwrap(this).getTemperature()

      /**
       * The percentage of most-likely candidates that the model considers for the next token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptmodelinferenceconfiguration.html#cfn-bedrock-prompt-promptmodelinferenceconfiguration-topp)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty):
          PromptModelInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptModelInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptModelInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptModelInferenceConfigurationProperty
    }
  }

  /**
   * Contains the message for a prompt.
   *
   * For more information, see [Construct and store reusable prompts with Prompt management in
   * Amazon Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object any;
   * Object auto;
   * Object json;
   * PromptTemplateConfigurationProperty promptTemplateConfigurationProperty =
   * PromptTemplateConfigurationProperty.builder()
   * .chat(ChatPromptTemplateConfigurationProperty.builder()
   * .messages(List.of(MessageProperty.builder()
   * .content(List.of(ContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build()))
   * .role("role")
   * .build()))
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .system(List.of(SystemContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build()))
   * .toolConfiguration(ToolConfigurationProperty.builder()
   * .tools(List.of(ToolProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .toolSpec(ToolSpecificationProperty.builder()
   * .inputSchema(ToolInputSchemaProperty.builder()
   * .json(json)
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .build())
   * .build()))
   * // the properties below are optional
   * .toolChoice(ToolChoiceProperty.builder()
   * .any(any)
   * .auto(auto)
   * .tool(SpecificToolChoiceProperty.builder()
   * .name("name")
   * .build())
   * .build())
   * .build())
   * .build())
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .text("text")
   * .textS3Location(TextS3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version("version")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html)
   */
  public interface PromptTemplateConfigurationProperty {
    /**
     * Contains configurations to use the prompt in a conversational format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html#cfn-bedrock-prompt-prompttemplateconfiguration-chat)
     */
    public fun chat(): Any? = unwrap(this).getChat()

    /**
     * Contains configurations for the text in a message for a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html#cfn-bedrock-prompt-prompttemplateconfiguration-text)
     */
    public fun text(): Any? = unwrap(this).getText()

    /**
     * A builder for [PromptTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chat Contains configurations to use the prompt in a conversational format.
       */
      public fun chat(chat: IResolvable)

      /**
       * @param chat Contains configurations to use the prompt in a conversational format.
       */
      public fun chat(chat: ChatPromptTemplateConfigurationProperty)

      /**
       * @param chat Contains configurations to use the prompt in a conversational format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa06a65be432cfcda6c594ce36fef50f96cf8b0ff934f14654adce0ddcb6de6e")
      public fun chat(chat: ChatPromptTemplateConfigurationProperty.Builder.() -> Unit)

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
      @JvmName("554107c324cc7377756d6996f21ba0e9883d0fe2fecc8d558b6268f3effb0fa1")
      public fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty.builder()

      /**
       * @param chat Contains configurations to use the prompt in a conversational format.
       */
      override fun chat(chat: IResolvable) {
        cdkBuilder.chat(chat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param chat Contains configurations to use the prompt in a conversational format.
       */
      override fun chat(chat: ChatPromptTemplateConfigurationProperty) {
        cdkBuilder.chat(chat.let(ChatPromptTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param chat Contains configurations to use the prompt in a conversational format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa06a65be432cfcda6c594ce36fef50f96cf8b0ff934f14654adce0ddcb6de6e")
      override fun chat(chat: ChatPromptTemplateConfigurationProperty.Builder.() -> Unit): Unit =
          chat(ChatPromptTemplateConfigurationProperty(chat))

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
      @JvmName("554107c324cc7377756d6996f21ba0e9883d0fe2fecc8d558b6268f3effb0fa1")
      override fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit): Unit =
          text(TextPromptTemplateConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptTemplateConfigurationProperty {
      /**
       * Contains configurations to use the prompt in a conversational format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html#cfn-bedrock-prompt-prompttemplateconfiguration-chat)
       */
      override fun chat(): Any? = unwrap(this).getChat()

      /**
       * Contains configurations for the text in a message for a prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-prompttemplateconfiguration.html#cfn-bedrock-prompt-prompttemplateconfiguration-text)
       */
      override fun text(): Any? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty):
          PromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptTemplateConfigurationProperty
    }
  }

  /**
   * Contains details about a variant of the prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object additionalModelRequestFields;
   * Object any;
   * Object auto;
   * Object json;
   * PromptVariantProperty promptVariantProperty = PromptVariantProperty.builder()
   * .name("name")
   * .templateConfiguration(PromptTemplateConfigurationProperty.builder()
   * .chat(ChatPromptTemplateConfigurationProperty.builder()
   * .messages(List.of(MessageProperty.builder()
   * .content(List.of(ContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build()))
   * .role("role")
   * .build()))
   * // the properties below are optional
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .system(List.of(SystemContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build()))
   * .toolConfiguration(ToolConfigurationProperty.builder()
   * .tools(List.of(ToolProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .toolSpec(ToolSpecificationProperty.builder()
   * .inputSchema(ToolInputSchemaProperty.builder()
   * .json(json)
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .build())
   * .build()))
   * // the properties below are optional
   * .toolChoice(ToolChoiceProperty.builder()
   * .any(any)
   * .auto(auto)
   * .tool(SpecificToolChoiceProperty.builder()
   * .name("name")
   * .build())
   * .build())
   * .build())
   * .build())
   * .text(TextPromptTemplateConfigurationProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .text("text")
   * .textS3Location(TextS3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version("version")
   * .build())
   * .build())
   * .build())
   * .templateType("templateType")
   * // the properties below are optional
   * .additionalModelRequestFields(additionalModelRequestFields)
   * .genAiResource(PromptGenAiResourceProperty.builder()
   * .agent(PromptAgentResourceProperty.builder()
   * .agentIdentifier("agentIdentifier")
   * .build())
   * .build())
   * .inferenceConfiguration(PromptInferenceConfigurationProperty.builder()
   * .text(PromptModelInferenceConfigurationProperty.builder()
   * .maxTokens(123)
   * .stopSequences(List.of("stopSequences"))
   * .temperature(123)
   * .topP(123)
   * .build())
   * .build())
   * .metadata(List.of(PromptMetadataEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .modelId("modelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html)
   */
  public interface PromptVariantProperty {
    /**
     * Contains model-specific inference configurations that aren't in the `inferenceConfiguration`
     * field.
     *
     * To see model-specific inference parameters, see [Inference request parameters and response
     * fields for foundation
     * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-additionalmodelrequestfields)
     */
    public fun additionalModelRequestFields(): Any? = unwrap(this).getAdditionalModelRequestFields()

    /**
     * Specifies a generative AI resource with which to use the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-genairesource)
     */
    public fun genAiResource(): Any? = unwrap(this).getGenAiResource()

    /**
     * Contains inference configurations for the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * An array of objects, each containing a key-value pair that defines a metadata tag and value
     * to attach to a prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-metadata)
     */
    public fun metadata(): Any? = unwrap(this).getMetadata()

    /**
     * The unique identifier of the model or [inference
     * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) with
     * which to run inference on the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-modelid)
     */
    public fun modelId(): String? = unwrap(this).getModelId()

    /**
     * The name of the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-name)
     */
    public fun name(): String

    /**
     * Contains configurations for the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templateconfiguration)
     */
    public fun templateConfiguration(): Any

    /**
     * The type of prompt template to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templatetype)
     */
    public fun templateType(): String

    /**
     * A builder for [PromptVariantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalModelRequestFields Contains model-specific inference configurations that
       * aren't in the `inferenceConfiguration` field.
       * To see model-specific inference parameters, see [Inference request parameters and response
       * fields for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      public fun additionalModelRequestFields(additionalModelRequestFields: Any)

      /**
       * @param genAiResource Specifies a generative AI resource with which to use the prompt.
       */
      public fun genAiResource(genAiResource: IResolvable)

      /**
       * @param genAiResource Specifies a generative AI resource with which to use the prompt.
       */
      public fun genAiResource(genAiResource: PromptGenAiResourceProperty)

      /**
       * @param genAiResource Specifies a generative AI resource with which to use the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b94e499b2bbcab03317ec53d4ce3623cac83270c591930a7443f087853aa453")
      public fun genAiResource(genAiResource: PromptGenAiResourceProperty.Builder.() -> Unit)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      public fun inferenceConfiguration(inferenceConfiguration: IResolvable)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty)

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90dbe0e59146cb52dc591b153c5872cdeeb89cca8ca46eb283039cb48af6d817")
      public
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param metadata An array of objects, each containing a key-value pair that defines a
       * metadata tag and value to attach to a prompt variant.
       */
      public fun metadata(metadata: IResolvable)

      /**
       * @param metadata An array of objects, each containing a key-value pair that defines a
       * metadata tag and value to attach to a prompt variant.
       */
      public fun metadata(metadata: List<Any>)

      /**
       * @param metadata An array of objects, each containing a key-value pair that defines a
       * metadata tag and value to attach to a prompt variant.
       */
      public fun metadata(vararg metadata: Any)

      /**
       * @param modelId The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html)
       * with which to run inference on the prompt.
       */
      public fun modelId(modelId: String)

      /**
       * @param name The name of the prompt variant. 
       */
      public fun name(name: String)

      /**
       * @param templateConfiguration Contains configurations for the prompt template. 
       */
      public fun templateConfiguration(templateConfiguration: IResolvable)

      /**
       * @param templateConfiguration Contains configurations for the prompt template. 
       */
      public fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty)

      /**
       * @param templateConfiguration Contains configurations for the prompt template. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5758586513ea834b3c833df383cab1d46ccf68ff3294044c3168cd548c90393e")
      public
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param templateType The type of prompt template to use. 
       */
      public fun templateType(templateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty.builder()

      /**
       * @param additionalModelRequestFields Contains model-specific inference configurations that
       * aren't in the `inferenceConfiguration` field.
       * To see model-specific inference parameters, see [Inference request parameters and response
       * fields for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       */
      override fun additionalModelRequestFields(additionalModelRequestFields: Any) {
        cdkBuilder.additionalModelRequestFields(additionalModelRequestFields)
      }

      /**
       * @param genAiResource Specifies a generative AI resource with which to use the prompt.
       */
      override fun genAiResource(genAiResource: IResolvable) {
        cdkBuilder.genAiResource(genAiResource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param genAiResource Specifies a generative AI resource with which to use the prompt.
       */
      override fun genAiResource(genAiResource: PromptGenAiResourceProperty) {
        cdkBuilder.genAiResource(genAiResource.let(PromptGenAiResourceProperty.Companion::unwrap))
      }

      /**
       * @param genAiResource Specifies a generative AI resource with which to use the prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b94e499b2bbcab03317ec53d4ce3623cac83270c591930a7443f087853aa453")
      override fun genAiResource(genAiResource: PromptGenAiResourceProperty.Builder.() -> Unit):
          Unit = genAiResource(PromptGenAiResourceProperty(genAiResource))

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      override fun inferenceConfiguration(inferenceConfiguration: IResolvable) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty) {
        cdkBuilder.inferenceConfiguration(inferenceConfiguration.let(PromptInferenceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inferenceConfiguration Contains inference configurations for the prompt variant.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90dbe0e59146cb52dc591b153c5872cdeeb89cca8ca46eb283039cb48af6d817")
      override
          fun inferenceConfiguration(inferenceConfiguration: PromptInferenceConfigurationProperty.Builder.() -> Unit):
          Unit =
          inferenceConfiguration(PromptInferenceConfigurationProperty(inferenceConfiguration))

      /**
       * @param metadata An array of objects, each containing a key-value pair that defines a
       * metadata tag and value to attach to a prompt variant.
       */
      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metadata An array of objects, each containing a key-value pair that defines a
       * metadata tag and value to attach to a prompt variant.
       */
      override fun metadata(metadata: List<Any>) {
        cdkBuilder.metadata(metadata.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param metadata An array of objects, each containing a key-value pair that defines a
       * metadata tag and value to attach to a prompt variant.
       */
      override fun metadata(vararg metadata: Any): Unit = metadata(metadata.toList())

      /**
       * @param modelId The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html)
       * with which to run inference on the prompt.
       */
      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      /**
       * @param name The name of the prompt variant. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param templateConfiguration Contains configurations for the prompt template. 
       */
      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains configurations for the prompt template. 
       */
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(PromptTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param templateConfiguration Contains configurations for the prompt template. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5758586513ea834b3c833df383cab1d46ccf68ff3294044c3168cd548c90393e")
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(PromptTemplateConfigurationProperty(templateConfiguration))

      /**
       * @param templateType The type of prompt template to use. 
       */
      override fun templateType(templateType: String) {
        cdkBuilder.templateType(templateType)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty,
    ) : CdkObject(cdkObject),
        PromptVariantProperty {
      /**
       * Contains model-specific inference configurations that aren't in the
       * `inferenceConfiguration` field.
       *
       * To see model-specific inference parameters, see [Inference request parameters and response
       * fields for foundation
       * models](https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-additionalmodelrequestfields)
       */
      override fun additionalModelRequestFields(): Any? =
          unwrap(this).getAdditionalModelRequestFields()

      /**
       * Specifies a generative AI resource with which to use the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-genairesource)
       */
      override fun genAiResource(): Any? = unwrap(this).getGenAiResource()

      /**
       * Contains inference configurations for the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * An array of objects, each containing a key-value pair that defines a metadata tag and value
       * to attach to a prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-metadata)
       */
      override fun metadata(): Any? = unwrap(this).getMetadata()

      /**
       * The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html)
       * with which to run inference on the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-modelid)
       */
      override fun modelId(): String? = unwrap(this).getModelId()

      /**
       * The name of the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Contains configurations for the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templateconfiguration)
       */
      override fun templateConfiguration(): Any = unwrap(this).getTemplateConfiguration()

      /**
       * The type of prompt template to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-promptvariant.html#cfn-bedrock-prompt-promptvariant-templatetype)
       */
      override fun templateType(): String = unwrap(this).getTemplateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty):
          PromptVariantProperty = CdkObjectWrappers.wrap(cdkObject) as? PromptVariantProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptVariantProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.PromptVariantProperty
    }
  }

  /**
   * The model must request a specific tool.
   *
   * For example, `{"tool" : {"name" : "Your tool name"}}` . For more information, see [Call a tool
   * with the Converse API](https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html) in the
   * Amazon Bedrock User Guide
   *
   *
   * This field is only supported by Anthropic Claude 3 models.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SpecificToolChoiceProperty specificToolChoiceProperty = SpecificToolChoiceProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-specifictoolchoice.html)
   */
  public interface SpecificToolChoiceProperty {
    /**
     * The name of the tool that the model must request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-specifictoolchoice.html#cfn-bedrock-prompt-specifictoolchoice-name)
     */
    public fun name(): String

    /**
     * A builder for [SpecificToolChoiceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the tool that the model must request. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.SpecificToolChoiceProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.SpecificToolChoiceProperty.builder()

      /**
       * @param name The name of the tool that the model must request. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.SpecificToolChoiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.SpecificToolChoiceProperty,
    ) : CdkObject(cdkObject),
        SpecificToolChoiceProperty {
      /**
       * The name of the tool that the model must request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-specifictoolchoice.html#cfn-bedrock-prompt-specifictoolchoice-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpecificToolChoiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.SpecificToolChoiceProperty):
          SpecificToolChoiceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpecificToolChoiceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpecificToolChoiceProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.SpecificToolChoiceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.SpecificToolChoiceProperty
    }
  }

  /**
   * Contains configurations for instructions to provide the model for how to handle input.
   *
   * To learn more, see [Using the Converse
   * API](https://docs.aws.amazon.com/bedrock/latest/userguide/conversation-inference-call.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SystemContentBlockProperty systemContentBlockProperty = SystemContentBlockProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-systemcontentblock.html)
   */
  public interface SystemContentBlockProperty {
    /**
     * CachePoint to include in the system prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-systemcontentblock.html#cfn-bedrock-prompt-systemcontentblock-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * A system prompt for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-systemcontentblock.html#cfn-bedrock-prompt-systemcontentblock-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * A builder for [SystemContentBlockProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cachePoint CachePoint to include in the system prompt.
       */
      public fun cachePoint(cachePoint: IResolvable)

      /**
       * @param cachePoint CachePoint to include in the system prompt.
       */
      public fun cachePoint(cachePoint: CachePointBlockProperty)

      /**
       * @param cachePoint CachePoint to include in the system prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2ca21cc0d446c1ad898ee6513dacdf2927773dcac13b2af4bd1d15142fbc690")
      public fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit)

      /**
       * @param text A system prompt for the model.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.SystemContentBlockProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.SystemContentBlockProperty.builder()

      /**
       * @param cachePoint CachePoint to include in the system prompt.
       */
      override fun cachePoint(cachePoint: IResolvable) {
        cdkBuilder.cachePoint(cachePoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cachePoint CachePoint to include in the system prompt.
       */
      override fun cachePoint(cachePoint: CachePointBlockProperty) {
        cdkBuilder.cachePoint(cachePoint.let(CachePointBlockProperty.Companion::unwrap))
      }

      /**
       * @param cachePoint CachePoint to include in the system prompt.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2ca21cc0d446c1ad898ee6513dacdf2927773dcac13b2af4bd1d15142fbc690")
      override fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit): Unit =
          cachePoint(CachePointBlockProperty(cachePoint))

      /**
       * @param text A system prompt for the model.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.SystemContentBlockProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.SystemContentBlockProperty,
    ) : CdkObject(cdkObject),
        SystemContentBlockProperty {
      /**
       * CachePoint to include in the system prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-systemcontentblock.html#cfn-bedrock-prompt-systemcontentblock-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * A system prompt for the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-systemcontentblock.html#cfn-bedrock-prompt-systemcontentblock-text)
       */
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemContentBlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.SystemContentBlockProperty):
          SystemContentBlockProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SystemContentBlockProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemContentBlockProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.SystemContentBlockProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.SystemContentBlockProperty
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
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .text("text")
   * .textS3Location(TextS3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html)
   */
  public interface TextPromptTemplateConfigurationProperty {
    /**
     * A cache checkpoint within a template configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * The message for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * The Amazon S3 location of the prompt text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-texts3location)
     */
    public fun textS3Location(): Any? = unwrap(this).getTextS3Location()

    /**
     * A builder for [TextPromptTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cachePoint A cache checkpoint within a template configuration.
       */
      public fun cachePoint(cachePoint: IResolvable)

      /**
       * @param cachePoint A cache checkpoint within a template configuration.
       */
      public fun cachePoint(cachePoint: CachePointBlockProperty)

      /**
       * @param cachePoint A cache checkpoint within a template configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8627a5b0270ca941bc36e1a187085260f1c4e700cca08f9af5ead95f57f39802")
      public fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit)

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

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      public fun textS3Location(textS3Location: IResolvable)

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      public fun textS3Location(textS3Location: TextS3LocationProperty)

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02427a56088d9207e758c07379af97595ff46441a363782bde2a8f9c67a84ce4")
      public fun textS3Location(textS3Location: TextS3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty.builder()

      /**
       * @param cachePoint A cache checkpoint within a template configuration.
       */
      override fun cachePoint(cachePoint: IResolvable) {
        cdkBuilder.cachePoint(cachePoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cachePoint A cache checkpoint within a template configuration.
       */
      override fun cachePoint(cachePoint: CachePointBlockProperty) {
        cdkBuilder.cachePoint(cachePoint.let(CachePointBlockProperty.Companion::unwrap))
      }

      /**
       * @param cachePoint A cache checkpoint within a template configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8627a5b0270ca941bc36e1a187085260f1c4e700cca08f9af5ead95f57f39802")
      override fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit): Unit =
          cachePoint(CachePointBlockProperty(cachePoint))

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

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      override fun textS3Location(textS3Location: IResolvable) {
        cdkBuilder.textS3Location(textS3Location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      override fun textS3Location(textS3Location: TextS3LocationProperty) {
        cdkBuilder.textS3Location(textS3Location.let(TextS3LocationProperty.Companion::unwrap))
      }

      /**
       * @param textS3Location The Amazon S3 location of the prompt text.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02427a56088d9207e758c07379af97595ff46441a363782bde2a8f9c67a84ce4")
      override fun textS3Location(textS3Location: TextS3LocationProperty.Builder.() -> Unit): Unit =
          textS3Location(TextS3LocationProperty(textS3Location))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        TextPromptTemplateConfigurationProperty {
      /**
       * A cache checkpoint within a template configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * The message for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-text)
       */
      override fun text(): String? = unwrap(this).getText()

      /**
       * The Amazon S3 location of the prompt text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-textprompttemplateconfiguration.html#cfn-bedrock-prompt-textprompttemplateconfiguration-texts3location)
       */
      override fun textS3Location(): Any? = unwrap(this).getTextS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TextPromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty):
          TextPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextPromptTemplateConfigurationProperty
    }
  }

  /**
   * The Amazon S3 location of the prompt text.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TextS3LocationProperty textS3LocationProperty = TextS3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html)
   */
  public interface TextS3LocationProperty {
    /**
     * The Amazon S3 bucket containing the prompt text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-bucket)
     */
    public fun bucket(): String

    /**
     * The object key for the Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-key)
     */
    public fun key(): String

    /**
     * The version of the Amazon S3 location to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [TextS3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket containing the prompt text. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The object key for the Amazon S3 location. 
       */
      public fun key(key: String)

      /**
       * @param version The version of the Amazon S3 location to use.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket containing the prompt text. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The object key for the Amazon S3 location. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version The version of the Amazon S3 location to use.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty,
    ) : CdkObject(cdkObject),
        TextS3LocationProperty {
      /**
       * The Amazon S3 bucket containing the prompt text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The object key for the Amazon S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The version of the Amazon S3 location to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-texts3location.html#cfn-bedrock-prompt-texts3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TextS3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty):
          TextS3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? TextS3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextS3LocationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.TextS3LocationProperty
    }
  }

  /**
   * Determines which tools the model should request in a call to `Converse` or `ConverseStream` .
   *
   * For more information, see [Call a tool with the Converse
   * API](https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object any;
   * Object auto;
   * ToolChoiceProperty toolChoiceProperty = ToolChoiceProperty.builder()
   * .any(any)
   * .auto(auto)
   * .tool(SpecificToolChoiceProperty.builder()
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolchoice.html)
   */
  public interface ToolChoiceProperty {
    /**
     * The model must request at least one tool (no text is generated).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolchoice.html#cfn-bedrock-prompt-toolchoice-any)
     */
    public fun any(): Any? = unwrap(this).getAny()

    /**
     * (Default).
     *
     * The Model automatically decides if a tool should be called or whether to generate text
     * instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolchoice.html#cfn-bedrock-prompt-toolchoice-auto)
     */
    public fun auto(): Any? = unwrap(this).getAuto()

    /**
     * The Model must request the specified tool.
     *
     * Only supported by Anthropic Claude 3 and Amazon Nova models.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolchoice.html#cfn-bedrock-prompt-toolchoice-tool)
     */
    public fun tool(): Any? = unwrap(this).getTool()

    /**
     * A builder for [ToolChoiceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param any The model must request at least one tool (no text is generated).
       */
      public fun any(any: Any)

      /**
       * @param auto (Default).
       * The Model automatically decides if a tool should be called or whether to generate text
       * instead.
       */
      public fun auto(auto: Any)

      /**
       * @param tool The Model must request the specified tool.
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       */
      public fun tool(tool: IResolvable)

      /**
       * @param tool The Model must request the specified tool.
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       */
      public fun tool(tool: SpecificToolChoiceProperty)

      /**
       * @param tool The Model must request the specified tool.
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b269324d91b6f03d0e89ab47693345fe860a6a70750631c27eedb5421febdcc0")
      public fun tool(tool: SpecificToolChoiceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolChoiceProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolChoiceProperty.builder()

      /**
       * @param any The model must request at least one tool (no text is generated).
       */
      override fun any(any: Any) {
        cdkBuilder.any(any)
      }

      /**
       * @param auto (Default).
       * The Model automatically decides if a tool should be called or whether to generate text
       * instead.
       */
      override fun auto(auto: Any) {
        cdkBuilder.auto(auto)
      }

      /**
       * @param tool The Model must request the specified tool.
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       */
      override fun tool(tool: IResolvable) {
        cdkBuilder.tool(tool.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tool The Model must request the specified tool.
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       */
      override fun tool(tool: SpecificToolChoiceProperty) {
        cdkBuilder.tool(tool.let(SpecificToolChoiceProperty.Companion::unwrap))
      }

      /**
       * @param tool The Model must request the specified tool.
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b269324d91b6f03d0e89ab47693345fe860a6a70750631c27eedb5421febdcc0")
      override fun tool(tool: SpecificToolChoiceProperty.Builder.() -> Unit): Unit =
          tool(SpecificToolChoiceProperty(tool))

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.ToolChoiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolChoiceProperty,
    ) : CdkObject(cdkObject),
        ToolChoiceProperty {
      /**
       * The model must request at least one tool (no text is generated).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolchoice.html#cfn-bedrock-prompt-toolchoice-any)
       */
      override fun any(): Any? = unwrap(this).getAny()

      /**
       * (Default).
       *
       * The Model automatically decides if a tool should be called or whether to generate text
       * instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolchoice.html#cfn-bedrock-prompt-toolchoice-auto)
       */
      override fun auto(): Any? = unwrap(this).getAuto()

      /**
       * The Model must request the specified tool.
       *
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolchoice.html#cfn-bedrock-prompt-toolchoice-tool)
       */
      override fun tool(): Any? = unwrap(this).getTool()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolChoiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolChoiceProperty):
          ToolChoiceProperty = CdkObjectWrappers.wrap(cdkObject) as? ToolChoiceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolChoiceProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolChoiceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolChoiceProperty
    }
  }

  /**
   * Configuration information for the tools that you pass to a model.
   *
   * For more information, see [Tool use (function
   * calling)](https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html) in the Amazon
   * Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object any;
   * Object auto;
   * Object json;
   * ToolConfigurationProperty toolConfigurationProperty = ToolConfigurationProperty.builder()
   * .tools(List.of(ToolProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .toolSpec(ToolSpecificationProperty.builder()
   * .inputSchema(ToolInputSchemaProperty.builder()
   * .json(json)
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .build())
   * .build()))
   * // the properties below are optional
   * .toolChoice(ToolChoiceProperty.builder()
   * .any(any)
   * .auto(auto)
   * .tool(SpecificToolChoiceProperty.builder()
   * .name("name")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolconfiguration.html)
   */
  public interface ToolConfigurationProperty {
    /**
     * If supported by model, forces the model to request a tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolconfiguration.html#cfn-bedrock-prompt-toolconfiguration-toolchoice)
     */
    public fun toolChoice(): Any? = unwrap(this).getToolChoice()

    /**
     * An array of tools that you want to pass to a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolconfiguration.html#cfn-bedrock-prompt-toolconfiguration-tools)
     */
    public fun tools(): Any

    /**
     * A builder for [ToolConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param toolChoice If supported by model, forces the model to request a tool.
       */
      public fun toolChoice(toolChoice: IResolvable)

      /**
       * @param toolChoice If supported by model, forces the model to request a tool.
       */
      public fun toolChoice(toolChoice: ToolChoiceProperty)

      /**
       * @param toolChoice If supported by model, forces the model to request a tool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b66b7aea1cfd9c3595a6ac9939fab9f3de78f6fb6bf9213862f17be23406ee72")
      public fun toolChoice(toolChoice: ToolChoiceProperty.Builder.() -> Unit)

      /**
       * @param tools An array of tools that you want to pass to a model. 
       */
      public fun tools(tools: IResolvable)

      /**
       * @param tools An array of tools that you want to pass to a model. 
       */
      public fun tools(tools: List<Any>)

      /**
       * @param tools An array of tools that you want to pass to a model. 
       */
      public fun tools(vararg tools: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolConfigurationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolConfigurationProperty.builder()

      /**
       * @param toolChoice If supported by model, forces the model to request a tool.
       */
      override fun toolChoice(toolChoice: IResolvable) {
        cdkBuilder.toolChoice(toolChoice.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param toolChoice If supported by model, forces the model to request a tool.
       */
      override fun toolChoice(toolChoice: ToolChoiceProperty) {
        cdkBuilder.toolChoice(toolChoice.let(ToolChoiceProperty.Companion::unwrap))
      }

      /**
       * @param toolChoice If supported by model, forces the model to request a tool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b66b7aea1cfd9c3595a6ac9939fab9f3de78f6fb6bf9213862f17be23406ee72")
      override fun toolChoice(toolChoice: ToolChoiceProperty.Builder.() -> Unit): Unit =
          toolChoice(ToolChoiceProperty(toolChoice))

      /**
       * @param tools An array of tools that you want to pass to a model. 
       */
      override fun tools(tools: IResolvable) {
        cdkBuilder.tools(tools.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tools An array of tools that you want to pass to a model. 
       */
      override fun tools(tools: List<Any>) {
        cdkBuilder.tools(tools.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param tools An array of tools that you want to pass to a model. 
       */
      override fun tools(vararg tools: Any): Unit = tools(tools.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolConfigurationProperty,
    ) : CdkObject(cdkObject),
        ToolConfigurationProperty {
      /**
       * If supported by model, forces the model to request a tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolconfiguration.html#cfn-bedrock-prompt-toolconfiguration-toolchoice)
       */
      override fun toolChoice(): Any? = unwrap(this).getToolChoice()

      /**
       * An array of tools that you want to pass to a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolconfiguration.html#cfn-bedrock-prompt-toolconfiguration-tools)
       */
      override fun tools(): Any = unwrap(this).getTools()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolConfigurationProperty):
          ToolConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ToolConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolConfigurationProperty
    }
  }

  /**
   * The schema for the tool.
   *
   * The top level schema type must be `object` . For more information, see [Call a tool with the
   * Converse API](https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html) in the Amazon
   * Bedrock User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object json;
   * ToolInputSchemaProperty toolInputSchemaProperty = ToolInputSchemaProperty.builder()
   * .json(json)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolinputschema.html)
   */
  public interface ToolInputSchemaProperty {
    /**
     * The JSON schema for the tool.
     *
     * For more information, see [JSON Schema
     * Reference](https://docs.aws.amazon.com/https://json-schema.org/understanding-json-schema/reference)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolinputschema.html#cfn-bedrock-prompt-toolinputschema-json)
     */
    public fun json(): Any

    /**
     * A builder for [ToolInputSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param json The JSON schema for the tool. 
       * For more information, see [JSON Schema
       * Reference](https://docs.aws.amazon.com/https://json-schema.org/understanding-json-schema/reference)
       * .
       */
      public fun json(json: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolInputSchemaProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolInputSchemaProperty.builder()

      /**
       * @param json The JSON schema for the tool. 
       * For more information, see [JSON Schema
       * Reference](https://docs.aws.amazon.com/https://json-schema.org/understanding-json-schema/reference)
       * .
       */
      override fun json(json: Any) {
        cdkBuilder.json(json)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.ToolInputSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolInputSchemaProperty,
    ) : CdkObject(cdkObject),
        ToolInputSchemaProperty {
      /**
       * The JSON schema for the tool.
       *
       * For more information, see [JSON Schema
       * Reference](https://docs.aws.amazon.com/https://json-schema.org/understanding-json-schema/reference)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolinputschema.html#cfn-bedrock-prompt-toolinputschema-json)
       */
      override fun json(): Any = unwrap(this).getJson()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolInputSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolInputSchemaProperty):
          ToolInputSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? ToolInputSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolInputSchemaProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolInputSchemaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolInputSchemaProperty
    }
  }

  /**
   * Information about a tool that you can use with the Converse API.
   *
   * For more information, see [Call a tool with the Converse
   * API](https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object json;
   * ToolProperty toolProperty = ToolProperty.builder()
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .toolSpec(ToolSpecificationProperty.builder()
   * .inputSchema(ToolInputSchemaProperty.builder()
   * .json(json)
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-tool.html)
   */
  public interface ToolProperty {
    /**
     * CachePoint to include in the tool configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-tool.html#cfn-bedrock-prompt-tool-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * The specfication for the tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-tool.html#cfn-bedrock-prompt-tool-toolspec)
     */
    public fun toolSpec(): Any? = unwrap(this).getToolSpec()

    /**
     * A builder for [ToolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cachePoint CachePoint to include in the tool configuration.
       */
      public fun cachePoint(cachePoint: IResolvable)

      /**
       * @param cachePoint CachePoint to include in the tool configuration.
       */
      public fun cachePoint(cachePoint: CachePointBlockProperty)

      /**
       * @param cachePoint CachePoint to include in the tool configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4563dc757f5b1b51a2739a04affdce617f25046cb8bb8ab37ac1fa9c19d8d38c")
      public fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit)

      /**
       * @param toolSpec The specfication for the tool.
       */
      public fun toolSpec(toolSpec: IResolvable)

      /**
       * @param toolSpec The specfication for the tool.
       */
      public fun toolSpec(toolSpec: ToolSpecificationProperty)

      /**
       * @param toolSpec The specfication for the tool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7296accfb07767eef6305e8e80e21e8de5e298a15d3edea480ee1dd3a200235e")
      public fun toolSpec(toolSpec: ToolSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolProperty.Builder
          = software.amazon.awscdk.services.bedrock.CfnPrompt.ToolProperty.builder()

      /**
       * @param cachePoint CachePoint to include in the tool configuration.
       */
      override fun cachePoint(cachePoint: IResolvable) {
        cdkBuilder.cachePoint(cachePoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cachePoint CachePoint to include in the tool configuration.
       */
      override fun cachePoint(cachePoint: CachePointBlockProperty) {
        cdkBuilder.cachePoint(cachePoint.let(CachePointBlockProperty.Companion::unwrap))
      }

      /**
       * @param cachePoint CachePoint to include in the tool configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4563dc757f5b1b51a2739a04affdce617f25046cb8bb8ab37ac1fa9c19d8d38c")
      override fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit): Unit =
          cachePoint(CachePointBlockProperty(cachePoint))

      /**
       * @param toolSpec The specfication for the tool.
       */
      override fun toolSpec(toolSpec: IResolvable) {
        cdkBuilder.toolSpec(toolSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param toolSpec The specfication for the tool.
       */
      override fun toolSpec(toolSpec: ToolSpecificationProperty) {
        cdkBuilder.toolSpec(toolSpec.let(ToolSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param toolSpec The specfication for the tool.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7296accfb07767eef6305e8e80e21e8de5e298a15d3edea480ee1dd3a200235e")
      override fun toolSpec(toolSpec: ToolSpecificationProperty.Builder.() -> Unit): Unit =
          toolSpec(ToolSpecificationProperty(toolSpec))

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPrompt.ToolProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolProperty,
    ) : CdkObject(cdkObject),
        ToolProperty {
      /**
       * CachePoint to include in the tool configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-tool.html#cfn-bedrock-prompt-tool-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * The specfication for the tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-tool.html#cfn-bedrock-prompt-tool-toolspec)
       */
      override fun toolSpec(): Any? = unwrap(this).getToolSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolProperty):
          ToolProperty = CdkObjectWrappers.wrap(cdkObject) as? ToolProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnPrompt.ToolProperty
    }
  }

  /**
   * The specification for the tool.
   *
   * For more information, see [Call a tool with the Converse
   * API](https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html) in the Amazon Bedrock
   * User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * Object json;
   * ToolSpecificationProperty toolSpecificationProperty = ToolSpecificationProperty.builder()
   * .inputSchema(ToolInputSchemaProperty.builder()
   * .json(json)
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolspecification.html)
   */
  public interface ToolSpecificationProperty {
    /**
     * The description for the tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolspecification.html#cfn-bedrock-prompt-toolspecification-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The input schema for the tool in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolspecification.html#cfn-bedrock-prompt-toolspecification-inputschema)
     */
    public fun inputSchema(): Any

    /**
     * The name for the tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolspecification.html#cfn-bedrock-prompt-toolspecification-name)
     */
    public fun name(): String

    /**
     * A builder for [ToolSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description for the tool.
       */
      public fun description(description: String)

      /**
       * @param inputSchema The input schema for the tool in JSON format. 
       */
      public fun inputSchema(inputSchema: IResolvable)

      /**
       * @param inputSchema The input schema for the tool in JSON format. 
       */
      public fun inputSchema(inputSchema: ToolInputSchemaProperty)

      /**
       * @param inputSchema The input schema for the tool in JSON format. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d85770264862f16ac5f23c6dc4cdd2338aa1533554193c3557871fe81a672a8e")
      public fun inputSchema(inputSchema: ToolInputSchemaProperty.Builder.() -> Unit)

      /**
       * @param name The name for the tool. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolSpecificationProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolSpecificationProperty.builder()

      /**
       * @param description The description for the tool.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param inputSchema The input schema for the tool in JSON format. 
       */
      override fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputSchema The input schema for the tool in JSON format. 
       */
      override fun inputSchema(inputSchema: ToolInputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema.let(ToolInputSchemaProperty.Companion::unwrap))
      }

      /**
       * @param inputSchema The input schema for the tool in JSON format. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d85770264862f16ac5f23c6dc4cdd2338aa1533554193c3557871fe81a672a8e")
      override fun inputSchema(inputSchema: ToolInputSchemaProperty.Builder.() -> Unit): Unit =
          inputSchema(ToolInputSchemaProperty(inputSchema))

      /**
       * @param name The name for the tool. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolSpecificationProperty,
    ) : CdkObject(cdkObject),
        ToolSpecificationProperty {
      /**
       * The description for the tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolspecification.html#cfn-bedrock-prompt-toolspecification-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The input schema for the tool in JSON format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolspecification.html#cfn-bedrock-prompt-toolspecification-inputschema)
       */
      override fun inputSchema(): Any = unwrap(this).getInputSchema()

      /**
       * The name for the tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-prompt-toolspecification.html#cfn-bedrock-prompt-toolspecification-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPrompt.ToolSpecificationProperty):
          ToolSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ToolSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolSpecificationProperty):
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPrompt.ToolSpecificationProperty
    }
  }
}
