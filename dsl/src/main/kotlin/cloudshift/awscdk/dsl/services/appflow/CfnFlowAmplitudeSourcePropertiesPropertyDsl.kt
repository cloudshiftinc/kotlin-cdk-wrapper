@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowAmplitudeSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.AmplitudeSourcePropertiesProperty.Builder =
      CfnFlow.AmplitudeSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the Amplitude flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.AmplitudeSourcePropertiesProperty = cdkBuilder.build()
}
