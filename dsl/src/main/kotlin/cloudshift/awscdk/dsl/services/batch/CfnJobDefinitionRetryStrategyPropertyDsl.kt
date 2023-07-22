@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The retry strategy that's associated with a job.
 *
 * For more information, see [Automated job
 * retries](https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html) in the *AWS Batch User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * RetryStrategyProperty retryStrategyProperty = RetryStrategyProperty.builder()
 * .attempts(123)
 * .evaluateOnExit(List.of(EvaluateOnExitProperty.builder()
 * .action("action")
 * // the properties below are optional
 * .onExitCode("onExitCode")
 * .onReason("onReason")
 * .onStatusReason("onStatusReason")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html)
 */
@CdkDslMarker
public class CfnJobDefinitionRetryStrategyPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.RetryStrategyProperty.Builder =
      CfnJobDefinition.RetryStrategyProperty.builder()

  private val _evaluateOnExit: MutableList<Any> = mutableListOf()

  /**
   * @param attempts The number of times to move a job to the `RUNNABLE` status.
   * You can specify between 1 and 10 attempts. If the value of `attempts` is greater than one, the
   * job is retried on failure the same number of attempts as the value.
   */
  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  /**
   * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
   * retried or failed.
   * If this parameter is specified, then the `attempts` parameter must also be specified. If none
   * of the listed conditions match, then the job is retried.
   */
  public fun evaluateOnExit(vararg evaluateOnExit: Any) {
    _evaluateOnExit.addAll(listOf(*evaluateOnExit))
  }

  /**
   * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
   * retried or failed.
   * If this parameter is specified, then the `attempts` parameter must also be specified. If none
   * of the listed conditions match, then the job is retried.
   */
  public fun evaluateOnExit(evaluateOnExit: Collection<Any>) {
    _evaluateOnExit.addAll(evaluateOnExit)
  }

  /**
   * @param evaluateOnExit Array of up to 5 objects that specify the conditions where jobs are
   * retried or failed.
   * If this parameter is specified, then the `attempts` parameter must also be specified. If none
   * of the listed conditions match, then the job is retried.
   */
  public fun evaluateOnExit(evaluateOnExit: IResolvable) {
    cdkBuilder.evaluateOnExit(evaluateOnExit)
  }

  public fun build(): CfnJobDefinition.RetryStrategyProperty {
    if(_evaluateOnExit.isNotEmpty()) cdkBuilder.evaluateOnExit(_evaluateOnExit)
    return cdkBuilder.build()
  }
}
