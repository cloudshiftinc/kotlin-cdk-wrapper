@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.ParamsAndSecretsLogLevel
import software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions

/**
 * Parameters and Secrets Extension configuration options.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.secretsmanager.*;
 * import software.amazon.awscdk.services.ssm.*;
 * Secret secret = new Secret(this, "Secret");
 * StringParameter parameter = StringParameter.Builder.create(this, "Parameter")
 * .parameterName("mySsmParameterName")
 * .stringValue("mySsmParameterValue")
 * .build();
 * ParamsAndSecretsLayerVersion paramsAndSecrets =
 * ParamsAndSecretsLayerVersion.fromVersion(ParamsAndSecretsVersions.V1_0_103,
 * ParamsAndSecretsOptions.builder()
 * .cacheSize(500)
 * .logLevel(ParamsAndSecretsLogLevel.DEBUG)
 * .build());
 * Function lambdaFunction = Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .architecture(Architecture.ARM_64)
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .paramsAndSecrets(paramsAndSecrets)
 * .build();
 * secret.grantRead(lambdaFunction);
 * parameter.grantRead(lambdaFunction);
 * ```
 */
@CdkDslMarker
public class ParamsAndSecretsOptionsDsl {
  private val cdkBuilder: ParamsAndSecretsOptions.Builder = ParamsAndSecretsOptions.builder()

  /**
   * @param cacheEnabled Whether the Parameters and Secrets Extension will cache parameters and
   * secrets.
   */
  public fun cacheEnabled(cacheEnabled: Boolean) {
    cdkBuilder.cacheEnabled(cacheEnabled)
  }

  /**
   * @param cacheSize The maximum number of secrets and parameters to cache.
   * Must be a value
   * from 0 to 1000. A value of 0 means there is no caching.
   *
   * Note: This variable is ignored if parameterStoreTtl and secretsManagerTtl
   * are 0.
   */
  public fun cacheSize(cacheSize: Number) {
    cdkBuilder.cacheSize(cacheSize)
  }

  /**
   * @param httpPort The port for the local HTTP server.
   * Valid port numbers are 1 - 65535.
   */
  public fun httpPort(httpPort: Number) {
    cdkBuilder.httpPort(httpPort)
  }

  /**
   * @param logLevel The level of logging provided by the Parameters and Secrets Extension.
   * Note: Set to debug to see the cache configuration.
   */
  public fun logLevel(logLevel: ParamsAndSecretsLogLevel) {
    cdkBuilder.logLevel(logLevel)
  }

  /**
   * @param maxConnections The maximum number of connection for HTTP clients that the Parameters and
   * Secrets Extension uses to make requests to Parameter Store or Secrets Manager.
   * There is no maximum limit. Minimum is 1.
   *
   * Note: Every running copy of this Lambda function may open the number of
   * connections specified by this property. Thus, the total number of connections
   * may exceed this number.
   */
  public fun maxConnections(maxConnections: Number) {
    cdkBuilder.maxConnections(maxConnections)
  }

  /**
   * @param parameterStoreTimeout The timeout for requests to Parameter Store.
   * A value of 0 means that there is no
   * timeout.
   */
  public fun parameterStoreTimeout(parameterStoreTimeout: Duration) {
    cdkBuilder.parameterStoreTimeout(parameterStoreTimeout)
  }

  /**
   * @param parameterStoreTtl The time-to-live of a parameter in the cache.
   * A value of 0 means there is no caching.
   * The maximum time-to-live is 300 seconds.
   *
   * Note: This variable is ignored if cacheSize is 0.
   */
  public fun parameterStoreTtl(parameterStoreTtl: Duration) {
    cdkBuilder.parameterStoreTtl(parameterStoreTtl)
  }

  /**
   * @param secretsManagerTimeout The timeout for requests to Secrets Manager.
   * A value of 0 means that there is
   * no timeout.
   */
  public fun secretsManagerTimeout(secretsManagerTimeout: Duration) {
    cdkBuilder.secretsManagerTimeout(secretsManagerTimeout)
  }

  /**
   * @param secretsManagerTtl The time-to-live of a secret in the cache.
   * A value of 0 means there is no caching.
   * The maximum time-to-live is 300 seconds.
   *
   * Note: This variable is ignored if cacheSize is 0.
   */
  public fun secretsManagerTtl(secretsManagerTtl: Duration) {
    cdkBuilder.secretsManagerTtl(secretsManagerTtl)
  }

  public fun build(): ParamsAndSecretsOptions = cdkBuilder.build()
}
