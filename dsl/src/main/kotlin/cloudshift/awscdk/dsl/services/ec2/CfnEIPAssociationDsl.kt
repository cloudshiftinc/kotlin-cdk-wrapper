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
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnEIPAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEIPAssociation.Builder = CfnEIPAssociation.Builder.create(scope, id)

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

    public fun build(): CfnEIPAssociation = cdkBuilder.build()
}
