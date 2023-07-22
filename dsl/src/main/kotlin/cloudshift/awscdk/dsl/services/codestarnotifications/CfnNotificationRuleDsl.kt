@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.constructs.Construct

@CdkDslMarker
public class CfnNotificationRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNotificationRule.Builder = CfnNotificationRule.Builder.create(scope,
      id)

  private val _eventTypeIds: MutableList<String> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-createdby)
   * @param createdBy 
   */
  public fun createdBy(createdBy: String) {
    cdkBuilder.createdBy(createdBy)
  }

  /**
   * The level of detail to include in the notifications for this resource.
   *
   * `BASIC` will include only the contents of the event as it would appear in Amazon CloudWatch.
   * `FULL` will include any supplemental information provided by AWS CodeStar Notifications and/or the
   * service for the resource for which the notification is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-detailtype)
   * @param detailType The level of detail to include in the notifications for this resource. 
   */
  public fun detailType(detailType: String) {
    cdkBuilder.detailType(detailType)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeid)
   * @param eventTypeId 
   */
  public fun eventTypeId(eventTypeId: String) {
    cdkBuilder.eventTypeId(eventTypeId)
  }

  /**
   * A list of event types associated with this notification rule.
   *
   * For a complete list of event types and IDs, see [Notification
   * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
   * the *Developer Tools Console User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
   * @param eventTypeIds A list of event types associated with this notification rule. 
   */
  public fun eventTypeIds(vararg eventTypeIds: String) {
    _eventTypeIds.addAll(listOf(*eventTypeIds))
  }

  /**
   * A list of event types associated with this notification rule.
   *
   * For a complete list of event types and IDs, see [Notification
   * concepts](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api) in
   * the *Developer Tools Console User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-eventtypeids)
   * @param eventTypeIds A list of event types associated with this notification rule. 
   */
  public fun eventTypeIds(eventTypeIds: Collection<String>) {
    _eventTypeIds.addAll(eventTypeIds)
  }

  /**
   * The name for the notification rule.
   *
   * Notification rule names must be unique in your AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-name)
   * @param name The name for the notification rule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
   *
   * Supported resources include pipelines in AWS CodePipeline , repositories in AWS CodeCommit ,
   * and build projects in AWS CodeBuild .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
   * @param resource The Amazon Resource Name (ARN) of the resource to associate with the
   * notification rule. 
   */
  public fun resource(resource: String) {
    cdkBuilder.resource(resource)
  }

  /**
   * The status of the notification rule.
   *
   * The default value is `ENABLED` . If the status is set to `DISABLED` , notifications aren't sent
   * for the notification rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-status)
   * @param status The status of the notification rule. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * A list of tags to apply to this notification rule.
   *
   * Key names cannot start with " `aws` ".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-tags)
   * @param tags A list of tags to apply to this notification rule. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targetaddress)
   * @param targetAddress 
   */
  public fun targetAddress(targetAddress: String) {
    cdkBuilder.targetAddress(targetAddress)
  }

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon Simple Notification Service topics and AWS
   * Chatbot clients to associate with the notification rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
   * @param targets A list of Amazon Resource Names (ARNs) of Amazon Simple Notification Service
   * topics and AWS Chatbot clients to associate with the notification rule. 
   */
  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon Simple Notification Service topics and AWS
   * Chatbot clients to associate with the notification rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
   * @param targets A list of Amazon Resource Names (ARNs) of Amazon Simple Notification Service
   * topics and AWS Chatbot clients to associate with the notification rule. 
   */
  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  /**
   * A list of Amazon Resource Names (ARNs) of Amazon Simple Notification Service topics and AWS
   * Chatbot clients to associate with the notification rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-targets)
   * @param targets A list of Amazon Resource Names (ARNs) of Amazon Simple Notification Service
   * topics and AWS Chatbot clients to associate with the notification rule. 
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun build(): CfnNotificationRule {
    if(_eventTypeIds.isNotEmpty()) cdkBuilder.eventTypeIds(_eventTypeIds)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
