@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRoute
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::Route` resource creates a route for an API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object requestModels;
 * Object requestParameters;
 * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
 * .apiId("apiId")
 * .routeKey("routeKey")
 * // the properties below are optional
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType("authorizationType")
 * .authorizerId("authorizerId")
 * .modelSelectionExpression("modelSelectionExpression")
 * .operationName("operationName")
 * .requestModels(requestModels)
 * .requestParameters(requestParameters)
 * .routeResponseSelectionExpression("routeResponseSelectionExpression")
 * .target("target")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html)
 */
@CdkDslMarker
public class CfnRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRoute.Builder = CfnRoute.Builder.create(scope, id)

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apiid)
     *
     * @param apiId The API identifier.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * Specifies whether an API key is required for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired)
     *
     * @param apiKeyRequired Specifies whether an API key is required for the route.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * Specifies whether an API key is required for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired)
     *
     * @param apiKeyRequired Specifies whether an API key is required for the route.
     */
    public fun apiKeyRequired(apiKeyRequired: IResolvable) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * The authorization scopes supported by this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes)
     *
     * @param authorizationScopes The authorization scopes supported by this route.
     */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /**
     * The authorization scopes supported by this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes)
     *
     * @param authorizationScopes The authorization scopes supported by this route.
     */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /**
     * The authorization type for the route.
     *
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM
     * permissions, and `CUSTOM` for using a Lambda authorizer. For HTTP APIs, valid values are
     * `NONE` for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM
     * permissions, and `CUSTOM` for using a Lambda authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype)
     *
     * @param authorizationType The authorization type for the route.
     */
    public fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * The identifier of the `Authorizer` resource to be associated with this route.
     *
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizerid)
     *
     * @param authorizerId The identifier of the `Authorizer` resource to be associated with this
     *   route.
     */
    public fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
    }

    /**
     * The model selection expression for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-modelselectionexpression)
     *
     * @param modelSelectionExpression The model selection expression for the route.
     */
    public fun modelSelectionExpression(modelSelectionExpression: String) {
        cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    /**
     * The operation name for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-operationname)
     *
     * @param operationName The operation name for the route.
     */
    public fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
    }

    /**
     * The request models for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels)
     *
     * @param requestModels The request models for the route.
     */
    public fun requestModels(requestModels: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(requestModels)
        cdkBuilder.requestModels(builder.map)
    }

    /**
     * The request models for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels)
     *
     * @param requestModels The request models for the route.
     */
    public fun requestModels(requestModels: Any) {
        cdkBuilder.requestModels(requestModels)
    }

    /**
     * The request parameters for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters)
     *
     * @param requestParameters The request parameters for the route.
     */
    public fun requestParameters(requestParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(requestParameters)
        cdkBuilder.requestParameters(builder.map)
    }

    /**
     * The request parameters for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters)
     *
     * @param requestParameters The request parameters for the route.
     */
    public fun requestParameters(requestParameters: Any) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * The route key for the route.
     *
     * For HTTP APIs, the route key can be either `$default` , or a combination of an HTTP method
     * and resource path, for example, `GET /pets` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routekey)
     *
     * @param routeKey The route key for the route.
     */
    public fun routeKey(routeKey: String) {
        cdkBuilder.routeKey(routeKey)
    }

    /**
     * The route response selection expression for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routeresponseselectionexpression)
     *
     * @param routeResponseSelectionExpression The route response selection expression for the
     *   route.
     */
    public fun routeResponseSelectionExpression(routeResponseSelectionExpression: String) {
        cdkBuilder.routeResponseSelectionExpression(routeResponseSelectionExpression)
    }

    /**
     * The target for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-target)
     *
     * @param target The target for the route.
     */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnRoute {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        return cdkBuilder.build()
    }
}
