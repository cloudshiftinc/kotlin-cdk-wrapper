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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnEIPAssociationPropsDsl {
    private val cdkBuilder: CfnEIPAssociationProps.Builder = CfnEIPAssociationProps.builder()

    public fun allocationId(allocationId: String) {
        cdkBuilder.allocationId(allocationId)
    }

    public fun eip(eip: String) {
        cdkBuilder.eip(eip)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun build(): CfnEIPAssociationProps = cdkBuilder.build()
}
