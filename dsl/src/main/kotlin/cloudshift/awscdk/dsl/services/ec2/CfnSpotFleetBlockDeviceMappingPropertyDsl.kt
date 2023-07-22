@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Specifies a block device mapping.
 *
 * You can specify `Ebs` or `VirtualName` , but not both.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .ebs(EbsBlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-blockdevicemapping.html)
 */
@CdkDslMarker
public class CfnSpotFleetBlockDeviceMappingPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.BlockDeviceMappingProperty.Builder =
      CfnSpotFleet.BlockDeviceMappingProperty.builder()

  /**
   * @param deviceName The device name (for example, `/dev/sdh` or `xvdh` ). 
   */
  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  /**
   * @param ebs Parameters used to automatically set up EBS volumes when the instance is launched.
   */
  public fun ebs(ebs: IResolvable) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * @param ebs Parameters used to automatically set up EBS volumes when the instance is launched.
   */
  public fun ebs(ebs: CfnSpotFleet.EbsBlockDeviceProperty) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * @param noDevice To omit the device from the block device mapping, specify an empty string.
   * When this property is specified, the device is removed from the block device mapping regardless
   * of the assigned value.
   */
  public fun noDevice(noDevice: String) {
    cdkBuilder.noDevice(noDevice)
  }

  /**
   * @param virtualName The virtual device name ( `ephemeral` N).
   * Instance store volumes are numbered starting from 0. An instance type with 2 available instance
   * store volumes can specify mappings for `ephemeral0` and `ephemeral1` . The number of available
   * instance store volumes depends on the instance type. After you connect to the instance, you must
   * mount the volume.
   *
   * NVMe instance store volumes are automatically enumerated and assigned a device name. Including
   * them in your block device mapping has no effect.
   *
   * Constraints: For M3 instances, you must specify instance store volumes in the block device
   * mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes
   * specified in the block device mapping for the AMI.
   */
  public fun virtualName(virtualName: String) {
    cdkBuilder.virtualName(virtualName)
  }

  public fun build(): CfnSpotFleet.BlockDeviceMappingProperty = cdkBuilder.build()
}
