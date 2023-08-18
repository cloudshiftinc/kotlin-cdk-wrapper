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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.GrpcTimeout

/**
 * Represents timeouts for GRPC protocols.
 *
 * Example:
 * ```
 * VirtualRouter router;
 * VirtualNode node;
 * router.addRoute("route-http", RouteBaseProps.builder()
 * .routeSpec(RouteSpec.grpc(GrpcRouteSpecOptions.builder()
 * .weightedTargets(List.of(WeightedTarget.builder()
 * .virtualNode(node)
 * .build()))
 * .match(GrpcRouteMatch.builder()
 * .serviceName("my-service.default.svc.cluster.local")
 * .build())
 * .timeout(GrpcTimeout.builder()
 * .idle(Duration.seconds(2))
 * .perRequest(Duration.seconds(1))
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class GrpcTimeoutDsl {
    private val cdkBuilder: GrpcTimeout.Builder = GrpcTimeout.builder()

    /** @param idle Represents an idle timeout. The amount of time that a connection may be idle. */
    public fun idle(idle: Duration) {
        cdkBuilder.idle(idle)
    }

    /** @param perRequest Represents per request timeout. */
    public fun perRequest(perRequest: Duration) {
        cdkBuilder.perRequest(perRequest)
    }

    public fun build(): GrpcTimeout = cdkBuilder.build()
}
