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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

/**
 * Describes the health check configuration of a target group.
 *
 * Health check configurations aren't used for target groups of type `LAMBDA` or `ALB` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
 * .enabled(false)
 * .healthCheckIntervalSeconds(123)
 * .healthCheckTimeoutSeconds(123)
 * .healthyThresholdCount(123)
 * .matcher(MatcherProperty.builder()
 * .httpCode("httpCode")
 * .build())
 * .path("path")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .unhealthyThresholdCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html)
 */
@CdkDslMarker
public class CfnTargetGroupHealthCheckConfigPropertyDsl {
    private val cdkBuilder: CfnTargetGroup.HealthCheckConfigProperty.Builder =
        CfnTargetGroup.HealthCheckConfigProperty.builder()

    /** @param enabled Indicates whether health checking is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Indicates whether health checking is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between health
     *   checks of an individual target. The range is 5–300 seconds. The default is 30 seconds.
     */
    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
        cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    /**
     * @param healthCheckTimeoutSeconds The amount of time, in seconds, to wait before reporting a
     *   target as unhealthy. The range is 1–120 seconds. The default is 5 seconds.
     */
    public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
        cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
    }

    /**
     * @param healthyThresholdCount The number of consecutive successful health checks required
     *   before considering an unhealthy target healthy. The range is 2–10. The default is 5.
     */
    public fun healthyThresholdCount(healthyThresholdCount: Number) {
        cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    /** @param matcher The codes to use when checking for a successful response from a target. */
    public fun matcher(matcher: IResolvable) {
        cdkBuilder.matcher(matcher)
    }

    /** @param matcher The codes to use when checking for a successful response from a target. */
    public fun matcher(matcher: CfnTargetGroup.MatcherProperty) {
        cdkBuilder.matcher(matcher)
    }

    /**
     * @param path The destination for health checks on the targets. If the protocol version is
     *   `HTTP/1.1` or `HTTP/2` , specify a valid URI (for example, `/path?query` ). The default
     *   path is `/` . Health checks are not supported if the protocol version is `gRPC` , however,
     *   you can choose `HTTP/1.1` or `HTTP/2` and specify a valid URI.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param port The port used when performing health checks on targets. The default setting is
     *   the port that a target receives traffic on.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol used when performing health checks on targets. The possible
     *   protocols are `HTTP` and `HTTPS` . The default is `HTTP` .
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param protocolVersion The protocol version used when performing health checks on targets.
     *   The possible protocol versions are `HTTP1` and `HTTP2` .
     */
    public fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
    }

    /**
     * @param unhealthyThresholdCount The number of consecutive failed health checks required before
     *   considering a target unhealthy. The range is 2–10. The default is 2.
     */
    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
        cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    public fun build(): CfnTargetGroup.HealthCheckConfigProperty = cdkBuilder.build()
}
