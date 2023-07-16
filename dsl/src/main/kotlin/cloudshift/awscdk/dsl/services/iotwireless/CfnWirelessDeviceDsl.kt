@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import software.constructs.Construct

@CdkDslMarker
public class CfnWirelessDeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWirelessDevice.Builder = CfnWirelessDevice.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
    cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
  }

  public fun loRaWan(loRaWan: IResolvable) {
    cdkBuilder.loRaWan(loRaWan)
  }

  public fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty) {
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

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnWirelessDevice {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
