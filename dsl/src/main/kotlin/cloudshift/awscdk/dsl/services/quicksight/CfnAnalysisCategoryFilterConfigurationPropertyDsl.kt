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
public class CfnAnalysisCategoryFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CategoryFilterConfigurationProperty.Builder =
        CfnAnalysis.CategoryFilterConfigurationProperty.builder()

    public fun customFilterConfiguration(customFilterConfiguration: IResolvable) {
        cdkBuilder.customFilterConfiguration(customFilterConfiguration)
    }

    public fun customFilterConfiguration(customFilterConfiguration: CfnAnalysis.CustomFilterConfigurationProperty) {
        cdkBuilder.customFilterConfiguration(customFilterConfiguration)
    }

    public fun customFilterListConfiguration(customFilterListConfiguration: IResolvable) {
        cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
    }

    public fun customFilterListConfiguration(customFilterListConfiguration: CfnAnalysis.CustomFilterListConfigurationProperty) {
        cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
    }

    public fun filterListConfiguration(filterListConfiguration: IResolvable) {
        cdkBuilder.filterListConfiguration(filterListConfiguration)
    }

    public fun filterListConfiguration(filterListConfiguration: CfnAnalysis.FilterListConfigurationProperty) {
        cdkBuilder.filterListConfiguration(filterListConfiguration)
    }

    public fun build(): CfnAnalysis.CategoryFilterConfigurationProperty = cdkBuilder.build()
}
