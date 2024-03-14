package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.ecs.IBaseService
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class EcsDeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction,
) : Action(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.EcsDeployAction].
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
     * Timeout for the ECS deployment in minutes.
     *
     * Value must be between 1-60.
     *
     * Default: - 60 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-ECS.html)
     * @param deploymentTimeout Timeout for the ECS deployment in minutes. 
     */
    public fun deploymentTimeout(deploymentTimeout: Duration)

    /**
     * The name of the JSON image definitions file to use for deployments.
     *
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * Use this property if you want to use a different name for this file than the default
     * 'imagedefinitions.json'.
     * If you use this property, you don't need to specify the `input` property.
     *
     * Default: - one of this property, or `input`, is required
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-create.html#pipelines-create-image-definitions)
     * @param imageFile The name of the JSON image definitions file to use for deployments. 
     */
    public fun imageFile(imageFile: ArtifactPath)

    /**
     * The input artifact that contains the JSON image definitions file to use for deployments.
     *
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * If you use this property, it's assumed the file is called 'imagedefinitions.json'.
     * If your build uses a different file, leave this property empty,
     * and use the `imageFile` property instead.
     *
     * Default: - one of this property, or `imageFile`, is required
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-create.html#pipelines-create-image-definitions)
     * @param input The input artifact that contains the JSON image definitions file to use for
     * deployments. 
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
     * The ECS Service to deploy.
     *
     * @param service The ECS Service to deploy. 
     */
    public fun service(service: IBaseService)

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
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction.Builder.create()

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
     * Timeout for the ECS deployment in minutes.
     *
     * Value must be between 1-60.
     *
     * Default: - 60 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-ECS.html)
     * @param deploymentTimeout Timeout for the ECS deployment in minutes. 
     */
    override fun deploymentTimeout(deploymentTimeout: Duration) {
      cdkBuilder.deploymentTimeout(deploymentTimeout.let(Duration::unwrap))
    }

    /**
     * The name of the JSON image definitions file to use for deployments.
     *
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * Use this property if you want to use a different name for this file than the default
     * 'imagedefinitions.json'.
     * If you use this property, you don't need to specify the `input` property.
     *
     * Default: - one of this property, or `input`, is required
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-create.html#pipelines-create-image-definitions)
     * @param imageFile The name of the JSON image definitions file to use for deployments. 
     */
    override fun imageFile(imageFile: ArtifactPath) {
      cdkBuilder.imageFile(imageFile.let(ArtifactPath::unwrap))
    }

    /**
     * The input artifact that contains the JSON image definitions file to use for deployments.
     *
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * If you use this property, it's assumed the file is called 'imagedefinitions.json'.
     * If your build uses a different file, leave this property empty,
     * and use the `imageFile` property instead.
     *
     * Default: - one of this property, or `imageFile`, is required
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-create.html#pipelines-create-image-definitions)
     * @param input The input artifact that contains the JSON image definitions file to use for
     * deployments. 
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
     * The ECS Service to deploy.
     *
     * @param service The ECS Service to deploy. 
     */
    override fun service(service: IBaseService) {
      cdkBuilder.service(service.let(IBaseService::unwrap))
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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeployAction {
      val builderImpl = BuilderImpl()
      return EcsDeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction):
        EcsDeployAction = EcsDeployAction(cdkObject)

    internal fun unwrap(wrapped: EcsDeployAction):
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction = wrapped.cdkObject
  }
}
