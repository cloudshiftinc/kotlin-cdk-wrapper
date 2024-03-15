@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnNetworkPerformanceMetricSubscriptionProps {
  public fun destination(): String

  public fun metric(): String

  public fun source(): String

  public fun statistic(): String

  @CdkDslMarker
  public interface Builder {
    public fun destination(destination: String)

    public fun metric(metric: String)

    public fun source(source: String)

    public fun statistic(statistic: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps.builder()

    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    override fun metric(metric: String) {
      cdkBuilder.metric(metric)
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps,
  ) : CdkObject(cdkObject), CfnNetworkPerformanceMetricSubscriptionProps {
    override fun destination(): String = unwrap(this).getDestination()

    override fun metric(): String = unwrap(this).getMetric()

    override fun source(): String = unwrap(this).getSource()

    override fun statistic(): String = unwrap(this).getStatistic()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnNetworkPerformanceMetricSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps):
        CfnNetworkPerformanceMetricSubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkPerformanceMetricSubscriptionProps):
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps
  }
}
