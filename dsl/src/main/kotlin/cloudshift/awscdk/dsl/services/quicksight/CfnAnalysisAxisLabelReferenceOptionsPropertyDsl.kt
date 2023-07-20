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
import kotlin.String

@CdkDslMarker
public class CfnAnalysisAxisLabelReferenceOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisLabelReferenceOptionsProperty.Builder =
        CfnAnalysis.AxisLabelReferenceOptionsProperty.builder()

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnAnalysis.AxisLabelReferenceOptionsProperty = cdkBuilder.build()
}
