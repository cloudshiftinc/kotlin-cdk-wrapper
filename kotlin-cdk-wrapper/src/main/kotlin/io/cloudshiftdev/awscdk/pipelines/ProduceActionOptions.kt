@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ProduceActionOptions {
  public fun actionName(): String

  public fun artifacts(): ArtifactMap

  public fun beforeSelfMutation(): Boolean? = unwrap(this).getBeforeSelfMutation()

  public fun codeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  public fun fallbackArtifact(): Artifact? = unwrap(this).getFallbackArtifact()?.let(Artifact::wrap)

  public fun pipeline(): CodePipeline

  public fun runOrder(): Number

  public fun scope(): Construct

  public fun stackOutputsMap(): StackOutputsMap

  public fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun artifacts(artifacts: ArtifactMap)

    public fun beforeSelfMutation(beforeSelfMutation: Boolean)

    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9324b9d21c0f64710b713cfaadaec4e09e2a169a8c38c1691ce91fa3cb2d2606")
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    public fun fallbackArtifact(fallbackArtifact: Artifact)

    public fun pipeline(pipeline: CodePipeline)

    public fun runOrder(runOrder: Number)

    public fun scope(scope: Construct)

    public fun stackOutputsMap(stackOutputsMap: StackOutputsMap)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ProduceActionOptions.Builder =
        software.amazon.awscdk.pipelines.ProduceActionOptions.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun artifacts(artifacts: ArtifactMap) {
      cdkBuilder.artifacts(artifacts.let(ArtifactMap::unwrap))
    }

    override fun beforeSelfMutation(beforeSelfMutation: Boolean) {
      cdkBuilder.beforeSelfMutation(beforeSelfMutation)
    }

    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.codeBuildDefaults(codeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9324b9d21c0f64710b713cfaadaec4e09e2a169a8c38c1691ce91fa3cb2d2606")
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit): Unit =
        codeBuildDefaults(CodeBuildOptions(codeBuildDefaults))

    override fun fallbackArtifact(fallbackArtifact: Artifact) {
      cdkBuilder.fallbackArtifact(fallbackArtifact.let(Artifact::unwrap))
    }

    override fun pipeline(pipeline: CodePipeline) {
      cdkBuilder.pipeline(pipeline.let(CodePipeline::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    override fun stackOutputsMap(stackOutputsMap: StackOutputsMap) {
      cdkBuilder.stackOutputsMap(stackOutputsMap.let(StackOutputsMap::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.pipelines.ProduceActionOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ProduceActionOptions,
  ) : CdkObject(cdkObject), ProduceActionOptions {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun artifacts(): ArtifactMap = unwrap(this).getArtifacts().let(ArtifactMap::wrap)

    override fun beforeSelfMutation(): Boolean? = unwrap(this).getBeforeSelfMutation()

    override fun codeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    override fun fallbackArtifact(): Artifact? =
        unwrap(this).getFallbackArtifact()?.let(Artifact::wrap)

    override fun pipeline(): CodePipeline = unwrap(this).getPipeline().let(CodePipeline::wrap)

    override fun runOrder(): Number = unwrap(this).getRunOrder()

    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)

    override fun stackOutputsMap(): StackOutputsMap =
        unwrap(this).getStackOutputsMap().let(StackOutputsMap::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProduceActionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ProduceActionOptions):
        ProduceActionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProduceActionOptions):
        software.amazon.awscdk.pipelines.ProduceActionOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.ProduceActionOptions
  }
}
