@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CfnCapabilities
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * CodePipeline action to deploy a stackset.
 *
 * CodePipeline offers the ability to perform AWS CloudFormation StackSets
 * operations as part of your CI/CD process. You use a stack set to create
 * stacks in AWS accounts across AWS Regions by using a single AWS
 * CloudFormation template. All the resources included in each stack are defined
 * by the stack set’s AWS CloudFormation template. When you create the stack
 * set, you specify the template to use, as well as any parameters and
 * capabilities that the template requires.
 *
 * For more information about concepts for AWS CloudFormation StackSets, see
 * <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html">StackSets
 * concepts</a>
 * in the AWS CloudFormation User Guide.
 *
 * If you use this action to make an update that includes adding stack
 * instances, the new instances are deployed first and the update is completed
 * last. The new instances first receive the old version, and then the update is
 * applied to all instances.
 *
 * As a best practice, you should construct your pipeline so that the stack set
 * is created and initially deploys to a subset or a single instance. After you
 * test your deployment and view the generated stack set, then add the
 * CloudFormationStackInstances action so that the remaining instances are
 * created and updated.
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
public open class CloudFormationDeployStackSetAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction,
) : Action(cdkObject) {
  public constructor(props: CloudFormationDeployStackSetActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction(props.let(CloudFormationDeployStackSetActionProps::unwrap))
  )

  public constructor(props: CloudFormationDeployStackSetActionProps.Builder.() -> Unit) :
      this(CloudFormationDeployStackSetActionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction].
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
     * Indicates that the template can create and update resources, depending on the types of
     * resources in the template.
     *
     * You must use this property if you have IAM resources in your stack template or you create a
     * stack directly from a template containing macros.
     *
     * Default: - the StackSet will have no IAM capabilities
     *
     * @param cfnCapabilities Indicates that the template can create and update resources, depending
     * on the types of resources in the template. 
     */
    public fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>)

    /**
     * Indicates that the template can create and update resources, depending on the types of
     * resources in the template.
     *
     * You must use this property if you have IAM resources in your stack template or you create a
     * stack directly from a template containing macros.
     *
     * Default: - the StackSet will have no IAM capabilities
     *
     * @param cfnCapabilities Indicates that the template can create and update resources, depending
     * on the types of resources in the template. 
     */
    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities)

    /**
     * Determines how IAM roles are created and managed.
     *
     * The choices are:
     *
     * * Self Managed: you create IAM roles with the required permissions
     * in the administration account and all target accounts.
     * * Service Managed: only available if the account and target accounts
     * are part of an AWS Organization. The necessary roles will be created
     * for you.
     *
     * If you want to deploy to all accounts that are a member of AWS
     * Organizations Organizational Units (OUs), you must select Service Managed
     * permissions.
     *
     * Note: This parameter can only be changed when no stack instances exist in
     * the stack set.
     *
     * Default: StackSetDeploymentModel.selfManaged()
     *
     * @param deploymentModel Determines how IAM roles are created and managed. 
     */
    public fun deploymentModel(deploymentModel: StackSetDeploymentModel)

    /**
     * A description of the stack set.
     *
     * You can use this to describe the stack set’s purpose or other relevant information.
     *
     * Default: - no description
     *
     * @param description A description of the stack set. 
     */
    public fun description(description: String)

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
     * The template parameters for your stack set.
     *
     * These parameters are shared between all instances of the stack set.
     *
     * Default: - no parameters will be used
     *
     * @param parameters The template parameters for your stack set. 
     */
    public fun parameters(parameters: StackSetParameters)

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
     * Default: - don't create or update any Stack Instances
     *
     * @param stackInstances Specify where to create or update Stack Instances. 
     */
    public fun stackInstances(stackInstances: StackInstances)

    /**
     * The name to associate with the stack set.
     *
     * This name must be unique in the Region where it is created.
     *
     * The name may only contain alphanumeric and hyphen characters. It must begin with an
     * alphabetic character and be 128 characters or fewer.
     *
     * @param stackSetName The name to associate with the stack set. 
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
     * The location of the template that defines the resources in the stack set.
     *
     * This must point to a template with a maximum size of 460,800 bytes.
     *
     * Enter the path to the source artifact name and template file.
     *
     * @param template The location of the template that defines the resources in the stack set. 
     */
    public fun template(template: StackSetTemplate)

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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction.Builder.create()

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
     * Indicates that the template can create and update resources, depending on the types of
     * resources in the template.
     *
     * You must use this property if you have IAM resources in your stack template or you create a
     * stack directly from a template containing macros.
     *
     * Default: - the StackSet will have no IAM capabilities
     *
     * @param cfnCapabilities Indicates that the template can create and update resources, depending
     * on the types of resources in the template. 
     */
    override fun cfnCapabilities(cfnCapabilities: List<CfnCapabilities>) {
      cdkBuilder.cfnCapabilities(cfnCapabilities.map(CfnCapabilities::unwrap))
    }

    /**
     * Indicates that the template can create and update resources, depending on the types of
     * resources in the template.
     *
     * You must use this property if you have IAM resources in your stack template or you create a
     * stack directly from a template containing macros.
     *
     * Default: - the StackSet will have no IAM capabilities
     *
     * @param cfnCapabilities Indicates that the template can create and update resources, depending
     * on the types of resources in the template. 
     */
    override fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities): Unit =
        cfnCapabilities(cfnCapabilities.toList())

    /**
     * Determines how IAM roles are created and managed.
     *
     * The choices are:
     *
     * * Self Managed: you create IAM roles with the required permissions
     * in the administration account and all target accounts.
     * * Service Managed: only available if the account and target accounts
     * are part of an AWS Organization. The necessary roles will be created
     * for you.
     *
     * If you want to deploy to all accounts that are a member of AWS
     * Organizations Organizational Units (OUs), you must select Service Managed
     * permissions.
     *
     * Note: This parameter can only be changed when no stack instances exist in
     * the stack set.
     *
     * Default: StackSetDeploymentModel.selfManaged()
     *
     * @param deploymentModel Determines how IAM roles are created and managed. 
     */
    override fun deploymentModel(deploymentModel: StackSetDeploymentModel) {
      cdkBuilder.deploymentModel(deploymentModel.let(StackSetDeploymentModel::unwrap))
    }

    /**
     * A description of the stack set.
     *
     * You can use this to describe the stack set’s purpose or other relevant information.
     *
     * Default: - no description
     *
     * @param description A description of the stack set. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
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
     * The template parameters for your stack set.
     *
     * These parameters are shared between all instances of the stack set.
     *
     * Default: - no parameters will be used
     *
     * @param parameters The template parameters for your stack set. 
     */
    override fun parameters(parameters: StackSetParameters) {
      cdkBuilder.parameters(parameters.let(StackSetParameters::unwrap))
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
     * Default: - don't create or update any Stack Instances
     *
     * @param stackInstances Specify where to create or update Stack Instances. 
     */
    override fun stackInstances(stackInstances: StackInstances) {
      cdkBuilder.stackInstances(stackInstances.let(StackInstances::unwrap))
    }

    /**
     * The name to associate with the stack set.
     *
     * This name must be unique in the Region where it is created.
     *
     * The name may only contain alphanumeric and hyphen characters. It must begin with an
     * alphabetic character and be 128 characters or fewer.
     *
     * @param stackSetName The name to associate with the stack set. 
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
     * The location of the template that defines the resources in the stack set.
     *
     * This must point to a template with a maximum size of 460,800 bytes.
     *
     * Enter the path to the source artifact name and template file.
     *
     * @param template The location of the template that defines the resources in the stack set. 
     */
    override fun template(template: StackSetTemplate) {
      cdkBuilder.template(template.let(StackSetTemplate::unwrap))
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
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationDeployStackSetAction {
      val builderImpl = BuilderImpl()
      return CloudFormationDeployStackSetAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction):
        CloudFormationDeployStackSetAction = CloudFormationDeployStackSetAction(cdkObject)

    internal fun unwrap(wrapped: CloudFormationDeployStackSetAction):
        software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction =
        wrapped.cdkObject
  }
}
