@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codedeploy.IServerDeploymentGroup
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of the `CodeDeployServerDeployAction CodeDeploy server deploy
 * CodePipeline Action`.
 *
 * Example:
 *
 * ```
 * ServerDeploymentGroup deploymentGroup;
 * Pipeline pipeline = Pipeline.Builder.create(this, "MyPipeline")
 * .pipelineName("MyPipeline")
 * .build();
 * // add the source and build Stages to the Pipeline...
 * Artifact buildOutput = new Artifact();
 * CodeDeployServerDeployAction deployAction = CodeDeployServerDeployAction.Builder.create()
 * .actionName("CodeDeploy")
 * .input(buildOutput)
 * .deploymentGroup(deploymentGroup)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
public interface CodeDeployServerDeployActionProps : CommonAwsActionProps {
  /**
   * The CodeDeploy server Deployment Group to deploy to.
   */
  public fun deploymentGroup(): IServerDeploymentGroup

  /**
   * The source to use as input for deployment.
   */
  public fun input(): Artifact

  /**
   * A builder for [CodeDeployServerDeployActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param deploymentGroup The CodeDeploy server Deployment Group to deploy to. 
     */
    public fun deploymentGroup(deploymentGroup: IServerDeploymentGroup)

    /**
     * @param input The source to use as input for deployment. 
     */
    public fun input(input: Artifact)

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
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param deploymentGroup The CodeDeploy server Deployment Group to deploy to. 
     */
    override fun deploymentGroup(deploymentGroup: IServerDeploymentGroup) {
      cdkBuilder.deploymentGroup(deploymentGroup.let(IServerDeploymentGroup.Companion::unwrap))
    }

    /**
     * @param input The source to use as input for deployment. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
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
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps,
  ) : CdkObject(cdkObject),
      CodeDeployServerDeployActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The CodeDeploy server Deployment Group to deploy to.
     */
    override fun deploymentGroup(): IServerDeploymentGroup =
        unwrap(this).getDeploymentGroup().let(IServerDeploymentGroup::wrap)

    /**
     * The source to use as input for deployment.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

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
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeDeployServerDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps):
        CodeDeployServerDeployActionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CodeDeployServerDeployActionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeDeployServerDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps
  }
}
