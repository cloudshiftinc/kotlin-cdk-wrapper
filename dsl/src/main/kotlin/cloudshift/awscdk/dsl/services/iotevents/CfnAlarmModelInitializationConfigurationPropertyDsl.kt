@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Specifies the default alarm state.
 *
 * The configuration applies to all alarms that were created based on this alarm model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * InitializationConfigurationProperty initializationConfigurationProperty =
 * InitializationConfigurationProperty.builder()
 * .disabledOnInitialization(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-initializationconfiguration.html)
 */
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
