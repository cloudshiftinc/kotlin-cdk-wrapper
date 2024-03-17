@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Specifies information about an optional custom health check.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * HealthCheckCustomConfig healthCheckCustomConfig = HealthCheckCustomConfig.builder()
 * .failureThreshold(123)
 * .build();
 * ```
 */
public interface HealthCheckCustomConfig {
  /**
   * The number of 30-second intervals that you want Cloud Map to wait after receiving an
   * UpdateInstanceCustomHealthStatus request before it changes the health status of a service
   * instance.
   *
   * Default: 1
   */
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  /**
   * A builder for [HealthCheckCustomConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param failureThreshold The number of 30-second intervals that you want Cloud Map to wait
     * after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status
     * of a service instance.
     */
    public fun failureThreshold(failureThreshold: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig.Builder =
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig.builder()

    /**
     * @param failureThreshold The number of 30-second intervals that you want Cloud Map to wait
     * after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status
     * of a service instance.
     */
    override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig,
  ) : CdkObject(cdkObject), HealthCheckCustomConfig {
    /**
     * The number of 30-second intervals that you want Cloud Map to wait after receiving an
     * UpdateInstanceCustomHealthStatus request before it changes the health status of a service
     * instance.
     *
     * Default: 1
     */
    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckCustomConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig):
        HealthCheckCustomConfig = CdkObjectWrappers.wrap(cdkObject) as? HealthCheckCustomConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckCustomConfig):
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
  }
}
