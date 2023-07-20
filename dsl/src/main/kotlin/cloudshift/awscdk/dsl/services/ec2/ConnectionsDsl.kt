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
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.ec2.IPeer
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.Port
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ConnectionsDsl {
    private val cdkBuilder: Connections.Builder = Connections.Builder.create()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun defaultPort(block: PortDsl.() -> Unit = {}) {
        val builder = PortDsl()
        builder.apply(block)
        cdkBuilder.defaultPort(builder.build())
    }

    public fun defaultPort(defaultPort: Port) {
        cdkBuilder.defaultPort(defaultPort)
    }

    public fun peer(peer: IPeer) {
        cdkBuilder.peer(peer)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun build(): Connections {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
