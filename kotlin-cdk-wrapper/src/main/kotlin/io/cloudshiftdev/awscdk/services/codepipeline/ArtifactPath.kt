@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * A specific file within an output artifact.
 *
 * The most common use case for this is specifying the template file
 * for a CloudFormation action.
 *
 * Example:
 *
 * ```
 * // Source stage: read from repository
 * Repository repo = Repository.Builder.create(stack, "TemplateRepo")
 * .repositoryName("template-repo")
 * .build();
 * Artifact sourceOutput = new Artifact("SourceArtifact");
 * CodeCommitSourceAction source = CodeCommitSourceAction.Builder.create()
 * .actionName("Source")
 * .repository(repo)
 * .output(sourceOutput)
 * .trigger(CodeCommitTrigger.POLL)
 * .build();
 * Map&lt;String, Object&gt; sourceStage = Map.of(
 * "stageName", "Source",
 * "actions", List.of(source));
 * // Deployment stage: create and deploy changeset with manual approval
 * String stackName = "OurStack";
 * String changeSetName = "StagedChangeSet";
 * Map&lt;String, Object&gt; prodStage = Map.of(
 * "stageName", "Deploy",
 * "actions", List.of(
 * CloudFormationCreateReplaceChangeSetAction.Builder.create()
 * .actionName("PrepareChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .adminPermissions(true)
 * .templatePath(sourceOutput.atPath("template.yaml"))
 * .runOrder(1)
 * .build(),
 * ManualApprovalAction.Builder.create()
 * .actionName("ApproveChanges")
 * .runOrder(2)
 * .build(),
 * CloudFormationExecuteChangeSetAction.Builder.create()
 * .actionName("ExecuteChanges")
 * .stackName(stackName)
 * .changeSetName(changeSetName)
 * .runOrder(3)
 * .build()));
 * Pipeline.Builder.create(stack, "Pipeline")
 * .crossAccountKeys(true)
 * .stages(List.of(sourceStage, prodStage))
 * .build();
 * ```
 */
public open class ArtifactPath(
  cdkObject: software.amazon.awscdk.services.codepipeline.ArtifactPath,
) : CdkObject(cdkObject) {
  public constructor(artifact: Artifact, fileName: String) :
      this(software.amazon.awscdk.services.codepipeline.ArtifactPath(artifact.let(Artifact.Companion::unwrap),
      fileName)
  )

  /**
   *
   */
  public open fun artifact(): Artifact = unwrap(this).getArtifact().let(Artifact::wrap)

  /**
   *
   */
  public open fun fileName(): String = unwrap(this).getFileName()

  /**
   *
   */
  public open fun location(): String = unwrap(this).getLocation()

  public companion object {
    public fun artifactPath(artifactName: String, fileName: String): ArtifactPath =
        software.amazon.awscdk.services.codepipeline.ArtifactPath.artifactPath(artifactName,
        fileName).let(ArtifactPath::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ArtifactPath):
        ArtifactPath = ArtifactPath(cdkObject)

    internal fun unwrap(wrapped: ArtifactPath):
        software.amazon.awscdk.services.codepipeline.ArtifactPath = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.ArtifactPath
  }
}
