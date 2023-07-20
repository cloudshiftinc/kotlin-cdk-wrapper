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
public class CfnEndpointSecondaryPropertyDsl {
    private val cdkBuilder: CfnEndpoint.SecondaryProperty.Builder =
        CfnEndpoint.SecondaryProperty.builder()

    public fun route(route: String) {
        cdkBuilder.route(route)
    }

    public fun build(): CfnEndpoint.SecondaryProperty = cdkBuilder.build()
}
