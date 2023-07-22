@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAlarmCapabilitiesPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AlarmCapabilitiesProperty.Builder =
      CfnAlarmModel.AlarmCapabilitiesProperty.builder()

  /**
   * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
   */
  public fun acknowledgeFlow(acknowledgeFlow: IResolvable) {
    cdkBuilder.acknowledgeFlow(acknowledgeFlow)
  }

  /**
   * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
   */
  public fun acknowledgeFlow(acknowledgeFlow: CfnAlarmModel.AcknowledgeFlowProperty) {
    cdkBuilder.acknowledgeFlow(acknowledgeFlow)
  }

  /**
   * @param initializationConfiguration Specifies the default alarm state.
   * The configuration applies to all alarms that were created based on this alarm model.
   */
  public fun initializationConfiguration(initializationConfiguration: IResolvable) {
    cdkBuilder.initializationConfiguration(initializationConfiguration)
  }

  /**
   * @param initializationConfiguration Specifies the default alarm state.
   * The configuration applies to all alarms that were created based on this alarm model.
   */
  public
      fun initializationConfiguration(initializationConfiguration: CfnAlarmModel.InitializationConfigurationProperty) {
    cdkBuilder.initializationConfiguration(initializationConfiguration)
  }

  public fun build(): CfnAlarmModel.AlarmCapabilitiesProperty = cdkBuilder.build()
}
