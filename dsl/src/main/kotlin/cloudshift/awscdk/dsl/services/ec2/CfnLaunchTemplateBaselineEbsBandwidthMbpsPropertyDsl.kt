@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateBaselineEbsBandwidthMbpsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.Builder =
      CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.builder()

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

  public fun build(): CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty = cdkBuilder.build()
}
