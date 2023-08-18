@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSMSChannel
import software.constructs.Construct

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * To send an SMS text message, you send the message through the SMS channel. Before you can use
 * Amazon Pinpoint to send text messages, you have to enable the SMS channel for an Amazon Pinpoint
 * application.
 *
 * The SMSChannel resource represents the status, sender ID, and other settings for the SMS channel
 * for an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnSMSChannel cfnSMSChannel = CfnSMSChannel.Builder.create(this, "MyCfnSMSChannel")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .enabled(false)
 * .senderId("senderId")
 * .shortCode("shortCode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html)
 */
@CdkDslMarker
public class CfnSMSChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSMSChannel.Builder = CfnSMSChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the SMS channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-applicationid)
     *
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the SMS
     *   channel applies to.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * Specifies whether to enable the SMS channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
     *
     * @param enabled Specifies whether to enable the SMS channel for the application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the SMS channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
     *
     * @param enabled Specifies whether to enable the SMS channel for the application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The identity that you want to display on recipients' devices when they receive messages from
     * the SMS channel.
     *
     * SenderIDs are only supported in certain countries and regions. For more information, see
     * [Supported Countries and Regions](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html)
     * in the *Amazon Pinpoint User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-senderid)
     *
     * @param senderId The identity that you want to display on recipients' devices when they
     *   receive messages from the SMS channel.
     */
    public fun senderId(senderId: String) {
        cdkBuilder.senderId(senderId)
    }

    /**
     * The registered short code that you want to use when you send messages through the SMS
     * channel.
     *
     * For information about obtaining a dedicated short code for sending SMS messages, see
     * [Requesting Dedicated Short Codes for SMS Messaging with Amazon Pinpoint](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-short-code.html)
     * in the *Amazon Pinpoint User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-shortcode)
     *
     * @param shortCode The registered short code that you want to use when you send messages
     *   through the SMS channel.
     */
    public fun shortCode(shortCode: String) {
        cdkBuilder.shortCode(shortCode)
    }

    public fun build(): CfnSMSChannel = cdkBuilder.build()
}
