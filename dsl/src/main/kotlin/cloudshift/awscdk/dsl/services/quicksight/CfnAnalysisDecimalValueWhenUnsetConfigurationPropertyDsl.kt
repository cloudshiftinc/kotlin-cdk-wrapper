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
public class CfnAnalysisDecimalValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DecimalValueWhenUnsetConfigurationProperty.Builder =
        CfnAnalysis.DecimalValueWhenUnsetConfigurationProperty.builder()

    public fun customValue(customValue: Number) {
        cdkBuilder.customValue(customValue)
    }

    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnAnalysis.DecimalValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
