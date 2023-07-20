@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnResource
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResource.Builder = CfnResource.Builder.create(scope, id)

  public fun parentId(parentId: String) {
    cdkBuilder.parentId(parentId)
  }

  public fun pathPart(pathPart: String) {
    cdkBuilder.pathPart(pathPart)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnResource = cdkBuilder.build()
}
