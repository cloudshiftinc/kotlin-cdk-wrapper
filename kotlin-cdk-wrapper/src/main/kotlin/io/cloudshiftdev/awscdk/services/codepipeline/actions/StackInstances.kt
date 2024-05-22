@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import kotlin.String
import kotlin.collections.List

/**
 * Where Stack Instances will be created from the StackSet.
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
public abstract class StackInstances(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackInstances,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackInstances,
  ) : StackInstances(cdkObject)

  public companion object {
    public fun fromArtifactPath(artifactPath: ArtifactPath, regions: List<String>): StackInstances =
        software.amazon.awscdk.services.codepipeline.actions.StackInstances.fromArtifactPath(artifactPath.let(ArtifactPath.Companion::unwrap),
        regions).let(StackInstances::wrap)

    public fun inAccounts(accounts: List<String>, regions: List<String>): StackInstances =
        software.amazon.awscdk.services.codepipeline.actions.StackInstances.inAccounts(accounts,
        regions).let(StackInstances::wrap)

    public fun inOrganizationalUnits(ous: List<String>, regions: List<String>): StackInstances =
        software.amazon.awscdk.services.codepipeline.actions.StackInstances.inOrganizationalUnits(ous,
        regions).let(StackInstances::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackInstances):
        StackInstances = CdkObjectWrappers.wrap(cdkObject) as? StackInstances ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackInstances):
        software.amazon.awscdk.services.codepipeline.actions.StackInstances = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.actions.StackInstances
  }
}
