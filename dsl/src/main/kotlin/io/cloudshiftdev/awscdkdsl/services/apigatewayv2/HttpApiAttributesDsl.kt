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
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes

/**
 * Attributes for importing an HttpApi into the CDK.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * HttpApiAttributes httpApiAttributes = HttpApiAttributes.builder()
 * .httpApiId("httpApiId")
 * // the properties below are optional
 * .apiEndpoint("apiEndpoint")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpApiAttributesDsl {
    private val cdkBuilder: HttpApiAttributes.Builder = HttpApiAttributes.builder()

    /** @param apiEndpoint The endpoint URL of the HttpApi. */
    public fun apiEndpoint(apiEndpoint: String) {
        cdkBuilder.apiEndpoint(apiEndpoint)
    }

    /** @param httpApiId The identifier of the HttpApi. */
    public fun httpApiId(httpApiId: String) {
        cdkBuilder.httpApiId(httpApiId)
    }

    public fun build(): HttpApiAttributes = cdkBuilder.build()
}
