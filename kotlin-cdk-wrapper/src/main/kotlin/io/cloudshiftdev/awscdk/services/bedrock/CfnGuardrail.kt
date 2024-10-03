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
import kotlin.Number
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
 * You can configure the following policies in a guardrail to avoid undesirable and harmful content,
 * filter out denied topics and words, and remove sensitive information for privacy protection.
 *
 * * *Content filters* - Adjust filter strengths to block input prompts or model responses
 * containing harmful content.
 * * *Denied topics* - Define a set of topics that are undesirable in the context of your
 * application. These topics will be blocked if detected in user queries or model responses.
 * * *Word filters* - Configure filters to block undesirable words, phrases, and profanity. Such
 * words can include offensive terms, competitor names etc.
 * * *Sensitive information filters* - Block or mask sensitive information such as personally
 * identifiable information (PII) or custom regex in user inputs and model responses.
 *
 * In addition to the above policies, you can also configure the messages to be returned to the user
 * if a user input or model response is in violation of the policies defined in the guardrail.
 *
 * For more information, see [Amazon Bedrock
 * Guardrails](https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails.html) in the *Amazon
 * Bedrock User Guide* .
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
 * .contextualGroundingPolicyConfig(ContextualGroundingPolicyConfigProperty.builder()
 * .filtersConfig(List.of(ContextualGroundingFilterConfigProperty.builder()
 * .threshold(123)
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
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
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
   * Appears if the `status` of the guardrail is `FAILED` .
   *
   * A list of recommendations to carry out before retrying the request.
   */
  public open fun attrFailureRecommendations(): List<String> =
      unwrap(this).getAttrFailureRecommendations()

  /**
   * The ARN of the guardrail.
   */
  public open fun attrGuardrailArn(): String = unwrap(this).getAttrGuardrailArn()

  /**
   * The unique identifier of the guardrail.
   */
  public open fun attrGuardrailId(): String = unwrap(this).getAttrGuardrailId()

  /**
   * The status of the guardrail.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Appears if the `status` is `FAILED` .
   *
   * A list of reasons for why the guardrail failed to be created, updated, versioned, or deleted.
   */
  public open fun attrStatusReasons(): List<String> = unwrap(this).getAttrStatusReasons()

  /**
   * The date and time at which the guardrail was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The version of the guardrail that was created.
   *
   * This value will always be `DRAFT` .
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
   * The content filter policies to configure for the guardrail.
   */
  public open fun contentPolicyConfig(): Any? = unwrap(this).getContentPolicyConfig()

  /**
   * The content filter policies to configure for the guardrail.
   */
  public open fun contentPolicyConfig(`value`: IResolvable) {
    unwrap(this).setContentPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The content filter policies to configure for the guardrail.
   */
  public open fun contentPolicyConfig(`value`: ContentPolicyConfigProperty) {
    unwrap(this).setContentPolicyConfig(`value`.let(ContentPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * The content filter policies to configure for the guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("836bfed449265982733dc263dfc92823bd3a7d91647fe58dfa4d4d249cd0adec")
  public open fun contentPolicyConfig(`value`: ContentPolicyConfigProperty.Builder.() -> Unit): Unit
      = contentPolicyConfig(ContentPolicyConfigProperty(`value`))

  /**
   * Contextual grounding policy config for a guardrail.
   */
  public open fun contextualGroundingPolicyConfig(): Any? =
      unwrap(this).getContextualGroundingPolicyConfig()

  /**
   * Contextual grounding policy config for a guardrail.
   */
  public open fun contextualGroundingPolicyConfig(`value`: IResolvable) {
    unwrap(this).setContextualGroundingPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contextual grounding policy config for a guardrail.
   */
  public open
      fun contextualGroundingPolicyConfig(`value`: ContextualGroundingPolicyConfigProperty) {
    unwrap(this).setContextualGroundingPolicyConfig(`value`.let(ContextualGroundingPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Contextual grounding policy config for a guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("725daf8e4bf7436fc6e39d1e95274bfc1c2b0fdc2d58eb2788cd0248461ef0a6")
  public open
      fun contextualGroundingPolicyConfig(`value`: ContextualGroundingPolicyConfigProperty.Builder.() -> Unit):
      Unit = contextualGroundingPolicyConfig(ContextualGroundingPolicyConfigProperty(`value`))

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
   * The ARN of the AWS KMS key that you use to encrypt the guardrail.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The ARN of the AWS KMS key that you use to encrypt the guardrail.
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
   * The sensitive information policy to configure for the guardrail.
   */
  public open fun sensitiveInformationPolicyConfig(): Any? =
      unwrap(this).getSensitiveInformationPolicyConfig()

  /**
   * The sensitive information policy to configure for the guardrail.
   */
  public open fun sensitiveInformationPolicyConfig(`value`: IResolvable) {
    unwrap(this).setSensitiveInformationPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The sensitive information policy to configure for the guardrail.
   */
  public open
      fun sensitiveInformationPolicyConfig(`value`: SensitiveInformationPolicyConfigProperty) {
    unwrap(this).setSensitiveInformationPolicyConfig(`value`.let(SensitiveInformationPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * The sensitive information policy to configure for the guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1430238e16c96d0407665d530b2092c5eac29b5c0e4bc4ecf11123fa431090e1")
  public open
      fun sensitiveInformationPolicyConfig(`value`: SensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
      Unit = sensitiveInformationPolicyConfig(SensitiveInformationPolicyConfigProperty(`value`))

  /**
   * The tags that you want to attach to the guardrail.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags that you want to attach to the guardrail.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags that you want to attach to the guardrail.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The topic policies to configure for the guardrail.
   */
  public open fun topicPolicyConfig(): Any? = unwrap(this).getTopicPolicyConfig()

  /**
   * The topic policies to configure for the guardrail.
   */
  public open fun topicPolicyConfig(`value`: IResolvable) {
    unwrap(this).setTopicPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The topic policies to configure for the guardrail.
   */
  public open fun topicPolicyConfig(`value`: TopicPolicyConfigProperty) {
    unwrap(this).setTopicPolicyConfig(`value`.let(TopicPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * The topic policies to configure for the guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ba657d356ea1ca4be58a1680d2ef214d3dd654edaffd6adb93b480342de9c49")
  public open fun topicPolicyConfig(`value`: TopicPolicyConfigProperty.Builder.() -> Unit): Unit =
      topicPolicyConfig(TopicPolicyConfigProperty(`value`))

  /**
   * The word policy you configure for the guardrail.
   */
  public open fun wordPolicyConfig(): Any? = unwrap(this).getWordPolicyConfig()

  /**
   * The word policy you configure for the guardrail.
   */
  public open fun wordPolicyConfig(`value`: IResolvable) {
    unwrap(this).setWordPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The word policy you configure for the guardrail.
   */
  public open fun wordPolicyConfig(`value`: WordPolicyConfigProperty) {
    unwrap(this).setWordPolicyConfig(`value`.let(WordPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * The word policy you configure for the guardrail.
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
     * The content filter policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig The content filter policies to configure for the guardrail. 
     */
    public fun contentPolicyConfig(contentPolicyConfig: IResolvable)

    /**
     * The content filter policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig The content filter policies to configure for the guardrail. 
     */
    public fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty)

    /**
     * The content filter policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig The content filter policies to configure for the guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03b17022fb2875d609f1791da309213d727f5e6080ed6b6bde7b0869ef6ef9b3")
    public
        fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty.Builder.() -> Unit)

    /**
     * Contextual grounding policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. 
     */
    public fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: IResolvable)

    /**
     * Contextual grounding policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. 
     */
    public
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: ContextualGroundingPolicyConfigProperty)

    /**
     * Contextual grounding policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5836fee2ed9d4c6012c64df1e336ab300329ed54a9ecff62fdc791cbfb1e435")
    public
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: ContextualGroundingPolicyConfigProperty.Builder.() -> Unit)

    /**
     * A description of the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-description)
     * @param description A description of the guardrail. 
     */
    public fun description(description: String)

    /**
     * The ARN of the AWS KMS key that you use to encrypt the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-kmskeyarn)
     * @param kmsKeyArn The ARN of the AWS KMS key that you use to encrypt the guardrail. 
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
     * The sensitive information policy to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig The sensitive information policy to configure for the
     * guardrail. 
     */
    public fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable)

    /**
     * The sensitive information policy to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig The sensitive information policy to configure for the
     * guardrail. 
     */
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty)

    /**
     * The sensitive information policy to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig The sensitive information policy to configure for the
     * guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790c853f6a08ea46769870ce2e94698cc54cf2ded40abbb7b69d3b84141d6ea9")
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty.Builder.() -> Unit)

    /**
     * The tags that you want to attach to the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-tags)
     * @param tags The tags that you want to attach to the guardrail. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that you want to attach to the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-tags)
     * @param tags The tags that you want to attach to the guardrail. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The topic policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig The topic policies to configure for the guardrail. 
     */
    public fun topicPolicyConfig(topicPolicyConfig: IResolvable)

    /**
     * The topic policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig The topic policies to configure for the guardrail. 
     */
    public fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty)

    /**
     * The topic policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig The topic policies to configure for the guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31939df4bdf47d4ac59ed66a726b769c45a6db1b4bc903f6f5848296ae470c06")
    public fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty.Builder.() -> Unit)

    /**
     * The word policy you configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig The word policy you configure for the guardrail. 
     */
    public fun wordPolicyConfig(wordPolicyConfig: IResolvable)

    /**
     * The word policy you configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig The word policy you configure for the guardrail. 
     */
    public fun wordPolicyConfig(wordPolicyConfig: WordPolicyConfigProperty)

    /**
     * The word policy you configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig The word policy you configure for the guardrail. 
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
     * The content filter policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig The content filter policies to configure for the guardrail. 
     */
    override fun contentPolicyConfig(contentPolicyConfig: IResolvable) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The content filter policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig The content filter policies to configure for the guardrail. 
     */
    override fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(ContentPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * The content filter policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contentpolicyconfig)
     * @param contentPolicyConfig The content filter policies to configure for the guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03b17022fb2875d609f1791da309213d727f5e6080ed6b6bde7b0869ef6ef9b3")
    override
        fun contentPolicyConfig(contentPolicyConfig: ContentPolicyConfigProperty.Builder.() -> Unit):
        Unit = contentPolicyConfig(ContentPolicyConfigProperty(contentPolicyConfig))

    /**
     * Contextual grounding policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. 
     */
    override fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: IResolvable) {
      cdkBuilder.contextualGroundingPolicyConfig(contextualGroundingPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contextual grounding policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. 
     */
    override
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: ContextualGroundingPolicyConfigProperty) {
      cdkBuilder.contextualGroundingPolicyConfig(contextualGroundingPolicyConfig.let(ContextualGroundingPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Contextual grounding policy config for a guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig Contextual grounding policy config for a guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5836fee2ed9d4c6012c64df1e336ab300329ed54a9ecff62fdc791cbfb1e435")
    override
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: ContextualGroundingPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        contextualGroundingPolicyConfig(ContextualGroundingPolicyConfigProperty(contextualGroundingPolicyConfig))

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
     * The ARN of the AWS KMS key that you use to encrypt the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-kmskeyarn)
     * @param kmsKeyArn The ARN of the AWS KMS key that you use to encrypt the guardrail. 
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
     * The sensitive information policy to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig The sensitive information policy to configure for the
     * guardrail. 
     */
    override fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The sensitive information policy to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig The sensitive information policy to configure for the
     * guardrail. 
     */
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(SensitiveInformationPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * The sensitive information policy to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig The sensitive information policy to configure for the
     * guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("790c853f6a08ea46769870ce2e94698cc54cf2ded40abbb7b69d3b84141d6ea9")
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: SensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        sensitiveInformationPolicyConfig(SensitiveInformationPolicyConfigProperty(sensitiveInformationPolicyConfig))

    /**
     * The tags that you want to attach to the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-tags)
     * @param tags The tags that you want to attach to the guardrail. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags that you want to attach to the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-tags)
     * @param tags The tags that you want to attach to the guardrail. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The topic policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig The topic policies to configure for the guardrail. 
     */
    override fun topicPolicyConfig(topicPolicyConfig: IResolvable) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The topic policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig The topic policies to configure for the guardrail. 
     */
    override fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(TopicPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * The topic policies to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-topicpolicyconfig)
     * @param topicPolicyConfig The topic policies to configure for the guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31939df4bdf47d4ac59ed66a726b769c45a6db1b4bc903f6f5848296ae470c06")
    override fun topicPolicyConfig(topicPolicyConfig: TopicPolicyConfigProperty.Builder.() -> Unit):
        Unit = topicPolicyConfig(TopicPolicyConfigProperty(topicPolicyConfig))

    /**
     * The word policy you configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig The word policy you configure for the guardrail. 
     */
    override fun wordPolicyConfig(wordPolicyConfig: IResolvable) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The word policy you configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig The word policy you configure for the guardrail. 
     */
    override fun wordPolicyConfig(wordPolicyConfig: WordPolicyConfigProperty) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(WordPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * The word policy you configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrail.html#cfn-bedrock-guardrail-wordpolicyconfig)
     * @param wordPolicyConfig The word policy you configure for the guardrail. 
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
   * Contains filter strengths for harmful content.
   *
   * Guardrails support the following content filters to detect and filter harmful user inputs and
   * FM-generated outputs.
   *
   * * *Hate* – Describes language or a statement that discriminates, criticizes, insults,
   * denounces, or dehumanizes a person or group on the basis of an identity (such as race, ethnicity,
   * gender, religion, sexual orientation, ability, and national origin).
   * * *Insults* – Describes language or a statement that includes demeaning, humiliating, mocking,
   * insulting, or belittling language. This type of language is also labeled as bullying.
   * * *Sexual* – Describes language or a statement that indicates sexual interest, activity, or
   * arousal using direct or indirect references to body parts, physical traits, or sex.
   * * *Violence* – Describes language or a statement that includes glorification of or threats to
   * inflict physical pain, hurt, or injury toward a person, group or thing.
   *
   * Content filtering depends on the confidence classification of user inputs and FM responses
   * across each of the four harmful categories. All input and output statements are classified into
   * one of four confidence levels (NONE, LOW, MEDIUM, HIGH) for each harmful category. For example, if
   * a statement is classified as *Hate* with HIGH confidence, the likelihood of the statement
   * representing hateful content is high. A single statement can be classified across multiple
   * categories with varying confidence levels. For example, a single statement can be classified as
   * *Hate* with HIGH confidence, *Insults* with LOW confidence, *Sexual* with NONE confidence, and
   * *Violence* with MEDIUM confidence.
   *
   * For more information, see [Guardrails content
   * filters](https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails-filters.html) .
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
     * The strength of the content filter to apply to prompts.
     *
     * As you increase the filter strength, the likelihood of filtering harmful content increases
     * and the probability of seeing harmful content in your application reduces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-inputstrength)
     */
    public fun inputStrength(): String

    /**
     * The strength of the content filter to apply to model responses.
     *
     * As you increase the filter strength, the likelihood of filtering harmful content increases
     * and the probability of seeing harmful content in your application reduces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-outputstrength)
     */
    public fun outputStrength(): String

    /**
     * The harmful category that the content filter is applied to.
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
       * @param inputStrength The strength of the content filter to apply to prompts. 
       * As you increase the filter strength, the likelihood of filtering harmful content increases
       * and the probability of seeing harmful content in your application reduces.
       */
      public fun inputStrength(inputStrength: String)

      /**
       * @param outputStrength The strength of the content filter to apply to model responses. 
       * As you increase the filter strength, the likelihood of filtering harmful content increases
       * and the probability of seeing harmful content in your application reduces.
       */
      public fun outputStrength(outputStrength: String)

      /**
       * @param type The harmful category that the content filter is applied to. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentFilterConfigProperty.builder()

      /**
       * @param inputStrength The strength of the content filter to apply to prompts. 
       * As you increase the filter strength, the likelihood of filtering harmful content increases
       * and the probability of seeing harmful content in your application reduces.
       */
      override fun inputStrength(inputStrength: String) {
        cdkBuilder.inputStrength(inputStrength)
      }

      /**
       * @param outputStrength The strength of the content filter to apply to model responses. 
       * As you increase the filter strength, the likelihood of filtering harmful content increases
       * and the probability of seeing harmful content in your application reduces.
       */
      override fun outputStrength(outputStrength: String) {
        cdkBuilder.outputStrength(outputStrength)
      }

      /**
       * @param type The harmful category that the content filter is applied to. 
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
    ) : CdkObject(cdkObject),
        ContentFilterConfigProperty {
      /**
       * The strength of the content filter to apply to prompts.
       *
       * As you increase the filter strength, the likelihood of filtering harmful content increases
       * and the probability of seeing harmful content in your application reduces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-inputstrength)
       */
      override fun inputStrength(): String = unwrap(this).getInputStrength()

      /**
       * The strength of the content filter to apply to model responses.
       *
       * As you increase the filter strength, the likelihood of filtering harmful content increases
       * and the probability of seeing harmful content in your application reduces.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contentfilterconfig.html#cfn-bedrock-guardrail-contentfilterconfig-outputstrength)
       */
      override fun outputStrength(): String = unwrap(this).getOutputStrength()

      /**
       * The harmful category that the content filter is applied to.
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
   * Contains details about how to handle harmful content.
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
     * Contains the type of the content filter and how strongly it should apply to prompts and model
     * responses.
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
       * @param filtersConfig Contains the type of the content filter and how strongly it should
       * apply to prompts and model responses. 
       */
      public fun filtersConfig(filtersConfig: IResolvable)

      /**
       * @param filtersConfig Contains the type of the content filter and how strongly it should
       * apply to prompts and model responses. 
       */
      public fun filtersConfig(filtersConfig: List<Any>)

      /**
       * @param filtersConfig Contains the type of the content filter and how strongly it should
       * apply to prompts and model responses. 
       */
      public fun filtersConfig(vararg filtersConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty.builder()

      /**
       * @param filtersConfig Contains the type of the content filter and how strongly it should
       * apply to prompts and model responses. 
       */
      override fun filtersConfig(filtersConfig: IResolvable) {
        cdkBuilder.filtersConfig(filtersConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filtersConfig Contains the type of the content filter and how strongly it should
       * apply to prompts and model responses. 
       */
      override fun filtersConfig(filtersConfig: List<Any>) {
        cdkBuilder.filtersConfig(filtersConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filtersConfig Contains the type of the content filter and how strongly it should
       * apply to prompts and model responses. 
       */
      override fun filtersConfig(vararg filtersConfig: Any): Unit =
          filtersConfig(filtersConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContentPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        ContentPolicyConfigProperty {
      /**
       * Contains the type of the content filter and how strongly it should apply to prompts and
       * model responses.
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
   * The filter configuration details for the guardrails contextual grounding filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ContextualGroundingFilterConfigProperty contextualGroundingFilterConfigProperty =
   * ContextualGroundingFilterConfigProperty.builder()
   * .threshold(123)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingfilterconfig.html)
   */
  public interface ContextualGroundingFilterConfigProperty {
    /**
     * The threshold details for the guardrails contextual grounding filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingfilterconfig.html#cfn-bedrock-guardrail-contextualgroundingfilterconfig-threshold)
     */
    public fun threshold(): Number

    /**
     * The filter details for the guardrails contextual grounding filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingfilterconfig.html#cfn-bedrock-guardrail-contextualgroundingfilterconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [ContextualGroundingFilterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param threshold The threshold details for the guardrails contextual grounding filter. 
       */
      public fun threshold(threshold: Number)

      /**
       * @param type The filter details for the guardrails contextual grounding filter. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingFilterConfigProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingFilterConfigProperty.builder()

      /**
       * @param threshold The threshold details for the guardrails contextual grounding filter. 
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param type The filter details for the guardrails contextual grounding filter. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingFilterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingFilterConfigProperty,
    ) : CdkObject(cdkObject),
        ContextualGroundingFilterConfigProperty {
      /**
       * The threshold details for the guardrails contextual grounding filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingfilterconfig.html#cfn-bedrock-guardrail-contextualgroundingfilterconfig-threshold)
       */
      override fun threshold(): Number = unwrap(this).getThreshold()

      /**
       * The filter details for the guardrails contextual grounding filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingfilterconfig.html#cfn-bedrock-guardrail-contextualgroundingfilterconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContextualGroundingFilterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingFilterConfigProperty):
          ContextualGroundingFilterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContextualGroundingFilterConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContextualGroundingFilterConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingFilterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingFilterConfigProperty
    }
  }

  /**
   * The policy configuration details for the guardrails contextual grounding policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bedrock.*;
   * ContextualGroundingPolicyConfigProperty contextualGroundingPolicyConfigProperty =
   * ContextualGroundingPolicyConfigProperty.builder()
   * .filtersConfig(List.of(ContextualGroundingFilterConfigProperty.builder()
   * .threshold(123)
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingpolicyconfig.html)
   */
  public interface ContextualGroundingPolicyConfigProperty {
    /**
     * List of contextual grounding filter configs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingpolicyconfig.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig-filtersconfig)
     */
    public fun filtersConfig(): Any

    /**
     * A builder for [ContextualGroundingPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filtersConfig List of contextual grounding filter configs. 
       */
      public fun filtersConfig(filtersConfig: IResolvable)

      /**
       * @param filtersConfig List of contextual grounding filter configs. 
       */
      public fun filtersConfig(filtersConfig: List<Any>)

      /**
       * @param filtersConfig List of contextual grounding filter configs. 
       */
      public fun filtersConfig(vararg filtersConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingPolicyConfigProperty.builder()

      /**
       * @param filtersConfig List of contextual grounding filter configs. 
       */
      override fun filtersConfig(filtersConfig: IResolvable) {
        cdkBuilder.filtersConfig(filtersConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filtersConfig List of contextual grounding filter configs. 
       */
      override fun filtersConfig(filtersConfig: List<Any>) {
        cdkBuilder.filtersConfig(filtersConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filtersConfig List of contextual grounding filter configs. 
       */
      override fun filtersConfig(vararg filtersConfig: Any): Unit =
          filtersConfig(filtersConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        ContextualGroundingPolicyConfigProperty {
      /**
       * List of contextual grounding filter configs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-contextualgroundingpolicyconfig.html#cfn-bedrock-guardrail-contextualgroundingpolicyconfig-filtersconfig)
       */
      override fun filtersConfig(): Any = unwrap(this).getFiltersConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContextualGroundingPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingPolicyConfigProperty):
          ContextualGroundingPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContextualGroundingPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContextualGroundingPolicyConfigProperty):
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ContextualGroundingPolicyConfigProperty
    }
  }

  /**
   * The managed word list to configure for the guardrail.
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
     * The managed word type to configure for the guardrail.
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
       * @param type The managed word type to configure for the guardrail. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.ManagedWordsConfigProperty.builder()

      /**
       * @param type The managed word type to configure for the guardrail. 
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
    ) : CdkObject(cdkObject),
        ManagedWordsConfigProperty {
      /**
       * The managed word type to configure for the guardrail.
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
   * The PII entity to configure for the guardrail.
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
     * Configure guardrail action when the PII entity is detected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-piientityconfig.html#cfn-bedrock-guardrail-piientityconfig-action)
     */
    public fun action(): String

    /**
     * Configure guardrail type when the PII entity is detected.
     *
     * The following PIIs are used to block or mask sensitive information:
     *
     * * *General*
     * * *ADDRESS*
     *
     * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123". An
     * address can include information such as the street, building, location, city, state, country,
     * county, zip code, precinct, and neighborhood.
     *
     * * *AGE*
     *
     * An individual's age, including the quantity and unit of time. For example, in the phrase "I
     * am 40 years old," Guarrails recognizes "40 years" as an age.
     *
     * * *NAME*
     *
     * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or
     * Miss. guardrails doesn't apply this entity type to names that are part of organizations or
     * addresses. For example, guardrails recognizes the "John Doe Organization" as an organization,
     * and it recognizes "Jane Doe Street" as an address.
     *
     * * *EMAIL*
     *
     * An email address, such as *marymajor&#64;email.com* .
     *
     * * *PHONE*
     *
     * A phone number. This entity type also includes fax and pager numbers.
     *
     * * *USERNAME*
     *
     * A user name that identifies an account, such as a login name, screen name, nick name, or
     * handle.
     *
     * * *PASSWORD*
     *
     * An alphanumeric string that is used as a password, such as "* *very20special#pass** ".
     *
     * * *DRIVER_ID*
     *
     * The number assigned to a driver's license, which is an official document permitting an
     * individual to operate one or more motorized vehicles on a public road. A driver's license number
     * consists of alphanumeric characters.
     *
     * * *LICENSE_PLATE*
     *
     * A license plate for a vehicle is issued by the state or country where the vehicle is
     * registered. The format for passenger vehicles is typically five to eight digits, consisting of
     * upper-case letters and numbers. The format varies depending on the location of the issuing state
     * or country.
     *
     * * *VEHICLE_IDENTIFICATION_NUMBER*
     *
     * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format
     * are defined in the *ISO 3779* specification. Each country has specific codes and formats for
     * VINs.
     *
     * * *Finance*
     * * *REDIT_DEBIT_CARD_CVV*
     *
     * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and Discover
     * credit and debit cards. For American Express credit or debit cards, the CVV is a four-digit
     * numeric code.
     *
     * * *CREDIT_DEBIT_CARD_EXPIRY*
     *
     * The expiration date for a credit or debit card. This number is usually four digits long and
     * is often formatted as *month/year* or *MM/YY* . Guardrails recognizes expiration dates such as
     * *01/21* , *01/2021* , and *Jan 2021* .
     *
     * * *CREDIT_DEBIT_CARD_NUMBER*
     *
     * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in length.
     * However, Amazon Comprehend also recognizes credit or debit card numbers when only the last four
     * digits are present.
     *
     * * *PIN*
     *
     * A four-digit personal identification number (PIN) with which you can access your bank
     * account.
     *
     * * *INTERNATIONAL_BANK_ACCOUNT_NUMBER*
     *
     * An International Bank Account Number has specific formats in each country. For more
     * information, see
     * [www.iban.com/structure](https://docs.aws.amazon.com/https://www.iban.com/structure) .
     *
     * * *SWIFT_CODE*
     *
     * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a particular
     * bank or branch. Banks use these codes for money transfers such as international wire transfers.
     *
     * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific branches,
     * while eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or primary office.
     *
     * * *IT*
     * * *IP_ADDRESS*
     *
     * An IPv4 address, such as *198.51.100.0* .
     *
     * * *MAC_ADDRESS*
     *
     * A *media access control* (MAC) address is a unique identifier assigned to a network interface
     * controller (NIC).
     *
     * * *URL*
     *
     * A web address, such as *www.example.com* .
     *
     * * *AWS_ACCESS_KEY*
     *
     * A unique identifier that's associated with a secret access key; you use the access key ID and
     * secret access key to sign programmatic AWS requests cryptographically.
     *
     * * *AWS_SECRET_KEY*
     *
     * A unique identifier that's associated with an access key. You use the access key ID and
     * secret access key to sign programmatic AWS requests cryptographically.
     *
     * * *USA specific*
     * * *US_BANK_ACCOUNT_NUMBER*
     *
     * A US bank account number, which is typically 10 to 12 digits long.
     *
     * * *US_BANK_ROUTING_NUMBER*
     *
     * A US bank account routing number. These are typically nine digits long,
     *
     * * *US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER*
     *
     * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts with
     * a "9" and contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space or a
     * dash after the third and forth digits.
     *
     * * *US_PASSPORT_NUMBER*
     *
     * A US passport number. Passport numbers range from six to nine alphanumeric characters.
     *
     * * *US_SOCIAL_SECURITY_NUMBER*
     *
     * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens,
     * permanent residents, and temporary working residents.
     *
     * * *Canada specific*
     * * *CA_HEALTH_NUMBER*
     *
     * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals to
     * access healthcare benefits.
     *
     * * *CA_SOCIAL_INSURANCE_NUMBER*
     *
     * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for
     * individuals to access government programs and benefits.
     *
     * The SIN is formatted as three groups of three digits, such as *123-456-789* . A SIN can be
     * validated through a simple check-digit process called the [Luhn
     * algorithm](https://docs.aws.amazon.com/https://www.wikipedia.org/wiki/Luhn_algorithm) .
     *
     * * *UK Specific*
     * * *UK_NATIONAL_HEALTH_SERVICE_NUMBER*
     *
     * A UK National Health Service Number is a 10-17 digit number, such as *485 777 3456* . The
     * current system formats the 10-digit number with spaces after the third and sixth digits. The
     * final digit is an error-detecting checksum.
     *
     * * *UK_NATIONAL_INSURANCE_NUMBER*
     *
     * A UK National Insurance Number (NINO) provides individuals with access to National Insurance
     * (social security) benefits. It is also used for some purposes in the UK tax system.
     *
     * The number is nine digits long and starts with two letters, followed by six numbers and one
     * letter. A NINO can be formatted with a space or a dash after the two letters and after the
     * second, forth, and sixth digits.
     *
     * * *UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER*
     *
     * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a
     * business.
     *
     * * *Custom*
     * * *Regex filter* - You can use a regular expressions to define patterns for a guardrail to
     * recognize and act upon such as serial number, booking ID etc..
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
       * @param action Configure guardrail action when the PII entity is detected. 
       */
      public fun action(action: String)

      /**
       * @param type Configure guardrail type when the PII entity is detected. 
       * The following PIIs are used to block or mask sensitive information:
       *
       * * *General*
       * * *ADDRESS*
       *
       * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123".
       * An address can include information such as the street, building, location, city, state,
       * country, county, zip code, precinct, and neighborhood.
       *
       * * *AGE*
       *
       * An individual's age, including the quantity and unit of time. For example, in the phrase "I
       * am 40 years old," Guarrails recognizes "40 years" as an age.
       *
       * * *NAME*
       *
       * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or
       * Miss. guardrails doesn't apply this entity type to names that are part of organizations or
       * addresses. For example, guardrails recognizes the "John Doe Organization" as an organization,
       * and it recognizes "Jane Doe Street" as an address.
       *
       * * *EMAIL*
       *
       * An email address, such as *marymajor&#64;email.com* .
       *
       * * *PHONE*
       *
       * A phone number. This entity type also includes fax and pager numbers.
       *
       * * *USERNAME*
       *
       * A user name that identifies an account, such as a login name, screen name, nick name, or
       * handle.
       *
       * * *PASSWORD*
       *
       * An alphanumeric string that is used as a password, such as "* *very20special#pass** ".
       *
       * * *DRIVER_ID*
       *
       * The number assigned to a driver's license, which is an official document permitting an
       * individual to operate one or more motorized vehicles on a public road. A driver's license
       * number consists of alphanumeric characters.
       *
       * * *LICENSE_PLATE*
       *
       * A license plate for a vehicle is issued by the state or country where the vehicle is
       * registered. The format for passenger vehicles is typically five to eight digits, consisting of
       * upper-case letters and numbers. The format varies depending on the location of the issuing
       * state or country.
       *
       * * *VEHICLE_IDENTIFICATION_NUMBER*
       *
       * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format
       * are defined in the *ISO 3779* specification. Each country has specific codes and formats for
       * VINs.
       *
       * * *Finance*
       * * *REDIT_DEBIT_CARD_CVV*
       *
       * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and
       * Discover credit and debit cards. For American Express credit or debit cards, the CVV is a
       * four-digit numeric code.
       *
       * * *CREDIT_DEBIT_CARD_EXPIRY*
       *
       * The expiration date for a credit or debit card. This number is usually four digits long and
       * is often formatted as *month/year* or *MM/YY* . Guardrails recognizes expiration dates such as
       * *01/21* , *01/2021* , and *Jan 2021* .
       *
       * * *CREDIT_DEBIT_CARD_NUMBER*
       *
       * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in
       * length. However, Amazon Comprehend also recognizes credit or debit card numbers when only the
       * last four digits are present.
       *
       * * *PIN*
       *
       * A four-digit personal identification number (PIN) with which you can access your bank
       * account.
       *
       * * *INTERNATIONAL_BANK_ACCOUNT_NUMBER*
       *
       * An International Bank Account Number has specific formats in each country. For more
       * information, see
       * [www.iban.com/structure](https://docs.aws.amazon.com/https://www.iban.com/structure) .
       *
       * * *SWIFT_CODE*
       *
       * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a
       * particular bank or branch. Banks use these codes for money transfers such as international
       * wire transfers.
       *
       * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific
       * branches, while eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or
       * primary office.
       *
       * * *IT*
       * * *IP_ADDRESS*
       *
       * An IPv4 address, such as *198.51.100.0* .
       *
       * * *MAC_ADDRESS*
       *
       * A *media access control* (MAC) address is a unique identifier assigned to a network
       * interface controller (NIC).
       *
       * * *URL*
       *
       * A web address, such as *www.example.com* .
       *
       * * *AWS_ACCESS_KEY*
       *
       * A unique identifier that's associated with a secret access key; you use the access key ID
       * and secret access key to sign programmatic AWS requests cryptographically.
       *
       * * *AWS_SECRET_KEY*
       *
       * A unique identifier that's associated with an access key. You use the access key ID and
       * secret access key to sign programmatic AWS requests cryptographically.
       *
       * * *USA specific*
       * * *US_BANK_ACCOUNT_NUMBER*
       *
       * A US bank account number, which is typically 10 to 12 digits long.
       *
       * * *US_BANK_ROUTING_NUMBER*
       *
       * A US bank account routing number. These are typically nine digits long,
       *
       * * *US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER*
       *
       * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts
       * with a "9" and contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space
       * or a dash after the third and forth digits.
       *
       * * *US_PASSPORT_NUMBER*
       *
       * A US passport number. Passport numbers range from six to nine alphanumeric characters.
       *
       * * *US_SOCIAL_SECURITY_NUMBER*
       *
       * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens,
       * permanent residents, and temporary working residents.
       *
       * * *Canada specific*
       * * *CA_HEALTH_NUMBER*
       *
       * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals
       * to access healthcare benefits.
       *
       * * *CA_SOCIAL_INSURANCE_NUMBER*
       *
       * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for
       * individuals to access government programs and benefits.
       *
       * The SIN is formatted as three groups of three digits, such as *123-456-789* . A SIN can be
       * validated through a simple check-digit process called the [Luhn
       * algorithm](https://docs.aws.amazon.com/https://www.wikipedia.org/wiki/Luhn_algorithm) .
       *
       * * *UK Specific*
       * * *UK_NATIONAL_HEALTH_SERVICE_NUMBER*
       *
       * A UK National Health Service Number is a 10-17 digit number, such as *485 777 3456* . The
       * current system formats the 10-digit number with spaces after the third and sixth digits. The
       * final digit is an error-detecting checksum.
       *
       * * *UK_NATIONAL_INSURANCE_NUMBER*
       *
       * A UK National Insurance Number (NINO) provides individuals with access to National
       * Insurance (social security) benefits. It is also used for some purposes in the UK tax system.
       *
       * The number is nine digits long and starts with two letters, followed by six numbers and one
       * letter. A NINO can be formatted with a space or a dash after the two letters and after the
       * second, forth, and sixth digits.
       *
       * * *UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER*
       *
       * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a
       * business.
       *
       * * *Custom*
       * * *Regex filter* - You can use a regular expressions to define patterns for a guardrail to
       * recognize and act upon such as serial number, booking ID etc..
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.PiiEntityConfigProperty.builder()

      /**
       * @param action Configure guardrail action when the PII entity is detected. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param type Configure guardrail type when the PII entity is detected. 
       * The following PIIs are used to block or mask sensitive information:
       *
       * * *General*
       * * *ADDRESS*
       *
       * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123".
       * An address can include information such as the street, building, location, city, state,
       * country, county, zip code, precinct, and neighborhood.
       *
       * * *AGE*
       *
       * An individual's age, including the quantity and unit of time. For example, in the phrase "I
       * am 40 years old," Guarrails recognizes "40 years" as an age.
       *
       * * *NAME*
       *
       * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or
       * Miss. guardrails doesn't apply this entity type to names that are part of organizations or
       * addresses. For example, guardrails recognizes the "John Doe Organization" as an organization,
       * and it recognizes "Jane Doe Street" as an address.
       *
       * * *EMAIL*
       *
       * An email address, such as *marymajor&#64;email.com* .
       *
       * * *PHONE*
       *
       * A phone number. This entity type also includes fax and pager numbers.
       *
       * * *USERNAME*
       *
       * A user name that identifies an account, such as a login name, screen name, nick name, or
       * handle.
       *
       * * *PASSWORD*
       *
       * An alphanumeric string that is used as a password, such as "* *very20special#pass** ".
       *
       * * *DRIVER_ID*
       *
       * The number assigned to a driver's license, which is an official document permitting an
       * individual to operate one or more motorized vehicles on a public road. A driver's license
       * number consists of alphanumeric characters.
       *
       * * *LICENSE_PLATE*
       *
       * A license plate for a vehicle is issued by the state or country where the vehicle is
       * registered. The format for passenger vehicles is typically five to eight digits, consisting of
       * upper-case letters and numbers. The format varies depending on the location of the issuing
       * state or country.
       *
       * * *VEHICLE_IDENTIFICATION_NUMBER*
       *
       * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format
       * are defined in the *ISO 3779* specification. Each country has specific codes and formats for
       * VINs.
       *
       * * *Finance*
       * * *REDIT_DEBIT_CARD_CVV*
       *
       * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and
       * Discover credit and debit cards. For American Express credit or debit cards, the CVV is a
       * four-digit numeric code.
       *
       * * *CREDIT_DEBIT_CARD_EXPIRY*
       *
       * The expiration date for a credit or debit card. This number is usually four digits long and
       * is often formatted as *month/year* or *MM/YY* . Guardrails recognizes expiration dates such as
       * *01/21* , *01/2021* , and *Jan 2021* .
       *
       * * *CREDIT_DEBIT_CARD_NUMBER*
       *
       * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in
       * length. However, Amazon Comprehend also recognizes credit or debit card numbers when only the
       * last four digits are present.
       *
       * * *PIN*
       *
       * A four-digit personal identification number (PIN) with which you can access your bank
       * account.
       *
       * * *INTERNATIONAL_BANK_ACCOUNT_NUMBER*
       *
       * An International Bank Account Number has specific formats in each country. For more
       * information, see
       * [www.iban.com/structure](https://docs.aws.amazon.com/https://www.iban.com/structure) .
       *
       * * *SWIFT_CODE*
       *
       * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a
       * particular bank or branch. Banks use these codes for money transfers such as international
       * wire transfers.
       *
       * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific
       * branches, while eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or
       * primary office.
       *
       * * *IT*
       * * *IP_ADDRESS*
       *
       * An IPv4 address, such as *198.51.100.0* .
       *
       * * *MAC_ADDRESS*
       *
       * A *media access control* (MAC) address is a unique identifier assigned to a network
       * interface controller (NIC).
       *
       * * *URL*
       *
       * A web address, such as *www.example.com* .
       *
       * * *AWS_ACCESS_KEY*
       *
       * A unique identifier that's associated with a secret access key; you use the access key ID
       * and secret access key to sign programmatic AWS requests cryptographically.
       *
       * * *AWS_SECRET_KEY*
       *
       * A unique identifier that's associated with an access key. You use the access key ID and
       * secret access key to sign programmatic AWS requests cryptographically.
       *
       * * *USA specific*
       * * *US_BANK_ACCOUNT_NUMBER*
       *
       * A US bank account number, which is typically 10 to 12 digits long.
       *
       * * *US_BANK_ROUTING_NUMBER*
       *
       * A US bank account routing number. These are typically nine digits long,
       *
       * * *US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER*
       *
       * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts
       * with a "9" and contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space
       * or a dash after the third and forth digits.
       *
       * * *US_PASSPORT_NUMBER*
       *
       * A US passport number. Passport numbers range from six to nine alphanumeric characters.
       *
       * * *US_SOCIAL_SECURITY_NUMBER*
       *
       * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens,
       * permanent residents, and temporary working residents.
       *
       * * *Canada specific*
       * * *CA_HEALTH_NUMBER*
       *
       * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals
       * to access healthcare benefits.
       *
       * * *CA_SOCIAL_INSURANCE_NUMBER*
       *
       * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for
       * individuals to access government programs and benefits.
       *
       * The SIN is formatted as three groups of three digits, such as *123-456-789* . A SIN can be
       * validated through a simple check-digit process called the [Luhn
       * algorithm](https://docs.aws.amazon.com/https://www.wikipedia.org/wiki/Luhn_algorithm) .
       *
       * * *UK Specific*
       * * *UK_NATIONAL_HEALTH_SERVICE_NUMBER*
       *
       * A UK National Health Service Number is a 10-17 digit number, such as *485 777 3456* . The
       * current system formats the 10-digit number with spaces after the third and sixth digits. The
       * final digit is an error-detecting checksum.
       *
       * * *UK_NATIONAL_INSURANCE_NUMBER*
       *
       * A UK National Insurance Number (NINO) provides individuals with access to National
       * Insurance (social security) benefits. It is also used for some purposes in the UK tax system.
       *
       * The number is nine digits long and starts with two letters, followed by six numbers and one
       * letter. A NINO can be formatted with a space or a dash after the two letters and after the
       * second, forth, and sixth digits.
       *
       * * *UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER*
       *
       * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a
       * business.
       *
       * * *Custom*
       * * *Regex filter* - You can use a regular expressions to define patterns for a guardrail to
       * recognize and act upon such as serial number, booking ID etc..
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
    ) : CdkObject(cdkObject),
        PiiEntityConfigProperty {
      /**
       * Configure guardrail action when the PII entity is detected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-piientityconfig.html#cfn-bedrock-guardrail-piientityconfig-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * Configure guardrail type when the PII entity is detected.
       *
       * The following PIIs are used to block or mask sensitive information:
       *
       * * *General*
       * * *ADDRESS*
       *
       * A physical address, such as "100 Main Street, Anytown, USA" or "Suite #12, Building 123".
       * An address can include information such as the street, building, location, city, state,
       * country, county, zip code, precinct, and neighborhood.
       *
       * * *AGE*
       *
       * An individual's age, including the quantity and unit of time. For example, in the phrase "I
       * am 40 years old," Guarrails recognizes "40 years" as an age.
       *
       * * *NAME*
       *
       * An individual's name. This entity type does not include titles, such as Dr., Mr., Mrs., or
       * Miss. guardrails doesn't apply this entity type to names that are part of organizations or
       * addresses. For example, guardrails recognizes the "John Doe Organization" as an organization,
       * and it recognizes "Jane Doe Street" as an address.
       *
       * * *EMAIL*
       *
       * An email address, such as *marymajor&#64;email.com* .
       *
       * * *PHONE*
       *
       * A phone number. This entity type also includes fax and pager numbers.
       *
       * * *USERNAME*
       *
       * A user name that identifies an account, such as a login name, screen name, nick name, or
       * handle.
       *
       * * *PASSWORD*
       *
       * An alphanumeric string that is used as a password, such as "* *very20special#pass** ".
       *
       * * *DRIVER_ID*
       *
       * The number assigned to a driver's license, which is an official document permitting an
       * individual to operate one or more motorized vehicles on a public road. A driver's license
       * number consists of alphanumeric characters.
       *
       * * *LICENSE_PLATE*
       *
       * A license plate for a vehicle is issued by the state or country where the vehicle is
       * registered. The format for passenger vehicles is typically five to eight digits, consisting of
       * upper-case letters and numbers. The format varies depending on the location of the issuing
       * state or country.
       *
       * * *VEHICLE_IDENTIFICATION_NUMBER*
       *
       * A Vehicle Identification Number (VIN) uniquely identifies a vehicle. VIN content and format
       * are defined in the *ISO 3779* specification. Each country has specific codes and formats for
       * VINs.
       *
       * * *Finance*
       * * *REDIT_DEBIT_CARD_CVV*
       *
       * A three-digit card verification code (CVV) that is present on VISA, MasterCard, and
       * Discover credit and debit cards. For American Express credit or debit cards, the CVV is a
       * four-digit numeric code.
       *
       * * *CREDIT_DEBIT_CARD_EXPIRY*
       *
       * The expiration date for a credit or debit card. This number is usually four digits long and
       * is often formatted as *month/year* or *MM/YY* . Guardrails recognizes expiration dates such as
       * *01/21* , *01/2021* , and *Jan 2021* .
       *
       * * *CREDIT_DEBIT_CARD_NUMBER*
       *
       * The number for a credit or debit card. These numbers can vary from 13 to 16 digits in
       * length. However, Amazon Comprehend also recognizes credit or debit card numbers when only the
       * last four digits are present.
       *
       * * *PIN*
       *
       * A four-digit personal identification number (PIN) with which you can access your bank
       * account.
       *
       * * *INTERNATIONAL_BANK_ACCOUNT_NUMBER*
       *
       * An International Bank Account Number has specific formats in each country. For more
       * information, see
       * [www.iban.com/structure](https://docs.aws.amazon.com/https://www.iban.com/structure) .
       *
       * * *SWIFT_CODE*
       *
       * A SWIFT code is a standard format of Bank Identifier Code (BIC) used to specify a
       * particular bank or branch. Banks use these codes for money transfers such as international
       * wire transfers.
       *
       * SWIFT codes consist of eight or 11 characters. The 11-digit codes refer to specific
       * branches, while eight-digit codes (or 11-digit codes ending in 'XXX') refer to the head or
       * primary office.
       *
       * * *IT*
       * * *IP_ADDRESS*
       *
       * An IPv4 address, such as *198.51.100.0* .
       *
       * * *MAC_ADDRESS*
       *
       * A *media access control* (MAC) address is a unique identifier assigned to a network
       * interface controller (NIC).
       *
       * * *URL*
       *
       * A web address, such as *www.example.com* .
       *
       * * *AWS_ACCESS_KEY*
       *
       * A unique identifier that's associated with a secret access key; you use the access key ID
       * and secret access key to sign programmatic AWS requests cryptographically.
       *
       * * *AWS_SECRET_KEY*
       *
       * A unique identifier that's associated with an access key. You use the access key ID and
       * secret access key to sign programmatic AWS requests cryptographically.
       *
       * * *USA specific*
       * * *US_BANK_ACCOUNT_NUMBER*
       *
       * A US bank account number, which is typically 10 to 12 digits long.
       *
       * * *US_BANK_ROUTING_NUMBER*
       *
       * A US bank account routing number. These are typically nine digits long,
       *
       * * *US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER*
       *
       * A US Individual Taxpayer Identification Number (ITIN) is a nine-digit number that starts
       * with a "9" and contain a "7" or "8" as the fourth digit. An ITIN can be formatted with a space
       * or a dash after the third and forth digits.
       *
       * * *US_PASSPORT_NUMBER*
       *
       * A US passport number. Passport numbers range from six to nine alphanumeric characters.
       *
       * * *US_SOCIAL_SECURITY_NUMBER*
       *
       * A US Social Security Number (SSN) is a nine-digit number that is issued to US citizens,
       * permanent residents, and temporary working residents.
       *
       * * *Canada specific*
       * * *CA_HEALTH_NUMBER*
       *
       * A Canadian Health Service Number is a 10-digit unique identifier, required for individuals
       * to access healthcare benefits.
       *
       * * *CA_SOCIAL_INSURANCE_NUMBER*
       *
       * A Canadian Social Insurance Number (SIN) is a nine-digit unique identifier, required for
       * individuals to access government programs and benefits.
       *
       * The SIN is formatted as three groups of three digits, such as *123-456-789* . A SIN can be
       * validated through a simple check-digit process called the [Luhn
       * algorithm](https://docs.aws.amazon.com/https://www.wikipedia.org/wiki/Luhn_algorithm) .
       *
       * * *UK Specific*
       * * *UK_NATIONAL_HEALTH_SERVICE_NUMBER*
       *
       * A UK National Health Service Number is a 10-17 digit number, such as *485 777 3456* . The
       * current system formats the 10-digit number with spaces after the third and sixth digits. The
       * final digit is an error-detecting checksum.
       *
       * * *UK_NATIONAL_INSURANCE_NUMBER*
       *
       * A UK National Insurance Number (NINO) provides individuals with access to National
       * Insurance (social security) benefits. It is also used for some purposes in the UK tax system.
       *
       * The number is nine digits long and starts with two letters, followed by six numbers and one
       * letter. A NINO can be formatted with a space or a dash after the two letters and after the
       * second, forth, and sixth digits.
       *
       * * *UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER*
       *
       * A UK Unique Taxpayer Reference (UTR) is a 10-digit number that identifies a taxpayer or a
       * business.
       *
       * * *Custom*
       * * *Regex filter* - You can use a regular expressions to define patterns for a guardrail to
       * recognize and act upon such as serial number, booking ID etc..
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
   * The regular expression to configure for the guardrail.
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
     * The guardrail action to configure when matching regular expression is detected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-action)
     */
    public fun action(): String

    /**
     * The description of the regular expression to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the regular expression to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-name)
     */
    public fun name(): String

    /**
     * The regular expression pattern to configure for the guardrail.
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
       * @param action The guardrail action to configure when matching regular expression is
       * detected. 
       */
      public fun action(action: String)

      /**
       * @param description The description of the regular expression to configure for the
       * guardrail.
       */
      public fun description(description: String)

      /**
       * @param name The name of the regular expression to configure for the guardrail. 
       */
      public fun name(name: String)

      /**
       * @param pattern The regular expression pattern to configure for the guardrail. 
       */
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty.builder()

      /**
       * @param action The guardrail action to configure when matching regular expression is
       * detected. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param description The description of the regular expression to configure for the
       * guardrail.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The name of the regular expression to configure for the guardrail. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param pattern The regular expression pattern to configure for the guardrail. 
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.RegexConfigProperty,
    ) : CdkObject(cdkObject),
        RegexConfigProperty {
      /**
       * The guardrail action to configure when matching regular expression is detected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The description of the regular expression to configure for the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name of the regular expression to configure for the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-regexconfig.html#cfn-bedrock-guardrail-regexconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The regular expression pattern to configure for the guardrail.
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
   * Contains details about PII entities and regular expressions to configure for the guardrail.
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
     * A list of PII entities to configure to the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-sensitiveinformationpolicyconfig.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig-piientitiesconfig)
     */
    public fun piiEntitiesConfig(): Any? = unwrap(this).getPiiEntitiesConfig()

    /**
     * A list of regular expressions to configure to the guardrail.
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
       * @param piiEntitiesConfig A list of PII entities to configure to the guardrail.
       */
      public fun piiEntitiesConfig(piiEntitiesConfig: IResolvable)

      /**
       * @param piiEntitiesConfig A list of PII entities to configure to the guardrail.
       */
      public fun piiEntitiesConfig(piiEntitiesConfig: List<Any>)

      /**
       * @param piiEntitiesConfig A list of PII entities to configure to the guardrail.
       */
      public fun piiEntitiesConfig(vararg piiEntitiesConfig: Any)

      /**
       * @param regexesConfig A list of regular expressions to configure to the guardrail.
       */
      public fun regexesConfig(regexesConfig: IResolvable)

      /**
       * @param regexesConfig A list of regular expressions to configure to the guardrail.
       */
      public fun regexesConfig(regexesConfig: List<Any>)

      /**
       * @param regexesConfig A list of regular expressions to configure to the guardrail.
       */
      public fun regexesConfig(vararg regexesConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty.builder()

      /**
       * @param piiEntitiesConfig A list of PII entities to configure to the guardrail.
       */
      override fun piiEntitiesConfig(piiEntitiesConfig: IResolvable) {
        cdkBuilder.piiEntitiesConfig(piiEntitiesConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param piiEntitiesConfig A list of PII entities to configure to the guardrail.
       */
      override fun piiEntitiesConfig(piiEntitiesConfig: List<Any>) {
        cdkBuilder.piiEntitiesConfig(piiEntitiesConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param piiEntitiesConfig A list of PII entities to configure to the guardrail.
       */
      override fun piiEntitiesConfig(vararg piiEntitiesConfig: Any): Unit =
          piiEntitiesConfig(piiEntitiesConfig.toList())

      /**
       * @param regexesConfig A list of regular expressions to configure to the guardrail.
       */
      override fun regexesConfig(regexesConfig: IResolvable) {
        cdkBuilder.regexesConfig(regexesConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param regexesConfig A list of regular expressions to configure to the guardrail.
       */
      override fun regexesConfig(regexesConfig: List<Any>) {
        cdkBuilder.regexesConfig(regexesConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param regexesConfig A list of regular expressions to configure to the guardrail.
       */
      override fun regexesConfig(vararg regexesConfig: Any): Unit =
          regexesConfig(regexesConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.SensitiveInformationPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        SensitiveInformationPolicyConfigProperty {
      /**
       * A list of PII entities to configure to the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-sensitiveinformationpolicyconfig.html#cfn-bedrock-guardrail-sensitiveinformationpolicyconfig-piientitiesconfig)
       */
      override fun piiEntitiesConfig(): Any? = unwrap(this).getPiiEntitiesConfig()

      /**
       * A list of regular expressions to configure to the guardrail.
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
   * Details about topics for the guardrail to identify and deny.
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
     * A definition of the topic to deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-definition)
     */
    public fun definition(): String

    /**
     * A list of prompts, each of which is an example of a prompt that can be categorized as
     * belonging to the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-examples)
     */
    public fun examples(): List<String> = unwrap(this).getExamples() ?: emptyList()

    /**
     * The name of the topic to deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-name)
     */
    public fun name(): String

    /**
     * Specifies to deny the topic.
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
       * @param definition A definition of the topic to deny. 
       */
      public fun definition(definition: String)

      /**
       * @param examples A list of prompts, each of which is an example of a prompt that can be
       * categorized as belonging to the topic.
       */
      public fun examples(examples: List<String>)

      /**
       * @param examples A list of prompts, each of which is an example of a prompt that can be
       * categorized as belonging to the topic.
       */
      public fun examples(vararg examples: String)

      /**
       * @param name The name of the topic to deny. 
       */
      public fun name(name: String)

      /**
       * @param type Specifies to deny the topic. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty.builder()

      /**
       * @param definition A definition of the topic to deny. 
       */
      override fun definition(definition: String) {
        cdkBuilder.definition(definition)
      }

      /**
       * @param examples A list of prompts, each of which is an example of a prompt that can be
       * categorized as belonging to the topic.
       */
      override fun examples(examples: List<String>) {
        cdkBuilder.examples(examples)
      }

      /**
       * @param examples A list of prompts, each of which is an example of a prompt that can be
       * categorized as belonging to the topic.
       */
      override fun examples(vararg examples: String): Unit = examples(examples.toList())

      /**
       * @param name The name of the topic to deny. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type Specifies to deny the topic. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicConfigProperty,
    ) : CdkObject(cdkObject),
        TopicConfigProperty {
      /**
       * A definition of the topic to deny.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-definition)
       */
      override fun definition(): String = unwrap(this).getDefinition()

      /**
       * A list of prompts, each of which is an example of a prompt that can be categorized as
       * belonging to the topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-examples)
       */
      override fun examples(): List<String> = unwrap(this).getExamples() ?: emptyList()

      /**
       * The name of the topic to deny.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-topicconfig.html#cfn-bedrock-guardrail-topicconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Specifies to deny the topic.
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
   * Contains details about topics that the guardrail should identify and deny.
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
     * A list of policies related to topics that the guardrail should deny.
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
       * @param topicsConfig A list of policies related to topics that the guardrail should deny. 
       */
      public fun topicsConfig(topicsConfig: IResolvable)

      /**
       * @param topicsConfig A list of policies related to topics that the guardrail should deny. 
       */
      public fun topicsConfig(topicsConfig: List<Any>)

      /**
       * @param topicsConfig A list of policies related to topics that the guardrail should deny. 
       */
      public fun topicsConfig(vararg topicsConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty.builder()

      /**
       * @param topicsConfig A list of policies related to topics that the guardrail should deny. 
       */
      override fun topicsConfig(topicsConfig: IResolvable) {
        cdkBuilder.topicsConfig(topicsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param topicsConfig A list of policies related to topics that the guardrail should deny. 
       */
      override fun topicsConfig(topicsConfig: List<Any>) {
        cdkBuilder.topicsConfig(topicsConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param topicsConfig A list of policies related to topics that the guardrail should deny. 
       */
      override fun topicsConfig(vararg topicsConfig: Any): Unit =
          topicsConfig(topicsConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.TopicPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        TopicPolicyConfigProperty {
      /**
       * A list of policies related to topics that the guardrail should deny.
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
   * A word to configure for the guardrail.
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
     * Text of the word configured for the guardrail to block.
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
       * @param text Text of the word configured for the guardrail to block. 
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty.builder()

      /**
       * @param text Text of the word configured for the guardrail to block. 
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.WordConfigProperty,
    ) : CdkObject(cdkObject),
        WordConfigProperty {
      /**
       * Text of the word configured for the guardrail to block.
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
   * Contains details about the word policy to configured for the guardrail.
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
     * A list of managed words to configure for the guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordpolicyconfig.html#cfn-bedrock-guardrail-wordpolicyconfig-managedwordlistsconfig)
     */
    public fun managedWordListsConfig(): Any? = unwrap(this).getManagedWordListsConfig()

    /**
     * A list of words to configure for the guardrail.
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
       * @param managedWordListsConfig A list of managed words to configure for the guardrail.
       */
      public fun managedWordListsConfig(managedWordListsConfig: IResolvable)

      /**
       * @param managedWordListsConfig A list of managed words to configure for the guardrail.
       */
      public fun managedWordListsConfig(managedWordListsConfig: List<Any>)

      /**
       * @param managedWordListsConfig A list of managed words to configure for the guardrail.
       */
      public fun managedWordListsConfig(vararg managedWordListsConfig: Any)

      /**
       * @param wordsConfig A list of words to configure for the guardrail.
       */
      public fun wordsConfig(wordsConfig: IResolvable)

      /**
       * @param wordsConfig A list of words to configure for the guardrail.
       */
      public fun wordsConfig(wordsConfig: List<Any>)

      /**
       * @param wordsConfig A list of words to configure for the guardrail.
       */
      public fun wordsConfig(vararg wordsConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty.Builder =
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty.builder()

      /**
       * @param managedWordListsConfig A list of managed words to configure for the guardrail.
       */
      override fun managedWordListsConfig(managedWordListsConfig: IResolvable) {
        cdkBuilder.managedWordListsConfig(managedWordListsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param managedWordListsConfig A list of managed words to configure for the guardrail.
       */
      override fun managedWordListsConfig(managedWordListsConfig: List<Any>) {
        cdkBuilder.managedWordListsConfig(managedWordListsConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param managedWordListsConfig A list of managed words to configure for the guardrail.
       */
      override fun managedWordListsConfig(vararg managedWordListsConfig: Any): Unit =
          managedWordListsConfig(managedWordListsConfig.toList())

      /**
       * @param wordsConfig A list of words to configure for the guardrail.
       */
      override fun wordsConfig(wordsConfig: IResolvable) {
        cdkBuilder.wordsConfig(wordsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param wordsConfig A list of words to configure for the guardrail.
       */
      override fun wordsConfig(wordsConfig: List<Any>) {
        cdkBuilder.wordsConfig(wordsConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param wordsConfig A list of words to configure for the guardrail.
       */
      override fun wordsConfig(vararg wordsConfig: Any): Unit = wordsConfig(wordsConfig.toList())

      public fun build():
          software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrail.WordPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        WordPolicyConfigProperty {
      /**
       * A list of managed words to configure for the guardrail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bedrock-guardrail-wordpolicyconfig.html#cfn-bedrock-guardrail-wordpolicyconfig-managedwordlistsconfig)
       */
      override fun managedWordListsConfig(): Any? = unwrap(this).getManagedWordListsConfig()

      /**
       * A list of words to configure for the guardrail.
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
