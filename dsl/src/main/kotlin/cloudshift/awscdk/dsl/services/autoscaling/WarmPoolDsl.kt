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
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.PoolState
import software.amazon.awscdk.services.autoscaling.WarmPool
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class WarmPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: WarmPool.Builder = WarmPool.Builder.create(scope, id)

    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
        cdkBuilder.autoScalingGroup(autoScalingGroup)
    }

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

    public fun build(): WarmPool = cdkBuilder.build()
}
