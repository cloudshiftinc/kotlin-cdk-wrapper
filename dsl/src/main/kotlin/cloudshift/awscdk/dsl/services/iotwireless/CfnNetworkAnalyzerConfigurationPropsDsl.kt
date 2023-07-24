@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnNetworkAnalyzerConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
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
@CdkDslMarker
public class CfnNetworkAnalyzerConfigurationPropsDsl {
    private val cdkBuilder: CfnNetworkAnalyzerConfigurationProps.Builder =
        CfnNetworkAnalyzerConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _wirelessDevices: MutableList<String> = mutableListOf()

    private val _wirelessGateways: MutableList<String> = mutableListOf()

    /**
     * @param description The description of the resource.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name Name of the network analyzer configuration.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to attach to the specified resource.
     * Tags are metadata that you can use to manage a resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags to attach to the specified resource.
     * Tags are metadata that you can use to manage a resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param traceContent Trace content for your wireless gateway and wireless device resources.
     */
    public fun traceContent(traceContent: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(traceContent)
        cdkBuilder.traceContent(builder.map)
    }

    /**
     * @param traceContent Trace content for your wireless gateway and wireless device resources.
     */
    public fun traceContent(traceContent: Any) {
        cdkBuilder.traceContent(traceContent)
    }

    /**
     * @param wirelessDevices Wireless device resources to add to the network analyzer configuration.
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     */
    public fun wirelessDevices(vararg wirelessDevices: String) {
        _wirelessDevices.addAll(listOf(*wirelessDevices))
    }

    /**
     * @param wirelessDevices Wireless device resources to add to the network analyzer configuration.
     * Provide the `WirelessDeviceId` of the resource to add in the input array.
     */
    public fun wirelessDevices(wirelessDevices: Collection<String>) {
        _wirelessDevices.addAll(wirelessDevices)
    }

    /**
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     */
    public fun wirelessGateways(vararg wirelessGateways: String) {
        _wirelessGateways.addAll(listOf(*wirelessGateways))
    }

    /**
     * @param wirelessGateways Wireless gateway resources to add to the network analyzer
     * configuration.
     * Provide the `WirelessGatewayId` of the resource to add in the input array.
     */
    public fun wirelessGateways(wirelessGateways: Collection<String>) {
        _wirelessGateways.addAll(wirelessGateways)
    }

    public fun build(): CfnNetworkAnalyzerConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_wirelessDevices.isNotEmpty()) cdkBuilder.wirelessDevices(_wirelessDevices)
        if (_wirelessGateways.isNotEmpty()) cdkBuilder.wirelessGateways(_wirelessGateways)
        return cdkBuilder.build()
    }
}
