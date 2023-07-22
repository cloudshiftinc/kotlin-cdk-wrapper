@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetNetworkBandwidthGbpsRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty.Builder =
      CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty.builder()

  /**
   * @param max The maximum amount of network bandwidth, in Gbps.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum amount of network bandwidth, in Gbps.
   * To specify no minimum limit, omit this parameter.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnEC2Fleet.NetworkBandwidthGbpsRequestProperty = cdkBuilder.build()
}
