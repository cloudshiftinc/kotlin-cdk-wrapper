@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationTriggerConfigPropertyDsl {
  private val cdkBuilder: CfnIntegration.TriggerConfigProperty.Builder =
      CfnIntegration.TriggerConfigProperty.builder()

  /**
   * @param triggerProperties Specifies the configuration details of a schedule-triggered flow that
   * you define.
   * Currently, these settings only apply to the Scheduled trigger type.
   */
  public fun triggerProperties(triggerProperties: IResolvable) {
    cdkBuilder.triggerProperties(triggerProperties)
  }

  /**
   * @param triggerProperties Specifies the configuration details of a schedule-triggered flow that
   * you define.
   * Currently, these settings only apply to the Scheduled trigger type.
   */
  public fun triggerProperties(triggerProperties: CfnIntegration.TriggerPropertiesProperty) {
    cdkBuilder.triggerProperties(triggerProperties)
  }

  /**
   * @param triggerType Specifies the type of flow trigger. 
   * It can be OnDemand, Scheduled, or Event.
   */
  public fun triggerType(triggerType: String) {
    cdkBuilder.triggerType(triggerType)
  }

  public fun build(): CfnIntegration.TriggerConfigProperty = cdkBuilder.build()
}
