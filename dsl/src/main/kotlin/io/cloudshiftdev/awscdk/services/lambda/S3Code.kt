package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean

public open class S3Code internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.S3Code,
) : Code(cdkObject) {
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.S3Code): S3Code =
        S3Code(cdkObject)

    internal fun unwrap(wrapped: S3Code): software.amazon.awscdk.services.lambda.S3Code =
        wrapped.cdkObject
  }
}
