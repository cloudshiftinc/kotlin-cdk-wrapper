@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Options used for creating the Health Check object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * HealthCheckBindOptions healthCheckBindOptions = HealthCheckBindOptions.builder()
 * .defaultPort(123)
 * .build();
 * ```
 */
public interface HealthCheckBindOptions {
  /**
   * Port for Health Check interface.
   *
   * Default: - no default port is provided
   */
  public fun defaultPort(): Number? = unwrap(this).getDefaultPort()

  /**
   * A builder for [HealthCheckBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultPort Port for Health Check interface.
     */
    public fun defaultPort(defaultPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions.Builder =
        software.amazon.awscdk.services.appmesh.HealthCheckBindOptions.builder()

    /**
     * @param defaultPort Port for Health Check interface.
     */
    override fun defaultPort(defaultPort: Number) {
      cdkBuilder.defaultPort(defaultPort)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HealthCheckBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions,
  ) : CdkObject(cdkObject), HealthCheckBindOptions {
    /**
     * Port for Health Check interface.
     *
     * Default: - no default port is provided
     */
    override fun defaultPort(): Number? = unwrap(this).getDefaultPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckBindOptions):
        HealthCheckBindOptions = CdkObjectWrappers.wrap(cdkObject) as? HealthCheckBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckBindOptions):
        software.amazon.awscdk.services.appmesh.HealthCheckBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HealthCheckBindOptions
  }
}
