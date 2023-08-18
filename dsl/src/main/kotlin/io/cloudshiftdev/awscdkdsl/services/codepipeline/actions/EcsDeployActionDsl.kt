@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction
import software.amazon.awscdk.services.ecs.IBaseService
import software.amazon.awscdk.services.iam.IRole

/**
 * CodePipeline Action to deploy an ECS Service.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecs.*;
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
@CdkDslMarker
public class EcsDeployActionDsl {
    private val cdkBuilder: EcsDeployAction.Builder = EcsDeployAction.Builder.create()

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
     * Timeout for the ECS deployment in minutes.
     *
     * Value must be between 1-60.
     *
     * Default: - 60 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-ECS.html)
     *
     * @param deploymentTimeout Timeout for the ECS deployment in minutes.
     */
    public fun deploymentTimeout(deploymentTimeout: Duration) {
        cdkBuilder.deploymentTimeout(deploymentTimeout)
    }

    /**
     * The name of the JSON image definitions file to use for deployments.
     *
     * The JSON file is a list of objects, each with 2 keys: `name` is the name of the container in
     * the Task Definition, and `imageUri` is the Docker image URI you want to update your service
     * with. Use this property if you want to use a different name for this file than the default
     * 'imagedefinitions.json'. If you use this property, you don't need to specify the `input`
     * property.
     *
     * Default: - one of this property, or `input`, is required
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-create.html#pipelines-create-image-definitions)
     *
     * @param imageFile The name of the JSON image definitions file to use for deployments.
     */
    public fun imageFile(imageFile: ArtifactPath) {
        cdkBuilder.imageFile(imageFile)
    }

    /**
     * The input artifact that contains the JSON image definitions file to use for deployments.
     *
     * The JSON file is a list of objects, each with 2 keys: `name` is the name of the container in
     * the Task Definition, and `imageUri` is the Docker image URI you want to update your service
     * with. If you use this property, it's assumed the file is called 'imagedefinitions.json'. If
     * your build uses a different file, leave this property empty, and use the `imageFile` property
     * instead.
     *
     * Default: - one of this property, or `imageFile`, is required
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipelines-create.html#pipelines-create-image-definitions)
     *
     * @param input The input artifact that contains the JSON image definitions file to use for
     *   deployments.
     */
    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role (the required permissions for that will be granted
     * automatically) right before executing this Action. This Action will be passed into your
     * `IAction.bind` method in the `ActionBindOptions.role` property.
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
     *
     * @param runOrder The runOrder property for this Action.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * The ECS Service to deploy.
     *
     * @param service The ECS Service to deploy.
     */
    public fun service(service: IBaseService) {
        cdkBuilder.service(service)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names, if any of the
     * action's variables were referenced - otherwise, no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): EcsDeployAction = cdkBuilder.build()
}
