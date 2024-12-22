@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

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
 * Properties for defining a `CfnAIPrompt`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIPromptProps cfnAIPromptProps = CfnAIPromptProps.builder()
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
public interface CfnAIPromptProps {
  /**
   * The API format used for this AI Prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-apiformat)
   */
  public fun apiFormat(): String

  /**
   * The identifier of the Amazon Q in Connect assistant.
   *
   * Can be either the ID or the ARN. URLs cannot contain the ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-assistantid)
   */
  public fun assistantId(): String? = unwrap(this).getAssistantId()

  /**
   * The description of the AI Prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the model used for this AI Prompt.
   *
   * Model Ids supported are: `CLAUDE_3_HAIKU_20240307_V1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-modelid)
   */
  public fun modelId(): String

  /**
   * The name of the AI Prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The configuration of the prompt template for this AI Prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
   */
  public fun templateConfiguration(): Any

  /**
   * The type of the prompt template for this AI Prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templatetype)
   */
  public fun templateType(): String

  /**
   * The type of this AI Prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnAIPromptProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiFormat The API format used for this AI Prompt. 
     */
    public fun apiFormat(apiFormat: String)

    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant.
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    public fun assistantId(assistantId: String)

    /**
     * @param description The description of the AI Prompt.
     */
    public fun description(description: String)

    /**
     * @param modelId The identifier of the model used for this AI Prompt. 
     * Model Ids supported are: `CLAUDE_3_HAIKU_20240307_V1` .
     */
    public fun modelId(modelId: String)

    /**
     * @param name The name of the AI Prompt.
     */
    public fun name(name: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    public fun templateConfiguration(templateConfiguration: IResolvable)

    /**
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    public
        fun templateConfiguration(templateConfiguration: CfnAIPrompt.AIPromptTemplateConfigurationProperty)

    /**
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dfb0f548efb9a28b515605a3a33a4222582f21f20dd1fad6202bde2ef2d3898")
    public
        fun templateConfiguration(templateConfiguration: CfnAIPrompt.AIPromptTemplateConfigurationProperty.Builder.() -> Unit)

    /**
     * @param templateType The type of the prompt template for this AI Prompt. 
     */
    public fun templateType(templateType: String)

    /**
     * @param type The type of this AI Prompt. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIPromptProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIPromptProps.builder()

    /**
     * @param apiFormat The API format used for this AI Prompt. 
     */
    override fun apiFormat(apiFormat: String) {
      cdkBuilder.apiFormat(apiFormat)
    }

    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant.
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param description The description of the AI Prompt.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param modelId The identifier of the model used for this AI Prompt. 
     * Model Ids supported are: `CLAUDE_3_HAIKU_20240307_V1` .
     */
    override fun modelId(modelId: String) {
      cdkBuilder.modelId(modelId)
    }

    /**
     * @param name The name of the AI Prompt.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    override fun templateConfiguration(templateConfiguration: IResolvable) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    override
        fun templateConfiguration(templateConfiguration: CfnAIPrompt.AIPromptTemplateConfigurationProperty) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(CfnAIPrompt.AIPromptTemplateConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param templateConfiguration The configuration of the prompt template for this AI Prompt. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dfb0f548efb9a28b515605a3a33a4222582f21f20dd1fad6202bde2ef2d3898")
    override
        fun templateConfiguration(templateConfiguration: CfnAIPrompt.AIPromptTemplateConfigurationProperty.Builder.() -> Unit):
        Unit =
        templateConfiguration(CfnAIPrompt.AIPromptTemplateConfigurationProperty(templateConfiguration))

    /**
     * @param templateType The type of the prompt template for this AI Prompt. 
     */
    override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    /**
     * @param type The type of this AI Prompt. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIPromptProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPromptProps,
  ) : CdkObject(cdkObject),
      CfnAIPromptProps {
    /**
     * The API format used for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-apiformat)
     */
    override fun apiFormat(): String = unwrap(this).getApiFormat()

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-assistantid)
     */
    override fun assistantId(): String? = unwrap(this).getAssistantId()

    /**
     * The description of the AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the model used for this AI Prompt.
     *
     * Model Ids supported are: `CLAUDE_3_HAIKU_20240307_V1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-modelid)
     */
    override fun modelId(): String = unwrap(this).getModelId()

    /**
     * The name of the AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The configuration of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templateconfiguration)
     */
    override fun templateConfiguration(): Any = unwrap(this).getTemplateConfiguration()

    /**
     * The type of the prompt template for this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-templatetype)
     */
    override fun templateType(): String = unwrap(this).getTemplateType()

    /**
     * The type of this AI Prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiprompt.html#cfn-wisdom-aiprompt-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAIPromptProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPromptProps):
        CfnAIPromptProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAIPromptProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAIPromptProps):
        software.amazon.awscdk.services.wisdom.CfnAIPromptProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.wisdom.CfnAIPromptProps
  }
}
