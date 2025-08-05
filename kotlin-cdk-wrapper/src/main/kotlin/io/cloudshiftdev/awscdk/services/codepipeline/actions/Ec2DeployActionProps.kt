@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ITargetGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties of `Ec2DeployAction`.
 *
 * Example:
 *
 * ```
 * Artifact sourceOutput = new Artifact();
 * Pipeline pipeline = Pipeline.Builder.create(this, "MyPipeline")
 * .pipelineType(PipelineType.V2)
 * .build();
 * Ec2DeployAction deployAction = Ec2DeployAction.Builder.create()
 * .actionName("Ec2Deploy")
 * .input(sourceOutput)
 * .instanceType(Ec2InstanceType.EC2)
 * .instanceTagKey("Name")
 * .instanceTagValue("MyInstance")
 * .deploySpecifications(Ec2DeploySpecifications.inline(Ec2DeploySpecificationsInlineProps.builder()
 * .targetDirectory("/home/ec2-user/deploy")
 * .preScript("scripts/pre-deploy.sh")
 * .postScript("scripts/post-deploy.sh")
 * .build()))
 * .build();
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
public interface Ec2DeployActionProps : CommonAwsActionProps {
  /**
   * The deploy specifications.
   */
  public fun deploySpecifications(): Ec2DeploySpecifications

  /**
   * The input artifact to deploy to EC2 instances.
   */
  public fun input(): Artifact

  /**
   * The tag key of the instances that you created in Amazon EC2.
   */
  public fun instanceTagKey(): String

  /**
   * The tag value of the instances that you created in Amazon EC2.
   *
   * Default: - all instances with `instanceTagKey` will be matched
   */
  public fun instanceTagValue(): String? = unwrap(this).getInstanceTagValue()

  /**
   * The type of instances or SSM nodes created in Amazon EC2.
   *
   * You must have already created, tagged, and installed the SSM agent on all instances.
   */
  public fun instanceType(): Ec2InstanceType

  /**
   * The number or percentage of instances that can deploy in parallel.
   *
   * Default: - No configuration
   */
  public fun maxBatch(): Ec2MaxInstances? = unwrap(this).getMaxBatch()?.let(Ec2MaxInstances::wrap)

  /**
   * Stop the task after the task fails on the specified number or percentage of instances.
   *
   * Default: - No configuration
   */
  public fun maxError(): Ec2MaxInstances? = unwrap(this).getMaxError()?.let(Ec2MaxInstances::wrap)

  /**
   * The list of target groups for deployment. You must have already created the target groups.
   *
   * Target groups provide a set of instances to process specific requests.
   * If the target group is specified, instances will be removed from the target group before
   * deployment and added back to the target group after deployment.
   *
   * Default: - No target groups
   */
  public fun targetGroups(): List<ITargetGroup> =
      unwrap(this).getTargetGroups()?.map(ITargetGroup::wrap) ?: emptyList()

  /**
   * A builder for [Ec2DeployActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param deploySpecifications The deploy specifications. 
     */
    public fun deploySpecifications(deploySpecifications: Ec2DeploySpecifications)

    /**
     * @param input The input artifact to deploy to EC2 instances. 
     */
    public fun input(input: Artifact)

    /**
     * @param instanceTagKey The tag key of the instances that you created in Amazon EC2. 
     */
    public fun instanceTagKey(instanceTagKey: String)

    /**
     * @param instanceTagValue The tag value of the instances that you created in Amazon EC2.
     */
    public fun instanceTagValue(instanceTagValue: String)

    /**
     * @param instanceType The type of instances or SSM nodes created in Amazon EC2. 
     * You must have already created, tagged, and installed the SSM agent on all instances.
     */
    public fun instanceType(instanceType: Ec2InstanceType)

    /**
     * @param maxBatch The number or percentage of instances that can deploy in parallel.
     */
    public fun maxBatch(maxBatch: Ec2MaxInstances)

    /**
     * @param maxError Stop the task after the task fails on the specified number or percentage of
     * instances.
     */
    public fun maxError(maxError: Ec2MaxInstances)

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
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups.
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     */
    public fun targetGroups(targetGroups: List<ITargetGroup>)

    /**
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups.
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     */
    public fun targetGroups(vararg targetGroups: ITargetGroup)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param deploySpecifications The deploy specifications. 
     */
    override fun deploySpecifications(deploySpecifications: Ec2DeploySpecifications) {
      cdkBuilder.deploySpecifications(deploySpecifications.let(Ec2DeploySpecifications.Companion::unwrap))
    }

    /**
     * @param input The input artifact to deploy to EC2 instances. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * @param instanceTagKey The tag key of the instances that you created in Amazon EC2. 
     */
    override fun instanceTagKey(instanceTagKey: String) {
      cdkBuilder.instanceTagKey(instanceTagKey)
    }

    /**
     * @param instanceTagValue The tag value of the instances that you created in Amazon EC2.
     */
    override fun instanceTagValue(instanceTagValue: String) {
      cdkBuilder.instanceTagValue(instanceTagValue)
    }

    /**
     * @param instanceType The type of instances or SSM nodes created in Amazon EC2. 
     * You must have already created, tagged, and installed the SSM agent on all instances.
     */
    override fun instanceType(instanceType: Ec2InstanceType) {
      cdkBuilder.instanceType(instanceType.let(Ec2InstanceType.Companion::unwrap))
    }

    /**
     * @param maxBatch The number or percentage of instances that can deploy in parallel.
     */
    override fun maxBatch(maxBatch: Ec2MaxInstances) {
      cdkBuilder.maxBatch(maxBatch.let(Ec2MaxInstances.Companion::unwrap))
    }

    /**
     * @param maxError Stop the task after the task fails on the specified number or percentage of
     * instances.
     */
    override fun maxError(maxError: Ec2MaxInstances) {
      cdkBuilder.maxError(maxError.let(Ec2MaxInstances.Companion::unwrap))
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
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups.
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     */
    override fun targetGroups(targetGroups: List<ITargetGroup>) {
      cdkBuilder.targetGroups(targetGroups.map(ITargetGroup.Companion::unwrap))
    }

    /**
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups.
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     */
    override fun targetGroups(vararg targetGroups: ITargetGroup): Unit =
        targetGroups(targetGroups.toList())

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.Ec2DeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeployActionProps,
  ) : CdkObject(cdkObject),
      Ec2DeployActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The deploy specifications.
     */
    override fun deploySpecifications(): Ec2DeploySpecifications =
        unwrap(this).getDeploySpecifications().let(Ec2DeploySpecifications::wrap)

    /**
     * The input artifact to deploy to EC2 instances.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * The tag key of the instances that you created in Amazon EC2.
     */
    override fun instanceTagKey(): String = unwrap(this).getInstanceTagKey()

    /**
     * The tag value of the instances that you created in Amazon EC2.
     *
     * Default: - all instances with `instanceTagKey` will be matched
     */
    override fun instanceTagValue(): String? = unwrap(this).getInstanceTagValue()

    /**
     * The type of instances or SSM nodes created in Amazon EC2.
     *
     * You must have already created, tagged, and installed the SSM agent on all instances.
     */
    override fun instanceType(): Ec2InstanceType =
        unwrap(this).getInstanceType().let(Ec2InstanceType::wrap)

    /**
     * The number or percentage of instances that can deploy in parallel.
     *
     * Default: - No configuration
     */
    override fun maxBatch(): Ec2MaxInstances? =
        unwrap(this).getMaxBatch()?.let(Ec2MaxInstances::wrap)

    /**
     * Stop the task after the task fails on the specified number or percentage of instances.
     *
     * Default: - No configuration
     */
    override fun maxError(): Ec2MaxInstances? =
        unwrap(this).getMaxError()?.let(Ec2MaxInstances::wrap)

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
     * The list of target groups for deployment. You must have already created the target groups.
     *
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     *
     * Default: - No target groups
     */
    override fun targetGroups(): List<ITargetGroup> =
        unwrap(this).getTargetGroups()?.map(ITargetGroup::wrap) ?: emptyList()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2DeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeployActionProps):
        Ec2DeployActionProps = CdkObjectWrappers.wrap(cdkObject) as? Ec2DeployActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2DeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployActionProps
  }
}
