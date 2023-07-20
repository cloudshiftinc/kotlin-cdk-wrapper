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
public class CfnDistributionCacheBehaviorPerPathPropertyDsl {
    private val cdkBuilder: CfnDistribution.CacheBehaviorPerPathProperty.Builder =
        CfnDistribution.CacheBehaviorPerPathProperty.builder()

    public fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnDistribution.CacheBehaviorPerPathProperty = cdkBuilder.build()
}
