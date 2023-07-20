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
public class CfnBudgetsActionScpActionDefinitionPropertyDsl {
    private val cdkBuilder: CfnBudgetsAction.ScpActionDefinitionProperty.Builder =
        CfnBudgetsAction.ScpActionDefinitionProperty.builder()

    private val _targetIds: MutableList<String> = mutableListOf()

    public fun policyId(policyId: String) {
        cdkBuilder.policyId(policyId)
    }

    public fun targetIds(vararg targetIds: String) {
        _targetIds.addAll(listOf(*targetIds))
    }

    public fun targetIds(targetIds: Collection<String>) {
        _targetIds.addAll(targetIds)
    }

    public fun build(): CfnBudgetsAction.ScpActionDefinitionProperty {
        if (_targetIds.isNotEmpty()) cdkBuilder.targetIds(_targetIds)
        return cdkBuilder.build()
    }
}
