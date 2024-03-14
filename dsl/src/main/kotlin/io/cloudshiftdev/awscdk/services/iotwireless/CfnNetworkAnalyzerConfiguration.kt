package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkAnalyzerConfiguration internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun traceContent(): Any? = unwrap(this).getTraceContent()

  public open fun traceContent(`value`: Any) {
    unwrap(this).setTraceContent(`value`)
  }

  public open fun wirelessDevices(): List<String> = unwrap(this).getWirelessDevices() ?: emptyList()

  public open fun wirelessDevices(`value`: List<String>) {
    unwrap(this).setWirelessDevices(`value`)
  }

  public open fun wirelessDevices(vararg `value`: String): Unit = wirelessDevices(`value`.toList())

  public open fun wirelessGateways(): List<String> = unwrap(this).getWirelessGateways() ?:
      emptyList()

  public open fun wirelessGateways(`value`: List<String>) {
    unwrap(this).setWirelessGateways(`value`)
  }

  public open fun wirelessGateways(vararg `value`: String): Unit =
      wirelessGateways(`value`.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.Builder =
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkAnalyzerConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkAnalyzerConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration):
        CfnNetworkAnalyzerConfiguration = CfnNetworkAnalyzerConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkAnalyzerConfiguration):
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration =
        wrapped.cdkObject
  }

  public interface TraceContentProperty {
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    public fun wirelessDeviceFrameInfo(): String? = unwrap(this).getWirelessDeviceFrameInfo()

    public interface Builder {
      public fun logLevel(logLevel: String)

      public fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty.builder()

      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      override fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String) {
        cdkBuilder.wirelessDeviceFrameInfo(wirelessDeviceFrameInfo)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty,
    ) : TraceContentProperty {
      override fun logLevel(): String? = unwrap(this).getLogLevel()

      override fun wirelessDeviceFrameInfo(): String? = unwrap(this).getWirelessDeviceFrameInfo()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TraceContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty):
          TraceContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TraceContentProperty):
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
