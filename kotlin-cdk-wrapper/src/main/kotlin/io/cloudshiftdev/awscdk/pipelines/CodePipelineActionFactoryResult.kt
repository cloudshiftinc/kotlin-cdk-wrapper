@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import kotlin.Number
import kotlin.Unit

public interface CodePipelineActionFactoryResult {
  public fun project(): IProject? = unwrap(this).getProject()?.let(IProject::wrap)

  public fun runOrdersConsumed(): Number

  @CdkDslMarker
  public interface Builder {
    public fun project(project: IProject)

    public fun runOrdersConsumed(runOrdersConsumed: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult.Builder
        = software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult.builder()

    override fun project(project: IProject) {
      cdkBuilder.project(project.let(IProject::unwrap))
    }

    override fun runOrdersConsumed(runOrdersConsumed: Number) {
      cdkBuilder.runOrdersConsumed(runOrdersConsumed)
    }

    public fun build(): software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult,
  ) : CdkObject(cdkObject), CodePipelineActionFactoryResult {
    override fun project(): IProject? = unwrap(this).getProject()?.let(IProject::wrap)

    override fun runOrdersConsumed(): Number = unwrap(this).getRunOrdersConsumed()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodePipelineActionFactoryResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult):
        CodePipelineActionFactoryResult = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodePipelineActionFactoryResult):
        software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
  }
}
