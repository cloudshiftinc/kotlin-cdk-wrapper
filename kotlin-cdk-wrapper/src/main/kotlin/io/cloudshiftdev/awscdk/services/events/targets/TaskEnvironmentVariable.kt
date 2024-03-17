@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * An environment variable to be set in the container run as a task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * TaskEnvironmentVariable taskEnvironmentVariable = TaskEnvironmentVariable.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 */
public interface TaskEnvironmentVariable {
  /**
   * Name for the environment variable.
   *
   * Exactly one of `name` and `namePath` must be specified.
   */
  public fun name(): String

  /**
   * Value of the environment variable.
   *
   * Exactly one of `value` and `valuePath` must be specified.
   */
  public fun `value`(): String

  /**
   * A builder for [TaskEnvironmentVariable]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name for the environment variable. 
     * Exactly one of `name` and `namePath` must be specified.
     */
    public fun name(name: String)

    /**
     * @param value Value of the environment variable. 
     * Exactly one of `value` and `valuePath` must be specified.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable.Builder =
        software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable.builder()

    /**
     * @param name Name for the environment variable. 
     * Exactly one of `name` and `namePath` must be specified.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param value Value of the environment variable. 
     * Exactly one of `value` and `valuePath` must be specified.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable,
  ) : CdkObject(cdkObject), TaskEnvironmentVariable {
    /**
     * Name for the environment variable.
     *
     * Exactly one of `name` and `namePath` must be specified.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Value of the environment variable.
     *
     * Exactly one of `value` and `valuePath` must be specified.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TaskEnvironmentVariable {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable):
        TaskEnvironmentVariable = CdkObjectWrappers.wrap(cdkObject) as? TaskEnvironmentVariable ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskEnvironmentVariable):
        software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable
  }
}
