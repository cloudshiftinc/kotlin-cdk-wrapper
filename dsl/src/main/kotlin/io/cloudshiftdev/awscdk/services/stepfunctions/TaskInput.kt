package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class TaskInput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput,
) {
  public open fun type(): InputType = unwrap(this).getType().let(InputType::wrap)

  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public open fun fromJsonPathAt(path: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromJsonPathAt(path).let(TaskInput::wrap)

    public open fun fromObject(obj: Map<String, Any>): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromObject(obj).let(TaskInput::wrap)

    public open fun fromText(text: String): TaskInput =
        software.amazon.awscdk.services.stepfunctions.TaskInput.fromText(text).let(TaskInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput): TaskInput
        = TaskInput(cdkObject)

    internal fun unwrap(wrapped: TaskInput): software.amazon.awscdk.services.stepfunctions.TaskInput
        = wrapped.cdkObject
  }
}
