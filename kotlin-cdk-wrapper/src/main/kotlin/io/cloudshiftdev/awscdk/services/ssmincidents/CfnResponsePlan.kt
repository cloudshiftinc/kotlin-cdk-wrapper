@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmincidents

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SSMIncidents::ResponsePlan` resource specifies the details of the response plan that
 * are used when creating an incident.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
 * CfnResponsePlan cfnResponsePlan = CfnResponsePlan.Builder.create(this, "MyCfnResponsePlan")
 * .incidentTemplate(IncidentTemplateProperty.builder()
 * .impact(123)
 * .title("title")
 * // the properties below are optional
 * .dedupeString("dedupeString")
 * .incidentTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .notificationTargets(List.of(NotificationTargetItemProperty.builder()
 * .snsTopicArn("snsTopicArn")
 * .build()))
 * .summary("summary")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .actions(List.of(ActionProperty.builder()
 * .ssmAutomation(SsmAutomationProperty.builder()
 * .documentName("documentName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .documentVersion("documentVersion")
 * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
 * .key("key")
 * .value(DynamicSsmParameterValueProperty.builder()
 * .variable("variable")
 * .build())
 * .build()))
 * .parameters(List.of(SsmParameterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .targetAccount("targetAccount")
 * .build())
 * .build()))
 * .chatChannel(ChatChannelProperty.builder()
 * .chatbotSns(List.of("chatbotSns"))
 * .build())
 * .displayName("displayName")
 * .engagements(List.of("engagements"))
 * .integrations(List.of(IntegrationProperty.builder()
 * .pagerDutyConfiguration(PagerDutyConfigurationProperty.builder()
 * .name("name")
 * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
 * .serviceId("serviceId")
 * .build())
 * .secretId("secretId")
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html)
 */
public open class CfnResponsePlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The actions that the response plan starts at the beginning of an incident.
   */
  public open fun actions(): Any? = unwrap(this).getActions()

  /**
   * The actions that the response plan starts at the beginning of an incident.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The actions that the response plan starts at the beginning of an incident.
   */
  public open fun actions(_idx_ac66f0: List<Any>) {
    unwrap(this).setActions(_idx_ac66f0)
  }

  /**
   * The actions that the response plan starts at the beginning of an incident.
   */
  public open fun actions(vararg _idx_ac66f0: Any): Unit = actions(_idx_ac66f0.toList())

  /**
   * The ARN of the response plan.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   */
  public open fun chatChannel(): Any? = unwrap(this).getChatChannel()

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   */
  public open fun chatChannel(`value`: IResolvable) {
    unwrap(this).setChatChannel(`value`.let(IResolvable::unwrap))
  }

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   */
  public open fun chatChannel(`value`: ChatChannelProperty) {
    unwrap(this).setChatChannel(`value`.let(ChatChannelProperty::unwrap))
  }

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88cd7ac7942ddca405d4953ccd62c0cc4ad546aed1a3d473d00286110359f925")
  public open fun chatChannel(`value`: ChatChannelProperty.Builder.() -> Unit): Unit =
      chatChannel(ChatChannelProperty(`value`))

  /**
   * The human readable name of the response plan.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The human readable name of the response plan.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
   * engages during an incident.
   */
  public open fun engagements(): List<String> = unwrap(this).getEngagements() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
   * engages during an incident.
   */
  public open fun engagements(`value`: List<String>) {
    unwrap(this).setEngagements(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
   * engages during an incident.
   */
  public open fun engagements(vararg `value`: String): Unit = engagements(`value`.toList())

  /**
   * Details used to create an incident when using this response plan.
   */
  public open fun incidentTemplate(): Any = unwrap(this).getIncidentTemplate()

  /**
   * Details used to create an incident when using this response plan.
   */
  public open fun incidentTemplate(`value`: IResolvable) {
    unwrap(this).setIncidentTemplate(`value`.let(IResolvable::unwrap))
  }

  /**
   * Details used to create an incident when using this response plan.
   */
  public open fun incidentTemplate(`value`: IncidentTemplateProperty) {
    unwrap(this).setIncidentTemplate(`value`.let(IncidentTemplateProperty::unwrap))
  }

  /**
   * Details used to create an incident when using this response plan.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5b71fccdde07bb833e6bd8323c16f84373e656b0350ca66e6dddabbc8ef44a21")
  public open fun incidentTemplate(`value`: IncidentTemplateProperty.Builder.() -> Unit): Unit =
      incidentTemplate(IncidentTemplateProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Information about third-party services integrated into the response plan.
   */
  public open fun integrations(): Any? = unwrap(this).getIntegrations()

  /**
   * Information about third-party services integrated into the response plan.
   */
  public open fun integrations(`value`: IResolvable) {
    unwrap(this).setIntegrations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about third-party services integrated into the response plan.
   */
  public open fun integrations(_idx_ac66f0: List<Any>) {
    unwrap(this).setIntegrations(_idx_ac66f0)
  }

  /**
   * Information about third-party services integrated into the response plan.
   */
  public open fun integrations(vararg _idx_ac66f0: Any): Unit = integrations(_idx_ac66f0.toList())

  /**
   * The name of the response plan.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the response plan.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmincidents.CfnResponsePlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The actions that the response plan starts at the beginning of an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
     * @param actions The actions that the response plan starts at the beginning of an incident. 
     */
    public fun actions(actions: IResolvable)

    /**
     * The actions that the response plan starts at the beginning of an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
     * @param actions The actions that the response plan starts at the beginning of an incident. 
     */
    public fun actions(actions: List<Any>)

    /**
     * The actions that the response plan starts at the beginning of an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
     * @param actions The actions that the response plan starts at the beginning of an incident. 
     */
    public fun actions(vararg actions: Any)

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
     */
    public fun chatChannel(chatChannel: IResolvable)

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
     */
    public fun chatChannel(chatChannel: ChatChannelProperty)

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6753cc5e0723c78cfbb510065a013e2332c3b5f3fe56d9719df52b9989730a52")
    public fun chatChannel(chatChannel: ChatChannelProperty.Builder.() -> Unit)

    /**
     * The human readable name of the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-displayname)
     * @param displayName The human readable name of the response plan. 
     */
    public fun displayName(displayName: String)

    /**
     * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
     * engages during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-engagements)
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident. 
     */
    public fun engagements(engagements: List<String>)

    /**
     * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
     * engages during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-engagements)
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident. 
     */
    public fun engagements(vararg engagements: String)

    /**
     * Details used to create an incident when using this response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    public fun incidentTemplate(incidentTemplate: IResolvable)

    /**
     * Details used to create an incident when using this response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    public fun incidentTemplate(incidentTemplate: IncidentTemplateProperty)

    /**
     * Details used to create an incident when using this response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0e9785cd11cdaa6f6c209eb5f084c2947c773ffbb1286e908b50e3a0871eb7d")
    public fun incidentTemplate(incidentTemplate: IncidentTemplateProperty.Builder.() -> Unit)

    /**
     * Information about third-party services integrated into the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
     * @param integrations Information about third-party services integrated into the response plan.
     * 
     */
    public fun integrations(integrations: IResolvable)

    /**
     * Information about third-party services integrated into the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
     * @param integrations Information about third-party services integrated into the response plan.
     * 
     */
    public fun integrations(integrations: List<Any>)

    /**
     * Information about third-party services integrated into the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
     * @param integrations Information about third-party services integrated into the response plan.
     * 
     */
    public fun integrations(vararg integrations: Any)

    /**
     * The name of the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-name)
     * @param name The name of the response plan. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.Builder.create(scope, id)

    /**
     * The actions that the response plan starts at the beginning of an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
     * @param actions The actions that the response plan starts at the beginning of an incident. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * The actions that the response plan starts at the beginning of an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
     * @param actions The actions that the response plan starts at the beginning of an incident. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * The actions that the response plan starts at the beginning of an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
     * @param actions The actions that the response plan starts at the beginning of an incident. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
     */
    override fun chatChannel(chatChannel: IResolvable) {
      cdkBuilder.chatChannel(chatChannel.let(IResolvable::unwrap))
    }

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
     */
    override fun chatChannel(chatChannel: ChatChannelProperty) {
      cdkBuilder.chatChannel(chatChannel.let(ChatChannelProperty::unwrap))
    }

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6753cc5e0723c78cfbb510065a013e2332c3b5f3fe56d9719df52b9989730a52")
    override fun chatChannel(chatChannel: ChatChannelProperty.Builder.() -> Unit): Unit =
        chatChannel(ChatChannelProperty(chatChannel))

    /**
     * The human readable name of the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-displayname)
     * @param displayName The human readable name of the response plan. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
     * engages during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-engagements)
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident. 
     */
    override fun engagements(engagements: List<String>) {
      cdkBuilder.engagements(engagements)
    }

    /**
     * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
     * engages during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-engagements)
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident. 
     */
    override fun engagements(vararg engagements: String): Unit = engagements(engagements.toList())

    /**
     * Details used to create an incident when using this response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    override fun incidentTemplate(incidentTemplate: IResolvable) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(IResolvable::unwrap))
    }

    /**
     * Details used to create an incident when using this response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    override fun incidentTemplate(incidentTemplate: IncidentTemplateProperty) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(IncidentTemplateProperty::unwrap))
    }

    /**
     * Details used to create an incident when using this response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0e9785cd11cdaa6f6c209eb5f084c2947c773ffbb1286e908b50e3a0871eb7d")
    override fun incidentTemplate(incidentTemplate: IncidentTemplateProperty.Builder.() -> Unit):
        Unit = incidentTemplate(IncidentTemplateProperty(incidentTemplate))

    /**
     * Information about third-party services integrated into the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
     * @param integrations Information about third-party services integrated into the response plan.
     * 
     */
    override fun integrations(integrations: IResolvable) {
      cdkBuilder.integrations(integrations.let(IResolvable::unwrap))
    }

    /**
     * Information about third-party services integrated into the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
     * @param integrations Information about third-party services integrated into the response plan.
     * 
     */
    override fun integrations(integrations: List<Any>) {
      cdkBuilder.integrations(integrations)
    }

    /**
     * Information about third-party services integrated into the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
     * @param integrations Information about third-party services integrated into the response plan.
     * 
     */
    override fun integrations(vararg integrations: Any): Unit = integrations(integrations.toList())

    /**
     * The name of the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-name)
     * @param name The name of the response plan. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResponsePlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResponsePlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan):
        CfnResponsePlan = CfnResponsePlan(cdkObject)

    internal fun unwrap(wrapped: CfnResponsePlan):
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlan = wrapped.cdkObject
  }

  /**
   * The key-value pair parameters to use when running the Automation runbook.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * SsmParameterProperty ssmParameterProperty = SsmParameterProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmparameter.html)
   */
  public interface SsmParameterProperty {
    /**
     * The key parameter to use when running the Automation runbook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmparameter.html#cfn-ssmincidents-responseplan-ssmparameter-key)
     */
    public fun key(): String

    /**
     * The value parameter to use when running the Automation runbook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmparameter.html#cfn-ssmincidents-responseplan-ssmparameter-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [SsmParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key parameter to use when running the Automation runbook. 
       */
      public fun key(key: String)

      /**
       * @param values The value parameter to use when running the Automation runbook. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The value parameter to use when running the Automation runbook. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty.builder()

      /**
       * @param key The key parameter to use when running the Automation runbook. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param values The value parameter to use when running the Automation runbook. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The value parameter to use when running the Automation runbook. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty,
    ) : CdkObject(cdkObject), SsmParameterProperty {
      /**
       * The key parameter to use when running the Automation runbook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmparameter.html#cfn-ssmincidents-responseplan-ssmparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value parameter to use when running the Automation runbook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmparameter.html#cfn-ssmincidents-responseplan-ssmparameter-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SsmParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty):
          SsmParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmParameterProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmParameterProperty
    }
  }

  /**
   * The Amazon SNS topic that's used by AWS Chatbot to notify the incidents chat channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * NotificationTargetItemProperty notificationTargetItemProperty =
   * NotificationTargetItemProperty.builder()
   * .snsTopicArn("snsTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-notificationtargetitem.html)
   */
  public interface NotificationTargetItemProperty {
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-notificationtargetitem.html#cfn-ssmincidents-responseplan-notificationtargetitem-snstopicarn)
     */
    public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * A builder for [NotificationTargetItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic.
       */
      public fun snsTopicArn(snsTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty.builder()

      /**
       * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic.
       */
      override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty,
    ) : CdkObject(cdkObject), NotificationTargetItemProperty {
      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-notificationtargetitem.html#cfn-ssmincidents-responseplan-notificationtargetitem-snstopicarn)
       */
      override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationTargetItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty):
          NotificationTargetItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationTargetItemProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty
    }
  }

  /**
   * Information about third-party services integrated into a response plan.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * IntegrationProperty integrationProperty = IntegrationProperty.builder()
   * .pagerDutyConfiguration(PagerDutyConfigurationProperty.builder()
   * .name("name")
   * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
   * .serviceId("serviceId")
   * .build())
   * .secretId("secretId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-integration.html)
   */
  public interface IntegrationProperty {
    /**
     * Information about the PagerDuty service where the response plan creates an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-integration.html#cfn-ssmincidents-responseplan-integration-pagerdutyconfiguration)
     */
    public fun pagerDutyConfiguration(): Any

    /**
     * A builder for [IntegrationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pagerDutyConfiguration Information about the PagerDuty service where the response
       * plan creates an incident. 
       */
      public fun pagerDutyConfiguration(pagerDutyConfiguration: IResolvable)

      /**
       * @param pagerDutyConfiguration Information about the PagerDuty service where the response
       * plan creates an incident. 
       */
      public fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty)

      /**
       * @param pagerDutyConfiguration Information about the PagerDuty service where the response
       * plan creates an incident. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b1365cb72066145322131b300cd557680855b99d2eedb46ae39d3281fc00c0a")
      public
          fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty.Builder =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty.builder()

      /**
       * @param pagerDutyConfiguration Information about the PagerDuty service where the response
       * plan creates an incident. 
       */
      override fun pagerDutyConfiguration(pagerDutyConfiguration: IResolvable) {
        cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param pagerDutyConfiguration Information about the PagerDuty service where the response
       * plan creates an incident. 
       */
      override fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty) {
        cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration.let(PagerDutyConfigurationProperty::unwrap))
      }

      /**
       * @param pagerDutyConfiguration Information about the PagerDuty service where the response
       * plan creates an incident. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b1365cb72066145322131b300cd557680855b99d2eedb46ae39d3281fc00c0a")
      override
          fun pagerDutyConfiguration(pagerDutyConfiguration: PagerDutyConfigurationProperty.Builder.() -> Unit):
          Unit = pagerDutyConfiguration(PagerDutyConfigurationProperty(pagerDutyConfiguration))

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty,
    ) : CdkObject(cdkObject), IntegrationProperty {
      /**
       * Information about the PagerDuty service where the response plan creates an incident.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-integration.html#cfn-ssmincidents-responseplan-integration-pagerdutyconfiguration)
       */
      override fun pagerDutyConfiguration(): Any = unwrap(this).getPagerDutyConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty):
          IntegrationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IntegrationProperty
    }
  }

  /**
   * The `SsmAutomation` property type specifies details about the Systems Manager Automation
   * runbook that will be used as the runbook during an incident.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * SsmAutomationProperty ssmAutomationProperty = SsmAutomationProperty.builder()
   * .documentName("documentName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .documentVersion("documentVersion")
   * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
   * .key("key")
   * .value(DynamicSsmParameterValueProperty.builder()
   * .variable("variable")
   * .build())
   * .build()))
   * .parameters(List.of(SsmParameterProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build()))
   * .targetAccount("targetAccount")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html)
   */
  public interface SsmAutomationProperty {
    /**
     * The automation document's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-documentname)
     */
    public fun documentName(): String

    /**
     * The version of the runbook to use when running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-documentversion)
     */
    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    /**
     * The key-value pairs to resolve dynamic parameter values when processing a Systems Manager
     * Automation runbook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-dynamicparameters)
     */
    public fun dynamicParameters(): Any? = unwrap(this).getDynamicParameters()

    /**
     * The key-value pair parameters to use when running the runbook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The Amazon Resource Name (ARN) of the role that the automation document will assume when
     * running commands.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-rolearn)
     */
    public fun roleArn(): String

    /**
     * The account that the automation document will be run in.
     *
     * This can be in either the management account or an application account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-targetaccount)
     */
    public fun targetAccount(): String? = unwrap(this).getTargetAccount()

    /**
     * A builder for [SsmAutomationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentName The automation document's name. 
       */
      public fun documentName(documentName: String)

      /**
       * @param documentVersion The version of the runbook to use when running.
       */
      public fun documentVersion(documentVersion: String)

      /**
       * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
       * processing a Systems Manager Automation runbook.
       */
      public fun dynamicParameters(dynamicParameters: IResolvable)

      /**
       * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
       * processing a Systems Manager Automation runbook.
       */
      public fun dynamicParameters(dynamicParameters: List<Any>)

      /**
       * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
       * processing a Systems Manager Automation runbook.
       */
      public fun dynamicParameters(vararg dynamicParameters: Any)

      /**
       * @param parameters The key-value pair parameters to use when running the runbook.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters The key-value pair parameters to use when running the runbook.
       */
      public fun parameters(parameters: List<Any>)

      /**
       * @param parameters The key-value pair parameters to use when running the runbook.
       */
      public fun parameters(vararg parameters: Any)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that the automation document will
       * assume when running commands. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param targetAccount The account that the automation document will be run in.
       * This can be in either the management account or an application account.
       */
      public fun targetAccount(targetAccount: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty.builder()

      /**
       * @param documentName The automation document's name. 
       */
      override fun documentName(documentName: String) {
        cdkBuilder.documentName(documentName)
      }

      /**
       * @param documentVersion The version of the runbook to use when running.
       */
      override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      /**
       * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
       * processing a Systems Manager Automation runbook.
       */
      override fun dynamicParameters(dynamicParameters: IResolvable) {
        cdkBuilder.dynamicParameters(dynamicParameters.let(IResolvable::unwrap))
      }

      /**
       * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
       * processing a Systems Manager Automation runbook.
       */
      override fun dynamicParameters(dynamicParameters: List<Any>) {
        cdkBuilder.dynamicParameters(dynamicParameters)
      }

      /**
       * @param dynamicParameters The key-value pairs to resolve dynamic parameter values when
       * processing a Systems Manager Automation runbook.
       */
      override fun dynamicParameters(vararg dynamicParameters: Any): Unit =
          dynamicParameters(dynamicParameters.toList())

      /**
       * @param parameters The key-value pair parameters to use when running the runbook.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters The key-value pair parameters to use when running the runbook.
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param parameters The key-value pair parameters to use when running the runbook.
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that the automation document will
       * assume when running commands. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param targetAccount The account that the automation document will be run in.
       * This can be in either the management account or an application account.
       */
      override fun targetAccount(targetAccount: String) {
        cdkBuilder.targetAccount(targetAccount)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty,
    ) : CdkObject(cdkObject), SsmAutomationProperty {
      /**
       * The automation document's name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-documentname)
       */
      override fun documentName(): String = unwrap(this).getDocumentName()

      /**
       * The version of the runbook to use when running.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-documentversion)
       */
      override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

      /**
       * The key-value pairs to resolve dynamic parameter values when processing a Systems Manager
       * Automation runbook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-dynamicparameters)
       */
      override fun dynamicParameters(): Any? = unwrap(this).getDynamicParameters()

      /**
       * The key-value pair parameters to use when running the runbook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The Amazon Resource Name (ARN) of the role that the automation document will assume when
       * running commands.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The account that the automation document will be run in.
       *
       * This can be in either the management account or an application account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html#cfn-ssmincidents-responseplan-ssmautomation-targetaccount)
       */
      override fun targetAccount(): String? = unwrap(this).getTargetAccount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SsmAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty):
          SsmAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmAutomationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty
    }
  }

  /**
   * Details about the PagerDuty service where the response plan creates an incident.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * PagerDutyIncidentConfigurationProperty pagerDutyIncidentConfigurationProperty =
   * PagerDutyIncidentConfigurationProperty.builder()
   * .serviceId("serviceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyincidentconfiguration.html)
   */
  public interface PagerDutyIncidentConfigurationProperty {
    /**
     * The ID of the PagerDuty service that the response plan associates with an incident when it
     * launches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyincidentconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyincidentconfiguration-serviceid)
     */
    public fun serviceId(): String

    /**
     * A builder for [PagerDutyIncidentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serviceId The ID of the PagerDuty service that the response plan associates with an
       * incident when it launches. 
       */
      public fun serviceId(serviceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty.builder()

      /**
       * @param serviceId The ID of the PagerDuty service that the response plan associates with an
       * incident when it launches. 
       */
      override fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty,
    ) : CdkObject(cdkObject), PagerDutyIncidentConfigurationProperty {
      /**
       * The ID of the PagerDuty service that the response plan associates with an incident when it
       * launches.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyincidentconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyincidentconfiguration-serviceid)
       */
      override fun serviceId(): String = unwrap(this).getServiceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PagerDutyIncidentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty):
          PagerDutyIncidentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PagerDutyIncidentConfigurationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyIncidentConfigurationProperty
    }
  }

  /**
   * The `Action` property type specifies the configuration to launch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .ssmAutomation(SsmAutomationProperty.builder()
   * .documentName("documentName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .documentVersion("documentVersion")
   * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
   * .key("key")
   * .value(DynamicSsmParameterValueProperty.builder()
   * .variable("variable")
   * .build())
   * .build()))
   * .parameters(List.of(SsmParameterProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build()))
   * .targetAccount("targetAccount")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-action.html)
   */
  public interface ActionProperty {
    /**
     * Details about the Systems Manager automation document that will be used as a runbook during
     * an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-action.html#cfn-ssmincidents-responseplan-action-ssmautomation)
     */
    public fun ssmAutomation(): Any? = unwrap(this).getSsmAutomation()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ssmAutomation Details about the Systems Manager automation document that will be
       * used as a runbook during an incident.
       */
      public fun ssmAutomation(ssmAutomation: IResolvable)

      /**
       * @param ssmAutomation Details about the Systems Manager automation document that will be
       * used as a runbook during an incident.
       */
      public fun ssmAutomation(ssmAutomation: SsmAutomationProperty)

      /**
       * @param ssmAutomation Details about the Systems Manager automation document that will be
       * used as a runbook during an incident.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09bb1ec3b9413c6175608dd0244bd27f53894d04e2f3c80042da9e1638c9cee")
      public fun ssmAutomation(ssmAutomation: SsmAutomationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty.Builder =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty.builder()

      /**
       * @param ssmAutomation Details about the Systems Manager automation document that will be
       * used as a runbook during an incident.
       */
      override fun ssmAutomation(ssmAutomation: IResolvable) {
        cdkBuilder.ssmAutomation(ssmAutomation.let(IResolvable::unwrap))
      }

      /**
       * @param ssmAutomation Details about the Systems Manager automation document that will be
       * used as a runbook during an incident.
       */
      override fun ssmAutomation(ssmAutomation: SsmAutomationProperty) {
        cdkBuilder.ssmAutomation(ssmAutomation.let(SsmAutomationProperty::unwrap))
      }

      /**
       * @param ssmAutomation Details about the Systems Manager automation document that will be
       * used as a runbook during an incident.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09bb1ec3b9413c6175608dd0244bd27f53894d04e2f3c80042da9e1638c9cee")
      override fun ssmAutomation(ssmAutomation: SsmAutomationProperty.Builder.() -> Unit): Unit =
          ssmAutomation(SsmAutomationProperty(ssmAutomation))

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * Details about the Systems Manager automation document that will be used as a runbook during
       * an incident.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-action.html#cfn-ssmincidents-responseplan-action-ssmautomation)
       */
      override fun ssmAutomation(): Any? = unwrap(this).getSsmAutomation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ActionProperty
    }
  }

  /**
   * When you add a runbook to a response plan, you can specify the parameters for the runbook to
   * use at runtime.
   *
   * Response plans support parameters with both static and dynamic values. For static values, you
   * enter the value when you define the parameter in the response plan. For dynamic values, the system
   * determines the correct parameter value by collecting information from the incident. Incident
   * Manager supports the following dynamic parameters:
   *
   * *Incident ARN*
   *
   * When Incident Manager creates an incident, the system captures the Amazon Resource Name (ARN)
   * of the corresponding incident record and enters it for this parameter in the runbook.
   *
   *
   * This value can only be assigned to parameters of type `String` . If assigned to a parameter of
   * any other type, the runbook fails to run.
   *
   *
   * *Involved resources*
   *
   * When Incident Manager creates an incident, the system captures the ARNs of the resources
   * involved in the incident. These resource ARNs are then assigned to this parameter in the runbook.
   *
   *
   * This value can only be assigned to parameters of type `StringList` . If assigned to a parameter
   * of any other type, the runbook fails to run.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * DynamicSsmParameterProperty dynamicSsmParameterProperty = DynamicSsmParameterProperty.builder()
   * .key("key")
   * .value(DynamicSsmParameterValueProperty.builder()
   * .variable("variable")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparameter.html)
   */
  public interface DynamicSsmParameterProperty {
    /**
     * The key parameter to use when running the Systems Manager Automation runbook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparameter.html#cfn-ssmincidents-responseplan-dynamicssmparameter-key)
     */
    public fun key(): String

    /**
     * The dynamic parameter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparameter.html#cfn-ssmincidents-responseplan-dynamicssmparameter-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [DynamicSsmParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key parameter to use when running the Systems Manager Automation runbook. 
       */
      public fun key(key: String)

      /**
       * @param value The dynamic parameter value. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The dynamic parameter value. 
       */
      public fun `value`(`value`: DynamicSsmParameterValueProperty)

      /**
       * @param value The dynamic parameter value. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc880425978a155fceda534e935c6cd1c33134d904c0d20d072fa38894ebfba")
      public fun `value`(`value`: DynamicSsmParameterValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty.builder()

      /**
       * @param key The key parameter to use when running the Systems Manager Automation runbook. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The dynamic parameter value. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The dynamic parameter value. 
       */
      override fun `value`(`value`: DynamicSsmParameterValueProperty) {
        cdkBuilder.`value`(`value`.let(DynamicSsmParameterValueProperty::unwrap))
      }

      /**
       * @param value The dynamic parameter value. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc880425978a155fceda534e935c6cd1c33134d904c0d20d072fa38894ebfba")
      override fun `value`(`value`: DynamicSsmParameterValueProperty.Builder.() -> Unit): Unit =
          `value`(DynamicSsmParameterValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty,
    ) : CdkObject(cdkObject), DynamicSsmParameterProperty {
      /**
       * The key parameter to use when running the Systems Manager Automation runbook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparameter.html#cfn-ssmincidents-responseplan-dynamicssmparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The dynamic parameter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparameter.html#cfn-ssmincidents-responseplan-dynamicssmparameter-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamicSsmParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty):
          DynamicSsmParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamicSsmParameterProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterProperty
    }
  }

  /**
   * The dynamic parameter value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * DynamicSsmParameterValueProperty dynamicSsmParameterValueProperty =
   * DynamicSsmParameterValueProperty.builder()
   * .variable("variable")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparametervalue.html)
   */
  public interface DynamicSsmParameterValueProperty {
    /**
     * Variable dynamic parameters.
     *
     * A parameter value is determined when an incident is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparametervalue.html#cfn-ssmincidents-responseplan-dynamicssmparametervalue-variable)
     */
    public fun variable(): String? = unwrap(this).getVariable()

    /**
     * A builder for [DynamicSsmParameterValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param variable Variable dynamic parameters.
       * A parameter value is determined when an incident is created.
       */
      public fun variable(variable: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty.builder()

      /**
       * @param variable Variable dynamic parameters.
       * A parameter value is determined when an incident is created.
       */
      override fun variable(variable: String) {
        cdkBuilder.variable(variable)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty,
    ) : CdkObject(cdkObject), DynamicSsmParameterValueProperty {
      /**
       * Variable dynamic parameters.
       *
       * A parameter value is determined when an incident is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparametervalue.html#cfn-ssmincidents-responseplan-dynamicssmparametervalue-variable)
       */
      override fun variable(): String? = unwrap(this).getVariable()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamicSsmParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty):
          DynamicSsmParameterValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamicSsmParameterValueProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.DynamicSsmParameterValueProperty
    }
  }

  /**
   * The `IncidentTemplate` property type specifies details used to create an incident when using
   * this response plan.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * IncidentTemplateProperty incidentTemplateProperty = IncidentTemplateProperty.builder()
   * .impact(123)
   * .title("title")
   * // the properties below are optional
   * .dedupeString("dedupeString")
   * .incidentTags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .notificationTargets(List.of(NotificationTargetItemProperty.builder()
   * .snsTopicArn("snsTopicArn")
   * .build()))
   * .summary("summary")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html)
   */
  public interface IncidentTemplateProperty {
    /**
     * Used to create only one incident record for an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-dedupestring)
     */
    public fun dedupeString(): String? = unwrap(this).getDedupeString()

    /**
     * Defines the impact to the customers. Providing an impact overwrites the impact provided by a
     * response plan.
     *
     * **Possible impacts:** - `1` - Critical impact, this typically relates to full application
     * failure that impacts many to all customers.
     *
     * * `2` - High impact, partial application failure with impact to many customers.
     * * `3` - Medium impact, the application is providing reduced service to customers.
     * * `4` - Low impact, customer might aren't impacted by the problem yet.
     * * `5` - No impact, customers aren't currently impacted but urgent action is needed to avoid
     * impact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-impact)
     */
    public fun impact(): Number

    /**
     * Tags to assign to the template.
     *
     * When the `StartIncident` API action is called, Incident Manager assigns the tags specified in
     * the template to the incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-incidenttags)
     */
    public fun incidentTags(): Any? = unwrap(this).getIncidentTags()

    /**
     * The Amazon Simple Notification Service ( Amazon SNS ) targets that AWS Chatbot uses to notify
     * the chat channel of updates to an incident.
     *
     * You can also make updates to the incident through the chat channel using the Amazon SNS
     * topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-notificationtargets)
     */
    public fun notificationTargets(): Any? = unwrap(this).getNotificationTargets()

    /**
     * The summary describes what has happened during the incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-summary)
     */
    public fun summary(): String? = unwrap(this).getSummary()

    /**
     * The title of the incident is a brief and easily recognizable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-title)
     */
    public fun title(): String

    /**
     * A builder for [IncidentTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dedupeString Used to create only one incident record for an incident.
       */
      public fun dedupeString(dedupeString: String)

      /**
       * @param impact Defines the impact to the customers. Providing an impact overwrites the
       * impact provided by a response plan. 
       * **Possible impacts:** - `1` - Critical impact, this typically relates to full application
       * failure that impacts many to all customers.
       *
       * * `2` - High impact, partial application failure with impact to many customers.
       * * `3` - Medium impact, the application is providing reduced service to customers.
       * * `4` - Low impact, customer might aren't impacted by the problem yet.
       * * `5` - No impact, customers aren't currently impacted but urgent action is needed to avoid
       * impact.
       */
      public fun impact(impact: Number)

      /**
       * @param incidentTags Tags to assign to the template.
       * When the `StartIncident` API action is called, Incident Manager assigns the tags specified
       * in the template to the incident.
       */
      public fun incidentTags(incidentTags: IResolvable)

      /**
       * @param incidentTags Tags to assign to the template.
       * When the `StartIncident` API action is called, Incident Manager assigns the tags specified
       * in the template to the incident.
       */
      public fun incidentTags(incidentTags: List<Any>)

      /**
       * @param incidentTags Tags to assign to the template.
       * When the `StartIncident` API action is called, Incident Manager assigns the tags specified
       * in the template to the incident.
       */
      public fun incidentTags(vararg incidentTags: Any)

      /**
       * @param notificationTargets The Amazon Simple Notification Service ( Amazon SNS ) targets
       * that AWS Chatbot uses to notify the chat channel of updates to an incident.
       * You can also make updates to the incident through the chat channel using the Amazon SNS
       * topics.
       */
      public fun notificationTargets(notificationTargets: IResolvable)

      /**
       * @param notificationTargets The Amazon Simple Notification Service ( Amazon SNS ) targets
       * that AWS Chatbot uses to notify the chat channel of updates to an incident.
       * You can also make updates to the incident through the chat channel using the Amazon SNS
       * topics.
       */
      public fun notificationTargets(notificationTargets: List<Any>)

      /**
       * @param notificationTargets The Amazon Simple Notification Service ( Amazon SNS ) targets
       * that AWS Chatbot uses to notify the chat channel of updates to an incident.
       * You can also make updates to the incident through the chat channel using the Amazon SNS
       * topics.
       */
      public fun notificationTargets(vararg notificationTargets: Any)

      /**
       * @param summary The summary describes what has happened during the incident.
       */
      public fun summary(summary: String)

      /**
       * @param title The title of the incident is a brief and easily recognizable. 
       */
      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty.builder()

      /**
       * @param dedupeString Used to create only one incident record for an incident.
       */
      override fun dedupeString(dedupeString: String) {
        cdkBuilder.dedupeString(dedupeString)
      }

      /**
       * @param impact Defines the impact to the customers. Providing an impact overwrites the
       * impact provided by a response plan. 
       * **Possible impacts:** - `1` - Critical impact, this typically relates to full application
       * failure that impacts many to all customers.
       *
       * * `2` - High impact, partial application failure with impact to many customers.
       * * `3` - Medium impact, the application is providing reduced service to customers.
       * * `4` - Low impact, customer might aren't impacted by the problem yet.
       * * `5` - No impact, customers aren't currently impacted but urgent action is needed to avoid
       * impact.
       */
      override fun impact(impact: Number) {
        cdkBuilder.impact(impact)
      }

      /**
       * @param incidentTags Tags to assign to the template.
       * When the `StartIncident` API action is called, Incident Manager assigns the tags specified
       * in the template to the incident.
       */
      override fun incidentTags(incidentTags: IResolvable) {
        cdkBuilder.incidentTags(incidentTags.let(IResolvable::unwrap))
      }

      /**
       * @param incidentTags Tags to assign to the template.
       * When the `StartIncident` API action is called, Incident Manager assigns the tags specified
       * in the template to the incident.
       */
      override fun incidentTags(incidentTags: List<Any>) {
        cdkBuilder.incidentTags(incidentTags)
      }

      /**
       * @param incidentTags Tags to assign to the template.
       * When the `StartIncident` API action is called, Incident Manager assigns the tags specified
       * in the template to the incident.
       */
      override fun incidentTags(vararg incidentTags: Any): Unit =
          incidentTags(incidentTags.toList())

      /**
       * @param notificationTargets The Amazon Simple Notification Service ( Amazon SNS ) targets
       * that AWS Chatbot uses to notify the chat channel of updates to an incident.
       * You can also make updates to the incident through the chat channel using the Amazon SNS
       * topics.
       */
      override fun notificationTargets(notificationTargets: IResolvable) {
        cdkBuilder.notificationTargets(notificationTargets.let(IResolvable::unwrap))
      }

      /**
       * @param notificationTargets The Amazon Simple Notification Service ( Amazon SNS ) targets
       * that AWS Chatbot uses to notify the chat channel of updates to an incident.
       * You can also make updates to the incident through the chat channel using the Amazon SNS
       * topics.
       */
      override fun notificationTargets(notificationTargets: List<Any>) {
        cdkBuilder.notificationTargets(notificationTargets)
      }

      /**
       * @param notificationTargets The Amazon Simple Notification Service ( Amazon SNS ) targets
       * that AWS Chatbot uses to notify the chat channel of updates to an incident.
       * You can also make updates to the incident through the chat channel using the Amazon SNS
       * topics.
       */
      override fun notificationTargets(vararg notificationTargets: Any): Unit =
          notificationTargets(notificationTargets.toList())

      /**
       * @param summary The summary describes what has happened during the incident.
       */
      override fun summary(summary: String) {
        cdkBuilder.summary(summary)
      }

      /**
       * @param title The title of the incident is a brief and easily recognizable. 
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty,
    ) : CdkObject(cdkObject), IncidentTemplateProperty {
      /**
       * Used to create only one incident record for an incident.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-dedupestring)
       */
      override fun dedupeString(): String? = unwrap(this).getDedupeString()

      /**
       * Defines the impact to the customers. Providing an impact overwrites the impact provided by
       * a response plan.
       *
       * **Possible impacts:** - `1` - Critical impact, this typically relates to full application
       * failure that impacts many to all customers.
       *
       * * `2` - High impact, partial application failure with impact to many customers.
       * * `3` - Medium impact, the application is providing reduced service to customers.
       * * `4` - Low impact, customer might aren't impacted by the problem yet.
       * * `5` - No impact, customers aren't currently impacted but urgent action is needed to avoid
       * impact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-impact)
       */
      override fun impact(): Number = unwrap(this).getImpact()

      /**
       * Tags to assign to the template.
       *
       * When the `StartIncident` API action is called, Incident Manager assigns the tags specified
       * in the template to the incident.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-incidenttags)
       */
      override fun incidentTags(): Any? = unwrap(this).getIncidentTags()

      /**
       * The Amazon Simple Notification Service ( Amazon SNS ) targets that AWS Chatbot uses to
       * notify the chat channel of updates to an incident.
       *
       * You can also make updates to the incident through the chat channel using the Amazon SNS
       * topics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-notificationtargets)
       */
      override fun notificationTargets(): Any? = unwrap(this).getNotificationTargets()

      /**
       * The summary describes what has happened during the incident.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-summary)
       */
      override fun summary(): String? = unwrap(this).getSummary()

      /**
       * The title of the incident is a brief and easily recognizable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html#cfn-ssmincidents-responseplan-incidenttemplate-title)
       */
      override fun title(): String = unwrap(this).getTitle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncidentTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty):
          IncidentTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncidentTemplateProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty
    }
  }

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * ChatChannelProperty chatChannelProperty = ChatChannelProperty.builder()
   * .chatbotSns(List.of("chatbotSns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-chatchannel.html)
   */
  public interface ChatChannelProperty {
    /**
     * The Amazon SNS targets that AWS Chatbot uses to notify the chat channel of updates to an
     * incident.
     *
     * You can also make updates to the incident through the chat channel by using the Amazon SNS
     * topics
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-chatchannel.html#cfn-ssmincidents-responseplan-chatchannel-chatbotsns)
     */
    public fun chatbotSns(): List<String> = unwrap(this).getChatbotSns() ?: emptyList()

    /**
     * A builder for [ChatChannelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chatbotSns The Amazon SNS targets that AWS Chatbot uses to notify the chat channel
       * of updates to an incident.
       * You can also make updates to the incident through the chat channel by using the Amazon SNS
       * topics
       */
      public fun chatbotSns(chatbotSns: List<String>)

      /**
       * @param chatbotSns The Amazon SNS targets that AWS Chatbot uses to notify the chat channel
       * of updates to an incident.
       * You can also make updates to the incident through the chat channel by using the Amazon SNS
       * topics
       */
      public fun chatbotSns(vararg chatbotSns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty.Builder =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty.builder()

      /**
       * @param chatbotSns The Amazon SNS targets that AWS Chatbot uses to notify the chat channel
       * of updates to an incident.
       * You can also make updates to the incident through the chat channel by using the Amazon SNS
       * topics
       */
      override fun chatbotSns(chatbotSns: List<String>) {
        cdkBuilder.chatbotSns(chatbotSns)
      }

      /**
       * @param chatbotSns The Amazon SNS targets that AWS Chatbot uses to notify the chat channel
       * of updates to an incident.
       * You can also make updates to the incident through the chat channel by using the Amazon SNS
       * topics
       */
      override fun chatbotSns(vararg chatbotSns: String): Unit = chatbotSns(chatbotSns.toList())

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty,
    ) : CdkObject(cdkObject), ChatChannelProperty {
      /**
       * The Amazon SNS targets that AWS Chatbot uses to notify the chat channel of updates to an
       * incident.
       *
       * You can also make updates to the incident through the chat channel by using the Amazon SNS
       * topics
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-chatchannel.html#cfn-ssmincidents-responseplan-chatchannel-chatbotsns)
       */
      override fun chatbotSns(): List<String> = unwrap(this).getChatbotSns() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChatChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty):
          ChatChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChatChannelProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty
    }
  }

  /**
   * Details about the PagerDuty configuration for a response plan.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
   * PagerDutyConfigurationProperty pagerDutyConfigurationProperty =
   * PagerDutyConfigurationProperty.builder()
   * .name("name")
   * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
   * .serviceId("serviceId")
   * .build())
   * .secretId("secretId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html)
   */
  public interface PagerDutyConfigurationProperty {
    /**
     * The name of the PagerDuty configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyconfiguration-name)
     */
    public fun name(): String

    /**
     * Details about the PagerDuty service associated with the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyconfiguration-pagerdutyincidentconfiguration)
     */
    public fun pagerDutyIncidentConfiguration(): Any

    /**
     * The ID of the AWS Secrets Manager secret that stores your PagerDuty key, either a General
     * Access REST API Key or User Token REST API Key, and other user credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyconfiguration-secretid)
     */
    public fun secretId(): String

    /**
     * A builder for [PagerDutyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the PagerDuty configuration. 
       */
      public fun name(name: String)

      /**
       * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with
       * the configuration. 
       */
      public fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: IResolvable)

      /**
       * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with
       * the configuration. 
       */
      public
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty)

      /**
       * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with
       * the configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2f87025500874ad7b8eb420748449070320a8ecd81dd2015b2b6b1f7c14e0a3")
      public
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param secretId The ID of the AWS Secrets Manager secret that stores your PagerDuty key,
       * either a General Access REST API Key or User Token REST API Key, and other user credentials. 
       */
      public fun secretId(secretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty.builder()

      /**
       * @param name The name of the PagerDuty configuration. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with
       * the configuration. 
       */
      override fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: IResolvable) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with
       * the configuration. 
       */
      override
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty) {
        cdkBuilder.pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration.let(PagerDutyIncidentConfigurationProperty::unwrap))
      }

      /**
       * @param pagerDutyIncidentConfiguration Details about the PagerDuty service associated with
       * the configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a2f87025500874ad7b8eb420748449070320a8ecd81dd2015b2b6b1f7c14e0a3")
      override
          fun pagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration: PagerDutyIncidentConfigurationProperty.Builder.() -> Unit):
          Unit =
          pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty(pagerDutyIncidentConfiguration))

      /**
       * @param secretId The ID of the AWS Secrets Manager secret that stores your PagerDuty key,
       * either a General Access REST API Key or User Token REST API Key, and other user credentials. 
       */
      override fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
      }

      public fun build():
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty,
    ) : CdkObject(cdkObject), PagerDutyConfigurationProperty {
      /**
       * The name of the PagerDuty configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Details about the PagerDuty service associated with the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyconfiguration-pagerdutyincidentconfiguration)
       */
      override fun pagerDutyIncidentConfiguration(): Any =
          unwrap(this).getPagerDutyIncidentConfiguration()

      /**
       * The ID of the AWS Secrets Manager secret that stores your PagerDuty key, either a General
       * Access REST API Key or User Token REST API Key, and other user credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html#cfn-ssmincidents-responseplan-pagerdutyconfiguration-secretid)
       */
      override fun secretId(): String = unwrap(this).getSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PagerDutyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty):
          PagerDutyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PagerDutyConfigurationProperty):
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.PagerDutyConfigurationProperty
    }
  }
}
