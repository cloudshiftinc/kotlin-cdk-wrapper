@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * The result of a Pass operation.
 *
 * Example:
 *
 * ```
 * // Makes the current JSON state { ..., "subObject": { "hello": "world" } }
 * Pass pass = Pass.Builder.create(this, "Add Hello World")
 * .result(Result.fromObject(Map.of("hello", "world")))
 * .resultPath("$.subObject")
 * .build();
 * // Set the next state
 * Pass nextState = new Pass(this, "NextState");
 * pass.next(nextState);
 * ```
 */
public open class Result(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Result,
) : CdkObject(cdkObject) {
  /**
   * result of the Pass operation.
   */
  public open fun `value`(): Any = unwrap(this).getValue()

  public companion object {
    public fun fromArray(`value`: List<Any>): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromArray(`value`).let(Result::wrap)

    public fun fromArray(vararg `value`: Any): Result = fromArray(`value`.toList())

    public fun fromBoolean(`value`: Boolean): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromBoolean(`value`).let(Result::wrap)

    public fun fromNumber(`value`: Number): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromNumber(`value`).let(Result::wrap)

    public fun fromObject(`value`: Map<String, Any>): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromObject(`value`).let(Result::wrap)

    public fun fromString(`value`: String): Result =
        software.amazon.awscdk.services.stepfunctions.Result.fromString(`value`).let(Result::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Result): Result =
        Result(cdkObject)

    internal fun unwrap(wrapped: Result): software.amazon.awscdk.services.stepfunctions.Result =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Result
  }
}
