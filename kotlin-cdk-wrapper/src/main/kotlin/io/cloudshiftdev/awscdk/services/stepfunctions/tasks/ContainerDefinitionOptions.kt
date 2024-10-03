@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

/**
 * Properties to define a ContainerDefinition.
 *
 * Example:
 *
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
public interface ContainerDefinitionOptions {
  /**
   * This parameter is ignored for models that contain only a PrimaryContainer.
   *
   * When a ContainerDefinition is part of an inference pipeline,
   * the value of the parameter uniquely identifies the container for the purposes of logging and
   * metrics.
   *
   * Default: - None
   */
  public fun containerHostName(): String? = unwrap(this).getContainerHostName()

  /**
   * The environment variables to set in the Docker container.
   *
   * Default: - No variables
   */
  public fun environmentVariables(): TaskInput? =
      unwrap(this).getEnvironmentVariables()?.let(TaskInput::wrap)

  /**
   * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
   *
   * Default: - None
   */
  public fun image(): DockerImage? = unwrap(this).getImage()?.let(DockerImage::wrap)

  /**
   * Defines how many models the container hosts.
   *
   * Default: - Mode.SINGLE_MODEL
   */
  public fun mode(): Mode? = unwrap(this).getMode()?.let(Mode::wrap)

  /**
   * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
   *
   * Default: - None
   */
  public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

  /**
   * The S3 path where the model artifacts, which result from model training, are stored.
   *
   * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
   * The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own
   * algorithms.
   *
   * Default: - None
   */
  public fun modelS3Location(): S3Location? =
      unwrap(this).getModelS3Location()?.let(S3Location::wrap)

  /**
   * A builder for [ContainerDefinitionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerHostName This parameter is ignored for models that contain only a
     * PrimaryContainer.
     * When a ContainerDefinition is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the purposes of logging and
     * metrics.
     */
    public fun containerHostName(containerHostName: String)

    /**
     * @param environmentVariables The environment variables to set in the Docker container.
     */
    public fun environmentVariables(environmentVariables: TaskInput)

    /**
     * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
     * stored.
     */
    public fun image(image: DockerImage)

    /**
     * @param mode Defines how many models the container hosts.
     */
    public fun mode(mode: Mode)

    /**
     * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model.
     */
    public fun modelPackageName(modelPackageName: String)

    /**
     * @param modelS3Location The S3 path where the model artifacts, which result from model
     * training, are stored.
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     * The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own
     * algorithms.
     */
    public fun modelS3Location(modelS3Location: S3Location)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions.builder()

    /**
     * @param containerHostName This parameter is ignored for models that contain only a
     * PrimaryContainer.
     * When a ContainerDefinition is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the purposes of logging and
     * metrics.
     */
    override fun containerHostName(containerHostName: String) {
      cdkBuilder.containerHostName(containerHostName)
    }

    /**
     * @param environmentVariables The environment variables to set in the Docker container.
     */
    override fun environmentVariables(environmentVariables: TaskInput) {
      cdkBuilder.environmentVariables(environmentVariables.let(TaskInput.Companion::unwrap))
    }

    /**
     * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
     * stored.
     */
    override fun image(image: DockerImage) {
      cdkBuilder.image(image.let(DockerImage.Companion::unwrap))
    }

    /**
     * @param mode Defines how many models the container hosts.
     */
    override fun mode(mode: Mode) {
      cdkBuilder.mode(mode.let(Mode.Companion::unwrap))
    }

    /**
     * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model.
     */
    override fun modelPackageName(modelPackageName: String) {
      cdkBuilder.modelPackageName(modelPackageName)
    }

    /**
     * @param modelS3Location The S3 path where the model artifacts, which result from model
     * training, are stored.
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     * The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own
     * algorithms.
     */
    override fun modelS3Location(modelS3Location: S3Location) {
      cdkBuilder.modelS3Location(modelS3Location.let(S3Location.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions,
  ) : CdkObject(cdkObject),
      ContainerDefinitionOptions {
    /**
     * This parameter is ignored for models that contain only a PrimaryContainer.
     *
     * When a ContainerDefinition is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the purposes of logging and
     * metrics.
     *
     * Default: - None
     */
    override fun containerHostName(): String? = unwrap(this).getContainerHostName()

    /**
     * The environment variables to set in the Docker container.
     *
     * Default: - No variables
     */
    override fun environmentVariables(): TaskInput? =
        unwrap(this).getEnvironmentVariables()?.let(TaskInput::wrap)

    /**
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     *
     * Default: - None
     */
    override fun image(): DockerImage? = unwrap(this).getImage()?.let(DockerImage::wrap)

    /**
     * Defines how many models the container hosts.
     *
     * Default: - Mode.SINGLE_MODEL
     */
    override fun mode(): Mode? = unwrap(this).getMode()?.let(Mode::wrap)

    /**
     * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
     *
     * Default: - None
     */
    override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

    /**
     * The S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     * The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own
     * algorithms.
     *
     * Default: - None
     */
    override fun modelS3Location(): S3Location? =
        unwrap(this).getModelS3Location()?.let(S3Location::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions):
        ContainerDefinitionOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ContainerDefinitionOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDefinitionOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions
  }
}
