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
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
import software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWirelessGatewayPropsDsl {
    private val cdkBuilder: CfnWirelessGatewayProps.Builder = CfnWirelessGatewayProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
        cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    public fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty) {
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

    public fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
    }

    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnWirelessGatewayProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
