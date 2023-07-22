@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.events.CfnRule

/**
 * The retry strategy to use for failed jobs, if the target is an AWS Batch job.
 *
 * If you specify a retry strategy here, it overrides the retry strategy defined in the job
 * definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * BatchRetryStrategyProperty batchRetryStrategyProperty = BatchRetryStrategyProperty.builder()
 * .attempts(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html)
 */
@CdkDslMarker
public class CfnRuleBatchRetryStrategyPropertyDsl {
  private val cdkBuilder: CfnRule.BatchRetryStrategyProperty.Builder =
      CfnRule.BatchRetryStrategyProperty.builder()

  /**
   * @param attempts The number of times to attempt to retry, if the job fails.
   * Valid values are 1–10.
   */
  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  public fun build(): CfnRule.BatchRetryStrategyProperty = cdkBuilder.build()
}
