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
public class CfnAnalysisFieldSortOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FieldSortOptionsProperty.Builder =
        CfnAnalysis.FieldSortOptionsProperty.builder()

    public fun columnSort(columnSort: IResolvable) {
        cdkBuilder.columnSort(columnSort)
    }

    public fun columnSort(columnSort: CfnAnalysis.ColumnSortProperty) {
        cdkBuilder.columnSort(columnSort)
    }

    public fun fieldSort(fieldSort: IResolvable) {
        cdkBuilder.fieldSort(fieldSort)
    }

    public fun fieldSort(fieldSort: CfnAnalysis.FieldSortProperty) {
        cdkBuilder.fieldSort(fieldSort)
    }

    public fun build(): CfnAnalysis.FieldSortOptionsProperty = cdkBuilder.build()
}
