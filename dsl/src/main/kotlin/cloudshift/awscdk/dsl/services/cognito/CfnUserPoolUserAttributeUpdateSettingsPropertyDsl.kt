@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolUserAttributeUpdateSettingsPropertyDsl {
  private val cdkBuilder: CfnUserPool.UserAttributeUpdateSettingsProperty.Builder =
      CfnUserPool.UserAttributeUpdateSettingsProperty.builder()

  private val _attributesRequireVerificationBeforeUpdate: MutableList<String> = mutableListOf()

  public fun attributesRequireVerificationBeforeUpdate(vararg
      attributesRequireVerificationBeforeUpdate: String) {
    _attributesRequireVerificationBeforeUpdate.addAll(listOf(*attributesRequireVerificationBeforeUpdate))
  }

  public
      fun attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate: Collection<String>) {
    _attributesRequireVerificationBeforeUpdate.addAll(attributesRequireVerificationBeforeUpdate)
  }

  public fun build(): CfnUserPool.UserAttributeUpdateSettingsProperty {
    if(_attributesRequireVerificationBeforeUpdate.isNotEmpty())
        cdkBuilder.attributesRequireVerificationBeforeUpdate(_attributesRequireVerificationBeforeUpdate)
    return cdkBuilder.build()
  }
}
