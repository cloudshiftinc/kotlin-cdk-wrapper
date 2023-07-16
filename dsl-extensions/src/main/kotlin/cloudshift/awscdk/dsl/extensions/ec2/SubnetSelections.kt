@file:Suppress("PropertyName")

package cloudshift.awscdk.dsl.extensions.ec2

import cloudshift.awscdk.dsl.services.ec2.ec2
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.SubnetType

public interface SubnetSelections {
    public val PublicSubnets: SubnetSelection
    public val PrivateSubnets: SubnetSelection
    public val IsolatedSubnets: SubnetSelection

    public fun named(name: String): SubnetSelection = ec2.subnetSelection { subnetGroupName(name) }
}

private object SubnetSelectionsImpl : SubnetSelections {
    override val PublicSubnets: SubnetSelection = ec2.subnetSelection { subnetType(SubnetType.PUBLIC) }
    override val PrivateSubnets: SubnetSelection = ec2.subnetSelection { subnetType(SubnetType.PRIVATE_WITH_EGRESS) }
    override val IsolatedSubnets: SubnetSelection = ec2.subnetSelection { subnetType(SubnetType.PRIVATE_ISOLATED) }
}

public val ec2.SubnetSelections : SubnetSelections
    get() = SubnetSelectionsImpl
