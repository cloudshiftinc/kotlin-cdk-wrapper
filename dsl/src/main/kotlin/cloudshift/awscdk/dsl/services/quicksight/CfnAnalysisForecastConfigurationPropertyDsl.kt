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
public class CfnAnalysisForecastConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ForecastConfigurationProperty.Builder =
        CfnAnalysis.ForecastConfigurationProperty.builder()

    public fun forecastProperties(forecastProperties: IResolvable) {
        cdkBuilder.forecastProperties(forecastProperties)
    }

    public fun forecastProperties(forecastProperties: CfnAnalysis.TimeBasedForecastPropertiesProperty) {
        cdkBuilder.forecastProperties(forecastProperties)
    }

    public fun scenario(scenario: IResolvable) {
        cdkBuilder.scenario(scenario)
    }

    public fun scenario(scenario: CfnAnalysis.ForecastScenarioProperty) {
        cdkBuilder.scenario(scenario)
    }

    public fun build(): CfnAnalysis.ForecastConfigurationProperty = cdkBuilder.build()
}
