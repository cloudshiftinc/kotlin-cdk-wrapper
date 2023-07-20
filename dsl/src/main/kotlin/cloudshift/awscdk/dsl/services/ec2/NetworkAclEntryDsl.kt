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
import software.amazon.awscdk.services.ec2.AclCidr
import software.amazon.awscdk.services.ec2.AclTraffic
import software.amazon.awscdk.services.ec2.Action
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.TrafficDirection
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class NetworkAclEntryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: NetworkAclEntry.Builder = NetworkAclEntry.Builder.create(scope, id)

    public fun cidr(cidr: AclCidr) {
        cdkBuilder.cidr(cidr)
    }

    public fun direction(direction: TrafficDirection) {
        cdkBuilder.direction(direction)
    }

    public fun networkAcl(networkAcl: INetworkAcl) {
        cdkBuilder.networkAcl(networkAcl)
    }

    public fun networkAclEntryName(networkAclEntryName: String) {
        cdkBuilder.networkAclEntryName(networkAclEntryName)
    }

    public fun ruleAction(ruleAction: Action) {
        cdkBuilder.ruleAction(ruleAction)
    }

    public fun ruleNumber(ruleNumber: Number) {
        cdkBuilder.ruleNumber(ruleNumber)
    }

    public fun traffic(traffic: AclTraffic) {
        cdkBuilder.traffic(traffic)
    }

    public fun build(): NetworkAclEntry = cdkBuilder.build()
}
