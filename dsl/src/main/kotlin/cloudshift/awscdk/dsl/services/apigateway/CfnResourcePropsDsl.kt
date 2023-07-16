@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnResourceProps

@CdkDslMarker
public class CfnResourcePropsDsl {
  private val cdkBuilder: CfnResourceProps.Builder = CfnResourceProps.builder()

  public fun parentId(parentId: String) {
    cdkBuilder.parentId(parentId)
  }

  public fun pathPart(pathPart: String) {
    cdkBuilder.pathPart(pathPart)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnResourceProps = cdkBuilder.build()
}
