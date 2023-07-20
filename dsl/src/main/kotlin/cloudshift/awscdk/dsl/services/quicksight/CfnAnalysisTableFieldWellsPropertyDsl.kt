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
public class CfnAnalysisTableFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableFieldWellsProperty.Builder =
        CfnAnalysis.TableFieldWellsProperty.builder()

    public fun tableAggregatedFieldWells(tableAggregatedFieldWells: IResolvable) {
        cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
    }

    public fun tableAggregatedFieldWells(tableAggregatedFieldWells: CfnAnalysis.TableAggregatedFieldWellsProperty) {
        cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
    }

    public fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: IResolvable) {
        cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
    }

    public fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: CfnAnalysis.TableUnaggregatedFieldWellsProperty) {
        cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.TableFieldWellsProperty = cdkBuilder.build()
}
