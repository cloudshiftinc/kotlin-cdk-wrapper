@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties used to define HTTP Based healthchecks.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * Vpc vpc = new Vpc(this, "vpc");
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
 * .vpc(vpc)
 * .name("domain.local")
 * .build();
 * Service service = namespace.createService("Svc");
 * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8081)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5)) // minimum
 * .path("/health-check-path")
 * .timeout(Duration.seconds(2)) // minimum
 * .unhealthyThreshold(2)
 * .build()))
 * .build())))
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build());
 * ```
 */
public interface HttpHealthCheckOptions {
  /**
   * The number of consecutive successful health checks that must occur before declaring listener
   * healthy.
   *
   * Default: 2
   */
  public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

  /**
   * The time period between each health check execution.
   *
   * Default: Duration.seconds(5)
   */
  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  /**
   * The destination path for the health check request.
   *
   * Default: /
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * The amount of time to wait when receiving a response from the health check.
   *
   * Default: Duration.seconds(2)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * The number of consecutive failed health checks that must occur before declaring a listener
   * unhealthy.
   *
   * Default: - 2
   */
  public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

  /**
   * A builder for [HttpHealthCheckOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param healthyThreshold The number of consecutive successful health checks that must occur
     * before declaring listener healthy.
     */
    public fun healthyThreshold(healthyThreshold: Number)

    /**
     * @param interval The time period between each health check execution.
     */
    public fun interval(interval: Duration)

    /**
     * @param path The destination path for the health check request.
     */
    public fun path(path: String)

    /**
     * @param timeout The amount of time to wait when receiving a response from the health check.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param unhealthyThreshold The number of consecutive failed health checks that must occur
     * before declaring a listener unhealthy.
     */
    public fun unhealthyThreshold(unhealthyThreshold: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions.builder()

    /**
     * @param healthyThreshold The number of consecutive successful health checks that must occur
     * before declaring listener healthy.
     */
    override fun healthyThreshold(healthyThreshold: Number) {
      cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /**
     * @param interval The time period between each health check execution.
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration.Companion::unwrap))
    }

    /**
     * @param path The destination path for the health check request.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param timeout The amount of time to wait when receiving a response from the health check.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param unhealthyThreshold The number of consecutive failed health checks that must occur
     * before declaring a listener unhealthy.
     */
    override fun unhealthyThreshold(unhealthyThreshold: Number) {
      cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions,
  ) : CdkObject(cdkObject), HttpHealthCheckOptions {
    /**
     * The number of consecutive successful health checks that must occur before declaring listener
     * healthy.
     *
     * Default: 2
     */
    override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    /**
     * The time period between each health check execution.
     *
     * Default: Duration.seconds(5)
     */
    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    /**
     * The destination path for the health check request.
     *
     * Default: /
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The amount of time to wait when receiving a response from the health check.
     *
     * Default: Duration.seconds(2)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The number of consecutive failed health checks that must occur before declaring a listener
     * unhealthy.
     *
     * Default: - 2
     */
    override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpHealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions):
        HttpHealthCheckOptions = CdkObjectWrappers.wrap(cdkObject) as? HttpHealthCheckOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpHealthCheckOptions):
        software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions
  }
}
