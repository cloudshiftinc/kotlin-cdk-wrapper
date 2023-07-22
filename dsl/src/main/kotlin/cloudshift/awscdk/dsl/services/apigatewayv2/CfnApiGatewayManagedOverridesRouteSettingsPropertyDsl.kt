@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

/**
 * The `RouteSettings` property overrides the route settings for an API Gateway-managed route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html)
 */
@CdkDslMarker
public class CfnApiGatewayManagedOverridesRouteSettingsPropertyDsl {
  private val cdkBuilder: CfnApiGatewayManagedOverrides.RouteSettingsProperty.Builder =
      CfnApiGatewayManagedOverrides.RouteSettingsProperty.builder()

  /**
   * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging is
   * enabled for this route.
   * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
   * WebSocket APIs.
   */
  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging is
   * enabled for this route.
   * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
   * WebSocket APIs.
   */
  public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
   */
  public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
    cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
  }

  /**
   * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
   */
  public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
    cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
  }

  /**
   * @param loggingLevel Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF` .
   * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
   * WebSocket APIs.
   */
  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * @param throttlingBurstLimit Specifies the throttling burst limit.
   */
  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
  }

  /**
   * @param throttlingRateLimit Specifies the throttling rate limit.
   */
  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  public fun build(): CfnApiGatewayManagedOverrides.RouteSettingsProperty = cdkBuilder.build()
}
