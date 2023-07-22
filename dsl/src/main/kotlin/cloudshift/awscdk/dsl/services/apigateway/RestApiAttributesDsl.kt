@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.RestApiAttributes

@CdkDslMarker
public class RestApiAttributesDsl {
  private val cdkBuilder: RestApiAttributes.Builder = RestApiAttributes.builder()

  /**
   * @param restApiId The ID of the API Gateway RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * @param restApiName The name of the API Gateway RestApi.
   */
  public fun restApiName(restApiName: String) {
    cdkBuilder.restApiName(restApiName)
  }

  /**
   * @param rootResourceId The resource ID of the root resource. 
   */
  public fun rootResourceId(rootResourceId: String) {
    cdkBuilder.rootResourceId(rootResourceId)
  }

  public fun build(): RestApiAttributes = cdkBuilder.build()
}
