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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * ConnectionDetailsProperty connectionDetailsProperty = ConnectionDetailsProperty.builder()
 * .mtu(123)
 * .socketAddress(SocketAddressProperty.builder()
 * .name("name")
 * .port(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-connectiondetails.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupConnectionDetailsPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.ConnectionDetailsProperty.Builder =
        CfnDataflowEndpointGroup.ConnectionDetailsProperty.builder()

    /** @param mtu the value to be set. */
    public fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
    }

    /** @param socketAddress the value to be set. */
    public fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress)
    }

    /** @param socketAddress the value to be set. */
    public fun socketAddress(socketAddress: CfnDataflowEndpointGroup.SocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress)
    }

    public fun build(): CfnDataflowEndpointGroup.ConnectionDetailsProperty = cdkBuilder.build()
}
