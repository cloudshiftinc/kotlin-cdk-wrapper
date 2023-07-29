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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse

/**
 * Properties of a discovered load balancer listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * LoadBalancerListenerContextResponse loadBalancerListenerContextResponse =
 * LoadBalancerListenerContextResponse.builder()
 * .listenerArn("listenerArn")
 * .listenerPort(123)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build();
 * ```
 */
@CdkDslMarker
public class LoadBalancerListenerContextResponseDsl {
    private val cdkBuilder: LoadBalancerListenerContextResponse.Builder =
        LoadBalancerListenerContextResponse.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    /** @param listenerArn The ARN of the listener. */
    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    /** @param listenerPort The port the listener is listening on. */
    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    /** @param securityGroupIds The security groups of the load balancer. */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /** @param securityGroupIds The security groups of the load balancer. */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun build(): LoadBalancerListenerContextResponse {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
