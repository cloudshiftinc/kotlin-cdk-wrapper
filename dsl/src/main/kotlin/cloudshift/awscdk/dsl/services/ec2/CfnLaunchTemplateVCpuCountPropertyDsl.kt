@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * The minimum and maximum number of vCPUs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VCpuCountProperty vCpuCountProperty = VCpuCountProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-vcpucount.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateVCpuCountPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.VCpuCountProperty.Builder =
      CfnLaunchTemplate.VCpuCountProperty.builder()

  /**
   * @param max The maximum number of vCPUs.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum number of vCPUs.
   * To specify no minimum limit, specify `0` .
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnLaunchTemplate.VCpuCountProperty = cdkBuilder.build()
}
