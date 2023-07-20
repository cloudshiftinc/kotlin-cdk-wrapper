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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateGaugeChartOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GaugeChartOptionsProperty.Builder =
        CfnTemplate.GaugeChartOptionsProperty.builder()

    public fun arc(arc: IResolvable) {
        cdkBuilder.arc(arc)
    }

    public fun arc(arc: CfnTemplate.ArcConfigurationProperty) {
        cdkBuilder.arc(arc)
    }

    public fun arcAxis(arcAxis: IResolvable) {
        cdkBuilder.arcAxis(arcAxis)
    }

    public fun arcAxis(arcAxis: CfnTemplate.ArcAxisConfigurationProperty) {
        cdkBuilder.arcAxis(arcAxis)
    }

    public fun comparison(comparison: IResolvable) {
        cdkBuilder.comparison(comparison)
    }

    public fun comparison(comparison: CfnTemplate.ComparisonConfigurationProperty) {
        cdkBuilder.comparison(comparison)
    }

    public fun primaryValueDisplayType(primaryValueDisplayType: String) {
        cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
    }

    public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    public fun primaryValueFontConfiguration(primaryValueFontConfiguration: CfnTemplate.FontConfigurationProperty) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    public fun build(): CfnTemplate.GaugeChartOptionsProperty = cdkBuilder.build()
}
