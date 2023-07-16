@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionModelBiasJobInputPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder =
      CfnModelBiasJobDefinition.ModelBiasJobInputProperty.builder()

  public fun batchTransformInput(batchTransformInput: IResolvable) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public
      fun batchTransformInput(batchTransformInput: CfnModelBiasJobDefinition.BatchTransformInputProperty) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public fun endpointInput(endpointInput: IResolvable) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun endpointInput(endpointInput: CfnModelBiasJobDefinition.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  public
      fun groundTruthS3Input(groundTruthS3Input: CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  public fun build(): CfnModelBiasJobDefinition.ModelBiasJobInputProperty = cdkBuilder.build()
}
