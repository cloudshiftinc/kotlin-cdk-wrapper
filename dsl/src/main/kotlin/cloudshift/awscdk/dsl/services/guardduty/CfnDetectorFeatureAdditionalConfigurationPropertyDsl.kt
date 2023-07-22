@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.guardduty.CfnDetector

@CdkDslMarker
public class CfnDetectorFeatureAdditionalConfigurationPropertyDsl {
  private val cdkBuilder: CfnDetector.FeatureAdditionalConfigurationProperty.Builder =
      CfnDetector.FeatureAdditionalConfigurationProperty.builder()

  /**
   * @param name Name of the additional configuration of a feature.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param status Status of the additional configuration of a feature.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnDetector.FeatureAdditionalConfigurationProperty = cdkBuilder.build()
}
