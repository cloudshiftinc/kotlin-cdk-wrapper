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
public class CfnAnalysisFilterTextAreaControlPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterTextAreaControlProperty.Builder =
        CfnAnalysis.FilterTextAreaControlProperty.builder()

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnAnalysis.TextAreaControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun filterControlId(filterControlId: String) {
        cdkBuilder.filterControlId(filterControlId)
    }

    public fun sourceFilterId(sourceFilterId: String) {
        cdkBuilder.sourceFilterId(sourceFilterId)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnAnalysis.FilterTextAreaControlProperty = cdkBuilder.build()
}
