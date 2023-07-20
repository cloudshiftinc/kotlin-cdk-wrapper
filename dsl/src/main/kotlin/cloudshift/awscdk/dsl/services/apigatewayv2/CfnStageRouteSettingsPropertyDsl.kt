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

  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
    cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
  }

  public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
    cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
  }

  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
  }

  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  public fun build(): CfnStage.RouteSettingsProperty = cdkBuilder.build()
}
