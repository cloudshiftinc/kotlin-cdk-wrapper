@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.EventInvokeConfig
import software.amazon.awscdk.services.lambda.IDestination
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct

@CdkDslMarker
public class EventInvokeConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EventInvokeConfig.Builder = EventInvokeConfig.Builder.create(scope, id)

  /**
   * The Lambda function.
   *
   * @param function The Lambda function. 
   */
  public fun function(function: IFunction) {
    cdkBuilder.function(function)
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
   * The qualifier.
   *
   * Default: - latest version
   *
   * @param qualifier The qualifier. 
   */
  public fun qualifier(qualifier: String) {
    cdkBuilder.qualifier(qualifier)
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

  public fun build(): EventInvokeConfig = cdkBuilder.build()
}
