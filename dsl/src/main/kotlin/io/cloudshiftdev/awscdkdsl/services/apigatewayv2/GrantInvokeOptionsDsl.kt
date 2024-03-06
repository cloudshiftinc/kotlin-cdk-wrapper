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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions
import software.amazon.awscdk.services.apigatewayv2.HttpMethod

/**
 * Options for granting invoke access.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * GrantInvokeOptions grantInvokeOptions = GrantInvokeOptions.builder()
 * .httpMethods(List.of(HttpMethod.ANY))
 * .build();
 * ```
 */
@CdkDslMarker
public class GrantInvokeOptionsDsl {
    private val cdkBuilder: GrantInvokeOptions.Builder = GrantInvokeOptions.builder()

    private val _httpMethods: MutableList<HttpMethod> = mutableListOf()

    /** @param httpMethods The HTTP methods to allow. */
    public fun httpMethods(vararg httpMethods: HttpMethod) {
        _httpMethods.addAll(listOf(*httpMethods))
    }

    /** @param httpMethods The HTTP methods to allow. */
    public fun httpMethods(httpMethods: Collection<HttpMethod>) {
        _httpMethods.addAll(httpMethods)
    }

    public fun build(): GrantInvokeOptions {
        if (_httpMethods.isNotEmpty()) cdkBuilder.httpMethods(_httpMethods)
        return cdkBuilder.build()
    }
}
