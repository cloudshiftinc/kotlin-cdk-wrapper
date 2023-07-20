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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup
import kotlin.Number

@CdkDslMarker
public class NetworkWeightedTargetGroupDsl {
    private val cdkBuilder: NetworkWeightedTargetGroup.Builder = NetworkWeightedTargetGroup.builder()

    public fun targetGroup(targetGroup: INetworkTargetGroup) {
        cdkBuilder.targetGroup(targetGroup)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): NetworkWeightedTargetGroup = cdkBuilder.build()
}
