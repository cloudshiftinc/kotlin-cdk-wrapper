package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.List

public open class Cors internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.Cors,
) : CdkObject(cdkObject) {
  public companion object {
    public val ALL_METHODS: List<String> =
        software.amazon.awscdk.services.apigateway.Cors.ALL_METHODS

    public val ALL_ORIGINS: List<String> =
        software.amazon.awscdk.services.apigateway.Cors.ALL_ORIGINS

    public val DEFAULT_HEADERS: List<String> =
        software.amazon.awscdk.services.apigateway.Cors.DEFAULT_HEADERS

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Cors): Cors =
        Cors(cdkObject)

    internal fun unwrap(wrapped: Cors): software.amazon.awscdk.services.apigateway.Cors =
        wrapped.cdkObject
  }
}
