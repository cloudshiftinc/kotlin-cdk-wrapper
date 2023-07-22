@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.ResponseType
import software.constructs.Construct

/**
 * Configure the response received by clients, produced from the API Gateway backend.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * ResponseType responseType;
 * RestApi restApi;
 * GatewayResponse gatewayResponse = GatewayResponse.Builder.create(this, "MyGatewayResponse")
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
public class GatewayResponseDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: GatewayResponse.Builder = GatewayResponse.Builder.create(scope, id)

  /**
   * Custom headers parameters for response.
   *
   * Default: - no headers
   *
   * @param responseHeaders Custom headers parameters for response. 
   */
  public fun responseHeaders(responseHeaders: Map<String, String>) {
    cdkBuilder.responseHeaders(responseHeaders)
  }

  /**
   * Rest api resource to target.
   *
   * @param restApi Rest api resource to target. 
   */
  public fun restApi(restApi: IRestApi) {
    cdkBuilder.restApi(restApi)
  }

  /**
   * Http status code for response.
   *
   * Default: - standard http status code for the response type.
   *
   * @param statusCode Http status code for response. 
   */
  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  /**
   * Custom templates to get mapped as response.
   *
   * Default: - Response from api will be returned without applying any transformation.
   *
   * @param templates Custom templates to get mapped as response. 
   */
  public fun templates(templates: Map<String, String>) {
    cdkBuilder.templates(templates)
  }

  /**
   * Response type to associate with gateway response.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html)
   * @param type Response type to associate with gateway response. 
   */
  public fun type(type: ResponseType) {
    cdkBuilder.type(type)
  }

  public fun build(): GatewayResponse = cdkBuilder.build()
}
