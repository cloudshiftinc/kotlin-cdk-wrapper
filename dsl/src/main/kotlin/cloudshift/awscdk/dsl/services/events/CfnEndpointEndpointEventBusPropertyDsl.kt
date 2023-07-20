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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnEndpoint
import kotlin.String

@CdkDslMarker
public class CfnEndpointEndpointEventBusPropertyDsl {
    private val cdkBuilder: CfnEndpoint.EndpointEventBusProperty.Builder =
        CfnEndpoint.EndpointEventBusProperty.builder()

    public fun eventBusArn(eventBusArn: String) {
        cdkBuilder.eventBusArn(eventBusArn)
    }

    public fun build(): CfnEndpoint.EndpointEventBusProperty = cdkBuilder.build()
}
