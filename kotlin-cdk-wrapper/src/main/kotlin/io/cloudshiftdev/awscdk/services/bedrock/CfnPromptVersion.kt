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
 * Creates a static snapshot of your prompt that can be deployed to production.
 *
 * For more information, see [Deploy prompts using Prompt management by creating
 * versions](https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-management-deploy.html) in the
 * Amazon Bedrock User Guide.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnPromptVersion cfnPromptVersion = CfnPromptVersion.Builder.create(this, "MyCfnPromptVersion")
 * .promptArn("promptArn")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html)
 */
public open class CfnPromptVersion(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptVersionProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnPromptVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPromptVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPromptVersionProps(props)
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
   * The Amazon Resource Name (ARN) of the KMS key that the prompt version is encrypted with.
   */
  public open fun attrCustomerEncryptionKeyArn(): String =
      unwrap(this).getAttrCustomerEncryptionKeyArn()

  /**
   * The name of the default variant for the prompt.
   *
   * This value must match the `name` field in the relevant
   * [PromptVariant](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptVariant.html)
   * object.
   */
  public open fun attrDefaultVariant(): String = unwrap(this).getAttrDefaultVariant()

  /**
   * The name of the prompt.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The unique identifier of the prompt.
   */
  public open fun attrPromptId(): String = unwrap(this).getAttrPromptId()

  /**
   * The time at which the prompt was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * A list of objects, each containing details about a variant of the prompt.
   */
  public open fun attrVariants(): IResolvable =
      unwrap(this).getAttrVariants().let(IResolvable::wrap)

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
   * The description of the prompt version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the prompt version.
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
   * The Amazon Resource Name (ARN) of the version of the prompt.
   */
  public open fun promptArn(): String = unwrap(this).getPromptArn()

  /**
   * The Amazon Resource Name (ARN) of the version of the prompt.
   */
  public open fun promptArn(`value`: String) {
    unwrap(this).setPromptArn(`value`)
  }

  /**
   * A map of tags attached to the prompt version and their values.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A map of tags attached to the prompt version and their values.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnPromptVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the prompt version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-description)
     * @param description The description of the prompt version. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the version of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-promptarn)
     * @param promptArn The Amazon Resource Name (ARN) of the version of the prompt. 
     */
    public fun promptArn(promptArn: String)

    /**
     * A map of tags attached to the prompt version and their values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-tags)
     * @param tags A map of tags attached to the prompt version and their values. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnPromptVersion.Builder =
        software.amazon.awscdk.services.bedrock.CfnPromptVersion.Builder.create(scope, id)

    /**
     * The description of the prompt version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-description)
     * @param description The description of the prompt version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the version of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-promptarn)
     * @param promptArn The Amazon Resource Name (ARN) of the version of the prompt. 
     */
    override fun promptArn(promptArn: String) {
      cdkBuilder.promptArn(promptArn)
    }

    /**
     * A map of tags attached to the prompt version and their values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-tags)
     * @param tags A map of tags attached to the prompt version and their values. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnPromptVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnPromptVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPromptVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPromptVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion):
        CfnPromptVersion = CfnPromptVersion(cdkObject)

    internal fun unwrap(wrapped: CfnPromptVersion):
        software.amazon.awscdk.services.bedrock.CfnPromptVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnPromptVersion
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-cachepointblock.html)
   */
  public interface CachePointBlockProperty {
    /**
     * Specifies the type of cache point within the CachePointBlock.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-cachepointblock.html#cfn-bedrock-promptversion-cachepointblock-type)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.CachePointBlockProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.CachePointBlockProperty.builder()

      /**
       * @param type Specifies the type of cache point within the CachePointBlock. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.CachePointBlockProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.CachePointBlockProperty,
    ) : CdkObject(cdkObject),
        CachePointBlockProperty {
      /**
       * Specifies the type of cache point within the CachePointBlock.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-cachepointblock.html#cfn-bedrock-promptversion-cachepointblock-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CachePointBlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.CachePointBlockProperty):
          CachePointBlockProperty = CdkObjectWrappers.wrap(cdkObject) as? CachePointBlockProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CachePointBlockProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.CachePointBlockProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.CachePointBlockProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html)
   */
  public interface ChatPromptTemplateConfigurationProperty {
    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * Contains messages in the chat for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-messages)
     */
    public fun messages(): Any

    /**
     * Contains system prompts to provide context to the model or to describe how it should behave.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-system)
     */
    public fun system(): Any? = unwrap(this).getSystem()

    /**
     * Configuration information for the tools that the model can use when generating a response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-toolconfiguration)
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
      @JvmName("32167b2b3fb54cc1699a448c991449e6cd4e8eb7bfedde095aa85bf5a83dc855")
      public fun toolConfiguration(toolConfiguration: ToolConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ChatPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ChatPromptTemplateConfigurationProperty.builder()

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
      @JvmName("32167b2b3fb54cc1699a448c991449e6cd4e8eb7bfedde095aa85bf5a83dc855")
      override
          fun toolConfiguration(toolConfiguration: ToolConfigurationProperty.Builder.() -> Unit):
          Unit = toolConfiguration(ToolConfigurationProperty(toolConfiguration))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ChatPromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ChatPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        ChatPromptTemplateConfigurationProperty {
      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * Contains messages in the chat for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-messages)
       */
      override fun messages(): Any = unwrap(this).getMessages()

      /**
       * Contains system prompts to provide context to the model or to describe how it should
       * behave.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-system)
       */
      override fun system(): Any? = unwrap(this).getSystem()

      /**
       * Configuration information for the tools that the model can use when generating a response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-chatprompttemplateconfiguration.html#cfn-bedrock-promptversion-chatprompttemplateconfiguration-toolconfiguration)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ChatPromptTemplateConfigurationProperty):
          ChatPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChatPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChatPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ChatPromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ChatPromptTemplateConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-contentblock.html)
   */
  public interface ContentBlockProperty {
    /**
     * CachePoint to include in the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-contentblock.html#cfn-bedrock-promptversion-contentblock-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * Text to include in the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-contentblock.html#cfn-bedrock-promptversion-contentblock-text)
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
      @JvmName("ae44b73ea9f7a0707b440fce09c27c8ec2518fe8dafac95e095dd00529480dd8")
      public fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit)

      /**
       * @param text Text to include in the message.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ContentBlockProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ContentBlockProperty.builder()

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
      @JvmName("ae44b73ea9f7a0707b440fce09c27c8ec2518fe8dafac95e095dd00529480dd8")
      override fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit): Unit =
          cachePoint(CachePointBlockProperty(cachePoint))

      /**
       * @param text Text to include in the message.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ContentBlockProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ContentBlockProperty,
    ) : CdkObject(cdkObject),
        ContentBlockProperty {
      /**
       * CachePoint to include in the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-contentblock.html#cfn-bedrock-promptversion-contentblock-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * Text to include in the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-contentblock.html#cfn-bedrock-promptversion-contentblock-text)
       */
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentBlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ContentBlockProperty):
          ContentBlockProperty = CdkObjectWrappers.wrap(cdkObject) as? ContentBlockProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentBlockProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ContentBlockProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ContentBlockProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-message.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-message.html#cfn-bedrock-promptversion-message-content)
     */
    public fun content(): Any

    /**
     * The role that the message plays in the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-message.html#cfn-bedrock-promptversion-message-role)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.MessageProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.MessageProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPromptVersion.MessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.MessageProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-message.html#cfn-bedrock-promptversion-message-content)
       */
      override fun content(): Any = unwrap(this).getContent()

      /**
       * The role that the message plays in the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-message.html#cfn-bedrock-promptversion-message-role)
       */
      override fun role(): String = unwrap(this).getRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.MessageProperty):
          MessageProperty = CdkObjectWrappers.wrap(cdkObject) as? MessageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.MessageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.MessageProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptagentresource.html)
   */
  public interface PromptAgentResourceProperty {
    /**
     * The ARN of the agent with which to use the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptagentresource.html#cfn-bedrock-promptversion-promptagentresource-agentidentifier)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptAgentResourceProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptAgentResourceProperty.builder()

      /**
       * @param agentIdentifier The ARN of the agent with which to use the prompt. 
       */
      override fun agentIdentifier(agentIdentifier: String) {
        cdkBuilder.agentIdentifier(agentIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptAgentResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptAgentResourceProperty,
    ) : CdkObject(cdkObject),
        PromptAgentResourceProperty {
      /**
       * The ARN of the agent with which to use the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptagentresource.html#cfn-bedrock-promptversion-promptagentresource-agentidentifier)
       */
      override fun agentIdentifier(): String = unwrap(this).getAgentIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptAgentResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptAgentResourceProperty):
          PromptAgentResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptAgentResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptAgentResourceProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptAgentResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptAgentResourceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptgenairesource.html)
   */
  public interface PromptGenAiResourceProperty {
    /**
     * Specifies an Amazon Bedrock agent with which to use the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptgenairesource.html#cfn-bedrock-promptversion-promptgenairesource-agent)
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
      @JvmName("0f0b172886190f1506337e2ba6d4cfce5f95d45749958705563dc2872b3b1b73")
      public fun agent(agent: PromptAgentResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptGenAiResourceProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptGenAiResourceProperty.builder()

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
      @JvmName("0f0b172886190f1506337e2ba6d4cfce5f95d45749958705563dc2872b3b1b73")
      override fun agent(agent: PromptAgentResourceProperty.Builder.() -> Unit): Unit =
          agent(PromptAgentResourceProperty(agent))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptGenAiResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptGenAiResourceProperty,
    ) : CdkObject(cdkObject),
        PromptGenAiResourceProperty {
      /**
       * Specifies an Amazon Bedrock agent with which to use the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptgenairesource.html#cfn-bedrock-promptversion-promptgenairesource-agent)
       */
      override fun agent(): Any = unwrap(this).getAgent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptGenAiResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptGenAiResourceProperty):
          PromptGenAiResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptGenAiResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptGenAiResourceProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptGenAiResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptGenAiResourceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinferenceconfiguration.html)
   */
  public interface PromptInferenceConfigurationProperty {
    /**
     * Contains inference configurations for a text prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinferenceconfiguration.html#cfn-bedrock-promptversion-promptinferenceconfiguration-text)
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
      @JvmName("1eb3a70c9d2984900cb6bee00162680f72f000cb6a9d54b041db25acab42fa13")
      public fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty.builder()

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
      @JvmName("1eb3a70c9d2984900cb6bee00162680f72f000cb6a9d54b041db25acab42fa13")
      override fun text(text: PromptModelInferenceConfigurationProperty.Builder.() -> Unit): Unit =
          text(PromptModelInferenceConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptInferenceConfigurationProperty {
      /**
       * Contains inference configurations for a text prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinferenceconfiguration.html#cfn-bedrock-promptversion-promptinferenceconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty):
          PromptInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInferenceConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinputvariable.html)
   */
  public interface PromptInputVariableProperty {
    /**
     * The name of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinputvariable.html#cfn-bedrock-promptversion-promptinputvariable-name)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty.builder()

      /**
       * @param name The name of the variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty,
    ) : CdkObject(cdkObject),
        PromptInputVariableProperty {
      /**
       * The name of the variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptinputvariable.html#cfn-bedrock-promptversion-promptinputvariable-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptInputVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty):
          PromptInputVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptInputVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptInputVariableProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptInputVariableProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmetadataentry.html)
   */
  public interface PromptMetadataEntryProperty {
    /**
     * The key of a metadata tag for a prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmetadataentry.html#cfn-bedrock-promptversion-promptmetadataentry-key)
     */
    public fun key(): String

    /**
     * The value of a metadata tag for a prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmetadataentry.html#cfn-bedrock-promptversion-promptmetadataentry-value)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptMetadataEntryProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptMetadataEntryProperty.builder()

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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptMetadataEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptMetadataEntryProperty,
    ) : CdkObject(cdkObject),
        PromptMetadataEntryProperty {
      /**
       * The key of a metadata tag for a prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmetadataentry.html#cfn-bedrock-promptversion-promptmetadataentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of a metadata tag for a prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmetadataentry.html#cfn-bedrock-promptversion-promptmetadataentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptMetadataEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptMetadataEntryProperty):
          PromptMetadataEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptMetadataEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptMetadataEntryProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptMetadataEntryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptMetadataEntryProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html)
   */
  public interface PromptModelInferenceConfigurationProperty {
    /**
     * The maximum number of tokens to return in the response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-maxtokens)
     */
    public fun maxTokens(): Number? = unwrap(this).getMaxTokens()

    /**
     * A list of strings that define sequences after which the model will stop generating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-stopsequences)
     */
    public fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

    /**
     * Controls the randomness of the response.
     *
     * Choose a lower value for more predictable outputs and a higher value for more surprising
     * outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-temperature)
     */
    public fun temperature(): Number? = unwrap(this).getTemperature()

    /**
     * The percentage of most-likely candidates that the model considers for the next token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-topp)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty.builder()

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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptModelInferenceConfigurationProperty {
      /**
       * The maximum number of tokens to return in the response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-maxtokens)
       */
      override fun maxTokens(): Number? = unwrap(this).getMaxTokens()

      /**
       * A list of strings that define sequences after which the model will stop generating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-stopsequences)
       */
      override fun stopSequences(): List<String> = unwrap(this).getStopSequences() ?: emptyList()

      /**
       * Controls the randomness of the response.
       *
       * Choose a lower value for more predictable outputs and a higher value for more surprising
       * outputs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-temperature)
       */
      override fun temperature(): Number? = unwrap(this).getTemperature()

      /**
       * The percentage of most-likely candidates that the model considers for the next token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptmodelinferenceconfiguration.html#cfn-bedrock-promptversion-promptmodelinferenceconfiguration-topp)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty):
          PromptModelInferenceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptModelInferenceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptModelInferenceConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptModelInferenceConfigurationProperty
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
   * .text("text")
   * // the properties below are optional
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html)
   */
  public interface PromptTemplateConfigurationProperty {
    /**
     * Contains configurations to use the prompt in a conversational format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html#cfn-bedrock-promptversion-prompttemplateconfiguration-chat)
     */
    public fun chat(): Any? = unwrap(this).getChat()

    /**
     * Contains configurations for the text in a message for a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html#cfn-bedrock-promptversion-prompttemplateconfiguration-text)
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
      @JvmName("2652bacbb8bc34febc08cee0fa8c13445f831d5fcdf220e5881205fa31aaaf67")
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
      @JvmName("5372db2b1583522d3cfbd1721ee81551b34949523229af53be68a69b3267d3ae")
      public fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty.builder()

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
      @JvmName("2652bacbb8bc34febc08cee0fa8c13445f831d5fcdf220e5881205fa31aaaf67")
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
      @JvmName("5372db2b1583522d3cfbd1721ee81551b34949523229af53be68a69b3267d3ae")
      override fun text(text: TextPromptTemplateConfigurationProperty.Builder.() -> Unit): Unit =
          text(TextPromptTemplateConfigurationProperty(text))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        PromptTemplateConfigurationProperty {
      /**
       * Contains configurations to use the prompt in a conversational format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html#cfn-bedrock-promptversion-prompttemplateconfiguration-chat)
       */
      override fun chat(): Any? = unwrap(this).getChat()

      /**
       * Contains configurations for the text in a message for a prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-prompttemplateconfiguration.html#cfn-bedrock-promptversion-prompttemplateconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty):
          PromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptTemplateConfigurationProperty
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
   * .text("text")
   * // the properties below are optional
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-additionalmodelrequestfields)
     */
    public fun additionalModelRequestFields(): Any? = unwrap(this).getAdditionalModelRequestFields()

    /**
     * Specifies a generative AI resource with which to use the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-genairesource)
     */
    public fun genAiResource(): Any? = unwrap(this).getGenAiResource()

    /**
     * Contains inference configurations for the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-inferenceconfiguration)
     */
    public fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

    /**
     * An array of objects, each containing a key-value pair that defines a metadata tag and value
     * to attach to a prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-metadata)
     */
    public fun metadata(): Any? = unwrap(this).getMetadata()

    /**
     * The unique identifier of the model or [inference
     * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html) with
     * which to run inference on the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-modelid)
     */
    public fun modelId(): String? = unwrap(this).getModelId()

    /**
     * The name of the prompt variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-name)
     */
    public fun name(): String

    /**
     * Contains configurations for the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templateconfiguration)
     */
    public fun templateConfiguration(): Any

    /**
     * The type of prompt template to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templatetype)
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
      @JvmName("639ecdd3d454ab3140f4488e4a21ff6030c9431263a82d6c9f7e0f8fd736ff15")
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
      @JvmName("e958ca8723d42817e5bf41dd33f11961f16f53ad6632b4cef4e9561900dc9187")
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
      @JvmName("fd43c246455bc988caccf0f0c2809d2caf1170f715eb08f94e6fea0e78046a9f")
      public
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit)

      /**
       * @param templateType The type of prompt template to use. 
       */
      public fun templateType(templateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty.builder()

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
      @JvmName("639ecdd3d454ab3140f4488e4a21ff6030c9431263a82d6c9f7e0f8fd736ff15")
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
      @JvmName("e958ca8723d42817e5bf41dd33f11961f16f53ad6632b4cef4e9561900dc9187")
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
      @JvmName("fd43c246455bc988caccf0f0c2809d2caf1170f715eb08f94e6fea0e78046a9f")
      override
          fun templateConfiguration(templateConfiguration: PromptTemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(PromptTemplateConfigurationProperty(templateConfiguration))

      /**
       * @param templateType The type of prompt template to use. 
       */
      override fun templateType(templateType: String) {
        cdkBuilder.templateType(templateType)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-additionalmodelrequestfields)
       */
      override fun additionalModelRequestFields(): Any? =
          unwrap(this).getAdditionalModelRequestFields()

      /**
       * Specifies a generative AI resource with which to use the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-genairesource)
       */
      override fun genAiResource(): Any? = unwrap(this).getGenAiResource()

      /**
       * Contains inference configurations for the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-inferenceconfiguration)
       */
      override fun inferenceConfiguration(): Any? = unwrap(this).getInferenceConfiguration()

      /**
       * An array of objects, each containing a key-value pair that defines a metadata tag and value
       * to attach to a prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-metadata)
       */
      override fun metadata(): Any? = unwrap(this).getMetadata()

      /**
       * The unique identifier of the model or [inference
       * profile](https://docs.aws.amazon.com/bedrock/latest/userguide/cross-region-inference.html)
       * with which to run inference on the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-modelid)
       */
      override fun modelId(): String? = unwrap(this).getModelId()

      /**
       * The name of the prompt variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Contains configurations for the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templateconfiguration)
       */
      override fun templateConfiguration(): Any = unwrap(this).getTemplateConfiguration()

      /**
       * The type of prompt template to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-promptvariant.html#cfn-bedrock-promptversion-promptvariant-templatetype)
       */
      override fun templateType(): String = unwrap(this).getTemplateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PromptVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty):
          PromptVariantProperty = CdkObjectWrappers.wrap(cdkObject) as? PromptVariantProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PromptVariantProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.PromptVariantProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-specifictoolchoice.html)
   */
  public interface SpecificToolChoiceProperty {
    /**
     * The name of the tool that the model must request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-specifictoolchoice.html#cfn-bedrock-promptversion-specifictoolchoice-name)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SpecificToolChoiceProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SpecificToolChoiceProperty.builder()

      /**
       * @param name The name of the tool that the model must request. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SpecificToolChoiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.SpecificToolChoiceProperty,
    ) : CdkObject(cdkObject),
        SpecificToolChoiceProperty {
      /**
       * The name of the tool that the model must request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-specifictoolchoice.html#cfn-bedrock-promptversion-specifictoolchoice-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpecificToolChoiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.SpecificToolChoiceProperty):
          SpecificToolChoiceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpecificToolChoiceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpecificToolChoiceProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SpecificToolChoiceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SpecificToolChoiceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-systemcontentblock.html)
   */
  public interface SystemContentBlockProperty {
    /**
     * CachePoint to include in the system prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-systemcontentblock.html#cfn-bedrock-promptversion-systemcontentblock-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * A system prompt for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-systemcontentblock.html#cfn-bedrock-promptversion-systemcontentblock-text)
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
      @JvmName("0850eddf9c41d0fba1b81d37616ddc2f0cbfb280b981a6e24d47dde099d1c37a")
      public fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit)

      /**
       * @param text A system prompt for the model.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SystemContentBlockProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SystemContentBlockProperty.builder()

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
      @JvmName("0850eddf9c41d0fba1b81d37616ddc2f0cbfb280b981a6e24d47dde099d1c37a")
      override fun cachePoint(cachePoint: CachePointBlockProperty.Builder.() -> Unit): Unit =
          cachePoint(CachePointBlockProperty(cachePoint))

      /**
       * @param text A system prompt for the model.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SystemContentBlockProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.SystemContentBlockProperty,
    ) : CdkObject(cdkObject),
        SystemContentBlockProperty {
      /**
       * CachePoint to include in the system prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-systemcontentblock.html#cfn-bedrock-promptversion-systemcontentblock-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * A system prompt for the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-systemcontentblock.html#cfn-bedrock-promptversion-systemcontentblock-text)
       */
      override fun text(): String? = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemContentBlockProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.SystemContentBlockProperty):
          SystemContentBlockProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SystemContentBlockProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemContentBlockProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SystemContentBlockProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.SystemContentBlockProperty
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
   * .cachePoint(CachePointBlockProperty.builder()
   * .type("type")
   * .build())
   * .inputVariables(List.of(PromptInputVariableProperty.builder()
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html)
   */
  public interface TextPromptTemplateConfigurationProperty {
    /**
     * A cache checkpoint within a template configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * An array of the variables in the prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-inputvariables)
     */
    public fun inputVariables(): Any? = unwrap(this).getInputVariables()

    /**
     * The message for the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-text)
     */
    public fun text(): String

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
      @JvmName("5c884038574233506bb3c15fdeed858da0cd584221ad878a43f29edfbd3fa333")
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
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty.builder()

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
      @JvmName("5c884038574233506bb3c15fdeed858da0cd584221ad878a43f29edfbd3fa333")
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

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        TextPromptTemplateConfigurationProperty {
      /**
       * A cache checkpoint within a template configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * An array of the variables in the prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-inputvariables)
       */
      override fun inputVariables(): Any? = unwrap(this).getInputVariables()

      /**
       * The message for the prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-textprompttemplateconfiguration.html#cfn-bedrock-promptversion-textprompttemplateconfiguration-text)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty):
          TextPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.TextPromptTemplateConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolchoice.html)
   */
  public interface ToolChoiceProperty {
    /**
     * The model must request at least one tool (no text is generated).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolchoice.html#cfn-bedrock-promptversion-toolchoice-any)
     */
    public fun any(): Any? = unwrap(this).getAny()

    /**
     * (Default).
     *
     * The Model automatically decides if a tool should be called or whether to generate text
     * instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolchoice.html#cfn-bedrock-promptversion-toolchoice-auto)
     */
    public fun auto(): Any? = unwrap(this).getAuto()

    /**
     * The Model must request the specified tool.
     *
     * Only supported by Anthropic Claude 3 and Amazon Nova models.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolchoice.html#cfn-bedrock-promptversion-toolchoice-tool)
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
      @JvmName("8c17fca01291a9ecd59d5c8a956bcffb48c5b17b76b3a053d82b0b43f738f72d")
      public fun tool(tool: SpecificToolChoiceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolChoiceProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolChoiceProperty.builder()

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
      @JvmName("8c17fca01291a9ecd59d5c8a956bcffb48c5b17b76b3a053d82b0b43f738f72d")
      override fun tool(tool: SpecificToolChoiceProperty.Builder.() -> Unit): Unit =
          tool(SpecificToolChoiceProperty(tool))

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolChoiceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolChoiceProperty,
    ) : CdkObject(cdkObject),
        ToolChoiceProperty {
      /**
       * The model must request at least one tool (no text is generated).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolchoice.html#cfn-bedrock-promptversion-toolchoice-any)
       */
      override fun any(): Any? = unwrap(this).getAny()

      /**
       * (Default).
       *
       * The Model automatically decides if a tool should be called or whether to generate text
       * instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolchoice.html#cfn-bedrock-promptversion-toolchoice-auto)
       */
      override fun auto(): Any? = unwrap(this).getAuto()

      /**
       * The Model must request the specified tool.
       *
       * Only supported by Anthropic Claude 3 and Amazon Nova models.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolchoice.html#cfn-bedrock-promptversion-toolchoice-tool)
       */
      override fun tool(): Any? = unwrap(this).getTool()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolChoiceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolChoiceProperty):
          ToolChoiceProperty = CdkObjectWrappers.wrap(cdkObject) as? ToolChoiceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolChoiceProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolChoiceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolChoiceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolconfiguration.html)
   */
  public interface ToolConfigurationProperty {
    /**
     * If supported by model, forces the model to request a tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolconfiguration.html#cfn-bedrock-promptversion-toolconfiguration-toolchoice)
     */
    public fun toolChoice(): Any? = unwrap(this).getToolChoice()

    /**
     * An array of tools that you want to pass to a model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolconfiguration.html#cfn-bedrock-promptversion-toolconfiguration-tools)
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
      @JvmName("cc54b0e664b70ee1dadd913002005b90d1318897311f7a0e59c27a12132ca2ed")
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolConfigurationProperty.builder()

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
      @JvmName("cc54b0e664b70ee1dadd913002005b90d1318897311f7a0e59c27a12132ca2ed")
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolConfigurationProperty,
    ) : CdkObject(cdkObject),
        ToolConfigurationProperty {
      /**
       * If supported by model, forces the model to request a tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolconfiguration.html#cfn-bedrock-promptversion-toolconfiguration-toolchoice)
       */
      override fun toolChoice(): Any? = unwrap(this).getToolChoice()

      /**
       * An array of tools that you want to pass to a model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolconfiguration.html#cfn-bedrock-promptversion-toolconfiguration-tools)
       */
      override fun tools(): Any = unwrap(this).getTools()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolConfigurationProperty):
          ToolConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ToolConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolConfigurationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolConfigurationProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolinputschema.html)
   */
  public interface ToolInputSchemaProperty {
    /**
     * The JSON schema for the tool.
     *
     * For more information, see [JSON Schema
     * Reference](https://docs.aws.amazon.com/https://json-schema.org/understanding-json-schema/reference)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolinputschema.html#cfn-bedrock-promptversion-toolinputschema-json)
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
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolInputSchemaProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolInputSchemaProperty.builder()

      /**
       * @param json The JSON schema for the tool. 
       * For more information, see [JSON Schema
       * Reference](https://docs.aws.amazon.com/https://json-schema.org/understanding-json-schema/reference)
       * .
       */
      override fun json(json: Any) {
        cdkBuilder.json(json)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolInputSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolInputSchemaProperty,
    ) : CdkObject(cdkObject),
        ToolInputSchemaProperty {
      /**
       * The JSON schema for the tool.
       *
       * For more information, see [JSON Schema
       * Reference](https://docs.aws.amazon.com/https://json-schema.org/understanding-json-schema/reference)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolinputschema.html#cfn-bedrock-promptversion-toolinputschema-json)
       */
      override fun json(): Any = unwrap(this).getJson()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolInputSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolInputSchemaProperty):
          ToolInputSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? ToolInputSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolInputSchemaProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolInputSchemaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolInputSchemaProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-tool.html)
   */
  public interface ToolProperty {
    /**
     * CachePoint to include in the tool configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-tool.html#cfn-bedrock-promptversion-tool-cachepoint)
     */
    public fun cachePoint(): Any? = unwrap(this).getCachePoint()

    /**
     * The specfication for the tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-tool.html#cfn-bedrock-promptversion-tool-toolspec)
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
      @JvmName("82501e0300bcbf2eb646eb354ea88345989a42407c40b2ff29d6b78c60bca25d")
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
      @JvmName("2c289aab0747d39ae26b1e4ae3cb6bf3c8ffb6ef9df58642e7ea4da65b33a601")
      public fun toolSpec(toolSpec: ToolSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolProperty.builder()

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
      @JvmName("82501e0300bcbf2eb646eb354ea88345989a42407c40b2ff29d6b78c60bca25d")
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
      @JvmName("2c289aab0747d39ae26b1e4ae3cb6bf3c8ffb6ef9df58642e7ea4da65b33a601")
      override fun toolSpec(toolSpec: ToolSpecificationProperty.Builder.() -> Unit): Unit =
          toolSpec(ToolSpecificationProperty(toolSpec))

      public fun build(): software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolProperty,
    ) : CdkObject(cdkObject),
        ToolProperty {
      /**
       * CachePoint to include in the tool configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-tool.html#cfn-bedrock-promptversion-tool-cachepoint)
       */
      override fun cachePoint(): Any? = unwrap(this).getCachePoint()

      /**
       * The specfication for the tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-tool.html#cfn-bedrock-promptversion-tool-toolspec)
       */
      override fun toolSpec(): Any? = unwrap(this).getToolSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolProperty):
          ToolProperty = CdkObjectWrappers.wrap(cdkObject) as? ToolProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolspecification.html)
   */
  public interface ToolSpecificationProperty {
    /**
     * The description for the tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolspecification.html#cfn-bedrock-promptversion-toolspecification-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The input schema for the tool in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolspecification.html#cfn-bedrock-promptversion-toolspecification-inputschema)
     */
    public fun inputSchema(): Any

    /**
     * The name for the tool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolspecification.html#cfn-bedrock-promptversion-toolspecification-name)
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
      @JvmName("4017e9fe74c199aa32eacfa132dffe0df70f157f410b74cbbcd08459245f150a")
      public fun inputSchema(inputSchema: ToolInputSchemaProperty.Builder.() -> Unit)

      /**
       * @param name The name for the tool. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolSpecificationProperty.builder()

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
      @JvmName("4017e9fe74c199aa32eacfa132dffe0df70f157f410b74cbbcd08459245f150a")
      override fun inputSchema(inputSchema: ToolInputSchemaProperty.Builder.() -> Unit): Unit =
          inputSchema(ToolInputSchemaProperty(inputSchema))

      /**
       * @param name The name for the tool. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolSpecificationProperty,
    ) : CdkObject(cdkObject),
        ToolSpecificationProperty {
      /**
       * The description for the tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolspecification.html#cfn-bedrock-promptversion-toolspecification-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The input schema for the tool in JSON format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolspecification.html#cfn-bedrock-promptversion-toolspecification-inputschema)
       */
      override fun inputSchema(): Any = unwrap(this).getInputSchema()

      /**
       * The name for the tool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-promptversion-toolspecification.html#cfn-bedrock-promptversion-toolspecification-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolSpecificationProperty):
          ToolSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ToolSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolSpecificationProperty):
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnPromptVersion.ToolSpecificationProperty
    }
  }
}
