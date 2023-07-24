@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * You can use the ADM channel to send push notifications through the Amazon Device Messaging (ADM)
 * service to apps that run on Amazon devices, such as Kindle Fire tablets. Before you can use Amazon
 * Pinpoint to send messages to Amazon devices, you have to enable the ADM channel for an Amazon
 * Pinpoint application.
 *
 * The ADMChannel resource represents the status and authentication settings for the ADM channel for
 * an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnADMChannel cfnADMChannel = CfnADMChannel.Builder.create(this, "MyCfnADMChannel")
 * .applicationId("applicationId")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html)
 */
@CdkDslMarker
public class CfnADMChannelDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnADMChannel.Builder = CfnADMChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the ADM channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the ADM
     * channel applies to.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * The Client ID that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientid)
     * @param clientId The Client ID that you received from Amazon to send messages by using ADM.
     */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * The Client Secret that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientsecret)
     * @param clientSecret The Client Secret that you received from Amazon to send messages by using
     * ADM.
     */
    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * Specifies whether to enable the ADM channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
     * @param enabled Specifies whether to enable the ADM channel for the application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the ADM channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
     * @param enabled Specifies whether to enable the ADM channel for the application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnADMChannel = cdkBuilder.build()
}
