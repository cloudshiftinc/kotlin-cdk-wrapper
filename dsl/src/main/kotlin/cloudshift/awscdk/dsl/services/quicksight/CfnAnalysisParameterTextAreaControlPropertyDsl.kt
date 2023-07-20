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
public class CfnAnalysisParameterTextAreaControlPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ParameterTextAreaControlProperty.Builder =
        CfnAnalysis.ParameterTextAreaControlProperty.builder()

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnAnalysis.TextAreaControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun parameterControlId(parameterControlId: String) {
        cdkBuilder.parameterControlId(parameterControlId)
    }

    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnAnalysis.ParameterTextAreaControlProperty = cdkBuilder.build()
}
