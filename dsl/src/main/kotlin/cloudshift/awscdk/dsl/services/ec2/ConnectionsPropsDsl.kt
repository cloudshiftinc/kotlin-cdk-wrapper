@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ConnectionsProps
import software.amazon.awscdk.services.ec2.IPeer
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.Port

/**
 * Properties to intialize a new Connections object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * IPeer peer;
 * Port port;
 * SecurityGroup securityGroup;
 * ConnectionsProps connectionsProps = ConnectionsProps.builder()
 * .defaultPort(port)
 * .peer(peer)
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
@CdkDslMarker
public class ConnectionsPropsDsl {
    private val cdkBuilder: ConnectionsProps.Builder = ConnectionsProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param defaultPort Default port range for initiating connections to and from this object. */
    public fun defaultPort(defaultPort: PortDsl.() -> Unit = {}) {
        val builder = PortDsl()
        builder.apply(defaultPort)
        cdkBuilder.defaultPort(builder.build())
    }

    /** @param defaultPort Default port range for initiating connections to and from this object. */
    public fun defaultPort(defaultPort: Port) {
        cdkBuilder.defaultPort(defaultPort)
    }

    /**
     * @param peer Class that represents the rule by which others can connect to this connectable.
     *   This object is required, but will be derived from securityGroup if that is passed.
     */
    public fun peer(peer: IPeer) {
        cdkBuilder.peer(peer)
    }

    /** @param securityGroups What securityGroup(s) this object is managing connections for. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups What securityGroup(s) this object is managing connections for. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun build(): ConnectionsProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
