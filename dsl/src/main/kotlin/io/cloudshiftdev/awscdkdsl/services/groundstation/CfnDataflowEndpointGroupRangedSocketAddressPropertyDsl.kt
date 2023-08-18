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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * RangedSocketAddressProperty rangedSocketAddressProperty = RangedSocketAddressProperty.builder()
 * .name("name")
 * .portRange(IntegerRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedsocketaddress.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupRangedSocketAddressPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.RangedSocketAddressProperty.Builder =
        CfnDataflowEndpointGroup.RangedSocketAddressProperty.builder()

    /** @param name the value to be set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param portRange the value to be set. */
    public fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange)
    }

    /** @param portRange the value to be set. */
    public fun portRange(portRange: CfnDataflowEndpointGroup.IntegerRangeProperty) {
        cdkBuilder.portRange(portRange)
    }

    public fun build(): CfnDataflowEndpointGroup.RangedSocketAddressProperty = cdkBuilder.build()
}
