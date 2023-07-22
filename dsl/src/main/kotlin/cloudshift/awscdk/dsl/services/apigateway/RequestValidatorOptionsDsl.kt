@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions

/**
 * Example:
 *
 * ```
 * LambdaIntegration integration;
 * Resource resource;
 * Model responseModel;
 * Model errorResponseModel;
 * resource.addMethod("GET", integration, MethodOptions.builder()
 * // We can mark the parameters as required
 * .requestParameters(Map.of(
 * "method.request.querystring.who", true))
 * // we can set request validator options like below
 * .requestValidatorOptions(RequestValidatorOptions.builder()
 * .requestValidatorName("test-validator")
 * .validateRequestBody(true)
 * .validateRequestParameters(false)
 * .build())
 * .methodResponses(List.of(MethodResponse.builder()
 * // Successful response from the integration
 * .statusCode("200")
 * // Define what parameters are allowed or not
 * .responseParameters(Map.of(
 * "method.response.header.Content-Type", true,
 * "method.response.header.Access-Control-Allow-Origin", true,
 * "method.response.header.Access-Control-Allow-Credentials", true))
 * // Validate the schema on the response
 * .responseModels(Map.of(
 * "application/json", responseModel))
 * .build(), MethodResponse.builder()
 * // Same thing for the error responses
 * .statusCode("400")
 * .responseParameters(Map.of(
 * "method.response.header.Content-Type", true,
 * "method.response.header.Access-Control-Allow-Origin", true,
 * "method.response.header.Access-Control-Allow-Credentials", true))
 * .responseModels(Map.of(
 * "application/json", errorResponseModel))
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class RequestValidatorOptionsDsl {
  private val cdkBuilder: RequestValidatorOptions.Builder = RequestValidatorOptions.builder()

  /**
   * @param requestValidatorName The name of this request validator.
   */
  public fun requestValidatorName(requestValidatorName: String) {
    cdkBuilder.requestValidatorName(requestValidatorName)
  }

  /**
   * @param validateRequestBody Indicates whether to validate the request body according to the
   * configured schema for the targeted API and method.
   */
  public fun validateRequestBody(validateRequestBody: Boolean) {
    cdkBuilder.validateRequestBody(validateRequestBody)
  }

  /**
   * @param validateRequestParameters Indicates whether to validate request parameters.
   */
  public fun validateRequestParameters(validateRequestParameters: Boolean) {
    cdkBuilder.validateRequestParameters(validateRequestParameters)
  }

  public fun build(): RequestValidatorOptions = cdkBuilder.build()
}
