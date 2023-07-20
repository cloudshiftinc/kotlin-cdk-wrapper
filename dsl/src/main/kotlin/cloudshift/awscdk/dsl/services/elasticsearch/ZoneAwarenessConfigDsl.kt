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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class ZoneAwarenessConfigDsl {
    private val cdkBuilder: ZoneAwarenessConfig.Builder = ZoneAwarenessConfig.builder()

    @Deprecated(message = "deprecated in CDK")
    public fun availabilityZoneCount(availabilityZoneCount: Number) {
        cdkBuilder.availabilityZoneCount(availabilityZoneCount)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): ZoneAwarenessConfig = cdkBuilder.build()
}
