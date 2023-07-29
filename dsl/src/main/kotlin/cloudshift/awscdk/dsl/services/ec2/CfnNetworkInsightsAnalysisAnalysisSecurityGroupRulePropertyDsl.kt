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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes a security group rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AnalysisSecurityGroupRuleProperty analysisSecurityGroupRuleProperty =
 * AnalysisSecurityGroupRuleProperty.builder()
 * .cidr("cidr")
 * .direction("direction")
 * .portRange(PortRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .prefixListId("prefixListId")
 * .protocol("protocol")
 * .securityGroupId("securityGroupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysissecuritygrouprule.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisSecurityGroupRulePropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.Builder =
        CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.builder()

    /** @param cidr The IPv4 address range, in CIDR notation. */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * @param direction The direction. The following are the possible values:.
     * * egress
     * * ingress
     */
    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    /** @param portRange The port range. */
    public fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange)
    }

    /** @param portRange The port range. */
    public fun portRange(portRange: CfnNetworkInsightsAnalysis.PortRangeProperty) {
        cdkBuilder.portRange(portRange)
    }

    /** @param prefixListId The prefix list ID. */
    public fun prefixListId(prefixListId: String) {
        cdkBuilder.prefixListId(prefixListId)
    }

    /** @param protocol The protocol name. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /** @param securityGroupId The security group ID. */
    public fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty =
        cdkBuilder.build()
}
