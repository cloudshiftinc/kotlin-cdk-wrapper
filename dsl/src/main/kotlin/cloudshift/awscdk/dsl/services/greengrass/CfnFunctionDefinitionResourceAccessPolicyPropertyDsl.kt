@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@CdkDslMarker
public class CfnFunctionDefinitionResourceAccessPolicyPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinition.ResourceAccessPolicyProperty.Builder =
      CfnFunctionDefinition.ResourceAccessPolicyProperty.builder()

  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnFunctionDefinition.ResourceAccessPolicyProperty = cdkBuilder.build()
}
