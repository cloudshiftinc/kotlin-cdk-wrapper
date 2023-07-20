@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnProject

@CdkDslMarker
public class CfnProjectServiceCatalogProvisionedProductDetailsPropertyDsl {
  private val cdkBuilder: CfnProject.ServiceCatalogProvisionedProductDetailsProperty.Builder =
      CfnProject.ServiceCatalogProvisionedProductDetailsProperty.builder()

  public fun provisionedProductId(provisionedProductId: String) {
    cdkBuilder.provisionedProductId(provisionedProductId)
  }

  public fun provisionedProductStatusMessage(provisionedProductStatusMessage: String) {
    cdkBuilder.provisionedProductStatusMessage(provisionedProductStatusMessage)
  }

  public fun build(): CfnProject.ServiceCatalogProvisionedProductDetailsProperty =
      cdkBuilder.build()
}
