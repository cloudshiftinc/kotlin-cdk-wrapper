@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentEndpointMetadataPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.EndpointMetadataProperty.Builder =
      CfnInferenceExperiment.EndpointMetadataProperty.builder()

  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  public fun endpointStatus(endpointStatus: String) {
    cdkBuilder.endpointStatus(endpointStatus)
  }

  public fun build(): CfnInferenceExperiment.EndpointMetadataProperty = cdkBuilder.build()
}
