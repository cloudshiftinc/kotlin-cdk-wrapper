@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sns.ITopic

/**
 * Manual approval action.
 *
 * Example:
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
@CdkDslMarker
public class ManualApprovalActionDsl {
    private val cdkBuilder: ManualApprovalAction.Builder = ManualApprovalAction.Builder.create()

    private val _notifyEmails: MutableList<String> = mutableListOf()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * Any additional information that you want to include in the notification email message.
     *
     * @param additionalInformation Any additional information that you want to include in the
     *   notification email message.
     */
    public fun additionalInformation(additionalInformation: String) {
        cdkBuilder.additionalInformation(additionalInformation)
    }

    /**
     * URL you want to provide to the reviewer as part of the approval request.
     *
     * Default: - the approval request will not have an external link
     *
     * @param externalEntityLink URL you want to provide to the reviewer as part of the approval
     *   request.
     */
    public fun externalEntityLink(externalEntityLink: String) {
        cdkBuilder.externalEntityLink(externalEntityLink)
    }

    /**
     * Optional SNS topic to send notifications to when an approval is pending.
     *
     * @param notificationTopic Optional SNS topic to send notifications to when an approval is
     *   pending.
     */
    public fun notificationTopic(notificationTopic: ITopic) {
        cdkBuilder.notificationTopic(notificationTopic)
    }

    /**
     * A list of email addresses to subscribe to notifications when this Action is pending approval.
     *
     * If this has been provided, but not `notificationTopic`, a new Topic will be created.
     *
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     *   is pending approval.
     */
    public fun notifyEmails(vararg notifyEmails: String) {
        _notifyEmails.addAll(listOf(*notifyEmails))
    }

    /**
     * A list of email addresses to subscribe to notifications when this Action is pending approval.
     *
     * If this has been provided, but not `notificationTopic`, a new Topic will be created.
     *
     * @param notifyEmails A list of email addresses to subscribe to notifications when this Action
     *   is pending approval.
     */
    public fun notifyEmails(notifyEmails: Collection<String>) {
        _notifyEmails.addAll(notifyEmails)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role (the required permissions for that will be granted
     * automatically) right before executing this Action. This Action will be passed into your
     * `IAction.bind` method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     *
     * @param runOrder The runOrder property for this Action.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names, if any of the
     * action's variables were referenced - otherwise, no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): ManualApprovalAction {
        if (_notifyEmails.isNotEmpty()) cdkBuilder.notifyEmails(_notifyEmails)
        return cdkBuilder.build()
    }
}
