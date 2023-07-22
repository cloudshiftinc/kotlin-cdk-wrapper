@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@CdkDslMarker
public class CfnFeatureGroupFeatureDefinitionPropertyDsl {
  private val cdkBuilder: CfnFeatureGroup.FeatureDefinitionProperty.Builder =
      CfnFeatureGroup.FeatureDefinitionProperty.builder()

  /**
   * @param featureName The name of a feature. 
   * The type must be a string. `FeatureName` cannot be any of the following: `is_deleted` ,
   * `write_time` , `api_invocation_time` .
   */
  public fun featureName(featureName: String) {
    cdkBuilder.featureName(featureName)
  }

  /**
   * @param featureType The value type of a feature. 
   * Valid values are Integral, Fractional, or String.
   */
  public fun featureType(featureType: String) {
    cdkBuilder.featureType(featureType)
  }

  public fun build(): CfnFeatureGroup.FeatureDefinitionProperty = cdkBuilder.build()
}
