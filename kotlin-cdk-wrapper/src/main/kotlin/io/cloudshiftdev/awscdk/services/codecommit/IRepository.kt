@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleSource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IRepository : IResource, INotificationRuleSource {
  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantPull(arg0: IGrantable): Grant

  public fun grantPullPush(arg0: IGrantable): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: RepositoryNotifyOnOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b9b2aa038343a1daad316b913d666c238445877a999385cf0a7c7a1320e69c")
  public fun notifyOn(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: RepositoryNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnApprovalRuleOverridden(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnApprovalRuleOverridden(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46c7535e578d187135bc2130f0335526eaf9b1454c9eea6ebd990a0df134a92c")
  public fun notifyOnApprovalRuleOverridden(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnApprovalStatusChanged(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnApprovalStatusChanged(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0250c078c4d0dccd5a08ea1155be9bc92ce3587ad936c97c1e270454cbf92bc1")
  public fun notifyOnApprovalStatusChanged(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnBranchOrTagCreated(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnBranchOrTagCreated(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e045146770fab4226252820bfc6ddfd30fd0adc4c4336cd6270de40c5c86217")
  public fun notifyOnBranchOrTagCreated(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnBranchOrTagDeleted(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnBranchOrTagDeleted(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c9200c2451a1025cfb291a53a04477481fca99d2e6d4673082f934f8929acb6")
  public fun notifyOnBranchOrTagDeleted(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnPullRequestComment(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnPullRequestComment(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bb2b07f792a875a42ab620542e7afb8ac4ad866bc24093173cdfcb00bfca715")
  public fun notifyOnPullRequestComment(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnPullRequestCreated(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnPullRequestCreated(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe51e45ce319a7968ee3c3a4bfe6c390ec6c8c7c12b1811b3e47629283510c35")
  public fun notifyOnPullRequestCreated(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun notifyOnPullRequestMerged(arg0: String, arg1: INotificationRuleTarget):
      INotificationRule

  public fun notifyOnPullRequestMerged(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions,
  ): INotificationRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92b3a812ae669d7aa46f3d074f386774d46d4b3ff15e2ccf88f0bf2066082129")
  public fun notifyOnPullRequestMerged(
    arg0: String,
    arg1: INotificationRuleTarget,
    arg2: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  public fun onCommentOnCommit(arg0: String): Rule

  public fun onCommentOnCommit(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fc9299001d6ed4dfe2f794175df00b897aca5f16d690ddb09e74a2f5369f803c")
  public fun onCommentOnCommit(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onCommentOnPullRequest(arg0: String): Rule

  public fun onCommentOnPullRequest(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74f4fa682efa8ab5c54c3e71185b1250add0058b150599ebd7b3daec160e0812")
  public fun onCommentOnPullRequest(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onCommit(arg0: String): Rule

  public fun onCommit(arg0: String, arg1: OnCommitOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("99e2a7e07608bfe036450f873080160e01bb6e158867249d838080fb9c326a6b")
  public fun onCommit(arg0: String, arg1: OnCommitOptions.Builder.() -> Unit): Rule

  public fun onEvent(arg0: String): Rule

  public fun onEvent(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onPullRequestStateChange(arg0: String): Rule

  public fun onPullRequestStateChange(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccf05ddc1505b6c27a76cba26597bfadc25d79e62707184a50bdda0613bd142d")
  public fun onPullRequestStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onReferenceCreated(arg0: String): Rule

  public fun onReferenceCreated(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11446a75b034ae186bc4e1eb7bb8a9dbf76f2500e19295e8f571f514f0358e4d")
  public fun onReferenceCreated(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onReferenceDeleted(arg0: String): Rule

  public fun onReferenceDeleted(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2bdfd909fd78fa26f40663ddfd35633018a14d28fd8cbdc095b859b4269ae5a4")
  public fun onReferenceDeleted(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onReferenceUpdated(arg0: String): Rule

  public fun onReferenceUpdated(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bf0d0235cd8985a161fe5e339db14aa6ae7e6ece47ee4528b7360629bbabdab")
  public fun onReferenceUpdated(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun onStateChange(arg0: String): Rule

  public fun onStateChange(arg0: String, arg1: OnEventOptions): Rule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public fun onStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  public fun repositoryArn(): String

  public fun repositoryCloneUrlGrc(): String

  public fun repositoryCloneUrlHttp(): String

  public fun repositoryCloneUrlSsh(): String

  public fun repositoryName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.IRepository,
  ) : CdkObject(cdkObject), IRepository {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun bindAsNotificationRuleSource(arg0: Construct): NotificationRuleSourceConfig =
        unwrap(this).bindAsNotificationRuleSource(arg0.let(Construct::unwrap)).let(NotificationRuleSourceConfig::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantPull(arg0: IGrantable): Grant =
        unwrap(this).grantPull(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantPullPush(arg0: IGrantable): Grant =
        unwrap(this).grantPullPush(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun notifyOn(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: RepositoryNotifyOnOptions,
    ): INotificationRule = unwrap(this).notifyOn(arg0, arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(RepositoryNotifyOnOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72b9b2aa038343a1daad316b913d666c238445877a999385cf0a7c7a1320e69c")
    override fun notifyOn(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: RepositoryNotifyOnOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOn(arg0, arg1, RepositoryNotifyOnOptions(arg2))

    override fun notifyOnApprovalRuleOverridden(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnApprovalRuleOverridden(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnApprovalRuleOverridden(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnApprovalRuleOverridden(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46c7535e578d187135bc2130f0335526eaf9b1454c9eea6ebd990a0df134a92c")
    override fun notifyOnApprovalRuleOverridden(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnApprovalRuleOverridden(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnApprovalStatusChanged(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnApprovalStatusChanged(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnApprovalStatusChanged(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnApprovalStatusChanged(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0250c078c4d0dccd5a08ea1155be9bc92ce3587ad936c97c1e270454cbf92bc1")
    override fun notifyOnApprovalStatusChanged(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnApprovalStatusChanged(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnBranchOrTagCreated(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnBranchOrTagCreated(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnBranchOrTagCreated(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnBranchOrTagCreated(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e045146770fab4226252820bfc6ddfd30fd0adc4c4336cd6270de40c5c86217")
    override fun notifyOnBranchOrTagCreated(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnBranchOrTagCreated(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnBranchOrTagDeleted(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnBranchOrTagDeleted(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnBranchOrTagDeleted(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnBranchOrTagDeleted(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c9200c2451a1025cfb291a53a04477481fca99d2e6d4673082f934f8929acb6")
    override fun notifyOnBranchOrTagDeleted(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnBranchOrTagDeleted(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnPullRequestComment(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnPullRequestComment(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnPullRequestComment(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnPullRequestComment(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bb2b07f792a875a42ab620542e7afb8ac4ad866bc24093173cdfcb00bfca715")
    override fun notifyOnPullRequestComment(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnPullRequestComment(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnPullRequestCreated(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnPullRequestCreated(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnPullRequestCreated(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnPullRequestCreated(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe51e45ce319a7968ee3c3a4bfe6c390ec6c8c7c12b1811b3e47629283510c35")
    override fun notifyOnPullRequestCreated(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnPullRequestCreated(arg0, arg1, NotificationRuleOptions(arg2))

    override fun notifyOnPullRequestMerged(arg0: String, arg1: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnPullRequestMerged(arg0,
        arg1.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

    override fun notifyOnPullRequestMerged(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnPullRequestMerged(arg0,
        arg1.let(INotificationRuleTarget::unwrap),
        arg2.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92b3a812ae669d7aa46f3d074f386774d46d4b3ff15e2ccf88f0bf2066082129")
    override fun notifyOnPullRequestMerged(
      arg0: String,
      arg1: INotificationRuleTarget,
      arg2: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnPullRequestMerged(arg0, arg1, NotificationRuleOptions(arg2))

    override fun onCommentOnCommit(arg0: String): Rule =
        unwrap(this).onCommentOnCommit(arg0).let(Rule::wrap)

    override fun onCommentOnCommit(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onCommentOnCommit(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc9299001d6ed4dfe2f794175df00b897aca5f16d690ddb09e74a2f5369f803c")
    override fun onCommentOnCommit(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onCommentOnCommit(arg0, OnEventOptions(arg1))

    override fun onCommentOnPullRequest(arg0: String): Rule =
        unwrap(this).onCommentOnPullRequest(arg0).let(Rule::wrap)

    override fun onCommentOnPullRequest(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onCommentOnPullRequest(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74f4fa682efa8ab5c54c3e71185b1250add0058b150599ebd7b3daec160e0812")
    override fun onCommentOnPullRequest(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule
        = onCommentOnPullRequest(arg0, OnEventOptions(arg1))

    override fun onCommit(arg0: String): Rule = unwrap(this).onCommit(arg0).let(Rule::wrap)

    override fun onCommit(arg0: String, arg1: OnCommitOptions): Rule = unwrap(this).onCommit(arg0,
        arg1.let(OnCommitOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99e2a7e07608bfe036450f873080160e01bb6e158867249d838080fb9c326a6b")
    override fun onCommit(arg0: String, arg1: OnCommitOptions.Builder.() -> Unit): Rule =
        onCommit(arg0, OnCommitOptions(arg1))

    override fun onEvent(arg0: String): Rule = unwrap(this).onEvent(arg0).let(Rule::wrap)

    override fun onEvent(arg0: String, arg1: OnEventOptions): Rule = unwrap(this).onEvent(arg0,
        arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    override fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(arg0, OnEventOptions(arg1))

    override fun onPullRequestStateChange(arg0: String): Rule =
        unwrap(this).onPullRequestStateChange(arg0).let(Rule::wrap)

    override fun onPullRequestStateChange(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onPullRequestStateChange(arg0,
        arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccf05ddc1505b6c27a76cba26597bfadc25d79e62707184a50bdda0613bd142d")
    override fun onPullRequestStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit):
        Rule = onPullRequestStateChange(arg0, OnEventOptions(arg1))

    override fun onReferenceCreated(arg0: String): Rule =
        unwrap(this).onReferenceCreated(arg0).let(Rule::wrap)

    override fun onReferenceCreated(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onReferenceCreated(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11446a75b034ae186bc4e1eb7bb8a9dbf76f2500e19295e8f571f514f0358e4d")
    override fun onReferenceCreated(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onReferenceCreated(arg0, OnEventOptions(arg1))

    override fun onReferenceDeleted(arg0: String): Rule =
        unwrap(this).onReferenceDeleted(arg0).let(Rule::wrap)

    override fun onReferenceDeleted(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onReferenceDeleted(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2bdfd909fd78fa26f40663ddfd35633018a14d28fd8cbdc095b859b4269ae5a4")
    override fun onReferenceDeleted(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onReferenceDeleted(arg0, OnEventOptions(arg1))

    override fun onReferenceUpdated(arg0: String): Rule =
        unwrap(this).onReferenceUpdated(arg0).let(Rule::wrap)

    override fun onReferenceUpdated(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onReferenceUpdated(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bf0d0235cd8985a161fe5e339db14aa6ae7e6ece47ee4528b7360629bbabdab")
    override fun onReferenceUpdated(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onReferenceUpdated(arg0, OnEventOptions(arg1))

    override fun onStateChange(arg0: String): Rule =
        unwrap(this).onStateChange(arg0).let(Rule::wrap)

    override fun onStateChange(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onStateChange(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
    override fun onStateChange(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onStateChange(arg0, OnEventOptions(arg1))

    override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

    override fun repositoryCloneUrlGrc(): String = unwrap(this).getRepositoryCloneUrlGrc()

    override fun repositoryCloneUrlHttp(): String = unwrap(this).getRepositoryCloneUrlHttp()

    override fun repositoryCloneUrlSsh(): String = unwrap(this).getRepositoryCloneUrlSsh()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.IRepository):
        IRepository = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRepository):
        software.amazon.awscdk.services.codecommit.IRepository = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codecommit.IRepository
  }
}
