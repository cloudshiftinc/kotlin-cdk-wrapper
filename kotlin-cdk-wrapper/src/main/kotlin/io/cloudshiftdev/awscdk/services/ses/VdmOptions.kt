@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties for the Virtual Deliverability Manager (VDM) options that apply to the configuration
 * set.
 *
 * Example:
 *
 * ```
 * ConfigurationSet.Builder.create(this, "ConfigurationSetWithVdmOptions")
 * .vdmOptions(VdmOptions.builder()
 * .engagementMetrics(true)
 * .optimizedSharedDelivery(true)
 * .build())
 * .build();
 * ```
 */
public interface VdmOptions {
  /**
   * If true, engagement metrics are enabled for the configuration set.
   *
   * Default: - Engagement metrics not configured at the configuration set level. In this case, use
   * account level settings.
   */
  public fun engagementMetrics(): Boolean? = unwrap(this).getEngagementMetrics()

  /**
   * If true, optimized shared delivery is enabled for the configuration set.
   *
   * Default: - Optimized shared delivery not configured at the configuration set level. In this
   * case, use account level settings.
   */
  public fun optimizedSharedDelivery(): Boolean? = unwrap(this).getOptimizedSharedDelivery()

  /**
   * A builder for [VdmOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param engagementMetrics If true, engagement metrics are enabled for the configuration set.
     */
    public fun engagementMetrics(engagementMetrics: Boolean)

    /**
     * @param optimizedSharedDelivery If true, optimized shared delivery is enabled for the
     * configuration set.
     */
    public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.VdmOptions.Builder =
        software.amazon.awscdk.services.ses.VdmOptions.builder()

    /**
     * @param engagementMetrics If true, engagement metrics are enabled for the configuration set.
     */
    override fun engagementMetrics(engagementMetrics: Boolean) {
      cdkBuilder.engagementMetrics(engagementMetrics)
    }

    /**
     * @param optimizedSharedDelivery If true, optimized shared delivery is enabled for the
     * configuration set.
     */
    override fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
      cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): software.amazon.awscdk.services.ses.VdmOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.VdmOptions,
  ) : CdkObject(cdkObject),
      VdmOptions {
    /**
     * If true, engagement metrics are enabled for the configuration set.
     *
     * Default: - Engagement metrics not configured at the configuration set level. In this case,
     * use account level settings.
     */
    override fun engagementMetrics(): Boolean? = unwrap(this).getEngagementMetrics()

    /**
     * If true, optimized shared delivery is enabled for the configuration set.
     *
     * Default: - Optimized shared delivery not configured at the configuration set level. In this
     * case, use account level settings.
     */
    override fun optimizedSharedDelivery(): Boolean? = unwrap(this).getOptimizedSharedDelivery()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VdmOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.VdmOptions): VdmOptions =
        CdkObjectWrappers.wrap(cdkObject) as? VdmOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VdmOptions): software.amazon.awscdk.services.ses.VdmOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.VdmOptions
  }
}
