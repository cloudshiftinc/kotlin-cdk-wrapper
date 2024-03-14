package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Handler internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.Handler,
) : CdkObject(cdkObject) {
  public companion object {
    public val FROM_IMAGE: String = software.amazon.awscdk.services.lambda.Handler.FROM_IMAGE

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Handler): Handler =
        Handler(cdkObject)

    internal fun unwrap(wrapped: Handler): software.amazon.awscdk.services.lambda.Handler =
        wrapped.cdkObject
  }
}
