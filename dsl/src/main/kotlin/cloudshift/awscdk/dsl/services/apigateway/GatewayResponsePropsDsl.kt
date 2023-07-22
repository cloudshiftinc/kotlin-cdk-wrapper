@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.ResponseType

/**
 * Properties for a new gateway response.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * ResponseType responseType;
 * RestApi restApi;
 * GatewayResponseProps gatewayResponseProps = GatewayResponseProps.builder()
 * .restApi(restApi)
 * .type(responseType)
 * // the properties below are optional
 * .responseHeaders(Map.of(
 * "responseHeadersKey", "responseHeaders"))
 * .statusCode("statusCode")
 * .templates(Map.of(
 * "templatesKey", "templates"))
 * .build();
 * ```
 */
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
