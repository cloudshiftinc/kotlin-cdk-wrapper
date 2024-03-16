@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Describe the health check to a load balancer.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * AutoScalingGroup myAutoScalingGroup;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .healthCheck(HealthCheck.builder()
 * .port(80)
 * .build())
 * .build();
 * lb.addTarget(myAutoScalingGroup);
 * lb.addListener(LoadBalancerListener.builder()
 * .externalPort(80)
 * .build());
 * ```
 */
public interface HealthCheck {
  /**
   * After how many successful checks is an instance considered healthy.
   *
   * Default: 2
   */
  public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

  /**
   * Number of seconds between health checks.
   *
   * Default: Duration.seconds(30)
   */
  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  /**
   * What path to use for HTTP or HTTPS health check (must return 200).
   *
   * For SSL and TCP health checks, accepting connections is enough to be considered
   * healthy.
   *
   * Default: "/"
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * What port number to health check on.
   */
  public fun port(): Number

  /**
   * What protocol to use for health checking.
   *
   * The protocol is automatically determined from the port if it's not supplied.
   *
   * Default: Automatic
   */
  public fun protocol(): LoadBalancingProtocol? =
      unwrap(this).getProtocol()?.let(LoadBalancingProtocol::wrap)

  /**
   * Health check timeout.
   *
   * Default: Duration.seconds(5)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * After how many unsuccessful checks is an instance considered unhealthy.
   *
   * Default: 5
   */
  public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

  /**
   * A builder for [HealthCheck]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param healthyThreshold After how many successful checks is an instance considered healthy.
     */
    public fun healthyThreshold(healthyThreshold: Number)

    /**
     * @param interval Number of seconds between health checks.
     */
    public fun interval(interval: Duration)

    /**
     * @param path What path to use for HTTP or HTTPS health check (must return 200).
     * For SSL and TCP health checks, accepting connections is enough to be considered
     * healthy.
     */
    public fun path(path: String)

    /**
     * @param port What port number to health check on. 
     */
    public fun port(port: Number)

    /**
     * @param protocol What protocol to use for health checking.
     * The protocol is automatically determined from the port if it's not supplied.
     */
    public fun protocol(protocol: LoadBalancingProtocol)

    /**
     * @param timeout Health check timeout.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param unhealthyThreshold After how many unsuccessful checks is an instance considered
     * unhealthy.
     */
    public fun unhealthyThreshold(unhealthyThreshold: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder
        = software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.builder()

    /**
     * @param healthyThreshold After how many successful checks is an instance considered healthy.
     */
    override fun healthyThreshold(healthyThreshold: Number) {
      cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /**
     * @param interval Number of seconds between health checks.
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    /**
     * @param path What path to use for HTTP or HTTPS health check (must return 200).
     * For SSL and TCP health checks, accepting connections is enough to be considered
     * healthy.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param port What port number to health check on. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol What protocol to use for health checking.
     * The protocol is automatically determined from the port if it's not supplied.
     */
    override fun protocol(protocol: LoadBalancingProtocol) {
      cdkBuilder.protocol(protocol.let(LoadBalancingProtocol::unwrap))
    }

    /**
     * @param timeout Health check timeout.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param unhealthyThreshold After how many unsuccessful checks is an instance considered
     * unhealthy.
     */
    override fun unhealthyThreshold(unhealthyThreshold: Number) {
      cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.HealthCheck =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck,
  ) : CdkObject(cdkObject), HealthCheck {
    /**
     * After how many successful checks is an instance considered healthy.
     *
     * Default: 2
     */
    override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    /**
     * Number of seconds between health checks.
     *
     * Default: Duration.seconds(30)
     */
    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    /**
     * What path to use for HTTP or HTTPS health check (must return 200).
     *
     * For SSL and TCP health checks, accepting connections is enough to be considered
     * healthy.
     *
     * Default: "/"
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * What port number to health check on.
     */
    override fun port(): Number = unwrap(this).getPort()

    /**
     * What protocol to use for health checking.
     *
     * The protocol is automatically determined from the port if it's not supplied.
     *
     * Default: Automatic
     */
    override fun protocol(): LoadBalancingProtocol? =
        unwrap(this).getProtocol()?.let(LoadBalancingProtocol::wrap)

    /**
     * Health check timeout.
     *
     * Default: Duration.seconds(5)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * After how many unsuccessful checks is an instance considered unhealthy.
     *
     * Default: 5
     */
    override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheck {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck):
        HealthCheck = CdkObjectWrappers.wrap(cdkObject) as HealthCheck

    internal fun unwrap(wrapped: HealthCheck):
        software.amazon.awscdk.services.elasticloadbalancing.HealthCheck = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
  }
}
