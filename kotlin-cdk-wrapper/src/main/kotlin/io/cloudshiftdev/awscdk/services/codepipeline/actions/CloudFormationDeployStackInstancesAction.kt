@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * CodePipeline action to create/update Stack Instances of a StackSet.
 *
 * After the initial creation of a stack set, you can add new stack instances by
 * using CloudFormationStackInstances. Template parameter values can be
 * overridden at the stack instance level during create or update stack set
 * instance operations.
 *
 * Each stack set has one template and set of template parameters. When you
 * update the template or template parameters, you update them for the entire
 * set. Then all instance statuses are set to OUTDATED until the changes are
 * deployed to that instance.
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
public open class CloudFormationDeployStackInstancesAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction,
) : Action(cdkObject) {
  public constructor(props: CloudFormationDeployStackInstancesActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction(props.let(CloudFormationDeployStackInstancesActionProps::unwrap))
  )

  public constructor(props: CloudFormationDeployStackInstancesActionProps.Builder.() -> Unit) :
      this(CloudFormationDeployStackInstancesActionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The percentage of accounts per Region for which this stack operation can fail before AWS
     * CloudFormation stops the operation in that Region.
     *
     * If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     * subsequent Regions. When calculating the number
     * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next
     * whole number.
     *
     * Default: 0%
     *
     * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
     * operation can fail before AWS CloudFormation stops the operation in that Region. 
     */
    public fun failureTolerancePercentage(failureTolerancePercentage: Number)

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
    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number)

    /**
     * Parameter values that only apply to the current Stack Instances.
     *
     * These parameters are shared between all instances added by this action.
     *
     * Default: - no parameters will be overridden
     *
     * @param parameterOverrides Parameter values that only apply to the current Stack Instances. 
     */
    public fun parameterOverrides(parameterOverrides: StackSetParameters)

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
    public fun role(role: IRole)

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
    public fun runOrder(runOrder: Number)

    /**
     * Specify where to create or update Stack Instances.
     *
     * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
     *
     * @param stackInstances Specify where to create or update Stack Instances. 
     */
    public fun stackInstances(stackInstances: StackInstances)

    /**
     * The name of the StackSet we are adding instances to.
     *
     * @param stackSetName The name of the StackSet we are adding instances to. 
     */
    public fun stackSetName(stackSetName: String)

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
    public fun stackSetRegion(stackSetRegion: String)

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
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The percentage of accounts per Region for which this stack operation can fail before AWS
     * CloudFormation stops the operation in that Region.
     *
     * If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     * subsequent Regions. When calculating the number
     * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next
     * whole number.
     *
     * Default: 0%
     *
     * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
     * operation can fail before AWS CloudFormation stops the operation in that Region. 
     */
    override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
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
    override fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
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
    override fun parameterOverrides(parameterOverrides: StackSetParameters) {
      cdkBuilder.parameterOverrides(parameterOverrides.let(StackSetParameters::unwrap))
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
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * Specify where to create or update Stack Instances.
     *
     * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
     *
     * @param stackInstances Specify where to create or update Stack Instances. 
     */
    override fun stackInstances(stackInstances: StackInstances) {
      cdkBuilder.stackInstances(stackInstances.let(StackInstances::unwrap))
    }

    /**
     * The name of the StackSet we are adding instances to.
     *
     * @param stackSetName The name of the StackSet we are adding instances to. 
     */
    override fun stackSetName(stackSetName: String) {
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
    override fun stackSetRegion(stackSetRegion: String) {
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
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationDeployStackInstancesAction {
      val builderImpl = BuilderImpl()
      return CloudFormationDeployStackInstancesAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction):
        CloudFormationDeployStackInstancesAction =
        CloudFormationDeployStackInstancesAction(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeployStackInstancesAction):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
        = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
  }
}
