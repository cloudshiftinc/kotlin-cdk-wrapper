@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
import software.amazon.awscdk.services.codepipeline.actions.StackInstances
import software.amazon.awscdk.services.codepipeline.actions.StackSetParameters
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for the CloudFormationDeployStackInstancesAction.
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
@CdkDslMarker
public class CloudFormationDeployStackInstancesActionPropsDsl {
  private val cdkBuilder: CloudFormationDeployStackInstancesActionProps.Builder =
      CloudFormationDeployStackInstancesActionProps.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
   * operation can fail before AWS CloudFormation stops the operation in that Region.
   * If
   * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
   * subsequent Regions. When calculating the number
   * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole
   * number.
   */
  public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
    cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
  }

  /**
   * @param maxAccountConcurrencyPercentage The maximum percentage of accounts in which to perform
   * this operation at one time.
   * When calculating the number of accounts based on the specified
   * percentage, AWS CloudFormation rounds down to the next whole number. If rounding down would
   * result in zero, AWS CloudFormation sets the number as
   * one instead. Although you use this setting to specify the maximum, for large deployments the
   * actual number of accounts acted upon concurrently
   * may be lower due to service throttling.
   */
  public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
    cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
  }

  /**
   * @param parameterOverrides Parameter values that only apply to the current Stack Instances.
   * These parameters are shared between all instances added by this action.
   */
  public fun parameterOverrides(parameterOverrides: StackSetParameters) {
    cdkBuilder.parameterOverrides(parameterOverrides)
  }

  /**
   * @param role The Role in which context's this Action will be executing in.
   * The Pipeline's Role will assume this Role
   * (the required permissions for that will be granted automatically)
   * right before executing this Action.
   * This Action will be passed into your `IAction.bind`
   * method in the `ActionBindOptions.role` property.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param stackInstances Specify where to create or update Stack Instances. 
   * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
   */
  public fun stackInstances(stackInstances: StackInstances) {
    cdkBuilder.stackInstances(stackInstances)
  }

  /**
   * @param stackSetName The name of the StackSet we are adding instances to. 
   */
  public fun stackSetName(stackSetName: String) {
    cdkBuilder.stackSetName(stackSetName)
  }

  /**
   * @param stackSetRegion The AWS Region the StackSet is in.
   * Note that a cross-region Pipeline requires replication buckets to function correctly.
   * You can provide their names with the `PipelineProps.crossRegionReplicationBuckets` property.
   * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
   * those buckets,
   * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
   */
  public fun stackSetRegion(stackSetRegion: String) {
    cdkBuilder.stackSetRegion(stackSetRegion)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CloudFormationDeployStackInstancesActionProps = cdkBuilder.build()
}
