@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionModelQualityJobInputPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder =
      CfnModelQualityJobDefinition.ModelQualityJobInputProperty.builder()

  public fun batchTransformInput(batchTransformInput: IResolvable) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public
      fun batchTransformInput(batchTransformInput: CfnModelQualityJobDefinition.BatchTransformInputProperty) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public fun endpointInput(endpointInput: IResolvable) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun endpointInput(endpointInput: CfnModelQualityJobDefinition.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun groundTruthS3Input(groundTruthS3Input: IResolvable) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  public
      fun groundTruthS3Input(groundTruthS3Input: CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty) {
    cdkBuilder.groundTruthS3Input(groundTruthS3Input)
  }

  public fun build(): CfnModelQualityJobDefinition.ModelQualityJobInputProperty = cdkBuilder.build()
}
