@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.internetmonitor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMonitorProps {
  public fun healthEventsConfig(): Any? = unwrap(this).getHealthEventsConfig()

  public fun internetMeasurementsLogDelivery(): Any? =
      unwrap(this).getInternetMeasurementsLogDelivery()

  public fun maxCityNetworksToMonitor(): Number? = unwrap(this).getMaxCityNetworksToMonitor()

  public fun monitorName(): String

  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public fun resourcesToAdd(): List<String> = unwrap(this).getResourcesToAdd() ?: emptyList()

  public fun resourcesToRemove(): List<String> = unwrap(this).getResourcesToRemove() ?: emptyList()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trafficPercentageToMonitor(): Number? = unwrap(this).getTrafficPercentageToMonitor()

  @CdkDslMarker
  public interface Builder {
    public fun healthEventsConfig(healthEventsConfig: IResolvable)

    public fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ff596f361103841d28bae953539b377f998a672f8667a47215cee08bca811a")
    public
        fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty.Builder.() -> Unit)

    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable)

    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("028392a41afcc5d121021085744808e7d08fd41be29a4986bada68513d04a167")
    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit)

    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number)

    public fun monitorName(monitorName: String)

    public fun resources(resources: List<String>)

    public fun resources(vararg resources: String)

    public fun resourcesToAdd(resourcesToAdd: List<String>)

    public fun resourcesToAdd(vararg resourcesToAdd: String)

    public fun resourcesToRemove(resourcesToRemove: List<String>)

    public fun resourcesToRemove(vararg resourcesToRemove: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.internetmonitor.CfnMonitorProps.Builder
        = software.amazon.awscdk.services.internetmonitor.CfnMonitorProps.builder()

    override fun healthEventsConfig(healthEventsConfig: IResolvable) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(IResolvable::unwrap))
    }

    override fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(CfnMonitor.HealthEventsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ff596f361103841d28bae953539b377f998a672f8667a47215cee08bca811a")
    override
        fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty.Builder.() -> Unit):
        Unit = healthEventsConfig(CfnMonitor.HealthEventsConfigProperty(healthEventsConfig))

    override fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(IResolvable::unwrap))
    }

    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(CfnMonitor.InternetMeasurementsLogDeliveryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("028392a41afcc5d121021085744808e7d08fd41be29a4986bada68513d04a167")
    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
        Unit =
        internetMeasurementsLogDelivery(CfnMonitor.InternetMeasurementsLogDeliveryProperty(internetMeasurementsLogDelivery))

    override fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
      cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    override fun resourcesToAdd(resourcesToAdd: List<String>) {
      cdkBuilder.resourcesToAdd(resourcesToAdd)
    }

    override fun resourcesToAdd(vararg resourcesToAdd: String): Unit =
        resourcesToAdd(resourcesToAdd.toList())

    override fun resourcesToRemove(resourcesToRemove: List<String>) {
      cdkBuilder.resourcesToRemove(resourcesToRemove)
    }

    override fun resourcesToRemove(vararg resourcesToRemove: String): Unit =
        resourcesToRemove(resourcesToRemove.toList())

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
      cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): software.amazon.awscdk.services.internetmonitor.CfnMonitorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitorProps,
  ) : CdkObject(cdkObject), CfnMonitorProps {
    override fun healthEventsConfig(): Any? = unwrap(this).getHealthEventsConfig()

    override fun internetMeasurementsLogDelivery(): Any? =
        unwrap(this).getInternetMeasurementsLogDelivery()

    override fun maxCityNetworksToMonitor(): Number? = unwrap(this).getMaxCityNetworksToMonitor()

    override fun monitorName(): String = unwrap(this).getMonitorName()

    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    override fun resourcesToAdd(): List<String> = unwrap(this).getResourcesToAdd() ?: emptyList()

    override fun resourcesToRemove(): List<String> = unwrap(this).getResourcesToRemove() ?:
        emptyList()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trafficPercentageToMonitor(): Number? =
        unwrap(this).getTrafficPercentageToMonitor()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMonitorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitorProps):
        CfnMonitorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMonitorProps):
        software.amazon.awscdk.services.internetmonitor.CfnMonitorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.internetmonitor.CfnMonitorProps
  }
}
