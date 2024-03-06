@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigatewayv2.CorsHttpMethod
import software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions

/**
 * Options for the CORS Configuration.
 *
 * Example:
 * ```
 * HttpApi.Builder.create(this, "HttpProxyApi")
 * .corsPreflight(CorsPreflightOptions.builder()
 * .allowHeaders(List.of("Authorization"))
 * .allowMethods(List.of(CorsHttpMethod.GET, CorsHttpMethod.HEAD, CorsHttpMethod.OPTIONS,
 * CorsHttpMethod.POST))
 * .allowOrigins(List.of("*"))
 * .maxAge(Duration.days(10))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CorsPreflightOptionsDsl {
    private val cdkBuilder: CorsPreflightOptions.Builder = CorsPreflightOptions.builder()

    private val _allowHeaders: MutableList<String> = mutableListOf()

    private val _allowMethods: MutableList<CorsHttpMethod> = mutableListOf()

    private val _allowOrigins: MutableList<String> = mutableListOf()

    private val _exposeHeaders: MutableList<String> = mutableListOf()

    /** @param allowCredentials Specifies whether credentials are included in the CORS request. */
    public fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
    }

    /** @param allowHeaders Represents a collection of allowed headers. */
    public fun allowHeaders(vararg allowHeaders: String) {
        _allowHeaders.addAll(listOf(*allowHeaders))
    }

    /** @param allowHeaders Represents a collection of allowed headers. */
    public fun allowHeaders(allowHeaders: Collection<String>) {
        _allowHeaders.addAll(allowHeaders)
    }

    /** @param allowMethods Represents a collection of allowed HTTP methods. */
    public fun allowMethods(vararg allowMethods: CorsHttpMethod) {
        _allowMethods.addAll(listOf(*allowMethods))
    }

    /** @param allowMethods Represents a collection of allowed HTTP methods. */
    public fun allowMethods(allowMethods: Collection<CorsHttpMethod>) {
        _allowMethods.addAll(allowMethods)
    }

    /** @param allowOrigins Represents a collection of allowed origins. */
    public fun allowOrigins(vararg allowOrigins: String) {
        _allowOrigins.addAll(listOf(*allowOrigins))
    }

    /** @param allowOrigins Represents a collection of allowed origins. */
    public fun allowOrigins(allowOrigins: Collection<String>) {
        _allowOrigins.addAll(allowOrigins)
    }

    /** @param exposeHeaders Represents a collection of exposed headers. */
    public fun exposeHeaders(vararg exposeHeaders: String) {
        _exposeHeaders.addAll(listOf(*exposeHeaders))
    }

    /** @param exposeHeaders Represents a collection of exposed headers. */
    public fun exposeHeaders(exposeHeaders: Collection<String>) {
        _exposeHeaders.addAll(exposeHeaders)
    }

    /** @param maxAge The duration that the browser should cache preflight request results. */
    public fun maxAge(maxAge: Duration) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun build(): CorsPreflightOptions {
        if (_allowHeaders.isNotEmpty()) cdkBuilder.allowHeaders(_allowHeaders)
        if (_allowMethods.isNotEmpty()) cdkBuilder.allowMethods(_allowMethods)
        if (_allowOrigins.isNotEmpty()) cdkBuilder.allowOrigins(_allowOrigins)
        if (_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
        return cdkBuilder.build()
    }
}
