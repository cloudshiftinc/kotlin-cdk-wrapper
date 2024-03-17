@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Settings for an optional Amazon Route 53 health check.
 *
 * If you specify settings for a health check, AWS Cloud Map
 * associates the health check with all the records that you specify in DnsConfig. Only valid with a
 * PublicDnsNamespace.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
 * .name("MyHTTPNamespace")
 * .build();
 * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
 * .description("service registering non-ip instances")
 * .build());
 * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
 * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
 * .build());
 * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
 * .description("service registering ip instances")
 * .healthCheck(HealthCheckConfig.builder()
 * .type(HealthCheckType.HTTP)
 * .resourcePath("/check")
 * .build())
 * .build());
 * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
 * .ipv4("54.239.25.192")
 * .build());
 * app.synth();
 * ```
 */
public interface HealthCheckConfig {
  /**
   * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to
   * change the current status of the endpoint from unhealthy to healthy or vice versa.
   *
   * Default: 1
   */
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  /**
   * The path that you want Route 53 to request when performing health checks.
   *
   * Do not use when health check type is TCP.
   *
   * Default: '/'
   */
  public fun resourcePath(): String? = unwrap(this).getResourcePath()

  /**
   * The type of health check that you want to create, which indicates how Route 53 determines
   * whether an endpoint is healthy.
   *
   * Cannot be modified once created. Supported values are HTTP, HTTPS, and TCP.
   *
   * Default: HTTP
   */
  public fun type(): HealthCheckType? = unwrap(this).getType()?.let(HealthCheckType::wrap)

  /**
   * A builder for [HealthCheckConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or vice
     * versa.
     */
    public fun failureThreshold(failureThreshold: Number)

    /**
     * @param resourcePath The path that you want Route 53 to request when performing health checks.
     * Do not use when health check type is TCP.
     */
    public fun resourcePath(resourcePath: String)

    /**
     * @param type The type of health check that you want to create, which indicates how Route 53
     * determines whether an endpoint is healthy.
     * Cannot be modified once created. Supported values are HTTP, HTTPS, and TCP.
     */
    public fun type(type: HealthCheckType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig.Builder =
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig.builder()

    /**
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or vice
     * versa.
     */
    override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    /**
     * @param resourcePath The path that you want Route 53 to request when performing health checks.
     * Do not use when health check type is TCP.
     */
    override fun resourcePath(resourcePath: String) {
      cdkBuilder.resourcePath(resourcePath)
    }

    /**
     * @param type The type of health check that you want to create, which indicates how Route 53
     * determines whether an endpoint is healthy.
     * Cannot be modified once created. Supported values are HTTP, HTTPS, and TCP.
     */
    override fun type(type: HealthCheckType) {
      cdkBuilder.type(type.let(HealthCheckType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HealthCheckConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckConfig,
  ) : CdkObject(cdkObject), HealthCheckConfig {
    /**
     * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to
     * change the current status of the endpoint from unhealthy to healthy or vice versa.
     *
     * Default: 1
     */
    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    /**
     * The path that you want Route 53 to request when performing health checks.
     *
     * Do not use when health check type is TCP.
     *
     * Default: '/'
     */
    override fun resourcePath(): String? = unwrap(this).getResourcePath()

    /**
     * The type of health check that you want to create, which indicates how Route 53 determines
     * whether an endpoint is healthy.
     *
     * Cannot be modified once created. Supported values are HTTP, HTTPS, and TCP.
     *
     * Default: HTTP
     */
    override fun type(): HealthCheckType? = unwrap(this).getType()?.let(HealthCheckType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckConfig):
        HealthCheckConfig = CdkObjectWrappers.wrap(cdkObject) as? HealthCheckConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckConfig):
        software.amazon.awscdk.services.servicediscovery.HealthCheckConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
  }
}
