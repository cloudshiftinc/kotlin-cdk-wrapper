@file:Suppress("PropertyName")

package io.cloudshiftdev.awscdk.ext.ec2

import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ec2.SubnetType

public interface SubnetSelections {
    public val PublicSubnets: SubnetSelection
    public val PrivateSubnets: SubnetSelection
    public val IsolatedSubnets: SubnetSelection

    public fun named(name: String): SubnetSelection = SubnetSelection { subnetGroupName(name) }
}

private object SubnetSelectionsImpl : SubnetSelections {
    override val PublicSubnets: SubnetSelection =
        SubnetSelection { subnetType(SubnetType.PUBLIC) }
    override val PrivateSubnets: SubnetSelection =
        SubnetSelection { subnetType(SubnetType.PRIVATE_WITH_EGRESS) }
    override val IsolatedSubnets: SubnetSelection =
        SubnetSelection { subnetType(SubnetType.PRIVATE_ISOLATED) }
}

public val subnetSelections: SubnetSelections
    get() = SubnetSelectionsImpl
