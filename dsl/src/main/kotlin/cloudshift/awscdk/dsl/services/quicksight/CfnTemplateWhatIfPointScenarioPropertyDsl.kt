@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Provides the forecast to meet the target for a particular date.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * WhatIfPointScenarioProperty whatIfPointScenarioProperty = WhatIfPointScenarioProperty.builder()
 * .date("date")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-whatifpointscenario.html)
 */
@CdkDslMarker
public class CfnTemplateWhatIfPointScenarioPropertyDsl {
    private val cdkBuilder: CfnTemplate.WhatIfPointScenarioProperty.Builder =
        CfnTemplate.WhatIfPointScenarioProperty.builder()

    /** @param date The date that you need the forecast results for. */
    public fun date(date: String) {
        cdkBuilder.date(date)
    }

    /** @param value The target value that you want to meet for the provided date. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.WhatIfPointScenarioProperty = cdkBuilder.build()
}
