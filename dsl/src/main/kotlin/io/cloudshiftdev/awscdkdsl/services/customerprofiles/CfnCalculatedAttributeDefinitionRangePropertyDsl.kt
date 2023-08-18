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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition

/**
 * The relative time period over which data is included in the aggregation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * RangeProperty rangeProperty = RangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-range.html)
 */
@CdkDslMarker
public class CfnCalculatedAttributeDefinitionRangePropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.RangeProperty.Builder =
        CfnCalculatedAttributeDefinition.RangeProperty.builder()

    /** @param unit The unit of time. */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /** @param value The amount of time of the specified unit. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCalculatedAttributeDefinition.RangeProperty = cdkBuilder.build()
}
