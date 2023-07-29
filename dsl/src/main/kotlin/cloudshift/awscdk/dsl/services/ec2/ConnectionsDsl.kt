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
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.ec2.IPeer
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.Port

/**
 * Manage the allowed network connections for constructs with Security Groups.
 *
 * Security Groups can be thought of as a firewall for network-connected devices. This class makes
 * it easy to allow network connections to and from security groups, and between security groups
 * individually. When establishing connectivity between security groups, it will automatically add
 * rules in both security groups
 *
 * This object can manage one or more security groups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * IPeer peer;
 * Port port;
 * SecurityGroup securityGroup;
 * Connections connections = Connections.Builder.create()
 * .defaultPort(port)
 * .peer(peer)
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
@CdkDslMarker
public class ConnectionsDsl {
    private val cdkBuilder: Connections.Builder = Connections.Builder.create()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * Default port range for initiating connections to and from this object.
     *
     * Default: - No default port
     *
     * @param defaultPort Default port range for initiating connections to and from this object.
     */
    public fun defaultPort(defaultPort: PortDsl.() -> Unit = {}) {
        val builder = PortDsl()
        builder.apply(defaultPort)
        cdkBuilder.defaultPort(builder.build())
    }

    /**
     * Default port range for initiating connections to and from this object.
     *
     * Default: - No default port
     *
     * @param defaultPort Default port range for initiating connections to and from this object.
     */
    public fun defaultPort(defaultPort: Port) {
        cdkBuilder.defaultPort(defaultPort)
    }

    /**
     * Class that represents the rule by which others can connect to this connectable.
     *
     * This object is required, but will be derived from securityGroup if that is passed.
     *
     * Default: Derived from securityGroup if set.
     *
     * @param peer Class that represents the rule by which others can connect to this connectable.
     */
    public fun peer(peer: IPeer) {
        cdkBuilder.peer(peer)
    }

    /**
     * What securityGroup(s) this object is managing connections for.
     *
     * Default: No security groups
     *
     * @param securityGroups What securityGroup(s) this object is managing connections for.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * What securityGroup(s) this object is managing connections for.
     *
     * Default: No security groups
     *
     * @param securityGroups What securityGroup(s) this object is managing connections for.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun build(): Connections {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
