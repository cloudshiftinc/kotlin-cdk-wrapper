@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@CdkDslMarker
public class CfnFunctionDefinitionResourceAccessPolicyPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinition.ResourceAccessPolicyProperty.Builder =
      CfnFunctionDefinition.ResourceAccessPolicyProperty.builder()

  /**
   * @param permission The read-only or read-write access that the Lambda function has to the
   * resource.
   * Valid values are `ro` or `rw` .
   */
  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  /**
   * @param resourceId The ID of the resource. 
   * This ID is assigned to the resource when you create the resource definition.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnFunctionDefinition.ResourceAccessPolicyProperty = cdkBuilder.build()
}
