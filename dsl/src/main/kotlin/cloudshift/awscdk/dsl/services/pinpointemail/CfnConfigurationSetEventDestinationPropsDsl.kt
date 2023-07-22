@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps

@CdkDslMarker
public class CfnConfigurationSetEventDestinationPropsDsl {
  private val cdkBuilder: CfnConfigurationSetEventDestinationProps.Builder =
      CfnConfigurationSetEventDestinationProps.builder()

  /**
   * @param configurationSetName The name of the configuration set that contains the event
   * destination that you want to modify. 
   */
  public fun configurationSetName(configurationSetName: String) {
    cdkBuilder.configurationSetName(configurationSetName)
  }

  /**
   * @param eventDestination An object that defines the event destination.
   */
  public fun eventDestination(eventDestination: IResolvable) {
    cdkBuilder.eventDestination(eventDestination)
  }

  /**
   * @param eventDestination An object that defines the event destination.
   */
  public
      fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
    cdkBuilder.eventDestination(eventDestination)
  }

  /**
   * @param eventDestinationName The name of the event destination that you want to modify. 
   */
  public fun eventDestinationName(eventDestinationName: String) {
    cdkBuilder.eventDestinationName(eventDestinationName)
  }

  public fun build(): CfnConfigurationSetEventDestinationProps = cdkBuilder.build()
}
