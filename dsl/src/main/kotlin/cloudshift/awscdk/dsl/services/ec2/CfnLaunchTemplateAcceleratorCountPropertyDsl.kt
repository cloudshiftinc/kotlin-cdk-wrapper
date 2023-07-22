@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateAcceleratorCountPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.AcceleratorCountProperty.Builder =
      CfnLaunchTemplate.AcceleratorCountProperty.builder()

  /**
   * @param max The maximum number of accelerators.
   * To specify no maximum limit, omit this parameter. To exclude accelerator-enabled instance
   * types, set `Max` to `0` .
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum number of accelerators.
   * To specify no minimum limit, omit this parameter.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnLaunchTemplate.AcceleratorCountProperty = cdkBuilder.build()
}
