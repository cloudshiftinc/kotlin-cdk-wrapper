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
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AclIcmp
import software.amazon.awscdk.services.ec2.AclPortRange
import software.amazon.awscdk.services.ec2.AclTrafficConfig

/**
 * Acl Configuration for traffic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AclTrafficConfig aclTrafficConfig = AclTrafficConfig.builder()
 * .protocol(123)
 * // the properties below are optional
 * .icmp(AclIcmp.builder()
 * .code(123)
 * .type(123)
 * .build())
 * .portRange(AclPortRange.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AclTrafficConfigDsl {
    private val cdkBuilder: AclTrafficConfig.Builder = AclTrafficConfig.builder()

    /** @param icmp The Internet Control Message Protocol (ICMP) code and type. */
    public fun icmp(icmp: AclIcmpDsl.() -> Unit = {}) {
        val builder = AclIcmpDsl()
        builder.apply(icmp)
        cdkBuilder.icmp(builder.build())
    }

    /** @param icmp The Internet Control Message Protocol (ICMP) code and type. */
    public fun icmp(icmp: AclIcmp) {
        cdkBuilder.icmp(icmp)
    }

    /** @param portRange The range of port numbers for the UDP/TCP protocol. */
    public fun portRange(portRange: AclPortRangeDsl.() -> Unit = {}) {
        val builder = AclPortRangeDsl()
        builder.apply(portRange)
        cdkBuilder.portRange(builder.build())
    }

    /** @param portRange The range of port numbers for the UDP/TCP protocol. */
    public fun portRange(portRange: AclPortRange) {
        cdkBuilder.portRange(portRange)
    }

    /**
     * @param protocol The protocol number. A value of "-1" means all protocols.
     *
     * If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1" (ICMP),
     * traffic on all ports is allowed, regardless of any ports or ICMP types or codes that you
     * specify.
     *
     * If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP
     * types and codes allowed, regardless of any that you specify. If you specify protocol "58"
     * (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type and code.
     */
    public fun protocol(protocol: Number) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): AclTrafficConfig = cdkBuilder.build()
}
