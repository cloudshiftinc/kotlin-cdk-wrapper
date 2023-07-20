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
import software.amazon.awscdk.services.budgets.CfnBudget
import kotlin.String

@CdkDslMarker
public class CfnBudgetTimePeriodPropertyDsl {
    private val cdkBuilder: CfnBudget.TimePeriodProperty.Builder =
        CfnBudget.TimePeriodProperty.builder()

    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnBudget.TimePeriodProperty = cdkBuilder.build()
}
