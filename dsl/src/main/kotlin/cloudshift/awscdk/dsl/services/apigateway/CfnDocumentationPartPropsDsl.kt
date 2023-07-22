@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps

@CdkDslMarker
public class CfnDocumentationPartPropsDsl {
  private val cdkBuilder: CfnDocumentationPartProps.Builder = CfnDocumentationPartProps.builder()

  /**
   * @param location The location of the targeted API entity of the to-be-created documentation
   * part. 
   */
  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  /**
   * @param location The location of the targeted API entity of the to-be-created documentation
   * part. 
   */
  public fun location(location: CfnDocumentationPart.LocationProperty) {
    cdkBuilder.location(location)
  }

  /**
   * @param properties The new documentation content map of the targeted API entity. 
   * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
   * exported and, hence, published.
   */
  public fun properties(properties: String) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnDocumentationPartProps = cdkBuilder.build()
}
