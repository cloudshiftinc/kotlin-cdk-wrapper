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
public class CfnAnalysisFilledMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilledMapFieldWellsProperty.Builder =
        CfnAnalysis.FilledMapFieldWellsProperty.builder()

    public fun filledMapAggregatedFieldWells(filledMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.filledMapAggregatedFieldWells(filledMapAggregatedFieldWells)
    }

    public fun filledMapAggregatedFieldWells(filledMapAggregatedFieldWells: CfnAnalysis.FilledMapAggregatedFieldWellsProperty) {
        cdkBuilder.filledMapAggregatedFieldWells(filledMapAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.FilledMapFieldWellsProperty = cdkBuilder.build()
}
