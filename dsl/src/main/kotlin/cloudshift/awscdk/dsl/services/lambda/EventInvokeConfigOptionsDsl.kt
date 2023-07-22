@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.EventInvokeConfigOptions
import software.amazon.awscdk.services.lambda.IDestination

@CdkDslMarker
public class EventInvokeConfigOptionsDsl {
  private val cdkBuilder: EventInvokeConfigOptions.Builder = EventInvokeConfigOptions.builder()

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
   * @param retryAttempts The maximum number of times to retry when the function returns an error.
   * Minimum: 0
   * Maximum: 2
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): EventInvokeConfigOptions = cdkBuilder.build()
}
