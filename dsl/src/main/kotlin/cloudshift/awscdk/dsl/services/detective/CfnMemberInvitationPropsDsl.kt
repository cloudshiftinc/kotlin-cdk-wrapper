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

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.detective.CfnMemberInvitationProps

/**
 * Properties for defining a `CfnMemberInvitation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.detective.*;
 * CfnMemberInvitationProps cfnMemberInvitationProps = CfnMemberInvitationProps.builder()
 * .graphArn("graphArn")
 * .memberEmailAddress("memberEmailAddress")
 * .memberId("memberId")
 * // the properties below are optional
 * .disableEmailNotification(false)
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-memberinvitation.html)
 */
@CdkDslMarker
public class CfnMemberInvitationPropsDsl {
    private val cdkBuilder: CfnMemberInvitationProps.Builder = CfnMemberInvitationProps.builder()

    /**
     * @param disableEmailNotification Whether to send an invitation email to the member account. If
     *   set to true, the member account does not receive an invitation email.
     */
    public fun disableEmailNotification(disableEmailNotification: Boolean) {
        cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    /**
     * @param disableEmailNotification Whether to send an invitation email to the member account. If
     *   set to true, the member account does not receive an invitation email.
     */
    public fun disableEmailNotification(disableEmailNotification: IResolvable) {
        cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    /**
     * @param graphArn The ARN of the behavior graph to invite the account to contribute data to.
     */
    public fun graphArn(graphArn: String) {
        cdkBuilder.graphArn(graphArn)
    }

    /**
     * @param memberEmailAddress The root user email address of the invited account. If the email
     *   address provided is not the root user email address for the provided account, the
     *   invitation creation fails.
     */
    public fun memberEmailAddress(memberEmailAddress: String) {
        cdkBuilder.memberEmailAddress(memberEmailAddress)
    }

    /** @param memberId The AWS account identifier of the invited account. */
    public fun memberId(memberId: String) {
        cdkBuilder.memberId(memberId)
    }

    /** @param message Customized text to include in the invitation email message. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnMemberInvitationProps = cdkBuilder.build()
}
