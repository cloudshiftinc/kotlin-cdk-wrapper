package io.cloudshiftdev.awscdk.ext.ec2

import io.cloudshiftdev.awscdk.services.ec2.CfnInternetGateway
import io.cloudshiftdev.awscdk.services.ec2.CfnVPCGatewayAttachment
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.PrivateSubnet
import io.cloudshiftdev.awscdk.services.ec2.PublicSubnet
import io.cloudshiftdev.awscdk.services.ec2.SecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.Vpc
import io.cloudshiftdev.constructs.Construct

public fun securityGroupNoOutbound(
    scope: Construct,
    id: String,
    block: (SecurityGroup.Builder).() -> Unit
) {
    SecurityGroup(scope, id) {
        allowAllOutbound(false)
        apply(block)
    }
}

/**
 * Attaches internet gateway to this VPC. Does not add it to routing tables. Useful for minimal VPCs
 * that have only ISOLATED subnets but require IGW for GlobalAccelerator or other purposes.
 */
public fun Vpc.attachInternetGateway(): CfnInternetGateway {
    val igw = CfnInternetGateway(this, "IGW")
    CfnVPCGatewayAttachment(this, "VPCGW") {
        internetGatewayId(igw.ref())
        vpcId(vpcId())
    }
    return igw
}

public fun ISubnet.isPublic(): Boolean {
    return this is PublicSubnet
}

public fun ISubnet.isPrivate(): Boolean {
    return this is PrivateSubnet
}

public fun ISubnet.isIsolated(): Boolean {
    return !(isPublic() || isPrivate())
}
