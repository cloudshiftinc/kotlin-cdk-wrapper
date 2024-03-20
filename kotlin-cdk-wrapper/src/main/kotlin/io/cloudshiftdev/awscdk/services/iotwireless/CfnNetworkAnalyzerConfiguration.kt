@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Network analyzer configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * Object traceContent;
 * CfnNetworkAnalyzerConfiguration cfnNetworkAnalyzerConfiguration =
 * CfnNetworkAnalyzerConfiguration.Builder.create(this, "MyCfnNetworkAnalyzerConfiguration")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .traceContent(traceContent)
 * .wirelessDevices(List.of("wirelessDevices"))
 * .wirelessGateways(List.of("wirelessGateways"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html)
 */
public open class CfnNetworkAnalyzerConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkAnalyzerConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNetworkAnalyzerConfigurationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkAnalyzerConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNetworkAnalyzerConfigurationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The description of the resource.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the resource.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * Name of the network analyzer configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the network analyzer configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to attach to the specified resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to attach to the specified resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to attach to the specified resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Trace content for your wireless gateway and wireless device resources.
   */
  public open fun traceContent(): Any? = unwrap(this).getTraceContent()

  /**
   * Trace content for your wireless gateway and wireless device resources.
   */
  public open fun traceContent(`value`: Any) {
    unwrap(this).setTraceContent(`value`)
  }

  /**
   * Wireless device resources to add to the network analyzer configuration.
   */
  public open fun wirelessDevices(): List<String> = unwrap(this).getWirelessDevices() ?: emptyList()

  /**
   * Wireless device resources to add to the network analyzer configuration.
   */
  public open fun wirelessDevices(`value`: List<String>) {
    unwrap(this).setWirelessDevices(`value`)
  }

  /**
   * Wireless device resources to add to the network analyzer configuration.
   */
  public open fun wirelessDevices(vararg `value`: String): Unit = wirelessDevices(`value`.toList())

  /**
   * Wireless gateway resources to add to the network analyzer configuration.
   */
  public open fun wirelessGateways(): List<String> = unwrap(this).getWirelessGateways() ?:
      emptyList()

  /**
   * Wireless gateway resources to add to the network analyzer configuration.
   */
  public open fun wirelessGateways(`value`: List<String>) {
    unwrap(this).setWirelessGateways(`value`)
  }

  /**
   * Wireless gateway resources to add to the network analyzer configuration.
   */
  public open fun wirelessGateways(vararg `value`: String): Unit =
      wirelessGateways(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-description)
     * @param description The description of the resource. 
     */
    public fun description(description: String)

    /**
     * Name of the network analyzer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-name)
     * @param name Name of the network analyzer configuration. 
     */
    public fun name(name: String)

    /**
     * The tags to attach to the specified resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tags)
     * @param tags The tags to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to attach to the specified resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tags)
     * @param tags The tags to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Trace content for your wireless gateway and wireless device resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent)
     * @param traceContent Trace content for your wireless gateway and wireless device resources. 
     */
    public fun traceContent(traceContent: Any)

    /**
     * Wireless device resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration. 
     */
    public fun wirelessDevices(wirelessDevices: List<String>)

    /**
     * Wireless device resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration. 
     */
    public fun wirelessDevices(vararg wirelessDevices: String)

    /**
     * Wireless gateway resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessgateways)
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration. 
     */
    public fun wirelessGateways(wirelessGateways: List<String>)

    /**
     * Wireless gateway resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessgateways)
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration. 
     */
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

    /**
     * The description of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-description)
     * @param description The description of the resource. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Name of the network analyzer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-name)
     * @param name Name of the network analyzer configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags to attach to the specified resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tags)
     * @param tags The tags to attach to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to attach to the specified resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tags)
     * @param tags The tags to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Trace content for your wireless gateway and wireless device resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent)
     * @param traceContent Trace content for your wireless gateway and wireless device resources. 
     */
    override fun traceContent(traceContent: Any) {
      cdkBuilder.traceContent(traceContent)
    }

    /**
     * Wireless device resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration. 
     */
    override fun wirelessDevices(wirelessDevices: List<String>) {
      cdkBuilder.wirelessDevices(wirelessDevices)
    }

    /**
     * Wireless device resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration. 
     */
    override fun wirelessDevices(vararg wirelessDevices: String): Unit =
        wirelessDevices(wirelessDevices.toList())

    /**
     * Wireless gateway resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessgateways)
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration. 
     */
    override fun wirelessGateways(wirelessGateways: List<String>) {
      cdkBuilder.wirelessGateways(wirelessGateways)
    }

    /**
     * Wireless gateway resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessgateways)
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration. 
     */
    override fun wirelessGateways(vararg wirelessGateways: String): Unit =
        wirelessGateways(wirelessGateways.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.CFN_RESOURCE_TYPE_NAME

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

  /**
   * Trace content for your wireless gateway and wireless device resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * TraceContentProperty traceContentProperty = TraceContentProperty.builder()
   * .logLevel("logLevel")
   * .wirelessDeviceFrameInfo("wirelessDeviceFrameInfo")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-networkanalyzerconfiguration-tracecontent.html)
   */
  public interface TraceContentProperty {
    /**
     * The log level for a log message.
     *
     * The log levels can be disabled, or set to `ERROR` to display less verbose logs containing
     * only error information, or to `INFO` for more detailed logs
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-networkanalyzerconfiguration-tracecontent.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent-loglevel)
     */
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * `FrameInfo` of your wireless device resources for the trace content.
     *
     * Use FrameInfo to debug the communication between your LoRaWAN end devices and the network
     * server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-networkanalyzerconfiguration-tracecontent.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent-wirelessdeviceframeinfo)
     */
    public fun wirelessDeviceFrameInfo(): String? = unwrap(this).getWirelessDeviceFrameInfo()

    /**
     * A builder for [TraceContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logLevel The log level for a log message.
       * The log levels can be disabled, or set to `ERROR` to display less verbose logs containing
       * only error information, or to `INFO` for more detailed logs
       */
      public fun logLevel(logLevel: String)

      /**
       * @param wirelessDeviceFrameInfo `FrameInfo` of your wireless device resources for the trace
       * content.
       * Use FrameInfo to debug the communication between your LoRaWAN end devices and the network
       * server.
       */
      public fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty.builder()

      /**
       * @param logLevel The log level for a log message.
       * The log levels can be disabled, or set to `ERROR` to display less verbose logs containing
       * only error information, or to `INFO` for more detailed logs
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      /**
       * @param wirelessDeviceFrameInfo `FrameInfo` of your wireless device resources for the trace
       * content.
       * Use FrameInfo to debug the communication between your LoRaWAN end devices and the network
       * server.
       */
      override fun wirelessDeviceFrameInfo(wirelessDeviceFrameInfo: String) {
        cdkBuilder.wirelessDeviceFrameInfo(wirelessDeviceFrameInfo)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty,
    ) : CdkObject(cdkObject), TraceContentProperty {
      /**
       * The log level for a log message.
       *
       * The log levels can be disabled, or set to `ERROR` to display less verbose logs containing
       * only error information, or to `INFO` for more detailed logs
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-networkanalyzerconfiguration-tracecontent.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent-loglevel)
       */
      override fun logLevel(): String? = unwrap(this).getLogLevel()

      /**
       * `FrameInfo` of your wireless device resources for the trace content.
       *
       * Use FrameInfo to debug the communication between your LoRaWAN end devices and the network
       * server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-networkanalyzerconfiguration-tracecontent.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent-wirelessdeviceframeinfo)
       */
      override fun wirelessDeviceFrameInfo(): String? = unwrap(this).getWirelessDeviceFrameInfo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TraceContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty):
          TraceContentProperty = CdkObjectWrappers.wrap(cdkObject) as? TraceContentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TraceContentProperty):
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration.TraceContentProperty
    }
  }
}
