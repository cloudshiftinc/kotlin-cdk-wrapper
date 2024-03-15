@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public interface ContainerDefinitionOptions {
  public fun containerHostName(): String? = unwrap(this).getContainerHostName()

  public fun environmentVariables(): TaskInput? =
      unwrap(this).getEnvironmentVariables()?.let(TaskInput::wrap)

  public fun image(): DockerImage? = unwrap(this).getImage()?.let(DockerImage::wrap)

  public fun mode(): Mode? = unwrap(this).getMode()?.let(Mode::wrap)

  public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

  public fun modelS3Location(): S3Location? =
      unwrap(this).getModelS3Location()?.let(S3Location::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun containerHostName(containerHostName: String)

    public fun environmentVariables(environmentVariables: TaskInput)

    public fun image(image: DockerImage)

    public fun mode(mode: Mode)

    public fun modelPackageName(modelPackageName: String)

    public fun modelS3Location(modelS3Location: S3Location)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions.builder()

    override fun containerHostName(containerHostName: String) {
      cdkBuilder.containerHostName(containerHostName)
    }

    override fun environmentVariables(environmentVariables: TaskInput) {
      cdkBuilder.environmentVariables(environmentVariables.let(TaskInput::unwrap))
    }

    override fun image(image: DockerImage) {
      cdkBuilder.image(image.let(DockerImage::unwrap))
    }

    override fun mode(mode: Mode) {
      cdkBuilder.mode(mode.let(Mode::unwrap))
    }

    override fun modelPackageName(modelPackageName: String) {
      cdkBuilder.modelPackageName(modelPackageName)
    }

    override fun modelS3Location(modelS3Location: S3Location) {
      cdkBuilder.modelS3Location(modelS3Location.let(S3Location::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions,
  ) : CdkObject(cdkObject), ContainerDefinitionOptions {
    override fun containerHostName(): String? = unwrap(this).getContainerHostName()

    override fun environmentVariables(): TaskInput? =
        unwrap(this).getEnvironmentVariables()?.let(TaskInput::wrap)

    override fun image(): DockerImage? = unwrap(this).getImage()?.let(DockerImage::wrap)

    override fun mode(): Mode? = unwrap(this).getMode()?.let(Mode::wrap)

    override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

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
        ContainerDefinitionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDefinitionOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions
  }
}
