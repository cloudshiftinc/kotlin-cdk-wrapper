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
public class CfnDataflowEndpointGroupRangedConnectionDetailsPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.Builder =
        CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.builder()

    public fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
    }

    public fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress)
    }

    public fun socketAddress(socketAddress: CfnDataflowEndpointGroup.RangedSocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress)
    }

    public fun build(): CfnDataflowEndpointGroup.RangedConnectionDetailsProperty = cdkBuilder.build()
}
