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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about a source IP condition.
 *
 * You can use this condition to route based on the IP address of the source that connects to the
 * load balancer. If a client is behind a proxy, this is the IP address of the proxy not the IP
 * address of the client.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * SourceIpConfigProperty sourceIpConfigProperty = SourceIpConfigProperty.builder()
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html)
 */
@CdkDslMarker
public class CfnListenerRuleSourceIpConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.SourceIpConfigProperty.Builder =
        CfnListenerRule.SourceIpConfigProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param values The source IP addresses, in CIDR format. You can use both IPv4 and IPv6
     *   addresses. Wildcards are not supported. If you specify multiple addresses, the condition is
     *   satisfied if the source IP address of the request matches one of the CIDR blocks. This
     *   condition is not satisfied by the addresses in the X-Forwarded-For header.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The source IP addresses, in CIDR format. You can use both IPv4 and IPv6
     *   addresses. Wildcards are not supported. If you specify multiple addresses, the condition is
     *   satisfied if the source IP address of the request matches one of the CIDR blocks. This
     *   condition is not satisfied by the addresses in the X-Forwarded-For header.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnListenerRule.SourceIpConfigProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
