package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMonitoringSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the distribution that you are enabling metrics for.
   */
  public open fun distributionId(): String = unwrap(this).getDistributionId()

  /**
   * The ID of the distribution that you are enabling metrics for.
   */
  public open fun distributionId(`value`: String) {
    unwrap(this).setDistributionId(`value`)
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
   * A subscription configuration for additional CloudWatch metrics.
   */
  public open fun monitoringSubscription(): Any = unwrap(this).getMonitoringSubscription()

  /**
   * A subscription configuration for additional CloudWatch metrics.
   */
  public open fun monitoringSubscription(`value`: IResolvable) {
    unwrap(this).setMonitoringSubscription(`value`.let(IResolvable::unwrap))
  }

  /**
   * A subscription configuration for additional CloudWatch metrics.
   */
  public open fun monitoringSubscription(`value`: MonitoringSubscriptionProperty) {
    unwrap(this).setMonitoringSubscription(`value`.let(MonitoringSubscriptionProperty::unwrap))
  }

  /**
   * A subscription configuration for additional CloudWatch metrics.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e9ee5f258707c636ad8f49355bdebf53ca44f224940e22008822fd37c15af9a2")
  public open
      fun monitoringSubscription(`value`: MonitoringSubscriptionProperty.Builder.() -> Unit): Unit =
      monitoringSubscription(MonitoringSubscriptionProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnMonitoringSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the distribution that you are enabling metrics for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-distributionid)
     * @param distributionId The ID of the distribution that you are enabling metrics for. 
     */
    public fun distributionId(distributionId: String)

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    public fun monitoringSubscription(monitoringSubscription: IResolvable)

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    public fun monitoringSubscription(monitoringSubscription: MonitoringSubscriptionProperty)

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("960c31d5e6d26a8705b4f2a0f41859f3c7358310c77d732a335fdc0c2d49da4c")
    public
        fun monitoringSubscription(monitoringSubscription: MonitoringSubscriptionProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.Builder =
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.Builder.create(scope,
        id)

    /**
     * The ID of the distribution that you are enabling metrics for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-distributionid)
     * @param distributionId The ID of the distribution that you are enabling metrics for. 
     */
    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    override fun monitoringSubscription(monitoringSubscription: IResolvable) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(IResolvable::unwrap))
    }

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    override fun monitoringSubscription(monitoringSubscription: MonitoringSubscriptionProperty) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(MonitoringSubscriptionProperty::unwrap))
    }

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
     * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics.
     * 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("960c31d5e6d26a8705b4f2a0f41859f3c7358310c77d732a335fdc0c2d49da4c")
    override
        fun monitoringSubscription(monitoringSubscription: MonitoringSubscriptionProperty.Builder.() -> Unit):
        Unit = monitoringSubscription(MonitoringSubscriptionProperty(monitoringSubscription))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMonitoringSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMonitoringSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription):
        CfnMonitoringSubscription = CfnMonitoringSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnMonitoringSubscription):
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription = wrapped.cdkObject
  }

  public interface RealtimeMetricsSubscriptionConfigProperty {
    /**
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given
     * CloudFront distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-realtimemetricssubscriptionconfig.html#cfn-cloudfront-monitoringsubscription-realtimemetricssubscriptionconfig-realtimemetricssubscriptionstatus)
     */
    public fun realtimeMetricsSubscriptionStatus(): String

    /**
     * A builder for [RealtimeMetricsSubscriptionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param realtimeMetricsSubscriptionStatus A flag that indicates whether additional
       * CloudWatch metrics are enabled for a given CloudFront distribution. 
       */
      public fun realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.builder()

      /**
       * @param realtimeMetricsSubscriptionStatus A flag that indicates whether additional
       * CloudWatch metrics are enabled for a given CloudFront distribution. 
       */
      override fun realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus: String) {
        cdkBuilder.realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty,
    ) : CdkObject(cdkObject), RealtimeMetricsSubscriptionConfigProperty {
      /**
       * A flag that indicates whether additional CloudWatch metrics are enabled for a given
       * CloudFront distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-realtimemetricssubscriptionconfig.html#cfn-cloudfront-monitoringsubscription-realtimemetricssubscriptionconfig-realtimemetricssubscriptionstatus)
       */
      override fun realtimeMetricsSubscriptionStatus(): String =
          unwrap(this).getRealtimeMetricsSubscriptionStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RealtimeMetricsSubscriptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty):
          RealtimeMetricsSubscriptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RealtimeMetricsSubscriptionConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty
    }
  }

  public interface MonitoringSubscriptionProperty {
    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription-realtimemetricssubscriptionconfig)
     */
    public fun realtimeMetricsSubscriptionConfig(): Any? =
        unwrap(this).getRealtimeMetricsSubscriptionConfig()

    /**
     * A builder for [MonitoringSubscriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional
       * CloudWatch metrics.
       */
      public fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: IResolvable)

      /**
       * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional
       * CloudWatch metrics.
       */
      public
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: RealtimeMetricsSubscriptionConfigProperty)

      /**
       * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional
       * CloudWatch metrics.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646758f52c4c776f22979f6af944bbfdec50fc60d3445e1ae97199497f862312")
      public
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: RealtimeMetricsSubscriptionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty.builder()

      /**
       * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional
       * CloudWatch metrics.
       */
      override
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: IResolvable) {
        cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig.let(IResolvable::unwrap))
      }

      /**
       * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional
       * CloudWatch metrics.
       */
      override
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: RealtimeMetricsSubscriptionConfigProperty) {
        cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig.let(RealtimeMetricsSubscriptionConfigProperty::unwrap))
      }

      /**
       * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional
       * CloudWatch metrics.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646758f52c4c776f22979f6af944bbfdec50fc60d3445e1ae97199497f862312")
      override
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: RealtimeMetricsSubscriptionConfigProperty.Builder.() -> Unit):
          Unit =
          realtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfigProperty(realtimeMetricsSubscriptionConfig))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty,
    ) : CdkObject(cdkObject), MonitoringSubscriptionProperty {
      /**
       * A subscription configuration for additional CloudWatch metrics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription-realtimemetricssubscriptionconfig)
       */
      override fun realtimeMetricsSubscriptionConfig(): Any? =
          unwrap(this).getRealtimeMetricsSubscriptionConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringSubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty):
          MonitoringSubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringSubscriptionProperty):
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty
    }
  }
}