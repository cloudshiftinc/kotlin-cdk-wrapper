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

@CdkDslMarker
public class CfnAnalysisTreeMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TreeMapFieldWellsProperty.Builder =
        CfnAnalysis.TreeMapFieldWellsProperty.builder()

    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: CfnAnalysis.TreeMapAggregatedFieldWellsProperty) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.TreeMapFieldWellsProperty = cdkBuilder.build()
}
