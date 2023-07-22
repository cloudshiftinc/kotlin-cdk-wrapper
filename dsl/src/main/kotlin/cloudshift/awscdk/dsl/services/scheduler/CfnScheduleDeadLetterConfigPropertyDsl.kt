@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleDeadLetterConfigPropertyDsl {
  private val cdkBuilder: CfnSchedule.DeadLetterConfigProperty.Builder =
      CfnSchedule.DeadLetterConfigProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the SQS queue specified as the destination for the
   * dead-letter queue.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnSchedule.DeadLetterConfigProperty = cdkBuilder.build()
}
