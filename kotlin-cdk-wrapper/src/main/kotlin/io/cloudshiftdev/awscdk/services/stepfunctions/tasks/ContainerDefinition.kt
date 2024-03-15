@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

public open class ContainerDefinition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition,
) : CdkObject(cdkObject), IContainerDefinition {
  public override fun bind(task: ISageMakerTask): ContainerDefinitionConfig =
      unwrap(this).bind(task.let(ISageMakerTask::unwrap)).let(ContainerDefinitionConfig::wrap)

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
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition.Builder.create()

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
