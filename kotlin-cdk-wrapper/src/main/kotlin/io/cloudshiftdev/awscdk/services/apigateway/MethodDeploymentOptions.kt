@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

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
public interface MethodDeploymentOptions {
  /**
   * Indicates whether the cached responses are encrypted.
   *
   * Default: false
   */
  public fun cacheDataEncrypted(): Boolean? = unwrap(this).getCacheDataEncrypted()

  /**
   * Specifies the time to live (TTL), in seconds, for cached responses.
   *
   * The
   * higher the TTL, the longer the response will be cached.
   *
   * Default: Duration.minutes(5)
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
   */
  public fun cacheTtl(): Duration? = unwrap(this).getCacheTtl()?.let(Duration::wrap)

  /**
   * Specifies whether responses should be cached and returned for requests.
   *
   * A
   * cache cluster must be enabled on the stage for responses to be cached.
   *
   * Default: - Caching is Disabled.
   */
  public fun cachingEnabled(): Boolean? = unwrap(this).getCachingEnabled()

  /**
   * Specifies whether data trace logging is enabled for this method.
   *
   * When enabled, API gateway will log the full API requests and responses.
   * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
   * We recommend that you don't enable this feature for production APIs.
   *
   * Default: false
   */
  public fun dataTraceEnabled(): Boolean? = unwrap(this).getDataTraceEnabled()

  /**
   * Specifies the logging level for this method, which effects the log entries pushed to Amazon
   * CloudWatch Logs.
   *
   * Default: - Off
   */
  public fun loggingLevel(): MethodLoggingLevel? =
      unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

  /**
   * Specifies whether Amazon CloudWatch metrics are enabled for this method.
   *
   * Default: false
   */
  public fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

  /**
   * Specifies the throttling burst limit.
   *
   * The total rate of all requests in your AWS account is limited to 5,000 requests.
   *
   * Default: - No additional restriction.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
   */
  public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

  /**
   * Specifies the throttling rate limit.
   *
   * The total rate of all requests in your AWS account is limited to 10,000 requests per second
   * (rps).
   *
   * Default: - No additional restriction.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
   */
  public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

  /**
   * A builder for [MethodDeploymentOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
     */
    public fun cacheDataEncrypted(cacheDataEncrypted: Boolean)

    /**
     * @param cacheTtl Specifies the time to live (TTL), in seconds, for cached responses.
     * The
     * higher the TTL, the longer the response will be cached.
     */
    public fun cacheTtl(cacheTtl: Duration)

    /**
     * @param cachingEnabled Specifies whether responses should be cached and returned for requests.
     * A
     * cache cluster must be enabled on the stage for responses to be cached.
     */
    public fun cachingEnabled(cachingEnabled: Boolean)

    /**
     * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method.
     * When enabled, API gateway will log the full API requests and responses.
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
     * We recommend that you don't enable this feature for production APIs.
     */
    public fun dataTraceEnabled(dataTraceEnabled: Boolean)

    /**
     * @param loggingLevel Specifies the logging level for this method, which effects the log
     * entries pushed to Amazon CloudWatch Logs.
     */
    public fun loggingLevel(loggingLevel: MethodLoggingLevel)

    /**
     * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
     * method.
     */
    public fun metricsEnabled(metricsEnabled: Boolean)

    /**
     * @param throttlingBurstLimit Specifies the throttling burst limit.
     * The total rate of all requests in your AWS account is limited to 5,000 requests.
     */
    public fun throttlingBurstLimit(throttlingBurstLimit: Number)

    /**
     * @param throttlingRateLimit Specifies the throttling rate limit.
     * The total rate of all requests in your AWS account is limited to 10,000 requests per second
     * (rps).
     */
    public fun throttlingRateLimit(throttlingRateLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions.Builder =
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions.builder()

    /**
     * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
     */
    override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
    }

    /**
     * @param cacheTtl Specifies the time to live (TTL), in seconds, for cached responses.
     * The
     * higher the TTL, the longer the response will be cached.
     */
    override fun cacheTtl(cacheTtl: Duration) {
      cdkBuilder.cacheTtl(cacheTtl.let(Duration::unwrap))
    }

    /**
     * @param cachingEnabled Specifies whether responses should be cached and returned for requests.
     * A
     * cache cluster must be enabled on the stage for responses to be cached.
     */
    override fun cachingEnabled(cachingEnabled: Boolean) {
      cdkBuilder.cachingEnabled(cachingEnabled)
    }

    /**
     * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method.
     * When enabled, API gateway will log the full API requests and responses.
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
     * We recommend that you don't enable this feature for production APIs.
     */
    override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      cdkBuilder.dataTraceEnabled(dataTraceEnabled)
    }

    /**
     * @param loggingLevel Specifies the logging level for this method, which effects the log
     * entries pushed to Amazon CloudWatch Logs.
     */
    override fun loggingLevel(loggingLevel: MethodLoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(MethodLoggingLevel::unwrap))
    }

    /**
     * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
     * method.
     */
    override fun metricsEnabled(metricsEnabled: Boolean) {
      cdkBuilder.metricsEnabled(metricsEnabled)
    }

    /**
     * @param throttlingBurstLimit Specifies the throttling burst limit.
     * The total rate of all requests in your AWS account is limited to 5,000 requests.
     */
    override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
    }

    /**
     * @param throttlingRateLimit Specifies the throttling rate limit.
     * The total rate of all requests in your AWS account is limited to 10,000 requests per second
     * (rps).
     */
    override fun throttlingRateLimit(throttlingRateLimit: Number) {
      cdkBuilder.throttlingRateLimit(throttlingRateLimit)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MethodDeploymentOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MethodDeploymentOptions,
  ) : CdkObject(cdkObject), MethodDeploymentOptions {
    /**
     * Indicates whether the cached responses are encrypted.
     *
     * Default: false
     */
    override fun cacheDataEncrypted(): Boolean? = unwrap(this).getCacheDataEncrypted()

    /**
     * Specifies the time to live (TTL), in seconds, for cached responses.
     *
     * The
     * higher the TTL, the longer the response will be cached.
     *
     * Default: Duration.minutes(5)
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     */
    override fun cacheTtl(): Duration? = unwrap(this).getCacheTtl()?.let(Duration::wrap)

    /**
     * Specifies whether responses should be cached and returned for requests.
     *
     * A
     * cache cluster must be enabled on the stage for responses to be cached.
     *
     * Default: - Caching is Disabled.
     */
    override fun cachingEnabled(): Boolean? = unwrap(this).getCachingEnabled()

    /**
     * Specifies whether data trace logging is enabled for this method.
     *
     * When enabled, API gateway will log the full API requests and responses.
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
     * We recommend that you don't enable this feature for production APIs.
     *
     * Default: false
     */
    override fun dataTraceEnabled(): Boolean? = unwrap(this).getDataTraceEnabled()

    /**
     * Specifies the logging level for this method, which effects the log entries pushed to Amazon
     * CloudWatch Logs.
     *
     * Default: - Off
     */
    override fun loggingLevel(): MethodLoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

    /**
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     *
     * Default: false
     */
    override fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

    /**
     * Specifies the throttling burst limit.
     *
     * The total rate of all requests in your AWS account is limited to 5,000 requests.
     *
     * Default: - No additional restriction.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     */
    override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * Specifies the throttling rate limit.
     *
     * The total rate of all requests in your AWS account is limited to 10,000 requests per second
     * (rps).
     *
     * Default: - No additional restriction.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     */
    override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MethodDeploymentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodDeploymentOptions):
        MethodDeploymentOptions = CdkObjectWrappers.wrap(cdkObject) as MethodDeploymentOptions

    internal fun unwrap(wrapped: MethodDeploymentOptions):
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
  }
}
