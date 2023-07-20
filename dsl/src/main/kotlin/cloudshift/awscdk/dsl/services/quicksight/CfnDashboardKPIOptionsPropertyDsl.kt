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
public class CfnDashboardKPIOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.KPIOptionsProperty.Builder =
        CfnDashboard.KPIOptionsProperty.builder()

    public fun comparison(comparison: IResolvable) {
        cdkBuilder.comparison(comparison)
    }

    public fun comparison(comparison: CfnDashboard.ComparisonConfigurationProperty) {
        cdkBuilder.comparison(comparison)
    }

    public fun primaryValueDisplayType(primaryValueDisplayType: String) {
        cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
    }

    public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    public fun primaryValueFontConfiguration(primaryValueFontConfiguration: CfnDashboard.FontConfigurationProperty) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    public fun progressBar(progressBar: IResolvable) {
        cdkBuilder.progressBar(progressBar)
    }

    public fun progressBar(progressBar: CfnDashboard.ProgressBarOptionsProperty) {
        cdkBuilder.progressBar(progressBar)
    }

    public fun secondaryValue(secondaryValue: IResolvable) {
        cdkBuilder.secondaryValue(secondaryValue)
    }

    public fun secondaryValue(secondaryValue: CfnDashboard.SecondaryValueOptionsProperty) {
        cdkBuilder.secondaryValue(secondaryValue)
    }

    public fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: IResolvable) {
        cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
    }

    public fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: CfnDashboard.FontConfigurationProperty) {
        cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
    }

    public fun trendArrows(trendArrows: IResolvable) {
        cdkBuilder.trendArrows(trendArrows)
    }

    public fun trendArrows(trendArrows: CfnDashboard.TrendArrowOptionsProperty) {
        cdkBuilder.trendArrows(trendArrows)
    }

    public fun build(): CfnDashboard.KPIOptionsProperty = cdkBuilder.build()
}
