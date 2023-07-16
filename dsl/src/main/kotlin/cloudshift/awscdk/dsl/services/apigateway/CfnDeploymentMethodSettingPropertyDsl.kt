@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment

@CdkDslMarker
public class CfnDeploymentMethodSettingPropertyDsl {
  private val cdkBuilder: CfnDeployment.MethodSettingProperty.Builder =
      CfnDeployment.MethodSettingProperty.builder()

  public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
    cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
  }

  public fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
    cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
  }

  public fun cachingEnabled(cachingEnabled: Boolean) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  public fun cachingEnabled(cachingEnabled: IResolvable) {
    cdkBuilder.cachingEnabled(cachingEnabled)
  }

  public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
    cdkBuilder.dataTraceEnabled(dataTraceEnabled)
  }

  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  public fun metricsEnabled(metricsEnabled: Boolean) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  public fun metricsEnabled(metricsEnabled: IResolvable) {
    cdkBuilder.metricsEnabled(metricsEnabled)
  }

  public fun resourcePath(resourcePath: String) {
    cdkBuilder.resourcePath(resourcePath)
  }

  public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
  }

  public fun throttlingRateLimit(throttlingRateLimit: Number) {
    cdkBuilder.throttlingRateLimit(throttlingRateLimit)
  }

  public fun build(): CfnDeployment.MethodSettingProperty = cdkBuilder.build()
}
