@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMonitoringSubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnMonitoringSubscriptionProps cfnMonitoringSubscriptionProps =
 * CfnMonitoringSubscriptionProps.builder()
 * .distributionId("distributionId")
 * .monitoringSubscription(MonitoringSubscriptionProperty.builder()
 * .realtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfigProperty.builder()
 * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html)
 */
public interface CfnMonitoringSubscriptionProps {
  /**
   * The ID of the distribution that you are enabling metrics for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-distributionid)
   */
  public fun distributionId(): String

  /**
   * A subscription configuration for additional CloudWatch metrics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
   */
  public fun monitoringSubscription(): Any

  /**
   * A builder for [CfnMonitoringSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param distributionId The ID of the distribution that you are enabling metrics for. 
     */
    public fun distributionId(distributionId: String)

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    public fun monitoringSubscription(monitoringSubscription: IResolvable)

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    public
        fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty)

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48bc0b317ad573210e1cdc19178d49bd6ec64141b19569d559cb15ce654a7051")
    public
        fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps.builder()

    /**
     * @param distributionId The ID of the distribution that you are enabling metrics for. 
     */
    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    override fun monitoringSubscription(monitoringSubscription: IResolvable) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(IResolvable::unwrap))
    }

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    override
        fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(CfnMonitoringSubscription.MonitoringSubscriptionProperty::unwrap))
    }

    /**
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48bc0b317ad573210e1cdc19178d49bd6ec64141b19569d559cb15ce654a7051")
    override
        fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder.() -> Unit):
        Unit =
        monitoringSubscription(CfnMonitoringSubscription.MonitoringSubscriptionProperty(monitoringSubscription))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps,
  ) : CdkObject(cdkObject), CfnMonitoringSubscriptionProps {
    /**
     * The ID of the distribution that you are enabling metrics for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-distributionid)
     */
    override fun distributionId(): String = unwrap(this).getDistributionId()

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
     */
    override fun monitoringSubscription(): Any = unwrap(this).getMonitoringSubscription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMonitoringSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps):
        CfnMonitoringSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnMonitoringSubscriptionProps

    internal fun unwrap(wrapped: CfnMonitoringSubscriptionProps):
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps
  }
}
