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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.GrpcRetryPolicy
import software.amazon.awscdk.services.appmesh.GrpcRouteMatch
import software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions
import software.amazon.awscdk.services.appmesh.GrpcTimeout
import software.amazon.awscdk.services.appmesh.WeightedTarget

/**
 * Properties specific for a GRPC Based Routes.
 *
 * Example:
 * ```
 * VirtualRouter router;
 * VirtualNode node;
 * router.addRoute("route-grpc-retry", RouteBaseProps.builder()
 * .routeSpec(RouteSpec.grpc(GrpcRouteSpecOptions.builder()
 * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
 * .match(GrpcRouteMatch.builder()
 * // When method name is specified, service name must be also specified.
 * .methodName("methodname")
 * .serviceName("servicename")
 * .metadata(List.of(HeaderMatch.valueStartsWith("Content-Type", "application/"),
 * HeaderMatch.valueDoesNotStartWith("Content-Type", "text/")))
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class GrpcRouteSpecOptionsDsl {
    private val cdkBuilder: GrpcRouteSpecOptions.Builder = GrpcRouteSpecOptions.builder()

    private val _weightedTargets: MutableList<WeightedTarget> = mutableListOf()

    /** @param match The criterion for determining a request match for this Route. */
    public fun match(match: GrpcRouteMatchDsl.() -> Unit = {}) {
        val builder = GrpcRouteMatchDsl()
        builder.apply(match)
        cdkBuilder.match(builder.build())
    }

    /** @param match The criterion for determining a request match for this Route. */
    public fun match(match: GrpcRouteMatch) {
        cdkBuilder.match(match)
    }

    /**
     * @param priority The priority for the route. When a Virtual Router has multiple routes, route
     *   match is performed in the order of specified value, where 0 is the highest priority, and
     *   first matched route is selected.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param retryPolicy The retry policy. */
    public fun retryPolicy(retryPolicy: GrpcRetryPolicyDsl.() -> Unit = {}) {
        val builder = GrpcRetryPolicyDsl()
        builder.apply(retryPolicy)
        cdkBuilder.retryPolicy(builder.build())
    }

    /** @param retryPolicy The retry policy. */
    public fun retryPolicy(retryPolicy: GrpcRetryPolicy) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /** @param timeout An object that represents a grpc timeout. */
    public fun timeout(timeout: GrpcTimeoutDsl.() -> Unit = {}) {
        val builder = GrpcTimeoutDsl()
        builder.apply(timeout)
        cdkBuilder.timeout(builder.build())
    }

    /** @param timeout An object that represents a grpc timeout. */
    public fun timeout(timeout: GrpcTimeout) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param weightedTargets List of targets that traffic is routed to when a request matches the
     *   route.
     */
    public fun weightedTargets(weightedTargets: WeightedTargetDsl.() -> Unit) {
        _weightedTargets.add(WeightedTargetDsl().apply(weightedTargets).build())
    }

    /**
     * @param weightedTargets List of targets that traffic is routed to when a request matches the
     *   route.
     */
    public fun weightedTargets(weightedTargets: Collection<WeightedTarget>) {
        _weightedTargets.addAll(weightedTargets)
    }

    public fun build(): GrpcRouteSpecOptions {
        if (_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
        return cdkBuilder.build()
    }
}
