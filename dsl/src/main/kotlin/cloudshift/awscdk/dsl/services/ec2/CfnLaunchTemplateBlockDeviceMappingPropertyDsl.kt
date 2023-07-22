@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateBlockDeviceMappingPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.BlockDeviceMappingProperty.Builder =
      CfnLaunchTemplate.BlockDeviceMappingProperty.builder()

  /**
   * @param deviceName The device name (for example, /dev/sdh or xvdh).
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
  public fun ebs(ebs: CfnLaunchTemplate.EbsProperty) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * @param noDevice To omit the device from the block device mapping, specify an empty string.
   */
  public fun noDevice(noDevice: String) {
    cdkBuilder.noDevice(noDevice)
  }

  /**
   * @param virtualName The virtual device name (ephemeralN).
   * Instance store volumes are numbered starting from 0. An instance type with 2 available instance
   * store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance
   * store volumes depends on the instance type. After you connect to the instance, you must mount the
   * volume.
   */
  public fun virtualName(virtualName: String) {
    cdkBuilder.virtualName(virtualName)
  }

  public fun build(): CfnLaunchTemplate.BlockDeviceMappingProperty = cdkBuilder.build()
}
