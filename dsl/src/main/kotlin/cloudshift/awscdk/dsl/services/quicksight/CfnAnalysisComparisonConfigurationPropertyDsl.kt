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
public class CfnAnalysisComparisonConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ComparisonConfigurationProperty.Builder =
        CfnAnalysis.ComparisonConfigurationProperty.builder()

    public fun comparisonFormat(comparisonFormat: IResolvable) {
        cdkBuilder.comparisonFormat(comparisonFormat)
    }

    public fun comparisonFormat(comparisonFormat: CfnAnalysis.ComparisonFormatConfigurationProperty) {
        cdkBuilder.comparisonFormat(comparisonFormat)
    }

    public fun comparisonMethod(comparisonMethod: String) {
        cdkBuilder.comparisonMethod(comparisonMethod)
    }

    public fun build(): CfnAnalysis.ComparisonConfigurationProperty = cdkBuilder.build()
}
