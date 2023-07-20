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

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBudgetsActionIamActionDefinitionPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.IamActionDefinitionProperty.Builder =
        CfnBudgetsAction.IamActionDefinitionProperty.builder()

    private val _groups: MutableList<String> = mutableListOf()

    private val _roles: MutableList<String> = mutableListOf()

    private val _users: MutableList<String> = mutableListOf()

    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    public fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
    }

    public fun roles(vararg roles: String) {
        _roles.addAll(listOf(*roles))
    }

    public fun roles(roles: Collection<String>) {
        _roles.addAll(roles)
    }

    public fun users(vararg users: String) {
        _users.addAll(listOf(*users))
    }

    public fun users(users: Collection<String>) {
        _users.addAll(users)
    }

    public fun build(): CfnBudgetsAction.IamActionDefinitionProperty {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
