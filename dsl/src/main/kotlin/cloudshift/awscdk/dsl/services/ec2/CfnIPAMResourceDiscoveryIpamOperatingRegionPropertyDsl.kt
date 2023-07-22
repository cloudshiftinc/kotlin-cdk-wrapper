@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery

@CdkDslMarker
public class CfnIPAMResourceDiscoveryIpamOperatingRegionPropertyDsl {
  private val cdkBuilder: CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.Builder =
      CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.builder()

  /**
   * @param regionName The name of the operating Region. 
   */
  public fun regionName(regionName: String) {
    cdkBuilder.regionName(regionName)
  }

  public fun build(): CfnIPAMResourceDiscovery.IpamOperatingRegionProperty = cdkBuilder.build()
}
