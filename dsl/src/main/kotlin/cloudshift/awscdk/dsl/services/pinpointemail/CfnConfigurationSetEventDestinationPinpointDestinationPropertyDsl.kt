@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

/**
 * An object that defines a Amazon Pinpoint destination for email events.
 *
 * You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use
 * these attributes to create segments for your campaigns.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * PinpointDestinationProperty pinpointDestinationProperty = PinpointDestinationProperty.builder()
 * .applicationArn("applicationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html)
 */
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
