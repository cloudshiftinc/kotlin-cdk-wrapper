@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNetworkAnalyzerConfigurationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun traceContent(): Any? = unwrap(this).getTraceContent()

  public fun wirelessDevices(): List<String> = unwrap(this).getWirelessDevices() ?: emptyList()

  public fun wirelessGateways(): List<String> = unwrap(this).getWirelessGateways() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun traceContent(traceContent: Any)

    public fun wirelessDevices(wirelessDevices: List<String>)

    public fun wirelessDevices(vararg wirelessDevices: String)

    public fun wirelessGateways(wirelessGateways: List<String>)

    public fun wirelessGateways(vararg wirelessGateways: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun traceContent(traceContent: Any) {
      cdkBuilder.traceContent(traceContent)
    }

    override fun wirelessDevices(wirelessDevices: List<String>) {
      cdkBuilder.wirelessDevices(wirelessDevices)
    }

    override fun wirelessDevices(vararg wirelessDevices: String): Unit =
        wirelessDevices(wirelessDevices.toList())

    override fun wirelessGateways(wirelessGateways: List<String>) {
      cdkBuilder.wirelessGateways(wirelessGateways)
    }

    override fun wirelessGateways(vararg wirelessGateways: String): Unit =
        wirelessGateways(wirelessGateways.toList())

    public fun build():
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps,
  ) : CdkObject(cdkObject), CfnNetworkAnalyzerConfigurationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun traceContent(): Any? = unwrap(this).getTraceContent()

    override fun wirelessDevices(): List<String> = unwrap(this).getWirelessDevices() ?: emptyList()

    override fun wirelessGateways(): List<String> = unwrap(this).getWirelessGateways() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnNetworkAnalyzerConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps):
        CfnNetworkAnalyzerConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkAnalyzerConfigurationProps):
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps
  }
}
