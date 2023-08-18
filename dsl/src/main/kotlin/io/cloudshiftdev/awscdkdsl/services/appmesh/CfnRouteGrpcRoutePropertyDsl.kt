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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents a gRPC route type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcRouteProperty grpcRouteProperty = GrpcRouteProperty.builder()
 * .action(GrpcRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(GrpcRouteMatchProperty.builder()
 * .metadata(List.of(GrpcRouteMetadataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(GrpcRouteMetadataMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .methodName("methodName")
 * .port(123)
 * .serviceName("serviceName")
 * .build())
 * // the properties below are optional
 * .retryPolicy(GrpcRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .grpcRetryEvents(List.of("grpcRetryEvents"))
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(GrpcTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html)
 */
@CdkDslMarker
public class CfnRouteGrpcRoutePropertyDsl {
    private val cdkBuilder: CfnRoute.GrpcRouteProperty.Builder =
        CfnRoute.GrpcRouteProperty.builder()

    /** @param action An object that represents the action to take if a match is determined. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action An object that represents the action to take if a match is determined. */
    public fun action(action: CfnRoute.GrpcRouteActionProperty) {
        cdkBuilder.action(action)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: CfnRoute.GrpcRouteMatchProperty) {
        cdkBuilder.match(match)
    }

    /** @param retryPolicy An object that represents a retry policy. */
    public fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /** @param retryPolicy An object that represents a retry policy. */
    public fun retryPolicy(retryPolicy: CfnRoute.GrpcRetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /** @param timeout An object that represents types of timeouts. */
    public fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout)
    }

    /** @param timeout An object that represents types of timeouts. */
    public fun timeout(timeout: CfnRoute.GrpcTimeoutProperty) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnRoute.GrpcRouteProperty = cdkBuilder.build()
}
