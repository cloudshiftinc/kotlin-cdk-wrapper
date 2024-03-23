@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class Stage(
  cdkObject: software.amazon.awscdk.services.apigateway.Stage,
) : StageBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StageProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.Stage(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(StageProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StageProps.Builder.() -> Unit,
  ) : this(scope, id, StageProps(props)
  )

  /**
   * RestApi to which this stage is associated.
   */
  public override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

  /**
   * Name of this stage.
   */
  public override fun stageName(): String = unwrap(this).getStageName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.Stage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CloudWatch Logs log group or Firehose delivery stream where to write access logs.
     *
     * Default: - No destination
     *
     * @param accessLogDestination The CloudWatch Logs log group or Firehose delivery stream where
     * to write access logs. 
     */
    public fun accessLogDestination(accessLogDestination: IAccessLogDestination)

    /**
     * A single line format of access logs of data, as specified by selected $content variables.
     *
     * The format must include either `AccessLogFormat.contextRequestId()`
     * or `AccessLogFormat.contextExtendedRequestId()`.
     *
     * Default: - Common Log Format
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
     * @param accessLogFormat A single line format of access logs of data, as specified by selected
     * $content variables. 
     */
    public fun accessLogFormat(accessLogFormat: AccessLogFormat)

    /**
     * Indicates whether cache clustering is enabled for the stage.
     *
     * Default: - Disabled for the stage.
     *
     * @param cacheClusterEnabled Indicates whether cache clustering is enabled for the stage. 
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    /**
     * The stage's cache cluster size.
     *
     * Default: 0.5
     *
     * @param cacheClusterSize The stage's cache cluster size. 
     */
    public fun cacheClusterSize(cacheClusterSize: String)

    /**
     * Indicates whether the cached responses are encrypted.
     *
     * Default: false
     *
     * @param cacheDataEncrypted Indicates whether the cached responses are encrypted. 
     */
    public fun cacheDataEncrypted(cacheDataEncrypted: Boolean)

    /**
     * Specifies the time to live (TTL), in seconds, for cached responses.
     *
     * The
     * higher the TTL, the longer the response will be cached.
     *
     * Default: Duration.minutes(5)
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * @param cacheTtl Specifies the time to live (TTL), in seconds, for cached responses. 
     */
    public fun cacheTtl(cacheTtl: Duration)

    /**
     * Specifies whether responses should be cached and returned for requests.
     *
     * A
     * cache cluster must be enabled on the stage for responses to be cached.
     *
     * Default: - Caching is Disabled.
     *
     * @param cachingEnabled Specifies whether responses should be cached and returned for requests.
     * 
     */
    public fun cachingEnabled(cachingEnabled: Boolean)

    /**
     * The identifier of the client certificate that API Gateway uses to call your integration
     * endpoints in the stage.
     *
     * Default: - None.
     *
     * @param clientCertificateId The identifier of the client certificate that API Gateway uses to
     * call your integration endpoints in the stage. 
     */
    public fun clientCertificateId(clientCertificateId: String)

    /**
     * Specifies whether data trace logging is enabled for this method.
     *
     * When enabled, API gateway will log the full API requests and responses.
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
     * We recommend that you don't enable this feature for production APIs.
     *
     * Default: false
     *
     * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method. 
     */
    public fun dataTraceEnabled(dataTraceEnabled: Boolean)

    /**
     * The deployment that this stage points to [disable-awslint:ref-via-interface].
     *
     * @param deployment The deployment that this stage points to
     * [disable-awslint:ref-via-interface]. 
     */
    public fun deployment(deployment: Deployment)

    /**
     * A description of the purpose of the stage.
     *
     * Default: - No description.
     *
     * @param description A description of the purpose of the stage. 
     */
    public fun description(description: String)

    /**
     * The version identifier of the API documentation snapshot.
     *
     * Default: - No documentation version.
     *
     * @param documentationVersion The version identifier of the API documentation snapshot. 
     */
    public fun documentationVersion(documentationVersion: String)

    /**
     * Specifies the logging level for this method, which effects the log entries pushed to Amazon
     * CloudWatch Logs.
     *
     * Default: - Off
     *
     * @param loggingLevel Specifies the logging level for this method, which effects the log
     * entries pushed to Amazon CloudWatch Logs. 
     */
    public fun loggingLevel(loggingLevel: MethodLoggingLevel)

    /**
     * Method deployment options for specific resources/methods.
     *
     * These will
     * override common options defined in `StageOptions#methodOptions`.
     *
     * Default: - Common options will be used.
     *
     * @param methodOptions Method deployment options for specific resources/methods. 
     */
    public fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>)

    /**
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     *
     * Default: false
     *
     * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
     * method. 
     */
    public fun metricsEnabled(metricsEnabled: Boolean)

    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked
     * Uniform Resource Identifier (URI).
     *
     * Default: - "prod"
     *
     * @param stageName The name of the stage, which API Gateway uses as the first path segment in
     * the invoked Uniform Resource Identifier (URI). 
     */
    public fun stageName(stageName: String)

    /**
     * Specifies the throttling burst limit.
     *
     * The total rate of all requests in your AWS account is limited to 5,000 requests.
     *
     * Default: - No additional restriction.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     * @param throttlingBurstLimit Specifies the throttling burst limit. 
     */
    public fun throttlingBurstLimit(throttlingBurstLimit: Number)

    /**
     * Specifies the throttling rate limit.
     *
     * The total rate of all requests in your AWS account is limited to 10,000 requests per second
     * (rps).
     *
     * Default: - No additional restriction.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     * @param throttlingRateLimit Specifies the throttling rate limit. 
     */
    public fun throttlingRateLimit(throttlingRateLimit: Number)

    /**
     * Specifies whether Amazon X-Ray tracing is enabled for this method.
     *
     * Default: false
     *
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this method. 
     */
    public fun tracingEnabled(tracingEnabled: Boolean)

    /**
     * A map that defines the stage variables.
     *
     * Variable names must consist of
     * alphanumeric characters, and the values must match the following regular
     * expression: [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * Default: - No stage variables.
     *
     * @param variables A map that defines the stage variables. 
     */
    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Stage.Builder =
        software.amazon.awscdk.services.apigateway.Stage.Builder.create(scope, id)

    /**
     * The CloudWatch Logs log group or Firehose delivery stream where to write access logs.
     *
     * Default: - No destination
     *
     * @param accessLogDestination The CloudWatch Logs log group or Firehose delivery stream where
     * to write access logs. 
     */
    override fun accessLogDestination(accessLogDestination: IAccessLogDestination) {
      cdkBuilder.accessLogDestination(accessLogDestination.let(IAccessLogDestination::unwrap))
    }

    /**
     * A single line format of access logs of data, as specified by selected $content variables.
     *
     * The format must include either `AccessLogFormat.contextRequestId()`
     * or `AccessLogFormat.contextExtendedRequestId()`.
     *
     * Default: - Common Log Format
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
     * @param accessLogFormat A single line format of access logs of data, as specified by selected
     * $content variables. 
     */
    override fun accessLogFormat(accessLogFormat: AccessLogFormat) {
      cdkBuilder.accessLogFormat(accessLogFormat.let(AccessLogFormat::unwrap))
    }

    /**
     * Indicates whether cache clustering is enabled for the stage.
     *
     * Default: - Disabled for the stage.
     *
     * @param cacheClusterEnabled Indicates whether cache clustering is enabled for the stage. 
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    /**
     * The stage's cache cluster size.
     *
     * Default: 0.5
     *
     * @param cacheClusterSize The stage's cache cluster size. 
     */
    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    /**
     * Indicates whether the cached responses are encrypted.
     *
     * Default: false
     *
     * @param cacheDataEncrypted Indicates whether the cached responses are encrypted. 
     */
    override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
    }

    /**
     * Specifies the time to live (TTL), in seconds, for cached responses.
     *
     * The
     * higher the TTL, the longer the response will be cached.
     *
     * Default: Duration.minutes(5)
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * @param cacheTtl Specifies the time to live (TTL), in seconds, for cached responses. 
     */
    override fun cacheTtl(cacheTtl: Duration) {
      cdkBuilder.cacheTtl(cacheTtl.let(Duration::unwrap))
    }

    /**
     * Specifies whether responses should be cached and returned for requests.
     *
     * A
     * cache cluster must be enabled on the stage for responses to be cached.
     *
     * Default: - Caching is Disabled.
     *
     * @param cachingEnabled Specifies whether responses should be cached and returned for requests.
     * 
     */
    override fun cachingEnabled(cachingEnabled: Boolean) {
      cdkBuilder.cachingEnabled(cachingEnabled)
    }

    /**
     * The identifier of the client certificate that API Gateway uses to call your integration
     * endpoints in the stage.
     *
     * Default: - None.
     *
     * @param clientCertificateId The identifier of the client certificate that API Gateway uses to
     * call your integration endpoints in the stage. 
     */
    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    /**
     * Specifies whether data trace logging is enabled for this method.
     *
     * When enabled, API gateway will log the full API requests and responses.
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data.
     * We recommend that you don't enable this feature for production APIs.
     *
     * Default: false
     *
     * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method. 
     */
    override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      cdkBuilder.dataTraceEnabled(dataTraceEnabled)
    }

    /**
     * The deployment that this stage points to [disable-awslint:ref-via-interface].
     *
     * @param deployment The deployment that this stage points to
     * [disable-awslint:ref-via-interface]. 
     */
    override fun deployment(deployment: Deployment) {
      cdkBuilder.deployment(deployment.let(Deployment::unwrap))
    }

    /**
     * A description of the purpose of the stage.
     *
     * Default: - No description.
     *
     * @param description A description of the purpose of the stage. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The version identifier of the API documentation snapshot.
     *
     * Default: - No documentation version.
     *
     * @param documentationVersion The version identifier of the API documentation snapshot. 
     */
    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    /**
     * Specifies the logging level for this method, which effects the log entries pushed to Amazon
     * CloudWatch Logs.
     *
     * Default: - Off
     *
     * @param loggingLevel Specifies the logging level for this method, which effects the log
     * entries pushed to Amazon CloudWatch Logs. 
     */
    override fun loggingLevel(loggingLevel: MethodLoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(MethodLoggingLevel::unwrap))
    }

    /**
     * Method deployment options for specific resources/methods.
     *
     * These will
     * override common options defined in `StageOptions#methodOptions`.
     *
     * Default: - Common options will be used.
     *
     * @param methodOptions Method deployment options for specific resources/methods. 
     */
    override fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>) {
      cdkBuilder.methodOptions(methodOptions.mapValues{MethodDeploymentOptions.unwrap(it.value)})
    }

    /**
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     *
     * Default: false
     *
     * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
     * method. 
     */
    override fun metricsEnabled(metricsEnabled: Boolean) {
      cdkBuilder.metricsEnabled(metricsEnabled)
    }

    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked
     * Uniform Resource Identifier (URI).
     *
     * Default: - "prod"
     *
     * @param stageName The name of the stage, which API Gateway uses as the first path segment in
     * the invoked Uniform Resource Identifier (URI). 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * Specifies the throttling burst limit.
     *
     * The total rate of all requests in your AWS account is limited to 5,000 requests.
     *
     * Default: - No additional restriction.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     * @param throttlingBurstLimit Specifies the throttling burst limit. 
     */
    override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
    }

    /**
     * Specifies the throttling rate limit.
     *
     * The total rate of all requests in your AWS account is limited to 10,000 requests per second
     * (rps).
     *
     * Default: - No additional restriction.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     * @param throttlingRateLimit Specifies the throttling rate limit. 
     */
    override fun throttlingRateLimit(throttlingRateLimit: Number) {
      cdkBuilder.throttlingRateLimit(throttlingRateLimit)
    }

    /**
     * Specifies whether Amazon X-Ray tracing is enabled for this method.
     *
     * Default: false
     *
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this method. 
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    /**
     * A map that defines the stage variables.
     *
     * Variable names must consist of
     * alphanumeric characters, and the values must match the following regular
     * expression: [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * Default: - No stage variables.
     *
     * @param variables A map that defines the stage variables. 
     */
    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.Stage = cdkBuilder.build()
  }

  public companion object {
    public fun fromStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StageAttributes,
    ): IStage =
        software.amazon.awscdk.services.apigateway.Stage.fromStageAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(StageAttributes::unwrap)).let(IStage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26f85f62b6b121d2eb080deabbc661cdeca521904896bc79d1304ec45a54aa08")
    public fun fromStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StageAttributes.Builder.() -> Unit,
    ): IStage = fromStageAttributes(scope, id, StageAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Stage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Stage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Stage): Stage =
        Stage(cdkObject)

    internal fun unwrap(wrapped: Stage): software.amazon.awscdk.services.apigateway.Stage =
        wrapped.cdkObject as software.amazon.awscdk.services.apigateway.Stage
  }
}
