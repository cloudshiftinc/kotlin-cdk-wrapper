@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.dsl.services.codestarnotifications.NotificationRuleOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import cloudshift.awscdk.dsl.services.events.RulePropsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
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
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.events.Rule
import software.constructs.Construct

public inline fun IStage.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0, arg1, builder.build())
}

public inline fun IAction.bind(
  arg0: Construct,
  arg1: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(arg0, arg1, builder.build())
}

public inline fun IAction.onStateChange(
  arg0: String,
  arg1: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(arg0, arg1, builder.build())
}

public inline
    fun CfnWebhook.setAuthenticationConfiguration(block: CfnWebhookWebhookAuthConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWebhookWebhookAuthConfigurationPropertyDsl()
  builder.apply(block)
  return setAuthenticationConfiguration(builder.build())
}

public inline fun Pipeline.addStage(block: StageOptionsDsl.() -> Unit = {}): IStage {
  val builder = StageOptionsDsl()
  builder.apply(block)
  return addStage(builder.build())
}

public inline fun Pipeline.addToRolePolicy(block: PolicyStatementDsl.() -> Unit = {}) {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToRolePolicy(builder.build())
}

public inline fun Pipeline.notifyOn(
  id: String,
  target: INotificationRuleTarget,
  block: PipelineNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = PipelineNotifyOnOptionsDsl()
  builder.apply(block)
  return notifyOn(id, target, builder.build())
}

public inline fun Pipeline.notifyOnAnyActionStateChange(
  id: String,
  target: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyActionStateChange(id, target, builder.build())
}

public inline fun Pipeline.notifyOnAnyManualApprovalStateChange(
  id: String,
  target: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyManualApprovalStateChange(id, target, builder.build())
}

public inline fun Pipeline.notifyOnAnyStageStateChange(
  id: String,
  target: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyStageStateChange(id, target, builder.build())
}

public inline fun Pipeline.notifyOnExecutionStateChange(
  id: String,
  target: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnExecutionStateChange(id, target, builder.build())
}

public inline fun Pipeline.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(id, builder.build())
}

public inline fun Pipeline.onStateChange(id: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onStateChange(id, builder.build())
}

public inline fun Action.bind(
  scope: Construct,
  stage: IStage,
  block: ActionBindOptionsDsl.() -> Unit = {},
): ActionConfig {
  val builder = ActionBindOptionsDsl()
  builder.apply(block)
  return bind(scope, stage, builder.build())
}

public inline fun Action.onStateChange(
  name: String,
  target: IRuleTarget,
  block: RulePropsDsl.() -> Unit = {},
): Rule {
  val builder = RulePropsDsl()
  builder.apply(block)
  return onStateChange(name, target, builder.build())
}

public inline
    fun CfnCustomActionType.setInputArtifactDetails(block: CfnCustomActionTypeArtifactDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCustomActionTypeArtifactDetailsPropertyDsl()
  builder.apply(block)
  return setInputArtifactDetails(builder.build())
}

public inline
    fun CfnCustomActionType.setOutputArtifactDetails(block: CfnCustomActionTypeArtifactDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCustomActionTypeArtifactDetailsPropertyDsl()
  builder.apply(block)
  return setOutputArtifactDetails(builder.build())
}

public inline
    fun CfnCustomActionType.setSettings(block: CfnCustomActionTypeSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCustomActionTypeSettingsPropertyDsl()
  builder.apply(block)
  return setSettings(builder.build())
}

public inline fun CfnPipeline.setArtifactStore(block: CfnPipelineArtifactStorePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPipelineArtifactStorePropertyDsl()
  builder.apply(block)
  return setArtifactStore(builder.build())
}

public inline fun IPipeline.notifyOn(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: PipelineNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = PipelineNotifyOnOptionsDsl()
  builder.apply(block)
  return notifyOn(arg0, arg1, builder.build())
}

public inline fun IPipeline.notifyOnAnyActionStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyActionStateChange(arg0, arg1, builder.build())
}

public inline fun IPipeline.notifyOnAnyManualApprovalStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyManualApprovalStateChange(arg0, arg1, builder.build())
}

public inline fun IPipeline.notifyOnAnyStageStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyStageStateChange(arg0, arg1, builder.build())
}

public inline fun IPipeline.notifyOnExecutionStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnExecutionStateChange(arg0, arg1, builder.build())
}

public inline fun IPipeline.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0, builder.build())
}

public inline fun IPipeline.onStateChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onStateChange(arg0, builder.build())
}
