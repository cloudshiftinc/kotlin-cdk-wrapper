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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents a retry policy.
 *
 * Specify at least one value for at least one of the types of `RetryEvents` , a value for
 * `maxRetries` , and a value for `perRetryTimeout` . Both `server-error` and `gateway-error` under
 * `httpRetryEvents` include the Envoy `reset` policy. For more information on the `reset` policy,
 * see the
 * [Envoy documentation](https://docs.aws.amazon.com/https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/router_filter#x-envoy-retry-on)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcRetryPolicyProperty grpcRetryPolicyProperty = GrpcRetryPolicyProperty.builder()
 * .maxRetries(123)
 * .perRetryTimeout(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * // the properties below are optional
 * .grpcRetryEvents(List.of("grpcRetryEvents"))
 * .httpRetryEvents(List.of("httpRetryEvents"))
 * .tcpRetryEvents(List.of("tcpRetryEvents"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html)
 */
@CdkDslMarker
public class CfnRouteGrpcRetryPolicyPropertyDsl {
    private val cdkBuilder: CfnRoute.GrpcRetryPolicyProperty.Builder =
        CfnRoute.GrpcRetryPolicyProperty.builder()

    private val _grpcRetryEvents: MutableList<String> = mutableListOf()

    private val _httpRetryEvents: MutableList<String> = mutableListOf()

    private val _tcpRetryEvents: MutableList<String> = mutableListOf()

    /** @param grpcRetryEvents Specify at least one of the valid values. */
    public fun grpcRetryEvents(vararg grpcRetryEvents: String) {
        _grpcRetryEvents.addAll(listOf(*grpcRetryEvents))
    }

    /** @param grpcRetryEvents Specify at least one of the valid values. */
    public fun grpcRetryEvents(grpcRetryEvents: Collection<String>) {
        _grpcRetryEvents.addAll(grpcRetryEvents)
    }

    /**
     * @param httpRetryEvents Specify at least one of the following values.
     * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
     *   511
     * * *gateway-error* – HTTP status codes 502, 503, and 504
     * * *client-error* – HTTP status code 409
     * * *stream-error* – Retry on refused stream
     */
    public fun httpRetryEvents(vararg httpRetryEvents: String) {
        _httpRetryEvents.addAll(listOf(*httpRetryEvents))
    }

    /**
     * @param httpRetryEvents Specify at least one of the following values.
     * * *server-error* – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and
     *   511
     * * *gateway-error* – HTTP status codes 502, 503, and 504
     * * *client-error* – HTTP status code 409
     * * *stream-error* – Retry on refused stream
     */
    public fun httpRetryEvents(httpRetryEvents: Collection<String>) {
        _httpRetryEvents.addAll(httpRetryEvents)
    }

    /** @param maxRetries The maximum number of retry attempts. */
    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    /** @param perRetryTimeout The timeout for each retry attempt. */
    public fun perRetryTimeout(perRetryTimeout: IResolvable) {
        cdkBuilder.perRetryTimeout(perRetryTimeout)
    }

    /** @param perRetryTimeout The timeout for each retry attempt. */
    public fun perRetryTimeout(perRetryTimeout: CfnRoute.DurationProperty) {
        cdkBuilder.perRetryTimeout(perRetryTimeout)
    }

    /**
     * @param tcpRetryEvents Specify a valid value. The event occurs before any processing of a
     *   request has started and is encountered when the upstream is temporarily or permanently
     *   unavailable.
     */
    public fun tcpRetryEvents(vararg tcpRetryEvents: String) {
        _tcpRetryEvents.addAll(listOf(*tcpRetryEvents))
    }

    /**
     * @param tcpRetryEvents Specify a valid value. The event occurs before any processing of a
     *   request has started and is encountered when the upstream is temporarily or permanently
     *   unavailable.
     */
    public fun tcpRetryEvents(tcpRetryEvents: Collection<String>) {
        _tcpRetryEvents.addAll(tcpRetryEvents)
    }

    public fun build(): CfnRoute.GrpcRetryPolicyProperty {
        if (_grpcRetryEvents.isNotEmpty()) cdkBuilder.grpcRetryEvents(_grpcRetryEvents)
        if (_httpRetryEvents.isNotEmpty()) cdkBuilder.httpRetryEvents(_httpRetryEvents)
        if (_tcpRetryEvents.isNotEmpty()) cdkBuilder.tcpRetryEvents(_tcpRetryEvents)
        return cdkBuilder.build()
    }
}
