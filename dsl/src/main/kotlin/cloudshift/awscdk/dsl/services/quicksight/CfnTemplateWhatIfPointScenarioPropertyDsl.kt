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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTemplateWhatIfPointScenarioPropertyDsl {
    private val cdkBuilder: CfnTemplate.WhatIfPointScenarioProperty.Builder =
        CfnTemplate.WhatIfPointScenarioProperty.builder()

    public fun date(date: String) {
        cdkBuilder.date(date)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.WhatIfPointScenarioProperty = cdkBuilder.build()
}
