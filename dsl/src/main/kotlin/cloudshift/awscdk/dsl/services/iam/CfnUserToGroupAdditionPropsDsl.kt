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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserToGroupAdditionPropsDsl {
    private val cdkBuilder: CfnUserToGroupAdditionProps.Builder =
        CfnUserToGroupAdditionProps.builder()

    private val _users: MutableList<String> = mutableListOf()

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun users(vararg users: String) {
        _users.addAll(listOf(*users))
    }

    public fun users(users: Collection<String>) {
        _users.addAll(users)
    }

    public fun build(): CfnUserToGroupAdditionProps {
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
