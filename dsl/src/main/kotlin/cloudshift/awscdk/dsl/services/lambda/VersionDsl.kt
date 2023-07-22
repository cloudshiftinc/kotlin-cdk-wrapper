@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.Version
import software.constructs.Construct

@CdkDslMarker
public class VersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Version.Builder = Version.Builder.create(scope, id)

  /**
   * SHA256 of the version of the Lambda source code.
   *
   * Specify to validate that you're deploying the right version.
   *
   * Default: No validation is performed
   *
   * @param codeSha256 SHA256 of the version of the Lambda source code. 
   */
  public fun codeSha256(codeSha256: String) {
    cdkBuilder.codeSha256(codeSha256)
  }

  /**
   * Description of the version.
   *
   * Default: Description of the Lambda
   *
   * @param description Description of the version. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Function to get the value of.
   *
   * @param lambda Function to get the value of. 
   */
  public fun lambda(lambda: IFunction) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * The maximum age of a request that Lambda sends to a function for processing.
   *
   * Minimum: 60 seconds
   * Maximum: 6 hours
   *
   * Default: Duration.hours(6)
   *
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * 
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  /**
   * The destination for failed invocations.
   *
   * Default: - no destination
   *
   * @param onFailure The destination for failed invocations. 
   */
  public fun onFailure(onFailure: IDestination) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * The destination for successful invocations.
   *
   * Default: - no destination
   *
   * @param onSuccess The destination for successful invocations. 
   */
  public fun onSuccess(onSuccess: IDestination) {
    cdkBuilder.onSuccess(onSuccess)
  }

  /**
   * Specifies a provisioned concurrency configuration for a function's version.
   *
   * Default: No provisioned concurrency
   *
   * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for a
   * function's version. 
   */
  public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
    cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
  }

  /**
   * Whether to retain old versions of this function when a new version is created.
   *
   * Default: RemovalPolicy.DESTROY
   *
   * @param removalPolicy Whether to retain old versions of this function when a new version is
   * created. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * The maximum number of times to retry when the function returns an error.
   *
   * Minimum: 0
   * Maximum: 2
   *
   * Default: 2
   *
   * @param retryAttempts The maximum number of times to retry when the function returns an error. 
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): Version = cdkBuilder.build()
}
