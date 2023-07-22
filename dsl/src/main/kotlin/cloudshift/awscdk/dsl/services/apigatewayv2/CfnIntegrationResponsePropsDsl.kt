@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps

@CdkDslMarker
public class CfnIntegrationResponsePropsDsl {
  private val cdkBuilder: CfnIntegrationResponseProps.Builder =
      CfnIntegrationResponseProps.builder()

  /**
   * @param apiId The API identifier. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param contentHandlingStrategy Supported only for WebSocket APIs.
   * Specifies how to handle response payload content type conversions. Supported values are
   * `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following behaviors:
   *
   * `CONVERT_TO_BINARY` : Converts a response payload from a Base64-encoded string to the
   * corresponding binary blob.
   *
   * `CONVERT_TO_TEXT` : Converts a response payload from a binary blob to a Base64-encoded string.
   *
   * If this property is not defined, the response payload will be passed through from the
   * integration response to the route response or method response without modification.
   */
  public fun contentHandlingStrategy(contentHandlingStrategy: String) {
    cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
  }

  /**
   * @param integrationId The integration ID. 
   */
  public fun integrationId(integrationId: String) {
    cdkBuilder.integrationId(integrationId)
  }

  /**
   * @param integrationResponseKey The integration response key. 
   */
  public fun integrationResponseKey(integrationResponseKey: String) {
    cdkBuilder.integrationResponseKey(integrationResponseKey)
  }

  /**
   * @param responseParameters A key-value map specifying response parameters that are passed to the
   * method response from the backend.
   * The key is a method response header parameter name and the mapped value is an integration
   * response header value, a static value enclosed within a pair of single quotes, or a JSON
   * expression from the integration response body. The mapping key must match the pattern of
   * `method.response.header. *{name}*` , where name is a valid and unique header name. The mapped
   * non-static value must match the pattern of `integration.response.header. *{name}*` or
   * `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and unique response
   * header name and `*{JSON-expression}*` is a valid JSON expression without the `$` prefix.
   */
  public fun responseParameters(responseParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(responseParameters)
    cdkBuilder.responseParameters(builder.map)
  }

  /**
   * @param responseParameters A key-value map specifying response parameters that are passed to the
   * method response from the backend.
   * The key is a method response header parameter name and the mapped value is an integration
   * response header value, a static value enclosed within a pair of single quotes, or a JSON
   * expression from the integration response body. The mapping key must match the pattern of
   * `method.response.header. *{name}*` , where name is a valid and unique header name. The mapped
   * non-static value must match the pattern of `integration.response.header. *{name}*` or
   * `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and unique response
   * header name and `*{JSON-expression}*` is a valid JSON expression without the `$` prefix.
   */
  public fun responseParameters(responseParameters: Any) {
    cdkBuilder.responseParameters(responseParameters)
  }

  /**
   * @param responseTemplates The collection of response templates for the integration response as a
   * string-to-string map of key-value pairs.
   * Response templates are represented as a key/value map, with a content-type as the key and a
   * template as the value.
   */
  public fun responseTemplates(responseTemplates: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(responseTemplates)
    cdkBuilder.responseTemplates(builder.map)
  }

  /**
   * @param responseTemplates The collection of response templates for the integration response as a
   * string-to-string map of key-value pairs.
   * Response templates are represented as a key/value map, with a content-type as the key and a
   * template as the value.
   */
  public fun responseTemplates(responseTemplates: Any) {
    cdkBuilder.responseTemplates(responseTemplates)
  }

  /**
   * @param templateSelectionExpression The template selection expression for the integration
   * response.
   * Supported only for WebSocket APIs.
   */
  public fun templateSelectionExpression(templateSelectionExpression: String) {
    cdkBuilder.templateSelectionExpression(templateSelectionExpression)
  }

  public fun build(): CfnIntegrationResponseProps = cdkBuilder.build()
}
