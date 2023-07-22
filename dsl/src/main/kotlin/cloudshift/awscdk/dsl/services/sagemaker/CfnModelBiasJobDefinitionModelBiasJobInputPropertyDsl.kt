@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder =
      CfnModelBiasJobDefinition.ModelBiasJobInputProperty.builder()

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
      fun batchTransformInput(batchTransformInput: CfnModelBiasJobDefinition.BatchTransformInputProperty) {
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
  public fun endpointInput(endpointInput: CfnModelBiasJobDefinition.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  /**
   * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
   */
  public fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  /**
   * @param groundTruthS3Input Location of ground truth labels to use in model bias job. 
   */
  public
      fun groundTruthS3Input(groundTruthS3Input: CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  public fun build(): CfnModelBiasJobDefinition.ModelBiasJobInputProperty = cdkBuilder.build()
}
