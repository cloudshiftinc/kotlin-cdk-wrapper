@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-routesettings.html)
 */
@CdkDslMarker
public class CfnFunctionRouteSettingsPropertyDsl {
  private val cdkBuilder: CfnFunction.RouteSettingsProperty.Builder =
      CfnFunction.RouteSettingsProperty.builder()

  /**
   * @param dataTraceEnabled the value to be set.
   */
  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param dataTraceEnabled the value to be set.
   */
  public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param detailedMetricsEnabled the value to be set.
   */
  public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
    cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
  }

  /**
   * @param detailedMetricsEnabled the value to be set.
   */
  public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
    cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
  }

  /**
   * @param loggingLevel the value to be set.
   */
  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * @param throttlingBurstLimit the value to be set.
   */
  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
  }

  /**
   * @param throttlingRateLimit the value to be set.
   */
  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  public fun build(): CfnFunction.RouteSettingsProperty = cdkBuilder.build()
}
