@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.VersionOptions

/**
 * Options for `lambda.Version`.
 *
 * Example:
 *
 * ```
 * Function fn = Function.Builder.create(this, "MyFunction")
 * .currentVersionOptions(VersionOptions.builder()
 * .removalPolicy(RemovalPolicy.RETAIN) // retain old versions
 * .retryAttempts(1)
 * .build())
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .build();
 * fn.addAlias("live");
 * ```
 */
@CdkDslMarker
public class VersionOptionsDsl {
  private val cdkBuilder: VersionOptions.Builder = VersionOptions.builder()

  /**
   * @param codeSha256 SHA256 of the version of the Lambda source code.
   * Specify to validate that you're deploying the right version.
   */
  public fun codeSha256(codeSha256: String) {
    cdkBuilder.codeSha256(codeSha256)
  }

  /**
   * @param description Description of the version.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * Minimum: 60 seconds
   * Maximum: 6 hours
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  /**
   * @param onFailure The destination for failed invocations.
   */
  public fun onFailure(onFailure: IDestination) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onSuccess The destination for successful invocations.
   */
  public fun onSuccess(onSuccess: IDestination) {
    cdkBuilder.onSuccess(onSuccess)
  }

  /**
   * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for a
   * function's version.
   */
  public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
    cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
  }

  /**
   * @param removalPolicy Whether to retain old versions of this function when a new version is
   * created.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param retryAttempts The maximum number of times to retry when the function returns an error.
   * Minimum: 0
   * Maximum: 2
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): VersionOptions = cdkBuilder.build()
}
