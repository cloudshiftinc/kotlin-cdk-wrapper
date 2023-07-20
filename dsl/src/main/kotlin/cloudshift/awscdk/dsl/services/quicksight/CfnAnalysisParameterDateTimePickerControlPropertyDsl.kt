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
public class CfnAnalysisParameterDateTimePickerControlPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ParameterDateTimePickerControlProperty.Builder =
        CfnAnalysis.ParameterDateTimePickerControlProperty.builder()

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnAnalysis.DateTimePickerControlDisplayOptionsProperty) {
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

    public fun build(): CfnAnalysis.ParameterDateTimePickerControlProperty = cdkBuilder.build()
}
