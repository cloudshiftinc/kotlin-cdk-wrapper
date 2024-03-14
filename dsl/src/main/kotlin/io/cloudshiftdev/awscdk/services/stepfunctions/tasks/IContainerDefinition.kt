package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public interface IContainerDefinition {
  public fun bind(arg0: ISageMakerTask): ContainerDefinitionConfig

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition,
  ) : IContainerDefinition {
    override fun bind(arg0: ISageMakerTask): ContainerDefinitionConfig =
        unwrap(this).bind(arg0.let(ISageMakerTask::unwrap)).let(ContainerDefinitionConfig::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition):
        IContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IContainerDefinition):
        software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition = (wrapped as
        Wrapper).cdkObject
  }
}
