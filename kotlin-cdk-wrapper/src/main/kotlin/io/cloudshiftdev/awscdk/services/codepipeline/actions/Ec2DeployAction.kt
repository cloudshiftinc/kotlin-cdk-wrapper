@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ITargetGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * CodePipeline Action to deploy EC2 instances.
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
public open class Ec2DeployAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction,
) : Action(cdkObject) {
  public constructor(props: Ec2DeployActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction(props.let(Ec2DeployActionProps.Companion::unwrap))
  )

  public constructor(props: Ec2DeployActionProps.Builder.() -> Unit) :
      this(Ec2DeployActionProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.Ec2DeployAction].
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
     * The deploy specifications.
     *
     * @param deploySpecifications The deploy specifications. 
     */
    public fun deploySpecifications(deploySpecifications: Ec2DeploySpecifications)

    /**
     * The input artifact to deploy to EC2 instances.
     *
     * @param input The input artifact to deploy to EC2 instances. 
     */
    public fun input(input: Artifact)

    /**
     * The tag key of the instances that you created in Amazon EC2.
     *
     * @param instanceTagKey The tag key of the instances that you created in Amazon EC2. 
     */
    public fun instanceTagKey(instanceTagKey: String)

    /**
     * The tag value of the instances that you created in Amazon EC2.
     *
     * Default: - all instances with `instanceTagKey` will be matched
     *
     * @param instanceTagValue The tag value of the instances that you created in Amazon EC2. 
     */
    public fun instanceTagValue(instanceTagValue: String)

    /**
     * The type of instances or SSM nodes created in Amazon EC2.
     *
     * You must have already created, tagged, and installed the SSM agent on all instances.
     *
     * @param instanceType The type of instances or SSM nodes created in Amazon EC2. 
     */
    public fun instanceType(instanceType: Ec2InstanceType)

    /**
     * The number or percentage of instances that can deploy in parallel.
     *
     * Default: - No configuration
     *
     * @param maxBatch The number or percentage of instances that can deploy in parallel. 
     */
    public fun maxBatch(maxBatch: Ec2MaxInstances)

    /**
     * Stop the task after the task fails on the specified number or percentage of instances.
     *
     * Default: - No configuration
     *
     * @param maxError Stop the task after the task fails on the specified number or percentage of
     * instances. 
     */
    public fun maxError(maxError: Ec2MaxInstances)

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
     * The list of target groups for deployment. You must have already created the target groups.
     *
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     *
     * Default: - No target groups
     *
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups. 
     */
    public fun targetGroups(targetGroups: List<ITargetGroup>)

    /**
     * The list of target groups for deployment. You must have already created the target groups.
     *
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     *
     * Default: - No target groups
     *
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups. 
     */
    public fun targetGroups(vararg targetGroups: ITargetGroup)

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
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction.Builder.create()

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
     * The deploy specifications.
     *
     * @param deploySpecifications The deploy specifications. 
     */
    override fun deploySpecifications(deploySpecifications: Ec2DeploySpecifications) {
      cdkBuilder.deploySpecifications(deploySpecifications.let(Ec2DeploySpecifications.Companion::unwrap))
    }

    /**
     * The input artifact to deploy to EC2 instances.
     *
     * @param input The input artifact to deploy to EC2 instances. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * The tag key of the instances that you created in Amazon EC2.
     *
     * @param instanceTagKey The tag key of the instances that you created in Amazon EC2. 
     */
    override fun instanceTagKey(instanceTagKey: String) {
      cdkBuilder.instanceTagKey(instanceTagKey)
    }

    /**
     * The tag value of the instances that you created in Amazon EC2.
     *
     * Default: - all instances with `instanceTagKey` will be matched
     *
     * @param instanceTagValue The tag value of the instances that you created in Amazon EC2. 
     */
    override fun instanceTagValue(instanceTagValue: String) {
      cdkBuilder.instanceTagValue(instanceTagValue)
    }

    /**
     * The type of instances or SSM nodes created in Amazon EC2.
     *
     * You must have already created, tagged, and installed the SSM agent on all instances.
     *
     * @param instanceType The type of instances or SSM nodes created in Amazon EC2. 
     */
    override fun instanceType(instanceType: Ec2InstanceType) {
      cdkBuilder.instanceType(instanceType.let(Ec2InstanceType.Companion::unwrap))
    }

    /**
     * The number or percentage of instances that can deploy in parallel.
     *
     * Default: - No configuration
     *
     * @param maxBatch The number or percentage of instances that can deploy in parallel. 
     */
    override fun maxBatch(maxBatch: Ec2MaxInstances) {
      cdkBuilder.maxBatch(maxBatch.let(Ec2MaxInstances.Companion::unwrap))
    }

    /**
     * Stop the task after the task fails on the specified number or percentage of instances.
     *
     * Default: - No configuration
     *
     * @param maxError Stop the task after the task fails on the specified number or percentage of
     * instances. 
     */
    override fun maxError(maxError: Ec2MaxInstances) {
      cdkBuilder.maxError(maxError.let(Ec2MaxInstances.Companion::unwrap))
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
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
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
     * The list of target groups for deployment. You must have already created the target groups.
     *
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     *
     * Default: - No target groups
     *
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups. 
     */
    override fun targetGroups(targetGroups: List<ITargetGroup>) {
      cdkBuilder.targetGroups(targetGroups.map(ITargetGroup.Companion::unwrap))
    }

    /**
     * The list of target groups for deployment. You must have already created the target groups.
     *
     * Target groups provide a set of instances to process specific requests.
     * If the target group is specified, instances will be removed from the target group before
     * deployment and added back to the target group after deployment.
     *
     * Default: - No target groups
     *
     * @param targetGroups The list of target groups for deployment. You must have already created
     * the target groups. 
     */
    override fun targetGroups(vararg targetGroups: ITargetGroup): Unit =
        targetGroups(targetGroups.toList())

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2DeployAction {
      val builderImpl = BuilderImpl()
      return Ec2DeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction):
        Ec2DeployAction = Ec2DeployAction(cdkObject)

    internal fun unwrap(wrapped: Ec2DeployAction):
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction
  }
}
