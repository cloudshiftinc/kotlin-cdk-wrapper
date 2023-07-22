@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineCloudWatchLogsLogGroupPropertyDsl {
  private val cdkBuilder: CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder =
      CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

  /**
   * @param logGroupArn The ARN of the the CloudWatch log group to which you want your logs emitted
   * to.
   * The ARN must end with `:*`
   */
  public fun logGroupArn(logGroupArn: String) {
    cdkBuilder.logGroupArn(logGroupArn)
  }

  public fun build(): CfnStateMachine.CloudWatchLogsLogGroupProperty = cdkBuilder.build()
}
