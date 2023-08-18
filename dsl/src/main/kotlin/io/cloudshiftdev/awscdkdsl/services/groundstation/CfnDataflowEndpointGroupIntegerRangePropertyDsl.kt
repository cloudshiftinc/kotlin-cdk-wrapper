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

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * IntegerRangeProperty integerRangeProperty = IntegerRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-integerrange.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupIntegerRangePropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.IntegerRangeProperty.Builder =
        CfnDataflowEndpointGroup.IntegerRangeProperty.builder()

    /** @param maximum the value to be set. */
    public fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
    }

    /** @param minimum the value to be set. */
    public fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
    }

    public fun build(): CfnDataflowEndpointGroup.IntegerRangeProperty = cdkBuilder.build()
}
