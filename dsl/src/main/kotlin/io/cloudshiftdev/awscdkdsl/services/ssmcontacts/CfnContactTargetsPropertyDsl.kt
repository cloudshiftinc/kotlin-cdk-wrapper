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

package io.cloudshiftdev.awscdkdsl.services.ssmcontacts

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact

/**
 * The contact or contact channel that's being engaged.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * TargetsProperty targetsProperty = TargetsProperty.builder()
 * .channelTargetInfo(ChannelTargetInfoProperty.builder()
 * .channelId("channelId")
 * .retryIntervalInMinutes(123)
 * .build())
 * .contactTargetInfo(ContactTargetInfoProperty.builder()
 * .contactId("contactId")
 * .isEssential(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-targets.html)
 */
@CdkDslMarker
public class CfnContactTargetsPropertyDsl {
    private val cdkBuilder: CfnContact.TargetsProperty.Builder =
        CfnContact.TargetsProperty.builder()

    /**
     * @param channelTargetInfo Information about the contact channel that Incident Manager engages.
     */
    public fun channelTargetInfo(channelTargetInfo: IResolvable) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    /**
     * @param channelTargetInfo Information about the contact channel that Incident Manager engages.
     */
    public fun channelTargetInfo(channelTargetInfo: CfnContact.ChannelTargetInfoProperty) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    /**
     * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
     */
    public fun contactTargetInfo(contactTargetInfo: IResolvable) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    /**
     * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
     */
    public fun contactTargetInfo(contactTargetInfo: CfnContact.ContactTargetInfoProperty) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    public fun build(): CfnContact.TargetsProperty = cdkBuilder.build()
}
