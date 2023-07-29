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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * RangedConnectionDetailsProperty rangedConnectionDetailsProperty =
 * RangedConnectionDetailsProperty.builder()
 * .mtu(123)
 * .socketAddress(RangedSocketAddressProperty.builder()
 * .name("name")
 * .portRange(IntegerRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedconnectiondetails.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupRangedConnectionDetailsPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.Builder =
        CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.builder()

    /** @param mtu the value to be set. */
    public fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
    }

    /** @param socketAddress the value to be set. */
    public fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress)
    }

    /** @param socketAddress the value to be set. */
    public fun socketAddress(socketAddress: CfnDataflowEndpointGroup.RangedSocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress)
    }

    public fun build(): CfnDataflowEndpointGroup.RangedConnectionDetailsProperty =
        cdkBuilder.build()
}
