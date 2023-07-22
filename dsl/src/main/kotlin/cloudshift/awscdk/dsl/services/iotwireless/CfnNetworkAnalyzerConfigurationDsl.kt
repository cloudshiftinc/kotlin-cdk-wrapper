@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
import software.constructs.Construct

/**
 * Network analyzer configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
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
@CdkDslMarker
public class CfnNetworkAnalyzerConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkAnalyzerConfiguration.Builder =
      CfnNetworkAnalyzerConfiguration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _wirelessDevices: MutableList<String> = mutableListOf()

  private val _wirelessGateways: MutableList<String> = mutableListOf()

  /**
   * The description of the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-description)
   * @param description The description of the resource. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Name of the network analyzer configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-name)
   * @param name Name of the network analyzer configuration. 
   */
  public fun name(name: String) {
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to attach to the specified resource.
   *
   * Tags are metadata that you can use to manage a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tags)
   * @param tags The tags to attach to the specified resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Trace content for your wireless gateway and wireless device resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent)
   * @param traceContent Trace content for your wireless gateway and wireless device resources. 
   */
  public fun traceContent(traceContent: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(traceContent)
    cdkBuilder.traceContent(builder.map)
  }

  /**
   * Trace content for your wireless gateway and wireless device resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-tracecontent)
   * @param traceContent Trace content for your wireless gateway and wireless device resources. 
   */
  public fun traceContent(traceContent: Any) {
    cdkBuilder.traceContent(traceContent)
  }

  /**
   * Wireless device resources to add to the network analyzer configuration.
   *
   * Provide the `WirelessDeviceId` of the resource to add in the input array.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
   * @param wirelessDevices Wireless device resources to add to the network analyzer configuration. 
   */
  public fun wirelessDevices(vararg wirelessDevices: String) {
    _wirelessDevices.addAll(listOf(*wirelessDevices))
  }

  /**
   * Wireless device resources to add to the network analyzer configuration.
   *
   * Provide the `WirelessDeviceId` of the resource to add in the input array.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-networkanalyzerconfiguration.html#cfn-iotwireless-networkanalyzerconfiguration-wirelessdevices)
   * @param wirelessDevices Wireless device resources to add to the network analyzer configuration. 
   */
  public fun wirelessDevices(wirelessDevices: Collection<String>) {
    _wirelessDevices.addAll(wirelessDevices)
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
  public fun wirelessGateways(vararg wirelessGateways: String) {
    _wirelessGateways.addAll(listOf(*wirelessGateways))
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
  public fun wirelessGateways(wirelessGateways: Collection<String>) {
    _wirelessGateways.addAll(wirelessGateways)
  }

  public fun build(): CfnNetworkAnalyzerConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_wirelessDevices.isNotEmpty()) cdkBuilder.wirelessDevices(_wirelessDevices)
    if(_wirelessGateways.isNotEmpty()) cdkBuilder.wirelessGateways(_wirelessGateways)
    return cdkBuilder.build()
  }
}
