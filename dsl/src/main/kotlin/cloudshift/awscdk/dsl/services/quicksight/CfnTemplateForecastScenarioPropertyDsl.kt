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

@CdkDslMarker
public class CfnTemplateForecastScenarioPropertyDsl {
    private val cdkBuilder: CfnTemplate.ForecastScenarioProperty.Builder =
        CfnTemplate.ForecastScenarioProperty.builder()

    public fun whatIfPointScenario(whatIfPointScenario: IResolvable) {
        cdkBuilder.whatIfPointScenario(whatIfPointScenario)
    }

    public fun whatIfPointScenario(whatIfPointScenario: CfnTemplate.WhatIfPointScenarioProperty) {
        cdkBuilder.whatIfPointScenario(whatIfPointScenario)
    }

    public fun whatIfRangeScenario(whatIfRangeScenario: IResolvable) {
        cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
    }

    public fun whatIfRangeScenario(whatIfRangeScenario: CfnTemplate.WhatIfRangeScenarioProperty) {
        cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
    }

    public fun build(): CfnTemplate.ForecastScenarioProperty = cdkBuilder.build()
}
