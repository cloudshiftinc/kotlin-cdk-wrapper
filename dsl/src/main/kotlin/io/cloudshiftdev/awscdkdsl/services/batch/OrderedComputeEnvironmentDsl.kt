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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.batch.IComputeEnvironment
import software.amazon.awscdk.services.batch.OrderedComputeEnvironment

/**
 * Assigns an order to a ComputeEnvironment.
 *
 * The JobQueue will prioritize the lowest-order ComputeEnvironment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * IComputeEnvironment computeEnvironment;
 * OrderedComputeEnvironment orderedComputeEnvironment = OrderedComputeEnvironment.builder()
 * .computeEnvironment(computeEnvironment)
 * .order(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class OrderedComputeEnvironmentDsl {
    private val cdkBuilder: OrderedComputeEnvironment.Builder = OrderedComputeEnvironment.builder()

    /** @param computeEnvironment The ComputeEnvironment to link to this JobQueue. */
    public fun computeEnvironment(computeEnvironment: IComputeEnvironment) {
        cdkBuilder.computeEnvironment(computeEnvironment)
    }

    /** @param order The order associated with `computeEnvironment`. */
    public fun order(order: Number) {
        cdkBuilder.order(order)
    }

    public fun build(): OrderedComputeEnvironment = cdkBuilder.build()
}
