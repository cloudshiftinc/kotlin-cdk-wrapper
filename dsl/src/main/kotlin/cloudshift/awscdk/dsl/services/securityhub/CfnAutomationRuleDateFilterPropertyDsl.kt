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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * A date filter for querying findings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
 * .dateRange(DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .end("end")
 * .start("start")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html)
 */
@CdkDslMarker
public class CfnAutomationRuleDateFilterPropertyDsl {
    private val cdkBuilder: CfnAutomationRule.DateFilterProperty.Builder =
        CfnAutomationRule.DateFilterProperty.builder()

    /** @param dateRange A date range for the date filter. */
    public fun dateRange(dateRange: IResolvable) {
        cdkBuilder.dateRange(dateRange)
    }

    /** @param dateRange A date range for the date filter. */
    public fun dateRange(dateRange: CfnAutomationRule.DateRangeProperty) {
        cdkBuilder.dateRange(dateRange)
    }

    /**
     * @param end A timestamp that provides the end date for the date filter. A correctly formatted
     *   example is `2020-05-21T20:16:34.724Z` . The value cannot contain spaces, and date and time
     *   should be separated by `T` . For more information, see
     *   [RFC 3339 section 5.6, Internet Date/Time Format](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339#section-5.6)
     *   .
     */
    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    /**
     * @param start A timestamp that provides the start date for the date filter. A correctly
     *   formatted example is `2020-05-21T20:16:34.724Z` . The value cannot contain spaces, and date
     *   and time should be separated by `T` . For more information, see
     *   [RFC 3339 section 5.6, Internet Date/Time Format](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339#section-5.6)
     *   .
     */
    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnAutomationRule.DateFilterProperty = cdkBuilder.build()
}
