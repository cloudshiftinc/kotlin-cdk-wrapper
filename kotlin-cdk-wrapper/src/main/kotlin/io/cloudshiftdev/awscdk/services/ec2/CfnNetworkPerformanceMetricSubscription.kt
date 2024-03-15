@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkPerformanceMetricSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription,
) : CfnResource(cdkObject), IInspectable {
  public open fun destination(): String = unwrap(this).getDestination()

  public open fun destination(`value`: String) {
    unwrap(this).setDestination(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metric(): String = unwrap(this).getMetric()

  public open fun metric(`value`: String) {
    unwrap(this).setMetric(`value`)
  }

  public open fun source(): String = unwrap(this).getSource()

  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  public open fun statistic(): String = unwrap(this).getStatistic()

  public open fun statistic(`value`: String) {
    unwrap(this).setStatistic(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun destination(destination: String)

    public fun metric(metric: String)

    public fun source(source: String)

    public fun statistic(statistic: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkPerformanceMetricSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkPerformanceMetricSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription):
        CfnNetworkPerformanceMetricSubscription = CfnNetworkPerformanceMetricSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkPerformanceMetricSubscription):
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription =
        wrapped.cdkObject
  }
}
