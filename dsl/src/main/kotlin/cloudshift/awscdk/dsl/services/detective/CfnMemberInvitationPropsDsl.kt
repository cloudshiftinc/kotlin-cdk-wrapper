@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.detective.CfnMemberInvitationProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnMemberInvitationPropsDsl {
    private val cdkBuilder: CfnMemberInvitationProps.Builder = CfnMemberInvitationProps.builder()

    public fun disableEmailNotification(disableEmailNotification: Boolean) {
        cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    public fun disableEmailNotification(disableEmailNotification: IResolvable) {
        cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    public fun graphArn(graphArn: String) {
        cdkBuilder.graphArn(graphArn)
    }

    public fun memberEmailAddress(memberEmailAddress: String) {
        cdkBuilder.memberEmailAddress(memberEmailAddress)
    }

    public fun memberId(memberId: String) {
        cdkBuilder.memberId(memberId)
    }

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnMemberInvitationProps = cdkBuilder.build()
}
