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
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool
import software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.HttpTimeout
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.OutlierDetection

/**
 * Represent the HTTP2 Node Listener property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.appmesh.*;
 * HealthCheck healthCheck;
 * MutualTlsValidationTrust mutualTlsValidationTrust;
 * SubjectAlternativeNames subjectAlternativeNames;
 * TlsCertificate tlsCertificate;
 * Http2VirtualNodeListenerOptions http2VirtualNodeListenerOptions =
 * Http2VirtualNodeListenerOptions.builder()
 * .connectionPool(Http2ConnectionPool.builder()
 * .maxRequests(123)
 * .build())
 * .healthCheck(healthCheck)
 * .outlierDetection(OutlierDetection.builder()
 * .baseEjectionDuration(Duration.minutes(30))
 * .interval(Duration.minutes(30))
 * .maxEjectionPercent(123)
 * .maxServerErrors(123)
 * .build())
 * .port(123)
 * .timeout(HttpTimeout.builder()
 * .idle(Duration.minutes(30))
 * .perRequest(Duration.minutes(30))
 * .build())
 * .tls(ListenerTlsOptions.builder()
 * .certificate(tlsCertificate)
 * .mode(TlsMode.STRICT)
 * // the properties below are optional
 * .mutualTlsValidation(MutualTlsValidation.builder()
 * .trust(mutualTlsValidationTrust)
 * // the properties below are optional
 * .subjectAlternativeNames(subjectAlternativeNames)
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class Http2VirtualNodeListenerOptionsDsl {
    private val cdkBuilder: Http2VirtualNodeListenerOptions.Builder =
        Http2VirtualNodeListenerOptions.builder()

    /** @param connectionPool Connection pool for http2 listeners. */
    public fun connectionPool(connectionPool: Http2ConnectionPoolDsl.() -> Unit = {}) {
        val builder = Http2ConnectionPoolDsl()
        builder.apply(connectionPool)
        cdkBuilder.connectionPool(builder.build())
    }

    /** @param connectionPool Connection pool for http2 listeners. */
    public fun connectionPool(connectionPool: Http2ConnectionPool) {
        cdkBuilder.connectionPool(connectionPool)
    }

    /** @param healthCheck The health check information for the listener. */
    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /** @param outlierDetection Represents the configuration for enabling outlier detection. */
    public fun outlierDetection(outlierDetection: OutlierDetectionDsl.() -> Unit = {}) {
        val builder = OutlierDetectionDsl()
        builder.apply(outlierDetection)
        cdkBuilder.outlierDetection(builder.build())
    }

    /** @param outlierDetection Represents the configuration for enabling outlier detection. */
    public fun outlierDetection(outlierDetection: OutlierDetection) {
        cdkBuilder.outlierDetection(outlierDetection)
    }

    /** @param port Port to listen for connections on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param timeout Timeout for HTTP protocol. */
    public fun timeout(timeout: HttpTimeoutDsl.() -> Unit = {}) {
        val builder = HttpTimeoutDsl()
        builder.apply(timeout)
        cdkBuilder.timeout(builder.build())
    }

    /** @param timeout Timeout for HTTP protocol. */
    public fun timeout(timeout: HttpTimeout) {
        cdkBuilder.timeout(timeout)
    }

    /** @param tls Represents the configuration for enabling TLS on a listener. */
    public fun tls(tls: ListenerTlsOptionsDsl.() -> Unit = {}) {
        val builder = ListenerTlsOptionsDsl()
        builder.apply(tls)
        cdkBuilder.tls(builder.build())
    }

    /** @param tls Represents the configuration for enabling TLS on a listener. */
    public fun tls(tls: ListenerTlsOptions) {
        cdkBuilder.tls(tls)
    }

    public fun build(): Http2VirtualNodeListenerOptions = cdkBuilder.build()
}
