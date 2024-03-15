@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMonitoringSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription,
) : CfnResource(cdkObject), IInspectable {
  public open fun distributionId(): String = unwrap(this).getDistributionId()

  public open fun distributionId(`value`: String) {
    unwrap(this).setDistributionId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun monitoringSubscription(): Any = unwrap(this).getMonitoringSubscription()

  public open fun monitoringSubscription(`value`: IResolvable) {
    unwrap(this).setMonitoringSubscription(`value`.let(IResolvable::unwrap))
  }

  public open fun monitoringSubscription(`value`: MonitoringSubscriptionProperty) {
    unwrap(this).setMonitoringSubscription(`value`.let(MonitoringSubscriptionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e9ee5f258707c636ad8f49355bdebf53ca44f224940e22008822fd37c15af9a2")
  public open
      fun monitoringSubscription(`value`: MonitoringSubscriptionProperty.Builder.() -> Unit): Unit =
      monitoringSubscription(MonitoringSubscriptionProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun distributionId(distributionId: String)

    public fun monitoringSubscription(monitoringSubscription: IResolvable)

    public fun monitoringSubscription(monitoringSubscription: MonitoringSubscriptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    override fun monitoringSubscription(monitoringSubscription: IResolvable) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(IResolvable::unwrap))
    }

    override fun monitoringSubscription(monitoringSubscription: MonitoringSubscriptionProperty) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(MonitoringSubscriptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("960c31d5e6d26a8705b4f2a0f41859f3c7358310c77d732a335fdc0c2d49da4c")
    override
        fun monitoringSubscription(monitoringSubscription: MonitoringSubscriptionProperty.Builder.() -> Unit):
        Unit = monitoringSubscription(MonitoringSubscriptionProperty(monitoringSubscription))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.CFN_RESOURCE_TYPE_NAME

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
    public fun realtimeMetricsSubscriptionStatus(): String

    @CdkDslMarker
    public interface Builder {
      public fun realtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty.builder()

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
    public fun realtimeMetricsSubscriptionConfig(): Any? =
        unwrap(this).getRealtimeMetricsSubscriptionConfig()

    @CdkDslMarker
    public interface Builder {
      public fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: IResolvable)

      public
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: RealtimeMetricsSubscriptionConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646758f52c4c776f22979f6af944bbfdec50fc60d3445e1ae97199497f862312")
      public
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: RealtimeMetricsSubscriptionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription.MonitoringSubscriptionProperty.builder()

      override
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: IResolvable) {
        cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig.let(IResolvable::unwrap))
      }

      override
          fun realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig: RealtimeMetricsSubscriptionConfigProperty) {
        cdkBuilder.realtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig.let(RealtimeMetricsSubscriptionConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
