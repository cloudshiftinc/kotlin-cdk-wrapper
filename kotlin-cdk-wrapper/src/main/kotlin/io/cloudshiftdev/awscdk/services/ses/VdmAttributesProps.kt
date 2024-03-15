@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface VdmAttributesProps {
  public fun engagementMetrics(): Boolean? = unwrap(this).getEngagementMetrics()

  public fun optimizedSharedDelivery(): Boolean? = unwrap(this).getOptimizedSharedDelivery()

  @CdkDslMarker
  public interface Builder {
    public fun engagementMetrics(engagementMetrics: Boolean)

    public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.VdmAttributesProps.Builder =
        software.amazon.awscdk.services.ses.VdmAttributesProps.builder()

    override fun engagementMetrics(engagementMetrics: Boolean) {
      cdkBuilder.engagementMetrics(engagementMetrics)
    }

    override fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
      cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): software.amazon.awscdk.services.ses.VdmAttributesProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.VdmAttributesProps,
  ) : CdkObject(cdkObject), VdmAttributesProps {
    override fun engagementMetrics(): Boolean? = unwrap(this).getEngagementMetrics()

    override fun optimizedSharedDelivery(): Boolean? = unwrap(this).getOptimizedSharedDelivery()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VdmAttributesProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.VdmAttributesProps):
        VdmAttributesProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VdmAttributesProps):
        software.amazon.awscdk.services.ses.VdmAttributesProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.VdmAttributesProps
  }
}
