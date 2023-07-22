@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * The `MachineLearningDetectionConfig` property type controls confidence of the machine learning
 * model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * MachineLearningDetectionConfigProperty machineLearningDetectionConfigProperty =
 * MachineLearningDetectionConfigProperty.builder()
 * .confidenceLevel("confidenceLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-machinelearningdetectionconfig.html)
 */
@CdkDslMarker
public class CfnSecurityProfileMachineLearningDetectionConfigPropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.MachineLearningDetectionConfigProperty.Builder =
      CfnSecurityProfile.MachineLearningDetectionConfigProperty.builder()

  /**
   * @param confidenceLevel The model confidence level.
   * There are three levels of confidence, `"high"` , `"medium"` , and `"low"` .
   *
   * The higher the confidence level, the lower the sensitivity, and the lower the alarm frequency
   * will be.
   */
  public fun confidenceLevel(confidenceLevel: String) {
    cdkBuilder.confidenceLevel(confidenceLevel)
  }

  public fun build(): CfnSecurityProfile.MachineLearningDetectionConfigProperty = cdkBuilder.build()
}
