package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface TaskEnvironmentVariable {
  /**
   * Name for the environment variable.
   *
   * Use `JsonPath` class's static methods to specify name from a JSON path.
   */
  public fun name(): String

  /**
   * Value of the environment variable.
   *
   * Use `JsonPath` class's static methods to specify value from a JSON path.
   */
  public fun `value`(): String

  /**
   * A builder for [TaskEnvironmentVariable]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name for the environment variable. 
     * Use `JsonPath` class's static methods to specify name from a JSON path.
     */
    public fun name(name: String)

    /**
     * @param value Value of the environment variable. 
     * Use `JsonPath` class's static methods to specify value from a JSON path.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable.builder()

    /**
     * @param name Name for the environment variable. 
     * Use `JsonPath` class's static methods to specify name from a JSON path.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param value Value of the environment variable. 
     * Use `JsonPath` class's static methods to specify value from a JSON path.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable,
  ) : CdkObject(cdkObject), TaskEnvironmentVariable {
    /**
     * Name for the environment variable.
     *
     * Use `JsonPath` class's static methods to specify name from a JSON path.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Value of the environment variable.
     *
     * Use `JsonPath` class's static methods to specify value from a JSON path.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TaskEnvironmentVariable {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable):
        TaskEnvironmentVariable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskEnvironmentVariable):
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable
  }
}
