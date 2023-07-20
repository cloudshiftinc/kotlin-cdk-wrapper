@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetBlockDeviceMappingPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.BlockDeviceMappingProperty.Builder =
      CfnSpotFleet.BlockDeviceMappingProperty.builder()

  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  public fun ebs(ebs: IResolvable) {
    cdkBuilder.ebs(ebs)
  }

  public fun ebs(ebs: CfnSpotFleet.EbsBlockDeviceProperty) {
    cdkBuilder.ebs(ebs)
  }

  public fun noDevice(noDevice: String) {
    cdkBuilder.noDevice(noDevice)
  }

  public fun virtualName(virtualName: String) {
    cdkBuilder.virtualName(virtualName)
  }

  public fun build(): CfnSpotFleet.BlockDeviceMappingProperty = cdkBuilder.build()
}
