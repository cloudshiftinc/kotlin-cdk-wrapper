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

@CdkDslMarker
public class CfnRouteResponseDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRouteResponse.Builder = CfnRouteResponse.Builder.create(scope, id)

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun modelSelectionExpression(modelSelectionExpression: String) {
    cdkBuilder.modelSelectionExpression(modelSelectionExpression)
  }

  public fun responseModels(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.responseModels(builder.map)
  }

  public fun responseModels(responseModels: Any) {
    cdkBuilder.responseModels(responseModels)
  }

  public fun responseParameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.responseParameters(builder.map)
  }

  public fun responseParameters(responseParameters: Map<String, *>) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun responseParameters(responseParameters: IResolvable) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun routeId(routeId: String) {
    cdkBuilder.routeId(routeId)
  }

  public fun routeResponseKey(routeResponseKey: String) {
    cdkBuilder.routeResponseKey(routeResponseKey)
  }

  public fun build(): CfnRouteResponse = cdkBuilder.build()
}
