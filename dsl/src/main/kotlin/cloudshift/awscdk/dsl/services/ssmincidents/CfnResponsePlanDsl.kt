@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import software.constructs.Construct

/**
 * The `AWS::SSMIncidents::ResponsePlan` resource specifies the details of the response plan that
 * are used when creating an incident.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
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
@CdkDslMarker
public class CfnResponsePlanDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResponsePlan.Builder = CfnResponsePlan.Builder.create(scope, id)

  private val _actions: MutableList<Any> = mutableListOf()

  private val _engagements: MutableList<String> = mutableListOf()

  private val _integrations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The actions that the response plan starts at the beginning of an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
   * @param actions The actions that the response plan starts at the beginning of an incident. 
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * The actions that the response plan starts at the beginning of an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
   * @param actions The actions that the response plan starts at the beginning of an incident. 
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * The actions that the response plan starts at the beginning of an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-actions)
   * @param actions The actions that the response plan starts at the beginning of an incident. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
   * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
   */
  public fun chatChannel(chatChannel: IResolvable) {
    cdkBuilder.chatChannel(chatChannel)
  }

  /**
   * The AWS Chatbot chat channel used for collaboration during an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-chatchannel)
   * @param chatChannel The AWS Chatbot chat channel used for collaboration during an incident. 
   */
  public fun chatChannel(chatChannel: CfnResponsePlan.ChatChannelProperty) {
    cdkBuilder.chatChannel(chatChannel)
  }

  /**
   * The human readable name of the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-displayname)
   * @param displayName The human readable name of the response plan. 
   */
  public fun displayName(displayName: String) {
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
  public fun engagements(vararg engagements: String) {
    _engagements.addAll(listOf(*engagements))
  }

  /**
   * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan
   * engages during an incident.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-engagements)
   * @param engagements The Amazon Resource Name (ARN) for the contacts and escalation plans that
   * the response plan engages during an incident. 
   */
  public fun engagements(engagements: Collection<String>) {
    _engagements.addAll(engagements)
  }

  /**
   * Details used to create an incident when using this response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
   * @param incidentTemplate Details used to create an incident when using this response plan. 
   */
  public fun incidentTemplate(incidentTemplate: IResolvable) {
    cdkBuilder.incidentTemplate(incidentTemplate)
  }

  /**
   * Details used to create an incident when using this response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-incidenttemplate)
   * @param incidentTemplate Details used to create an incident when using this response plan. 
   */
  public fun incidentTemplate(incidentTemplate: CfnResponsePlan.IncidentTemplateProperty) {
    cdkBuilder.incidentTemplate(incidentTemplate)
  }

  /**
   * Information about third-party services integrated into the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
   * @param integrations Information about third-party services integrated into the response plan. 
   */
  public fun integrations(vararg integrations: Any) {
    _integrations.addAll(listOf(*integrations))
  }

  /**
   * Information about third-party services integrated into the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
   * @param integrations Information about third-party services integrated into the response plan. 
   */
  public fun integrations(integrations: Collection<Any>) {
    _integrations.addAll(integrations)
  }

  /**
   * Information about third-party services integrated into the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-integrations)
   * @param integrations Information about third-party services integrated into the response plan. 
   */
  public fun integrations(integrations: IResolvable) {
    cdkBuilder.integrations(integrations)
  }

  /**
   * The name of the response plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html#cfn-ssmincidents-responseplan-name)
   * @param name The name of the response plan. 
   */
  public fun name(name: String) {
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnResponsePlan {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_engagements.isNotEmpty()) cdkBuilder.engagements(_engagements)
    if(_integrations.isNotEmpty()) cdkBuilder.integrations(_integrations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
