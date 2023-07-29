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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.guardduty.CfnMaster
import software.constructs.Construct

/**
 * You can use the `AWS::GuardDuty::Master` resource in a GuardDuty member account to accept an
 * invitation from a GuardDuty administrator account.
 *
 * The invitation to the member account must be sent prior to using the `AWS::GuardDuty::Master`
 * resource to accept the administrator account's invitation. You can invite a member account by
 * using the `InviteMembers` operation of the GuardDuty API, or by creating an
 * `AWS::GuardDuty::Member` resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CfnMaster cfnMaster = CfnMaster.Builder.create(this, "MyCfnMaster")
 * .detectorId("detectorId")
 * .masterId("masterId")
 * // the properties below are optional
 * .invitationId("invitationId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html)
 */
@CdkDslMarker
public class CfnMasterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMaster.Builder = CfnMaster.Builder.create(scope, id)

    /**
     * The unique ID of the detector of the GuardDuty member account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-detectorid)
     *
     * @param detectorId The unique ID of the detector of the GuardDuty member account.
     */
    public fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
    }

    /**
     * The ID of the invitation that is sent to the account designated as a member account.
     *
     * You can find the invitation ID by using the ListInvitation action of the GuardDuty API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-invitationid)
     *
     * @param invitationId The ID of the invitation that is sent to the account designated as a
     *   member account.
     */
    public fun invitationId(invitationId: String) {
        cdkBuilder.invitationId(invitationId)
    }

    /**
     * The AWS account ID of the account designated as the GuardDuty administrator account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-master.html#cfn-guardduty-master-masterid)
     *
     * @param masterId The AWS account ID of the account designated as the GuardDuty administrator
     *   account.
     */
    public fun masterId(masterId: String) {
        cdkBuilder.masterId(masterId)
    }

    public fun build(): CfnMaster = cdkBuilder.build()
}
