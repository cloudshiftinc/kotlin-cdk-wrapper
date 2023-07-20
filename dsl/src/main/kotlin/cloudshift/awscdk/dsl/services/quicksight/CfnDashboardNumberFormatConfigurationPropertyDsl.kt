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

@CdkDslMarker
public class CfnDashboardNumberFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.NumberFormatConfigurationProperty.Builder =
        CfnDashboard.NumberFormatConfigurationProperty.builder()

    public fun formatConfiguration(formatConfiguration: IResolvable) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun formatConfiguration(formatConfiguration: CfnDashboard.NumericFormatConfigurationProperty) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun build(): CfnDashboard.NumberFormatConfigurationProperty = cdkBuilder.build()
}
