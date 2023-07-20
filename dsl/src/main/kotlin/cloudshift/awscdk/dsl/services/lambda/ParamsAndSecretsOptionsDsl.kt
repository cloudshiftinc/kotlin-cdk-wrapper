@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel
import software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions

@CdkDslMarker
public class ParamsAndSecretsOptionsDsl {
  private val cdkBuilder: ParamsAndSecretsOptions.Builder = ParamsAndSecretsOptions.builder()

  public fun cacheEnabled(cacheEnabled: Boolean) {
    cdkBuilder.cacheEnabled(cacheEnabled)
  }

  public fun cacheSize(cacheSize: Number) {
    cdkBuilder.cacheSize(cacheSize)
  }

  public fun httpPort(httpPort: Number) {
    cdkBuilder.httpPort(httpPort)
  }

  public fun logLevel(logLevel: ParamsAndSecretsLogLevel) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun maxConnections(maxConnections: Number) {
    cdkBuilder.maxConnections(maxConnections)
  }

  public fun parameterStoreTimeout(parameterStoreTimeout: Duration) {
    cdkBuilder.parameterStoreTimeout(parameterStoreTimeout)
  }

  public fun parameterStoreTtl(parameterStoreTtl: Duration) {
    cdkBuilder.parameterStoreTtl(parameterStoreTtl)
  }

  public fun secretsManagerTimeout(secretsManagerTimeout: Duration) {
    cdkBuilder.secretsManagerTimeout(secretsManagerTimeout)
  }

  public fun secretsManagerTtl(secretsManagerTtl: Duration) {
    cdkBuilder.secretsManagerTtl(secretsManagerTtl)
  }

  public fun build(): ParamsAndSecretsOptions = cdkBuilder.build()
}
