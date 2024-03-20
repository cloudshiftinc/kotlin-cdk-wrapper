@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codedeploy.IServerDeploymentGroup
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
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
public open class CodeDeployServerDeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction,
) : Action(cdkObject) {
  public constructor(props: CodeDeployServerDeployActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction(props.let(CodeDeployServerDeployActionProps::unwrap))
  )

  public constructor(props: CodeDeployServerDeployActionProps.Builder.() -> Unit) :
      this(CodeDeployServerDeployActionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction].
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
     * The CodeDeploy server Deployment Group to deploy to.
     *
     * @param deploymentGroup The CodeDeploy server Deployment Group to deploy to. 
     */
    public fun deploymentGroup(deploymentGroup: IServerDeploymentGroup)

    /**
     * The source to use as input for deployment.
     *
     * @param input The source to use as input for deployment. 
     */
    public fun input(input: Artifact)

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
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction.Builder.create()

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
     * The CodeDeploy server Deployment Group to deploy to.
     *
     * @param deploymentGroup The CodeDeploy server Deployment Group to deploy to. 
     */
    override fun deploymentGroup(deploymentGroup: IServerDeploymentGroup) {
      cdkBuilder.deploymentGroup(deploymentGroup.let(IServerDeploymentGroup::unwrap))
    }

    /**
     * The source to use as input for deployment.
     *
     * @param input The source to use as input for deployment. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
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
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeDeployServerDeployAction {
      val builderImpl = BuilderImpl()
      return CodeDeployServerDeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction):
        CodeDeployServerDeployAction = CodeDeployServerDeployAction(cdkObject)

    internal fun unwrap(wrapped: CodeDeployServerDeployAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction =
        wrapped.cdkObject
  }
}
