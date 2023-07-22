@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationTriggerPropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.TriggerPropertiesProperty.Builder =
      CfnIntegration.TriggerPropertiesProperty.builder()

  /**
   * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
   * define.
   */
  public fun scheduled(scheduled: IResolvable) {
    cdkBuilder.scheduled(scheduled)
  }

  /**
   * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
   * define.
   */
  public fun scheduled(scheduled: CfnIntegration.ScheduledTriggerPropertiesProperty) {
    cdkBuilder.scheduled(scheduled)
  }

  public fun build(): CfnIntegration.TriggerPropertiesProperty = cdkBuilder.build()
}
