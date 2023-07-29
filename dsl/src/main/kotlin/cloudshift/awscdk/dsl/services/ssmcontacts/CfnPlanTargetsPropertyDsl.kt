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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnPlan

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-plan-targets.html)
 */
@CdkDslMarker
public class CfnPlanTargetsPropertyDsl {
    private val cdkBuilder: CfnPlan.TargetsProperty.Builder = CfnPlan.TargetsProperty.builder()

    /**
     * @param channelTargetInfo Information about the contact channel that Incident Manager engages.
     */
    public fun channelTargetInfo(channelTargetInfo: IResolvable) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    /**
     * @param channelTargetInfo Information about the contact channel that Incident Manager engages.
     */
    public fun channelTargetInfo(channelTargetInfo: CfnPlan.ChannelTargetInfoProperty) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    /** @param contactTargetInfo Information about the contact that Incident Manager engages. */
    public fun contactTargetInfo(contactTargetInfo: IResolvable) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    /** @param contactTargetInfo Information about the contact that Incident Manager engages. */
    public fun contactTargetInfo(contactTargetInfo: CfnPlan.ContactTargetInfoProperty) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    public fun build(): CfnPlan.TargetsProperty = cdkBuilder.build()
}
