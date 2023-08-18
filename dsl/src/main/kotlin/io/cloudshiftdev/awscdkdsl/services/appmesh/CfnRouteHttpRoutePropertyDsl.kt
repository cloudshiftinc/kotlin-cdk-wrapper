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
 * An object that represents an HTTP or HTTP/2 route type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpRouteProperty httpRouteProperty = HttpRouteProperty.builder()
 * .action(HttpRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build())
 * .match(HttpRouteMatchProperty.builder()
 * .headers(List.of(HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
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
 * .method("method")
 * .path(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .port(123)
 * .prefix("prefix")
 * .queryParameters(List.of(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build()))
 * .scheme("scheme")
 * .build())
 * // the properties below are optional
 * .retryPolicy(HttpRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build())
 * .timeout(HttpTimeoutProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html)
 */
@CdkDslMarker
public class CfnRouteHttpRoutePropertyDsl {
    private val cdkBuilder: CfnRoute.HttpRouteProperty.Builder =
        CfnRoute.HttpRouteProperty.builder()

    /** @param action An object that represents the action to take if a match is determined. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action An object that represents the action to take if a match is determined. */
    public fun action(action: CfnRoute.HttpRouteActionProperty) {
        cdkBuilder.action(action)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match An object that represents the criteria for determining a request match. */
    public fun match(match: CfnRoute.HttpRouteMatchProperty) {
        cdkBuilder.match(match)
    }

    /** @param retryPolicy An object that represents a retry policy. */
    public fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /** @param retryPolicy An object that represents a retry policy. */
    public fun retryPolicy(retryPolicy: CfnRoute.HttpRetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /** @param timeout An object that represents types of timeouts. */
    public fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout)
    }

    /** @param timeout An object that represents types of timeouts. */
    public fun timeout(timeout: CfnRoute.HttpTimeoutProperty) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnRoute.HttpRouteProperty = cdkBuilder.build()
}
