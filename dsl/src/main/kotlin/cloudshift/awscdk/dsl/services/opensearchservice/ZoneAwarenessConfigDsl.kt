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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class ZoneAwarenessConfigDsl {
    private val cdkBuilder: ZoneAwarenessConfig.Builder = ZoneAwarenessConfig.builder()

    public fun availabilityZoneCount(availabilityZoneCount: Number) {
        cdkBuilder.availabilityZoneCount(availabilityZoneCount)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): ZoneAwarenessConfig = cdkBuilder.build()
}
