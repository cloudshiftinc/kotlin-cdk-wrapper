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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverRule

/**
 * In a
 * [CreateResolverRule](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html)
 * request, an array of the IPs that you want to forward DNS queries to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * TargetAddressProperty targetAddressProperty = TargetAddressProperty.builder()
 * .ip("ip")
 * .ipv6("ipv6")
 * .port("port")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html)
 */
@CdkDslMarker
public class CfnResolverRuleTargetAddressPropertyDsl {
    private val cdkBuilder: CfnResolverRule.TargetAddressProperty.Builder =
        CfnResolverRule.TargetAddressProperty.builder()

    /** @param ip One IPv4 address that you want to forward DNS queries to. */
    public fun ip(ip: String) {
        cdkBuilder.ip(ip)
    }

    /** @param ipv6 One IPv6 address that you want to forward DNS queries to. */
    public fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
    }

    /** @param port The port at `Ip` that you want to forward DNS queries to. */
    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnResolverRule.TargetAddressProperty = cdkBuilder.build()
}
