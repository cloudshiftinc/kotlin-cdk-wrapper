@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.codestarnotifications.NotificationRuleOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.Repository
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.Rule

public inline fun CfnRepository.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRepository.setCode(block: CfnRepositoryCodePropertyDsl.() -> Unit = {}) {
  val builder = CfnRepositoryCodePropertyDsl()
  builder.apply(block)
  return setCode(builder.build())
}

public inline fun Repository.notifiyOnPullRequestMerged(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifiyOnPullRequestMerged(arg0,arg1,builder.build())
}

public inline fun Repository.notify(arg0: String, block: RepositoryTriggerOptionsDsl.() -> Unit =
    {}): Repository {
  val builder = RepositoryTriggerOptionsDsl()
  builder.apply(block)
  return notify(arg0,builder.build())
}

public inline fun Repository.notifyOn(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: RepositoryNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = RepositoryNotifyOnOptionsDsl()
  builder.apply(block)
  return notifyOn(arg0,arg1,builder.build())
}

public inline fun Repository.notifyOnApprovalRuleOverridden(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnApprovalRuleOverridden(arg0,arg1,builder.build())
}

public inline fun Repository.notifyOnApprovalStatusChanged(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnApprovalStatusChanged(arg0,arg1,builder.build())
}

public inline fun Repository.notifyOnBranchOrTagCreated(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnBranchOrTagCreated(arg0,arg1,builder.build())
}

public inline fun Repository.notifyOnBranchOrTagDeleted(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnBranchOrTagDeleted(arg0,arg1,builder.build())
}

public inline fun Repository.notifyOnPullRequestComment(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnPullRequestComment(arg0,arg1,builder.build())
}

public inline fun Repository.notifyOnPullRequestCreated(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnPullRequestCreated(arg0,arg1,builder.build())
}

public inline fun Repository.notifyOnPullRequestMerged(
  arg0: String,
  arg1: INotificationRuleTarget,
  block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
  val builder = NotificationRuleOptionsDsl()
  builder.apply(block)
  return notifyOnPullRequestMerged(arg0,arg1,builder.build())
}

public inline fun Repository.onCommentOnCommit(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onCommentOnCommit(arg0,builder.build())
}

public inline fun Repository.onCommentOnPullRequest(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onCommentOnPullRequest(arg0,builder.build())
}

public inline fun Repository.onCommit(arg0: String, block: OnCommitOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnCommitOptionsDsl()
  builder.apply(block)
  return onCommit(arg0,builder.build())
}

public inline fun Repository.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun Repository.onPullRequestStateChange(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onPullRequestStateChange(arg0,builder.build())
}

public inline fun Repository.onReferenceCreated(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReferenceCreated(arg0,builder.build())
}

public inline fun Repository.onReferenceDeleted(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReferenceDeleted(arg0,builder.build())
}

public inline fun Repository.onReferenceUpdated(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReferenceUpdated(arg0,builder.build())
}

public inline fun Repository.onStateChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onStateChange(arg0,builder.build())
}
