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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.ConnectionRule

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ConnectionRule connectionRule = ConnectionRule.builder()
 * .fromPort(123)
 * // the properties below are optional
 * .description("description")
 * .protocol("protocol")
 * .toPort(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ConnectionRuleDsl {
    private val cdkBuilder: ConnectionRule.Builder = ConnectionRule.builder()

    /**
     * @param description Description of this connection. It is applied to both the ingress rule and
     *   the egress rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type number. If
     *   you specify icmp for the IpProtocol property, you can specify -1 as a wildcard (i.e., any
     *   ICMP type number).
     */
    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    /**
     * @param protocol The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). Use
     *   -1 to specify all protocols. If you specify -1, or a protocol number other than tcp, udp,
     *   icmp, or 58 (ICMPv6), traffic on all ports is allowed, regardless of any ports you specify.
     *   For tcp, udp, and icmp, you must specify a port range. For protocol 58 (ICMPv6), you can
     *   optionally specify a port range; if you don't, traffic for all types and codes is allowed.
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code. If you
     *   specify icmp for the IpProtocol property, you can specify -1 as a wildcard (i.e., any ICMP
     *   code).
     */
    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): ConnectionRule = cdkBuilder.build()
}
