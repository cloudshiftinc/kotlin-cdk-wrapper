@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFuotaTaskPropsDsl {
    private val cdkBuilder: CfnFuotaTaskProps.Builder = CfnFuotaTaskProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun associateMulticastGroup(associateMulticastGroup: String) {
        cdkBuilder.associateMulticastGroup(associateMulticastGroup)
    }

    public fun associateWirelessDevice(associateWirelessDevice: String) {
        cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun disassociateMulticastGroup(disassociateMulticastGroup: String) {
        cdkBuilder.disassociateMulticastGroup(disassociateMulticastGroup)
    }

    public fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
        cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    public fun firmwareUpdateImage(firmwareUpdateImage: String) {
        cdkBuilder.firmwareUpdateImage(firmwareUpdateImage)
    }

    public fun firmwareUpdateRole(firmwareUpdateRole: String) {
        cdkBuilder.firmwareUpdateRole(firmwareUpdateRole)
    }

    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    public fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFuotaTaskProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
