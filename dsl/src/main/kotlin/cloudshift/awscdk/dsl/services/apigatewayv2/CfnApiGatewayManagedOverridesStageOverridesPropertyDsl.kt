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

  /**
   * @param accessLogSettings Settings for logging access in a stage.
   */
  public fun accessLogSettings(accessLogSettings: IResolvable) {
    cdkBuilder.accessLogSettings(accessLogSettings)
  }

  /**
   * @param accessLogSettings Settings for logging access in a stage.
   */
  public
      fun accessLogSettings(accessLogSettings: CfnApiGatewayManagedOverrides.AccessLogSettingsProperty) {
    cdkBuilder.accessLogSettings(accessLogSettings)
  }

  /**
   * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
   * The default value is `true` .
   */
  public fun autoDeploy(autoDeploy: Boolean) {
    cdkBuilder.autoDeploy(autoDeploy)
  }

  /**
   * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
   * The default value is `true` .
   */
  public fun autoDeploy(autoDeploy: IResolvable) {
    cdkBuilder.autoDeploy(autoDeploy)
  }

  /**
   * @param defaultRouteSettings The default route settings for the stage.
   */
  public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * @param defaultRouteSettings The default route settings for the stage.
   */
  public
      fun defaultRouteSettings(defaultRouteSettings: CfnApiGatewayManagedOverrides.RouteSettingsProperty) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * @param description The description for the API stage.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param routeSettings Route settings for the stage.
   */
  public fun routeSettings(routeSettings: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(routeSettings)
    cdkBuilder.routeSettings(builder.map)
  }

  /**
   * @param routeSettings Route settings for the stage.
   */
  public fun routeSettings(routeSettings: Any) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * @param stageVariables A map that defines the stage variables for a `Stage` .
   * Variable names can have alphanumeric and underscore characters, and the values must match
   * [A-Za-z0-9-._~:/?#&amp;=,]+.
   */
  public fun stageVariables(stageVariables: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(stageVariables)
    cdkBuilder.stageVariables(builder.map)
  }

  /**
   * @param stageVariables A map that defines the stage variables for a `Stage` .
   * Variable names can have alphanumeric and underscore characters, and the values must match
   * [A-Za-z0-9-._~:/?#&amp;=,]+.
   */
  public fun stageVariables(stageVariables: Any) {
    cdkBuilder.stageVariables(stageVariables)
  }

  public fun build(): CfnApiGatewayManagedOverrides.StageOverridesProperty = cdkBuilder.build()
}
