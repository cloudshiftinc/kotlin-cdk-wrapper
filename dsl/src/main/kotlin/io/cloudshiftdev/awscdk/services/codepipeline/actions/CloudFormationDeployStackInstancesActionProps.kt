package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CloudFormationDeployStackInstancesActionProps : CommonAwsActionProps,
    CommonCloudFormationStackSetOptions {
  /**
   * Parameter values that only apply to the current Stack Instances.
   *
   * These parameters are shared between all instances added by this action.
   *
   * Default: - no parameters will be overridden
   */
  public fun parameterOverrides(): StackSetParameters? =
      unwrap(this).getParameterOverrides()?.let(StackSetParameters::wrap)

  /**
   * Specify where to create or update Stack Instances.
   *
   * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
   */
  public fun stackInstances(): StackInstances

  /**
   * The name of the StackSet we are adding instances to.
   */
  public fun stackSetName(): String

  /**
   * A builder for [CloudFormationDeployStackInstancesActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
     * operation can fail before AWS CloudFormation stops the operation in that Region.
     * If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     * subsequent Regions. When calculating the number
     * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next
     * whole number.
     */
    public fun failureTolerancePercentage(failureTolerancePercentage: Number)

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
    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number)

    /**
     * @param parameterOverrides Parameter values that only apply to the current Stack Instances.
     * These parameters are shared between all instances added by this action.
     */
    public fun parameterOverrides(parameterOverrides: StackSetParameters)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param stackInstances Specify where to create or update Stack Instances. 
     * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
     */
    public fun stackInstances(stackInstances: StackInstances)

    /**
     * @param stackSetName The name of the StackSet we are adding instances to. 
     */
    public fun stackSetName(stackSetName: String)

    /**
     * @param stackSetRegion The AWS Region the StackSet is in.
     * Note that a cross-region Pipeline requires replication buckets to function correctly.
     * You can provide their names with the `PipelineProps.crossRegionReplicationBuckets` property.
     * If you don't, the CodePipeline Construct will create new Stacks in your CDK app containing
     * those buckets,
     * that you will need to `cdk deploy` before deploying the main, Pipeline-containing Stack.
     */
    public fun stackSetRegion(stackSetRegion: String)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param failureTolerancePercentage The percentage of accounts per Region for which this stack
     * operation can fail before AWS CloudFormation stops the operation in that Region.
     * If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in
     * subsequent Regions. When calculating the number
     * of accounts based on the specified percentage, AWS CloudFormation rounds down to the next
     * whole number.
     */
    override fun failureTolerancePercentage(failureTolerancePercentage: Number) {
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
    override fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
      cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    /**
     * @param parameterOverrides Parameter values that only apply to the current Stack Instances.
     * These parameters are shared between all instances added by this action.
     */
    override fun parameterOverrides(parameterOverrides: StackSetParameters) {
      cdkBuilder.parameterOverrides(parameterOverrides.let(StackSetParameters::unwrap))
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param stackInstances Specify where to create or update Stack Instances. 
     * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
     */
    override fun stackInstances(stackInstances: StackInstances) {
      cdkBuilder.stackInstances(stackInstances.let(StackInstances::unwrap))
    }

    /**
     * @param stackSetName The name of the StackSet we are adding instances to. 
     */
    override fun stackSetName(stackSetName: String) {
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
    override fun stackSetRegion(stackSetRegion: String) {
      cdkBuilder.stackSetRegion(stackSetRegion)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps,
  ) : CdkObject(cdkObject), CloudFormationDeployStackInstancesActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

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
     */
    override fun failureTolerancePercentage(): Number? =
        unwrap(this).getFailureTolerancePercentage()

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
     */
    override fun maxAccountConcurrencyPercentage(): Number? =
        unwrap(this).getMaxAccountConcurrencyPercentage()

    /**
     * Parameter values that only apply to the current Stack Instances.
     *
     * These parameters are shared between all instances added by this action.
     *
     * Default: - no parameters will be overridden
     */
    override fun parameterOverrides(): StackSetParameters? =
        unwrap(this).getParameterOverrides()?.let(StackSetParameters::wrap)

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * Specify where to create or update Stack Instances.
     *
     * You can specify either AWS Accounts Ids or AWS Organizations Organizational Units.
     */
    override fun stackInstances(): StackInstances =
        unwrap(this).getStackInstances().let(StackInstances::wrap)

    /**
     * The name of the StackSet we are adding instances to.
     */
    override fun stackSetName(): String = unwrap(this).getStackSetName()

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
     */
    override fun stackSetRegion(): String? = unwrap(this).getStackSetRegion()

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationDeployStackInstancesActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps):
        CloudFormationDeployStackInstancesActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeployStackInstancesActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
  }
}
