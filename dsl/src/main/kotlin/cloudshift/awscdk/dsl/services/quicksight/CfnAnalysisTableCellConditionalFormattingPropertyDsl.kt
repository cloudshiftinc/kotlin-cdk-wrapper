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
public class CfnAnalysisTableCellConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableCellConditionalFormattingProperty.Builder =
        CfnAnalysis.TableCellConditionalFormattingProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun textFormat(textFormat: IResolvable) {
        cdkBuilder.textFormat(textFormat)
    }

    public fun textFormat(textFormat: CfnAnalysis.TextConditionalFormatProperty) {
        cdkBuilder.textFormat(textFormat)
    }

    public fun build(): CfnAnalysis.TableCellConditionalFormattingProperty = cdkBuilder.build()
}
