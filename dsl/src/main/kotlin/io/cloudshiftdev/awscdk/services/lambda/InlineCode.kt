package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean

public open class InlineCode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.InlineCode,
) : Code(cdkObject) {
  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.InlineCode): InlineCode =
        InlineCode(cdkObject)

    internal fun unwrap(wrapped: InlineCode): software.amazon.awscdk.services.lambda.InlineCode =
        wrapped.cdkObject
  }
}
