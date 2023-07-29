@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup

/**
 * A Target Group and weight combination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * NetworkTargetGroup networkTargetGroup;
 * NetworkWeightedTargetGroup networkWeightedTargetGroup = NetworkWeightedTargetGroup.builder()
 * .targetGroup(networkTargetGroup)
 * // the properties below are optional
 * .weight(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkWeightedTargetGroupDsl {
    private val cdkBuilder: NetworkWeightedTargetGroup.Builder =
        NetworkWeightedTargetGroup.builder()

    /** @param targetGroup The target group. */
    public fun targetGroup(targetGroup: INetworkTargetGroup) {
        cdkBuilder.targetGroup(targetGroup)
    }

    /** @param weight The target group's weight. Range is [0..1000). */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): NetworkWeightedTargetGroup = cdkBuilder.build()
}
