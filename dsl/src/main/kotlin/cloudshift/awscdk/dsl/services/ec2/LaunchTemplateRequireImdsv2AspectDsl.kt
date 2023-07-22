@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect

/**
 * Aspect that applies IMDS configuration on EC2 Launch Template constructs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LaunchTemplateRequireImdsv2Aspect launchTemplateRequireImdsv2Aspect =
 * LaunchTemplateRequireImdsv2Aspect.Builder.create()
 * .suppressWarnings(false)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html)
 */
@CdkDslMarker
public class LaunchTemplateRequireImdsv2AspectDsl {
  private val cdkBuilder: LaunchTemplateRequireImdsv2Aspect.Builder =
      LaunchTemplateRequireImdsv2Aspect.Builder.create()

  /**
   * Whether warning annotations from this Aspect should be suppressed or not.
   *
   * Default: - false
   *
   * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
   * not. 
   */
  public fun suppressWarnings(suppressWarnings: Boolean) {
    cdkBuilder.suppressWarnings(suppressWarnings)
  }

  public fun build(): LaunchTemplateRequireImdsv2Aspect = cdkBuilder.build()
}
