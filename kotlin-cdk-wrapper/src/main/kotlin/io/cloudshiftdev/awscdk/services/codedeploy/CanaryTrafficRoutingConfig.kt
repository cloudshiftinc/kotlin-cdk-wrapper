@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Represents the configuration specific to canary traffic shifting.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * CanaryTrafficRoutingConfig canaryTrafficRoutingConfig = CanaryTrafficRoutingConfig.builder()
 * .canaryInterval(123)
 * .canaryPercentage(123)
 * .build();
 * ```
 */
public interface CanaryTrafficRoutingConfig {
  /**
   * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary`
   * deployment.
   */
  public fun canaryInterval(): Number

  /**
   * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
   */
  public fun canaryPercentage(): Number

  /**
   * A builder for [CanaryTrafficRoutingConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param canaryInterval The number of minutes between the first and second traffic shifts of a
     * `TimeBasedCanary` deployment. 
     */
    public fun canaryInterval(canaryInterval: Number)

    /**
     * @param canaryPercentage The percentage of traffic to shift in the first increment of a
     * `TimeBasedCanary` deployment. 
     */
    public fun canaryPercentage(canaryPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig.builder()

    /**
     * @param canaryInterval The number of minutes between the first and second traffic shifts of a
     * `TimeBasedCanary` deployment. 
     */
    override fun canaryInterval(canaryInterval: Number) {
      cdkBuilder.canaryInterval(canaryInterval)
    }

    /**
     * @param canaryPercentage The percentage of traffic to shift in the first increment of a
     * `TimeBasedCanary` deployment. 
     */
    override fun canaryPercentage(canaryPercentage: Number) {
      cdkBuilder.canaryPercentage(canaryPercentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig,
  ) : CdkObject(cdkObject), CanaryTrafficRoutingConfig {
    /**
     * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary`
     * deployment.
     */
    override fun canaryInterval(): Number = unwrap(this).getCanaryInterval()

    /**
     * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
     */
    override fun canaryPercentage(): Number = unwrap(this).getCanaryPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CanaryTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig):
        CanaryTrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CanaryTrafficRoutingConfig):
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig
  }
}
