@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetBaselineEbsBandwidthMbpsRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty.Builder =
      CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty.builder()

  /**
   * @param max The maximum baseline bandwidth, in Mbps.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum baseline bandwidth, in Mbps.
   * To specify no minimum limit, omit this parameter.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty = cdkBuilder.build()
}
