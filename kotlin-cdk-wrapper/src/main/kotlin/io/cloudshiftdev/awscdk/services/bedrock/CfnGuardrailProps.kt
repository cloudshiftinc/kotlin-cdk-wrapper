@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGuardrail`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnGuardrailProps cfnGuardrailProps = CfnGuardrailProps.builder()
 * .blockedInputMessaging("blockedInputMessaging")
 * .blockedOutputsMessaging("blockedOutputsMessaging")
 * .name("name")
 * // the properties below are optional
 * .contentPolicyConfig(ContentPolicyConfigProperty.builder()
 * .filtersConfig(List.of(ContentFilterConfigProperty.builder()
 * .inputStrength("inputStrength")
 * .outputStrength("outputStrength")
 * .type("type")
 * .build()))
 * .build())
 * .description("description")
 * .kmsKeyArn("kmsKeyArn")
 * .sensitiveInformationPolicyConfig(SensitiveInformationPolicyConfigProperty.builder()
 * .piiEntitiesConfig(List.of(PiiEntityConfigProperty.builder()
 * .action("action")
 * .type("type")
 * .build()))
 * .regexesConfig(List.of(RegexConfigProperty.builder()
 * .action("action")
 * .name("name")
 * .pattern("pattern")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .topicPolicyConfig(TopicPolicyConfigProperty.builder()
 * .topicsConfig(List.of(TopicConfigProperty.builder()
 * .definition("definition")
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .examples(List.of("examples"))
 * .build()))
 * .build())
 * .wordPolicyConfig(WordPolicyConfigProperty.builder()
 * .managedWordListsConfig(List.of(ManagedWordsConfigProperty.builder()
 * .type("type")
 * .build()))
 * .wordsConfig(List.of(WordConfigProperty.builder()
 * .text("text")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html)
 */
public interface CfnGuardrailProps {
  /**
   * The message to return when the guardrail blocks a prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedinputmessaging)
   */
  public fun blockedInputMessaging(): String

  /**
   * The message to return when the guardrail blocks a model response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedoutputsmessaging)
   */
  public fun blockedOutputsMessaging(): String

  /**
   * Content policy config for a guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
   */
  public fun contentPolicyConfig(): Any? = unwrap(this).getContentPolicyConfig()

  /**
   * A description of the guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ARN of the AWS KMS key used to encrypt the guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The name of the guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-name)
   */
  public fun name(): String

  /**
   * Sensitive information policy config for a guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
   */
  public fun sensitiveInformationPolicyConfig(): Any? =
      unwrap(this).getSensitiveInformationPolicyConfig()

  /**
   * Metadata that you can assign to a guardrail as key-value pairs. For more information, see the
   * following resources:.
   *
   * * [Tag naming limits and
   * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
   * * [Tagging best
   * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Topic policy config for a guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
   */
  public fun topicPolicyConfig(): Any? = unwrap(this).getTopicPolicyConfig()

  /**
   * Word policy config for a guardrail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
   */
  public fun wordPolicyConfig(): Any? = unwrap(this).getWordPolicyConfig()

  /**
   * A builder for [CfnGuardrailProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param blockedInputMessaging The message to return when the guardrail blocks a prompt. 
     */
    public fun blockedInputMessaging(blockedInputMessaging: String)

    /**
     * @param blockedOutputsMessaging The message to return when the guardrail blocks a model
     * response. 
     */
    public fun blockedOutputsMessaging(blockedOutputsMessaging: String)

    /**
     * @param contentPolicyConfig Content policy config for a guardrail.
     */
    public fun contentPolicyConfig(contentPolicyConfig: IResolvable)

    /**
     * @param contentPolicyConfig Content policy config for a guardrail.
     */
    public fun contentPolicyConfig(contentPolicyConfig: CfnGuardrail.ContentPolicyConfigProperty)

    /**
     * @param contentPolicyConfig Content policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19815e8cf27c365dd7acbd9be8297ec6895dc93c9b34a926909bf6655b7c33c5")
    public
        fun contentPolicyConfig(contentPolicyConfig: CfnGuardrail.ContentPolicyConfigProperty.Builder.() -> Unit)

    /**
     * @param description A description of the guardrail.
     */
    public fun description(description: String)

    /**
     * @param kmsKeyArn The ARN of the AWS KMS key used to encrypt the guardrail.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param name The name of the guardrail. 
     */
    public fun name(name: String)

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail.
     */
    public fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable)

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail.
     */
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnGuardrail.SensitiveInformationPolicyConfigProperty)

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1765821b1324a8bdfa728ab15a49281c39381141ae1e0273c5af259dc9024bfb")
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnGuardrail.SensitiveInformationPolicyConfigProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail.
     */
    public fun topicPolicyConfig(topicPolicyConfig: IResolvable)

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail.
     */
    public fun topicPolicyConfig(topicPolicyConfig: CfnGuardrail.TopicPolicyConfigProperty)

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f85221bfe449356beba2aab06bf7dcc9a622f38a9cac8373194669d0739ea42c")
    public
        fun topicPolicyConfig(topicPolicyConfig: CfnGuardrail.TopicPolicyConfigProperty.Builder.() -> Unit)

    /**
     * @param wordPolicyConfig Word policy config for a guardrail.
     */
    public fun wordPolicyConfig(wordPolicyConfig: IResolvable)

    /**
     * @param wordPolicyConfig Word policy config for a guardrail.
     */
    public fun wordPolicyConfig(wordPolicyConfig: CfnGuardrail.WordPolicyConfigProperty)

    /**
     * @param wordPolicyConfig Word policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7563028a04f12c14dbc0898cb326fc098049ccd11d81aad99acf0e4a94f39bbb")
    public
        fun wordPolicyConfig(wordPolicyConfig: CfnGuardrail.WordPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnGuardrailProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnGuardrailProps.builder()

    /**
     * @param blockedInputMessaging The message to return when the guardrail blocks a prompt. 
     */
    override fun blockedInputMessaging(blockedInputMessaging: String) {
      cdkBuilder.blockedInputMessaging(blockedInputMessaging)
    }

    /**
     * @param blockedOutputsMessaging The message to return when the guardrail blocks a model
     * response. 
     */
    override fun blockedOutputsMessaging(blockedOutputsMessaging: String) {
      cdkBuilder.blockedOutputsMessaging(blockedOutputsMessaging)
    }

    /**
     * @param contentPolicyConfig Content policy config for a guardrail.
     */
    override fun contentPolicyConfig(contentPolicyConfig: IResolvable) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param contentPolicyConfig Content policy config for a guardrail.
     */
    override
        fun contentPolicyConfig(contentPolicyConfig: CfnGuardrail.ContentPolicyConfigProperty) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(CfnGuardrail.ContentPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param contentPolicyConfig Content policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19815e8cf27c365dd7acbd9be8297ec6895dc93c9b34a926909bf6655b7c33c5")
    override
        fun contentPolicyConfig(contentPolicyConfig: CfnGuardrail.ContentPolicyConfigProperty.Builder.() -> Unit):
        Unit = contentPolicyConfig(CfnGuardrail.ContentPolicyConfigProperty(contentPolicyConfig))

    /**
     * @param description A description of the guardrail.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param kmsKeyArn The ARN of the AWS KMS key used to encrypt the guardrail.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param name The name of the guardrail. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail.
     */
    override fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail.
     */
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnGuardrail.SensitiveInformationPolicyConfigProperty) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(CfnGuardrail.SensitiveInformationPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1765821b1324a8bdfa728ab15a49281c39381141ae1e0273c5af259dc9024bfb")
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: CfnGuardrail.SensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        sensitiveInformationPolicyConfig(CfnGuardrail.SensitiveInformationPolicyConfigProperty(sensitiveInformationPolicyConfig))

    /**
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:.
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail.
     */
    override fun topicPolicyConfig(topicPolicyConfig: IResolvable) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail.
     */
    override fun topicPolicyConfig(topicPolicyConfig: CfnGuardrail.TopicPolicyConfigProperty) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(CfnGuardrail.TopicPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param topicPolicyConfig Topic policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f85221bfe449356beba2aab06bf7dcc9a622f38a9cac8373194669d0739ea42c")
    override
        fun topicPolicyConfig(topicPolicyConfig: CfnGuardrail.TopicPolicyConfigProperty.Builder.() -> Unit):
        Unit = topicPolicyConfig(CfnGuardrail.TopicPolicyConfigProperty(topicPolicyConfig))

    /**
     * @param wordPolicyConfig Word policy config for a guardrail.
     */
    override fun wordPolicyConfig(wordPolicyConfig: IResolvable) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param wordPolicyConfig Word policy config for a guardrail.
     */
    override fun wordPolicyConfig(wordPolicyConfig: CfnGuardrail.WordPolicyConfigProperty) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(CfnGuardrail.WordPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * @param wordPolicyConfig Word policy config for a guardrail.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7563028a04f12c14dbc0898cb326fc098049ccd11d81aad99acf0e4a94f39bbb")
    override
        fun wordPolicyConfig(wordPolicyConfig: CfnGuardrail.WordPolicyConfigProperty.Builder.() -> Unit):
        Unit = wordPolicyConfig(CfnGuardrail.WordPolicyConfigProperty(wordPolicyConfig))

    public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrailProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrailProps,
  ) : CdkObject(cdkObject), CfnGuardrailProps {
    /**
     * The message to return when the guardrail blocks a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedinputmessaging)
     */
    override fun blockedInputMessaging(): String = unwrap(this).getBlockedInputMessaging()

    /**
     * The message to return when the guardrail blocks a model response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedoutputsmessaging)
     */
    override fun blockedOutputsMessaging(): String = unwrap(this).getBlockedOutputsMessaging()

    /**
     * Content policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     */
    override fun contentPolicyConfig(): Any? = unwrap(this).getContentPolicyConfig()

    /**
     * A description of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ARN of the AWS KMS key used to encrypt the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The name of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Sensitive information policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     */
    override fun sensitiveInformationPolicyConfig(): Any? =
        unwrap(this).getSensitiveInformationPolicyConfig()

    /**
     * Metadata that you can assign to a guardrail as key-value pairs. For more information, see the
     * following resources:.
     *
     * * [Tag naming limits and
     * requirements](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-conventions)
     * * [Tagging best
     * practices](https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html#tag-best-practices)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Topic policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     */
    override fun topicPolicyConfig(): Any? = unwrap(this).getTopicPolicyConfig()

    /**
     * Word policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     */
    override fun wordPolicyConfig(): Any? = unwrap(this).getWordPolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGuardrailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrailProps):
        CfnGuardrailProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGuardrailProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGuardrailProps):
        software.amazon.awscdk.services.bedrock.CfnGuardrailProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.bedrock.CfnGuardrailProps
  }
}