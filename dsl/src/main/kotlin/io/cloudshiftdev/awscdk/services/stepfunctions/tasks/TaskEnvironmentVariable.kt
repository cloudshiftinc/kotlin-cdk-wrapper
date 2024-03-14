package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String
import kotlin.Unit

public interface TaskEnvironmentVariable {
  public fun name(): String

  public fun `value`(): String

  public interface Builder {
    public fun name(name: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable,
  ) : TaskEnvironmentVariable {
    override fun name(): String = unwrap(this).getName()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TaskEnvironmentVariable {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable):
        TaskEnvironmentVariable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskEnvironmentVariable):
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable = (wrapped as
        Wrapper).cdkObject
  }
}
