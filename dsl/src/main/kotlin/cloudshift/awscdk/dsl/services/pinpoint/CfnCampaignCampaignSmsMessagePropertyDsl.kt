@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.String

/**
 * Specifies the content and settings for an SMS message that's sent to recipients of a campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CampaignSmsMessageProperty campaignSmsMessageProperty = CampaignSmsMessageProperty.builder()
 * .body("body")
 * .entityId("entityId")
 * .messageType("messageType")
 * .originationNumber("originationNumber")
 * .senderId("senderId")
 * .templateId("templateId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaignsmsmessage.html)
 */
@CdkDslMarker
public class CfnCampaignCampaignSmsMessagePropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignSmsMessageProperty.Builder =
        CfnCampaign.CampaignSmsMessageProperty.builder()

    /**
     * @param body The body of the SMS message.
     */
    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    /**
     * @param entityId The entity ID or Principal Entity (PE) id received from the regulatory body for
     * sending SMS in your country.
     */
    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    /**
     * @param messageType The SMS message type.
     * Valid values are `TRANSACTIONAL` (for messages that are critical or time-sensitive, such as a
     * one-time passwords) and `PROMOTIONAL` (for messsages that aren't critical or time-sensitive, such
     * as marketing messages).
     */
    public fun messageType(messageType: String) {
        cdkBuilder.messageType(messageType)
    }

    /**
     * @param originationNumber The long code to send the SMS message from.
     * This value should be one of the dedicated long codes that's assigned to your AWS account.
     * Although it isn't required, we recommend that you specify the long code using an E.164 format to
     * ensure prompt and accurate delivery of the message. For example, +12065550100.
     */
    public fun originationNumber(originationNumber: String) {
        cdkBuilder.originationNumber(originationNumber)
    }

    /**
     * @param senderId The alphabetic Sender ID to display as the sender of the message on a
     * recipient's device.
     * Support for sender IDs varies by country or region. To specify a phone number as the sender,
     * omit this parameter and use `OriginationNumber` instead. For more information about support for
     * Sender ID by country, see the [Amazon Pinpoint User
   * Guide](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) .
     */
    public fun senderId(senderId: String) {
        cdkBuilder.senderId(senderId)
    }

    /**
     * @param templateId The template ID received from the regulatory body for sending SMS in your
     * country.
     */
    public fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
    }

    public fun build(): CfnCampaign.CampaignSmsMessageProperty = cdkBuilder.build()
}
