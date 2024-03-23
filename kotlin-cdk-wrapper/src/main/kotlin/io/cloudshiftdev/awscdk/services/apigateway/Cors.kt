@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * RestApi.Builder.create(this, "api")
 * .defaultCorsPreflightOptions(CorsOptions.builder()
 * .allowOrigins(Cors.ALL_ORIGINS)
 * .allowMethods(Cors.ALL_METHODS)
 * .build())
 * .build();
 * ```
 */
public open class Cors(
  cdkObject: software.amazon.awscdk.services.apigateway.Cors,
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
        wrapped.cdkObject as software.amazon.awscdk.services.apigateway.Cors
  }
}
