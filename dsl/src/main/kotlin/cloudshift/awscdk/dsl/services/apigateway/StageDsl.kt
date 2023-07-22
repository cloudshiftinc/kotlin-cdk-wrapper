@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.AccessLogFormat
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.IAccessLogDestination
import software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
import software.amazon.awscdk.services.apigateway.MethodLoggingLevel
import software.amazon.awscdk.services.apigateway.Stage
import software.constructs.Construct

@CdkDslMarker
public class StageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Stage.Builder = Stage.Builder.create(scope, id)

  /**
   * The CloudWatch Logs log group.
   *
   * Default: - No destination
   *
   * @param accessLogDestination The CloudWatch Logs log group. 
   */
  public fun accessLogDestination(accessLogDestination: IAccessLogDestination) {
    cdkBuilder.accessLogDestination(accessLogDestination)
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
  public fun accessLogFormat(accessLogFormat: AccessLogFormat) {
    cdkBuilder.accessLogFormat(accessLogFormat)
  }

  /**
   * Indicates whether cache clustering is enabled for the stage.
   *
   * Default: - Disabled for the stage.
   *
   * @param cacheClusterEnabled Indicates whether cache clustering is enabled for the stage. 
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * The stage's cache cluster size.
   *
   * Default: 0.5
   *
   * @param cacheClusterSize The stage's cache cluster size. 
   */
  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  /**
   * Indicates whether the cached responses are encrypted.
   *
   * Default: false
   *
   * @param cacheDataEncrypted Indicates whether the cached responses are encrypted. 
   */
  public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
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
  public fun cacheTtl(cacheTtl: Duration) {
    cdkBuilder.cacheTtl(cacheTtl)
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
   */
  public fun cachingEnabled(cachingEnabled: Boolean) {
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
  public fun clientCertificateId(clientCertificateId: String) {
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
  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * The deployment that this stage points to [disable-awslint:ref-via-interface].
   *
   * @param deployment The deployment that this stage points to [disable-awslint:ref-via-interface].
   * 
   */
  public fun deployment(deployment: Deployment) {
    cdkBuilder.deployment(deployment)
  }

  /**
   * A description of the purpose of the stage.
   *
   * Default: - No description.
   *
   * @param description A description of the purpose of the stage. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The version identifier of the API documentation snapshot.
   *
   * Default: - No documentation version.
   *
   * @param documentationVersion The version identifier of the API documentation snapshot. 
   */
  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  /**
   * Specifies the logging level for this method, which effects the log entries pushed to Amazon
   * CloudWatch Logs.
   *
   * Default: - Off
   *
   * @param loggingLevel Specifies the logging level for this method, which effects the log entries
   * pushed to Amazon CloudWatch Logs. 
   */
  public fun loggingLevel(loggingLevel: MethodLoggingLevel) {
    cdkBuilder.loggingLevel(loggingLevel)
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
  public fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>) {
    cdkBuilder.methodOptions(methodOptions)
  }

  /**
   * Specifies whether Amazon CloudWatch metrics are enabled for this method.
   *
   * Default: false
   *
   * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this method. 
   */
  public fun metricsEnabled(metricsEnabled: Boolean) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  /**
   * The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform
   * Resource Identifier (URI).
   *
   * Default: - "prod"
   *
   * @param stageName The name of the stage, which API Gateway uses as the first path segment in the
   * invoked Uniform Resource Identifier (URI). 
   */
  public fun stageName(stageName: String) {
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
  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
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
  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  /**
   * Specifies whether Amazon X-Ray tracing is enabled for this method.
   *
   * Default: false
   *
   * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this method. 
   */
  public fun tracingEnabled(tracingEnabled: Boolean) {
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
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  public fun build(): Stage = cdkBuilder.build()
}
