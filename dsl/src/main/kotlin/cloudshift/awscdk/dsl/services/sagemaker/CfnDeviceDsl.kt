@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.constructs.Construct

@CdkDslMarker
public class CfnDeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDevice.Builder = CfnDevice.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Edge device you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
   * @param device Edge device you want to create. 
   */
  public fun device(device: IResolvable) {
    cdkBuilder.device(device)
  }

  /**
   * Edge device you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-device)
   * @param device Edge device you want to create. 
   */
  public fun device(device: CfnDevice.DeviceProperty) {
    cdkBuilder.device(device)
  }

  /**
   * The name of the fleet the device belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-devicefleetname)
   * @param deviceFleetName The name of the fleet the device belongs to. 
   */
  public fun deviceFleetName(deviceFleetName: String) {
    cdkBuilder.deviceFleetName(deviceFleetName)
  }

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * devices.
   *
   * Each tag consists of a key and a value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
   * @param tags An array of key-value pairs that contain metadata to help you categorize and
   * organize your devices. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * devices.
   *
   * Each tag consists of a key and a value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html#cfn-sagemaker-device-tags)
   * @param tags An array of key-value pairs that contain metadata to help you categorize and
   * organize your devices. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDevice {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
