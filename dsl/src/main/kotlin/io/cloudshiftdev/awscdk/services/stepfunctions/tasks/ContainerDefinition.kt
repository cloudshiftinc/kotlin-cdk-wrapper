package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public open class ContainerDefinition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition,
) : CdkObject(cdkObject), IContainerDefinition {
  /**
   * Called when the ContainerDefinition type configured on Sagemaker Task.
   *
   * @param task 
   */
  public override fun bind(task: ISageMakerTask): ContainerDefinitionConfig =
      unwrap(this).bind(task.let(ISageMakerTask::unwrap)).let(ContainerDefinitionConfig::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.ContainerDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This parameter is ignored for models that contain only a PrimaryContainer.
     *
     * When a ContainerDefinition is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the purposes of logging and
     * metrics.
     *
     * Default: - None
     *
     * @param containerHostName This parameter is ignored for models that contain only a
     * PrimaryContainer. 
     */
    public fun containerHostName(containerHostName: String)

    /**
     * The environment variables to set in the Docker container.
     *
     * Default: - No variables
     *
     * @param environmentVariables The environment variables to set in the Docker container. 
     */
    public fun environmentVariables(environmentVariables: TaskInput)

    /**
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     *
     * Default: - None
     *
     * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
     * stored. 
     */
    public fun image(image: DockerImage)

    /**
     * Defines how many models the container hosts.
     *
     * Default: - Mode.SINGLE_MODEL
     *
     * @param mode Defines how many models the container hosts. 
     */
    public fun mode(mode: Mode)

    /**
     * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
     *
     * Default: - None
     *
     * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model. 
     */
    public fun modelPackageName(modelPackageName: String)

    /**
     * The S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     * The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own
     * algorithms.
     *
     * Default: - None
     *
     * @param modelS3Location The S3 path where the model artifacts, which result from model
     * training, are stored. 
     */
    public fun modelS3Location(modelS3Location: S3Location)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition.Builder.create()

    /**
     * This parameter is ignored for models that contain only a PrimaryContainer.
     *
     * When a ContainerDefinition is part of an inference pipeline,
     * the value of the parameter uniquely identifies the container for the purposes of logging and
     * metrics.
     *
     * Default: - None
     *
     * @param containerHostName This parameter is ignored for models that contain only a
     * PrimaryContainer. 
     */
    override fun containerHostName(containerHostName: String) {
      cdkBuilder.containerHostName(containerHostName)
    }

    /**
     * The environment variables to set in the Docker container.
     *
     * Default: - No variables
     *
     * @param environmentVariables The environment variables to set in the Docker container. 
     */
    override fun environmentVariables(environmentVariables: TaskInput) {
      cdkBuilder.environmentVariables(environmentVariables.let(TaskInput::unwrap))
    }

    /**
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     *
     * Default: - None
     *
     * @param image The Amazon EC2 Container Registry (Amazon ECR) path where inference code is
     * stored. 
     */
    override fun image(image: DockerImage) {
      cdkBuilder.image(image.let(DockerImage::unwrap))
    }

    /**
     * Defines how many models the container hosts.
     *
     * Default: - Mode.SINGLE_MODEL
     *
     * @param mode Defines how many models the container hosts. 
     */
    override fun mode(mode: Mode) {
      cdkBuilder.mode(mode.let(Mode::unwrap))
    }

    /**
     * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
     *
     * Default: - None
     *
     * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use to
     * create the model. 
     */
    override fun modelPackageName(modelPackageName: String) {
      cdkBuilder.modelPackageName(modelPackageName)
    }

    /**
     * The S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     * The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own
     * algorithms.
     *
     * Default: - None
     *
     * @param modelS3Location The S3 path where the model artifacts, which result from model
     * training, are stored. 
     */
    override fun modelS3Location(modelS3Location: S3Location) {
      cdkBuilder.modelS3Location(modelS3Location.let(S3Location::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinition {
      val builderImpl = BuilderImpl()
      return ContainerDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition):
        ContainerDefinition = ContainerDefinition(cdkObject)

    internal fun unwrap(wrapped: ContainerDefinition):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition = wrapped.cdkObject
  }
}
