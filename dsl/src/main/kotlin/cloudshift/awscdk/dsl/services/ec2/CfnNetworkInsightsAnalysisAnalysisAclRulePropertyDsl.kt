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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes a network access control (ACL) rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AnalysisAclRuleProperty analysisAclRuleProperty = AnalysisAclRuleProperty.builder()
 * .cidr("cidr")
 * .egress(false)
 * .portRange(PortRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .protocol("protocol")
 * .ruleAction("ruleAction")
 * .ruleNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysisaclrule.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisAclRulePropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.builder()

    /** @param cidr The IPv4 address range, in CIDR notation. */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /** @param egress Indicates whether the rule is an outbound rule. */
    public fun egress(egress: Boolean) {
        cdkBuilder.egress(egress)
    }

    /** @param egress Indicates whether the rule is an outbound rule. */
    public fun egress(egress: IResolvable) {
        cdkBuilder.egress(egress)
    }

    /** @param portRange The range of ports. */
    public fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange)
    }

    /** @param portRange The range of ports. */
    public fun portRange(portRange: CfnNetworkInsightsAnalysis.PortRangeProperty) {
        cdkBuilder.portRange(portRange)
    }

    /** @param protocol The protocol. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /** @param ruleAction Indicates whether to allow or deny traffic that matches the rule. */
    public fun ruleAction(ruleAction: String) {
        cdkBuilder.ruleAction(ruleAction)
    }

    /** @param ruleNumber The rule number. */
    public fun ruleNumber(ruleNumber: Number) {
        cdkBuilder.ruleNumber(ruleNumber)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty = cdkBuilder.build()
}
