@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.cxapi.SynthesisMessage
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public open class Annotations internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.Annotations,
) : CdkObject(cdkObject) {
  public open fun findError(constructPath: String, message: Any): List<SynthesisMessage> =
      unwrap(this).findError(constructPath, message).map(SynthesisMessage::wrap)

  public open fun findInfo(constructPath: String, message: Any): List<SynthesisMessage> =
      unwrap(this).findInfo(constructPath, message).map(SynthesisMessage::wrap)

  public open fun findWarning(constructPath: String, message: Any): List<SynthesisMessage> =
      unwrap(this).findWarning(constructPath, message).map(SynthesisMessage::wrap)

  public open fun hasError(constructPath: String, message: Any) {
    unwrap(this).hasError(constructPath, message)
  }

  public open fun hasInfo(constructPath: String, message: Any) {
    unwrap(this).hasInfo(constructPath, message)
  }

  public open fun hasNoError(constructPath: String, message: Any) {
    unwrap(this).hasNoError(constructPath, message)
  }

  public open fun hasNoInfo(constructPath: String, message: Any) {
    unwrap(this).hasNoInfo(constructPath, message)
  }

  public open fun hasNoWarning(constructPath: String, message: Any) {
    unwrap(this).hasNoWarning(constructPath, message)
  }

  public open fun hasWarning(constructPath: String, message: Any) {
    unwrap(this).hasWarning(constructPath, message)
  }

  public companion object {
    public fun fromStack(stack: Stack): Annotations =
        software.amazon.awscdk.assertions.Annotations.fromStack(stack.let(Stack::unwrap)).let(Annotations::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Annotations): Annotations =
        Annotations(cdkObject)

    internal fun unwrap(wrapped: Annotations): software.amazon.awscdk.assertions.Annotations =
        wrapped.cdkObject
  }
}
