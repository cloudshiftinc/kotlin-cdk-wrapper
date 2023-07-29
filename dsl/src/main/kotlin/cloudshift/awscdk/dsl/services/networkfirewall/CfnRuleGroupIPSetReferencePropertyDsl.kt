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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * Configures one or more `IPSetReferences` for a Suricata-compatible rule group.
 *
 * An IP set reference is a rule variable that references a resource that you create and manage in
 * another AWS service, such as an Amazon VPC prefix list. Network Firewall IP set references enable
 * you to dynamically update the contents of your rules. When you create, update, or delete the IP
 * set you are referencing in your rule, Network Firewall automatically updates the rule's content
 * with the changes. For more information about IP set references in Network Firewall , see
 * [Using IP set references](https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references.html)
 * in the *Network Firewall Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * IPSetReferenceProperty iPSetReferenceProperty = Map.of(
 * "referenceArn", "referenceArn");
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipsetreference.html)
 */
@CdkDslMarker
public class CfnRuleGroupIPSetReferencePropertyDsl {
    private val cdkBuilder: CfnRuleGroup.IPSetReferenceProperty.Builder =
        CfnRuleGroup.IPSetReferenceProperty.builder()

    /**
     * @param referenceArn The Amazon Resource Name (ARN) of the resource to include in the
     *   `RuleGroup.IPSetReference` .
     */
    public fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
    }

    public fun build(): CfnRuleGroup.IPSetReferenceProperty = cdkBuilder.build()
}
