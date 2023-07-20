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
public class CfnDashboardAnalysisDefaultsPropertyDsl {
    private val cdkBuilder: CfnDashboard.AnalysisDefaultsProperty.Builder =
        CfnDashboard.AnalysisDefaultsProperty.builder()

    public fun defaultNewSheetConfiguration(defaultNewSheetConfiguration: IResolvable) {
        cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
    }

    public fun defaultNewSheetConfiguration(defaultNewSheetConfiguration: CfnDashboard.DefaultNewSheetConfigurationProperty) {
        cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
    }

    public fun build(): CfnDashboard.AnalysisDefaultsProperty = cdkBuilder.build()
}
