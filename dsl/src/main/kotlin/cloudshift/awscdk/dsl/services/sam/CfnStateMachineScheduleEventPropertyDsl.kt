@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineScheduleEventPropertyDsl {
  private val cdkBuilder: CfnStateMachine.ScheduleEventProperty.Builder =
      CfnStateMachine.ScheduleEventProperty.builder()

  /**
   * @param input the value to be set.
   */
  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  /**
   * @param schedule the value to be set. 
   */
  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  public fun build(): CfnStateMachine.ScheduleEventProperty = cdkBuilder.build()
}
