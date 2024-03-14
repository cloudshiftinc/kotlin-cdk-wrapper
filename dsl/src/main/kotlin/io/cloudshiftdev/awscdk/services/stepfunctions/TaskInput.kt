package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class TaskInput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput,
) {
  /**
   * type of task input.
   */
  public open fun type(): InputType = unwrap(this).getType().let(InputType::wrap)

  /**
   * payload for the corresponding input type.
   *
   * It can be a JSON-encoded object, context, data, etc.
   */
  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public fun fromJsonPathAt(path: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromJsonPathAt(path).let(TaskInput::wrap)

    public fun fromObject(obj: Map<String, Any>): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromObject(obj).let(TaskInput::wrap)

    public fun fromText(text: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromText(text).let(TaskInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput): TaskInput
        = TaskInput(cdkObject)

    internal fun unwrap(wrapped: TaskInput): software.amazon.awscdk.services.stepfunctions.TaskInput
        = wrapped.cdkObject
  }
}
