package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean

public open class InlineCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.InlineCode,
) : Code(cdkObject) {
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.InlineCode): InlineCode =
        InlineCode(cdkObject)

    internal fun unwrap(wrapped: InlineCode): software.amazon.awscdk.services.lambda.InlineCode =
        wrapped.cdkObject
  }
}
