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
import kotlin.String
import software.amazon.awscdk.services.shield.CfnProactiveEngagement

/**
 * Contact information that the SRT can use to contact you if you have proactive engagement enabled,
 * for escalations to the SRT and to initiate proactive customer support.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * EmergencyContactProperty emergencyContactProperty = EmergencyContactProperty.builder()
 * .emailAddress("emailAddress")
 * // the properties below are optional
 * .contactNotes("contactNotes")
 * .phoneNumber("phoneNumber")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html)
 */
@CdkDslMarker
public class CfnProactiveEngagementEmergencyContactPropertyDsl {
    private val cdkBuilder: CfnProactiveEngagement.EmergencyContactProperty.Builder =
        CfnProactiveEngagement.EmergencyContactProperty.builder()

    /** @param contactNotes Additional notes regarding the contact. */
    public fun contactNotes(contactNotes: String) {
        cdkBuilder.contactNotes(contactNotes)
    }

    /** @param emailAddress The email address for the contact. */
    public fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
    }

    /** @param phoneNumber The phone number for the contact. */
    public fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
    }

    public fun build(): CfnProactiveEngagement.EmergencyContactProperty = cdkBuilder.build()
}
