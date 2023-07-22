@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
import software.amazon.awscdk.services.codepipeline.actions.StackInstances
import software.amazon.awscdk.services.codepipeline.actions.StackSetParameters
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CloudFormationDeployStackInstancesActionDsl {
  private val cdkBuilder: CloudFormationDeployStackInstancesAction.Builder =
      CloudFormationDeployStackInstancesAction.Builder.create()

  /**
   * The physical, human-readable name of the Action.
   *
   * Note that Action names must be unique within a single Stage.
   *
   * @param actionName The physical, human-readable name of the Action. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * The percentage of accounts per Region for which this stack operation can fail before AWS
   * CloudFormation stops the operation in that Region.
   *
   * If
   * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
   * subsequent Regions. When calculating the number
   * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole
   * number.
   *
   * Default: 0%
   *
   * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
   * operation can fail before AWS CloudFormation stops the operation in that Region. 
   */
  public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
    cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
  }

  /**
   * The maximum percentage of accounts in which to perform this operation at one time.
   *
   * When calculating the number of accounts based on the specified
   * percentage, AWS CloudFormation rounds down to the next whole number. If rounding down would
   * result in zero, AWS CloudFormation sets the number as
   * one instead. Although you use this setting to specify the maximum, for large deployments the
   * actual number of accounts acted upon concurrently
   * may be lower due to service throttling.
   *
   * Default: 1%
   *
   * @param maxAccountConcurrencyPercentage The maximum percentage of accounts in which to perform
   * this operation at one time. 
   */
  public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
    cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
  }

  /**
   * Parameter values that only apply to the current Stack Instances.
   *
   * These parameters are shared between all instances added by this action.
   *
   * Default: - no parameters will be overridden
   *
   * @param parameterOverrides Parameter values that only apply to the current Stack Instances. 
   */
  public fun parameterOverrides(parameterOverrides: StackSetParameters) {
    cdkBuilder.parameterOverrides(parameterOverrides)
  }

  /**
   * The Role in which context's this Action will be executing in.
   *
   * The Pipeline's Role will assume this Role
   * (the required permissions for that will be granted automatically)
   * right before executing this Action.
   * This Action will be passed into your `IAction.bind`
   * method in the `ActionBindOptions.role` property.
   *
   * Default: a new Role will be generated
   *
   * @param role The Role in which context's this Action will be executing in. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * The runOrder property for this Action.
   *
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   *
   * Default: 1
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
   * @param runOrder The runOrder property for this Action. 
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * Specify where to create or update Stack Instances.
   *
   * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
   *
   * @param stackInstances Specify where to create or update Stack Instances. 
   */
  public fun stackInstances(stackInstances: StackInstances) {
    cdkBuilder.stackInstances(stackInstances)
  }

  /**
   * The name of the StackSet we are adding instances to.
   *
   * @param stackSetName The name of the StackSet we are adding instances to. 
   */
  public fun stackSetName(stackSetName: String) {
    cdkBuilder.stackSetName(stackSetName)
  }

  /**
   * The AWS Region the StackSet is in.
   *
   * Note that a cross-region Pipeline requires replication buckets to function correctly.
   * You can provide their names with the `PipelineProps.crossRegionReplicationBuckets` property.
   * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
   * those buckets,
   * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
   *
   * Default: - same region as the Pipeline
   *
   * @param stackSetRegion The AWS Region the StackSet is in. 
   */
  public fun stackSetRegion(stackSetRegion: String) {
    cdkBuilder.stackSetRegion(stackSetRegion)
  }

  /**
   * The name of the namespace to use for variables emitted by this action.
   *
   * Default: - a name will be generated, based on the stage and action names,
   * if any of the action's variables were referenced - otherwise,
   * no namespace will be set
   *
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action. 
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CloudFormationDeployStackInstancesAction = cdkBuilder.build()
}
