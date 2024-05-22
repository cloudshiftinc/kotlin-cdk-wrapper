@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.services.codepipeline.Artifact

/**
 * A FileSet created from a CodePipeline artifact.
 *
 * You only need to use this if you want to add CDK Pipeline stages
 * add the end of an existing CodePipeline, which should be very rare.
 *
 * Example:
 *
 * ```
 * Pipeline codePipeline;
 * Artifact sourceArtifact = new Artifact("MySourceArtifact");
 * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .codePipeline(codePipeline)
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineFileSet.fromArtifact(sourceArtifact))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * .build();
 * ```
 */
public open class CodePipelineFileSet(
  cdkObject: software.amazon.awscdk.pipelines.CodePipelineFileSet,
) : FileSet(cdkObject) {
  public companion object {
    public fun fromArtifact(artifact: Artifact): CodePipelineFileSet =
        software.amazon.awscdk.pipelines.CodePipelineFileSet.fromArtifact(artifact.let(Artifact.Companion::unwrap)).let(CodePipelineFileSet::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodePipelineFileSet):
        CodePipelineFileSet = CodePipelineFileSet(cdkObject)

    internal fun unwrap(wrapped: CodePipelineFileSet):
        software.amazon.awscdk.pipelines.CodePipelineFileSet = wrapped.cdkObject as
        software.amazon.awscdk.pipelines.CodePipelineFileSet
  }
}
