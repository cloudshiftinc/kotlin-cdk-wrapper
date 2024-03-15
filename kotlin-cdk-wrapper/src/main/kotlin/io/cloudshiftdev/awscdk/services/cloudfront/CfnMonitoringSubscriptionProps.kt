@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnMonitoringSubscriptionProps {
  public fun distributionId(): String

  public fun monitoringSubscription(): Any

  @CdkDslMarker
  public interface Builder {
    public fun distributionId(distributionId: String)

    public fun monitoringSubscription(monitoringSubscription: IResolvable)

    public
        fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48bc0b317ad573210e1cdc19178d49bd6ec64141b19569d559cb15ce654a7051")
    public
        fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps.builder()

    override fun distributionId(distributionId: String) {
      cdkBuilder.distributionId(distributionId)
    }

    override fun monitoringSubscription(monitoringSubscription: IResolvable) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(IResolvable::unwrap))
    }

    override
        fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty) {
      cdkBuilder.monitoringSubscription(monitoringSubscription.let(CfnMonitoringSubscription.MonitoringSubscriptionProperty::unwrap))
    }

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
    override fun distributionId(): String = unwrap(this).getDistributionId()

    override fun monitoringSubscription(): Any = unwrap(this).getMonitoringSubscription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMonitoringSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps):
        CfnMonitoringSubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMonitoringSubscriptionProps):
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps
  }
}
