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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.dynamodb.EnableScalingProps

/**
 * Properties for enabling DynamoDB capacity scaling.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.dynamodb.*;
 * Table table;
 * IScalableTableAttribute readCapacity = table.autoScaleReadCapacity(EnableScalingProps.builder()
 * .minCapacity(10)
 * .maxCapacity(1000)
 * .build());
 * readCapacity.scaleOnUtilization(UtilizationScalingProps.builder()
 * .targetUtilizationPercent(60)
 * .build());
 * ```
 */
@CdkDslMarker
public class EnableScalingPropsDsl {
    private val cdkBuilder: EnableScalingProps.Builder = EnableScalingProps.builder()

    /** @param maxCapacity Maximum capacity to scale to. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity Minimum capacity to scale to. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): EnableScalingProps = cdkBuilder.build()
}
