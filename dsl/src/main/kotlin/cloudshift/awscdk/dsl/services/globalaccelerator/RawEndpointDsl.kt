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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.globalaccelerator.RawEndpoint
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class RawEndpointDsl {
    private val cdkBuilder: RawEndpoint.Builder = RawEndpoint.Builder.create()

    public fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
    }

    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): RawEndpoint = cdkBuilder.build()
}
