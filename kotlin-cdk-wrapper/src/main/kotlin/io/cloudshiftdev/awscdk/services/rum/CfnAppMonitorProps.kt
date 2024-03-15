@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rum

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAppMonitorProps {
  public fun appMonitorConfiguration(): Any? = unwrap(this).getAppMonitorConfiguration()

  public fun customEvents(): Any? = unwrap(this).getCustomEvents()

  public fun cwLogEnabled(): Any? = unwrap(this).getCwLogEnabled()

  public fun domain(): String

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun appMonitorConfiguration(appMonitorConfiguration: IResolvable)

    public
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("240234ed1bec70f9ac59c586e4f21c17a1b4bf7a3d90e5390c47984f72662364")
    public
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty.Builder.() -> Unit)

    public fun customEvents(customEvents: IResolvable)

    public fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebce3b804f4b806915800466c10811b7e1692d03470e31444e5e79d1628c26d")
    public fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty.Builder.() -> Unit)

    public fun cwLogEnabled(cwLogEnabled: Boolean)

    public fun cwLogEnabled(cwLogEnabled: IResolvable)

    public fun domain(domain: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rum.CfnAppMonitorProps.Builder =
        software.amazon.awscdk.services.rum.CfnAppMonitorProps.builder()

    override fun appMonitorConfiguration(appMonitorConfiguration: IResolvable) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(IResolvable::unwrap))
    }

    override
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(CfnAppMonitor.AppMonitorConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("240234ed1bec70f9ac59c586e4f21c17a1b4bf7a3d90e5390c47984f72662364")
    override
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty.Builder.() -> Unit):
        Unit =
        appMonitorConfiguration(CfnAppMonitor.AppMonitorConfigurationProperty(appMonitorConfiguration))

    override fun customEvents(customEvents: IResolvable) {
      cdkBuilder.customEvents(customEvents.let(IResolvable::unwrap))
    }

    override fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty) {
      cdkBuilder.customEvents(customEvents.let(CfnAppMonitor.CustomEventsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebce3b804f4b806915800466c10811b7e1692d03470e31444e5e79d1628c26d")
    override fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty.Builder.() -> Unit):
        Unit = customEvents(CfnAppMonitor.CustomEventsProperty(customEvents))

    override fun cwLogEnabled(cwLogEnabled: Boolean) {
      cdkBuilder.cwLogEnabled(cwLogEnabled)
    }

    override fun cwLogEnabled(cwLogEnabled: IResolvable) {
      cdkBuilder.cwLogEnabled(cwLogEnabled.let(IResolvable::unwrap))
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitorProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitorProps,
  ) : CdkObject(cdkObject), CfnAppMonitorProps {
    override fun appMonitorConfiguration(): Any? = unwrap(this).getAppMonitorConfiguration()

    override fun customEvents(): Any? = unwrap(this).getCustomEvents()

    override fun cwLogEnabled(): Any? = unwrap(this).getCwLogEnabled()

    override fun domain(): String = unwrap(this).getDomain()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppMonitorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitorProps):
        CfnAppMonitorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppMonitorProps):
        software.amazon.awscdk.services.rum.CfnAppMonitorProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rum.CfnAppMonitorProps
  }
}
