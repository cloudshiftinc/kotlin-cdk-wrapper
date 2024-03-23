@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * // production stage
 * LogGroup prodLogGroup = new LogGroup(this, "PrdLogs");
 * RestApi api = RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new LogGroupLogDestination(prodLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
 * .build())
 * .build();
 * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
 * // development stage
 * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
 * Stage.Builder.create(this, "dev")
 * .deployment(deployment)
 * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
 * .caller(false)
 * .httpMethod(true)
 * .ip(true)
 * .protocol(true)
 * .requestTime(true)
 * .resourcePath(true)
 * .responseLength(true)
 * .status(true)
 * .user(true)
 * .build()))
 * .build();
 * ```
 */
public interface StageProps : StageOptions {
  /**
   * The deployment that this stage points to [disable-awslint:ref-via-interface].
   */
  public fun deployment(): Deployment

  /**
   * A builder for [StageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLogDestination The CloudWatch Logs log group or Firehose delivery stream where
     * to write access logs.
     */
    public fun accessLogDestination(accessLogDestination: IAccessLogDestination)

    /**
     * @param accessLogFormat A single line format of access logs of data, as specified by selected
     * $content variables.
     * The format must include either `AccessLogFormat.contextRequestId()`
     * or `AccessLogFormat.contextExtendedRequestId()`.
     */
    public fun accessLogFormat(accessLogFormat: AccessLogFormat)

    /**
     * @param cacheClusterEnabled Indicates whether cache clustering is enabled for the stage.
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    /**
     * @param cacheClusterSize The stage's cache cluster size.
     */
    public fun cacheClusterSize(cacheClusterSize: String)

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
     * @param clientCertificateId The identifier of the client certificate that API Gateway uses to
     * call your integration endpoints in the stage.
     */
    public fun clientCertificateId(clientCertificateId: String)

    /**
     * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method.
     * When enabled, API gateway will log the full API requests and responses.
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
     * We recommend that you don't enable this feature for production APIs.
     */
    public fun dataTraceEnabled(dataTraceEnabled: Boolean)

    /**
     * @param deployment The deployment that this stage points to
     * [disable-awslint:ref-via-interface]. 
     */
    public fun deployment(deployment: Deployment)

    /**
     * @param description A description of the purpose of the stage.
     */
    public fun description(description: String)

    /**
     * @param documentationVersion The version identifier of the API documentation snapshot.
     */
    public fun documentationVersion(documentationVersion: String)

    /**
     * @param loggingLevel Specifies the logging level for this method, which effects the log
     * entries pushed to Amazon CloudWatch Logs.
     */
    public fun loggingLevel(loggingLevel: MethodLoggingLevel)

    /**
     * @param methodOptions Method deployment options for specific resources/methods.
     * These will
     * override common options defined in `StageOptions#methodOptions`.
     */
    public fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>)

    /**
     * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
     * method.
     */
    public fun metricsEnabled(metricsEnabled: Boolean)

    /**
     * @param stageName The name of the stage, which API Gateway uses as the first path segment in
     * the invoked Uniform Resource Identifier (URI).
     */
    public fun stageName(stageName: String)

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

    /**
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this method.
     */
    public fun tracingEnabled(tracingEnabled: Boolean)

    /**
     * @param variables A map that defines the stage variables.
     * Variable names must consist of
     * alphanumeric characters, and the values must match the following regular
     * expression: [A-Za-z0-9-._~:/?#&amp;=,]+.
     */
    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.StageProps.Builder =
        software.amazon.awscdk.services.apigateway.StageProps.builder()

    /**
     * @param accessLogDestination The CloudWatch Logs log group or Firehose delivery stream where
     * to write access logs.
     */
    override fun accessLogDestination(accessLogDestination: IAccessLogDestination) {
      cdkBuilder.accessLogDestination(accessLogDestination.let(IAccessLogDestination::unwrap))
    }

    /**
     * @param accessLogFormat A single line format of access logs of data, as specified by selected
     * $content variables.
     * The format must include either `AccessLogFormat.contextRequestId()`
     * or `AccessLogFormat.contextExtendedRequestId()`.
     */
    override fun accessLogFormat(accessLogFormat: AccessLogFormat) {
      cdkBuilder.accessLogFormat(accessLogFormat.let(AccessLogFormat::unwrap))
    }

    /**
     * @param cacheClusterEnabled Indicates whether cache clustering is enabled for the stage.
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    /**
     * @param cacheClusterSize The stage's cache cluster size.
     */
    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

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
     * @param clientCertificateId The identifier of the client certificate that API Gateway uses to
     * call your integration endpoints in the stage.
     */
    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
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
     * @param deployment The deployment that this stage points to
     * [disable-awslint:ref-via-interface]. 
     */
    override fun deployment(deployment: Deployment) {
      cdkBuilder.deployment(deployment.let(Deployment::unwrap))
    }

    /**
     * @param description A description of the purpose of the stage.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param documentationVersion The version identifier of the API documentation snapshot.
     */
    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    /**
     * @param loggingLevel Specifies the logging level for this method, which effects the log
     * entries pushed to Amazon CloudWatch Logs.
     */
    override fun loggingLevel(loggingLevel: MethodLoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(MethodLoggingLevel::unwrap))
    }

    /**
     * @param methodOptions Method deployment options for specific resources/methods.
     * These will
     * override common options defined in `StageOptions#methodOptions`.
     */
    override fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>) {
      cdkBuilder.methodOptions(methodOptions.mapValues{MethodDeploymentOptions.unwrap(it.value)})
    }

    /**
     * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
     * method.
     */
    override fun metricsEnabled(metricsEnabled: Boolean) {
      cdkBuilder.metricsEnabled(metricsEnabled)
    }

    /**
     * @param stageName The name of the stage, which API Gateway uses as the first path segment in
     * the invoked Uniform Resource Identifier (URI).
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
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

    /**
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this method.
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    /**
     * @param variables A map that defines the stage variables.
     * Variable names must consist of
     * alphanumeric characters, and the values must match the following regular
     * expression: [A-Za-z0-9-._~:/?#&amp;=,]+.
     */
    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.StageProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.StageProps,
  ) : CdkObject(cdkObject), StageProps {
    /**
     * The CloudWatch Logs log group or Firehose delivery stream where to write access logs.
     *
     * Default: - No destination
     */
    override fun accessLogDestination(): IAccessLogDestination? =
        unwrap(this).getAccessLogDestination()?.let(IAccessLogDestination::wrap)

    /**
     * A single line format of access logs of data, as specified by selected $content variables.
     *
     * The format must include either `AccessLogFormat.contextRequestId()`
     * or `AccessLogFormat.contextExtendedRequestId()`.
     *
     * Default: - Common Log Format
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
     */
    override fun accessLogFormat(): AccessLogFormat? =
        unwrap(this).getAccessLogFormat()?.let(AccessLogFormat::wrap)

    /**
     * Indicates whether cache clustering is enabled for the stage.
     *
     * Default: - Disabled for the stage.
     */
    override fun cacheClusterEnabled(): Boolean? = unwrap(this).getCacheClusterEnabled()

    /**
     * The stage's cache cluster size.
     *
     * Default: 0.5
     */
    override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

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
     * The identifier of the client certificate that API Gateway uses to call your integration
     * endpoints in the stage.
     *
     * Default: - None.
     */
    override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

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
     * The deployment that this stage points to [disable-awslint:ref-via-interface].
     */
    override fun deployment(): Deployment = unwrap(this).getDeployment().let(Deployment::wrap)

    /**
     * A description of the purpose of the stage.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The version identifier of the API documentation snapshot.
     *
     * Default: - No documentation version.
     */
    override fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

    /**
     * Specifies the logging level for this method, which effects the log entries pushed to Amazon
     * CloudWatch Logs.
     *
     * Default: - Off
     */
    override fun loggingLevel(): MethodLoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

    /**
     * Method deployment options for specific resources/methods.
     *
     * These will
     * override common options defined in `StageOptions#methodOptions`.
     *
     * Default: - Common options will be used.
     */
    override fun methodOptions(): Map<String, MethodDeploymentOptions> =
        unwrap(this).getMethodOptions()?.mapValues{MethodDeploymentOptions.wrap(it.value)} ?:
        emptyMap()

    /**
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     *
     * Default: false
     */
    override fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked
     * Uniform Resource Identifier (URI).
     *
     * Default: - "prod"
     */
    override fun stageName(): String? = unwrap(this).getStageName()

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

    /**
     * Specifies whether Amazon X-Ray tracing is enabled for this method.
     *
     * Default: false
     */
    override fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()

    /**
     * A map that defines the stage variables.
     *
     * Variable names must consist of
     * alphanumeric characters, and the values must match the following regular
     * expression: [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * Default: - No stage variables.
     */
    override fun variables(): Map<String, String> = unwrap(this).getVariables() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StageProps): StageProps
        = CdkObjectWrappers.wrap(cdkObject) as? StageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageProps): software.amazon.awscdk.services.apigateway.StageProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.StageProps
  }
}
