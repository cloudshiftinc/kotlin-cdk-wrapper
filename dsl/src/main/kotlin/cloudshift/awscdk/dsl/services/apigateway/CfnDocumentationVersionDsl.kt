@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnDocumentationVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDocumentationVersion.Builder =
      CfnDocumentationVersion.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnDocumentationVersion = cdkBuilder.build()
}
