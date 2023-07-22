@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowTriggerConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.TriggerConfigProperty.Builder =
      CfnFlow.TriggerConfigProperty.builder()

  /**
   * @param triggerProperties Specifies the configuration details of a schedule-triggered flow as
   * defined by the user.
   * Currently, these settings only apply to the `Scheduled` trigger type.
   */
  public fun triggerProperties(triggerProperties: IResolvable) {
    cdkBuilder.triggerProperties(triggerProperties)
  }

  /**
   * @param triggerProperties Specifies the configuration details of a schedule-triggered flow as
   * defined by the user.
   * Currently, these settings only apply to the `Scheduled` trigger type.
   */
  public fun triggerProperties(triggerProperties: CfnFlow.ScheduledTriggerPropertiesProperty) {
    cdkBuilder.triggerProperties(triggerProperties)
  }

  /**
   * @param triggerType Specifies the type of flow trigger. 
   * This can be `OnDemand` , `Scheduled` , or `Event` .
   */
  public fun triggerType(triggerType: String) {
    cdkBuilder.triggerType(triggerType)
  }

  public fun build(): CfnFlow.TriggerConfigProperty = cdkBuilder.build()
}
