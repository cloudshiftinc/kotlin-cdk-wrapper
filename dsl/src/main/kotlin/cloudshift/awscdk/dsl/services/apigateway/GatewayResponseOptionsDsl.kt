@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.GatewayResponseOptions
import software.amazon.awscdk.services.apigateway.ResponseType
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class GatewayResponseOptionsDsl {
    private val cdkBuilder: GatewayResponseOptions.Builder = GatewayResponseOptions.builder()

    public fun responseHeaders(responseHeaders: Map<String, String>) {
        cdkBuilder.responseHeaders(responseHeaders)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun templates(templates: Map<String, String>) {
        cdkBuilder.templates(templates)
    }

    public fun type(type: ResponseType) {
        cdkBuilder.type(type)
    }

    public fun build(): GatewayResponseOptions = cdkBuilder.build()
}
