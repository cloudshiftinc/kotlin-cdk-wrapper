@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class ManualApprovalActionPropsDsl {
  private val cdkBuilder: ManualApprovalActionProps.Builder = ManualApprovalActionProps.builder()

  private val _notifyEmails: MutableList<String> = mutableListOf()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param additionalInformation Any additional information that you want to include in the
   * notification email message.
   */
  public fun additionalInformation(additionalInformation: String) {
    cdkBuilder.additionalInformation(additionalInformation)
  }

  /**
   * @param externalEntityLink URL you want to provide to the reviewer as part of the approval
   * request.
   */
  public fun externalEntityLink(externalEntityLink: String) {
    cdkBuilder.externalEntityLink(externalEntityLink)
  }

  /**
   * @param notificationTopic Optional SNS topic to send notifications to when an approval is
   * pending.
   */
  public fun notificationTopic(notificationTopic: ITopic) {
    cdkBuilder.notificationTopic(notificationTopic)
  }

  /**
   * @param notifyEmails A list of email addresses to subscribe to notifications when this Action is
   * pending approval.
   * If this has been provided, but not `notificationTopic`,
   * a new Topic will be created.
   */
  public fun notifyEmails(vararg notifyEmails: String) {
    _notifyEmails.addAll(listOf(*notifyEmails))
  }

  /**
   * @param notifyEmails A list of email addresses to subscribe to notifications when this Action is
   * pending approval.
   * If this has been provided, but not `notificationTopic`,
   * a new Topic will be created.
   */
  public fun notifyEmails(notifyEmails: Collection<String>) {
    _notifyEmails.addAll(notifyEmails)
  }

  /**
   * @param role The Role in which context's this Action will be executing in.
   * The Pipeline's Role will assume this Role
   * (the required permissions for that will be granted automatically)
   * right before executing this Action.
   * This Action will be passed into your `IAction.bind`
   * method in the `ActionBindOptions.role` property.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): ManualApprovalActionProps {
    if(_notifyEmails.isNotEmpty()) cdkBuilder.notifyEmails(_notifyEmails)
    return cdkBuilder.build()
  }
}
