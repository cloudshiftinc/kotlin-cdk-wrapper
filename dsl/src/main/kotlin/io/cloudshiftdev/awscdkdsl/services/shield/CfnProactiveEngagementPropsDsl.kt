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

package io.cloudshiftdev.awscdkdsl.services.shield

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.shield.CfnProactiveEngagementProps

/**
 * Properties for defining a `CfnProactiveEngagement`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * CfnProactiveEngagementProps cfnProactiveEngagementProps = CfnProactiveEngagementProps.builder()
 * .emergencyContactList(List.of(EmergencyContactProperty.builder()
 * .emailAddress("emailAddress")
 * // the properties below are optional
 * .contactNotes("contactNotes")
 * .phoneNumber("phoneNumber")
 * .build()))
 * .proactiveEngagementStatus("proactiveEngagementStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html)
 */
@CdkDslMarker
public class CfnProactiveEngagementPropsDsl {
    private val cdkBuilder: CfnProactiveEngagementProps.Builder =
        CfnProactiveEngagementProps.builder()

    private val _emergencyContactList: MutableList<Any> = mutableListOf()

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     *   Response Team (SRT) can use to contact you for escalations to the SRT and to initiate
     *   proactive customer support, plus any relevant notes. To enable proactive engagement, the
     *   contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide
     * the hours of availability and time zones for each contact.
     *
     * Example contact notes:
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     *   will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    public fun emergencyContactList(vararg emergencyContactList: Any) {
        _emergencyContactList.addAll(listOf(*emergencyContactList))
    }

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     *   Response Team (SRT) can use to contact you for escalations to the SRT and to initiate
     *   proactive customer support, plus any relevant notes. To enable proactive engagement, the
     *   contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide
     * the hours of availability and time zones for each contact.
     *
     * Example contact notes:
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     *   will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    public fun emergencyContactList(emergencyContactList: Collection<Any>) {
        _emergencyContactList.addAll(emergencyContactList)
    }

    /**
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     *   Response Team (SRT) can use to contact you for escalations to the SRT and to initiate
     *   proactive customer support, plus any relevant notes. To enable proactive engagement, the
     *   contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide
     * the hours of availability and time zones for each contact.
     *
     * Example contact notes:
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     *   will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     */
    public fun emergencyContactList(emergencyContactList: IResolvable) {
        cdkBuilder.emergencyContactList(emergencyContactList)
    }

    /**
     * @param proactiveEngagementStatus Specifies whether proactive engagement is enabled or
     *   disabled.
     *
     * Valid values:
     *
     * `ENABLED` - The Shield Response Team (SRT) will use email and phone to notify contacts about
     * escalations to the SRT and to initiate proactive customer support.
     *
     * `DISABLED` - The SRT will not proactively notify contacts about escalations or to initiate
     * proactive customer support.
     */
    public fun proactiveEngagementStatus(proactiveEngagementStatus: String) {
        cdkBuilder.proactiveEngagementStatus(proactiveEngagementStatus)
    }

    public fun build(): CfnProactiveEngagementProps {
        if (_emergencyContactList.isNotEmpty())
            cdkBuilder.emergencyContactList(_emergencyContactList)
        return cdkBuilder.build()
    }
}
