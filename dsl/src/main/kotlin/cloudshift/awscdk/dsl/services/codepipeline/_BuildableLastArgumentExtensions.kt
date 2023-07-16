@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.codestarnotifications.NotificationRuleOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.amazon.awscdk.services.codepipeline.IStage
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.Rule

public inline fun CfnCustomActionType.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnPipeline.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPipeline.setArtifactStore(block: CfnPipelineArtifactStorePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPipelineArtifactStorePropertyDsl()
  builder.apply(block)
  return setArtifactStore(builder.build())
}

public inline fun CfnWebhook.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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
  arg0: String,
  arg1: INotificationRuleTarget,
  block: PipelineNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = PipelineNotifyOnOptionsDsl()
  builder.apply(block)
  return notifyOn(arg0,arg1,builder.build())
}

public inline fun Pipeline.notifyOnAnyActionStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyActionStateChange(arg0,arg1,builder.build())
}

public inline fun Pipeline.notifyOnAnyManualApprovalStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyManualApprovalStateChange(arg0,arg1,builder.build())
}

public inline fun Pipeline.notifyOnAnyStageStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnAnyStageStateChange(arg0,arg1,builder.build())
}

public inline fun Pipeline.notifyOnExecutionStateChange(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnExecutionStateChange(arg0,arg1,builder.build())
}

public inline fun Pipeline.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun Pipeline.onStateChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onStateChange(arg0,builder.build())
}
