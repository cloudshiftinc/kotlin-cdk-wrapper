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

package cloudshift.awscdk.dsl.services.identitystore

import software.amazon.awscdk.services.identitystore.CfnGroup
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps
import software.amazon.awscdk.services.identitystore.CfnGroupProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object identitystore {
    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupMembership(
        scope: Construct,
        id: String,
        block: CfnGroupMembershipDsl.() -> Unit = {},
    ): CfnGroupMembership {
        val builder = CfnGroupMembershipDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupMembershipMemberIdProperty(
        block: CfnGroupMembershipMemberIdPropertyDsl.() -> Unit =
            {},
    ): CfnGroupMembership.MemberIdProperty {
        val builder = CfnGroupMembershipMemberIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupMembershipProps(block: CfnGroupMembershipPropsDsl.() -> Unit = {}): CfnGroupMembershipProps {
        val builder = CfnGroupMembershipPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
