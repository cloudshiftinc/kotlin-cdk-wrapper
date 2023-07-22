@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionDataQualityJobInputPropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder =
      CfnDataQualityJobDefinition.DataQualityJobInputProperty.builder()

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
      fun batchTransformInput(batchTransformInput: CfnDataQualityJobDefinition.BatchTransformInputProperty) {
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
  public fun endpointInput(endpointInput: CfnDataQualityJobDefinition.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun build(): CfnDataQualityJobDefinition.DataQualityJobInputProperty = cdkBuilder.build()
}
