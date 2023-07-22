@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps

@CdkDslMarker
public class CfnDocumentationVersionPropsDsl {
  private val cdkBuilder: CfnDocumentationVersionProps.Builder =
      CfnDocumentationVersionProps.builder()

  /**
   * @param description A description about the new documentation snapshot.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param documentationVersion The version identifier of the to-be-updated documentation version. 
   */
  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  /**
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnDocumentationVersionProps = cdkBuilder.build()
}
