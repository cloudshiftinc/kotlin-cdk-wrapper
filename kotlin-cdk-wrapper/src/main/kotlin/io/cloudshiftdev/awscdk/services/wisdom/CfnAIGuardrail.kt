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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q in Connect AI Guardrail.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIGuardrail cfnAIGuardrail = CfnAIGuardrail.Builder.create(this, "MyCfnAIGuardrail")
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
public open class CfnAIGuardrail(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIGuardrailProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnAIGuardrail(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAIGuardrailProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIGuardrailProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAIGuardrailProps(props)
  )

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(): String = unwrap(this).getAssistantId()

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(`value`: String) {
    unwrap(this).setAssistantId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AI Guardrail.
   */
  public open fun attrAiGuardrailArn(): String = unwrap(this).getAttrAiGuardrailArn()

  /**
   * The identifier of the Amazon Q in Connect AI Guardrail.
   */
  public open fun attrAiGuardrailId(): String = unwrap(this).getAttrAiGuardrailId()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Q in Connect assistant.
   */
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  /**
   * The message to return when the AI Guardrail blocks a prompt.
   */
  public open fun blockedInputMessaging(): String = unwrap(this).getBlockedInputMessaging()

  /**
   * The message to return when the AI Guardrail blocks a prompt.
   */
  public open fun blockedInputMessaging(`value`: String) {
    unwrap(this).setBlockedInputMessaging(`value`)
  }

  /**
   * The message to return when the AI Guardrail blocks a model response.
   */
  public open fun blockedOutputsMessaging(): String = unwrap(this).getBlockedOutputsMessaging()

  /**
   * The message to return when the AI Guardrail blocks a model response.
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
   * Contains details about how to handle harmful content.
   */
  public open fun contentPolicyConfig(): Any? = unwrap(this).getContentPolicyConfig()

  /**
   * Contains details about how to handle harmful content.
   */
  public open fun contentPolicyConfig(`value`: IResolvable) {
    unwrap(this).setContentPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about how to handle harmful content.
   */
  public open fun contentPolicyConfig(`value`: AIGuardrailContentPolicyConfigProperty) {
    unwrap(this).setContentPolicyConfig(`value`.let(AIGuardrailContentPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Contains details about how to handle harmful content.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47e21566c18416e84d4bd237dfeb18260aa10921c2c5827d3c956a7b089583ec")
  public open
      fun contentPolicyConfig(`value`: AIGuardrailContentPolicyConfigProperty.Builder.() -> Unit):
      Unit = contentPolicyConfig(AIGuardrailContentPolicyConfigProperty(`value`))

  /**
   * The policy configuration details for the AI Guardrail's contextual grounding policy.
   */
  public open fun contextualGroundingPolicyConfig(): Any? =
      unwrap(this).getContextualGroundingPolicyConfig()

  /**
   * The policy configuration details for the AI Guardrail's contextual grounding policy.
   */
  public open fun contextualGroundingPolicyConfig(`value`: IResolvable) {
    unwrap(this).setContextualGroundingPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The policy configuration details for the AI Guardrail's contextual grounding policy.
   */
  public open
      fun contextualGroundingPolicyConfig(`value`: AIGuardrailContextualGroundingPolicyConfigProperty) {
    unwrap(this).setContextualGroundingPolicyConfig(`value`.let(AIGuardrailContextualGroundingPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * The policy configuration details for the AI Guardrail's contextual grounding policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d0308b4f1944da023fdbbb11f5b68d51f25e7e984d41b34477207125260ecba4")
  public open
      fun contextualGroundingPolicyConfig(`value`: AIGuardrailContextualGroundingPolicyConfigProperty.Builder.() -> Unit):
      Unit =
      contextualGroundingPolicyConfig(AIGuardrailContextualGroundingPolicyConfigProperty(`value`))

  /**
   * A description of the AI Guardrail.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the AI Guardrail.
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
   * The name of the AI Guardrail.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the AI Guardrail.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Contains details about PII entities and regular expressions to configure for the AI Guardrail.
   */
  public open fun sensitiveInformationPolicyConfig(): Any? =
      unwrap(this).getSensitiveInformationPolicyConfig()

  /**
   * Contains details about PII entities and regular expressions to configure for the AI Guardrail.
   */
  public open fun sensitiveInformationPolicyConfig(`value`: IResolvable) {
    unwrap(this).setSensitiveInformationPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about PII entities and regular expressions to configure for the AI Guardrail.
   */
  public open
      fun sensitiveInformationPolicyConfig(`value`: AIGuardrailSensitiveInformationPolicyConfigProperty) {
    unwrap(this).setSensitiveInformationPolicyConfig(`value`.let(AIGuardrailSensitiveInformationPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Contains details about PII entities and regular expressions to configure for the AI Guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("94e82f78fddc1c7aa2d40db852df62f16489a684688d4f5e5108042b399793f3")
  public open
      fun sensitiveInformationPolicyConfig(`value`: AIGuardrailSensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
      Unit =
      sensitiveInformationPolicyConfig(AIGuardrailSensitiveInformationPolicyConfigProperty(`value`))

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
   * Contains details about topics that the AI Guardrail should identify and deny.
   */
  public open fun topicPolicyConfig(): Any? = unwrap(this).getTopicPolicyConfig()

  /**
   * Contains details about topics that the AI Guardrail should identify and deny.
   */
  public open fun topicPolicyConfig(`value`: IResolvable) {
    unwrap(this).setTopicPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about topics that the AI Guardrail should identify and deny.
   */
  public open fun topicPolicyConfig(`value`: AIGuardrailTopicPolicyConfigProperty) {
    unwrap(this).setTopicPolicyConfig(`value`.let(AIGuardrailTopicPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Contains details about topics that the AI Guardrail should identify and deny.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("53b9aeb439c0dec89297fb842f9b287b67fe473b8981dd3c18b018ee5831b693")
  public open
      fun topicPolicyConfig(`value`: AIGuardrailTopicPolicyConfigProperty.Builder.() -> Unit): Unit
      = topicPolicyConfig(AIGuardrailTopicPolicyConfigProperty(`value`))

  /**
   * Contains details about the word policy to configured for the AI Guardrail.
   */
  public open fun wordPolicyConfig(): Any? = unwrap(this).getWordPolicyConfig()

  /**
   * Contains details about the word policy to configured for the AI Guardrail.
   */
  public open fun wordPolicyConfig(`value`: IResolvable) {
    unwrap(this).setWordPolicyConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains details about the word policy to configured for the AI Guardrail.
   */
  public open fun wordPolicyConfig(`value`: AIGuardrailWordPolicyConfigProperty) {
    unwrap(this).setWordPolicyConfig(`value`.let(AIGuardrailWordPolicyConfigProperty.Companion::unwrap))
  }

  /**
   * Contains details about the word policy to configured for the AI Guardrail.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4928a472a707df488654ca89d89f60ce16fd305aee332c95b685f30df77c1708")
  public open fun wordPolicyConfig(`value`: AIGuardrailWordPolicyConfigProperty.Builder.() -> Unit):
      Unit = wordPolicyConfig(AIGuardrailWordPolicyConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAIGuardrail].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    public fun assistantId(assistantId: String)

    /**
     * The message to return when the AI Guardrail blocks a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedinputmessaging)
     * @param blockedInputMessaging The message to return when the AI Guardrail blocks a prompt. 
     */
    public fun blockedInputMessaging(blockedInputMessaging: String)

    /**
     * The message to return when the AI Guardrail blocks a model response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedoutputsmessaging)
     * @param blockedOutputsMessaging The message to return when the AI Guardrail blocks a model
     * response. 
     */
    public fun blockedOutputsMessaging(blockedOutputsMessaging: String)

    /**
     * Contains details about how to handle harmful content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
     * @param contentPolicyConfig Contains details about how to handle harmful content. 
     */
    public fun contentPolicyConfig(contentPolicyConfig: IResolvable)

    /**
     * Contains details about how to handle harmful content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
     * @param contentPolicyConfig Contains details about how to handle harmful content. 
     */
    public fun contentPolicyConfig(contentPolicyConfig: AIGuardrailContentPolicyConfigProperty)

    /**
     * Contains details about how to handle harmful content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
     * @param contentPolicyConfig Contains details about how to handle harmful content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e35d95e7cd9abba1688c8f7b3013b09d4387749a99b5513d274c8f12938f4a")
    public
        fun contentPolicyConfig(contentPolicyConfig: AIGuardrailContentPolicyConfigProperty.Builder.() -> Unit)

    /**
     * The policy configuration details for the AI Guardrail's contextual grounding policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy. 
     */
    public fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: IResolvable)

    /**
     * The policy configuration details for the AI Guardrail's contextual grounding policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy. 
     */
    public
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: AIGuardrailContextualGroundingPolicyConfigProperty)

    /**
     * The policy configuration details for the AI Guardrail's contextual grounding policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f5bff589c511ae1654609eac6e7db8492667649d3ea5dc95d279e2f4ac402c6")
    public
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: AIGuardrailContextualGroundingPolicyConfigProperty.Builder.() -> Unit)

    /**
     * A description of the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-description)
     * @param description A description of the AI Guardrail. 
     */
    public fun description(description: String)

    /**
     * The name of the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-name)
     * @param name The name of the AI Guardrail. 
     */
    public fun name(name: String)

    /**
     * Contains details about PII entities and regular expressions to configure for the AI
     * Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail. 
     */
    public fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable)

    /**
     * Contains details about PII entities and regular expressions to configure for the AI
     * Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail. 
     */
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: AIGuardrailSensitiveInformationPolicyConfigProperty)

    /**
     * Contains details about PII entities and regular expressions to configure for the AI
     * Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("375fc056751412fd5ca2fb1eead4c2d13695156c24d0978835c04277d18243bb")
    public
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: AIGuardrailSensitiveInformationPolicyConfigProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Contains details about topics that the AI Guardrail should identify and deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny. 
     */
    public fun topicPolicyConfig(topicPolicyConfig: IResolvable)

    /**
     * Contains details about topics that the AI Guardrail should identify and deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny. 
     */
    public fun topicPolicyConfig(topicPolicyConfig: AIGuardrailTopicPolicyConfigProperty)

    /**
     * Contains details about topics that the AI Guardrail should identify and deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0574574ea3ae1d8fe6c95f45cccc0ace920be820fd0cc9fb19ec670a9507ee89")
    public
        fun topicPolicyConfig(topicPolicyConfig: AIGuardrailTopicPolicyConfigProperty.Builder.() -> Unit)

    /**
     * Contains details about the word policy to configured for the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail. 
     */
    public fun wordPolicyConfig(wordPolicyConfig: IResolvable)

    /**
     * Contains details about the word policy to configured for the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail. 
     */
    public fun wordPolicyConfig(wordPolicyConfig: AIGuardrailWordPolicyConfigProperty)

    /**
     * Contains details about the word policy to configured for the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c52c81185f2186735c6b27ac2ffbae104fa2564190e7a9a622b5d17dce55f885")
    public
        fun wordPolicyConfig(wordPolicyConfig: AIGuardrailWordPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIGuardrail.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * The message to return when the AI Guardrail blocks a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedinputmessaging)
     * @param blockedInputMessaging The message to return when the AI Guardrail blocks a prompt. 
     */
    override fun blockedInputMessaging(blockedInputMessaging: String) {
      cdkBuilder.blockedInputMessaging(blockedInputMessaging)
    }

    /**
     * The message to return when the AI Guardrail blocks a model response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-blockedoutputsmessaging)
     * @param blockedOutputsMessaging The message to return when the AI Guardrail blocks a model
     * response. 
     */
    override fun blockedOutputsMessaging(blockedOutputsMessaging: String) {
      cdkBuilder.blockedOutputsMessaging(blockedOutputsMessaging)
    }

    /**
     * Contains details about how to handle harmful content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
     * @param contentPolicyConfig Contains details about how to handle harmful content. 
     */
    override fun contentPolicyConfig(contentPolicyConfig: IResolvable) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about how to handle harmful content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
     * @param contentPolicyConfig Contains details about how to handle harmful content. 
     */
    override fun contentPolicyConfig(contentPolicyConfig: AIGuardrailContentPolicyConfigProperty) {
      cdkBuilder.contentPolicyConfig(contentPolicyConfig.let(AIGuardrailContentPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Contains details about how to handle harmful content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contentpolicyconfig)
     * @param contentPolicyConfig Contains details about how to handle harmful content. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0e35d95e7cd9abba1688c8f7b3013b09d4387749a99b5513d274c8f12938f4a")
    override
        fun contentPolicyConfig(contentPolicyConfig: AIGuardrailContentPolicyConfigProperty.Builder.() -> Unit):
        Unit = contentPolicyConfig(AIGuardrailContentPolicyConfigProperty(contentPolicyConfig))

    /**
     * The policy configuration details for the AI Guardrail's contextual grounding policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy. 
     */
    override fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: IResolvable) {
      cdkBuilder.contextualGroundingPolicyConfig(contextualGroundingPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The policy configuration details for the AI Guardrail's contextual grounding policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy. 
     */
    override
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: AIGuardrailContextualGroundingPolicyConfigProperty) {
      cdkBuilder.contextualGroundingPolicyConfig(contextualGroundingPolicyConfig.let(AIGuardrailContextualGroundingPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * The policy configuration details for the AI Guardrail's contextual grounding policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-contextualgroundingpolicyconfig)
     * @param contextualGroundingPolicyConfig The policy configuration details for the AI
     * Guardrail's contextual grounding policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f5bff589c511ae1654609eac6e7db8492667649d3ea5dc95d279e2f4ac402c6")
    override
        fun contextualGroundingPolicyConfig(contextualGroundingPolicyConfig: AIGuardrailContextualGroundingPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        contextualGroundingPolicyConfig(AIGuardrailContextualGroundingPolicyConfigProperty(contextualGroundingPolicyConfig))

    /**
     * A description of the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-description)
     * @param description A description of the AI Guardrail. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-name)
     * @param name The name of the AI Guardrail. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contains details about PII entities and regular expressions to configure for the AI
     * Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail. 
     */
    override fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: IResolvable) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about PII entities and regular expressions to configure for the AI
     * Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail. 
     */
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: AIGuardrailSensitiveInformationPolicyConfigProperty) {
      cdkBuilder.sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig.let(AIGuardrailSensitiveInformationPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Contains details about PII entities and regular expressions to configure for the AI
     * Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-sensitiveinformationpolicyconfig)
     * @param sensitiveInformationPolicyConfig Contains details about PII entities and regular
     * expressions to configure for the AI Guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("375fc056751412fd5ca2fb1eead4c2d13695156c24d0978835c04277d18243bb")
    override
        fun sensitiveInformationPolicyConfig(sensitiveInformationPolicyConfig: AIGuardrailSensitiveInformationPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        sensitiveInformationPolicyConfig(AIGuardrailSensitiveInformationPolicyConfigProperty(sensitiveInformationPolicyConfig))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * Contains details about topics that the AI Guardrail should identify and deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny. 
     */
    override fun topicPolicyConfig(topicPolicyConfig: IResolvable) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about topics that the AI Guardrail should identify and deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny. 
     */
    override fun topicPolicyConfig(topicPolicyConfig: AIGuardrailTopicPolicyConfigProperty) {
      cdkBuilder.topicPolicyConfig(topicPolicyConfig.let(AIGuardrailTopicPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Contains details about topics that the AI Guardrail should identify and deny.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-topicpolicyconfig)
     * @param topicPolicyConfig Contains details about topics that the AI Guardrail should identify
     * and deny. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0574574ea3ae1d8fe6c95f45cccc0ace920be820fd0cc9fb19ec670a9507ee89")
    override
        fun topicPolicyConfig(topicPolicyConfig: AIGuardrailTopicPolicyConfigProperty.Builder.() -> Unit):
        Unit = topicPolicyConfig(AIGuardrailTopicPolicyConfigProperty(topicPolicyConfig))

    /**
     * Contains details about the word policy to configured for the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail. 
     */
    override fun wordPolicyConfig(wordPolicyConfig: IResolvable) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains details about the word policy to configured for the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail. 
     */
    override fun wordPolicyConfig(wordPolicyConfig: AIGuardrailWordPolicyConfigProperty) {
      cdkBuilder.wordPolicyConfig(wordPolicyConfig.let(AIGuardrailWordPolicyConfigProperty.Companion::unwrap))
    }

    /**
     * Contains details about the word policy to configured for the AI Guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrail.html#cfn-wisdom-aiguardrail-wordpolicyconfig)
     * @param wordPolicyConfig Contains details about the word policy to configured for the AI
     * Guardrail. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c52c81185f2186735c6b27ac2ffbae104fa2564190e7a9a622b5d17dce55f885")
    override
        fun wordPolicyConfig(wordPolicyConfig: AIGuardrailWordPolicyConfigProperty.Builder.() -> Unit):
        Unit = wordPolicyConfig(AIGuardrailWordPolicyConfigProperty(wordPolicyConfig))

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIGuardrail = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnAIGuardrail.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAIGuardrail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAIGuardrail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail):
        CfnAIGuardrail = CfnAIGuardrail(cdkObject)

    internal fun unwrap(wrapped: CfnAIGuardrail):
        software.amazon.awscdk.services.wisdom.CfnAIGuardrail = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnAIGuardrail
  }

  /**
   * Content policy config for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AIGuardrailContentPolicyConfigProperty aIGuardrailContentPolicyConfigProperty =
   * AIGuardrailContentPolicyConfigProperty.builder()
   * .filtersConfig(List.of(GuardrailContentFilterConfigProperty.builder()
   * .inputStrength("inputStrength")
   * .outputStrength("outputStrength")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailcontentpolicyconfig.html)
   */
  public interface AIGuardrailContentPolicyConfigProperty {
    /**
     * List of content filter configurations in a content policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailcontentpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailcontentpolicyconfig-filtersconfig)
     */
    public fun filtersConfig(): Any

    /**
     * A builder for [AIGuardrailContentPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filtersConfig List of content filter configurations in a content policy. 
       */
      public fun filtersConfig(filtersConfig: IResolvable)

      /**
       * @param filtersConfig List of content filter configurations in a content policy. 
       */
      public fun filtersConfig(filtersConfig: List<Any>)

      /**
       * @param filtersConfig List of content filter configurations in a content policy. 
       */
      public fun filtersConfig(vararg filtersConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty.builder()

      /**
       * @param filtersConfig List of content filter configurations in a content policy. 
       */
      override fun filtersConfig(filtersConfig: IResolvable) {
        cdkBuilder.filtersConfig(filtersConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filtersConfig List of content filter configurations in a content policy. 
       */
      override fun filtersConfig(filtersConfig: List<Any>) {
        cdkBuilder.filtersConfig(filtersConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filtersConfig List of content filter configurations in a content policy. 
       */
      override fun filtersConfig(vararg filtersConfig: Any): Unit =
          filtersConfig(filtersConfig.toList())

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        AIGuardrailContentPolicyConfigProperty {
      /**
       * List of content filter configurations in a content policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailcontentpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailcontentpolicyconfig-filtersconfig)
       */
      override fun filtersConfig(): Any = unwrap(this).getFiltersConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AIGuardrailContentPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty):
          AIGuardrailContentPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AIGuardrailContentPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AIGuardrailContentPolicyConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContentPolicyConfigProperty
    }
  }

  /**
   * Contextual grounding policy config for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AIGuardrailContextualGroundingPolicyConfigProperty
   * aIGuardrailContextualGroundingPolicyConfigProperty =
   * AIGuardrailContextualGroundingPolicyConfigProperty.builder()
   * .filtersConfig(List.of(GuardrailContextualGroundingFilterConfigProperty.builder()
   * .threshold(123)
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailcontextualgroundingpolicyconfig.html)
   */
  public interface AIGuardrailContextualGroundingPolicyConfigProperty {
    /**
     * List of contextual grounding filter configs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailcontextualgroundingpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailcontextualgroundingpolicyconfig-filtersconfig)
     */
    public fun filtersConfig(): Any

    /**
     * A builder for [AIGuardrailContextualGroundingPolicyConfigProperty]
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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty.builder()

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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        AIGuardrailContextualGroundingPolicyConfigProperty {
      /**
       * List of contextual grounding filter configs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailcontextualgroundingpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailcontextualgroundingpolicyconfig-filtersconfig)
       */
      override fun filtersConfig(): Any = unwrap(this).getFiltersConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AIGuardrailContextualGroundingPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty):
          AIGuardrailContextualGroundingPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AIGuardrailContextualGroundingPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AIGuardrailContextualGroundingPolicyConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailContextualGroundingPolicyConfigProperty
    }
  }

  /**
   * Sensitive information policy configuration for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AIGuardrailSensitiveInformationPolicyConfigProperty
   * aIGuardrailSensitiveInformationPolicyConfigProperty =
   * AIGuardrailSensitiveInformationPolicyConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig.html)
   */
  public interface AIGuardrailSensitiveInformationPolicyConfigProperty {
    /**
     * List of entities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig-piientitiesconfig)
     */
    public fun piiEntitiesConfig(): Any? = unwrap(this).getPiiEntitiesConfig()

    /**
     * List of regex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig-regexesconfig)
     */
    public fun regexesConfig(): Any? = unwrap(this).getRegexesConfig()

    /**
     * A builder for [AIGuardrailSensitiveInformationPolicyConfigProperty]
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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty.builder()

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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        AIGuardrailSensitiveInformationPolicyConfigProperty {
      /**
       * List of entities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig-piientitiesconfig)
       */
      override fun piiEntitiesConfig(): Any? = unwrap(this).getPiiEntitiesConfig()

      /**
       * List of regex.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailsensitiveinformationpolicyconfig-regexesconfig)
       */
      override fun regexesConfig(): Any? = unwrap(this).getRegexesConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AIGuardrailSensitiveInformationPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty):
          AIGuardrailSensitiveInformationPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject)
          as? AIGuardrailSensitiveInformationPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AIGuardrailSensitiveInformationPolicyConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailSensitiveInformationPolicyConfigProperty
    }
  }

  /**
   * Topic policy configuration for a guardrail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AIGuardrailTopicPolicyConfigProperty aIGuardrailTopicPolicyConfigProperty =
   * AIGuardrailTopicPolicyConfigProperty.builder()
   * .topicsConfig(List.of(GuardrailTopicConfigProperty.builder()
   * .definition("definition")
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .examples(List.of("examples"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailtopicpolicyconfig.html)
   */
  public interface AIGuardrailTopicPolicyConfigProperty {
    /**
     * List of topic configs in topic policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailtopicpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailtopicpolicyconfig-topicsconfig)
     */
    public fun topicsConfig(): Any

    /**
     * A builder for [AIGuardrailTopicPolicyConfigProperty]
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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty.builder()

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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        AIGuardrailTopicPolicyConfigProperty {
      /**
       * List of topic configs in topic policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailtopicpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailtopicpolicyconfig-topicsconfig)
       */
      override fun topicsConfig(): Any = unwrap(this).getTopicsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AIGuardrailTopicPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty):
          AIGuardrailTopicPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AIGuardrailTopicPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AIGuardrailTopicPolicyConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailTopicPolicyConfigProperty
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
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AIGuardrailWordPolicyConfigProperty aIGuardrailWordPolicyConfigProperty =
   * AIGuardrailWordPolicyConfigProperty.builder()
   * .managedWordListsConfig(List.of(GuardrailManagedWordsConfigProperty.builder()
   * .type("type")
   * .build()))
   * .wordsConfig(List.of(GuardrailWordConfigProperty.builder()
   * .text("text")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailwordpolicyconfig.html)
   */
  public interface AIGuardrailWordPolicyConfigProperty {
    /**
     * A config for the list of managed words.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailwordpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailwordpolicyconfig-managedwordlistsconfig)
     */
    public fun managedWordListsConfig(): Any? = unwrap(this).getManagedWordListsConfig()

    /**
     * List of custom word configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailwordpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailwordpolicyconfig-wordsconfig)
     */
    public fun wordsConfig(): Any? = unwrap(this).getWordsConfig()

    /**
     * A builder for [AIGuardrailWordPolicyConfigProperty]
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
       * @param wordsConfig List of custom word configurations.
       */
      public fun wordsConfig(wordsConfig: IResolvable)

      /**
       * @param wordsConfig List of custom word configurations.
       */
      public fun wordsConfig(wordsConfig: List<Any>)

      /**
       * @param wordsConfig List of custom word configurations.
       */
      public fun wordsConfig(vararg wordsConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty.builder()

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
       * @param wordsConfig List of custom word configurations.
       */
      override fun wordsConfig(wordsConfig: IResolvable) {
        cdkBuilder.wordsConfig(wordsConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param wordsConfig List of custom word configurations.
       */
      override fun wordsConfig(wordsConfig: List<Any>) {
        cdkBuilder.wordsConfig(wordsConfig.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param wordsConfig List of custom word configurations.
       */
      override fun wordsConfig(vararg wordsConfig: Any): Unit = wordsConfig(wordsConfig.toList())

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty,
    ) : CdkObject(cdkObject),
        AIGuardrailWordPolicyConfigProperty {
      /**
       * A config for the list of managed words.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailwordpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailwordpolicyconfig-managedwordlistsconfig)
       */
      override fun managedWordListsConfig(): Any? = unwrap(this).getManagedWordListsConfig()

      /**
       * List of custom word configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-aiguardrailwordpolicyconfig.html#cfn-wisdom-aiguardrail-aiguardrailwordpolicyconfig-wordsconfig)
       */
      override fun wordsConfig(): Any? = unwrap(this).getWordsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AIGuardrailWordPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty):
          AIGuardrailWordPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AIGuardrailWordPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AIGuardrailWordPolicyConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.AIGuardrailWordPolicyConfigProperty
    }
  }

  /**
   * Content filter configuration in content policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GuardrailContentFilterConfigProperty guardrailContentFilterConfigProperty =
   * GuardrailContentFilterConfigProperty.builder()
   * .inputStrength("inputStrength")
   * .outputStrength("outputStrength")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontentfilterconfig.html)
   */
  public interface GuardrailContentFilterConfigProperty {
    /**
     * The strength of the input for the guardrail content filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontentfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontentfilterconfig-inputstrength)
     */
    public fun inputStrength(): String

    /**
     * The output strength of the guardrail content filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontentfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontentfilterconfig-outputstrength)
     */
    public fun outputStrength(): String

    /**
     * The type of the guardrail content filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontentfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontentfilterconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [GuardrailContentFilterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputStrength The strength of the input for the guardrail content filter. 
       */
      public fun inputStrength(inputStrength: String)

      /**
       * @param outputStrength The output strength of the guardrail content filter. 
       */
      public fun outputStrength(outputStrength: String)

      /**
       * @param type The type of the guardrail content filter. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContentFilterConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContentFilterConfigProperty.builder()

      /**
       * @param inputStrength The strength of the input for the guardrail content filter. 
       */
      override fun inputStrength(inputStrength: String) {
        cdkBuilder.inputStrength(inputStrength)
      }

      /**
       * @param outputStrength The output strength of the guardrail content filter. 
       */
      override fun outputStrength(outputStrength: String) {
        cdkBuilder.outputStrength(outputStrength)
      }

      /**
       * @param type The type of the guardrail content filter. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContentFilterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContentFilterConfigProperty,
    ) : CdkObject(cdkObject),
        GuardrailContentFilterConfigProperty {
      /**
       * The strength of the input for the guardrail content filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontentfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontentfilterconfig-inputstrength)
       */
      override fun inputStrength(): String = unwrap(this).getInputStrength()

      /**
       * The output strength of the guardrail content filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontentfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontentfilterconfig-outputstrength)
       */
      override fun outputStrength(): String = unwrap(this).getOutputStrength()

      /**
       * The type of the guardrail content filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontentfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontentfilterconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GuardrailContentFilterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContentFilterConfigProperty):
          GuardrailContentFilterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailContentFilterConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailContentFilterConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContentFilterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContentFilterConfigProperty
    }
  }

  /**
   * A configuration for grounding filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GuardrailContextualGroundingFilterConfigProperty
   * guardrailContextualGroundingFilterConfigProperty =
   * GuardrailContextualGroundingFilterConfigProperty.builder()
   * .threshold(123)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig.html)
   */
  public interface GuardrailContextualGroundingFilterConfigProperty {
    /**
     * The threshold for this filter.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig-threshold)
     */
    public fun threshold(): Number

    /**
     * The type of this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [GuardrailContextualGroundingFilterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param threshold The threshold for this filter. 
       */
      public fun threshold(threshold: Number)

      /**
       * @param type The type of this filter. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContextualGroundingFilterConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContextualGroundingFilterConfigProperty.builder()

      /**
       * @param threshold The threshold for this filter. 
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param type The type of this filter. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContextualGroundingFilterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContextualGroundingFilterConfigProperty,
    ) : CdkObject(cdkObject),
        GuardrailContextualGroundingFilterConfigProperty {
      /**
       * The threshold for this filter.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig-threshold)
       */
      override fun threshold(): Number = unwrap(this).getThreshold()

      /**
       * The type of this filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig.html#cfn-wisdom-aiguardrail-guardrailcontextualgroundingfilterconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GuardrailContextualGroundingFilterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContextualGroundingFilterConfigProperty):
          GuardrailContextualGroundingFilterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailContextualGroundingFilterConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailContextualGroundingFilterConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContextualGroundingFilterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailContextualGroundingFilterConfigProperty
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
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GuardrailManagedWordsConfigProperty guardrailManagedWordsConfigProperty =
   * GuardrailManagedWordsConfigProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailmanagedwordsconfig.html)
   */
  public interface GuardrailManagedWordsConfigProperty {
    /**
     * The type of guardrail managed words.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailmanagedwordsconfig.html#cfn-wisdom-aiguardrail-guardrailmanagedwordsconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [GuardrailManagedWordsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of guardrail managed words. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailManagedWordsConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailManagedWordsConfigProperty.builder()

      /**
       * @param type The type of guardrail managed words. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailManagedWordsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailManagedWordsConfigProperty,
    ) : CdkObject(cdkObject),
        GuardrailManagedWordsConfigProperty {
      /**
       * The type of guardrail managed words.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailmanagedwordsconfig.html#cfn-wisdom-aiguardrail-guardrailmanagedwordsconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GuardrailManagedWordsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailManagedWordsConfigProperty):
          GuardrailManagedWordsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailManagedWordsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailManagedWordsConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailManagedWordsConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailManagedWordsConfigProperty
    }
  }

  /**
   * PII entity configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GuardrailPiiEntityConfigProperty guardrailPiiEntityConfigProperty =
   * GuardrailPiiEntityConfigProperty.builder()
   * .action("action")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailpiientityconfig.html)
   */
  public interface GuardrailPiiEntityConfigProperty {
    /**
     * The action of guardrail PII entity configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailpiientityconfig.html#cfn-wisdom-aiguardrail-guardrailpiientityconfig-action)
     */
    public fun action(): String

    /**
     * The currently supported PII entities.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailpiientityconfig.html#cfn-wisdom-aiguardrail-guardrailpiientityconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [GuardrailPiiEntityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action of guardrail PII entity configuration. 
       */
      public fun action(action: String)

      /**
       * @param type The currently supported PII entities. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailPiiEntityConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailPiiEntityConfigProperty.builder()

      /**
       * @param action The action of guardrail PII entity configuration. 
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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailPiiEntityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailPiiEntityConfigProperty,
    ) : CdkObject(cdkObject),
        GuardrailPiiEntityConfigProperty {
      /**
       * The action of guardrail PII entity configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailpiientityconfig.html#cfn-wisdom-aiguardrail-guardrailpiientityconfig-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The currently supported PII entities.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailpiientityconfig.html#cfn-wisdom-aiguardrail-guardrailpiientityconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardrailPiiEntityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailPiiEntityConfigProperty):
          GuardrailPiiEntityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailPiiEntityConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailPiiEntityConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailPiiEntityConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailPiiEntityConfigProperty
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
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GuardrailRegexConfigProperty guardrailRegexConfigProperty =
   * GuardrailRegexConfigProperty.builder()
   * .action("action")
   * .name("name")
   * .pattern("pattern")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html)
   */
  public interface GuardrailRegexConfigProperty {
    /**
     * The action of the guardrail regex configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-action)
     */
    public fun action(): String

    /**
     * The regex description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A regex configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-name)
     */
    public fun name(): String

    /**
     * The regex pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-pattern)
     */
    public fun pattern(): String

    /**
     * A builder for [GuardrailRegexConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action of the guardrail regex configuration. 
       */
      public fun action(action: String)

      /**
       * @param description The regex description.
       */
      public fun description(description: String)

      /**
       * @param name A regex configuration. 
       */
      public fun name(name: String)

      /**
       * @param pattern The regex pattern. 
       */
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailRegexConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailRegexConfigProperty.builder()

      /**
       * @param action The action of the guardrail regex configuration. 
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
       * @param name A regex configuration. 
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

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailRegexConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailRegexConfigProperty,
    ) : CdkObject(cdkObject),
        GuardrailRegexConfigProperty {
      /**
       * The action of the guardrail regex configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The regex description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A regex configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The regex pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailregexconfig.html#cfn-wisdom-aiguardrail-guardrailregexconfig-pattern)
       */
      override fun pattern(): String = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardrailRegexConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailRegexConfigProperty):
          GuardrailRegexConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailRegexConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailRegexConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailRegexConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailRegexConfigProperty
    }
  }

  /**
   * Topic configuration in topic policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GuardrailTopicConfigProperty guardrailTopicConfigProperty =
   * GuardrailTopicConfigProperty.builder()
   * .definition("definition")
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .examples(List.of("examples"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html)
   */
  public interface GuardrailTopicConfigProperty {
    /**
     * Definition of topic in topic policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-definition)
     */
    public fun definition(): String

    /**
     * Text example in topic policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-examples)
     */
    public fun examples(): List<String> = unwrap(this).getExamples() ?: emptyList()

    /**
     * Name of topic in topic policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-name)
     */
    public fun name(): String

    /**
     * Type of topic in a policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [GuardrailTopicConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param definition Definition of topic in topic policy. 
       */
      public fun definition(definition: String)

      /**
       * @param examples Text example in topic policy.
       */
      public fun examples(examples: List<String>)

      /**
       * @param examples Text example in topic policy.
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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailTopicConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailTopicConfigProperty.builder()

      /**
       * @param definition Definition of topic in topic policy. 
       */
      override fun definition(definition: String) {
        cdkBuilder.definition(definition)
      }

      /**
       * @param examples Text example in topic policy.
       */
      override fun examples(examples: List<String>) {
        cdkBuilder.examples(examples)
      }

      /**
       * @param examples Text example in topic policy.
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

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailTopicConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailTopicConfigProperty,
    ) : CdkObject(cdkObject),
        GuardrailTopicConfigProperty {
      /**
       * Definition of topic in topic policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-definition)
       */
      override fun definition(): String = unwrap(this).getDefinition()

      /**
       * Text example in topic policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-examples)
       */
      override fun examples(): List<String> = unwrap(this).getExamples() ?: emptyList()

      /**
       * Name of topic in topic policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Type of topic in a policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailtopicconfig.html#cfn-wisdom-aiguardrail-guardrailtopicconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardrailTopicConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailTopicConfigProperty):
          GuardrailTopicConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailTopicConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailTopicConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailTopicConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailTopicConfigProperty
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
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GuardrailWordConfigProperty guardrailWordConfigProperty = GuardrailWordConfigProperty.builder()
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailwordconfig.html)
   */
  public interface GuardrailWordConfigProperty {
    /**
     * The custom word text.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailwordconfig.html#cfn-wisdom-aiguardrail-guardrailwordconfig-text)
     */
    public fun text(): String

    /**
     * A builder for [GuardrailWordConfigProperty]
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
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailWordConfigProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailWordConfigProperty.builder()

      /**
       * @param text The custom word text. 
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailWordConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailWordConfigProperty,
    ) : CdkObject(cdkObject),
        GuardrailWordConfigProperty {
      /**
       * The custom word text.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-aiguardrail-guardrailwordconfig.html#cfn-wisdom-aiguardrail-guardrailwordconfig-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GuardrailWordConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailWordConfigProperty):
          GuardrailWordConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GuardrailWordConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GuardrailWordConfigProperty):
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailWordConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAIGuardrail.GuardrailWordConfigProperty
    }
  }
}
