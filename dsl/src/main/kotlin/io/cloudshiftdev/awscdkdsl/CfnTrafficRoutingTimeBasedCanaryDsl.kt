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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary

/**
 * The traffic routing configuration if `CfnTrafficRoutingConfig.type` is
 * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnTrafficRoutingTimeBasedCanary cfnTrafficRoutingTimeBasedCanary =
 * CfnTrafficRoutingTimeBasedCanary.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnTrafficRoutingTimeBasedCanaryDsl {
    private val cdkBuilder: CfnTrafficRoutingTimeBasedCanary.Builder =
        CfnTrafficRoutingTimeBasedCanary.builder()

    /**
     * @param bakeTimeMins The number of minutes between the first and second traffic shifts of a
     *   time-based canary deployment.
     */
    public fun bakeTimeMins(bakeTimeMins: Number) {
        cdkBuilder.bakeTimeMins(bakeTimeMins)
    }

    /**
     * @param stepPercentage The percentage of traffic to shift in the first increment of a
     *   time-based canary deployment. The step percentage must be 14% or greater.
     */
    public fun stepPercentage(stepPercentage: Number) {
        cdkBuilder.stepPercentage(stepPercentage)
    }

    public fun build(): CfnTrafficRoutingTimeBasedCanary = cdkBuilder.build()
}
