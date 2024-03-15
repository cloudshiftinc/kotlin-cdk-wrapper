@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import kotlin.String
import kotlin.Unit

public interface CodeDeployEcsContainerImageInput {
  public fun input(): Artifact

  public fun taskDefinitionPlaceholder(): String? = unwrap(this).getTaskDefinitionPlaceholder()

  @CdkDslMarker
  public interface Builder {
    public fun input(input: Artifact)

    public fun taskDefinitionPlaceholder(taskDefinitionPlaceholder: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput.builder()

    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    override fun taskDefinitionPlaceholder(taskDefinitionPlaceholder: String) {
      cdkBuilder.taskDefinitionPlaceholder(taskDefinitionPlaceholder)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput,
  ) : CdkObject(cdkObject), CodeDeployEcsContainerImageInput {
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    override fun taskDefinitionPlaceholder(): String? = unwrap(this).getTaskDefinitionPlaceholder()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeDeployEcsContainerImageInput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput):
        CodeDeployEcsContainerImageInput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeDeployEcsContainerImageInput):
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput
  }
}
