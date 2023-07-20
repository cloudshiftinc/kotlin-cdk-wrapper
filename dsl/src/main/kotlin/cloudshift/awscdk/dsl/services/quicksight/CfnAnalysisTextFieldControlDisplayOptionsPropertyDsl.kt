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
public class CfnAnalysisTextFieldControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TextFieldControlDisplayOptionsProperty.Builder =
        CfnAnalysis.TextFieldControlDisplayOptionsProperty.builder()

    public fun placeholderOptions(placeholderOptions: IResolvable) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    public fun placeholderOptions(placeholderOptions: CfnAnalysis.TextControlPlaceholderOptionsProperty) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnAnalysis.TextFieldControlDisplayOptionsProperty = cdkBuilder.build()
}
