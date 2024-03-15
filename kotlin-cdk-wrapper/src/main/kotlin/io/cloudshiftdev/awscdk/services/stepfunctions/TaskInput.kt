@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public open class TaskInput internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskInput,
) : CdkObject(cdkObject) {
  public open fun type(): InputType = unwrap(this).getType().let(InputType::wrap)

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
