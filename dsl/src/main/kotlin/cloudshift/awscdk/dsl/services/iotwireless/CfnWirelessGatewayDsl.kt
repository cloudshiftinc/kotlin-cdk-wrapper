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
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
import software.constructs.Construct

/**
 * Provisions a wireless gateway.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnWirelessGateway cfnWirelessGateway = CfnWirelessGateway.Builder.create(this,
 * "MyCfnWirelessGateway")
 * .loRaWan(LoRaWANGatewayProperty.builder()
 * .gatewayEui("gatewayEui")
 * .rfRegion("rfRegion")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .lastUplinkReceivedAt("lastUplinkReceivedAt")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingArn("thingArn")
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html)
 */
@CdkDslMarker
public class CfnWirelessGatewayDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWirelessGateway.Builder = CfnWirelessGateway.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the new resource.
   *
   * The maximum length is 2048 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-description)
   * @param description The description of the new resource. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The date and time when the most recent uplink was received.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lastuplinkreceivedat)
   * @param lastUplinkReceivedAt The date and time when the most recent uplink was received. 
   */
  public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
    cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
  }

  /**
   * The gateway configuration information to use to create the wireless gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
   * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
   */
  public fun loRaWan(loRaWan: IResolvable) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * The gateway configuration information to use to create the wireless gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
   * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
   */
  public fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty) {
    cdkBuilder.loRaWan(loRaWan)
  }

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-name)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
   * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ARN of the thing to associate with the wireless gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingarn)
   * @param thingArn The ARN of the thing to associate with the wireless gateway. 
   */
  public fun thingArn(thingArn: String) {
    cdkBuilder.thingArn(thingArn)
  }

  /**
   * The name of the thing associated with the wireless gateway.
   *
   * The value is empty if a thing isn't associated with the gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingname)
   * @param thingName The name of the thing associated with the wireless gateway. 
   */
  public fun thingName(thingName: String) {
    cdkBuilder.thingName(thingName)
  }

  public fun build(): CfnWirelessGateway {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
