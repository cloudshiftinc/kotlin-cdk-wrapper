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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnOriginEndpointStreamSelectionPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.StreamSelectionProperty.Builder =
        CfnOriginEndpoint.StreamSelectionProperty.builder()

    public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
        cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
    }

    public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
        cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
    }

    public fun streamOrder(streamOrder: String) {
        cdkBuilder.streamOrder(streamOrder)
    }

    public fun build(): CfnOriginEndpoint.StreamSelectionProperty = cdkBuilder.build()
}
