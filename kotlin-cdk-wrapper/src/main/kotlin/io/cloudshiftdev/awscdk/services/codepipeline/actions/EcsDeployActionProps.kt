@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.ecs.IBaseService
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of `EcsDeployAction`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * FargateService service;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact buildOutput = new Artifact();
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * EcsDeployAction.Builder.create()
 * .actionName("DeployAction")
 * .service(service)
 * // if your file is called imagedefinitions.json,
 * // use the `input` property,
 * // and leave out the `imageFile` property
 * .input(buildOutput)
 * // if your file name is _not_ imagedefinitions.json,
 * // use the `imageFile` property,
 * // and leave out the `input` property
 * .imageFile(buildOutput.atPath("imageDef.json"))
 * .deploymentTimeout(Duration.minutes(60))
 * .build()))
 * .build());
 * ```
 */
public interface EcsDeployActionProps : CommonAwsActionProps {
  /**
   * Timeout for the ECS deployment in minutes.
   *
   * Value must be between 1-60.
   *
   * Default: - 60 minutes
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-ECS.html)
   */
  public fun deploymentTimeout(): Duration? =
      unwrap(this).getDeploymentTimeout()?.let(Duration::wrap)

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
   */
  public fun imageFile(): ArtifactPath? = unwrap(this).getImageFile()?.let(ArtifactPath::wrap)

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
   */
  public fun input(): Artifact? = unwrap(this).getInput()?.let(Artifact::wrap)

  /**
   * The ECS Service to deploy.
   */
  public fun service(): IBaseService

  /**
   * A builder for [EcsDeployActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param deploymentTimeout Timeout for the ECS deployment in minutes.
     * Value must be between 1-60.
     */
    public fun deploymentTimeout(deploymentTimeout: Duration)

    /**
     * @param imageFile The name of the JSON image definitions file to use for deployments.
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * Use this property if you want to use a different name for this file than the default
     * 'imagedefinitions.json'.
     * If you use this property, you don't need to specify the `input` property.
     */
    public fun imageFile(imageFile: ArtifactPath)

    /**
     * @param input The input artifact that contains the JSON image definitions file to use for
     * deployments.
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * If you use this property, it's assumed the file is called 'imagedefinitions.json'.
     * If your build uses a different file, leave this property empty,
     * and use the `imageFile` property instead.
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
     * @param service The ECS Service to deploy. 
     */
    public fun service(service: IBaseService)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param deploymentTimeout Timeout for the ECS deployment in minutes.
     * Value must be between 1-60.
     */
    override fun deploymentTimeout(deploymentTimeout: Duration) {
      cdkBuilder.deploymentTimeout(deploymentTimeout.let(Duration::unwrap))
    }

    /**
     * @param imageFile The name of the JSON image definitions file to use for deployments.
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * Use this property if you want to use a different name for this file than the default
     * 'imagedefinitions.json'.
     * If you use this property, you don't need to specify the `input` property.
     */
    override fun imageFile(imageFile: ArtifactPath) {
      cdkBuilder.imageFile(imageFile.let(ArtifactPath::unwrap))
    }

    /**
     * @param input The input artifact that contains the JSON image definitions file to use for
     * deployments.
     * The JSON file is a list of objects,
     * each with 2 keys: `name` is the name of the container in the Task Definition,
     * and `imageUri` is the Docker image URI you want to update your service with.
     * If you use this property, it's assumed the file is called 'imagedefinitions.json'.
     * If your build uses a different file, leave this property empty,
     * and use the `imageFile` property instead.
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
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
     * @param service The ECS Service to deploy. 
     */
    override fun service(service: IBaseService) {
      cdkBuilder.service(service.let(IBaseService::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps,
  ) : CdkObject(cdkObject), EcsDeployActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Timeout for the ECS deployment in minutes.
     *
     * Value must be between 1-60.
     *
     * Default: - 60 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-ECS.html)
     */
    override fun deploymentTimeout(): Duration? =
        unwrap(this).getDeploymentTimeout()?.let(Duration::wrap)

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
     */
    override fun imageFile(): ArtifactPath? = unwrap(this).getImageFile()?.let(ArtifactPath::wrap)

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
     */
    override fun input(): Artifact? = unwrap(this).getInput()?.let(Artifact::wrap)

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
     * The ECS Service to deploy.
     */
    override fun service(): IBaseService = unwrap(this).getService().let(IBaseService::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps):
        EcsDeployActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps
  }
}
