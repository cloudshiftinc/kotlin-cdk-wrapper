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

/**
 * Provisions a wireless device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnWirelessDevice cfnWirelessDevice = CfnWirelessDevice.Builder.create(this,
 * "MyCfnWirelessDevice")
 * .destinationName("destinationName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .lastUplinkReceivedAt("lastUplinkReceivedAt")
 * .loRaWan(LoRaWANDeviceProperty.builder()
 * .abpV10X(AbpV10xProperty.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV10xProperty.builder()
 * .appSKey("appSKey")
 * .nwkSKey("nwkSKey")
 * .build())
 * .build())
 * .abpV11(AbpV11Property.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV11Property.builder()
 * .appSKey("appSKey")
 * .fNwkSIntKey("fNwkSIntKey")
 * .nwkSEncKey("nwkSEncKey")
 * .sNwkSIntKey("sNwkSIntKey")
 * .build())
 * .build())
 * .devEui("devEui")
 * .deviceProfileId("deviceProfileId")
 * .otaaV10X(OtaaV10xProperty.builder()
 * .appEui("appEui")
 * .appKey("appKey")
 * .build())
 * .otaaV11(OtaaV11Property.builder()
 * .appKey("appKey")
 * .joinEui("joinEui")
 * .nwkKey("nwkKey")
 * .build())
 * .serviceProfileId("serviceProfileId")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingArn("thingArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWirelessDevice.Builder = CfnWirelessDevice.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the new resource.
   *
   * Maximum length is 2048.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-description)
   * @param description The description of the new resource. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the destination to assign to the new wireless device.
   *
   * Can have only have alphanumeric, - (hyphen) and _ (underscore) characters and it can't have any
   * spaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-destinationname)
   * @param destinationName The name of the destination to assign to the new wireless device. 
   */
  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  /**
   * The date and time when the most recent uplink was received.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lastuplinkreceivedat)
   * @param lastUplinkReceivedAt The date and time when the most recent uplink was received. 
   */
  public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
    cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
  }

  /**
   * The device configuration information to use to create the wireless device.
   *
   * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
   * @param loRaWan The device configuration information to use to create the wireless device. 
   */
  public fun loRaWan(loRaWan: IResolvable) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * The device configuration information to use to create the wireless device.
   *
   * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
   * @param loRaWan The device configuration information to use to create the wireless device. 
   */
  public fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-name)
   * @param name The name of the new resource. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
   * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
   * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ARN of the thing to associate with the wireless device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-thingarn)
   * @param thingArn The ARN of the thing to associate with the wireless device. 
   */
  public fun thingArn(thingArn: String) {
    cdkBuilder.thingArn(thingArn)
  }

  /**
   * The wireless device type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-type)
   * @param type The wireless device type. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnWirelessDevice {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
