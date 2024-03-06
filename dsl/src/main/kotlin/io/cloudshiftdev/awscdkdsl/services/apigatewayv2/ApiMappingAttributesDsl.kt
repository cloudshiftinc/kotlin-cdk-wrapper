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
import software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes

/**
 * The attributes used to import existing ApiMapping.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ApiMappingAttributes apiMappingAttributes = ApiMappingAttributes.builder()
 * .apiMappingId("apiMappingId")
 * .build();
 * ```
 */
@CdkDslMarker
public class ApiMappingAttributesDsl {
    private val cdkBuilder: ApiMappingAttributes.Builder = ApiMappingAttributes.builder()

    /** @param apiMappingId The API mapping ID. */
    public fun apiMappingId(apiMappingId: String) {
        cdkBuilder.apiMappingId(apiMappingId)
    }

    public fun build(): ApiMappingAttributes = cdkBuilder.build()
}
