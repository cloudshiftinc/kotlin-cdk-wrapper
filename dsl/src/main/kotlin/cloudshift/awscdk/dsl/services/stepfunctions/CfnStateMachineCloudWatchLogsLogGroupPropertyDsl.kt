@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineCloudWatchLogsLogGroupPropertyDsl {
  private val cdkBuilder: CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder =
      CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

  public fun logGroupArn(logGroupArn: String) {
    cdkBuilder.logGroupArn(logGroupArn)
  }

  public fun build(): CfnStateMachine.CloudWatchLogsLogGroupProperty = cdkBuilder.build()
}
