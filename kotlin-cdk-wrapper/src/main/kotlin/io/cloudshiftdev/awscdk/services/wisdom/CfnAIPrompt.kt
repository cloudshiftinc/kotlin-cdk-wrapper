@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q in Connect AI Prompt.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIPrompt cfnAIPrompt = CfnAIPrompt.Builder.create(this, "MyCfnAIPrompt")
 * .apiFormat("apiFormat")
 * .modelId("modelId")
 * .templateConfiguration(AIPromptTemplateConfigurationProperty.builder()
 * .textFullAiPromptEditTemplateConfiguration(TextFullAIPromptEditTemplateConfigurationProperty.builder()
 * .text("text")
 * .build())
 * .build())
 * .templateType("templateType")
 * .type("type")
 * // the properties below are optional
 * .assistantId("assistantId")
 * .description("description")
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html)
 */
public open class CfnAIPrompt(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPrompt,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIPromptProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnAIPrompt(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAIPromptProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIPromptProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAIPromptProps(props)
  )

  /**
   * The API format used for this AI Prompt.
   */
  public open fun apiFormat(): String = unwrap(this).getApiFormat()

  /**
   * The API format used for this AI Prompt.
   */
  public open fun apiFormat(`value`: String) {
    unwrap(this).setApiFormat(`value`)
  }

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(): String? = unwrap(this).getAssistantId()

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(`value`: String) {
    unwrap(this).setAssistantId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AI Prompt.
   */
  public open fun attrAiPromptArn(): String = unwrap(this).getAttrAiPromptArn()

  /**
   * The identifier of the Amazon Q in Connect AI prompt.
   */
  public open fun attrAiPromptId(): String = unwrap(this).getAttrAiPromptId()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Q in Connect assistant.
   */
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  /**
   *
   */
  public open fun attrModifiedTimeSeconds(): IResolvable =
      unwrap(this).getAttrModifiedTimeSeconds().let(IResolvable::wrap)

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the AI Prompt.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the AI Prompt.
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
   * The identifier of the model used for this AI Prompt.
   *
   * The following model Ids are supported:.
   */
  public open fun modelId(): String = unwrap(this).getModelId()

  /**
   * The identifier of the model used for this AI Prompt.
   *
   * The following model Ids are supported:.
   */
  public open fun modelId(`value`: String) {
    unwrap(this).setModelId(`value`)
  }

  /**
   * The name of the AI Prompt.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the AI Prompt.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * The configuration of the prompt template for this AI Prompt.
   */
  public open fun templateConfiguration(): Any = unwrap(this).getTemplateConfiguration()

  /**
   * The configuration of the prompt template for this AI Prompt.
   */
  public open fun templateConfiguration(`value`: IResolvable) {
    unwrap(this).setTemplateConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of the prompt template for this AI Prompt.
   */
  public open fun templateConfiguration(`value`: AIPromptTemplateConfigurationProperty) {
    unwrap(this).setTemplateConfiguration(`value`.let(AIPromptTemplateConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration of the prompt template for this AI Prompt.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9d77b2de46d9ca44b08e93a27e97538c9f6125e75f35377645832a581bc8ea75")
  public open
      fun templateConfiguration(`value`: AIPromptTemplateConfigurationProperty.Builder.() -> Unit):
      Unit = templateConfiguration(AIPromptTemplateConfigurationProperty(`value`))

  /**
   * The type of the prompt template for this AI Prompt.
   */
  public open fun templateType(): String = unwrap(this).getTemplateType()

  /**
   * The type of the prompt template for this AI Prompt.
   */
  public open fun templateType(`value`: String) {
    unwrap(this).setTemplateType(`value`)
  }

  /**
   * The type of this AI Prompt.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of this AI Prompt.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAIPrompt].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API format used for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-apiformat)
     * @param apiFormat The API format used for this AI Prompt. 
     */
    public fun apiFormat(apiFormat: String)

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    public fun assistantId(assistantId: String)

    /**
     * The description of the AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-description)
     * @param description The description of the AI Prompt. 
     */
    public fun description(description: String)

    /**
     * The identifier of the model used for this AI Prompt. The following model Ids are supported:.
     *
     * * `anthropic.claude-3-haiku--v1:0`
     * * `apac.amazon.nova-lite-v1:0`
     * * `apac.amazon.nova-micro-v1:0`
     * * `apac.amazon.nova-pro-v1:0`
     * * `apac.anthropic.claude-3-5-sonnet--v2:0`
     * * `apac.anthropic.claude-3-haiku-20240307-v1:0`
     * * `eu.amazon.nova-lite-v1:0`
     * * `eu.amazon.nova-micro-v1:0`
     * * `eu.amazon.nova-pro-v1:0`
     * * `eu.anthropic.claude-3-7-sonnet-20250219-v1:0`
     * * `eu.anthropic.claude-3-haiku-20240307-v1:0`
     * * `us.amazon.nova-lite-v1:0`
     * * `us.amazon.nova-micro-v1:0`
     * * `us.amazon.nova-pro-v1:0`
     * * `us.anthropic.claude-3-5-haiku-20241022-v1:0`
     * * `us.anthropic.claude-3-7-sonnet-20250219-v1:0`
     * * `us.anthropic.claude-3-haiku-20240307-v1:0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-modelid)
     * @param modelId The identifier of the model used for this AI Prompt. The following model Ids
     * are supported:. 
     */
    public fun modelId(modelId: String)

    /**
     * The name of the AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-name)
     * @param name The name of the AI Prompt. 
     */
    public fun name(name: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The configuration of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    public fun templateConfiguration(templateConfiguration: IResolvable)

    /**
     * The configuration of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    public fun templateConfiguration(templateConfiguration: AIPromptTemplateConfigurationProperty)

    /**
     * The configuration of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61becdb265ffc9e698fe37560ae58533c2b5043b3bcb0ccb82a51dbf527dd6c3")
    public
        fun templateConfiguration(templateConfiguration: AIPromptTemplateConfigurationProperty.Builder.() -> Unit)

    /**
     * The type of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templatetype)
     * @param templateType The type of the prompt template for this AI Prompt. 
     */
    public fun templateType(templateType: String)

    /**
     * The type of this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-type)
     * @param type The type of this AI Prompt. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIPrompt.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIPrompt.Builder.create(scope, id)

    /**
     * The API format used for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-apiformat)
     * @param apiFormat The API format used for this AI Prompt. 
     */
    override fun apiFormat(apiFormat: String) {
      cdkBuilder.apiFormat(apiFormat)
    }

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * The description of the AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-description)
     * @param description The description of the AI Prompt. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the model used for this AI Prompt. The following model Ids are supported:.
     *
     * * `anthropic.claude-3-haiku--v1:0`
     * * `apac.amazon.nova-lite-v1:0`
     * * `apac.amazon.nova-micro-v1:0`
     * * `apac.amazon.nova-pro-v1:0`
     * * `apac.anthropic.claude-3-5-sonnet--v2:0`
     * * `apac.anthropic.claude-3-haiku-20240307-v1:0`
     * * `eu.amazon.nova-lite-v1:0`
     * * `eu.amazon.nova-micro-v1:0`
     * * `eu.amazon.nova-pro-v1:0`
     * * `eu.anthropic.claude-3-7-sonnet-20250219-v1:0`
     * * `eu.anthropic.claude-3-haiku-20240307-v1:0`
     * * `us.amazon.nova-lite-v1:0`
     * * `us.amazon.nova-micro-v1:0`
     * * `us.amazon.nova-pro-v1:0`
     * * `us.anthropic.claude-3-5-haiku-20241022-v1:0`
     * * `us.anthropic.claude-3-7-sonnet-20250219-v1:0`
     * * `us.anthropic.claude-3-haiku-20240307-v1:0`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-modelid)
     * @param modelId The identifier of the model used for this AI Prompt. The following model Ids
     * are supported:. 
     */
    override fun modelId(modelId: String) {
      cdkBuilder.modelId(modelId)
    }

    /**
     * The name of the AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-name)
     * @param name The name of the AI Prompt. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The configuration of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    override fun templateConfiguration(templateConfiguration: IResolvable) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    override
        fun templateConfiguration(templateConfiguration: AIPromptTemplateConfigurationProperty) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(AIPromptTemplateConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61becdb265ffc9e698fe37560ae58533c2b5043b3bcb0ccb82a51dbf527dd6c3")
    override
        fun templateConfiguration(templateConfiguration: AIPromptTemplateConfigurationProperty.Builder.() -> Unit):
        Unit = templateConfiguration(AIPromptTemplateConfigurationProperty(templateConfiguration))

    /**
     * The type of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templatetype)
     * @param templateType The type of the prompt template for this AI Prompt. 
     */
    override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    /**
     * The type of this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-type)
     * @param type The type of this AI Prompt. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIPrompt = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnAIPrompt.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAIPrompt {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAIPrompt(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPrompt): CfnAIPrompt =
        CfnAIPrompt(cdkObject)

    internal fun unwrap(wrapped: CfnAIPrompt): software.amazon.awscdk.services.wisdom.CfnAIPrompt =
        wrapped.cdkObject as software.amazon.awscdk.services.wisdom.CfnAIPrompt
  }

  /**
   * A typed union that specifies the configuration for a prompt template based on its type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AIPromptTemplateConfigurationProperty aIPromptTemplateConfigurationProperty =
   * AIPromptTemplateConfigurationProperty.builder()
   * .textFullAiPromptEditTemplateConfiguration(TextFullAIPromptEditTemplateConfigurationProperty.builder()
   * .text("text")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiprompt-aiprompttemplateconfiguration.html)
   */
  public interface AIPromptTemplateConfigurationProperty {
    /**
     * The configuration for a prompt template that supports full textual prompt configuration using
     * a YAML prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiprompt-aiprompttemplateconfiguration.html#cfn-wisdom-aiprompt-aiprompttemplateconfiguration-textfullaipromptedittemplateconfiguration)
     */
    public fun textFullAiPromptEditTemplateConfiguration(): Any

    /**
     * A builder for [AIPromptTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param textFullAiPromptEditTemplateConfiguration The configuration for a prompt template
       * that supports full textual prompt configuration using a YAML prompt. 
       */
      public
          fun textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration: IResolvable)

      /**
       * @param textFullAiPromptEditTemplateConfiguration The configuration for a prompt template
       * that supports full textual prompt configuration using a YAML prompt. 
       */
      public
          fun textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration: TextFullAIPromptEditTemplateConfigurationProperty)

      /**
       * @param textFullAiPromptEditTemplateConfiguration The configuration for a prompt template
       * that supports full textual prompt configuration using a YAML prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6d64563b8e17cd62967acddbe0c8a9a82fd960e646220e61a31113fff994cac")
      public
          fun textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration: TextFullAIPromptEditTemplateConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.AIPromptTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.AIPromptTemplateConfigurationProperty.builder()

      /**
       * @param textFullAiPromptEditTemplateConfiguration The configuration for a prompt template
       * that supports full textual prompt configuration using a YAML prompt. 
       */
      override
          fun textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration: IResolvable) {
        cdkBuilder.textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param textFullAiPromptEditTemplateConfiguration The configuration for a prompt template
       * that supports full textual prompt configuration using a YAML prompt. 
       */
      override
          fun textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration: TextFullAIPromptEditTemplateConfigurationProperty) {
        cdkBuilder.textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration.let(TextFullAIPromptEditTemplateConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param textFullAiPromptEditTemplateConfiguration The configuration for a prompt template
       * that supports full textual prompt configuration using a YAML prompt. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6d64563b8e17cd62967acddbe0c8a9a82fd960e646220e61a31113fff994cac")
      override
          fun textFullAiPromptEditTemplateConfiguration(textFullAiPromptEditTemplateConfiguration: TextFullAIPromptEditTemplateConfigurationProperty.Builder.() -> Unit):
          Unit =
          textFullAiPromptEditTemplateConfiguration(TextFullAIPromptEditTemplateConfigurationProperty(textFullAiPromptEditTemplateConfiguration))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.AIPromptTemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPrompt.AIPromptTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        AIPromptTemplateConfigurationProperty {
      /**
       * The configuration for a prompt template that supports full textual prompt configuration
       * using a YAML prompt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiprompt-aiprompttemplateconfiguration.html#cfn-wisdom-aiprompt-aiprompttemplateconfiguration-textfullaipromptedittemplateconfiguration)
       */
      override fun textFullAiPromptEditTemplateConfiguration(): Any =
          unwrap(this).getTextFullAiPromptEditTemplateConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AIPromptTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPrompt.AIPromptTemplateConfigurationProperty):
          AIPromptTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AIPromptTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AIPromptTemplateConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.AIPromptTemplateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.AIPromptTemplateConfigurationProperty
    }
  }

  /**
   * The configuration for a prompt template that supports full textual prompt configuration using a
   * YAML prompt.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * TextFullAIPromptEditTemplateConfigurationProperty
   * textFullAIPromptEditTemplateConfigurationProperty =
   * TextFullAIPromptEditTemplateConfigurationProperty.builder()
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiprompt-textfullaipromptedittemplateconfiguration.html)
   */
  public interface TextFullAIPromptEditTemplateConfigurationProperty {
    /**
     * The YAML text for the AI Prompt template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiprompt-textfullaipromptedittemplateconfiguration.html#cfn-wisdom-aiprompt-textfullaipromptedittemplateconfiguration-text)
     */
    public fun text(): String

    /**
     * A builder for [TextFullAIPromptEditTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text The YAML text for the AI Prompt template. 
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.TextFullAIPromptEditTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.TextFullAIPromptEditTemplateConfigurationProperty.builder()

      /**
       * @param text The YAML text for the AI Prompt template. 
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.TextFullAIPromptEditTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPrompt.TextFullAIPromptEditTemplateConfigurationProperty,
    ) : CdkObject(cdkObject),
        TextFullAIPromptEditTemplateConfigurationProperty {
      /**
       * The YAML text for the AI Prompt template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiprompt-textfullaipromptedittemplateconfiguration.html#cfn-wisdom-aiprompt-textfullaipromptedittemplateconfiguration-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TextFullAIPromptEditTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPrompt.TextFullAIPromptEditTemplateConfigurationProperty):
          TextFullAIPromptEditTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TextFullAIPromptEditTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TextFullAIPromptEditTemplateConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.TextFullAIPromptEditTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIPrompt.TextFullAIPromptEditTemplateConfigurationProperty
    }
  }
}
