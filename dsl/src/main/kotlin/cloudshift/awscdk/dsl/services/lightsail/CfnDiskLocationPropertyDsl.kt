@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDisk

@CdkDslMarker
public class CfnDiskLocationPropertyDsl {
  private val cdkBuilder: CfnDisk.LocationProperty.Builder = CfnDisk.LocationProperty.builder()

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun regionName(regionName: String) {
    cdkBuilder.regionName(regionName)
  }

  public fun build(): CfnDisk.LocationProperty = cdkBuilder.build()
}
