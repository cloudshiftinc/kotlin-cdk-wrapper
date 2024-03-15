@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPipelineProps {
  public fun artifactStore(): Any? = unwrap(this).getArtifactStore()

  public fun artifactStores(): Any? = unwrap(this).getArtifactStores()

  public fun disableInboundStageTransitions(): Any? =
      unwrap(this).getDisableInboundStageTransitions()

  public fun executionMode(): String? = unwrap(this).getExecutionMode()

  public fun name(): String? = unwrap(this).getName()

  public fun pipelineType(): String? = unwrap(this).getPipelineType()

  public fun restartExecutionOnUpdate(): Any? = unwrap(this).getRestartExecutionOnUpdate()

  public fun roleArn(): String

  public fun stages(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun triggers(): Any? = unwrap(this).getTriggers()

  public fun variables(): Any? = unwrap(this).getVariables()

  @CdkDslMarker
  public interface Builder {
    public fun artifactStore(artifactStore: IResolvable)

    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("792996bb8bb1bd403f7dc818fba256270703f3b7b6f718c07a85c7af1c1df399")
    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty.Builder.() -> Unit)

    public fun artifactStores(artifactStores: IResolvable)

    public fun artifactStores(artifactStores: List<Any>)

    public fun artifactStores(vararg artifactStores: Any)

    public fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable)

    public fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>)

    public fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any)

    public fun executionMode(executionMode: String)

    public fun name(name: String)

    public fun pipelineType(pipelineType: String)

    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean)

    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable)

    public fun roleArn(roleArn: String)

    public fun stages(stages: IResolvable)

    public fun stages(stages: List<Any>)

    public fun stages(vararg stages: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: List<Any>)

    public fun triggers(vararg triggers: Any)

    public fun variables(variables: IResolvable)

    public fun variables(variables: List<Any>)

    public fun variables(vararg variables: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.codepipeline.CfnPipelineProps.builder()

    override fun artifactStore(artifactStore: IResolvable) {
      cdkBuilder.artifactStore(artifactStore.let(IResolvable::unwrap))
    }

    override fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
      cdkBuilder.artifactStore(artifactStore.let(CfnPipeline.ArtifactStoreProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("792996bb8bb1bd403f7dc818fba256270703f3b7b6f718c07a85c7af1c1df399")
    override fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty.Builder.() -> Unit):
        Unit = artifactStore(CfnPipeline.ArtifactStoreProperty(artifactStore))

    override fun artifactStores(artifactStores: IResolvable) {
      cdkBuilder.artifactStores(artifactStores.let(IResolvable::unwrap))
    }

    override fun artifactStores(artifactStores: List<Any>) {
      cdkBuilder.artifactStores(artifactStores)
    }

    override fun artifactStores(vararg artifactStores: Any): Unit =
        artifactStores(artifactStores.toList())

    override fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions.let(IResolvable::unwrap))
    }

    override fun disableInboundStageTransitions(disableInboundStageTransitions: List<Any>) {
      cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions)
    }

    override fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any): Unit =
        disableInboundStageTransitions(disableInboundStageTransitions.toList())

    override fun executionMode(executionMode: String) {
      cdkBuilder.executionMode(executionMode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pipelineType(pipelineType: String) {
      cdkBuilder.pipelineType(pipelineType)
    }

    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    override fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate.let(IResolvable::unwrap))
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun stages(stages: IResolvable) {
      cdkBuilder.stages(stages.let(IResolvable::unwrap))
    }

    override fun stages(stages: List<Any>) {
      cdkBuilder.stages(stages)
    }

    override fun stages(vararg stages: Any): Unit = stages(stages.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable::unwrap))
    }

    override fun variables(variables: List<Any>) {
      cdkBuilder.variables(variables)
    }

    override fun variables(vararg variables: Any): Unit = variables(variables.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnPipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    override fun artifactStore(): Any? = unwrap(this).getArtifactStore()

    override fun artifactStores(): Any? = unwrap(this).getArtifactStores()

    override fun disableInboundStageTransitions(): Any? =
        unwrap(this).getDisableInboundStageTransitions()

    override fun executionMode(): String? = unwrap(this).getExecutionMode()

    override fun name(): String? = unwrap(this).getName()

    override fun pipelineType(): String? = unwrap(this).getPipelineType()

    override fun restartExecutionOnUpdate(): Any? = unwrap(this).getRestartExecutionOnUpdate()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun stages(): Any = unwrap(this).getStages()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun triggers(): Any? = unwrap(this).getTriggers()

    override fun variables(): Any? = unwrap(this).getVariables()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnPipelineProps):
        CfnPipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.codepipeline.CfnPipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CfnPipelineProps
  }
}
