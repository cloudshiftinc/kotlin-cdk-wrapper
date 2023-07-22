@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.RetryProps

@CdkDslMarker
public class RetryPropsDsl {
  private val cdkBuilder: RetryProps.Builder = RetryProps.builder()

  private val _errors: MutableList<String> = mutableListOf()

  /**
   * @param backoffRate Multiplication for how much longer the wait interval gets on every retry.
   */
  public fun backoffRate(backoffRate: Number) {
    cdkBuilder.backoffRate(backoffRate)
  }

  /**
   * @param errors Errors to retry.
   * A list of error strings to retry, which can be either predefined errors
   * (for example Errors.NoChoiceMatched) or a self-defined error.
   */
  public fun errors(vararg errors: String) {
    _errors.addAll(listOf(*errors))
  }

  /**
   * @param errors Errors to retry.
   * A list of error strings to retry, which can be either predefined errors
   * (for example Errors.NoChoiceMatched) or a self-defined error.
   */
  public fun errors(errors: Collection<String>) {
    _errors.addAll(errors)
  }

  /**
   * @param interval How many seconds to wait initially before retrying.
   */
  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param maxAttempts How many times to retry this particular error.
   * May be 0 to disable retry for specific errors (in case you have
   * a catch-all retry policy).
   */
  public fun maxAttempts(maxAttempts: Number) {
    cdkBuilder.maxAttempts(maxAttempts)
  }

  public fun build(): RetryProps {
    if(_errors.isNotEmpty()) cdkBuilder.errors(_errors)
    return cdkBuilder.build()
  }
}
