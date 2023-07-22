@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

@CdkDslMarker
public class CfnConfigurationSetEventDestinationPinpointDestinationPropertyDsl {
  private val cdkBuilder: CfnConfigurationSetEventDestination.PinpointDestinationProperty.Builder =
      CfnConfigurationSetEventDestination.PinpointDestinationProperty.builder()

  /**
   * @param applicationArn The Amazon Resource Name (ARN) of the Amazon Pinpoint project that you
   * want to send email events to.
   */
  public fun applicationArn(applicationArn: String) {
    cdkBuilder.applicationArn(applicationArn)
  }

  public fun build(): CfnConfigurationSetEventDestination.PinpointDestinationProperty =
      cdkBuilder.build()
}
