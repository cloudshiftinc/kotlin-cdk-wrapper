@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for configuring a health check.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService loadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .cpu(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .command(List.of("command"))
 * .entryPoint(List.of("entry", "point"))
 * .build())
 * .build();
 * loadBalancedFargateService.targetGroup.configureHealthCheck(HealthCheck.builder()
 * .path("/custom-health-path")
 * .build());
 * ```
 */
public interface HealthCheck {
  /**
   * Indicates whether health checks are enabled.
   *
   * If the target type is lambda,
   * health checks are disabled by default but can be enabled. If the target type
   * is instance or ip, health checks are always enabled and cannot be disabled.
   *
   * Default: - Determined automatically.
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * GRPC code to use when checking for a successful response from a target.
   *
   * You can specify values between 0 and 99. You can specify multiple values
   * (for example, "0,1") or a range of values (for example, "0-5").
   *
   * Default: - 12
   */
  public fun healthyGrpcCodes(): String? = unwrap(this).getHealthyGrpcCodes()

  /**
   * HTTP code to use when checking for a successful response from a target.
   *
   * For Application Load Balancers, you can specify values between 200 and
   * 499, and the default value is 200. You can specify multiple values (for
   * example, "200,202") or a range of values (for example, "200-299").
   */
  public fun healthyHttpCodes(): String? = unwrap(this).getHealthyHttpCodes()

  /**
   * The number of consecutive health checks successes required before considering an unhealthy
   * target healthy.
   *
   * For Application Load Balancers, the default is 5. For Network Load Balancers, the default is 3.
   *
   * Default: 5 for ALBs, 3 for NLBs
   */
  public fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

  /**
   * The approximate number of seconds between health checks for an individual target.
   *
   * Must be 5 to 300 seconds
   *
   * Default: 10 seconds if protocol is `GENEVE`, 35 seconds if target type is `lambda`, else 30
   * seconds
   */
  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  /**
   * The ping path destination where Elastic Load Balancing sends health check requests.
   *
   * Default: /
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * The port that the load balancer uses when performing health checks on the targets.
   *
   * Default: 'traffic-port'
   */
  public fun port(): String? = unwrap(this).getPort()

  /**
   * The protocol the load balancer uses when performing health checks on targets.
   *
   * The TCP protocol is supported for health checks only if the protocol of the target group is
   * TCP, TLS, UDP, or TCP_UDP.
   * The TLS, UDP, and TCP_UDP protocols are not supported for health checks.
   *
   * Default: HTTP for ALBs, TCP for NLBs
   */
  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  /**
   * The amount of time, in seconds, during which no response from a target means a failed health
   * check.
   *
   * Must be 2 to 120 seconds.
   *
   * Default: 6 seconds if the protocol is HTTP, 5 seconds if protocol is `GENEVE`, 30 seconds if
   * target type is `lambda`, 10 seconds for TCP, TLS, or HTTPS
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * The number of consecutive health check failures required before considering a target unhealthy.
   *
   * For Application Load Balancers, the default is 2. For Network Load
   * Balancers, this value must be the same as the healthy threshold count.
   *
   * Default: 2
   */
  public fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

  /**
   * A builder for [HealthCheck]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Indicates whether health checks are enabled.
     * If the target type is lambda,
     * health checks are disabled by default but can be enabled. If the target type
     * is instance or ip, health checks are always enabled and cannot be disabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param healthyGrpcCodes GRPC code to use when checking for a successful response from a
     * target.
     * You can specify values between 0 and 99. You can specify multiple values
     * (for example, "0,1") or a range of values (for example, "0-5").
     */
    public fun healthyGrpcCodes(healthyGrpcCodes: String)

    /**
     * @param healthyHttpCodes HTTP code to use when checking for a successful response from a
     * target.
     * For Application Load Balancers, you can specify values between 200 and
     * 499, and the default value is 200. You can specify multiple values (for
     * example, "200,202") or a range of values (for example, "200-299").
     */
    public fun healthyHttpCodes(healthyHttpCodes: String)

    /**
     * @param healthyThresholdCount The number of consecutive health checks successes required
     * before considering an unhealthy target healthy.
     * For Application Load Balancers, the default is 5. For Network Load Balancers, the default is
     * 3.
     */
    public fun healthyThresholdCount(healthyThresholdCount: Number)

    /**
     * @param interval The approximate number of seconds between health checks for an individual
     * target.
     * Must be 5 to 300 seconds
     */
    public fun interval(interval: Duration)

    /**
     * @param path The ping path destination where Elastic Load Balancing sends health check
     * requests.
     */
    public fun path(path: String)

    /**
     * @param port The port that the load balancer uses when performing health checks on the
     * targets.
     */
    public fun port(port: String)

    /**
     * @param protocol The protocol the load balancer uses when performing health checks on targets.
     * The TCP protocol is supported for health checks only if the protocol of the target group is
     * TCP, TLS, UDP, or TCP_UDP.
     * The TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     */
    public fun protocol(protocol: Protocol)

    /**
     * @param timeout The amount of time, in seconds, during which no response from a target means a
     * failed health check.
     * Must be 2 to 120 seconds.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param unhealthyThresholdCount The number of consecutive health check failures required
     * before considering a target unhealthy.
     * For Application Load Balancers, the default is 2. For Network Load
     * Balancers, this value must be the same as the healthy threshold count.
     */
    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck.builder()

    /**
     * @param enabled Indicates whether health checks are enabled.
     * If the target type is lambda,
     * health checks are disabled by default but can be enabled. If the target type
     * is instance or ip, health checks are always enabled and cannot be disabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param healthyGrpcCodes GRPC code to use when checking for a successful response from a
     * target.
     * You can specify values between 0 and 99. You can specify multiple values
     * (for example, "0,1") or a range of values (for example, "0-5").
     */
    override fun healthyGrpcCodes(healthyGrpcCodes: String) {
      cdkBuilder.healthyGrpcCodes(healthyGrpcCodes)
    }

    /**
     * @param healthyHttpCodes HTTP code to use when checking for a successful response from a
     * target.
     * For Application Load Balancers, you can specify values between 200 and
     * 499, and the default value is 200. You can specify multiple values (for
     * example, "200,202") or a range of values (for example, "200-299").
     */
    override fun healthyHttpCodes(healthyHttpCodes: String) {
      cdkBuilder.healthyHttpCodes(healthyHttpCodes)
    }

    /**
     * @param healthyThresholdCount The number of consecutive health checks successes required
     * before considering an unhealthy target healthy.
     * For Application Load Balancers, the default is 5. For Network Load Balancers, the default is
     * 3.
     */
    override fun healthyThresholdCount(healthyThresholdCount: Number) {
      cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    /**
     * @param interval The approximate number of seconds between health checks for an individual
     * target.
     * Must be 5 to 300 seconds
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration.Companion::unwrap))
    }

    /**
     * @param path The ping path destination where Elastic Load Balancing sends health check
     * requests.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param port The port that the load balancer uses when performing health checks on the
     * targets.
     */
    override fun port(port: String) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol the load balancer uses when performing health checks on targets.
     * The TCP protocol is supported for health checks only if the protocol of the target group is
     * TCP, TLS, UDP, or TCP_UDP.
     * The TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
    }

    /**
     * @param timeout The amount of time, in seconds, during which no response from a target means a
     * failed health check.
     * Must be 2 to 120 seconds.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param unhealthyThresholdCount The number of consecutive health check failures required
     * before considering a target unhealthy.
     * For Application Load Balancers, the default is 2. For Network Load
     * Balancers, this value must be the same as the healthy threshold count.
     */
    override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
      cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck,
  ) : CdkObject(cdkObject), HealthCheck {
    /**
     * Indicates whether health checks are enabled.
     *
     * If the target type is lambda,
     * health checks are disabled by default but can be enabled. If the target type
     * is instance or ip, health checks are always enabled and cannot be disabled.
     *
     * Default: - Determined automatically.
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * GRPC code to use when checking for a successful response from a target.
     *
     * You can specify values between 0 and 99. You can specify multiple values
     * (for example, "0,1") or a range of values (for example, "0-5").
     *
     * Default: - 12
     */
    override fun healthyGrpcCodes(): String? = unwrap(this).getHealthyGrpcCodes()

    /**
     * HTTP code to use when checking for a successful response from a target.
     *
     * For Application Load Balancers, you can specify values between 200 and
     * 499, and the default value is 200. You can specify multiple values (for
     * example, "200,202") or a range of values (for example, "200-299").
     */
    override fun healthyHttpCodes(): String? = unwrap(this).getHealthyHttpCodes()

    /**
     * The number of consecutive health checks successes required before considering an unhealthy
     * target healthy.
     *
     * For Application Load Balancers, the default is 5. For Network Load Balancers, the default is
     * 3.
     *
     * Default: 5 for ALBs, 3 for NLBs
     */
    override fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

    /**
     * The approximate number of seconds between health checks for an individual target.
     *
     * Must be 5 to 300 seconds
     *
     * Default: 10 seconds if protocol is `GENEVE`, 35 seconds if target type is `lambda`, else 30
     * seconds
     */
    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    /**
     * The ping path destination where Elastic Load Balancing sends health check requests.
     *
     * Default: /
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The port that the load balancer uses when performing health checks on the targets.
     *
     * Default: 'traffic-port'
     */
    override fun port(): String? = unwrap(this).getPort()

    /**
     * The protocol the load balancer uses when performing health checks on targets.
     *
     * The TCP protocol is supported for health checks only if the protocol of the target group is
     * TCP, TLS, UDP, or TCP_UDP.
     * The TLS, UDP, and TCP_UDP protocols are not supported for health checks.
     *
     * Default: HTTP for ALBs, TCP for NLBs
     */
    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    /**
     * The amount of time, in seconds, during which no response from a target means a failed health
     * check.
     *
     * Must be 2 to 120 seconds.
     *
     * Default: 6 seconds if the protocol is HTTP, 5 seconds if protocol is `GENEVE`, 30 seconds if
     * target type is `lambda`, 10 seconds for TCP, TLS, or HTTPS
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The number of consecutive health check failures required before considering a target
     * unhealthy.
     *
     * For Application Load Balancers, the default is 2. For Network Load
     * Balancers, this value must be the same as the healthy threshold count.
     *
     * Default: 2
     */
    override fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheck {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck):
        HealthCheck = CdkObjectWrappers.wrap(cdkObject) as? HealthCheck ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheck):
        software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
  }
}
