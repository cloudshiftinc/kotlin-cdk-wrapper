@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a guardrail to block topics and to implement safeguards for your generative AI
 * applications.
 *
 * You can configure denied topics to disallow undesirable topics and content filters to block
 * harmful content in model inputs and responses. For more information, see [Guardrails for Amazon
 * Bedrock](https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails.html) in the *Amazon
 * Bedrock User Guide*
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnGuardrail cfnGuardrail = CfnGuardrail.Builder.create(this, "MyCfnGuardrail")
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
public open class CfnGuardrail(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGuardrailProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnGuardrail(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGuardrailProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGuardrailProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGuardrailProps(props)
  )

  /**
   * The date and time at which the guardrail was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * List of failure recommendations.
   */
  public open fun attrFailureRecommendations(): List<String> =
      unwrap(this).getAttrFailureRecommendations()

  /**
   * The Amazon Resource Name (ARN) of the guardrail.
   *
   * This a the primary identifier for the guardrail.
   */
  public open fun attrGuardrailArn(): String = unwrap(this).getAttrGuardrailArn()

  /**
   * The unique identifier of the guardrail.
   */
  public open fun attrGuardrailId(): String = unwrap(this).getAttrGuardrailId()

  /**
   * Status of the guardrail.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * List of status reasons.
   */
  public open fun attrStatusReasons(): List<String> = unwrap(this).getAttrStatusReasons()

  /**
   * The date and time at which the guardrail was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The version of the guardrail.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * The message to return when the guardrail blocks a prompt.
   */
  public open fun blockedInputMessaging(): String = unwrap(this).getBlockedInputMessaging()

  /**
   * The message to return when the guardrail blocks a prompt.
   */
  public open fun blockedInputMessaging(`value`: String) {
    unwrap(this).setBlockedInputMessaging(`value`)
  }

  /**
   * The message to return when the guardrail blocks a model response.
   */
  public open fun blockedOutputsMessaging(): String = unwrap(this).getBlockedOutputsMessaging()

  /**
   * The message to return when the guardrail blocks a model response.
   */
  public open fun blockedOutputsMessaging(`value`: String) {
    unwrap(this).setBlockedOutputsMessaging(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Content policy config for a guardrail.
   */
  public open fun contentPolicyConfig(): Any? = unwrap(this).getContentPolicyConfig()

  /**
   * Content policy config for a guardrail.
   */
  public open fun contentPolicyConfig(`value`: IResolvable) {
    unwrap(this).setContentPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Content policy config for a guardrail.
   */
  public open fun contentPolicyConfig(`value`: ContentPolicyConfigProperty) {
    unwrap(this).setContentPolicyConfig(`value`.let(ContentPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Content policy config for a guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("836bfed449265982733dc263dfc92823bd3a7d91647fe58dfa4d4d249cd0adec")
  public open fun contentPolicyConfig(`value`: ContentPolicyConfigProperty.Builder.() -> Unit): Unit
      = contentPolicyConfig(ContentPolicyConfigProperty(`value`))

  /**
   * A description of the guardrail.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the guardrail.
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
   * The ARN of the AWS KMS key used to encrypt the guardrail.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The ARN of the AWS KMS key used to encrypt the guardrail.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The name of the guardrail.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the guardrail.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Sensitive information policy config for a guardrail.
   */
  public open fun sensitiveInformationPolicyConfig(): Any? =
      unwrap(this).getSensitiveInformationPolicyConfig()

  /**
   * Sensitive information policy config for a guardrail.
   */
  public open fun sensitiveInformationPolicyConfig(`value`: IResolvable) {
    unwrap(this).setSensitiveInformationPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Sensitive information policy config for a guardrail.
   */
  public open
      fun sensitiveInformationPolicyConfig(`value`: SensitiveInformationPolicyConfigProperty) {
    unwrap(this).setSensitiveInformationPolicyConfig(`value`.let(SensitiveInformationPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Sensitive information policy config for a guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1430238e16c96d0407665d530b2092c5eac29b5c0e4bc4ecf11123fa431090e1")
  public open
      fun sensitiveInformationPolicyConfig(`value`: SensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
      Unit = sensitiveInformationPolicyConfig(SensitiveInformationPolicyConfigProperty(`value`))

  /**
   * Metadata that you can assign to a guardrail as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata that you can assign to a guardrail as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that you can assign to a guardrail as key-value pairs.
   *
   * For more information, see the following resources:.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Topic policy config for a guardrail.
   */
  public open fun topicPolicyConfig(): Any? = unwrap(this).getTopicPolicyConfig()

  /**
   * Topic policy config for a guardrail.
   */
  public open fun topicPolicyConfig(`value`: IResolvable) {
    unwrap(this).setTopicPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Topic policy config for a guardrail.
   */
  public open fun topicPolicyConfig(`value`: TopicPolicyConfigProperty) {
    unwrap(this).setTopicPolicyConfig(`value`.let(TopicPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Topic policy config for a guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ba657d356ea1ca4be58a1680d2ef214d3dd654edaffd6adb93b480342de9c49")
  public open fun topicPolicyConfig(`value`: TopicPolicyConfigProperty.Builder.() -> Unit): Unit =
      topicPolicyConfig(TopicPolicyConfigProperty(`value`))

  /**
   * Word policy config for a guardrail.
   */
  public open fun wordPolicyConfig(): Any? = unwrap(this).getWordPolicyConfig()

  /**
   * Word policy config for a guardrail.
   */
  public open fun wordPolicyConfig(`value`: IResolvable) {
    unwrap(this).setWordPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Word policy config for a guardrail.
   */
  public open fun wordPolicyConfig(`value`: WordPolicyConfigProperty) {
    unwrap(this).setWordPolicyConfig(`value`.let(WordPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Word policy config for a guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7b9126a900a926685b39e9a2a38a8a88ee7b9fe43884e6d9b643e5dc91209fa")
  public open fun wordPolicyConfig(`value`: WordPolicyConfigProperty.Builder.() -> Unit): Unit =
      wordPolicyConfig(WordPolicyConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnGuardrail].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The message to return when the guardrail blocks a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedinputmessaging)
     * @param blockedInputMessaging The message to return when the guardrail blocks a prompt. 
     */
    public fun blockedInputMessaging(blockedInputMessaging: String)

    /**
     * The message to return when the guardrail blocks a model response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedoutputsmessaging)
     * @param blockedOutputsMessaging The message to return when the guardrail blocks a model
     * response. 
     */
    public fun blockedOutputsMessaging(blockedOutputsMessaging: String)

    /**
     * Content policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig Content policy config for a guardrail. 
     */
    public fun contentPolicyConfig(contentPolicyConfig: IResolvable)

    /**
     * Content policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig Content policy config for a guardrail. 
     */
    public fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty)

    /**
     * Content policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig Content policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03b17022fb2875d609f1791da309213d727f5e6080ed6b6bde7b0869ef6ef9b3")
    public
        fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty.Builder.() -> Unit)

    /**
     * A description of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-description)
     * @param description A description of the guardrail. 
     */
    public fun description(description: String)

    /**
     * The ARN of the AWS KMS key used to encrypt the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-kmskeyarn)
     * @param kmsKeyArn The ARN of the AWS KMS key used to encrypt the guardrail. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The name of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-name)
     * @param name The name of the guardrail. 
     */
    public fun name(name: String)

    /**
     * Sensitive information policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. 
     */
    public fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable)

    /**
     * Sensitive information policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. 
     */
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty)

    /**
     * Sensitive information policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790c853f6a08ea46769870ce2e94698cc54cf2ded40abbb7b69d3b84141d6ea9")
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty.Builder.() -> Unit)

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
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Topic policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig Topic policy config for a guardrail. 
     */
    public fun topicPolicyConfig(topicPolicyConfig: IResolvable)

    /**
     * Topic policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig Topic policy config for a guardrail. 
     */
    public fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty)

    /**
     * Topic policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig Topic policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31939df4bdf47d4ac59ed66a726b769c45a6db1b4bc903f6f5848296ae470c06")
    public fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty.Builder.() -> Unit)

    /**
     * Word policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig Word policy config for a guardrail. 
     */
    public fun wordPolicyConfig(wordPolicyConfig: IResolvable)

    /**
     * Word policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig Word policy config for a guardrail. 
     */
    public fun wordPolicyConfig(wordPolicyConfig: WordPolicyConfigProperty)

    /**
     * Word policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig Word policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc8cdf4b0b9d898325a9268e16c40ea4ad57171a31bffc49ec90bdc3f7222db5")
    public fun wordPolicyConfig(wordPolicyConfig: WordPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnGuardrail.Builder =
        software.amazon.awscdk.services.bedrock.CfnGuardrail.Builder.create(scope, id)

    /**
     * The message to return when the guardrail blocks a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedinputmessaging)
     * @param blockedInputMessaging The message to return when the guardrail blocks a prompt. 
     */
    override fun blockedInputMessaging(blockedInputMessaging: String) {
      cdkBuilder.blockedInputMessaging(blockedInputMessaging)
    }

    /**
     * The message to return when the guardrail blocks a model response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-blockedoutputsmessaging)
     * @param blockedOutputsMessaging The message to return when the guardrail blocks a model
     * response. 
     */
    override fun blockedOutputsMessaging(blockedOutputsMessaging: String) {
      cdkBuilder.blockedOutputsMessaging(blockedOutputsMessaging)
    }

    /**
     * Content policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig Content policy config for a guardrail. 
     */
    override fun contentPolicyConfig(contentPolicyConfig: IResolvable) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Content policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig Content policy config for a guardrail. 
     */
    override fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(ContentPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Content policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig Content policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03b17022fb2875d609f1791da309213d727f5e6080ed6b6bde7b0869ef6ef9b3")
    override
        fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty.Builder.() -> Unit):
        Unit = contentPolicyConfig(ContentPolicyConfigProperty(contentPolicyConfig))

    /**
     * A description of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-description)
     * @param description A description of the guardrail. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ARN of the AWS KMS key used to encrypt the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-kmskeyarn)
     * @param kmsKeyArn The ARN of the AWS KMS key used to encrypt the guardrail. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The name of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-name)
     * @param name The name of the guardrail. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Sensitive information policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. 
     */
    override fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Sensitive information policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. 
     */
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(SensitiveInformationPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Sensitive information policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Sensitive information policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790c853f6a08ea46769870ce2e94698cc54cf2ded40abbb7b69d3b84141d6ea9")
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        sensitiveInformationPolicyConfig(SensitiveInformationPolicyConfigProperty(sensitiveInformationPolicyConfig))

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
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags Metadata that you can assign to a guardrail as key-value pairs. For more
     * information, see the following resources:. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Topic policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig Topic policy config for a guardrail. 
     */
    override fun topicPolicyConfig(topicPolicyConfig: IResolvable) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Topic policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig Topic policy config for a guardrail. 
     */
    override fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(TopicPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Topic policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig Topic policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31939df4bdf47d4ac59ed66a726b769c45a6db1b4bc903f6f5848296ae470c06")
    override fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty.Builder.() -> Unit):
        Unit = topicPolicyConfig(TopicPolicyConfigProperty(topicPolicyConfig))

    /**
     * Word policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig Word policy config for a guardrail. 
     */
    override fun wordPolicyConfig(wordPolicyConfig: IResolvable) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Word policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig Word policy config for a guardrail. 
     */
    override fun wordPolicyConfig(wordPolicyConfig: WordPolicyConfigProperty) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(WordPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Word policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig Word policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc8cdf4b0b9d898325a9268e16c40ea4ad57171a31bffc49ec90bdc3f7222db5")
    override fun wordPolicyConfig(wordPolicyConfig: WordPolicyConfigProperty.Builder.() -> Unit):
        Unit = wordPolicyConfig(WordPolicyConfigProperty(wordPolicyConfig))

    public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrail = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnGuardrail.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGuardrail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGuardrail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail): CfnGuardrail
        = CfnGuardrail(cdkObject)

    internal fun unwrap(wrapped: CfnGuardrail): software.amazon.awscdk.services.bedrock.CfnGuardrail
        = wrapped.cdkObject as software.amazon.awscdk.services.bedrock.CfnGuardrail
  }

  /**
   * Content filter config in content policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ContentFilterConfigProperty contentFilterConfigProperty = ContentFilterConfigProperty.builder()
   * .inputStrength("inputStrength")
   * .outputStrength("outputStrength")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html)
   */
  public interface ContentFilterConfigProperty {
    /**
     * Strength for filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-inputstrength)
     */
    public fun inputStrength(): String

    /**
     * Strength for filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-outputstrength)
     */
    public fun outputStrength(): String

    /**
     * Type of filter in content policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [ContentFilterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputStrength Strength for filters. 
       */
      public fun inputStrength(inputStrength: String)

      /**
       * @param outputStrength Strength for filters. 
       */
      public fun outputStrength(outputStrength: String)

      /**
       * @param type Type of filter in content policy. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty.builder()

      /**
       * @param inputStrength Strength for filters. 
       */
      override fun inputStrength(inputStrength: String) {
        cdkBuilder.inputStrength(inputStrength)
      }

      /**
       * @param outputStrength Strength for filters. 
       */
      override fun outputStrength(outputStrength: String) {
        cdkBuilder.outputStrength(outputStrength)
      }

      /**
       * @param type Type of filter in content policy. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty,
    ) : CdkObject(cdkObject), ContentFilterConfigProperty {
      /**
       * Strength for filters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-inputstrength)
       */
      override fun inputStrength(): String = unwrap(this).getInputStrength()

      /**
       * Strength for filters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-outputstrength)
       */
      override fun outputStrength(): String = unwrap(this).getOutputStrength()

      /**
       * Type of filter in content policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentFilterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty):
          ContentFilterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContentFilterConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentFilterConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty
    }
  }

  /**
   * Content policy config for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ContentPolicyConfigProperty contentPolicyConfigProperty = ContentPolicyConfigProperty.builder()
   * .filtersConfig(List.of(ContentFilterConfigProperty.builder()
   * .inputStrength("inputStrength")
   * .outputStrength("outputStrength")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentpolicyconfig.html)
   */
  public interface ContentPolicyConfigProperty {
    /**
     * List of content filter configs in content policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentpolicyconfig.html#cfn-bedrock-guardrail-contentpolicyconfig-filtersconfig)
     */
    public fun filtersConfig(): Any

    /**
     * A builder for [ContentPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filtersConfig List of content filter configs in content policy. 
       */
      public fun filtersConfig(filtersConfig: IResolvable)

      /**
       * @param filtersConfig List of content filter configs in content policy. 
       */
      public fun filtersConfig(filtersConfig: List<Any>)

      /**
       * @param filtersConfig List of content filter configs in content policy. 
       */
      public fun filtersConfig(vararg filtersConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty.builder()

      /**
       * @param filtersConfig List of content filter configs in content policy. 
       */
      override fun filtersConfig(filtersConfig: IResolvable) {
        cdkBuilder.filtersConfig(filtersConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filtersConfig List of content filter configs in content policy. 
       */
      override fun filtersConfig(filtersConfig: List<Any>) {
        cdkBuilder.filtersConfig(filtersConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filtersConfig List of content filter configs in content policy. 
       */
      override fun filtersConfig(vararg filtersConfig: Any): Unit =
          filtersConfig(filtersConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty,
    ) : CdkObject(cdkObject), ContentPolicyConfigProperty {
      /**
       * List of content filter configs in content policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentpolicyconfig.html#cfn-bedrock-guardrail-contentpolicyconfig-filtersconfig)
       */
      override fun filtersConfig(): Any = unwrap(this).getFiltersConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty):
          ContentPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContentPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentPolicyConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty
    }
  }

  /**
   * A managed words config.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ManagedWordsConfigProperty managedWordsConfigProperty = ManagedWordsConfigProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-managedwordsconfig.html)
   */
  public interface ManagedWordsConfigProperty {
    /**
     * Options for managed words.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-managedwordsconfig.html#cfn-bedrock-guardrail-managedwordsconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [ManagedWordsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Options for managed words. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty.builder()

      /**
       * @param type Options for managed words. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty,
    ) : CdkObject(cdkObject), ManagedWordsConfigProperty {
      /**
       * Options for managed words.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-managedwordsconfig.html#cfn-bedrock-guardrail-managedwordsconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ManagedWordsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty):
          ManagedWordsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ManagedWordsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedWordsConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty
    }
  }

  /**
   * Pii entity configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * PiiEntityConfigProperty piiEntityConfigProperty = PiiEntityConfigProperty.builder()
   * .action("action")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-piientityconfig.html)
   */
  public interface PiiEntityConfigProperty {
    /**
     * Options for sensitive information action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-piientityconfig.html#cfn-bedrock-guardrail-piientityconfig-action)
     */
    public fun action(): String

    /**
     * The currently supported PII entities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-piientityconfig.html#cfn-bedrock-guardrail-piientityconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [PiiEntityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Options for sensitive information action. 
       */
      public fun action(action: String)

      /**
       * @param type The currently supported PII entities. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty.builder()

      /**
       * @param action Options for sensitive information action. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param type The currently supported PII entities. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty,
    ) : CdkObject(cdkObject), PiiEntityConfigProperty {
      /**
       * Options for sensitive information action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-piientityconfig.html#cfn-bedrock-guardrail-piientityconfig-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The currently supported PII entities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-piientityconfig.html#cfn-bedrock-guardrail-piientityconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PiiEntityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty):
          PiiEntityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? PiiEntityConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PiiEntityConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty
    }
  }

  /**
   * A regex configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * RegexConfigProperty regexConfigProperty = RegexConfigProperty.builder()
   * .action("action")
   * .name("name")
   * .pattern("pattern")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html)
   */
  public interface RegexConfigProperty {
    /**
     * Options for sensitive information action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-action)
     */
    public fun action(): String

    /**
     * The regex description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The regex name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-name)
     */
    public fun name(): String

    /**
     * The regex pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-pattern)
     */
    public fun pattern(): String

    /**
     * A builder for [RegexConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Options for sensitive information action. 
       */
      public fun action(action: String)

      /**
       * @param description The regex description.
       */
      public fun description(description: String)

      /**
       * @param name The regex name. 
       */
      public fun name(name: String)

      /**
       * @param pattern The regex pattern. 
       */
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty.builder()

      /**
       * @param action Options for sensitive information action. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param description The regex description.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The regex name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param pattern The regex pattern. 
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty,
    ) : CdkObject(cdkObject), RegexConfigProperty {
      /**
       * Options for sensitive information action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The regex description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The regex name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The regex pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-pattern)
       */
      override fun pattern(): String = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegexConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty):
          RegexConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? RegexConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegexConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty
    }
  }

  /**
   * Sensitive information policy config for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * SensitiveInformationPolicyConfigProperty sensitiveInformationPolicyConfigProperty =
   * SensitiveInformationPolicyConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-sensitiveinformationpolicyconfig.html)
   */
  public interface SensitiveInformationPolicyConfigProperty {
    /**
     * List of entities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-sensitiveinformationpolicyconfig.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig-piientitiesconfig)
     */
    public fun piiEntitiesConfig(): Any? = unwrap(this).getPiiEntitiesConfig()

    /**
     * List of regex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-sensitiveinformationpolicyconfig.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig-regexesconfig)
     */
    public fun regexesConfig(): Any? = unwrap(this).getRegexesConfig()

    /**
     * A builder for [SensitiveInformationPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param piiEntitiesConfig List of entities.
       */
      public fun piiEntitiesConfig(piiEntitiesConfig: IResolvable)

      /**
       * @param piiEntitiesConfig List of entities.
       */
      public fun piiEntitiesConfig(piiEntitiesConfig: List<Any>)

      /**
       * @param piiEntitiesConfig List of entities.
       */
      public fun piiEntitiesConfig(vararg piiEntitiesConfig: Any)

      /**
       * @param regexesConfig List of regex.
       */
      public fun regexesConfig(regexesConfig: IResolvable)

      /**
       * @param regexesConfig List of regex.
       */
      public fun regexesConfig(regexesConfig: List<Any>)

      /**
       * @param regexesConfig List of regex.
       */
      public fun regexesConfig(vararg regexesConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty.builder()

      /**
       * @param piiEntitiesConfig List of entities.
       */
      override fun piiEntitiesConfig(piiEntitiesConfig: IResolvable) {
        cdkBuilder.piiEntitiesConfig(piiEntitiesConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param piiEntitiesConfig List of entities.
       */
      override fun piiEntitiesConfig(piiEntitiesConfig: List<Any>) {
        cdkBuilder.piiEntitiesConfig(piiEntitiesConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param piiEntitiesConfig List of entities.
       */
      override fun piiEntitiesConfig(vararg piiEntitiesConfig: Any): Unit =
          piiEntitiesConfig(piiEntitiesConfig.toList())

      /**
       * @param regexesConfig List of regex.
       */
      override fun regexesConfig(regexesConfig: IResolvable) {
        cdkBuilder.regexesConfig(regexesConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param regexesConfig List of regex.
       */
      override fun regexesConfig(regexesConfig: List<Any>) {
        cdkBuilder.regexesConfig(regexesConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param regexesConfig List of regex.
       */
      override fun regexesConfig(vararg regexesConfig: Any): Unit =
          regexesConfig(regexesConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty,
    ) : CdkObject(cdkObject), SensitiveInformationPolicyConfigProperty {
      /**
       * List of entities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-sensitiveinformationpolicyconfig.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig-piientitiesconfig)
       */
      override fun piiEntitiesConfig(): Any? = unwrap(this).getPiiEntitiesConfig()

      /**
       * List of regex.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-sensitiveinformationpolicyconfig.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig-regexesconfig)
       */
      override fun regexesConfig(): Any? = unwrap(this).getRegexesConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SensitiveInformationPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty):
          SensitiveInformationPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SensitiveInformationPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SensitiveInformationPolicyConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty
    }
  }

  /**
   * Topic config in topic policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TopicConfigProperty topicConfigProperty = TopicConfigProperty.builder()
   * .definition("definition")
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .examples(List.of("examples"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html)
   */
  public interface TopicConfigProperty {
    /**
     * Definition of topic in topic policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-definition)
     */
    public fun definition(): String

    /**
     * List of text examples.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-examples)
     */
    public fun examples(): List<String> = unwrap(this).getExamples() ?: emptyList()

    /**
     * Name of topic in topic policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-name)
     */
    public fun name(): String

    /**
     * Type of topic in a policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [TopicConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param definition Definition of topic in topic policy. 
       */
      public fun definition(definition: String)

      /**
       * @param examples List of text examples.
       */
      public fun examples(examples: List<String>)

      /**
       * @param examples List of text examples.
       */
      public fun examples(vararg examples: String)

      /**
       * @param name Name of topic in topic policy. 
       */
      public fun name(name: String)

      /**
       * @param type Type of topic in a policy. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty.builder()

      /**
       * @param definition Definition of topic in topic policy. 
       */
      override fun definition(definition: String) {
        cdkBuilder.definition(definition)
      }

      /**
       * @param examples List of text examples.
       */
      override fun examples(examples: List<String>) {
        cdkBuilder.examples(examples)
      }

      /**
       * @param examples List of text examples.
       */
      override fun examples(vararg examples: String): Unit = examples(examples.toList())

      /**
       * @param name Name of topic in topic policy. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type Type of topic in a policy. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty,
    ) : CdkObject(cdkObject), TopicConfigProperty {
      /**
       * Definition of topic in topic policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-definition)
       */
      override fun definition(): String = unwrap(this).getDefinition()

      /**
       * List of text examples.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-examples)
       */
      override fun examples(): List<String> = unwrap(this).getExamples() ?: emptyList()

      /**
       * Name of topic in topic policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Type of topic in a policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty):
          TopicConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty
    }
  }

  /**
   * Topic policy config for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * TopicPolicyConfigProperty topicPolicyConfigProperty = TopicPolicyConfigProperty.builder()
   * .topicsConfig(List.of(TopicConfigProperty.builder()
   * .definition("definition")
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .examples(List.of("examples"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicpolicyconfig.html)
   */
  public interface TopicPolicyConfigProperty {
    /**
     * List of topic configs in topic policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicpolicyconfig.html#cfn-bedrock-guardrail-topicpolicyconfig-topicsconfig)
     */
    public fun topicsConfig(): Any

    /**
     * A builder for [TopicPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param topicsConfig List of topic configs in topic policy. 
       */
      public fun topicsConfig(topicsConfig: IResolvable)

      /**
       * @param topicsConfig List of topic configs in topic policy. 
       */
      public fun topicsConfig(topicsConfig: List<Any>)

      /**
       * @param topicsConfig List of topic configs in topic policy. 
       */
      public fun topicsConfig(vararg topicsConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty.builder()

      /**
       * @param topicsConfig List of topic configs in topic policy. 
       */
      override fun topicsConfig(topicsConfig: IResolvable) {
        cdkBuilder.topicsConfig(topicsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param topicsConfig List of topic configs in topic policy. 
       */
      override fun topicsConfig(topicsConfig: List<Any>) {
        cdkBuilder.topicsConfig(topicsConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param topicsConfig List of topic configs in topic policy. 
       */
      override fun topicsConfig(vararg topicsConfig: Any): Unit =
          topicsConfig(topicsConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty,
    ) : CdkObject(cdkObject), TopicPolicyConfigProperty {
      /**
       * List of topic configs in topic policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicpolicyconfig.html#cfn-bedrock-guardrail-topicpolicyconfig-topicsconfig)
       */
      override fun topicsConfig(): Any = unwrap(this).getTopicsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty):
          TopicPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicPolicyConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty
    }
  }

  /**
   * A custom word config.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * WordConfigProperty wordConfigProperty = WordConfigProperty.builder()
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordconfig.html)
   */
  public interface WordConfigProperty {
    /**
     * The custom word text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordconfig.html#cfn-bedrock-guardrail-wordconfig-text)
     */
    public fun text(): String

    /**
     * A builder for [WordConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param text The custom word text. 
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty.builder()

      /**
       * @param text The custom word text. 
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty,
    ) : CdkObject(cdkObject), WordConfigProperty {
      /**
       * The custom word text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordconfig.html#cfn-bedrock-guardrail-wordconfig-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WordConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty):
          WordConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? WordConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WordConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty
    }
  }

  /**
   * Word policy config for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * WordPolicyConfigProperty wordPolicyConfigProperty = WordPolicyConfigProperty.builder()
   * .managedWordListsConfig(List.of(ManagedWordsConfigProperty.builder()
   * .type("type")
   * .build()))
   * .wordsConfig(List.of(WordConfigProperty.builder()
   * .text("text")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordpolicyconfig.html)
   */
  public interface WordPolicyConfigProperty {
    /**
     * A config for the list of managed words.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordpolicyconfig.html#cfn-bedrock-guardrail-wordpolicyconfig-managedwordlistsconfig)
     */
    public fun managedWordListsConfig(): Any? = unwrap(this).getManagedWordListsConfig()

    /**
     * List of custom word configs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordpolicyconfig.html#cfn-bedrock-guardrail-wordpolicyconfig-wordsconfig)
     */
    public fun wordsConfig(): Any? = unwrap(this).getWordsConfig()

    /**
     * A builder for [WordPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param managedWordListsConfig A config for the list of managed words.
       */
      public fun managedWordListsConfig(managedWordListsConfig: IResolvable)

      /**
       * @param managedWordListsConfig A config for the list of managed words.
       */
      public fun managedWordListsConfig(managedWordListsConfig: List<Any>)

      /**
       * @param managedWordListsConfig A config for the list of managed words.
       */
      public fun managedWordListsConfig(vararg managedWordListsConfig: Any)

      /**
       * @param wordsConfig List of custom word configs.
       */
      public fun wordsConfig(wordsConfig: IResolvable)

      /**
       * @param wordsConfig List of custom word configs.
       */
      public fun wordsConfig(wordsConfig: List<Any>)

      /**
       * @param wordsConfig List of custom word configs.
       */
      public fun wordsConfig(vararg wordsConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty.builder()

      /**
       * @param managedWordListsConfig A config for the list of managed words.
       */
      override fun managedWordListsConfig(managedWordListsConfig: IResolvable) {
        cdkBuilder.managedWordListsConfig(managedWordListsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param managedWordListsConfig A config for the list of managed words.
       */
      override fun managedWordListsConfig(managedWordListsConfig: List<Any>) {
        cdkBuilder.managedWordListsConfig(managedWordListsConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param managedWordListsConfig A config for the list of managed words.
       */
      override fun managedWordListsConfig(vararg managedWordListsConfig: Any): Unit =
          managedWordListsConfig(managedWordListsConfig.toList())

      /**
       * @param wordsConfig List of custom word configs.
       */
      override fun wordsConfig(wordsConfig: IResolvable) {
        cdkBuilder.wordsConfig(wordsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param wordsConfig List of custom word configs.
       */
      override fun wordsConfig(wordsConfig: List<Any>) {
        cdkBuilder.wordsConfig(wordsConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param wordsConfig List of custom word configs.
       */
      override fun wordsConfig(vararg wordsConfig: Any): Unit = wordsConfig(wordsConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty,
    ) : CdkObject(cdkObject), WordPolicyConfigProperty {
      /**
       * A config for the list of managed words.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordpolicyconfig.html#cfn-bedrock-guardrail-wordpolicyconfig-managedwordlistsconfig)
       */
      override fun managedWordListsConfig(): Any? = unwrap(this).getManagedWordListsConfig()

      /**
       * List of custom word configs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordpolicyconfig.html#cfn-bedrock-guardrail-wordpolicyconfig-wordsconfig)
       */
      override fun wordsConfig(): Any? = unwrap(this).getWordsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WordPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty):
          WordPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? WordPolicyConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WordPolicyConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty
    }
  }
}
