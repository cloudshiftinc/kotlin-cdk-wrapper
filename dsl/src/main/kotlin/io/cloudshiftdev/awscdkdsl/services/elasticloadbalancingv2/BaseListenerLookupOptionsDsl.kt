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
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions

/**
 * Options for listener lookup.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * BaseListenerLookupOptions baseListenerLookupOptions = BaseListenerLookupOptions.builder()
 * .listenerPort(123)
 * .loadBalancerArn("loadBalancerArn")
 * .loadBalancerTags(Map.of(
 * "loadBalancerTagsKey", "loadBalancerTags"))
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseListenerLookupOptionsDsl {
    private val cdkBuilder: BaseListenerLookupOptions.Builder = BaseListenerLookupOptions.builder()

    /** @param listenerPort Filter listeners by listener port. */
    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    /** @param loadBalancerArn Filter listeners by associated load balancer arn. */
    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /** @param loadBalancerTags Filter listeners by associated load balancer tags. */
    public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
        cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build(): BaseListenerLookupOptions = cdkBuilder.build()
}
