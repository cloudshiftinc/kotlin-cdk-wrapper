@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateNetworkBandwidthGbpsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.NetworkBandwidthGbpsProperty.Builder =
      CfnLaunchTemplate.NetworkBandwidthGbpsProperty.builder()

  /**
   * @param max The maximum amount of network bandwidth, in Gbps.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum amount of network bandwidth, in Gbps.
   * If this parameter is not specified, there is no minimum limit.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnLaunchTemplate.NetworkBandwidthGbpsProperty = cdkBuilder.build()
}
