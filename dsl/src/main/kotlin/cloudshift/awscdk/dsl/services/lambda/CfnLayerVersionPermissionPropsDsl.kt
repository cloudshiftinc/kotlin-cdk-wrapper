@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps

@CdkDslMarker
public class CfnLayerVersionPermissionPropsDsl {
  private val cdkBuilder: CfnLayerVersionPermissionProps.Builder =
      CfnLayerVersionPermissionProps.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun layerVersionArn(layerVersionArn: String) {
    cdkBuilder.layerVersionArn(layerVersionArn)
  }

  public fun organizationId(organizationId: String) {
    cdkBuilder.organizationId(organizationId)
  }

  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun build(): CfnLayerVersionPermissionProps = cdkBuilder.build()
}
