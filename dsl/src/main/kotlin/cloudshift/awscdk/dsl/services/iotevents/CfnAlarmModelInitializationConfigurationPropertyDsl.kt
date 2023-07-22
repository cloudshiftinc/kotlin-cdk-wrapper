@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelInitializationConfigurationPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.InitializationConfigurationProperty.Builder =
      CfnAlarmModel.InitializationConfigurationProperty.builder()

  /**
   * @param disabledOnInitialization The value must be `TRUE` or `FALSE` . 
   * If `FALSE` , all alarm instances created based on the alarm model are activated. The default
   * value is `TRUE` .
   */
  public fun disabledOnInitialization(disabledOnInitialization: Boolean) {
    cdkBuilder.disabledOnInitialization(disabledOnInitialization)
  }

  /**
   * @param disabledOnInitialization The value must be `TRUE` or `FALSE` . 
   * If `FALSE` , all alarm instances created based on the alarm model are activated. The default
   * value is `TRUE` .
   */
  public fun disabledOnInitialization(disabledOnInitialization: IResolvable) {
    cdkBuilder.disabledOnInitialization(disabledOnInitialization)
  }

  public fun build(): CfnAlarmModel.InitializationConfigurationProperty = cdkBuilder.build()
}
