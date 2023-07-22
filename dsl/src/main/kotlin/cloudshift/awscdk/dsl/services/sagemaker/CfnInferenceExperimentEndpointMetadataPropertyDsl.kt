@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentEndpointMetadataPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.EndpointMetadataProperty.Builder =
      CfnInferenceExperiment.EndpointMetadataProperty.builder()

  /**
   * @param endpointConfigName The name of the endpoint configuration.
   */
  public fun endpointConfigName(endpointConfigName: String) {
    cdkBuilder.endpointConfigName(endpointConfigName)
  }

  /**
   * @param endpointName The name of the endpoint. 
   */
  public fun endpointName(endpointName: String) {
    cdkBuilder.endpointName(endpointName)
  }

  /**
   * @param endpointStatus The status of the endpoint.
   * For possible values of the status of an endpoint, see
   * [](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-endpointmetadata.html#cfn-sagemaker-inferenceexperiment-endpointmetadata-endpointstatus)
   * .
   */
  public fun endpointStatus(endpointStatus: String) {
    cdkBuilder.endpointStatus(endpointStatus)
  }

  public fun build(): CfnInferenceExperiment.EndpointMetadataProperty = cdkBuilder.build()
}
