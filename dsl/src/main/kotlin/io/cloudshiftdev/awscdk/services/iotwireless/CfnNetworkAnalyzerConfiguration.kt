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

  public open fun traceContent(): Any? = unwrap(this).getTraceContent()

  public open fun traceContent(`value`: Any) {
    unwrap(this).setTraceContent(`value`)
  }

  public open fun wirelessDevices(): List<String> = unwrap(this).getWirelessDevices() ?: emptyList()

  public open fun wirelessDevices(`value`: List<String>) {
    unwrap(this).setWirelessDevices(`value`)
  }

  public open fun wirelessGateways(): List<String> = unwrap(this).getWirelessGateways() ?:
      emptyList()

  public open fun wirelessGateways(`value`: List<String>) {
    unwrap(this).setWirelessGateways(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun traceContent(traceContent: Any) {
    }

    public fun wirelessDevices(wirelessDevices: List<String>) {
    }

    public fun wirelessGateways(wirelessGateways: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.Builder =
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.Builder.create(scope,
        id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun traceContent(traceContent: Any) {
      cdkBuilder.traceContent(traceContent)
    }

    public override fun wirelessDevices(wirelessDevices: List<String>) {
      cdkBuilder.wirelessDevices(wirelessDevices)
    }

    public override fun wirelessGateways(wirelessGateways: List<String>) {
      cdkBuilder.wirelessGateways(wirelessGateways)
    }

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
      public fun logLevel(logLevel: String) {
      }

      public fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty.builder()

      public override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public override fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String) {
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
      public override fun logLevel(): String? = unwrap(this).getLogLevel()

      public override fun wirelessDeviceFrameInfo(): String? =
          unwrap(this).getWirelessDeviceFrameInfo()
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
