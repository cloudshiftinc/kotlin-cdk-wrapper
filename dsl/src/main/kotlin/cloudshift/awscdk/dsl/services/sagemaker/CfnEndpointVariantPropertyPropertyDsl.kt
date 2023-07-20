@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointVariantPropertyPropertyDsl {
  private val cdkBuilder: CfnEndpoint.VariantPropertyProperty.Builder =
      CfnEndpoint.VariantPropertyProperty.builder()

  public fun variantPropertyType(variantPropertyType: String) {
    cdkBuilder.variantPropertyType(variantPropertyType)
  }

  public fun build(): CfnEndpoint.VariantPropertyProperty = cdkBuilder.build()
}
