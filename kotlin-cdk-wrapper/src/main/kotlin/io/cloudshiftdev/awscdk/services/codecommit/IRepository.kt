@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleSource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 *
 */
public interface IRepository : IResource, INotificationRuleSource {
  /**
   * Grant the given principal identity permissions to perform the actions on this repository.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  /**
   * Grant the given identity permissions to pull this repository.
   *
   * @param grantee 
   */
  public fun grantPull(grantee: IGrantable): Grant

  /**
   * Grant the given identity permissions to pull and push this repository.
   *
   * @param grantee 
   */
  public fun grantPullPush(grantee: IGrantable): Grant

  /**
   * Grant the given identity permissions to read this repository.
   *
   * @param grantee 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Defines a CodeStar Notification rule triggered when the project events specified by you are
   * emitted. Similar to `onEvent` API.
   *
   * You can also use the methods to define rules for the specific event emitted.
   * eg: `notifyOnPullRequstCreated`.
   *
   * @return CodeStar Notifications rule associated with this repository.
   * @param id 
   * @param target 
   * @param options 
   */
  public fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: RepositoryNotifyOnOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule triggered when the project events specified by you are
   * emitted. Similar to `onEvent` API.
   *
   * You can also use the methods to define rules for the specific event emitted.
   * eg: `notifyOnPullRequstCreated`.
   *
   * @return CodeStar Notifications rule associated with this repository.
   * @param id 
   * @param target 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b9b2aa038343a1daad316b913d666c238445877a999385cf0a7c7a1320e69c")
  public fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: RepositoryNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnApprovalRuleOverridden(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnApprovalRuleOverridden(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46c7535e578d187135bc2130f0335526eaf9b1454c9eea6ebd990a0df134a92c")
  public fun notifyOnApprovalRuleOverridden(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when an approval status is changed.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnApprovalStatusChanged(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when an approval status is changed.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnApprovalStatusChanged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when an approval status is changed.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0250c078c4d0dccd5a08ea1155be9bc92ce3587ad936c97c1e270454cbf92bc1")
  public fun notifyOnApprovalStatusChanged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBranchOrTagCreated(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBranchOrTagCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e045146770fab4226252820bfc6ddfd30fd0adc4c4336cd6270de40c5c86217")
  public fun notifyOnBranchOrTagCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBranchOrTagDeleted(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnBranchOrTagDeleted(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c9200c2451a1025cfb291a53a04477481fca99d2e6d4673082f934f8929acb6")
  public fun notifyOnBranchOrTagDeleted(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnPullRequestComment(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnPullRequestComment(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bb2b07f792a875a42ab620542e7afb8ac4ad866bc24093173cdfcb00bfca715")
  public fun notifyOnPullRequestComment(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnPullRequestCreated(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnPullRequestCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe51e45ce319a7968ee3c3a4bfe6c390ec6c8c7c12b1811b3e47629283510c35")
  public fun notifyOnPullRequestCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnPullRequestMerged(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public fun notifyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92b3a812ae669d7aa46f3d074f386774d46d4b3ff15e2ccf88f0bf2066082129")
  public fun notifyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
   *
   * @param id 
   * @param options
   */
  public fun onCommentOnCommit(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
   *
   * @param id 
   * @param options
   */
  public fun onCommentOnCommit(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fc9299001d6ed4dfe2f794175df00b897aca5f16d690ddb09e74a2f5369f803c")
  public fun onCommentOnCommit(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param options
   */
  public fun onCommentOnPullRequest(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param options
   */
  public fun onCommentOnPullRequest(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74f4fa682efa8ab5c54c3e71185b1250add0058b150599ebd7b3daec160e0812")
  public fun onCommentOnPullRequest(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
   *
   * @param id 
   * @param options
   */
  public fun onCommit(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
   *
   * @param id 
   * @param options
   */
  public fun onCommit(id: String, options: OnCommitOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("99e2a7e07608bfe036450f873080160e01bb6e158867249d838080fb9c326a6b")
  public fun onCommit(id: String, options: OnCommitOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a pull request state is changed.
   *
   * @param id 
   * @param options
   */
  public fun onPullRequestStateChange(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a pull request state is changed.
   *
   * @param id 
   * @param options
   */
  public fun onPullRequestStateChange(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a pull request state is changed.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccf05ddc1505b6c27a76cba26597bfadc25d79e62707184a50bdda0613bd142d")
  public fun onPullRequestStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new
   * branch/tag is created) to the repository.
   *
   * @param id 
   * @param options
   */
  public fun onReferenceCreated(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new
   * branch/tag is created) to the repository.
   *
   * @param id 
   * @param options
   */
  public fun onReferenceCreated(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new
   * branch/tag is created) to the repository.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11446a75b034ae186bc4e1eb7bb8a9dbf76f2500e19295e8f571f514f0358e4d")
  public fun onReferenceCreated(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
   * deleted) from the repository.
   *
   * @param id 
   * @param options
   */
  public fun onReferenceDeleted(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
   * deleted) from the repository.
   *
   * @param id 
   * @param options
   */
  public fun onReferenceDeleted(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
   * deleted) from the repository.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2bdfd909fd78fa26f40663ddfd35633018a14d28fd8cbdc095b859b4269ae5a4")
  public fun onReferenceDeleted(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
   * pushed to an existing or new branch) from the repository.
   *
   * @param id 
   * @param options
   */
  public fun onReferenceUpdated(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
   * pushed to an existing or new branch) from the repository.
   *
   * @param id 
   * @param options
   */
  public fun onReferenceUpdated(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
   * pushed to an existing or new branch) from the repository.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bf0d0235cd8985a161fe5e339db14aa6ae7e6ece47ee4528b7360629bbabdab")
  public fun onReferenceUpdated(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change"
   * event occurs.
   *
   * @param id 
   * @param options
   */
  public fun onStateChange(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change"
   * event occurs.
   *
   * @param id 
   * @param options
   */
  public fun onStateChange(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change"
   * event occurs.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * The ARN of this Repository.
   */
  public fun repositoryArn(): String

  /**
   * The HTTPS (GRC) clone URL.
   *
   * HTTPS (GRC) is the protocol to use with git-remote-codecommit (GRC).
   *
   * It is the recommended method for supporting connections made with federated
   * access, identity providers, and temporary credentials.
   *
   * [Documentation](https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-git-remote-codecommit.html)
   */
  public fun repositoryCloneUrlGrc(): String

  /**
   * The HTTP clone URL.
   */
  public fun repositoryCloneUrlHttp(): String

  /**
   * The SSH clone URL.
   */
  public fun repositoryCloneUrlSsh(): String

  /**
   * The human-visible name of this Repository.
   */
  public fun repositoryName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.IRepository):
        IRepository = CdkObjectWrappers.wrap(cdkObject) as IRepository

    internal fun unwrap(wrapped: IRepository):
        software.amazon.awscdk.services.codecommit.IRepository = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codecommit.IRepository
  }
}
