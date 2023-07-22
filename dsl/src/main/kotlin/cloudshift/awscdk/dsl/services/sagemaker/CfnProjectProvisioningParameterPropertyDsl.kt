@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnProject

@CdkDslMarker
public class CfnProjectProvisioningParameterPropertyDsl {
  private val cdkBuilder: CfnProject.ProvisioningParameterProperty.Builder =
      CfnProject.ProvisioningParameterProperty.builder()

  /**
   * @param key The key that identifies a provisioning parameter. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of the provisioning parameter. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnProject.ProvisioningParameterProperty = cdkBuilder.build()
}
