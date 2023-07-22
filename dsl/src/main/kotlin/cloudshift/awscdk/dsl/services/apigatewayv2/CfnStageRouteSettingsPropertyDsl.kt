@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnStage

@CdkDslMarker
public class CfnStageRouteSettingsPropertyDsl {
  private val cdkBuilder: CfnStage.RouteSettingsProperty.Builder =
      CfnStage.RouteSettingsProperty.builder()

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

  public fun build(): CfnStage.RouteSettingsProperty = cdkBuilder.build()
}
