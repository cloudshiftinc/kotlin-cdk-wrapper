@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder =
      CfnModelQualityJobDefinition.ModelQualityJobInputProperty.builder()

  /**
   * @param batchTransformInput The batch transform input for a monitoring job.
   */
  public fun batchTransformInput(batchTransformInput: IResolvable) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  /**
   * @param batchTransformInput The batch transform input for a monitoring job.
   */
  public
      fun batchTransformInput(batchTransformInput: CfnModelQualityJobDefinition.BatchTransformInputProperty) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  /**
   * @param endpointInput Input object for the endpoint.
   */
  public fun endpointInput(endpointInput: IResolvable) {
    cdkBuilder.endpointInput(endpointInput)
  }

  /**
   * @param endpointInput Input object for the endpoint.
   */
  public fun endpointInput(endpointInput: CfnModelQualityJobDefinition.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  /**
   * @param groundTruthS3Input The ground truth label provided for the model. 
   */
  public fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  /**
   * @param groundTruthS3Input The ground truth label provided for the model. 
   */
  public
      fun groundTruthS3Input(groundTruthS3Input: CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  public fun build(): CfnModelQualityJobDefinition.ModelQualityJobInputProperty = cdkBuilder.build()
}
