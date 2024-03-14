package io.cloudshiftdev.awscdk.services.ecs

public interface ITaskDefinitionExtension {
  public fun extend(arg0: TaskDefinition)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension,
  ) : ITaskDefinitionExtension {
    override fun extend(arg0: TaskDefinition) {
      unwrap(this).extend(arg0.let(TaskDefinition::unwrap))
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension):
        ITaskDefinitionExtension = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaskDefinitionExtension):
        software.amazon.awscdk.services.ecs.ITaskDefinitionExtension = (wrapped as
        Wrapper).cdkObject
  }
}
