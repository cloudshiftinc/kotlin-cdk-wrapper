@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Manual approval action.
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
public open class ManualApprovalAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction,
) : Action(cdkObject) {
  public constructor(props: ManualApprovalActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction(props.let(ManualApprovalActionProps.Companion::unwrap))
  )

  public constructor(props: ManualApprovalActionProps.Builder.() -> Unit) :
      this(ManualApprovalActionProps(props)
  )

  /**
   * grant the provided principal the permissions to approve or reject this manual approval action.
   *
   * For more info see:
   * https://docs.aws.amazon.com/codepipeline/latest/userguide/approvals-iam-permissions.html
   *
   * @param grantable the grantable to attach the permissions to. 
   */
  public open fun grantManualApproval(grantable: IGrantable) {
    unwrap(this).grantManualApproval(grantable.let(IGrantable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun notificationTopic(): ITopic? =
      unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.ManualApprovalAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * Any additional information that you want to include in the notification email message.
     *
     * @param additionalInformation Any additional information that you want to include in the
     * notification email message. 
     */
    public fun additionalInformation(additionalInformation: String)

    /**
     * URL you want to provide to the reviewer as part of the approval request.
     *
     * Default: - the approval request will not have an external link
     *
     * @param externalEntityLink URL you want to provide to the reviewer as part of the approval
     * request. 
     */
    public fun externalEntityLink(externalEntityLink: String)

    /**
     * Optional SNS topic to send notifications to when an approval is pending.
     *
     * @param notificationTopic Optional SNS topic to send notifications to when an approval is
     * pending. 
     */
    public fun notificationTopic(notificationTopic: ITopic)

    /**
     * A list of email addresses to subscribe to notifications when this Action is pending approval.
     *
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     *
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval. 
     */
    public fun notifyEmails(notifyEmails: List<String>)

    /**
     * A list of email addresses to subscribe to notifications when this Action is pending approval.
     *
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     *
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval. 
     */
    public fun notifyEmails(vararg notifyEmails: String)

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * Any additional information that you want to include in the notification email message.
     *
     * @param additionalInformation Any additional information that you want to include in the
     * notification email message. 
     */
    override fun additionalInformation(additionalInformation: String) {
      cdkBuilder.additionalInformation(additionalInformation)
    }

    /**
     * URL you want to provide to the reviewer as part of the approval request.
     *
     * Default: - the approval request will not have an external link
     *
     * @param externalEntityLink URL you want to provide to the reviewer as part of the approval
     * request. 
     */
    override fun externalEntityLink(externalEntityLink: String) {
      cdkBuilder.externalEntityLink(externalEntityLink)
    }

    /**
     * Optional SNS topic to send notifications to when an approval is pending.
     *
     * @param notificationTopic Optional SNS topic to send notifications to when an approval is
     * pending. 
     */
    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic.Companion::unwrap))
    }

    /**
     * A list of email addresses to subscribe to notifications when this Action is pending approval.
     *
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     *
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval. 
     */
    override fun notifyEmails(notifyEmails: List<String>) {
      cdkBuilder.notifyEmails(notifyEmails)
    }

    /**
     * A list of email addresses to subscribe to notifications when this Action is pending approval.
     *
     * If this has been provided, but not `notificationTopic`,
     * a new Topic will be created.
     *
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     * is pending approval. 
     */
    override fun notifyEmails(vararg notifyEmails: String): Unit =
        notifyEmails(notifyEmails.toList())

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManualApprovalAction {
      val builderImpl = BuilderImpl()
      return ManualApprovalAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction):
        ManualApprovalAction = ManualApprovalAction(cdkObject)

    internal fun unwrap(wrapped: ManualApprovalAction):
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction
  }
}
