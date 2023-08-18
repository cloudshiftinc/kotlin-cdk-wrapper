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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents a target and its relative weight.
 *
 * Traffic is distributed across targets according to their relative weight. For example, a weighted
 * target with a relative weight of 50 receives five times as much traffic as one with a relative
 * weight of 10. The total weight for all targets combined must be less than or equal to 100.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * WeightedTargetProperty weightedTargetProperty = WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html)
 */
@CdkDslMarker
public class CfnRouteWeightedTargetPropertyDsl {
    private val cdkBuilder: CfnRoute.WeightedTargetProperty.Builder =
        CfnRoute.WeightedTargetProperty.builder()

    /** @param port The targeted port of the weighted object. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param virtualNode The virtual node to associate with the weighted target. */
    public fun virtualNode(virtualNode: String) {
        cdkBuilder.virtualNode(virtualNode)
    }

    /** @param weight The relative weight of the weighted target. */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnRoute.WeightedTargetProperty = cdkBuilder.build()
}
