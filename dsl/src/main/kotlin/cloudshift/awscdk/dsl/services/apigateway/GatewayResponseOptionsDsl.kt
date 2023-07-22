@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.GatewayResponseOptions
import software.amazon.awscdk.services.apigateway.ResponseType

@CdkDslMarker
public class GatewayResponseOptionsDsl {
  private val cdkBuilder: GatewayResponseOptions.Builder = GatewayResponseOptions.builder()

  /**
   * @param responseHeaders Custom headers parameters for response.
   */
  public fun responseHeaders(responseHeaders: Map<String, String>) {
    cdkBuilder.responseHeaders(responseHeaders)
  }

  /**
   * @param statusCode Http status code for response.
   */
  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  /**
   * @param templates Custom templates to get mapped as response.
   */
  public fun templates(templates: Map<String, String>) {
    cdkBuilder.templates(templates)
  }

  /**
   * @param type Response type to associate with gateway response. 
   */
  public fun type(type: ResponseType) {
    cdkBuilder.type(type)
  }

  public fun build(): GatewayResponseOptions = cdkBuilder.build()
}
