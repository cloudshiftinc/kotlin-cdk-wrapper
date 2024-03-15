@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface PipelineProps {
  public fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

  public fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

  public fun crossRegionReplicationBuckets(): Map<String, IBucket> =
      unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
      emptyMap()

  public fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

  public fun executionMode(): ExecutionMode? =
      unwrap(this).getExecutionMode()?.let(ExecutionMode::wrap)

  public fun pipelineName(): String? = unwrap(this).getPipelineName()

  public fun pipelineType(): PipelineType? = unwrap(this).getPipelineType()?.let(PipelineType::wrap)

  public fun restartExecutionOnUpdate(): Boolean? = unwrap(this).getRestartExecutionOnUpdate()

  public fun reuseCrossRegionSupportStacks(): Boolean? =
      unwrap(this).getReuseCrossRegionSupportStacks()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun stages(): List<StageProps> = unwrap(this).getStages()?.map(StageProps::wrap) ?:
      emptyList()

  public fun triggers(): List<TriggerProps> = unwrap(this).getTriggers()?.map(TriggerProps::wrap) ?:
      emptyList()

  public fun variables(): List<Variable> = unwrap(this).getVariables()?.map(Variable::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun artifactBucket(artifactBucket: IBucket)

    public fun crossAccountKeys(crossAccountKeys: Boolean)

    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>)

    public fun enableKeyRotation(enableKeyRotation: Boolean)

    public fun executionMode(executionMode: ExecutionMode)

    public fun pipelineName(pipelineName: String)

    public fun pipelineType(pipelineType: PipelineType)

    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean)

    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean)

    public fun role(role: IRole)

    public fun stages(stages: List<StageProps>)

    public fun stages(vararg stages: StageProps)

    public fun triggers(triggers: List<TriggerProps>)

    public fun triggers(vararg triggers: TriggerProps)

    public fun variables(variables: List<Variable>)

    public fun variables(vararg variables: Variable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.PipelineProps.Builder =
        software.amazon.awscdk.services.codepipeline.PipelineProps.builder()

    override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket::unwrap))
    }

    override fun crossAccountKeys(crossAccountKeys: Boolean) {
      cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    override
        fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
      cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets.mapValues{IBucket.unwrap(it.value)})
    }

    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    override fun executionMode(executionMode: ExecutionMode) {
      cdkBuilder.executionMode(executionMode.let(ExecutionMode::unwrap))
    }

    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    override fun pipelineType(pipelineType: PipelineType) {
      cdkBuilder.pipelineType(pipelineType.let(PipelineType::unwrap))
    }

    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    override fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
      cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun stages(stages: List<StageProps>) {
      cdkBuilder.stages(stages.map(StageProps::unwrap))
    }

    override fun stages(vararg stages: StageProps): Unit = stages(stages.toList())

    override fun triggers(triggers: List<TriggerProps>) {
      cdkBuilder.triggers(triggers.map(TriggerProps::unwrap))
    }

    override fun triggers(vararg triggers: TriggerProps): Unit = triggers(triggers.toList())

    override fun variables(variables: List<Variable>) {
      cdkBuilder.variables(variables.map(Variable::unwrap))
    }

    override fun variables(vararg variables: Variable): Unit = variables(variables.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.PipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.PipelineProps,
  ) : CdkObject(cdkObject), PipelineProps {
    override fun artifactBucket(): IBucket? = unwrap(this).getArtifactBucket()?.let(IBucket::wrap)

    override fun crossAccountKeys(): Boolean? = unwrap(this).getCrossAccountKeys()

    override fun crossRegionReplicationBuckets(): Map<String, IBucket> =
        unwrap(this).getCrossRegionReplicationBuckets()?.mapValues{IBucket.wrap(it.value)} ?:
        emptyMap()

    override fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

    override fun executionMode(): ExecutionMode? =
        unwrap(this).getExecutionMode()?.let(ExecutionMode::wrap)

    override fun pipelineName(): String? = unwrap(this).getPipelineName()

    override fun pipelineType(): PipelineType? =
        unwrap(this).getPipelineType()?.let(PipelineType::wrap)

    override fun restartExecutionOnUpdate(): Boolean? = unwrap(this).getRestartExecutionOnUpdate()

    override fun reuseCrossRegionSupportStacks(): Boolean? =
        unwrap(this).getReuseCrossRegionSupportStacks()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun stages(): List<StageProps> = unwrap(this).getStages()?.map(StageProps::wrap) ?:
        emptyList()

    override fun triggers(): List<TriggerProps> =
        unwrap(this).getTriggers()?.map(TriggerProps::wrap) ?: emptyList()

    override fun variables(): List<Variable> = unwrap(this).getVariables()?.map(Variable::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.PipelineProps):
        PipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PipelineProps):
        software.amazon.awscdk.services.codepipeline.PipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.PipelineProps
  }
}
