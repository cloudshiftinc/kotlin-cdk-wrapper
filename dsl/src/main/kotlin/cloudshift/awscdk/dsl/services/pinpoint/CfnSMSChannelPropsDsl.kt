@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps

@CdkDslMarker
public class CfnSMSChannelPropsDsl {
  private val cdkBuilder: CfnSMSChannelProps.Builder = CfnSMSChannelProps.builder()

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the SMS
   * channel applies to. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param enabled Specifies whether to enable the SMS channel for the application.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether to enable the SMS channel for the application.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param senderId The identity that you want to display on recipients' devices when they receive
   * messages from the SMS channel.
   *
   * SenderIDs are only supported in certain countries and regions. For more information, see
   * [Supported Countries and
   * Regions](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) in the
   * *Amazon Pinpoint User Guide* .
   */
  public fun senderId(senderId: String) {
    cdkBuilder.senderId(senderId)
  }

  /**
   * @param shortCode The registered short code that you want to use when you send messages through
   * the SMS channel.
   *
   * For information about obtaining a dedicated short code for sending SMS messages, see
   * [Requesting Dedicated Short Codes for SMS Messaging with Amazon
   * Pinpoint](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-short-code.html)
   * in the *Amazon Pinpoint User Guide* .
   */
  public fun shortCode(shortCode: String) {
    cdkBuilder.shortCode(shortCode)
  }

  public fun build(): CfnSMSChannelProps = cdkBuilder.build()
}
