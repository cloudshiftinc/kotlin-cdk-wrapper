@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

@CdkDslMarker
public class CfnApiGatewayManagedOverridesStageOverridesPropertyDsl {
  private val cdkBuilder: CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder =
      CfnApiGatewayManagedOverrides.StageOverridesProperty.builder()

  public fun accessLogSettings(accessLogSettings: IResolvable) {
    cdkBuilder.accessLogSettings(accessLogSettings)
  }

  public
      fun accessLogSettings(accessLogSettings: CfnApiGatewayManagedOverrides.AccessLogSettingsProperty) {
    cdkBuilder.accessLogSettings(accessLogSettings)
  }

  public fun autoDeploy(autoDeploy: Boolean) {
    cdkBuilder.autoDeploy(autoDeploy)
  }

  public fun autoDeploy(autoDeploy: IResolvable) {
    cdkBuilder.autoDeploy(autoDeploy)
  }

  public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  public
      fun defaultRouteSettings(defaultRouteSettings: CfnApiGatewayManagedOverrides.RouteSettingsProperty) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun routeSettings(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.routeSettings(builder.map)
  }

  public fun routeSettings(routeSettings: Any) {
    cdkBuilder.routeSettings(routeSettings)
  }

  public fun stageVariables(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.stageVariables(builder.map)
  }

  public fun stageVariables(stageVariables: Any) {
    cdkBuilder.stageVariables(stageVariables)
  }

  public fun build(): CfnApiGatewayManagedOverrides.StageOverridesProperty = cdkBuilder.build()
}
