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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lightsail.CfnDistribution
import kotlin.String

@CdkDslMarker
public class CfnDistributionCacheBehaviorPropertyDsl {
    private val cdkBuilder: CfnDistribution.CacheBehaviorProperty.Builder =
        CfnDistribution.CacheBehaviorProperty.builder()

    public fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
    }

    public fun build(): CfnDistribution.CacheBehaviorProperty = cdkBuilder.build()
}
