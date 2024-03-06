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
import software.amazon.awscdk.services.shield.CfnProactiveEngagement
import software.constructs.Construct

/**
 * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about
 * escalations to the SRT and to initiate proactive customer support.
 *
 * To enable proactive engagement, you must be subscribed to the
 * [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the
 * [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
 *
 * *Configure `AWS::Shield::ProactiveEngagement` for one account*
 *
 * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
 * Advanced . You can subscribe through the
 * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs. For
 * more information, see
 * [Subscribe to AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html)
 * .
 *
 * See example templates for Shield Advanced in AWS CloudFormation at
 * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
 * .
 *
 * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
 *
 * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield Advanced
 * across multiple accounts and protected resources. To do this, your accounts must be part of an
 * organization in AWS Organizations . You can use Firewall Manager to configure Shield Advanced
 * protections for any resource types except for Amazon Route 53 or AWS Global Accelerator .
 *
 * For an example of this, see the one-click configuration guidance published by the AWS technical
 * community at
 * [One-click deployment of Shield Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * CfnProactiveEngagement cfnProactiveEngagement = CfnProactiveEngagement.Builder.create(this,
 * "MyCfnProactiveEngagement")
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
public class CfnProactiveEngagementDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProactiveEngagement.Builder =
        CfnProactiveEngagement.Builder.create(scope, id)

    private val _emergencyContactList: MutableList<Any> = mutableListOf()

    /**
     * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
     * contact you for escalations to the SRT and to initiate proactive customer support, plus any
     * relevant notes.
     *
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide
     * the hours of availability and time zones for each contact.
     *
     * Example contact notes:
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     *   will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-emergencycontactlist)
     *
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     *   Response Team (SRT) can use to contact you for escalations to the SRT and to initiate
     *   proactive customer support, plus any relevant notes.
     */
    public fun emergencyContactList(vararg emergencyContactList: Any) {
        _emergencyContactList.addAll(listOf(*emergencyContactList))
    }

    /**
     * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
     * contact you for escalations to the SRT and to initiate proactive customer support, plus any
     * relevant notes.
     *
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide
     * the hours of availability and time zones for each contact.
     *
     * Example contact notes:
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     *   will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-emergencycontactlist)
     *
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     *   Response Team (SRT) can use to contact you for escalations to the SRT and to initiate
     *   proactive customer support, plus any relevant notes.
     */
    public fun emergencyContactList(emergencyContactList: Collection<Any>) {
        _emergencyContactList.addAll(emergencyContactList)
    }

    /**
     * The list of email addresses and phone numbers that the Shield Response Team (SRT) can use to
     * contact you for escalations to the SRT and to initiate proactive customer support, plus any
     * relevant notes.
     *
     * To enable proactive engagement, the contact list must include at least one phone number.
     *
     * If you provide more than one contact, in the notes, indicate the circumstances under which
     * each contact should be used. Include primary and secondary contact designations, and provide
     * the hours of availability and time zones for each contact.
     *
     * Example contact notes:
     * * This is a hotline that's staffed 24x7x365. Please work with the responding analyst and they
     *   will get the appropriate person on the call.
     * * Please contact the secondary phone number if the hotline doesn't respond within 5 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-emergencycontactlist)
     *
     * @param emergencyContactList The list of email addresses and phone numbers that the Shield
     *   Response Team (SRT) can use to contact you for escalations to the SRT and to initiate
     *   proactive customer support, plus any relevant notes.
     */
    public fun emergencyContactList(emergencyContactList: IResolvable) {
        cdkBuilder.emergencyContactList(emergencyContactList)
    }

    /**
     * Specifies whether proactive engagement is enabled or disabled.
     *
     * Valid values:
     *
     * `ENABLED` - The Shield Response Team (SRT) will use email and phone to notify contacts about
     * escalations to the SRT and to initiate proactive customer support.
     *
     * `DISABLED` - The SRT will not proactively notify contacts about escalations or to initiate
     * proactive customer support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html#cfn-shield-proactiveengagement-proactiveengagementstatus)
     *
     * @param proactiveEngagementStatus Specifies whether proactive engagement is enabled or
     *   disabled.
     */
    public fun proactiveEngagementStatus(proactiveEngagementStatus: String) {
        cdkBuilder.proactiveEngagementStatus(proactiveEngagementStatus)
    }

    public fun build(): CfnProactiveEngagement {
        if (_emergencyContactList.isNotEmpty())
            cdkBuilder.emergencyContactList(_emergencyContactList)
        return cdkBuilder.build()
    }
}
