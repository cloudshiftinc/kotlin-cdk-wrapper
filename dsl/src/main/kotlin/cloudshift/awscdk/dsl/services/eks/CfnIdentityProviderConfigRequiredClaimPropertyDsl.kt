@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig

@CdkDslMarker
public class CfnIdentityProviderConfigRequiredClaimPropertyDsl {
  private val cdkBuilder: CfnIdentityProviderConfig.RequiredClaimProperty.Builder =
      CfnIdentityProviderConfig.RequiredClaimProperty.builder()

  /**
   * @param key The key to match from the token. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value for the key from the token. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnIdentityProviderConfig.RequiredClaimProperty = cdkBuilder.build()
}
