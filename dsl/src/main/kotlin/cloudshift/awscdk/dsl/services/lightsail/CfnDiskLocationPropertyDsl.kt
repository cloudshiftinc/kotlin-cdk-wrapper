@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDisk

@CdkDslMarker
public class CfnDiskLocationPropertyDsl {
  private val cdkBuilder: CfnDisk.LocationProperty.Builder = CfnDisk.LocationProperty.builder()

  /**
   * @param availabilityZone The Availability Zone in which to create your disk.
   * Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability
   * Zones parameter to your request.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param regionName The Region Name in which to create your disk.
   */
  public fun regionName(regionName: String) {
    cdkBuilder.regionName(regionName)
  }

  public fun build(): CfnDisk.LocationProperty = cdkBuilder.build()
}
