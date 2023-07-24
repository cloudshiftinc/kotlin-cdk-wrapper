@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssmcontacts.CfnContact
import kotlin.Number
import kotlin.String

/**
 * Information about the contact channel that Incident Manager uses to engage the contact.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * ChannelTargetInfoProperty channelTargetInfoProperty = ChannelTargetInfoProperty.builder()
 * .channelId("channelId")
 * .retryIntervalInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-channeltargetinfo.html)
 */
@CdkDslMarker
public class CfnContactChannelTargetInfoPropertyDsl {
    private val cdkBuilder: CfnContact.ChannelTargetInfoProperty.Builder =
        CfnContact.ChannelTargetInfoProperty.builder()

    /**
     * @param channelId The Amazon Resource Name (ARN) of the contact channel.
     */
    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    /**
     * @param retryIntervalInMinutes The number of minutes to wait before retrying to send engagement
     * if the engagement initially failed.
     */
    public fun retryIntervalInMinutes(retryIntervalInMinutes: Number) {
        cdkBuilder.retryIntervalInMinutes(retryIntervalInMinutes)
    }

    public fun build(): CfnContact.ChannelTargetInfoProperty = cdkBuilder.build()
}
