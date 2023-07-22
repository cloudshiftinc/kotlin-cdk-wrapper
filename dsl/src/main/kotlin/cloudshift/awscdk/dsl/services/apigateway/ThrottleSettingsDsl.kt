@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.apigateway.ThrottleSettings

/**
 * Container for defining throttling parameters to API stages or methods.
 *
 * Example:
 *
 * ```
 * LambdaIntegration integration;
 * RestApi api = new RestApi(this, "hello-api");
 * Resource v1 = api.root.addResource("v1");
 * Resource echo = v1.addResource("echo");
 * Method echoMethod = echo.addMethod("GET", integration,
 * MethodOptions.builder().apiKeyRequired(true).build());
 * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
 * .name("Easy")
 * .throttle(ThrottleSettings.builder()
 * .rateLimit(10)
 * .burstLimit(2)
 * .build())
 * .build());
 * IApiKey key = api.addApiKey("ApiKey");
 * plan.addApiKey(key);
 * ```
 */
@CdkDslMarker
public class ThrottleSettingsDsl {
  private val cdkBuilder: ThrottleSettings.Builder = ThrottleSettings.builder()

  /**
   * @param burstLimit The maximum API request rate limit over a time ranging from one to a few
   * seconds.
   */
  public fun burstLimit(burstLimit: Number) {
    cdkBuilder.burstLimit(burstLimit)
  }

  /**
   * @param rateLimit The API request steady-state rate limit (average requests per second over an
   * extended period of time).
   */
  public fun rateLimit(rateLimit: Number) {
    cdkBuilder.rateLimit(rateLimit)
  }

  public fun build(): ThrottleSettings = cdkBuilder.build()
}
