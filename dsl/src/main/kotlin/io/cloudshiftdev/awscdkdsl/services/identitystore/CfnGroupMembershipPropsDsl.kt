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

package io.cloudshiftdev.awscdkdsl.services.identitystore

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps

/**
 * Properties for defining a `CfnGroupMembership`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.identitystore.*;
 * CfnGroupMembershipProps cfnGroupMembershipProps = CfnGroupMembershipProps.builder()
 * .groupId("groupId")
 * .identityStoreId("identityStoreId")
 * .memberId(MemberIdProperty.builder()
 * .userId("userId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html)
 */
@CdkDslMarker
public class CfnGroupMembershipPropsDsl {
    private val cdkBuilder: CfnGroupMembershipProps.Builder = CfnGroupMembershipProps.builder()

    /** @param groupId The unique identifier for a group in the identity store. */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    /** @param identityStoreId The globally unique identifier for the identity store. */
    public fun identityStoreId(identityStoreId: String) {
        cdkBuilder.identityStoreId(identityStoreId)
    }

    /**
     * @param memberId An object containing the identifier of a group member. Setting `MemberId` 's
     *   `UserId` field to a specific User's ID indicates we should consider that User as a group
     *   member.
     */
    public fun memberId(memberId: IResolvable) {
        cdkBuilder.memberId(memberId)
    }

    /**
     * @param memberId An object containing the identifier of a group member. Setting `MemberId` 's
     *   `UserId` field to a specific User's ID indicates we should consider that User as a group
     *   member.
     */
    public fun memberId(memberId: CfnGroupMembership.MemberIdProperty) {
        cdkBuilder.memberId(memberId)
    }

    public fun build(): CfnGroupMembershipProps = cdkBuilder.build()
}
