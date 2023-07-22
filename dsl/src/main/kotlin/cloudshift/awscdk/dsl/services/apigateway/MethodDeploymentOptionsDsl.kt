@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
import software.amazon.awscdk.services.apigateway.MethodLoggingLevel

/**
 * Example:
 *
 * ```
 * RestApi api = new RestApi(this, "books");
 * Deployment deployment = Deployment.Builder.create(this, "my-deployment").api(api).build();
 * Stage stage = Stage.Builder.create(this, "my-stage")
 * .deployment(deployment)
 * .methodOptions(Map.of(
 * "/ *&#47;*", MethodDeploymentOptions.builder() // This special path applies to all resource paths
 * and all HTTP methods
 * .throttlingRateLimit(100)
 * .throttlingBurstLimit(200).build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class MethodDeploymentOptionsDsl {
  private val cdkBuilder: MethodDeploymentOptions.Builder = MethodDeploymentOptions.builder()

  /**
   * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
   */
  public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  /**
   * @param cacheTtl Specifies the time to live (TTL), in seconds, for cached responses.
   * The
   * higher the TTL, the longer the response will be cached.
   */
  public fun cacheTtl(cacheTtl: Duration) {
    cdkBuilder.cacheTtl(cacheTtl)
  }

  /**
   * @param cachingEnabled Specifies whether responses should be cached and returned for requests.
   * A
   * cache cluster must be enabled on the stage for responses to be cached.
   */
  public fun cachingEnabled(cachingEnabled: Boolean) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  /**
   * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method.
   * When enabled, API gateway will log the full API requests and responses.
   * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
   * We recommend that you don't enable this feature for production APIs.
   */
  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param loggingLevel Specifies the logging level for this method, which effects the log entries
   * pushed to Amazon CloudWatch Logs.
   */
  public fun loggingLevel(loggingLevel: MethodLoggingLevel) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this method.
   */
  public fun metricsEnabled(metricsEnabled: Boolean) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  /**
   * @param throttlingBurstLimit Specifies the throttling burst limit.
   * The total rate of all requests in your AWS account is limited to 5,000 requests.
   */
  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
  }

  /**
   * @param throttlingRateLimit Specifies the throttling rate limit.
   * The total rate of all requests in your AWS account is limited to 10,000 requests per second
   * (rps).
   */
  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  public fun build(): MethodDeploymentOptions = cdkBuilder.build()
}
