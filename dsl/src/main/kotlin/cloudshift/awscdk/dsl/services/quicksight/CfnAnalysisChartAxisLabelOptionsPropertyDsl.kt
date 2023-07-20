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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisChartAxisLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ChartAxisLabelOptionsProperty.Builder =
        CfnAnalysis.ChartAxisLabelOptionsProperty.builder()

    private val _axisLabelOptions: MutableList<Any> = mutableListOf()

    public fun axisLabelOptions(vararg axisLabelOptions: Any) {
        _axisLabelOptions.addAll(listOf(*axisLabelOptions))
    }

    public fun axisLabelOptions(axisLabelOptions: Collection<Any>) {
        _axisLabelOptions.addAll(axisLabelOptions)
    }

    public fun axisLabelOptions(axisLabelOptions: IResolvable) {
        cdkBuilder.axisLabelOptions(axisLabelOptions)
    }

    public fun sortIconVisibility(sortIconVisibility: String) {
        cdkBuilder.sortIconVisibility(sortIconVisibility)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.ChartAxisLabelOptionsProperty {
        if (_axisLabelOptions.isNotEmpty()) cdkBuilder.axisLabelOptions(_axisLabelOptions)
        return cdkBuilder.build()
    }
}
