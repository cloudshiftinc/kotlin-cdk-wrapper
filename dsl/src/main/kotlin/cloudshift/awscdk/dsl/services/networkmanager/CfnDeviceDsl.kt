@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnDevice
import software.constructs.Construct

/**
 * Specifies a device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnDevice cfnDevice = CfnDevice.Builder.create(this, "MyCfnDevice")
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .awsLocation(AWSLocationProperty.builder()
 * .subnetArn("subnetArn")
 * .zone("zone")
 * .build())
 * .description("description")
 * .location(LocationProperty.builder()
 * .address("address")
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .model("model")
 * .serialNumber("serialNumber")
 * .siteId("siteId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .vendor("vendor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html)
 */
@CdkDslMarker
public class CfnDeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDevice.Builder = CfnDevice.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Web Services location of the device, if applicable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
   * @param awsLocation The Amazon Web Services location of the device, if applicable. 
   */
  public fun awsLocation(awsLocation: IResolvable) {
    cdkBuilder.awsLocation(awsLocation)
  }

  /**
   * The Amazon Web Services location of the device, if applicable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-awslocation)
   * @param awsLocation The Amazon Web Services location of the device, if applicable. 
   */
  public fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty) {
    cdkBuilder.awsLocation(awsLocation)
  }

  /**
   * A description of the device.
   *
   * Constraints: Maximum length of 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-description)
   * @param description A description of the device. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-globalnetworkid)
   * @param globalNetworkId The ID of the global network. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * The site location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
   * @param location The site location. 
   */
  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  /**
   * The site location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-location)
   * @param location The site location. 
   */
  public fun location(location: CfnDevice.LocationProperty) {
    cdkBuilder.location(location)
  }

  /**
   * The model of the device.
   *
   * Constraints: Maximum length of 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-model)
   * @param model The model of the device. 
   */
  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  /**
   * The serial number of the device.
   *
   * Constraints: Maximum length of 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-serialnumber)
   * @param serialNumber The serial number of the device. 
   */
  public fun serialNumber(serialNumber: String) {
    cdkBuilder.serialNumber(serialNumber)
  }

  /**
   * The site ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-siteid)
   * @param siteId The site ID. 
   */
  public fun siteId(siteId: String) {
    cdkBuilder.siteId(siteId)
  }

  /**
   * The tags for the device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
   * @param tags The tags for the device. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-tags)
   * @param tags The tags for the device. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The device type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-type)
   * @param type The device type. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * The vendor of the device.
   *
   * Constraints: Maximum length of 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html#cfn-networkmanager-device-vendor)
   * @param vendor The vendor of the device. 
   */
  public fun vendor(vendor: String) {
    cdkBuilder.vendor(vendor)
  }

  public fun build(): CfnDevice {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
