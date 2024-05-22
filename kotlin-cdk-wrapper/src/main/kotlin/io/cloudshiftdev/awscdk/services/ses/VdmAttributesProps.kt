@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties for the Virtual Deliverability Manager (VDM) attributes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * VdmAttributesProps vdmAttributesProps = VdmAttributesProps.builder()
 * .engagementMetrics(false)
 * .optimizedSharedDelivery(false)
 * .build();
 * ```
 */
public interface VdmAttributesProps {
  /**
   * Whether engagement metrics are enabled for your account.
   *
   * Default: true
   */
  public fun engagementMetrics(): Boolean? = unwrap(this).getEngagementMetrics()

  /**
   * Whether optimized shared delivery is enabled for your account.
   *
   * Default: true
   */
  public fun optimizedSharedDelivery(): Boolean? = unwrap(this).getOptimizedSharedDelivery()

  /**
   * A builder for [VdmAttributesProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param engagementMetrics Whether engagement metrics are enabled for your account.
     */
    public fun engagementMetrics(engagementMetrics: Boolean)

    /**
     * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account.
     */
    public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.VdmAttributesProps.Builder =
        software.amazon.awscdk.services.ses.VdmAttributesProps.builder()

    /**
     * @param engagementMetrics Whether engagement metrics are enabled for your account.
     */
    override fun engagementMetrics(engagementMetrics: Boolean) {
      cdkBuilder.engagementMetrics(engagementMetrics)
    }

    /**
     * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account.
     */
    override fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
      cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): software.amazon.awscdk.services.ses.VdmAttributesProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.VdmAttributesProps,
  ) : CdkObject(cdkObject), VdmAttributesProps {
    /**
     * Whether engagement metrics are enabled for your account.
     *
     * Default: true
     */
    override fun engagementMetrics(): Boolean? = unwrap(this).getEngagementMetrics()

    /**
     * Whether optimized shared delivery is enabled for your account.
     *
     * Default: true
     */
    override fun optimizedSharedDelivery(): Boolean? = unwrap(this).getOptimizedSharedDelivery()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VdmAttributesProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.VdmAttributesProps):
        VdmAttributesProps = CdkObjectWrappers.wrap(cdkObject) as? VdmAttributesProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VdmAttributesProps):
        software.amazon.awscdk.services.ses.VdmAttributesProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.VdmAttributesProps
  }
}
