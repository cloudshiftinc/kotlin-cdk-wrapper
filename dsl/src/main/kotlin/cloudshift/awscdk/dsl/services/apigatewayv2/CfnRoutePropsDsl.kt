@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRouteProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRoutePropsDsl {
    private val cdkBuilder: CfnRouteProps.Builder = CfnRouteProps.builder()

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    public fun apiKeyRequired(apiKeyRequired: IResolvable) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    public fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
    }

    public fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
    }

    public fun modelSelectionExpression(modelSelectionExpression: String) {
        cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    public fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
    }

    public fun requestModels(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.requestModels(builder.map)
    }

    public fun requestModels(requestModels: Any) {
        cdkBuilder.requestModels(requestModels)
    }

    public fun requestParameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.requestParameters(builder.map)
    }

    public fun requestParameters(requestParameters: Any) {
        cdkBuilder.requestParameters(requestParameters)
    }

    public fun routeKey(routeKey: String) {
        cdkBuilder.routeKey(routeKey)
    }

    public fun routeResponseSelectionExpression(routeResponseSelectionExpression: String) {
        cdkBuilder.routeResponseSelectionExpression(routeResponseSelectionExpression)
    }

    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnRouteProps {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        return cdkBuilder.build()
    }
}
