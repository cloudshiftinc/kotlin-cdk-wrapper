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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnConfigRule

/**
 * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of
 * contributors that affect the compliance.
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

    /**
     * @param type Indicates whether an AWS resource or AWS Config rule is compliant. A resource is
     *   compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     *   noncompliant if it does not comply with one or more of these rules.
     *
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is
     * noncompliant if any of these resources do not comply.
     *
     * AWS Config returns the `INSUFFICIENT_DATA` value when no evaluation results are available for
     * the AWS resource or AWS Config rule.
     *
     * For the `Compliance` data type, AWS Config supports only `COMPLIANT` , `NON_COMPLIANT` , and
     * `INSUFFICIENT_DATA` values. AWS Config does not support the `NOT_APPLICABLE` value for the
     * `Compliance` data type.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnConfigRule.ComplianceProperty = cdkBuilder.build()
}
