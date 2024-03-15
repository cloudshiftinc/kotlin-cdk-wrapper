@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnNetworkPerformanceMetricSubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkPerformanceMetricSubscriptionProps cfnNetworkPerformanceMetricSubscriptionProps =
 * CfnNetworkPerformanceMetricSubscriptionProps.builder()
 * .destination("destination")
 * .metric("metric")
 * .source("source")
 * .statistic("statistic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html)
 */
public interface CfnNetworkPerformanceMetricSubscriptionProps {
  /**
   * The Region or Availability Zone that's the target for the subscription.
   *
   * For example, `eu-west-1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-destination)
   */
  public fun destination(): String

  /**
   * The metric used for the subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-metric)
   */
  public fun metric(): String

  /**
   * The Region or Availability Zone that's the source for the subscription.
   *
   * For example, `us-east-1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-source)
   */
  public fun source(): String

  /**
   * The statistic used for the subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-statistic)
   */
  public fun statistic(): String

  /**
   * A builder for [CfnNetworkPerformanceMetricSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination The Region or Availability Zone that's the target for the subscription. 
     * For example, `eu-west-1` .
     */
    public fun destination(destination: String)

    /**
     * @param metric The metric used for the subscription. 
     */
    public fun metric(metric: String)

    /**
     * @param source The Region or Availability Zone that's the source for the subscription. 
     * For example, `us-east-1` .
     */
    public fun source(source: String)

    /**
     * @param statistic The statistic used for the subscription. 
     */
    public fun statistic(statistic: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps.builder()

    /**
     * @param destination The Region or Availability Zone that's the target for the subscription. 
     * For example, `eu-west-1` .
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * @param metric The metric used for the subscription. 
     */
    override fun metric(metric: String) {
      cdkBuilder.metric(metric)
    }

    /**
     * @param source The Region or Availability Zone that's the source for the subscription. 
     * For example, `us-east-1` .
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param statistic The statistic used for the subscription. 
     */
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
    /**
     * The Region or Availability Zone that's the target for the subscription.
     *
     * For example, `eu-west-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-destination)
     */
    override fun destination(): String = unwrap(this).getDestination()

    /**
     * The metric used for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-metric)
     */
    override fun metric(): String = unwrap(this).getMetric()

    /**
     * The Region or Availability Zone that's the source for the subscription.
     *
     * For example, `us-east-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-source)
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The statistic used for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-statistic)
     */
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
