@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.ResponseType

@CdkDslMarker
public class GatewayResponsePropsDsl {
  private val cdkBuilder: GatewayResponseProps.Builder = GatewayResponseProps.builder()

  /**
   * @param responseHeaders Custom headers parameters for response.
   */
  public fun responseHeaders(responseHeaders: Map<String, String>) {
    cdkBuilder.responseHeaders(responseHeaders)
  }

  /**
   * @param restApi Rest api resource to target. 
   */
  public fun restApi(restApi: IRestApi) {
    cdkBuilder.restApi(restApi)
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

  public fun build(): GatewayResponseProps = cdkBuilder.build()
}
