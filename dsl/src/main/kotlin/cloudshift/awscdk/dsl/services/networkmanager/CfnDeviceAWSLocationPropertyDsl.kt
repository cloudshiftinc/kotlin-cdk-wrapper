@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnDevice

@CdkDslMarker
public class CfnDeviceAWSLocationPropertyDsl {
  private val cdkBuilder: CfnDevice.AWSLocationProperty.Builder =
      CfnDevice.AWSLocationProperty.builder()

  /**
   * @param subnetArn The Amazon Resource Name (ARN) of the subnet that the device is located in.
   */
  public fun subnetArn(subnetArn: String) {
    cdkBuilder.subnetArn(subnetArn)
  }

  /**
   * @param zone The Zone that the device is located in.
   * Specify the ID of an Availability Zone, Local Zone, Wavelength Zone, or an Outpost.
   */
  public fun zone(zone: String) {
    cdkBuilder.zone(zone)
  }

  public fun build(): CfnDevice.AWSLocationProperty = cdkBuilder.build()
}
