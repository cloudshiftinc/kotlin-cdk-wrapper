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
 * The service control policies (SCP) action definition details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * ScpActionDefinitionProperty scpActionDefinitionProperty = ScpActionDefinitionProperty.builder()
 * .policyId("policyId")
 * .targetIds(List.of("targetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-scpactiondefinition.html)
 */
@CdkDslMarker
public class CfnBudgetsActionScpActionDefinitionPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.ScpActionDefinitionProperty.Builder =
        CfnBudgetsAction.ScpActionDefinitionProperty.builder()

    private val _targetIds: MutableList<String> = mutableListOf()

    /** @param policyId The policy ID attached. */
    public fun policyId(policyId: String) {
        cdkBuilder.policyId(policyId)
    }

    /** @param targetIds A list of target IDs. */
    public fun targetIds(vararg targetIds: String) {
        _targetIds.addAll(listOf(*targetIds))
    }

    /** @param targetIds A list of target IDs. */
    public fun targetIds(targetIds: Collection<String>) {
        _targetIds.addAll(targetIds)
    }

    public fun build(): CfnBudgetsAction.ScpActionDefinitionProperty {
        if (_targetIds.isNotEmpty()) cdkBuilder.targetIds(_targetIds)
        return cdkBuilder.build()
    }
}
