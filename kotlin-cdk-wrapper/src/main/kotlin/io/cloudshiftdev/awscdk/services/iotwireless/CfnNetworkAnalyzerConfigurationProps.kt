@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNetworkAnalyzerConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * Object traceContent;
 * CfnNetworkAnalyzerConfigurationProps cfnNetworkAnalyzerConfigurationProps =
 * CfnNetworkAnalyzerConfigurationProps.builder()
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
public interface CfnNetworkAnalyzerConfigurationProps {
  /**
   * The description of the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Name of the network analyzer configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-name)
   */
  public fun name(): String

  /**
   * The tags to attach to the specified resource.
   *
   * Tags are metadata that you can use to manage a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Trace content for your wireless gateway and wireless device resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent)
   */
  public fun traceContent(): Any? = unwrap(this).getTraceContent()

  /**
   * Wireless device resources to add to the network analyzer configuration.
   *
   * Provide the `WirelessDeviceId` of the resource to add in the input array.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
   */
  public fun wirelessDevices(): List<String> = unwrap(this).getWirelessDevices() ?: emptyList()

  /**
   * Wireless gateway resources to add to the network analyzer configuration.
   *
   * Provide the `WirelessGatewayId` of the resource to add in the input array.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessgateways)
   */
  public fun wirelessGateways(): List<String> = unwrap(this).getWirelessGateways() ?: emptyList()

  /**
   * A builder for [CfnNetworkAnalyzerConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the resource.
     */
    public fun description(description: String)

    /**
     * @param name Name of the network analyzer configuration. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags to attach to the specified resource.
     * Tags are metadata that you can use to manage a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to attach to the specified resource.
     * Tags are metadata that you can use to manage a resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param traceContent Trace content for your wireless gateway and wireless device resources.
     */
    public fun traceContent(traceContent: Any)

    /**
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     */
    public fun wirelessDevices(wirelessDevices: List<String>)

    /**
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     */
    public fun wirelessDevices(vararg wirelessDevices: String)

    /**
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     */
    public fun wirelessGateways(wirelessGateways: List<String>)

    /**
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     */
    public fun wirelessGateways(vararg wirelessGateways: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps.builder()

    /**
     * @param description The description of the resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name Name of the network analyzer configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to attach to the specified resource.
     * Tags are metadata that you can use to manage a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to attach to the specified resource.
     * Tags are metadata that you can use to manage a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param traceContent Trace content for your wireless gateway and wireless device resources.
     */
    override fun traceContent(traceContent: Any) {
      cdkBuilder.traceContent(traceContent)
    }

    /**
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     */
    override fun wirelessDevices(wirelessDevices: List<String>) {
      cdkBuilder.wirelessDevices(wirelessDevices)
    }

    /**
     * @param wirelessDevices Wireless device resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     */
    override fun wirelessDevices(vararg wirelessDevices: String): Unit =
        wirelessDevices(wirelessDevices.toList())

    /**
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     */
    override fun wirelessGateways(wirelessGateways: List<String>) {
      cdkBuilder.wirelessGateways(wirelessGateways)
    }

    /**
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     */
    override fun wirelessGateways(vararg wirelessGateways: String): Unit =
        wirelessGateways(wirelessGateways.toList())

    public fun build():
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps,
  ) : CdkObject(cdkObject), CfnNetworkAnalyzerConfigurationProps {
    /**
     * The description of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Name of the network analyzer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags to attach to the specified resource.
     *
     * Tags are metadata that you can use to manage a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Trace content for your wireless gateway and wireless device resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent)
     */
    override fun traceContent(): Any? = unwrap(this).getTraceContent()

    /**
     * Wireless device resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
     */
    override fun wirelessDevices(): List<String> = unwrap(this).getWirelessDevices() ?: emptyList()

    /**
     * Wireless gateway resources to add to the network analyzer configuration.
     *
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessgateways)
     */
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
        CfnNetworkAnalyzerConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnNetworkAnalyzerConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkAnalyzerConfigurationProps):
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps
  }
}
