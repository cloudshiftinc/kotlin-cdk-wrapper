@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnMulticastGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnMulticastGroupProps cfnMulticastGroupProps = CfnMulticastGroupProps.builder()
 * .loRaWan(LoRaWANProperty.builder()
 * .dlClass("dlClass")
 * .rfRegion("rfRegion")
 * // the properties below are optional
 * .numberOfDevicesInGroup(123)
 * .numberOfDevicesRequested(123)
 * .build())
 * // the properties below are optional
 * .associateWirelessDevice("associateWirelessDevice")
 * .description("description")
 * .disassociateWirelessDevice("disassociateWirelessDevice")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html)
 */
@CdkDslMarker
public class CfnMulticastGroupPropsDsl {
    private val cdkBuilder: CfnMulticastGroupProps.Builder = CfnMulticastGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     * group.
     */
    public fun associateWirelessDevice(associateWirelessDevice: String) {
        cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    /**
     * @param description The description of the multicast group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a
     * multicast group.
     */
    public fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
        cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group.
     */
    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group.
     */
    public fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * @param name The name of the multicast group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMulticastGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
