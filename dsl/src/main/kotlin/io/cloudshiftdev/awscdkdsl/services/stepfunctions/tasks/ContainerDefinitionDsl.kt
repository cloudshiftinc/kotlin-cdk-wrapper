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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImage
import software.amazon.awscdk.services.stepfunctions.tasks.Mode
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location

/**
 * Describes the container, as part of model definition.
 *
 * Example:
 * ```
 * SageMakerCreateModel.Builder.create(this, "Sagemaker")
 * .modelName("MyModel")
 * .primaryContainer(ContainerDefinition.Builder.create()
 * .image(DockerImage.fromJsonExpression(JsonPath.stringAt("$.Model.imageName")))
 * .mode(Mode.SINGLE_MODEL)
 * .modelS3Location(S3Location.fromJsonExpression("$.TrainingJob.ModelArtifacts.S3ModelArtifacts"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ContainerDefinition.html)
 */
@CdkDslMarker
public class ContainerDefinitionDsl {
    private val cdkBuilder: ContainerDefinition.Builder = ContainerDefinition.Builder.create()

    /**
     * This parameter is ignored for models that contain only a PrimaryContainer.
     *
     * When a ContainerDefinition is part of an inference pipeline, the value of the parameter
     * uniquely identifies the container for the purposes of logging and metrics.
     *
     * Default: - None
     *
     * @param containerHostName This parameter is ignored for models that contain only a
     *   PrimaryContainer.
     */
    public fun containerHostName(containerHostName: String) {
        cdkBuilder.containerHostName(containerHostName)
    }

    /**
     * The environment variables to set in the Docker container.
     *
     * Default: - No variables
     *
     * @param environmentVariables The environment variables to set in the Docker container.
     */
    public fun environmentVariables(environmentVariables: TaskInput) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     *
     * Default: - None
     *
     * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
     *   stored.
     */
    public fun image(image: DockerImage) {
        cdkBuilder.image(image)
    }

    /**
     * Defines how many models the container hosts.
     *
     * Default: - Mode.SINGLE_MODEL
     *
     * @param mode Defines how many models the container hosts.
     */
    public fun mode(mode: Mode) {
        cdkBuilder.mode(mode)
    }

    /**
     * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
     *
     * Default: - None
     *
     * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use to
     *   create the model.
     */
    public fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
    }

    /**
     * The S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path is
     * required for Amazon SageMaker built-in algorithms, but not if you use your own algorithms.
     *
     * Default: - None
     *
     * @param modelS3Location The S3 path where the model artifacts, which result from model
     *   training, are stored.
     */
    public fun modelS3Location(modelS3Location: S3Location) {
        cdkBuilder.modelS3Location(modelS3Location)
    }

    public fun build(): ContainerDefinition = cdkBuilder.build()
}
