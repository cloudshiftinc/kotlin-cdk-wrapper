@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionModelExplainabilityJobInputPropertyDsl {
  private val cdkBuilder:
      CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder =
      CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.builder()

  public fun batchTransformInput(batchTransformInput: IResolvable) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public
      fun batchTransformInput(batchTransformInput: CfnModelExplainabilityJobDefinition.BatchTransformInputProperty) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public fun endpointInput(endpointInput: IResolvable) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public
      fun endpointInput(endpointInput: CfnModelExplainabilityJobDefinition.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty =
      cdkBuilder.build()
}
