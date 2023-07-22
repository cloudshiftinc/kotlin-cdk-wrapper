@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineCloudWatchLogsLogGroupPropertyDsl {
  private val cdkBuilder: CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder =
      CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

  /**
   * @param logGroupArn the value to be set. 
   */
  public fun logGroupArn(logGroupArn: String) {
    cdkBuilder.logGroupArn(logGroupArn)
  }

  public fun build(): CfnStateMachine.CloudWatchLogsLogGroupProperty = cdkBuilder.build()
}
