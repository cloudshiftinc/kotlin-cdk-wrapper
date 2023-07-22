@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate

/**
 * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
 *
 * Outputs that use this feature incur pro-tier pricing. For information about feature limitations,
 * For more information, see [Job Limitations for Accelerated Transcoding in AWS Elemental
 * MediaConvert](https://docs.aws.amazon.com/mediaconvert/latest/ug/job-requirements.html) in the *AWS
 * Elemental MediaConvert User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconvert.*;
 * AccelerationSettingsProperty accelerationSettingsProperty =
 * AccelerationSettingsProperty.builder()
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html)
 */
@CdkDslMarker
public class CfnJobTemplateAccelerationSettingsPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.AccelerationSettingsProperty.Builder =
      CfnJobTemplate.AccelerationSettingsProperty.builder()

  /**
   * @param mode Specify the conditions when the service will run your job with accelerated
   * transcoding. 
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnJobTemplate.AccelerationSettingsProperty = cdkBuilder.build()
}
