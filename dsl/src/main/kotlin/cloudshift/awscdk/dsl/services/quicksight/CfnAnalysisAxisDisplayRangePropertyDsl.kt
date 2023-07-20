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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class CfnAnalysisAxisDisplayRangePropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisDisplayRangeProperty.Builder =
        CfnAnalysis.AxisDisplayRangeProperty.builder()

    public fun dataDriven(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.dataDriven(builder.map)
    }

    public fun dataDriven(dataDriven: Any) {
        cdkBuilder.dataDriven(dataDriven)
    }

    public fun minMax(minMax: IResolvable) {
        cdkBuilder.minMax(minMax)
    }

    public fun minMax(minMax: CfnAnalysis.AxisDisplayMinMaxRangeProperty) {
        cdkBuilder.minMax(minMax)
    }

    public fun build(): CfnAnalysis.AxisDisplayRangeProperty = cdkBuilder.build()
}
