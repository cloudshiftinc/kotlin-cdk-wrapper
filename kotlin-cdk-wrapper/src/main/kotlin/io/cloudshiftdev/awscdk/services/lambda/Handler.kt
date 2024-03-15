@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Lambda function handler.
 */
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
