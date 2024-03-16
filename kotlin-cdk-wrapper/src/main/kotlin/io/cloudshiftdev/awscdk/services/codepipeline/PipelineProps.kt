@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
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
public interface PipelineProps {
  /**
   * The S3 bucket used by this Pipeline to store artifacts.
   *
   * Default: - A new S3 bucket will be created.
   */
  public fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

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
   */
  public fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

  /**
   * A map of region to S3 bucket name used for cross-region CodePipeline.
   *
   * For every Action that you specify targeting a different region than the Pipeline itself,
   * if you don't provide an explicit Bucket for that region using this property,
   * the construct will automatically create a Stack containing an S3 Bucket in that region.
   *
   * Default: - None.
   */
  public fun crossRegionReplicationBuckets(): Map<String, IBucket> =
      unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
      emptyMap()

  /**
   * Enable KMS key rotation for the generated KMS keys.
   *
   * By default KMS key rotation is disabled, but will add an additional $1/month
   * for each year the key exists when enabled.
   *
   * Default: - false (key rotation is disabled)
   */
  public fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

  /**
   * The method that the pipeline will use to handle multiple executions.
   *
   * Default: - ExecutionMode.SUPERSEDED
   */
  public fun executionMode(): ExecutionMode? =
      unwrap(this).getExecutionMode()?.let(ExecutionMode::wrap)

  /**
   * Name of the pipeline.
   *
   * Default: - AWS CloudFormation generates an ID and uses that for the pipeline name.
   */
  public fun pipelineName(): String? = unwrap(this).getPipelineName()

  /**
   * Type of the pipeline.
   *
   * Default: - PipelineType.V1
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
   */
  public fun pipelineType(): PipelineType? = unwrap(this).getPipelineType()?.let(PipelineType::wrap)

  /**
   * Indicates whether to rerun the AWS CodePipeline pipeline after you update it.
   *
   * Default: false
   */
  public fun restartExecutionOnUpdate(): Boolean? = unwrap(this).getRestartExecutionOnUpdate()

  /**
   * Reuse the same cross region support stack for all pipelines in the App.
   *
   * Default: - true (Use the same support stack for all pipelines in App)
   */
  public fun reuseCrossRegionSupportStacks(): Boolean? =
      unwrap(this).getReuseCrossRegionSupportStacks()

  /**
   * The IAM role to be assumed by this Pipeline.
   *
   * Default: a new IAM role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The list of Stages, in order, to create this Pipeline with.
   *
   * You can always add more Stages later by calling `Pipeline#addStage`.
   *
   * Default: - None.
   */
  public fun stages(): List<StageProps> = unwrap(this).getStages()?.map(StageProps::wrap) ?:
      emptyList()

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
   */
  public fun triggers(): List<TriggerProps> = unwrap(this).getTriggers()?.map(TriggerProps::wrap) ?:
      emptyList()

  /**
   * A list that defines the pipeline variables for a pipeline resource.
   *
   * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
   * You can always add more variables later by calling `Pipeline#addVariable`.
   *
   * Default: - No variables
   */
  public fun variables(): List<Variable> = unwrap(this).getVariables()?.map(Variable::wrap) ?:
      emptyList()

  /**
   * A builder for [PipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifactBucket The S3 bucket used by this Pipeline to store artifacts.
     */
    public fun artifactBucket(artifactBucket: IBucket)

    /**
     * @param crossAccountKeys Create KMS keys for cross-account deployments.
     * This controls whether the pipeline is enabled for cross-account deployments.
     *
     * By default cross-account deployments are enabled, but this feature requires
     * that KMS Customer Master Keys are created which have a cost of $1/month.
     *
     * If you do not need cross-account deployments, you can set this to `false` to
     * not create those keys and save on that cost (the artifact bucket will be
     * encrypted with an AWS-managed key). However, cross-account deployments will
     * no longer be possible.
     */
    public fun crossAccountKeys(crossAccountKeys: Boolean)

    /**
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline.
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     */
    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>)

    /**
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys.
     * By default KMS key rotation is disabled, but will add an additional $1/month
     * for each year the key exists when enabled.
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean)

    /**
     * @param executionMode The method that the pipeline will use to handle multiple executions.
     */
    public fun executionMode(executionMode: ExecutionMode)

    /**
     * @param pipelineName Name of the pipeline.
     */
    public fun pipelineName(pipelineName: String)

    /**
     * @param pipelineType Type of the pipeline.
     */
    public fun pipelineType(pipelineType: PipelineType)

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the AWS CodePipeline pipeline
     * after you update it.
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean)

    /**
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App.
     */
    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean)

    /**
     * @param role The IAM role to be assumed by this Pipeline.
     */
    public fun role(role: IRole)

    /**
     * @param stages The list of Stages, in order, to create this Pipeline with.
     * You can always add more Stages later by calling `Pipeline#addStage`.
     */
    public fun stages(stages: List<StageProps>)

    /**
     * @param stages The list of Stages, in order, to create this Pipeline with.
     * You can always add more Stages later by calling `Pipeline#addStage`.
     */
    public fun stages(vararg stages: StageProps)

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     */
    public fun triggers(triggers: List<TriggerProps>)

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     */
    public fun triggers(vararg triggers: TriggerProps)

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     */
    public fun variables(variables: List<Variable>)

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     */
    public fun variables(vararg variables: Variable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.PipelineProps.Builder =
        software.amazon.awscdk.services.codepipeline.PipelineProps.builder()

    /**
     * @param artifactBucket The S3 bucket used by this Pipeline to store artifacts.
     */
    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket::unwrap))
    }

    /**
     * @param crossAccountKeys Create KMS keys for cross-account deployments.
     * This controls whether the pipeline is enabled for cross-account deployments.
     *
     * By default cross-account deployments are enabled, but this feature requires
     * that KMS Customer Master Keys are created which have a cost of $1/month.
     *
     * If you do not need cross-account deployments, you can set this to `false` to
     * not create those keys and save on that cost (the artifact bucket will be
     * encrypted with an AWS-managed key). However, cross-account deployments will
     * no longer be possible.
     */
    override fun crossAccountKeys(crossAccountKeys: Boolean) {
      cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    /**
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     * CodePipeline.
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     */
    override
        fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
      cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets.mapValues{IBucket.unwrap(it.value)})
    }

    /**
     * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys.
     * By default KMS key rotation is disabled, but will add an additional $1/month
     * for each year the key exists when enabled.
     */
    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * @param executionMode The method that the pipeline will use to handle multiple executions.
     */
    override fun executionMode(executionMode: ExecutionMode) {
      cdkBuilder.executionMode(executionMode.let(ExecutionMode::unwrap))
    }

    /**
     * @param pipelineName Name of the pipeline.
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * @param pipelineType Type of the pipeline.
     */
    override fun pipelineType(pipelineType: PipelineType) {
      cdkBuilder.pipelineType(pipelineType.let(PipelineType::unwrap))
    }

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the AWS CodePipeline pipeline
     * after you update it.
     */
    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
     * pipelines in the App.
     */
    override fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
      cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    /**
     * @param role The IAM role to be assumed by this Pipeline.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param stages The list of Stages, in order, to create this Pipeline with.
     * You can always add more Stages later by calling `Pipeline#addStage`.
     */
    override fun stages(stages: List<StageProps>) {
      cdkBuilder.stages(stages.map(StageProps::unwrap))
    }

    /**
     * @param stages The list of Stages, in order, to create this Pipeline with.
     * You can always add more Stages later by calling `Pipeline#addStage`.
     */
    override fun stages(vararg stages: StageProps): Unit = stages(stages.toList())

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     */
    override fun triggers(triggers: List<TriggerProps>) {
      cdkBuilder.triggers(triggers.map(TriggerProps::unwrap))
    }

    /**
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     * starts the pipeline.
     * When a trigger configuration is specified, default change detection for repository
     * and branch commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more triggers later by calling `Pipeline#addTrigger`.
     */
    override fun triggers(vararg triggers: TriggerProps): Unit = triggers(triggers.toList())

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     */
    override fun variables(variables: List<Variable>) {
      cdkBuilder.variables(variables.map(Variable::unwrap))
    }

    /**
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     */
    override fun variables(vararg variables: Variable): Unit = variables(variables.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.PipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.PipelineProps,
  ) : CdkObject(cdkObject), PipelineProps {
    /**
     * The S3 bucket used by this Pipeline to store artifacts.
     *
     * Default: - A new S3 bucket will be created.
     */
    override fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

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
     */
    override fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

    /**
     * A map of region to S3 bucket name used for cross-region CodePipeline.
     *
     * For every Action that you specify targeting a different region than the Pipeline itself,
     * if you don't provide an explicit Bucket for that region using this property,
     * the construct will automatically create a Stack containing an S3 Bucket in that region.
     *
     * Default: - None.
     */
    override fun crossRegionReplicationBuckets(): Map<String, IBucket> =
        unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
        emptyMap()

    /**
     * Enable KMS key rotation for the generated KMS keys.
     *
     * By default KMS key rotation is disabled, but will add an additional $1/month
     * for each year the key exists when enabled.
     *
     * Default: - false (key rotation is disabled)
     */
    override fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

    /**
     * The method that the pipeline will use to handle multiple executions.
     *
     * Default: - ExecutionMode.SUPERSEDED
     */
    override fun executionMode(): ExecutionMode? =
        unwrap(this).getExecutionMode()?.let(ExecutionMode::wrap)

    /**
     * Name of the pipeline.
     *
     * Default: - AWS CloudFormation generates an ID and uses that for the pipeline name.
     */
    override fun pipelineName(): String? = unwrap(this).getPipelineName()

    /**
     * Type of the pipeline.
     *
     * Default: - PipelineType.V1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     */
    override fun pipelineType(): PipelineType? =
        unwrap(this).getPipelineType()?.let(PipelineType::wrap)

    /**
     * Indicates whether to rerun the AWS CodePipeline pipeline after you update it.
     *
     * Default: false
     */
    override fun restartExecutionOnUpdate(): Boolean? = unwrap(this).getRestartExecutionOnUpdate()

    /**
     * Reuse the same cross region support stack for all pipelines in the App.
     *
     * Default: - true (Use the same support stack for all pipelines in App)
     */
    override fun reuseCrossRegionSupportStacks(): Boolean? =
        unwrap(this).getReuseCrossRegionSupportStacks()

    /**
     * The IAM role to be assumed by this Pipeline.
     *
     * Default: a new IAM role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The list of Stages, in order, to create this Pipeline with.
     *
     * You can always add more Stages later by calling `Pipeline#addStage`.
     *
     * Default: - None.
     */
    override fun stages(): List<StageProps> = unwrap(this).getStages()?.map(StageProps::wrap) ?:
        emptyList()

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
     */
    override fun triggers(): List<TriggerProps> =
        unwrap(this).getTriggers()?.map(TriggerProps::wrap) ?: emptyList()

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`.
     * You can always add more variables later by calling `Pipeline#addVariable`.
     *
     * Default: - No variables
     */
    override fun variables(): List<Variable> = unwrap(this).getVariables()?.map(Variable::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.PipelineProps):
        PipelineProps = CdkObjectWrappers.wrap(cdkObject) as PipelineProps

    internal fun unwrap(wrapped: PipelineProps):
        software.amazon.awscdk.services.codepipeline.PipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.PipelineProps
  }
}
