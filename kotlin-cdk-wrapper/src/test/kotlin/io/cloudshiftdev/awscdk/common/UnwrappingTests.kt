package io.cloudshiftdev.awscdk.common

import io.cloudshiftdev.awscdk.App
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IpAddresses
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ec2.SubnetType
import io.cloudshiftdev.awscdk.services.ec2.Vpc
import io.cloudshiftdev.awscdk.services.networkfirewall.CfnFirewall
import io.kotest.core.spec.style.FunSpec

class UnwrappingTests : FunSpec() {

    init {
        test("unwrapping works") {
            val app = App()

            val stack = Stack(app, "MyStack")

            val vpc = Vpc(stack, "MyVpc") {
                ipAddresses(IpAddresses.cidr("10.200.0.0/20"))
            }

            val subnets = vpc.selectSubnets(SubnetSelection { subnetType(SubnetType.PUBLIC)}).subnets()

            val x = subnets.toSubnetMappings()
//            val y = CfnFirewall.SubnetMappingProperty.unwrap(x)
//            println("Class: ${x::class.qualifiedName} ${y::class.qualifiedName}")
            val nfw = CfnFirewall(vpc, "Firewall") {
                firewallName("abc")
                vpcId(vpc.vpcId())
                subnetMappings(x)
                firewallPolicyArn("arn:123")
            }

            app.synth()
        }

    }

    private fun List<ISubnet>.toSubnetMappings(): List<CfnFirewall.SubnetMappingProperty> {
        return map {
            CfnFirewall.SubnetMappingProperty {
                subnetId(it.subnetId())
            }
        }
    }
}
