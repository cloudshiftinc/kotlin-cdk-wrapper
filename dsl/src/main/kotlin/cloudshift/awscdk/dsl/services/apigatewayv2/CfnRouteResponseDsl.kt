@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::RouteResponse` resource creates a route response for a WebSocket API.
 *
 * For more information, see [Set up Route Responses for a WebSocket API in API
 * Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-route-response.html)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object responseModels;
 * CfnRouteResponse cfnRouteResponse = CfnRouteResponse.Builder.create(this, "MyCfnRouteResponse")
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
public class CfnRouteResponseDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRouteResponse.Builder = CfnRouteResponse.Builder.create(scope, id)

  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid)
   * @param apiId The API identifier. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * The model selection expression for the route response.
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression)
   * @param modelSelectionExpression The model selection expression for the route response. 
   */
  public fun modelSelectionExpression(modelSelectionExpression: String) {
    cdkBuilder.modelSelectionExpression(modelSelectionExpression)
  }

  /**
   * The response models for the route response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels)
   * @param responseModels The response models for the route response. 
   */
  public fun responseModels(responseModels: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(responseModels)
    cdkBuilder.responseModels(builder.map)
  }

  /**
   * The response models for the route response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels)
   * @param responseModels The response models for the route response. 
   */
  public fun responseModels(responseModels: Any) {
    cdkBuilder.responseModels(responseModels)
  }

  /**
   * The route response parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
   * @param responseParameters The route response parameters. 
   */
  public fun responseParameters(responseParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(responseParameters)
    cdkBuilder.responseParameters(builder.map)
  }

  /**
   * The route response parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
   * @param responseParameters The route response parameters. 
   */
  public fun responseParameters(responseParameters: Map<String, Any>) {
    cdkBuilder.responseParameters(responseParameters)
  }

  /**
   * The route response parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
   * @param responseParameters The route response parameters. 
   */
  public fun responseParameters(responseParameters: IResolvable) {
    cdkBuilder.responseParameters(responseParameters)
  }

  /**
   * The route ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid)
   * @param routeId The route ID. 
   */
  public fun routeId(routeId: String) {
    cdkBuilder.routeId(routeId)
  }

  /**
   * The route response key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey)
   * @param routeResponseKey The route response key. 
   */
  public fun routeResponseKey(routeResponseKey: String) {
    cdkBuilder.routeResponseKey(routeResponseKey)
  }

  public fun build(): CfnRouteResponse = cdkBuilder.build()
}
