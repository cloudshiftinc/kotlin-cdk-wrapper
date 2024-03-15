@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.services.codepipeline.Artifact

public open class CodePipelineFileSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.CodePipelineFileSet,
) : FileSet(cdkObject) {
  public companion object {
    public fun fromArtifact(artifact: Artifact): CodePipelineFileSet =
        software.amazon.awscdk.pipelines.CodePipelineFileSet.fromArtifact(artifact.let(Artifact::unwrap)).let(CodePipelineFileSet::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineFileSet):
        CodePipelineFileSet = CodePipelineFileSet(cdkObject)

    internal fun unwrap(wrapped: CodePipelineFileSet):
        software.amazon.awscdk.pipelines.CodePipelineFileSet = wrapped.cdkObject
  }
}
