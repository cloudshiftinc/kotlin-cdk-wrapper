@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnStage

@CdkDslMarker
public class CfnStageMethodSettingPropertyDsl {
  private val cdkBuilder: CfnStage.MethodSettingProperty.Builder =
      CfnStage.MethodSettingProperty.builder()

  /**
   * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
   */
  public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  /**
   * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
   */
  public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  /**
   * @param cacheTtlInSeconds Specifies the time to live (TTL), in seconds, for cached responses.
   * The higher the TTL, the longer the response will be cached.
   */
  public fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
    cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
  }

  /**
   * @param cachingEnabled Specifies whether responses should be cached and returned for requests.
   * A cache cluster must be enabled on the stage for responses to be cached.
   */
  public fun cachingEnabled(cachingEnabled: Boolean) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  /**
   * @param cachingEnabled Specifies whether responses should be cached and returned for requests.
   * A cache cluster must be enabled on the stage for responses to be cached.
   */
  public fun cachingEnabled(cachingEnabled: IResolvable) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  /**
   * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method, which
   * affects the log entries pushed to Amazon CloudWatch Logs.
   */
  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method, which
   * affects the log entries pushed to Amazon CloudWatch Logs.
   */
  public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  /**
   * @param httpMethod The HTTP method.
   * To apply settings to multiple resources and methods, specify an asterisk ( `*` ) for the
   * `HttpMethod` and `/ *` for the `ResourcePath` . This parameter is required when you specify a
   * `MethodSetting` .
   */
  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * @param loggingLevel Specifies the logging level for this method, which affects the log entries
   * pushed to Amazon CloudWatch Logs.
   * Valid values are `OFF` , `ERROR` , and `INFO` . Choose `ERROR` to write only error-level
   * entries to CloudWatch Logs, or choose `INFO` to include all `ERROR` events as well as extra
   * informational events.
   */
  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this method.
   */
  public fun metricsEnabled(metricsEnabled: Boolean) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  /**
   * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this method.
   */
  public fun metricsEnabled(metricsEnabled: IResolvable) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  /**
   * @param resourcePath The resource path for this method.
   * Forward slashes ( `/` ) are encoded as `~1` and the initial slash must include a forward slash.
   * For example, the path value `/resource/subresource` must be encoded as `/~1resource~1subresource`
   * . To specify the root path, use only a slash ( `/` ). To apply settings to multiple resources and
   * methods, specify an asterisk ( `*` ) for the `HttpMethod` and `/ *` for the `ResourcePath` . This
   * parameter is required when you specify a `MethodSetting` .
   */
  public fun resourcePath(resourcePath: String) {
    cdkBuilder.resourcePath(resourcePath)
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

  public fun build(): CfnStage.MethodSettingProperty = cdkBuilder.build()
}
