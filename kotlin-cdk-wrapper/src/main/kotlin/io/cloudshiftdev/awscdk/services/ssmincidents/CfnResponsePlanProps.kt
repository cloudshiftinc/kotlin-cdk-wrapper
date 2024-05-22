@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmincidents

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
 * Properties for defining a `CfnResponsePlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
 * CfnResponsePlanProps cfnResponsePlanProps = CfnResponsePlanProps.builder()
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
public interface CfnResponsePlanProps {
  /**
   * The actions that the response plan starts at the beginning of an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
   */
  public fun actions(): Any? = unwrap(this).getActions()

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
   */
  public fun chatChannel(): Any? = unwrap(this).getChatChannel()

  /**
   * The human readable name of the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
   * engages during an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-engagements)
   */
  public fun engagements(): List<String> = unwrap(this).getEngagements() ?: emptyList()

  /**
   * Details used to create an incident when using this response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
   */
  public fun incidentTemplate(): Any

  /**
   * Information about third-party services integrated into the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
   */
  public fun integrations(): Any? = unwrap(this).getIntegrations()

  /**
   * The name of the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResponsePlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions that the response plan starts at the beginning of an incident.
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions The actions that the response plan starts at the beginning of an incident.
     */
    public fun actions(actions: List<Any>)

    /**
     * @param actions The actions that the response plan starts at the beginning of an incident.
     */
    public fun actions(vararg actions: Any)

    /**
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident.
     */
    public fun chatChannel(chatChannel: IResolvable)

    /**
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident.
     */
    public fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty)

    /**
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43097ab621c7f3f9b4e2fec17b4f12692ff9cfe2bed21f3ca63a5c5d8cc11cee")
    public fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty.Builder.() -> Unit)

    /**
     * @param displayName The human readable name of the response plan.
     */
    public fun displayName(displayName: String)

    /**
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident.
     */
    public fun engagements(engagements: List<String>)

    /**
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident.
     */
    public fun engagements(vararg engagements: String)

    /**
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    public fun incidentTemplate(incidentTemplate: IResolvable)

    /**
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    public fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty)

    /**
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("006d39beeb2eb0a5d337c8bc23a7b7d3289c0923de7b058ff5469ce14bf743b4")
    public
        fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty.Builder.() -> Unit)

    /**
     * @param integrations Information about third-party services integrated into the response plan.
     */
    public fun integrations(integrations: IResolvable)

    /**
     * @param integrations Information about third-party services integrated into the response plan.
     */
    public fun integrations(integrations: List<Any>)

    /**
     * @param integrations Information about third-party services integrated into the response plan.
     */
    public fun integrations(vararg integrations: Any)

    /**
     * @param name The name of the response plan. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps.builder()

    /**
     * @param actions The actions that the response plan starts at the beginning of an incident.
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param actions The actions that the response plan starts at the beginning of an incident.
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param actions The actions that the response plan starts at the beginning of an incident.
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident.
     */
    override fun chatChannel(chatChannel: IResolvable) {
      cdkBuilder.chatChannel(chatChannel.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident.
     */
    override fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty) {
      cdkBuilder.chatChannel(chatChannel.let(CfnResponsePlan.ChatChannelProperty.Companion::unwrap))
    }

    /**
     * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43097ab621c7f3f9b4e2fec17b4f12692ff9cfe2bed21f3ca63a5c5d8cc11cee")
    override fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty.Builder.() -> Unit):
        Unit = chatChannel(CfnResponsePlan.ChatChannelProperty(chatChannel))

    /**
     * @param displayName The human readable name of the response plan.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident.
     */
    override fun engagements(engagements: List<String>) {
      cdkBuilder.engagements(engagements)
    }

    /**
     * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
     * the response plan engages during an incident.
     */
    override fun engagements(vararg engagements: String): Unit = engagements(engagements.toList())

    /**
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    override fun incidentTemplate(incidentTemplate: IResolvable) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    override fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty) {
      cdkBuilder.incidentTemplate(incidentTemplate.let(CfnResponsePlan.IncidentTemplateProperty.Companion::unwrap))
    }

    /**
     * @param incidentTemplate Details used to create an incident when using this response plan. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("006d39beeb2eb0a5d337c8bc23a7b7d3289c0923de7b058ff5469ce14bf743b4")
    override
        fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty.Builder.() -> Unit):
        Unit = incidentTemplate(CfnResponsePlan.IncidentTemplateProperty(incidentTemplate))

    /**
     * @param integrations Information about third-party services integrated into the response plan.
     */
    override fun integrations(integrations: IResolvable) {
      cdkBuilder.integrations(integrations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param integrations Information about third-party services integrated into the response plan.
     */
    override fun integrations(integrations: List<Any>) {
      cdkBuilder.integrations(integrations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param integrations Information about third-party services integrated into the response plan.
     */
    override fun integrations(vararg integrations: Any): Unit = integrations(integrations.toList())

    /**
     * @param name The name of the response plan. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps,
  ) : CdkObject(cdkObject), CfnResponsePlanProps {
    /**
     * The actions that the response plan starts at the beginning of an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
     */
    override fun actions(): Any? = unwrap(this).getActions()

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
     */
    override fun chatChannel(): Any? = unwrap(this).getChatChannel()

    /**
     * The human readable name of the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
     * engages during an incident.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-engagements)
     */
    override fun engagements(): List<String> = unwrap(this).getEngagements() ?: emptyList()

    /**
     * Details used to create an incident when using this response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
     */
    override fun incidentTemplate(): Any = unwrap(this).getIncidentTemplate()

    /**
     * Information about third-party services integrated into the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
     */
    override fun integrations(): Any? = unwrap(this).getIntegrations()

    /**
     * The name of the response plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResponsePlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps):
        CfnResponsePlanProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResponsePlanProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResponsePlanProps):
        software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps
  }
}
