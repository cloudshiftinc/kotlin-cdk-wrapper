package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class Result internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Result,
) {
  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public open fun fromArray(`value`: List<Any>): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromArray(`value`).let(Result::wrap)

    public open fun fromBoolean(`value`: Boolean): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromBoolean(`value`).let(Result::wrap)

    public open fun fromNumber(`value`: Number): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromNumber(`value`).let(Result::wrap)

    public open fun fromObject(`value`: Map<String, Any>): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromObject(`value`).let(Result::wrap)

    public open fun fromString(`value`: String): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromString(`value`).let(Result::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Result): Result =
        Result(cdkObject)

    internal fun unwrap(wrapped: Result): software.amazon.awscdk.services.stepfunctions.Result =
        wrapped.cdkObject
  }
}
