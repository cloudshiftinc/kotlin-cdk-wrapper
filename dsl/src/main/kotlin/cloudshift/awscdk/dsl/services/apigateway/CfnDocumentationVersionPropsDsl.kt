@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps

@CdkDslMarker
public class CfnDocumentationVersionPropsDsl {
  private val cdkBuilder: CfnDocumentationVersionProps.Builder =
      CfnDocumentationVersionProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnDocumentationVersionProps = cdkBuilder.build()
}
