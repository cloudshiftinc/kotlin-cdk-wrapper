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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.dsl.services.codestarnotifications.NotificationRuleOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.IRepository
import software.amazon.awscdk.services.codecommit.Repository
import software.amazon.awscdk.services.codestarnotifications.INotificationRule
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.events.Rule

/**
 * Defines a CodeStar Notification rule triggered when the project events specified by you are
 * emitted. Similar to `onEvent` API.
 *
 * You can also use the methods to define rules for the specific event emitted. eg:
 * `notifyOnPullRequstCreated`.
 *
 * @param id
 * @param target
 * @param options
 * @return CodeStar Notifications rule associated with this repository.
 */
public inline fun IRepository.notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: RepositoryNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = RepositoryNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IRepository.notifyOnApprovalRuleOverridden(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnApprovalRuleOverridden(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when an approval status is changed.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IRepository.notifyOnApprovalStatusChanged(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnApprovalStatusChanged(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IRepository.notifyOnBranchOrTagCreated(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBranchOrTagCreated(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IRepository.notifyOnBranchOrTagDeleted(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBranchOrTagDeleted(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IRepository.notifyOnPullRequestComment(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnPullRequestComment(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a pull request is created.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IRepository.notifyOnPullRequestCreated(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnPullRequestCreated(arg0, arg1, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a pull request is merged.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun IRepository.notifyOnPullRequestMerged(
    arg0: String,
    arg1: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnPullRequestMerged(arg0, arg1, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onCommentOnCommit(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCommentOnCommit(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onCommentOnPullRequest(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCommentOnPullRequest(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onCommit(
    arg0: String,
    block: OnCommitOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCommitOptionsDsl()
    builder.apply(block)
    return onCommit(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers for repository events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onEvent(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a pull request state is changed.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onPullRequestStateChange(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onPullRequestStateChange(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new branch/tag
 * is created) to the repository.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onReferenceCreated(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReferenceCreated(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
 * deleted) from the repository.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onReferenceDeleted(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReferenceDeleted(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
 * pushed to an existing or new branch) from the repository.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onReferenceUpdated(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReferenceUpdated(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change" event
 * occurs.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onStateChange(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(arg0, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a pull request is merged.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifiyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifiyOnPullRequestMerged(id, target, builder.build())
}

/**
 * Create a trigger to notify another service to run actions on repository events.
 *
 * @param arn Arn of the resource that repository events will notify.
 * @param options Trigger options to run actions.
 */
public inline fun Repository.notify(
    arn: String,
    block: RepositoryTriggerOptionsDsl.() -> Unit = {}
): Repository {
    val builder = RepositoryTriggerOptionsDsl()
    builder.apply(block)
    return notify(arn, builder.build())
}

/**
 * Defines a CodeStar Notification rule triggered when the project events specified by you are
 * emitted. Similar to `onEvent` API.
 *
 * You can also use the methods to define rules for the specific event emitted. eg:
 * `notifyOnPullRequstCreated`.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOn(
    id: String,
    target: INotificationRuleTarget,
    block: RepositoryNotifyOnOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = RepositoryNotifyOnOptionsDsl()
    builder.apply(block)
    return notifyOn(id, target, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOnApprovalRuleOverridden(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnApprovalRuleOverridden(id, target, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when an approval status is changed.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOnApprovalStatusChanged(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnApprovalStatusChanged(id, target, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOnBranchOrTagCreated(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBranchOrTagCreated(id, target, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOnBranchOrTagDeleted(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnBranchOrTagDeleted(id, target, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOnPullRequestComment(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnPullRequestComment(id, target, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a pull request is created.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOnPullRequestCreated(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnPullRequestCreated(id, target, builder.build())
}

/**
 * Defines a CodeStar Notification rule which triggers when a pull request is merged.
 *
 * @param id
 * @param target
 * @param options
 */
public inline fun Repository.notifyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    block: NotificationRuleOptionsDsl.() -> Unit = {},
): INotificationRule {
    val builder = NotificationRuleOptionsDsl()
    builder.apply(block)
    return notifyOnPullRequestMerged(id, target, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onCommentOnCommit(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCommentOnCommit(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onCommentOnPullRequest(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCommentOnPullRequest(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onCommit(id: String, block: OnCommitOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnCommitOptionsDsl()
    builder.apply(block)
    return onCommit(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers for repository events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a pull request state is changed.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onPullRequestStateChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onPullRequestStateChange(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new branch/tag
 * is created) to the repository.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onReferenceCreated(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReferenceCreated(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
 * deleted) from the repository.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onReferenceDeleted(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReferenceDeleted(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
 * pushed to an existing or new branch) from the repository.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onReferenceUpdated(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReferenceUpdated(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change" event
 * occurs.
 *
 * @param id
 * @param options
 */
public inline fun Repository.onStateChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onStateChange(id, builder.build())
}

/**
 * Information about code to be committed to a repository after it is created in an AWS
 * CloudFormation stack.
 */
public inline fun CfnRepository.setCode(block: CfnRepositoryCodePropertyDsl.() -> Unit = {}) {
    val builder = CfnRepositoryCodePropertyDsl()
    builder.apply(block)
    return setCode(builder.build())
}
