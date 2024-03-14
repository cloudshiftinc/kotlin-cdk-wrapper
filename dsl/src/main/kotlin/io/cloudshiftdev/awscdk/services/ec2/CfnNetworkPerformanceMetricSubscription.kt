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
  private val cdkObject:
      software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Region or Availability Zone that's the target for the subscription.
   */
  public open fun destination(): String = unwrap(this).getDestination()

  /**
   * The Region or Availability Zone that's the target for the subscription.
   */
  public open fun destination(`value`: String) {
    unwrap(this).setDestination(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The metric used for the subscription.
   */
  public open fun metric(): String = unwrap(this).getMetric()

  /**
   * The metric used for the subscription.
   */
  public open fun metric(`value`: String) {
    unwrap(this).setMetric(`value`)
  }

  /**
   * The Region or Availability Zone that's the source for the subscription.
   */
  public open fun source(): String = unwrap(this).getSource()

  /**
   * The Region or Availability Zone that's the source for the subscription.
   */
  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  /**
   * The statistic used for the subscription.
   */
  public open fun statistic(): String = unwrap(this).getStatistic()

  /**
   * The statistic used for the subscription.
   */
  public open fun statistic(`value`: String) {
    unwrap(this).setStatistic(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Region or Availability Zone that's the target for the subscription.
     *
     * For example, `eu-west-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-destination)
     * @param destination The Region or Availability Zone that's the target for the subscription. 
     */
    public fun destination(destination: String)

    /**
     * The metric used for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-metric)
     * @param metric The metric used for the subscription. 
     */
    public fun metric(metric: String)

    /**
     * The Region or Availability Zone that's the source for the subscription.
     *
     * For example, `us-east-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-source)
     * @param source The Region or Availability Zone that's the source for the subscription. 
     */
    public fun source(source: String)

    /**
     * The statistic used for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-statistic)
     * @param statistic The statistic used for the subscription. 
     */
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

    /**
     * The Region or Availability Zone that's the target for the subscription.
     *
     * For example, `eu-west-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-destination)
     * @param destination The Region or Availability Zone that's the target for the subscription. 
     */
    override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    /**
     * The metric used for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-metric)
     * @param metric The metric used for the subscription. 
     */
    override fun metric(metric: String) {
      cdkBuilder.metric(metric)
    }

    /**
     * The Region or Availability Zone that's the source for the subscription.
     *
     * For example, `us-east-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-source)
     * @param source The Region or Availability Zone that's the source for the subscription. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * The statistic used for the subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html#cfn-ec2-networkperformancemetricsubscription-statistic)
     * @param statistic The statistic used for the subscription. 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
