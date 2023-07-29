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

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.identitystore.CfnGroupMembership

/**
 * An object that contains the identifier of a group member.
 *
 * Setting the `UserID` field to the specific identifier for a user indicates that the user is a
 * member of the group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.identitystore.*;
 * MemberIdProperty memberIdProperty = MemberIdProperty.builder()
 * .userId("userId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-identitystore-groupmembership-memberid.html)
 */
@CdkDslMarker
public class CfnGroupMembershipMemberIdPropertyDsl {
    private val cdkBuilder: CfnGroupMembership.MemberIdProperty.Builder =
        CfnGroupMembership.MemberIdProperty.builder()

    /** @param userId The identifier for a user in the identity store. */
    public fun userId(userId: String) {
        cdkBuilder.userId(userId)
    }

    public fun build(): CfnGroupMembership.MemberIdProperty = cdkBuilder.build()
}
