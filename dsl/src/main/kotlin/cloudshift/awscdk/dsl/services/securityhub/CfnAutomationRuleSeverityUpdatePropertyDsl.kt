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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * Updates to the severity information for a finding.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * SeverityUpdateProperty severityUpdateProperty = SeverityUpdateProperty.builder()
 * .label("label")
 * .normalized(123)
 * .product(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html)
 */
@CdkDslMarker
public class CfnAutomationRuleSeverityUpdatePropertyDsl {
    private val cdkBuilder: CfnAutomationRule.SeverityUpdateProperty.Builder =
        CfnAutomationRule.SeverityUpdateProperty.builder()

    /**
     * @param label The severity value of the finding. The allowed values are the following.
     * * `INFORMATIONAL` - No issue was found.
     * * `LOW` - The issue does not require action on its own.
     * * `MEDIUM` - The issue must be addressed but not urgently.
     * * `HIGH` - The issue must be addressed as a priority.
     * * `CRITICAL` - The issue must be remediated immediately to avoid it escalating.
     */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /**
     * @param normalized The normalized severity for the finding. This attribute is to be deprecated
     *   in favor of `Label` . If you provide `Normalized` and do not provide `Label` , `Label` is
     *   set automatically as follows.
     * * 0 - `INFORMATIONAL`
     * * 1–39 - `LOW`
     * * 40–69 - `MEDIUM`
     * * 70–89 - `HIGH`
     * * 90–100 - `CRITICAL`
     */
    public fun normalized(normalized: Number) {
        cdkBuilder.normalized(normalized)
    }

    /**
     * @param product The native severity as defined by the AWS service or integrated partner
     *   product that generated the finding.
     */
    public fun product(product: Number) {
        cdkBuilder.product(product)
    }

    public fun build(): CfnAutomationRule.SeverityUpdateProperty = cdkBuilder.build()
}
