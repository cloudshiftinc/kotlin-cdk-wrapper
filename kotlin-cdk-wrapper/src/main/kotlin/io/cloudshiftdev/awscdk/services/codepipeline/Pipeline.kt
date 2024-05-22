@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS CodePipeline pipeline with its associated IAM role and S3 bucket.
 *
 * Example:
 *
 * ```
 * // create a pipeline
 * import io.cloudshiftdev.awscdk.services.codecommit.*;
 * // add a source action to the stage
 * Repository repo;
 * Artifact sourceArtifact;
 * Pipeline pipeline = new Pipeline(this, "Pipeline");
 * // add a stage
 * IStage sourceStage = pipeline.addStage(StageOptions.builder().stageName("Source").build());
 * sourceStage.addAction(CodeCommitSourceAction.Builder.create()
 * .actionName("Source")
 * .output(sourceArtifact)
 * .repository(repo)
 * .build());
 * ```
 */
public open class Pipeline(
  cdkObject: software.amazon.awscdk.services.codepipeline.Pipeline,
) : Resource(cdkObject), IPipeline {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codepipeline.Pipeline(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PipelineProps,
  ) :
      this(software.amazon.awscdk.services.codepipeline.Pipeline(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(PipelineProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PipelineProps.Builder.() -> Unit,
  ) : this(scope, id, PipelineProps(props)
  )

  /**
   * Creates a new Stage, and adds it to this Pipeline.
   *
   * @return the newly created Stage
   * @param props the creation properties of the new Stage. 
   */
  public open fun addStage(props: StageOptions): IStage =
      unwrap(this).addStage(props.let(StageOptions.Companion::unwrap)).let(IStage::wrap)

  /**
   * Creates a new Stage, and adds it to this Pipeline.
   *
   * @return the newly created Stage
   * @param props the creation properties of the new Stage. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d746d7793c10e92694911ff00b31e983ce4a71b3e189225ee06635618e54ee99")
  public open fun addStage(props: StageOptions.Builder.() -> Unit): IStage =
      addStage(StageOptions(props))

  /**
   * Adds a statement to the pipeline role.
   *
   * @param statement 
   */
  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement.Companion::unwrap))
  }

  /**
   * Adds a statement to the pipeline role.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * Adds a new Trigger to this Pipeline.
   *
   * @return the newly created trigger
   * @param props Trigger property to add to this Pipeline. 
   */
  public open fun addTrigger(props: TriggerProps): Trigger =
      unwrap(this).addTrigger(props.let(TriggerProps.Companion::unwrap)).let(Trigger::wrap)

  /**
   * Adds a new Trigger to this Pipeline.
   *
   * @return the newly created trigger
   * @param props Trigger property to add to this Pipeline. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90c387d98e77db28e68b17d9c53833e02abe9083fd650da6af68cc487f096e43")
  public open fun addTrigger(props: TriggerProps.Builder.() -> Unit): Trigger =
      addTrigger(TriggerProps(props))

  /**
   * Adds a new Variable to this Pipeline.
   *
   * @return the newly created variable
   * @param variable Variable instance to add to this Pipeline. 
   */
  public open fun addVariable(variable: Variable): Variable =
      unwrap(this).addVariable(variable.let(Variable.Companion::unwrap)).let(Variable::wrap)

  /**
   * Adds a new Variable to this Pipeline.
   *
   * @return the newly created variable
   * @param variable Variable instance to add to this Pipeline. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d89729de9fe01a92c214a6f435ad98428130e77943cbe1c6ef54a2c762b8c62")
  public open fun addVariable(variable: Variable.Builder.() -> Unit): Variable =
      addVariable(Variable(variable))

  /**
   * Bucket used to store output artifacts.
   */
  public open fun artifactBucket(): IBucket = unwrap(this).getArtifactBucket().let(IBucket::wrap)

  /**
   * Returns a source configuration for notification rule.
   *
   * @param _scope 
   */
  public override fun bindAsNotificationRuleSource(scope: CloudshiftdevConstructsConstruct):
      NotificationRuleSourceConfig =
      unwrap(this).bindAsNotificationRuleSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap)).let(NotificationRuleSourceConfig::wrap)

  /**
   * Returns all of the `CrossRegionSupportStack`s that were generated automatically when dealing
   * with Actions that reside in a different region than the Pipeline itself.
   */
  public open fun crossRegionSupport(): Map<String, CrossRegionSupport> =
      unwrap(this).getCrossRegionSupport().mapValues{CrossRegionSupport.wrap(it.value)}

  /**
   * Defines a CodeStar notification rule triggered when the pipeline events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
   * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange`
   * to define rules for these specific event emitted.
   *
   * @param id 
   * @param target 
   * @param options 
   */
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: PipelineNotifyOnOptions,
  ): INotificationRule = unwrap(this).notifyOn(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(PipelineNotifyOnOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Defines a CodeStar notification rule triggered when the pipeline events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
   * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange`
   * to define rules for these specific event emitted.
   *
   * @param id 
   * @param target 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("802e79d0a19fb60a123ba5d2a95f474d31780c23201b1ff29c431fd17d6a7d12")
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: PipelineNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOn(id, target, PipelineNotifyOnOptions(options))

  /**
   * Define an notification rule triggered by the set of the "Action execution" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnAnyActionStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnAnyActionStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Action execution" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnAnyActionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnAnyActionStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Action execution" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11ac33b7899456d98c0e8413c5ecfbb4f8332d6e26cd7827148420c235e95215")
  public override fun notifyOnAnyActionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnAnyActionStateChange(id, target, NotificationRuleOptions(options))

  /**
   * Define an notification rule triggered by the set of the "Manual approval" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnAnyManualApprovalStateChange(id: String,
      target: INotificationRuleTarget): INotificationRule =
      unwrap(this).notifyOnAnyManualApprovalStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Manual approval" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnAnyManualApprovalStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnAnyManualApprovalStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Manual approval" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10713caf6597b23ffa1ea821ac0383066a8adc80d9d8673c7888936bd6188ae9")
  public override fun notifyOnAnyManualApprovalStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnAnyManualApprovalStateChange(id, target,
      NotificationRuleOptions(options))

  /**
   * Define an notification rule triggered by the set of the "Stage execution" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnAnyStageStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnAnyStageStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Stage execution" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnAnyStageStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnAnyStageStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Stage execution" events emitted from
   * this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95ca28a7a850434fd61ebbdf04c624d6be0ced4e688a3beab746211fa10c0e4c")
  public override fun notifyOnAnyStageStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnAnyStageStateChange(id, target, NotificationRuleOptions(options))

  /**
   * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
   * from this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnExecutionStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnExecutionStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
   * from this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  public override fun notifyOnExecutionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnExecutionStateChange(id,
      target.let(INotificationRuleTarget.Companion::unwrap),
      options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

  /**
   * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
   * from this pipeline.
   *
   * @param id 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29f3724b89990617eca228394912da43fc34ad8f0843b7e906964ad64fdd522c")
  public override fun notifyOnExecutionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnExecutionStateChange(id, target, NotificationRuleOptions(options))

  /**
   * Defines an event rule triggered by this CodePipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  /**
   * Defines an event rule triggered by this CodePipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines an event rule triggered by this CodePipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  /**
   * Defines an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
   * emitted from this pipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public override fun onStateChange(id: String): Rule =
      unwrap(this).onStateChange(id).let(Rule::wrap)

  /**
   * Defines an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
   * emitted from this pipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public override fun onStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onStateChange(id, options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

  /**
   * Defines an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
   * emitted from this pipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onStateChange(id, OnEventOptions(options))

  /**
   * ARN of this pipeline.
   */
  public override fun pipelineArn(): String = unwrap(this).getPipelineArn()

  /**
   * The name of the pipeline.
   */
  public override fun pipelineName(): String = unwrap(this).getPipelineName()

  /**
   * The version of the pipeline.
   */
  public open fun pipelineVersion(): String = unwrap(this).getPipelineVersion()

  /**
   * The IAM role AWS CodePipeline will use to perform actions or assume roles for actions with a
   * more specific IAM role.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * Access one of the pipeline's stages by stage name.
   *
   * @param stageName 
   */
  public open fun stage(stageName: String): IStage = unwrap(this).stage(stageName).let(IStage::wrap)

  /**
   * Get the number of Stages in this Pipeline.
   */
  public open fun stageCount(): Number = unwrap(this).getStageCount()

  /**
   * Returns the stages that comprise the pipeline.
   *
   * **Note**: the returned array is a defensive copy,
   * so adding elements to it has no effect.
   * Instead, use the `addStage` method if you want to add more stages
   * to the pipeline.
   */
  public open fun stages(): List<IStage> = unwrap(this).getStages().map(IStage::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.Pipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The S3 bucket used by this Pipeline to store artifacts.
     *
     * Default: - A new S3 bucket will be created.
     *
     * @param artifactBucket The S3 bucket used by this Pipeline to store artifacts. 
     */
    public fun artifactBucket(artifactBucket: IBucket)

    /**
     * Create KMS keys for cross-account deployments.
     *
     * This controls whether the pipeline is enabled for cross-account deployments.
     *
     * By default cross-account deployments are enabled, but this feature requires
     * that KMS Customer Master Keys are created which have a cost of $1/month.
     *
     * If you do not need cross-account deployments, you can set this to `false` to
     * not create those keys and save on that cost (the artifact bucket will be
     * encrypted with an AWS-managed key). However, cross-account deployments will
     * no longer be possible.
     *
     * Default: false - false if the feature flag
     * `CODEPIPELINE_CROSS_ACCOUNT_KEYS_DEFAULT_VALUE_TO_FALSE`
     * is true, true otherwise
     *
     * @param crossAccountKeys Create KMS keys for cross-account deployments. 
     */
    public fun crossAccountKeys(crossAccountKeys: Boolean)

    /**
     * A map of region to S3 bucket name used for cross-region CodePipeline.
     *
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     *
     * Default: - None.
     *
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline. 
     */
    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>)

    /**
     * Enable KMS key rotation for the generated KMS keys.
     *
     * By default KMS key rotation is disabled, but will add an additional $1/month
     * for each year the key exists when enabled.
     *
     * Default: - false (key rotation is disabled)
     *
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys. 
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean)

    /**
     * The method that the pipeline will use to handle multiple executions.
     *
     * Default: - ExecutionMode.SUPERSEDED
     *
     * @param executionMode The method that the pipeline will use to handle multiple executions. 
     */
    public fun executionMode(executionMode: ExecutionMode)

    /**
     * Name of the pipeline.
     *
     * Default: - AWS CloudFormation generates an ID and uses that for the pipeline name.
     *
     * @param pipelineName Name of the pipeline. 
     */
    public fun pipelineName(pipelineName: String)

    /**
     * Type of the pipeline.
     *
     * Default: - PipelineType.V2 if the feature flag `CODEPIPELINE_DEFAULT_PIPELINE_TYPE_TO_V2`
     * is true, PipelineType.V1 otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * @param pipelineType Type of the pipeline. 
     */
    public fun pipelineType(pipelineType: PipelineType)

    /**
     * Indicates whether to rerun the AWS CodePipeline pipeline after you update it.
     *
     * Default: false
     *
     * @param restartExecutionOnUpdate Indicates whether to rerun the AWS CodePipeline pipeline
     * after you update it. 
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean)

    /**
     * Reuse the same cross region support stack for all pipelines in the App.
     *
     * Default: - true (Use the same support stack for all pipelines in App)
     *
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App. 
     */
    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean)

    /**
     * The IAM role to be assumed by this Pipeline.
     *
     * Default: a new IAM role will be created.
     *
     * @param role The IAM role to be assumed by this Pipeline. 
     */
    public fun role(role: IRole)

    /**
     * The list of Stages, in order, to create this Pipeline with.
     *
     * You can always add more Stages later by calling `Pipeline#addStage`.
     *
     * Default: - None.
     *
     * @param stages The list of Stages, in order, to create this Pipeline with. 
     */
    public fun stages(stages: List<StageProps>)

    /**
     * The list of Stages, in order, to create this Pipeline with.
     *
     * You can always add more Stages later by calling `Pipeline#addStage`.
     *
     * Default: - None.
     *
     * @param stages The list of Stages, in order, to create this Pipeline with. 
     */
    public fun stages(vararg stages: StageProps)

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     *
     * Default: - No triggers
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    public fun triggers(triggers: List<TriggerProps>)

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     *
     * Default: - No triggers
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    public fun triggers(vararg triggers: TriggerProps)

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     *
     * Default: - No variables
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    public fun variables(variables: List<Variable>)

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     *
     * Default: - No variables
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    public fun variables(vararg variables: Variable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Pipeline.Builder =
        software.amazon.awscdk.services.codepipeline.Pipeline.Builder.create(scope, id)

    /**
     * The S3 bucket used by this Pipeline to store artifacts.
     *
     * Default: - A new S3 bucket will be created.
     *
     * @param artifactBucket The S3 bucket used by this Pipeline to store artifacts. 
     */
    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * Create KMS keys for cross-account deployments.
     *
     * This controls whether the pipeline is enabled for cross-account deployments.
     *
     * By default cross-account deployments are enabled, but this feature requires
     * that KMS Customer Master Keys are created which have a cost of $1/month.
     *
     * If you do not need cross-account deployments, you can set this to `false` to
     * not create those keys and save on that cost (the artifact bucket will be
     * encrypted with an AWS-managed key). However, cross-account deployments will
     * no longer be possible.
     *
     * Default: false - false if the feature flag
     * `CODEPIPELINE_CROSS_ACCOUNT_KEYS_DEFAULT_VALUE_TO_FALSE`
     * is true, true otherwise
     *
     * @param crossAccountKeys Create KMS keys for cross-account deployments. 
     */
    override fun crossAccountKeys(crossAccountKeys: Boolean) {
      cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    /**
     * A map of region to S3 bucket name used for cross-region CodePipeline.
     *
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     *
     * Default: - None.
     *
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline. 
     */
    override
        fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
      cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets.mapValues{IBucket.unwrap(it.value)})
    }

    /**
     * Enable KMS key rotation for the generated KMS keys.
     *
     * By default KMS key rotation is disabled, but will add an additional $1/month
     * for each year the key exists when enabled.
     *
     * Default: - false (key rotation is disabled)
     *
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys. 
     */
    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * The method that the pipeline will use to handle multiple executions.
     *
     * Default: - ExecutionMode.SUPERSEDED
     *
     * @param executionMode The method that the pipeline will use to handle multiple executions. 
     */
    override fun executionMode(executionMode: ExecutionMode) {
      cdkBuilder.executionMode(executionMode.let(ExecutionMode.Companion::unwrap))
    }

    /**
     * Name of the pipeline.
     *
     * Default: - AWS CloudFormation generates an ID and uses that for the pipeline name.
     *
     * @param pipelineName Name of the pipeline. 
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * Type of the pipeline.
     *
     * Default: - PipelineType.V2 if the feature flag `CODEPIPELINE_DEFAULT_PIPELINE_TYPE_TO_V2`
     * is true, PipelineType.V1 otherwise
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     * @param pipelineType Type of the pipeline. 
     */
    override fun pipelineType(pipelineType: PipelineType) {
      cdkBuilder.pipelineType(pipelineType.let(PipelineType.Companion::unwrap))
    }

    /**
     * Indicates whether to rerun the AWS CodePipeline pipeline after you update it.
     *
     * Default: false
     *
     * @param restartExecutionOnUpdate Indicates whether to rerun the AWS CodePipeline pipeline
     * after you update it. 
     */
    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * Reuse the same cross region support stack for all pipelines in the App.
     *
     * Default: - true (Use the same support stack for all pipelines in App)
     *
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App. 
     */
    override fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
      cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    /**
     * The IAM role to be assumed by this Pipeline.
     *
     * Default: a new IAM role will be created.
     *
     * @param role The IAM role to be assumed by this Pipeline. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The list of Stages, in order, to create this Pipeline with.
     *
     * You can always add more Stages later by calling `Pipeline#addStage`.
     *
     * Default: - None.
     *
     * @param stages The list of Stages, in order, to create this Pipeline with. 
     */
    override fun stages(stages: List<StageProps>) {
      cdkBuilder.stages(stages.map(StageProps.Companion::unwrap))
    }

    /**
     * The list of Stages, in order, to create this Pipeline with.
     *
     * You can always add more Stages later by calling `Pipeline#addStage`.
     *
     * Default: - None.
     *
     * @param stages The list of Stages, in order, to create this Pipeline with. 
     */
    override fun stages(vararg stages: StageProps): Unit = stages(stages.toList())

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     *
     * Default: - No triggers
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    override fun triggers(triggers: List<TriggerProps>) {
      cdkBuilder.triggers(triggers.map(TriggerProps.Companion::unwrap))
    }

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     *
     * Default: - No triggers
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline. 
     */
    override fun triggers(vararg triggers: TriggerProps): Unit = triggers(triggers.toList())

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     *
     * Default: - No variables
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    override fun variables(variables: List<Variable>) {
      cdkBuilder.variables(variables.map(Variable.Companion::unwrap))
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     *
     * Default: - No variables
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource. 
     */
    override fun variables(vararg variables: Variable): Unit = variables(variables.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.Pipeline = cdkBuilder.build()
  }

  public companion object {
    public fun fromPipelineArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      pipelineArn: String,
    ): IPipeline =
        software.amazon.awscdk.services.codepipeline.Pipeline.fromPipelineArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, pipelineArn).let(IPipeline::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Pipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Pipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Pipeline): Pipeline =
        Pipeline(cdkObject)

    internal fun unwrap(wrapped: Pipeline): software.amazon.awscdk.services.codepipeline.Pipeline =
        wrapped.cdkObject as software.amazon.awscdk.services.codepipeline.Pipeline
  }
}
