@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod

/**
 * Represents a method response of a given HTTP status code returned to the client.
 *
 * The method response is passed from the back end through the associated integration response that
 * can be transformed using a mapping template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * MethodResponseProperty methodResponseProperty = MethodResponseProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", "responseModels"))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html)
 */
@CdkDslMarker
public class CfnMethodMethodResponsePropertyDsl {
  private val cdkBuilder: CfnMethod.MethodResponseProperty.Builder =
      CfnMethod.MethodResponseProperty.builder()

  /**
   * @param responseModels Specifies the Model resources used for the response's content-type.
   * Response models are represented as a key/value map, with a content-type as the key and a Model
   * name as the value.
   */
  public fun responseModels(responseModels: Map<String, String>) {
    cdkBuilder.responseModels(responseModels)
  }

  /**
   * @param responseModels Specifies the Model resources used for the response's content-type.
   * Response models are represented as a key/value map, with a content-type as the key and a Model
   * name as the value.
   */
  public fun responseModels(responseModels: IResolvable) {
    cdkBuilder.responseModels(responseModels)
  }

  /**
   * @param responseParameters A key-value map specifying required or optional response parameters
   * that API Gateway can send back to the caller.
   * A key defines a method response header and the value specifies whether the associated method
   * response header is required or not. The expression of the key must match the pattern
   * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
   * passes certain integration response data to the method response headers specified here according
   * to the mapping you prescribe in the API's IntegrationResponse. The integration response data that
   * can be mapped include an integration response header expressed in
   * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
   * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the form
   * of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid JSON
   * expression without the `$` prefix.)
   */
  public fun responseParameters(responseParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(responseParameters)
    cdkBuilder.responseParameters(builder.map)
  }

  /**
   * @param responseParameters A key-value map specifying required or optional response parameters
   * that API Gateway can send back to the caller.
   * A key defines a method response header and the value specifies whether the associated method
   * response header is required or not. The expression of the key must match the pattern
   * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
   * passes certain integration response data to the method response headers specified here according
   * to the mapping you prescribe in the API's IntegrationResponse. The integration response data that
   * can be mapped include an integration response header expressed in
   * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
   * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the form
   * of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid JSON
   * expression without the `$` prefix.)
   */
  public fun responseParameters(responseParameters: Map<String, Any>) {
    cdkBuilder.responseParameters(responseParameters)
  }

  /**
   * @param responseParameters A key-value map specifying required or optional response parameters
   * that API Gateway can send back to the caller.
   * A key defines a method response header and the value specifies whether the associated method
   * response header is required or not. The expression of the key must match the pattern
   * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
   * passes certain integration response data to the method response headers specified here according
   * to the mapping you prescribe in the API's IntegrationResponse. The integration response data that
   * can be mapped include an integration response header expressed in
   * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
   * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the form
   * of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid JSON
   * expression without the `$` prefix.)
   */
  public fun responseParameters(responseParameters: IResolvable) {
    cdkBuilder.responseParameters(responseParameters)
  }

  /**
   * @param statusCode The method response's status code. 
   */
  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CfnMethod.MethodResponseProperty = cdkBuilder.build()
}
