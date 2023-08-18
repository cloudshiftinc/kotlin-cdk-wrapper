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
import software.amazon.awscdk.services.appmesh.IVirtualNode
import software.amazon.awscdk.services.appmesh.WeightedTarget

/**
 * Properties for the Weighted Targets in the route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualNode virtualNode;
 * WeightedTarget weightedTarget = WeightedTarget.builder()
 * .virtualNode(virtualNode)
 * // the properties below are optional
 * .port(123)
 * .weight(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class WeightedTargetDsl {
    private val cdkBuilder: WeightedTarget.Builder = WeightedTarget.builder()

    /** @param port The port to match from the request. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param virtualNode The VirtualNode the route points to. */
    public fun virtualNode(virtualNode: IVirtualNode) {
        cdkBuilder.virtualNode(virtualNode)
    }

    /** @param weight The weight for the target. */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): WeightedTarget = cdkBuilder.build()
}
