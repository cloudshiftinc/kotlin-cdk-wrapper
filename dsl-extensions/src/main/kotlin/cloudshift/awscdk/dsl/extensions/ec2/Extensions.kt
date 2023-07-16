package cloudshift.awscdk.dsl.extensions.ec2

import cloudshift.awscdk.dsl.services.ec2.SecurityGroupDsl
import cloudshift.awscdk.dsl.services.ec2.ec2
import software.amazon.awscdk.services.ec2.CfnInternetGateway
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.Vpc
import software.constructs.Construct

public fun ec2.securityGroupNoOutbound(scope: Construct, id: String, block: (SecurityGroupDsl).() -> Unit) {
    securityGroup(scope, id) {
        allowAllOutbound(false)
        apply(block)
    }
}

/**
 * Attaches internet gateway to this VPC. Does not add it to routing tables. Useful for minimal
 * VPCs that have only ISOLATED subnets but require IGW for GlobalAccelerator or other purposes.
 */
public fun Vpc.attachInternetGateway(): CfnInternetGateway {
    val igw = CfnInternetGateway(this, "IGW")
    ec2.cfnVPCGatewayAttachment(this, "VPCGW") {
        internetGatewayId(igw.ref)
        vpcId(vpcId)
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
