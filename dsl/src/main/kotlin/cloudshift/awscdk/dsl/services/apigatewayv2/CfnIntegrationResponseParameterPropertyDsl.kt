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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import kotlin.String

@CdkDslMarker
public class CfnIntegrationResponseParameterPropertyDsl {
    private val cdkBuilder: CfnIntegration.ResponseParameterProperty.Builder =
        CfnIntegration.ResponseParameterProperty.builder()

    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnIntegration.ResponseParameterProperty = cdkBuilder.build()
}
