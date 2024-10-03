@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provides a CodeCommit Repository.
 *
 * Example:
 *
 * ```
 * PipelineProject project;
 * Repository repository = Repository.Builder.create(this, "MyRepository")
 * .repositoryName("MyRepository")
 * .build();
 * PipelineProject project = new PipelineProject(this, "MyProject");
 * Artifact sourceOutput = new Artifact();
 * CodeCommitSourceAction sourceAction = CodeCommitSourceAction.Builder.create()
 * .actionName("CodeCommit")
 * .repository(repository)
 * .output(sourceOutput)
 * .build();
 * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
 * .actionName("CodeBuild")
 * .project(project)
 * .input(sourceOutput)
 * .outputs(List.of(new Artifact())) // optional
 * .executeBatchBuild(true) // optional, defaults to false
 * .combineBatchBuildArtifacts(true)
 * .build();
 * Pipeline.Builder.create(this, "MyPipeline")
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * .build()))
 * .build();
 * ```
 */
public open class Repository(
  cdkObject: software.amazon.awscdk.services.codecommit.Repository,
) : Resource(cdkObject),
    IRepository {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RepositoryProps,
  ) :
      this(software.amazon.awscdk.services.codecommit.Repository(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(RepositoryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RepositoryProps.Builder.() -> Unit,
  ) : this(scope, id, RepositoryProps(props)
  )

  /**
   * Returns a source configuration for notification rule.
   *
   * @param _scope 
   */
  public override fun bindAsNotificationRuleSource(scope: CloudshiftdevConstructsConstruct):
      NotificationRuleSourceConfig =
      unwrap(this).bindAsNotificationRuleSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap)).let(NotificationRuleSourceConfig::wrap)

  /**
   * Grant the given principal identity permissions to perform the actions on this repository.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Grant the given identity permissions to pull this repository.
   *
   * @param grantee 
   */
  public override fun grantPull(grantee: IGrantable): Grant =
      unwrap(this).grantPull(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity permissions to pull and push this repository.
   *
   * @param grantee 
   */
  public override fun grantPullPush(grantee: IGrantable): Grant =
      unwrap(this).grantPullPush(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity permissions to read this repository.
   *
   * @param grantee 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public open fun notifiyOnPullRequestMerged(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifiyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public open fun notifiyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifiyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("44a55935881be0a99d8e7983163dddb567213ff147b8c90981947edb0222ba8b")
  public open fun notifiyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifiyOnPullRequestMerged(id, target, NotificationRuleOptions(options))

  /**
   * Create a trigger to notify another service to run actions on repository events.
   *
   * @param arn Arn of the resource that repository events will notify. 
   * @param options Trigger options to run actions.
   */
  public open fun notify(arn: String): Repository = unwrap(this).notify(arn).let(Repository::wrap)

  /**
   * Create a trigger to notify another service to run actions on repository events.
   *
   * @param arn Arn of the resource that repository events will notify. 
   * @param options Trigger options to run actions.
   */
  public open fun notify(arn: String, options: RepositoryTriggerOptions): Repository =
      unwrap(this).notify(arn,
      options.let(RepositoryTriggerOptions.Companion::unwrap)).let(Repository::wrap)

  /**
   * Create a trigger to notify another service to run actions on repository events.
   *
   * @param arn Arn of the resource that repository events will notify. 
   * @param options Trigger options to run actions.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc62f8b194108fac3f61dea00eba84a479ae0166b0eb6466b2fa4157d2c36b54")
  public open fun notify(arn: String, options: RepositoryTriggerOptions.Builder.() -> Unit):
      Repository = notify(arn, RepositoryTriggerOptions(options))

  /**
   * Defines a CodeStar Notification rule triggered when the project events specified by you are
   * emitted. Similar to `onEvent` API.
   *
   * You can also use the methods to define rules for the specific event emitted.
   * eg: `notifyOnPullRequstCreated`.
   *
   * @param id 
   * @param target 
   * @param options 
   */
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: RepositoryNotifyOnOptions,
  ): INotificationRule = unwrap(this).notifyOn(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(RepositoryNotifyOnOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule triggered when the project events specified by you are
   * emitted. Similar to `onEvent` API.
   *
   * You can also use the methods to define rules for the specific event emitted.
   * eg: `notifyOnPullRequstCreated`.
   *
   * @param id 
   * @param target 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b9b2aa038343a1daad316b913d666c238445877a999385cf0a7c7a1320e69c")
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: RepositoryNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOn(id, target, RepositoryNotifyOnOptions(options))

  /**
   * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnApprovalRuleOverridden(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnApprovalRuleOverridden(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnApprovalRuleOverridden(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnApprovalRuleOverridden(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when an approval rule is overridden.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46c7535e578d187135bc2130f0335526eaf9b1454c9eea6ebd990a0df134a92c")
  public override fun notifyOnApprovalRuleOverridden(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnApprovalRuleOverridden(id, target,
      NotificationRuleOptions(options))

  /**
   * Defines a CodeStar Notification rule which triggers when an approval status is changed.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnApprovalStatusChanged(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnApprovalStatusChanged(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when an approval status is changed.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnApprovalStatusChanged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnApprovalStatusChanged(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when an approval status is changed.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0250c078c4d0dccd5a08ea1155be9bc92ce3587ad936c97c1e270454cbf92bc1")
  public override fun notifyOnApprovalStatusChanged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnApprovalStatusChanged(id, target, NotificationRuleOptions(options))

  /**
   * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnBranchOrTagCreated(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBranchOrTagCreated(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnBranchOrTagCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBranchOrTagCreated(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a new branch or tag is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e045146770fab4226252820bfc6ddfd30fd0adc4c4336cd6270de40c5c86217")
  public override fun notifyOnBranchOrTagCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnBranchOrTagCreated(id, target, NotificationRuleOptions(options))

  /**
   * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnBranchOrTagDeleted(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBranchOrTagDeleted(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnBranchOrTagDeleted(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBranchOrTagDeleted(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a branch or tag is deleted.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c9200c2451a1025cfb291a53a04477481fca99d2e6d4673082f934f8929acb6")
  public override fun notifyOnBranchOrTagDeleted(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnBranchOrTagDeleted(id, target, NotificationRuleOptions(options))

  /**
   * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnPullRequestComment(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnPullRequestComment(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnPullRequestComment(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnPullRequestComment(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bb2b07f792a875a42ab620542e7afb8ac4ad866bc24093173cdfcb00bfca715")
  public override fun notifyOnPullRequestComment(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnPullRequestComment(id, target, NotificationRuleOptions(options))

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnPullRequestCreated(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnPullRequestCreated(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnPullRequestCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnPullRequestCreated(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is created.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe51e45ce319a7968ee3c3a4bfe6c390ec6c8c7c12b1811b3e47629283510c35")
  public override fun notifyOnPullRequestCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnPullRequestCreated(id, target, NotificationRuleOptions(options))

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnPullRequestMerged(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar Notification rule which triggers when a pull request is merged.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92b3a812ae669d7aa46f3d074f386774d46d4b3ff15e2ccf88f0bf2066082129")
  public override fun notifyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnPullRequestMerged(id, target, NotificationRuleOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
   *
   * @param id 
   * @param options
   */
  public override fun onCommentOnCommit(id: String): Rule =
      unwrap(this).onCommentOnCommit(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
   *
   * @param id 
   * @param options
   */
  public override fun onCommentOnCommit(id: String, options: OnEventOptions): Rule =
      unwrap(this).onCommentOnCommit(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a commit.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fc9299001d6ed4dfe2f794175df00b897aca5f16d690ddb09e74a2f5369f803c")
  public override fun onCommentOnCommit(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onCommentOnCommit(id, OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param options
   */
  public override fun onCommentOnPullRequest(id: String): Rule =
      unwrap(this).onCommentOnPullRequest(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param options
   */
  public override fun onCommentOnPullRequest(id: String, options: OnEventOptions): Rule =
      unwrap(this).onCommentOnPullRequest(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a comment is made on a pull request.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74f4fa682efa8ab5c54c3e71185b1250add0058b150599ebd7b3daec160e0812")
  public override fun onCommentOnPullRequest(id: String,
      options: OnEventOptions.Builder.() -> Unit): Rule = onCommentOnPullRequest(id,
      OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
   *
   * @param id 
   * @param options
   */
  public override fun onCommit(id: String): Rule = unwrap(this).onCommit(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
   *
   * @param id 
   * @param options
   */
  public override fun onCommit(id: String, options: OnCommitOptions): Rule =
      unwrap(this).onCommit(id, options.let(OnCommitOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a commit is pushed to a branch.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("99e2a7e07608bfe036450f873080160e01bb6e158867249d838080fb9c326a6b")
  public override fun onCommit(id: String, options: OnCommitOptions.Builder.() -> Unit): Rule =
      onCommit(id, OnCommitOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers for repository events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

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
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a pull request state is changed.
   *
   * @param id 
   * @param options
   */
  public override fun onPullRequestStateChange(id: String): Rule =
      unwrap(this).onPullRequestStateChange(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a pull request state is changed.
   *
   * @param id 
   * @param options
   */
  public override fun onPullRequestStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onPullRequestStateChange(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a pull request state is changed.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccf05ddc1505b6c27a76cba26597bfadc25d79e62707184a50bdda0613bd142d")
  public override fun onPullRequestStateChange(id: String,
      options: OnEventOptions.Builder.() -> Unit): Rule = onPullRequestStateChange(id,
      OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new
   * branch/tag is created) to the repository.
   *
   * @param id 
   * @param options
   */
  public override fun onReferenceCreated(id: String): Rule =
      unwrap(this).onReferenceCreated(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new
   * branch/tag is created) to the repository.
   *
   * @param id 
   * @param options
   */
  public override fun onReferenceCreated(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReferenceCreated(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a reference is created (i.e. a new
   * branch/tag is created) to the repository.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11446a75b034ae186bc4e1eb7bb8a9dbf76f2500e19295e8f571f514f0358e4d")
  public override fun onReferenceCreated(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReferenceCreated(id, OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
   * deleted) from the repository.
   *
   * @param id 
   * @param options
   */
  public override fun onReferenceDeleted(id: String): Rule =
      unwrap(this).onReferenceDeleted(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
   * deleted) from the repository.
   *
   * @param id 
   * @param options
   */
  public override fun onReferenceDeleted(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReferenceDeleted(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a reference is delete (i.e. a branch/tag is
   * deleted) from the repository.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2bdfd909fd78fa26f40663ddfd35633018a14d28fd8cbdc095b859b4269ae5a4")
  public override fun onReferenceDeleted(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReferenceDeleted(id, OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
   * pushed to an existing or new branch) from the repository.
   *
   * @param id 
   * @param options
   */
  public override fun onReferenceUpdated(id: String): Rule =
      unwrap(this).onReferenceUpdated(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
   * pushed to an existing or new branch) from the repository.
   *
   * @param id 
   * @param options
   */
  public override fun onReferenceUpdated(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReferenceUpdated(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a reference is updated (i.e. a commit is
   * pushed to an existing or new branch) from the repository.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bf0d0235cd8985a161fe5e339db14aa6ae7e6ece47ee4528b7360629bbabdab")
  public override fun onReferenceUpdated(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReferenceUpdated(id, OnEventOptions(options))

  /**
   * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change"
   * event occurs.
   *
   * @param id 
   * @param options
   */
  public override fun onStateChange(id: String): Rule =
      unwrap(this).onStateChange(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change"
   * event occurs.
   *
   * @param id 
   * @param options
   */
  public override fun onStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onStateChange(id, options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers when a "CodeCommit Repository State Change"
   * event occurs.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onStateChange(id, OnEventOptions(options))

  /**
   * The ARN of this Repository.
   */
  public override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

  /**
   * The HTTPS (GRC) clone URL.
   *
   * HTTPS (GRC) is the protocol to use with git-remote-codecommit (GRC).
   *
   * It is the recommended method for supporting connections made with federated
   * access, identity providers, and temporary credentials.
   */
  public override fun repositoryCloneUrlGrc(): String = unwrap(this).getRepositoryCloneUrlGrc()

  /**
   * The HTTP clone URL.
   */
  public override fun repositoryCloneUrlHttp(): String = unwrap(this).getRepositoryCloneUrlHttp()

  /**
   * The SSH clone URL.
   */
  public override fun repositoryCloneUrlSsh(): String = unwrap(this).getRepositoryCloneUrlSsh()

  /**
   * The human-visible name of this Repository.
   */
  public override fun repositoryName(): String = unwrap(this).getRepositoryName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codecommit.Repository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The contents with which to initialize the repository after it has been created.
     *
     * Default: - No initialization (create empty repo)
     *
     * @param code The contents with which to initialize the repository after it has been created. 
     */
    public fun code(code: Code)

    /**
     * A description of the repository.
     *
     * Use the description to identify the
     * purpose of the repository.
     *
     * Default: - No description.
     *
     * @param description A description of the repository. 
     */
    public fun description(description: String)

    /**
     * The customer managed key used to encrypt and decrypt the data in repository.
     *
     * Default: - Use an AWS managed key
     *
     * @param kmsKey The customer managed key used to encrypt and decrypt the data in repository. 
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * Name of the repository.
     *
     * This property is required for all CodeCommit repositories.
     *
     * @param repositoryName Name of the repository. 
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.Repository.Builder =
        software.amazon.awscdk.services.codecommit.Repository.Builder.create(scope, id)

    /**
     * The contents with which to initialize the repository after it has been created.
     *
     * Default: - No initialization (create empty repo)
     *
     * @param code The contents with which to initialize the repository after it has been created. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code.Companion::unwrap))
    }

    /**
     * A description of the repository.
     *
     * Use the description to identify the
     * purpose of the repository.
     *
     * Default: - No description.
     *
     * @param description A description of the repository. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The customer managed key used to encrypt and decrypt the data in repository.
     *
     * Default: - Use an AWS managed key
     *
     * @param kmsKey The customer managed key used to encrypt and decrypt the data in repository. 
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * Name of the repository.
     *
     * This property is required for all CodeCommit repositories.
     *
     * @param repositoryName Name of the repository. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.Repository = cdkBuilder.build()
  }

  public companion object {
    public fun fromRepositoryArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      repositoryArn: String,
    ): IRepository =
        software.amazon.awscdk.services.codecommit.Repository.fromRepositoryArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, repositoryArn).let(IRepository::wrap)

    public fun fromRepositoryName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      repositoryName: String,
    ): IRepository =
        software.amazon.awscdk.services.codecommit.Repository.fromRepositoryName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, repositoryName).let(IRepository::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Repository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Repository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.Repository): Repository
        = Repository(cdkObject)

    internal fun unwrap(wrapped: Repository): software.amazon.awscdk.services.codecommit.Repository
        = wrapped.cdkObject as software.amazon.awscdk.services.codecommit.Repository
  }
}
