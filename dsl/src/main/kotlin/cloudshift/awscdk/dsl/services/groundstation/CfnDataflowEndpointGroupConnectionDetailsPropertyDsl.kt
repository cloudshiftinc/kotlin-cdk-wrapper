@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import kotlin.Number

@CdkDslMarker
public class CfnDataflowEndpointGroupConnectionDetailsPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.ConnectionDetailsProperty.Builder =
        CfnDataflowEndpointGroup.ConnectionDetailsProperty.builder()

    public fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
    }

    public fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress)
    }

    public fun socketAddress(socketAddress: CfnDataflowEndpointGroup.SocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress)
    }

    public fun build(): CfnDataflowEndpointGroup.ConnectionDetailsProperty = cdkBuilder.build()
}
