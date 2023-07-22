@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnTrigger

@CdkDslMarker
public class CfnTriggerConditionPropertyDsl {
  private val cdkBuilder: CfnTrigger.ConditionProperty.Builder =
      CfnTrigger.ConditionProperty.builder()

  /**
   * @param crawlState The state of the crawler to which this condition applies.
   */
  public fun crawlState(crawlState: String) {
    cdkBuilder.crawlState(crawlState)
  }

  /**
   * @param crawlerName The name of the crawler to which this condition applies.
   */
  public fun crawlerName(crawlerName: String) {
    cdkBuilder.crawlerName(crawlerName)
  }

  /**
   * @param jobName The name of the job whose `JobRuns` this condition applies to, and on which this
   * trigger waits.
   */
  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  /**
   * @param logicalOperator A logical operator.
   */
  public fun logicalOperator(logicalOperator: String) {
    cdkBuilder.logicalOperator(logicalOperator)
  }

  /**
   * @param state The condition state.
   * Currently, the values supported are `SUCCEEDED` , `STOPPED` , `TIMEOUT` , and `FAILED` .
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnTrigger.ConditionProperty = cdkBuilder.build()
}
