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
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannel
import software.constructs.Construct

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * To send a voice message, you send the message through the voice channel. Before you can use
 * Amazon Pinpoint to send voice messages, you have to enable the voice channel for an Amazon
 * Pinpoint application.
 *
 * The VoiceChannel resource represents the status and other information about the voice channel for
 * an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnVoiceChannel cfnVoiceChannel = CfnVoiceChannel.Builder.create(this, "MyCfnVoiceChannel")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html)
 */
@CdkDslMarker
public class CfnVoiceChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVoiceChannel.Builder = CfnVoiceChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the voice channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-applicationid)
     *
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the voice
     *   channel applies to.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * Specifies whether to enable the voice channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
     *
     * @param enabled Specifies whether to enable the voice channel for the application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the voice channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
     *
     * @param enabled Specifies whether to enable the voice channel for the application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnVoiceChannel = cdkBuilder.build()
}
