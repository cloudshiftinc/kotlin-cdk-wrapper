@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath

/**
 * The source of a StackSet template.
 *
 * Example:
 *
 * ```
 * Pipeline pipeline;
 * Artifact sourceOutput;
 * pipeline.addStage(StageOptions.builder()
 * .stageName("DeployStackSets")
 * .actions(List.of(
 * // First, update the StackSet itself with the newest template
 * CloudFormationDeployStackSetAction.Builder.create()
 * .actionName("UpdateStackSet")
 * .runOrder(1)
 * .stackSetName("MyStackSet")
 * .template(StackSetTemplate.fromArtifactPath(sourceOutput.atPath("template.yaml")))
 * // Change this to 'StackSetDeploymentModel.organizations()' if you want to deploy to OUs
 * .deploymentModel(StackSetDeploymentModel.selfManaged())
 * // This deploys to a set of accounts
 * .stackInstances(StackInstances.inAccounts(List.of("111111111111"), List.of("us-east-1",
 * "eu-west-1")))
 * .build(),
 * // Afterwards, update/create additional instances in other accounts
 * CloudFormationDeployStackInstancesAction.Builder.create()
 * .actionName("AddMoreInstances")
 * .runOrder(2)
 * .stackSetName("MyStackSet")
 * .stackInstances(StackInstances.inAccounts(List.of("222222222222", "333333333333"),
 * List.of("us-east-1", "eu-west-1")))
 * .build()))
 * .build());
 * ```
 */
public abstract class StackSetTemplate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate,
  ) : StackSetTemplate(cdkObject)

  public companion object {
    public fun fromArtifactPath(artifactPath: ArtifactPath): StackSetTemplate =
        software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate.fromArtifactPath(artifactPath.let(ArtifactPath::unwrap)).let(StackSetTemplate::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate):
        StackSetTemplate = CdkObjectWrappers.wrap(cdkObject) as? StackSetTemplate ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSetTemplate):
        software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate
  }
}
