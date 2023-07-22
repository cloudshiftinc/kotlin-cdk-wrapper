@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationObjectTypeMappingPropertyDsl {
  private val cdkBuilder: CfnIntegration.ObjectTypeMappingProperty.Builder =
      CfnIntegration.ObjectTypeMappingProperty.builder()

  /**
   * @param key The key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnIntegration.ObjectTypeMappingProperty = cdkBuilder.build()
}
