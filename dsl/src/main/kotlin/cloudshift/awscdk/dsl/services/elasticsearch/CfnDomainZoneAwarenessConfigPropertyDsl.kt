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
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import kotlin.Number

@CdkDslMarker
public class CfnDomainZoneAwarenessConfigPropertyDsl {
    private val cdkBuilder: CfnDomain.ZoneAwarenessConfigProperty.Builder =
        CfnDomain.ZoneAwarenessConfigProperty.builder()

    public fun availabilityZoneCount(availabilityZoneCount: Number) {
        cdkBuilder.availabilityZoneCount(availabilityZoneCount)
    }

    public fun build(): CfnDomain.ZoneAwarenessConfigProperty = cdkBuilder.build()
}
