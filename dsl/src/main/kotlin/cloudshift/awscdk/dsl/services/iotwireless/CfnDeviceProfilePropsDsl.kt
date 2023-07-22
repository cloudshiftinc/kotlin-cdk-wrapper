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
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps

@CdkDslMarker
public class CfnDeviceProfilePropsDsl {
  private val cdkBuilder: CfnDeviceProfileProps.Builder = CfnDeviceProfileProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param loRaWan LoRaWAN device profile object.
   */
  public fun loRaWan(loRaWan: IResolvable) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * @param loRaWan LoRaWAN device profile object.
   */
  public fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * @param name The name of the new resource.
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

  public fun build(): CfnDeviceProfileProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
