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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnConfigRule

/**
 * Compliance details of the Config rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * ComplianceProperty complianceProperty = ComplianceProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-compliance.html)
 */
@CdkDslMarker
public class CfnConfigRuleCompliancePropertyDsl {
    private val cdkBuilder: CfnConfigRule.ComplianceProperty.Builder =
        CfnConfigRule.ComplianceProperty.builder()

    /** @param type Compliance type determined by the Config rule. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnConfigRule.ComplianceProperty = cdkBuilder.build()
}
