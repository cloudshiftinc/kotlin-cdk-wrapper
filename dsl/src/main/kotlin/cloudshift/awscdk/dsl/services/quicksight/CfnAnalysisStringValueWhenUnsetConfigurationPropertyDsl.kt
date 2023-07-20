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
public class CfnAnalysisStringValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.StringValueWhenUnsetConfigurationProperty.Builder =
        CfnAnalysis.StringValueWhenUnsetConfigurationProperty.builder()

    public fun customValue(customValue: String) {
        cdkBuilder.customValue(customValue)
    }

    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnAnalysis.StringValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
