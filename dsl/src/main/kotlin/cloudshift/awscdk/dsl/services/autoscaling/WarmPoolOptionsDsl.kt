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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.PoolState
import software.amazon.awscdk.services.autoscaling.WarmPoolOptions
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class WarmPoolOptionsDsl {
    private val cdkBuilder: WarmPoolOptions.Builder = WarmPoolOptions.builder()

    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
        cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    public fun poolState(poolState: PoolState) {
        cdkBuilder.poolState(poolState)
    }

    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): WarmPoolOptions = cdkBuilder.build()
}
