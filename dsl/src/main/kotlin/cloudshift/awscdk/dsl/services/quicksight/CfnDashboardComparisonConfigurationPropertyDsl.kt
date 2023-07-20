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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardComparisonConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ComparisonConfigurationProperty.Builder =
        CfnDashboard.ComparisonConfigurationProperty.builder()

    public fun comparisonFormat(comparisonFormat: IResolvable) {
        cdkBuilder.comparisonFormat(comparisonFormat)
    }

    public fun comparisonFormat(comparisonFormat: CfnDashboard.ComparisonFormatConfigurationProperty) {
        cdkBuilder.comparisonFormat(comparisonFormat)
    }

    public fun comparisonMethod(comparisonMethod: String) {
        cdkBuilder.comparisonMethod(comparisonMethod)
    }

    public fun build(): CfnDashboard.ComparisonConfigurationProperty = cdkBuilder.build()
}
