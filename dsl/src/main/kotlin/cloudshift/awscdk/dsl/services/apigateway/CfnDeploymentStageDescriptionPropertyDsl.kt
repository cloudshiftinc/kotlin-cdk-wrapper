@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment

@CdkDslMarker
public class CfnDeploymentStageDescriptionPropertyDsl {
  private val cdkBuilder: CfnDeployment.StageDescriptionProperty.Builder =
      CfnDeployment.StageDescriptionProperty.builder()

  private val _methodSettings: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accessLogSetting Specifies settings for logging access in this stage.
   */
  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * @param accessLogSetting Specifies settings for logging access in this stage.
   */
  public fun accessLogSetting(accessLogSetting: CfnDeployment.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * @param cacheClusterSize The size of the stage's cache cluster.
   * For more information, see
   * [cacheClusterSize](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateStage.html#apigw-CreateStage-request-cacheClusterSize)
   * in the *API Gateway API Reference* .
   */
  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  /**
   * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
   */
  public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  /**
   * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
   */
  public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  /**
   * @param cacheTtlInSeconds The time-to-live (TTL) period, in seconds, that specifies how long API
   * Gateway caches responses.
   */
  public fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
    cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
  }

  /**
   * @param cachingEnabled Indicates whether responses are cached and returned for requests.
   * You must enable a cache cluster on the stage to cache responses. For more information, see
   * [Enable API Gateway Caching in a Stage to Enhance API
   * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
   * in the *API Gateway Developer Guide* .
   */
  public fun cachingEnabled(cachingEnabled: Boolean) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  /**
   * @param cachingEnabled Indicates whether responses are cached and returned for requests.
   * You must enable a cache cluster on the stage to cache responses. For more information, see
   * [Enable API Gateway Caching in a Stage to Enhance API
   * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
   * in the *API Gateway Developer Guide* .
   */
  public fun cachingEnabled(cachingEnabled: IResolvable) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  /**
   * @param canarySetting Specifies settings for the canary deployment in this stage.
   */
  public fun canarySetting(canarySetting: IResolvable) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * @param canarySetting Specifies settings for the canary deployment in this stage.
   */
  public fun canarySetting(canarySetting: CfnDeployment.CanarySettingProperty) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * @param clientCertificateId The identifier of the client certificate that API Gateway uses to
   * call your integration endpoints in the stage.
   */
  public fun clientCertificateId(clientCertificateId: String) {
    cdkBuilder.clientCertificateId(clientCertificateId)
  }

  /**
   * @param dataTraceEnabled Indicates whether data trace logging is enabled for methods in the
   * stage.
   * API Gateway pushes these logs to Amazon CloudWatch Logs.
   */
  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param dataTraceEnabled Indicates whether data trace logging is enabled for methods in the
   * stage.
   * API Gateway pushes these logs to Amazon CloudWatch Logs.
   */
  public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param description A description of the purpose of the stage.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param documentationVersion The version identifier of the API documentation snapshot.
   */
  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  /**
   * @param loggingLevel The logging level for this method.
   * For valid values, see the `loggingLevel` property of the
   * [MethodSetting](https://docs.aws.amazon.com/apigateway/latest/api/API_MethodSetting.html) resource
   * in the *Amazon API Gateway API Reference* .
   */
  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * @param methodSettings Configures settings for all of the stage's methods.
   */
  public fun methodSettings(vararg methodSettings: Any) {
    _methodSettings.addAll(listOf(*methodSettings))
  }

  /**
   * @param methodSettings Configures settings for all of the stage's methods.
   */
  public fun methodSettings(methodSettings: Collection<Any>) {
    _methodSettings.addAll(methodSettings)
  }

  /**
   * @param methodSettings Configures settings for all of the stage's methods.
   */
  public fun methodSettings(methodSettings: IResolvable) {
    cdkBuilder.methodSettings(methodSettings)
  }

  /**
   * @param metricsEnabled Indicates whether Amazon CloudWatch metrics are enabled for methods in
   * the stage.
   */
  public fun metricsEnabled(metricsEnabled: Boolean) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  /**
   * @param metricsEnabled Indicates whether Amazon CloudWatch metrics are enabled for methods in
   * the stage.
   */
  public fun metricsEnabled(metricsEnabled: IResolvable) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  /**
   * @param tags An array of arbitrary tags (key-value pairs) to associate with the stage.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of arbitrary tags (key-value pairs) to associate with the stage.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param throttlingBurstLimit The target request burst rate limit.
   * This allows more requests through for a period of time than the target rate limit. For more
   * information, see [Manage API Request
   * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
   * in the *API Gateway Developer Guide* .
   */
  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
  }

  /**
   * @param throttlingRateLimit The target request steady-state rate limit.
   * For more information, see [Manage API Request
   * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
   * in the *API Gateway Developer Guide* .
   */
  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  /**
   * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for this stage.
   * For more information, see [Trace API Gateway API Execution with AWS
   * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in the
   * *API Gateway Developer Guide* .
   */
  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for this stage.
   * For more information, see [Trace API Gateway API Execution with AWS
   * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in the
   * *API Gateway Developer Guide* .
   */
  public fun tracingEnabled(tracingEnabled: IResolvable) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * @param variables A map that defines the stage variables.
   * Variable names must consist of alphanumeric characters, and the values must match the following
   * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
   */
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  /**
   * @param variables A map that defines the stage variables.
   * Variable names must consist of alphanumeric characters, and the values must match the following
   * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnDeployment.StageDescriptionProperty {
    if(_methodSettings.isNotEmpty()) cdkBuilder.methodSettings(_methodSettings)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
