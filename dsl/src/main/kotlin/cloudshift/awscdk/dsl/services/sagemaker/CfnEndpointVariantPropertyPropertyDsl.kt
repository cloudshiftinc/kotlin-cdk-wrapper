@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointVariantPropertyPropertyDsl {
  private val cdkBuilder: CfnEndpoint.VariantPropertyProperty.Builder =
      CfnEndpoint.VariantPropertyProperty.builder()

  /**
   * @param variantPropertyType The type of variant property. The supported values are:.
   * * `DesiredInstanceCount` : Overrides the existing variant instance counts using the
   * [InitialInstanceCount](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialInstanceCount)
   * values in the
   * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
   * .
   * * `DesiredWeight` : Overrides the existing variant weights using the
   * [InitialVariantWeight](https://docs.aws.amazon.com/sagemaker/latest/dg/API_ProductionVariant.html#SageMaker-Type-ProductionVariant-InitialVariantWeight)
   * values in the
   * [ProductionVariants](https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html#SageMaker-CreateEndpointConfig-request-ProductionVariants)
   * .
   * * `DataCaptureConfig` : (Not currently supported.)
   */
  public fun variantPropertyType(variantPropertyType: String) {
    cdkBuilder.variantPropertyType(variantPropertyType)
  }

  public fun build(): CfnEndpoint.VariantPropertyProperty = cdkBuilder.build()
}
