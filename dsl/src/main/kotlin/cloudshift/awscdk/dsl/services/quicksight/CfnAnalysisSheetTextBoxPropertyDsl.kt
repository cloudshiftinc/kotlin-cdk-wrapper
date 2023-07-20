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
import kotlin.String

@CdkDslMarker
public class CfnAnalysisSheetTextBoxPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetTextBoxProperty.Builder =
        CfnAnalysis.SheetTextBoxProperty.builder()

    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    public fun sheetTextBoxId(sheetTextBoxId: String) {
        cdkBuilder.sheetTextBoxId(sheetTextBoxId)
    }

    public fun build(): CfnAnalysis.SheetTextBoxProperty = cdkBuilder.build()
}
