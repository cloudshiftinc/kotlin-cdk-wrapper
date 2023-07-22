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
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps

@CdkDslMarker
public class CfnFuotaTaskPropsDsl {
  private val cdkBuilder: CfnFuotaTaskProps.Builder = CfnFuotaTaskProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param associateMulticastGroup The ID of the multicast group to associate with a FUOTA task.
   */
  public fun associateMulticastGroup(associateMulticastGroup: String) {
    cdkBuilder.associateMulticastGroup(associateMulticastGroup)
  }

  /**
   * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
   * group.
   */
  public fun associateWirelessDevice(associateWirelessDevice: String) {
    cdkBuilder.associateWirelessDevice(associateWirelessDevice)
  }

  /**
   * @param description The description of the new resource.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param disassociateMulticastGroup The ID of the multicast group to disassociate from a FUOTA
   * task.
   */
  public fun disassociateMulticastGroup(disassociateMulticastGroup: String) {
    cdkBuilder.disassociateMulticastGroup(disassociateMulticastGroup)
  }

  /**
   * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a FUOTA
   * task.
   */
  public fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
    cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
  }

  /**
   * @param firmwareUpdateImage The S3 URI points to a firmware update image that is to be used with
   * a FUOTA task. 
   */
  public fun firmwareUpdateImage(firmwareUpdateImage: String) {
    cdkBuilder.firmwareUpdateImage(firmwareUpdateImage)
  }

  /**
   * @param firmwareUpdateRole The firmware update role that is to be used with a FUOTA task. 
   */
  public fun firmwareUpdateRole(firmwareUpdateRole: String) {
    cdkBuilder.firmwareUpdateRole(firmwareUpdateRole)
  }

  /**
   * @param loRaWan The LoRaWAN information used with a FUOTA task. 
   */
  public fun loRaWan(loRaWan: IResolvable) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * @param loRaWan The LoRaWAN information used with a FUOTA task. 
   */
  public fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * @param name The name of a FUOTA task.
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

  public fun build(): CfnFuotaTaskProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
