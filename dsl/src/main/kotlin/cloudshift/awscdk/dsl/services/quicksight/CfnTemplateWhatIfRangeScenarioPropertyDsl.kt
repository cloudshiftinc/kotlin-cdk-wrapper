@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Number
import kotlin.String

/**
 * Provides the forecast to meet the target for a particular date range.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * WhatIfRangeScenarioProperty whatIfRangeScenarioProperty = WhatIfRangeScenarioProperty.builder()
 * .endDate("endDate")
 * .startDate("startDate")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-whatifrangescenario.html)
 */
@CdkDslMarker
public class CfnTemplateWhatIfRangeScenarioPropertyDsl {
    private val cdkBuilder: CfnTemplate.WhatIfRangeScenarioProperty.Builder =
        CfnTemplate.WhatIfRangeScenarioProperty.builder()

    /**
     * @param endDate The end date in the date range that you need the forecast results for.
     */
    public fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
    }

    /**
     * @param startDate The start date in the date range that you need the forecast results for.
     */
    public fun startDate(startDate: String) {
        cdkBuilder.startDate(startDate)
    }

    /**
     * @param value The target value that you want to meet for the provided date range.
     */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.WhatIfRangeScenarioProperty = cdkBuilder.build()
}
