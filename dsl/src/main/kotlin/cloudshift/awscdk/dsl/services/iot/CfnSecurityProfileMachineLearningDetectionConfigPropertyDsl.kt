@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

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
