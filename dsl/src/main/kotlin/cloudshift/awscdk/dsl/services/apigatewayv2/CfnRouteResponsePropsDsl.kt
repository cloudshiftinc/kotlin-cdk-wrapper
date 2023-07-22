@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps

/**
 * Properties for defining a `CfnRouteResponse`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object responseModels;
 * CfnRouteResponseProps cfnRouteResponseProps = CfnRouteResponseProps.builder()
 * .apiId("apiId")
 * .routeId("routeId")
 * .routeResponseKey("routeResponseKey")
 * // the properties below are optional
 * .modelSelectionExpression("modelSelectionExpression")
 * .responseModels(responseModels)
 * .responseParameters(Map.of(
 * "responseParametersKey", ParameterConstraintsProperty.builder()
 * .required(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html)
 */
@CdkDslMarker
public class CfnRouteResponsePropsDsl {
  private val cdkBuilder: CfnRouteResponseProps.Builder = CfnRouteResponseProps.builder()

  /**
   * @param apiId The API identifier. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param modelSelectionExpression The model selection expression for the route response.
   * Supported only for WebSocket APIs.
   */
  public fun modelSelectionExpression(modelSelectionExpression: String) {
    cdkBuilder.modelSelectionExpression(modelSelectionExpression)
  }

  /**
   * @param responseModels The response models for the route response.
   */
  public fun responseModels(responseModels: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(responseModels)
    cdkBuilder.responseModels(builder.map)
  }

  /**
   * @param responseModels The response models for the route response.
   */
  public fun responseModels(responseModels: Any) {
    cdkBuilder.responseModels(responseModels)
  }

  /**
   * @param responseParameters The route response parameters.
   */
  public fun responseParameters(responseParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(responseParameters)
    cdkBuilder.responseParameters(builder.map)
  }

  /**
   * @param responseParameters The route response parameters.
   */
  public fun responseParameters(responseParameters: Map<String, Any>) {
    cdkBuilder.responseParameters(responseParameters)
  }

  /**
   * @param responseParameters The route response parameters.
   */
  public fun responseParameters(responseParameters: IResolvable) {
    cdkBuilder.responseParameters(responseParameters)
  }

  /**
   * @param routeId The route ID. 
   */
  public fun routeId(routeId: String) {
    cdkBuilder.routeId(routeId)
  }

  /**
   * @param routeResponseKey The route response key. 
   */
  public fun routeResponseKey(routeResponseKey: String) {
    cdkBuilder.routeResponseKey(routeResponseKey)
  }

  public fun build(): CfnRouteResponseProps = cdkBuilder.build()
}
