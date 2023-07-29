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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnGroup
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps
import software.amazon.awscdk.services.identitystore.CfnGroupProps
import software.constructs.Construct

public object identitystore {
    /**
     * A group object, which contains a specified group’s metadata and attributes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.identitystore.*;
     * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
     * .displayName("displayName")
     * .identityStoreId("identityStoreId")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html)
     */
    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the identifiers for a group, a group member, and a `GroupMembership` object in the
     * identity store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.identitystore.*;
     * CfnGroupMembership cfnGroupMembership = CfnGroupMembership.Builder.create(this,
     * "MyCfnGroupMembership")
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
    public inline fun cfnGroupMembership(
        scope: Construct,
        id: String,
        block: CfnGroupMembershipDsl.() -> Unit = {},
    ): CfnGroupMembership {
        val builder = CfnGroupMembershipDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnGroupMembershipMemberIdProperty(
        block: CfnGroupMembershipMemberIdPropertyDsl.() -> Unit = {}
    ): CfnGroupMembership.MemberIdProperty {
        val builder = CfnGroupMembershipMemberIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnGroupMembershipProps(
        block: CfnGroupMembershipPropsDsl.() -> Unit = {}
    ): CfnGroupMembershipProps {
        val builder = CfnGroupMembershipPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.identitystore.*;
     * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
     * .displayName("displayName")
     * .identityStoreId("identityStoreId")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html)
     */
    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
