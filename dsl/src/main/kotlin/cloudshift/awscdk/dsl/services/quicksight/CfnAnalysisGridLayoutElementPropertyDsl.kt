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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAnalysisGridLayoutElementPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GridLayoutElementProperty.Builder =
        CfnAnalysis.GridLayoutElementProperty.builder()

    public fun columnIndex(columnIndex: Number) {
        cdkBuilder.columnIndex(columnIndex)
    }

    public fun columnSpan(columnSpan: Number) {
        cdkBuilder.columnSpan(columnSpan)
    }

    public fun elementId(elementId: String) {
        cdkBuilder.elementId(elementId)
    }

    public fun elementType(elementType: String) {
        cdkBuilder.elementType(elementType)
    }

    public fun rowIndex(rowIndex: Number) {
        cdkBuilder.rowIndex(rowIndex)
    }

    public fun rowSpan(rowSpan: Number) {
        cdkBuilder.rowSpan(rowSpan)
    }

    public fun build(): CfnAnalysis.GridLayoutElementProperty = cdkBuilder.build()
}
