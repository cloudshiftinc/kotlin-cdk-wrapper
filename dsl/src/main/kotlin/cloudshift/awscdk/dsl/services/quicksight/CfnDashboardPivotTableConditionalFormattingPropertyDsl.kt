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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardPivotTableConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableConditionalFormattingProperty.Builder =
        CfnDashboard.PivotTableConditionalFormattingProperty.builder()

    private val _conditionalFormattingOptions: MutableList<Any> = mutableListOf()

    public fun conditionalFormattingOptions(vararg conditionalFormattingOptions: Any) {
        _conditionalFormattingOptions.addAll(listOf(*conditionalFormattingOptions))
    }

    public fun conditionalFormattingOptions(conditionalFormattingOptions: Collection<Any>) {
        _conditionalFormattingOptions.addAll(conditionalFormattingOptions)
    }

    public fun conditionalFormattingOptions(conditionalFormattingOptions: IResolvable) {
        cdkBuilder.conditionalFormattingOptions(conditionalFormattingOptions)
    }

    public fun build(): CfnDashboard.PivotTableConditionalFormattingProperty {
        if (_conditionalFormattingOptions.isNotEmpty()) {
            cdkBuilder.conditionalFormattingOptions(_conditionalFormattingOptions)
        }
        return cdkBuilder.build()
    }
}
