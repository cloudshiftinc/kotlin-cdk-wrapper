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
public class CfnAnalysisTimeRangeFilterValuePropertyDsl {
    private val cdkBuilder: CfnAnalysis.TimeRangeFilterValueProperty.Builder =
        CfnAnalysis.TimeRangeFilterValueProperty.builder()

    public fun parameter(parameter: String) {
        cdkBuilder.parameter(parameter)
    }

    public fun rollingDate(rollingDate: IResolvable) {
        cdkBuilder.rollingDate(rollingDate)
    }

    public fun rollingDate(rollingDate: CfnAnalysis.RollingDateConfigurationProperty) {
        cdkBuilder.rollingDate(rollingDate)
    }

    public fun staticValue(staticValue: String) {
        cdkBuilder.staticValue(staticValue)
    }

    public fun build(): CfnAnalysis.TimeRangeFilterValueProperty = cdkBuilder.build()
}
