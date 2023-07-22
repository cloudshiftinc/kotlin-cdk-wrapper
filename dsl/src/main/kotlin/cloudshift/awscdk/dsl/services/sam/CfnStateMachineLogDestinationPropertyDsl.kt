@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineLogDestinationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.LogDestinationProperty.Builder =
      CfnStateMachine.LogDestinationProperty.builder()

  /**
   * @param cloudWatchLogsLogGroup the value to be set. 
   */
  public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
    cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup)
  }

  /**
   * @param cloudWatchLogsLogGroup the value to be set. 
   */
  public
      fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CfnStateMachine.CloudWatchLogsLogGroupProperty) {
    cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup)
  }

  public fun build(): CfnStateMachine.LogDestinationProperty = cdkBuilder.build()
}
