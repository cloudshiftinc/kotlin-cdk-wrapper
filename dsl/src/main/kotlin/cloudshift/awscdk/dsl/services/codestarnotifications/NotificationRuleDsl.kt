@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codestarnotifications.DetailType
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.codestarnotifications.NotificationRule
import software.constructs.Construct

@CdkDslMarker
public class NotificationRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NotificationRule.Builder = NotificationRule.Builder.create(scope, id)

  private val _events: MutableList<String> = mutableListOf()

  private val _targets: MutableList<INotificationRuleTarget> = mutableListOf()

  /**
   * The level of detail to include in the notifications for this resource.
   *
   * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
   * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
   * the service for the resource for which the notification is created.
   *
   * Default: DetailType.FULL
   *
   * @param detailType The level of detail to include in the notifications for this resource. 
   */
  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  /**
   * The status of the notification rule.
   *
   * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
   *
   * Default: true
   *
   * @param enabled The status of the notification rule. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * A list of event types associated with this notification rule.
   *
   * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
   * Console User Guide.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
   * @param events A list of event types associated with this notification rule. 
   */
  public fun events(vararg events: String) {
    _events.addAll(listOf(*events))
  }

  /**
   * A list of event types associated with this notification rule.
   *
   * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
   * Console User Guide.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
   * @param events A list of event types associated with this notification rule. 
   */
  public fun events(events: Collection<String>) {
    _events.addAll(events)
  }

  /**
   * The name for the notification rule.
   *
   * Notification rule names must be unique in your AWS account.
   *
   * Default: - generated from the `id`
   *
   * @param notificationRuleName The name for the notification rule. 
   */
  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
   *
   * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
   * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
   * @param source The Amazon Resource Name (ARN) of the resource to associate with the notification
   * rule. 
   */
  public fun source(source: INotificationRuleSource) {
    cdkBuilder.source(source)
  }

  /**
   * The targets to register for the notification destination.
   *
   * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
   *
   * @param targets The targets to register for the notification destination. 
   */
  public fun targets(vararg targets: INotificationRuleTarget) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * The targets to register for the notification destination.
   *
   * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
   *
   * @param targets The targets to register for the notification destination. 
   */
  public fun targets(targets: Collection<INotificationRuleTarget>) {
    _targets.addAll(targets)
  }

  public fun build(): NotificationRule {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
