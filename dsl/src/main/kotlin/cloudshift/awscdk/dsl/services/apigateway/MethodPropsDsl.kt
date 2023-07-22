@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.MethodProps

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * Authorizer authorizer;
 * Integration integration;
 * Model model;
 * RequestValidator requestValidator;
 * Resource resource;
 * MethodProps methodProps = MethodProps.builder()
 * .httpMethod("httpMethod")
 * .resource(resource)
 * // the properties below are optional
 * .integration(integration)
 * .options(MethodOptions.builder()
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType(AuthorizationType.NONE)
 * .authorizer(authorizer)
 * .methodResponses(List.of(MethodResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", model))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build()))
 * .operationName("operationName")
 * .requestModels(Map.of(
 * "requestModelsKey", model))
 * .requestParameters(Map.of(
 * "requestParametersKey", false))
 * .requestValidator(requestValidator)
 * .requestValidatorOptions(RequestValidatorOptions.builder()
 * .requestValidatorName("requestValidatorName")
 * .validateRequestBody(false)
 * .validateRequestParameters(false)
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class MethodPropsDsl {
  private val cdkBuilder: MethodProps.Builder = MethodProps.builder()

  /**
   * @param httpMethod The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this
   * method. 
   */
  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * @param integration The backend system that the method calls when it receives a request.
   */
  public fun integration(integration: IntegrationDsl.() -> Unit = {}) {
    val builder = IntegrationDsl()
    builder.apply(integration)
    cdkBuilder.integration(builder.build())
  }

  /**
   * @param integration The backend system that the method calls when it receives a request.
   */
  public fun integration(integration: Integration) {
    cdkBuilder.integration(integration)
  }

  /**
   * @param options Method options.
   */
  public fun options(options: MethodOptionsDsl.() -> Unit = {}) {
    val builder = MethodOptionsDsl()
    builder.apply(options)
    cdkBuilder.options(builder.build())
  }

  /**
   * @param options Method options.
   */
  public fun options(options: MethodOptions) {
    cdkBuilder.options(options)
  }

  /**
   * @param resource The resource this method is associated with. 
   * For root resource methods,
   * specify the `RestApi` object.
   */
  public fun resource(resource: IResource) {
    cdkBuilder.resource(resource)
  }

  public fun build(): MethodProps = cdkBuilder.build()
}
