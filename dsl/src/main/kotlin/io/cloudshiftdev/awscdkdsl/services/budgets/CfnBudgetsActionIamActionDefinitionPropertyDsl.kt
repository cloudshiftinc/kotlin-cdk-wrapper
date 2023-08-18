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

package io.cloudshiftdev.awscdkdsl.services.budgets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

/**
 * The AWS Identity and Access Management ( IAM ) action definition details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * IamActionDefinitionProperty iamActionDefinitionProperty = IamActionDefinitionProperty.builder()
 * .policyArn("policyArn")
 * // the properties below are optional
 * .groups(List.of("groups"))
 * .roles(List.of("roles"))
 * .users(List.of("users"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html)
 */
@CdkDslMarker
public class CfnBudgetsActionIamActionDefinitionPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.IamActionDefinitionProperty.Builder =
        CfnBudgetsAction.IamActionDefinitionProperty.builder()

    private val _groups: MutableList<String> = mutableListOf()

    private val _roles: MutableList<String> = mutableListOf()

    private val _users: MutableList<String> = mutableListOf()

    /** @param groups A list of groups to be attached. There must be at least one group. */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /** @param groups A list of groups to be attached. There must be at least one group. */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    /** @param policyArn The Amazon Resource Name (ARN) of the policy to be attached. */
    public fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
    }

    /** @param roles A list of roles to be attached. There must be at least one role. */
    public fun roles(vararg roles: String) {
        _roles.addAll(listOf(*roles))
    }

    /** @param roles A list of roles to be attached. There must be at least one role. */
    public fun roles(roles: Collection<String>) {
        _roles.addAll(roles)
    }

    /** @param users A list of users to be attached. There must be at least one user. */
    public fun users(vararg users: String) {
        _users.addAll(listOf(*users))
    }

    /** @param users A list of users to be attached. There must be at least one user. */
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
