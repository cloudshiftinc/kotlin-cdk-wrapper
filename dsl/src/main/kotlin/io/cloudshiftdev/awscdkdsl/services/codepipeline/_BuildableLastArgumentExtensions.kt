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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.services.codestarnotifications.NotificationRuleOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.events.OnEventOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.events.RulePropsDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.Action
import software.amazon.awscdk.services.codepipeline.ActionConfig
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.amazon.awscdk.services.codepipeline.IAction
import software.amazon.awscdk.services.codepipeline.IPipeline
import software.amazon.awscdk.services.codepipeline.IStage
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.Trigger
import software.amazon.awscdk.services.codepipeline.Variable
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.events.Rule
import software.constructs.Construct

/**
 * The callback invoked when this Action is added to a Pipeline.
 *
 * @param scope
 * @param stage
 * @param options
 */
public inline fun Action.bind(
    scope: Construct,
    stage: IStage,
    block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
    val builder = ActionBindOptionsDsl()
    builder.apply(block)
    return bind(scope, stage, builder.build())
}

/**
 * Creates an Event that will be triggered whenever the state of this Action changes.
 *
 * @param name
 * @param target
 * @param options
 */
public inline fun Action.onStateChange(
    name: String,
    target: IRuleTarget?,
    block: RulePropsDsl.() -> Unit = {},
): Rule {
    val builder = RulePropsDsl()
    builder.apply(block)
    return onStateChange(name, target, builder.build())
}

/** The details of the input artifact for the action, such as its commit ID. */
public inline fun CfnCustomActionType.setInputArtifactDetails(
    block: CfnCustomActionTypeArtifactDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCustomActionTypeArtifactDetailsPropertyDsl()
    builder.apply(block)
    return setInputArtifactDetails(builder.build())
}

/** The details of the output artifact of the action, such as its commit ID. */
public inline fun CfnCustomActionType.setOutputArtifactDetails(
    block: CfnCustomActionTypeArtifactDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCustomActionTypeArtifactDetailsPropertyDsl()
    builder.apply(block)
    return setOutputArtifactDetails(builder.build())
}

/** URLs that provide users information about this custom action. */
public inline fun CfnCustomActionType.setSettings(
    block: CfnCustomActionTypeSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCustomActionTypeSettingsPropertyDsl()
    builder.apply(block)
    return setSettings(builder.build())
}

/** The S3 bucket where artifacts for the pipeline are stored. */
public inline fun CfnPipeline.setArtifactStore(
    block: CfnPipelineArtifactStorePropertyDsl.() -> Unit = {}
) {
    val builder = CfnPipelineArtifactStorePropertyDsl()
    builder.apply(block)
    return setArtifactStore(builder.build())
}

/** Properties that configure the authentication applied to incoming webhook trigger requests. */
public inline fun CfnWebhook.setAuthenticationConfiguration(
    block: CfnWebhookWebhookAuthConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWebhookWebhookAuthConfigurationPropertyDsl()
    builder.apply(block)
    return setAuthenticationConfiguration(builder.build())
}

/**
 * The callback invoked when this Action is added to a Pipeline.
 *
 * @param scope the Construct tree scope the Action can use if it needs to create any resources.
 * @param stage the `IStage` this Action is being added to.
 * @param options additional options the Action can use, like the artifact Bucket of the pipeline
 *   it's being added to.
 */
public inline fun IAction.bind(
    arg0: Construct,
    arg1: IStage,
    block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
    val builder = ActionBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, arg1, builder.build())
}

/**
 * Creates an Event that will be triggered whenever the state of this Action changes.
 *
 * @param name the name to use for the new Event.
 * @param target the optional target for the Event.
 * @param options additional options that can be used to customize the created Event.
 */
public inline fun IAction.onStateChange(
    arg0: String,
    arg1: IRuleTarget?,
    block: RulePropsDsl.() -> Unit = {},
): Rule {
    val builder = RulePropsDsl()
    builder.apply(block)
    return onStateChange(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar notification rule triggered when the pipeline events emitted by you specified,
 * it very similar to `onEvent` API.
 *
 * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
 * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange` to define rules for
 * these specific event emitted.
 *
 * @param id The id of the CodeStar notification rule.
 * @param target The target to register for the CodeStar Notifications destination.
 * @param options Customization options for CodeStar notification rule.
 * @return CodeStar notification rule associated with this build project.
 */
public inline fun IPipeline.notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: PipelineNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = PipelineNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(arg0, arg1, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Action execution" events emitted from
 * this pipeline.
 *
 * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
 *
 * @param id Identifier for this notification handler.
 * @param target The target to register for the CodeStar Notifications destination.
 * @param options Additional options to pass to the notification rule.
 */
public inline fun IPipeline.notifyOnAnyActionStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnAnyActionStateChange(arg0, arg1, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Manual approval" events emitted from
 * this pipeline.
 *
 * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
 *
 * @param id Identifier for this notification handler.
 * @param target The target to register for the CodeStar Notifications destination.
 * @param options Additional options to pass to the notification rule.
 */
public inline fun IPipeline.notifyOnAnyManualApprovalStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnAnyManualApprovalStateChange(arg0, arg1, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Stage execution" events emitted from
 * this pipeline.
 *
 * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
 *
 * @param id Identifier for this notification handler.
 * @param target The target to register for the CodeStar Notifications destination.
 * @param options Additional options to pass to the notification rule.
 */
public inline fun IPipeline.notifyOnAnyStageStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnAnyStageStateChange(arg0, arg1, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Pipeline execution" events emitted from
 * this pipeline.
 *
 * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
 *
 * @param id Identifier for this notification handler.
 * @param target The target to register for the CodeStar Notifications destination.
 * @param options Additional options to pass to the notification rule.
 */
public inline fun IPipeline.notifyOnExecutionStateChange(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnExecutionStateChange(arg0, arg1, builder.build())
}

/**
 * Define an event rule triggered by this CodePipeline.
 *
 * @param id Identifier for this event handler.
 * @param options Additional options to pass to the event rule.
 */
public inline fun IPipeline.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

/**
 * Define an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
 * emitted from this pipeline.
 *
 * @param id Identifier for this event handler.
 * @param options Additional options to pass to the event rule.
 */
public inline fun IPipeline.onStateChange(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(arg0, builder.build())
}

/**
 * @param name
 * @param target
 * @param options
 */
public inline fun IStage.onStateChange(
    arg0: String,
    arg1: IRuleTarget?,
    block: RulePropsDsl.() -> Unit = {},
): Rule {
    val builder = RulePropsDsl()
    builder.apply(block)
    return onStateChange(arg0, arg1, builder.build())
}

/**
 * Creates a new Stage, and adds it to this Pipeline.
 *
 * @param props the creation properties of the new Stage.
 * @return the newly created Stage
 */
public inline fun Pipeline.addStage(block: StageOptionsDsl.() -> Unit = {}): IStage {
    val builder = StageOptionsDsl()
    builder.apply(block)
    return addStage(builder.build())
}

/**
 * Adds a statement to the pipeline role.
 *
 * @param statement
 */
public inline fun Pipeline.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToRolePolicy(builder.build())
}

/**
 * Adds a new Trigger to this Pipeline.
 *
 * @param props Trigger property to add to this Pipeline.
 * @return the newly created trigger
 */
public inline fun Pipeline.addTrigger(block: TriggerPropsDsl.() -> Unit = {}): Trigger {
    val builder = TriggerPropsDsl()
    builder.apply(block)
    return addTrigger(builder.build())
}

/**
 * Adds a new Variable to this Pipeline.
 *
 * @param variable Variable instance to add to this Pipeline.
 * @return the newly created variable
 */
public inline fun Pipeline.addVariable(block: VariableDsl.() -> Unit = {}): Variable {
    val builder = VariableDsl()
    builder.apply(block)
    return addVariable(builder.build())
}

/**
 * Defines a CodeStar notification rule triggered when the pipeline events emitted by you specified,
 * it very similar to `onEvent` API.
 *
 * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
 * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange` to define rules for
 * these specific event emitted.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Pipeline.notifyOn(
    id: String,
    target: INotificationRuleTarget,
    block: PipelineNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = PipelineNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(id, target, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Action execution" events emitted from
 * this pipeline.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Pipeline.notifyOnAnyActionStateChange(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnAnyActionStateChange(id, target, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Manual approval" events emitted from
 * this pipeline.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Pipeline.notifyOnAnyManualApprovalStateChange(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnAnyManualApprovalStateChange(id, target, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Stage execution" events emitted from
 * this pipeline.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Pipeline.notifyOnAnyStageStateChange(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnAnyStageStateChange(id, target, builder.build())
}

/**
 * Define an notification rule triggered by the set of the "Pipeline execution" events emitted from
 * this pipeline.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Pipeline.notifyOnExecutionStateChange(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnExecutionStateChange(id, target, builder.build())
}

/**
 * Defines an event rule triggered by this CodePipeline.
 *
 * @param id Identifier for this event handler.
 * @param options Additional options to pass to the event rule.
 */
public inline fun Pipeline.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Defines an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
 * emitted from this pipeline.
 *
 * @param id Identifier for this event handler.
 * @param options Additional options to pass to the event rule.
 */
public inline fun Pipeline.onStateChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(id, builder.build())
}
