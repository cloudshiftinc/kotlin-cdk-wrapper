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
 * Properties for defining a `CfnAIGuardrail`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIGuardrailProps cfnAIGuardrailProps = CfnAIGuardrailProps.builder()
 * .assistantId("assistantId")
 * .blockedInputMessaging("blockedInputMessaging")
 * .blockedOutputsMessaging("blockedOutputsMessaging")
 * // the properties below are optional
 * .contentPolicyConfig(AIGuardrailContentPolicyConfigProperty.builder()
 * .filtersConfig(List.of(GuardrailContentFilterConfigProperty.builder()
 * .inputStrength("inputStrength")
 * .outputStrength("outputStrength")
 * .type("type")
 * .build()))
 * .build())
 * .contextualGroundingPolicyConfig(AIGuardrailContextualGroundingPolicyConfigProperty.builder()
 * .filtersConfig(List.of(GuardrailContextualGroundingFilterConfigProperty.builder()
 * .threshold(123)
 * .type("type")
 * .build()))
 * .build())
 * .description("description")
 * .name("name")
 * .sensitiveInformationPolicyConfig(AIGuardrailSensitiveInformationPolicyConfigProperty.builder()
 * .piiEntitiesConfig(List.of(GuardrailPiiEntityConfigProperty.builder()
 * .action("action")
 * .type("type")
 * .build()))
 * .regexesConfig(List.of(GuardrailRegexConfigProperty.builder()
 * .action("action")
 * .name("name")
 * .pattern("pattern")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .topicPolicyConfig(AIGuardrailTopicPolicyConfigProperty.builder()
 * .topicsConfig(List.of(GuardrailTopicConfigProperty.builder()
 * .definition("definition")
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .examples(List.of("examples"))
 * .build()))
 * .build())
 * .wordPolicyConfig(AIGuardrailWordPolicyConfigProperty.builder()
 * .managedWordListsConfig(List.of(GuardrailManagedWordsConfigProperty.builder()
 * .type("type")
 * .build()))
 * .wordsConfig(List.of(GuardrailWordConfigProperty.builder()
 * .text("text")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html)
 */
public interface CfnAIGuardrailProps {
  /**
   * The identifier of the Amazon Q in Connect assistant.
   *
   * Can be either the ID or the ARN. URLs cannot contain the ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-assistantid)
   */
  public fun assistantId(): String

  /**
   * The message to return when the AI Guardrail blocks a prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedinputmessaging)
   */
  public fun blockedInputMessaging(): String

  /**
   * The message to return when the AI Guardrail blocks a model response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedoutputsmessaging)
   */
  public fun blockedOutputsMessaging(): String

  /**
   * Contains details about how to handle harmful content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
   */
  public fun contentPolicyConfig(): Any? = unwrap(this).getContentPolicyConfig()

  /**
   * The policy configuration details for the AI Guardrail's contextual grounding policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
   */
  public fun contextualGroundingPolicyConfig(): Any? =
      unwrap(this).getContextualGroundingPolicyConfig()

  /**
   * A description of the AI Guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the AI Guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Contains details about PII entities and regular expressions to configure for the AI Guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
   */
  public fun sensitiveInformationPolicyConfig(): Any? =
      unwrap(this).getSensitiveInformationPolicyConfig()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Contains details about topics that the AI Guardrail should identify and deny.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
   */
  public fun topicPolicyConfig(): Any? = unwrap(this).getTopicPolicyConfig()

  /**
   * Contains details about the word policy to configured for the AI Guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
   */
  public fun wordPolicyConfig(): Any? = unwrap(this).getWordPolicyConfig()

  /**
   * A builder for [CfnAIGuardrailProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    public fun assistantId(assistantId: String)

    /**
     * @param blockedInputMessaging The message to return when the AI Guardrail blocks a prompt. 
     */
    public fun blockedInputMessaging(blockedInputMessaging: String)

    /**
     * @param blockedOutputsMessaging The message to return when the AI Guardrail blocks a model
     * response. 
     */
    public fun blockedOutputsMessaging(blockedOutputsMessaging: String)

    /**
     * @param contentPolicyConfig Contains details about how to handle harmful content.
     */
    public fun contentPolicyConfig(contentPolicyConfig: IResolvable)

    /**
     * @param contentPolicyConfig Contains details about how to handle harmful content.
     */
    public
        fun contentPolicyConfig(contentPolicyConfig: CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty)

    /**
     * @param contentPolicyConfig Contains details about how to handle harmful content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe658b5f8790785a350e58941c78e7f1b67c9cf925c6e786c7e22a1054939f38")
    public
        fun contentPolicyConfig(contentPolicyConfig: CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty.Builder.() -> Unit)

    /**
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy.
     */
    public fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: IResolvable)

    /**
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy.
     */
    public
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty)

    /**
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1025a2b355ddb73385cdad85350c94f65f3b5fab4353ba01ead176b369a31f2")
    public
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty.Builder.() -> Unit)

    /**
     * @param description A description of the AI Guardrail.
     */
    public fun description(description: String)

    /**
     * @param name The name of the AI Guardrail.
     */
    public fun name(name: String)

    /**
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail.
     */
    public fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable)

    /**
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail.
     */
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty)

    /**
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da35adffbd7d6ad785ba8bc706ee5fb6977da95d5100bd5a1421f17a4d136d8f")
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny.
     */
    public fun topicPolicyConfig(topicPolicyConfig: IResolvable)

    /**
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny.
     */
    public
        fun topicPolicyConfig(topicPolicyConfig: CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty)

    /**
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("997d57647e37ad5e5ee0c4347bc32b8f6844cdd9d80b6ff7fd870a6f3da4d710")
    public
        fun topicPolicyConfig(topicPolicyConfig: CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty.Builder.() -> Unit)

    /**
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail.
     */
    public fun wordPolicyConfig(wordPolicyConfig: IResolvable)

    /**
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail.
     */
    public
        fun wordPolicyConfig(wordPolicyConfig: CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty)

    /**
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e58e67e37484649c72efb12622b1866483e3cde98b319cb90c583296acf40f")
    public
        fun wordPolicyConfig(wordPolicyConfig: CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps.builder()

    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param blockedInputMessaging The message to return when the AI Guardrail blocks a prompt. 
     */
    override fun blockedInputMessaging(blockedInputMessaging: String) {
      cdkBuilder.blockedInputMessaging(blockedInputMessaging)
    }

    /**
     * @param blockedOutputsMessaging The message to return when the AI Guardrail blocks a model
     * response. 
     */
    override fun blockedOutputsMessaging(blockedOutputsMessaging: String) {
      cdkBuilder.blockedOutputsMessaging(blockedOutputsMessaging)
    }

    /**
     * @param contentPolicyConfig Contains details about how to handle harmful content.
     */
    override fun contentPolicyConfig(contentPolicyConfig: IResolvable) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param contentPolicyConfig Contains details about how to handle harmful content.
     */
    override
        fun contentPolicyConfig(contentPolicyConfig: CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param contentPolicyConfig Contains details about how to handle harmful content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe658b5f8790785a350e58941c78e7f1b67c9cf925c6e786c7e22a1054939f38")
    override
        fun contentPolicyConfig(contentPolicyConfig: CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        contentPolicyConfig(CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty(contentPolicyConfig))

    /**
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy.
     */
    override fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: IResolvable) {
      cdkBuilder.contextualGroundingPolicyConfig(contextualGroundingPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy.
     */
    override
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty) {
      cdkBuilder.contextualGroundingPolicyConfig(contextualGroundingPolicyConfig.let(CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1025a2b355ddb73385cdad85350c94f65f3b5fab4353ba01ead176b369a31f2")
    override
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        contextualGroundingPolicyConfig(CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty(contextualGroundingPolicyConfig))

    /**
     * @param description A description of the AI Guardrail.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the AI Guardrail.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail.
     */
    override fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail.
     */
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da35adffbd7d6ad785ba8bc706ee5fb6977da95d5100bd5a1421f17a4d136d8f")
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        sensitiveInformationPolicyConfig(CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty(sensitiveInformationPolicyConfig))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny.
     */
    override fun topicPolicyConfig(topicPolicyConfig: IResolvable) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny.
     */
    override
        fun topicPolicyConfig(topicPolicyConfig: CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("997d57647e37ad5e5ee0c4347bc32b8f6844cdd9d80b6ff7fd870a6f3da4d710")
    override
        fun topicPolicyConfig(topicPolicyConfig: CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        topicPolicyConfig(CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty(topicPolicyConfig))

    /**
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail.
     */
    override fun wordPolicyConfig(wordPolicyConfig: IResolvable) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail.
     */
    override
        fun wordPolicyConfig(wordPolicyConfig: CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6e58e67e37484649c72efb12622b1866483e3cde98b319cb90c583296acf40f")
    override
        fun wordPolicyConfig(wordPolicyConfig: CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        wordPolicyConfig(CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty(wordPolicyConfig))

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps,
  ) : CdkObject(cdkObject),
      CfnAIGuardrailProps {
    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-assistantid)
     */
    override fun assistantId(): String = unwrap(this).getAssistantId()

    /**
     * The message to return when the AI Guardrail blocks a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedinputmessaging)
     */
    override fun blockedInputMessaging(): String = unwrap(this).getBlockedInputMessaging()

    /**
     * The message to return when the AI Guardrail blocks a model response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedoutputsmessaging)
     */
    override fun blockedOutputsMessaging(): String = unwrap(this).getBlockedOutputsMessaging()

    /**
     * Contains details about how to handle harmful content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
     */
    override fun contentPolicyConfig(): Any? = unwrap(this).getContentPolicyConfig()

    /**
     * The policy configuration details for the AI Guardrail's contextual grounding policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
     */
    override fun contextualGroundingPolicyConfig(): Any? =
        unwrap(this).getContextualGroundingPolicyConfig()

    /**
     * A description of the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Contains details about PII entities and regular expressions to configure for the AI
     * Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
     */
    override fun sensitiveInformationPolicyConfig(): Any? =
        unwrap(this).getSensitiveInformationPolicyConfig()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * Contains details about topics that the AI Guardrail should identify and deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
     */
    override fun topicPolicyConfig(): Any? = unwrap(this).getTopicPolicyConfig()

    /**
     * Contains details about the word policy to configured for the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
     */
    override fun wordPolicyConfig(): Any? = unwrap(this).getWordPolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAIGuardrailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps):
        CfnAIGuardrailProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAIGuardrailProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAIGuardrailProps):
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnAIGuardrailProps
  }
}
