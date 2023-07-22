@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct

@CdkDslMarker
public class CfnCloudFormationProvisionedProductProvisioningParameterPropertyDsl {
  private val cdkBuilder: CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.Builder
      = CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.builder()

  /**
   * @param key The parameter key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The parameter value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty =
      cdkBuilder.build()
}
