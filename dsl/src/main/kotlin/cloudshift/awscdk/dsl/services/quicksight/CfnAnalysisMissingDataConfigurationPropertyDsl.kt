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
public class CfnAnalysisMissingDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.MissingDataConfigurationProperty.Builder =
        CfnAnalysis.MissingDataConfigurationProperty.builder()

    public fun treatmentOption(treatmentOption: String) {
        cdkBuilder.treatmentOption(treatmentOption)
    }

    public fun build(): CfnAnalysis.MissingDataConfigurationProperty = cdkBuilder.build()
}
