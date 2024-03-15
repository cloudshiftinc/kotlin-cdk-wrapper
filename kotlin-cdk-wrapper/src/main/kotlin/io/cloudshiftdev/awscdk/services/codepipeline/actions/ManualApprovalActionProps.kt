@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties of the `ManualApprovalAction`.
 *
 * Example:
 *
 * ```
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * IStage approveStage = pipeline.addStage(StageOptions.builder().stageName("Approve").build());
 * ManualApprovalAction manualApprovalAction = ManualApprovalAction.Builder.create()
 * .actionName("Approve")
 * .build();
 * approveStage.addAction(manualApprovalAction);
 * IRole role = Role.fromRoleArn(this, "Admin",
 * Arn.format(ArnComponents.builder().service("iam").resource("role").resourceName("Admin").build(),
 * this));
 * manualApprovalAction.grantManualApproval(role);
 * ```
 */
public interface ManualApprovalActionProps : CommonAwsActionProps {
  /**
   * Any additional information that you want to include in the notification email message.
   */
  public fun additionalInformation(): String? = unwrap(this).getAdditionalInformation()

  /**
   * URL you want to provide to the reviewer as part of the approval request.
   *
   * Default: - the approval request will not have an external link
   */
  public fun externalEntityLink(): String? = unwrap(this).getExternalEntityLink()

  /**
   * Optional SNS topic to send notifications to when an approval is pending.
   */
  public fun notificationTopic(): ITopic? = unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  /**
   * A list of email addresses to subscribe to notifications when this Action is pending approval.
   *
   * If this has been provided, but not `notificationTopic`,
   * a new Topic will be created.
   */
  public fun notifyEmails(): List<String> = unwrap(this).getNotifyEmails() ?: emptyList()

  /**
   * A builder for [ManualApprovalActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param additionalInformation Any additional information that you want to include in the
     * notification email message.
     */
    public fun additionalInformation(additionalInformation: String)

    /**
     * @param externalEntityLink URL you want to provide to the reviewer as part of the approval
     * request.
     */
    public fun externalEntityLink(externalEntityLink: String)

    /**
     * @param notificationTopic Optional SNS topic to send notifications to when an approval is
     * pending.
     */
    public fun notificationTopic(notificationTopic: ITopic)

    /**
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval.
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     */
    public fun notifyEmails(notifyEmails: List<String>)

    /**
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval.
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     */
    public fun notifyEmails(vararg notifyEmails: String)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param additionalInformation Any additional information that you want to include in the
     * notification email message.
     */
    override fun additionalInformation(additionalInformation: String) {
      cdkBuilder.additionalInformation(additionalInformation)
    }

    /**
     * @param externalEntityLink URL you want to provide to the reviewer as part of the approval
     * request.
     */
    override fun externalEntityLink(externalEntityLink: String) {
      cdkBuilder.externalEntityLink(externalEntityLink)
    }

    /**
     * @param notificationTopic Optional SNS topic to send notifications to when an approval is
     * pending.
     */
    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    /**
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval.
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     */
    override fun notifyEmails(notifyEmails: List<String>) {
      cdkBuilder.notifyEmails(notifyEmails)
    }

    /**
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval.
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     */
    override fun notifyEmails(vararg notifyEmails: String): Unit =
        notifyEmails(notifyEmails.toList())

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps,
  ) : CdkObject(cdkObject), ManualApprovalActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Any additional information that you want to include in the notification email message.
     */
    override fun additionalInformation(): String? = unwrap(this).getAdditionalInformation()

    /**
     * URL you want to provide to the reviewer as part of the approval request.
     *
     * Default: - the approval request will not have an external link
     */
    override fun externalEntityLink(): String? = unwrap(this).getExternalEntityLink()

    /**
     * Optional SNS topic to send notifications to when an approval is pending.
     */
    override fun notificationTopic(): ITopic? =
        unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

    /**
     * A list of email addresses to subscribe to notifications when this Action is pending approval.
     *
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     */
    override fun notifyEmails(): List<String> = unwrap(this).getNotifyEmails() ?: emptyList()

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManualApprovalActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps):
        ManualApprovalActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManualApprovalActionProps):
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps
  }
}
