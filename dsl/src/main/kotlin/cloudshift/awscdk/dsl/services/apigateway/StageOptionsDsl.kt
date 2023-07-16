@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.AccessLogFormat
import software.amazon.awscdk.services.apigateway.IAccessLogDestination
import software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
import software.amazon.awscdk.services.apigateway.MethodLoggingLevel
import software.amazon.awscdk.services.apigateway.StageOptions

@CdkDslMarker
public class StageOptionsDsl {
  private val cdkBuilder: StageOptions.Builder = StageOptions.builder()

  public fun accessLogDestination(accessLogDestination: IAccessLogDestination) {
    cdkBuilder.accessLogDestination(accessLogDestination)
  }

  public fun accessLogFormat(accessLogFormat: AccessLogFormat) {
    cdkBuilder.accessLogFormat(accessLogFormat)
  }

  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  public fun cacheTtl(cacheTtl: Duration) {
    cdkBuilder.cacheTtl(cacheTtl)
  }

  public fun cachingEnabled(cachingEnabled: Boolean) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  public fun clientCertificateId(clientCertificateId: String) {
    cdkBuilder.clientCertificateId(clientCertificateId)
  }

  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  public fun loggingLevel(loggingLevel: MethodLoggingLevel) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  public fun methodOptions(methodOptions: Map<String, out MethodDeploymentOptions>) {
    cdkBuilder.methodOptions(methodOptions)
  }

  public fun metricsEnabled(metricsEnabled: Boolean) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
  }

  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  public fun build(): StageOptions = cdkBuilder.build()
}
