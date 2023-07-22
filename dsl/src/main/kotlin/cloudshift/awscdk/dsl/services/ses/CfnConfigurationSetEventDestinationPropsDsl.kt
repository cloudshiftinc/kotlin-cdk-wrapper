@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps

@CdkDslMarker
public class CfnConfigurationSetEventDestinationPropsDsl {
  private val cdkBuilder: CfnConfigurationSetEventDestinationProps.Builder =
      CfnConfigurationSetEventDestinationProps.builder()

  /**
   * @param configurationSetName The name of the configuration set that contains the event
   * destination. 
   */
  public fun configurationSetName(configurationSetName: String) {
    cdkBuilder.configurationSetName(configurationSetName)
  }

  /**
   * @param eventDestination The event destination object. 
   */
  public fun eventDestination(eventDestination: IResolvable) {
    cdkBuilder.eventDestination(eventDestination)
  }

  /**
   * @param eventDestination The event destination object. 
   */
  public
      fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
    cdkBuilder.eventDestination(eventDestination)
  }

  public fun build(): CfnConfigurationSetEventDestinationProps = cdkBuilder.build()
}
