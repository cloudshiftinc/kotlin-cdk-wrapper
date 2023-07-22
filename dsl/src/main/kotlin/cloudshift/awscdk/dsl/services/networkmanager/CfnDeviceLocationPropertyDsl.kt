@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnDevice

@CdkDslMarker
public class CfnDeviceLocationPropertyDsl {
  private val cdkBuilder: CfnDevice.LocationProperty.Builder = CfnDevice.LocationProperty.builder()

  /**
   * @param address The physical address.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param latitude The latitude.
   */
  public fun latitude(latitude: String) {
    cdkBuilder.latitude(latitude)
  }

  /**
   * @param longitude The longitude.
   */
  public fun longitude(longitude: String) {
    cdkBuilder.longitude(longitude)
  }

  public fun build(): CfnDevice.LocationProperty = cdkBuilder.build()
}
