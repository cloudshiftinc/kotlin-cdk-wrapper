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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps

/**
 * Properties for defining a `CfnFirewallRuleGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnFirewallRuleGroupProps cfnFirewallRuleGroupProps = CfnFirewallRuleGroupProps.builder()
 * .firewallRules(List.of(FirewallRuleProperty.builder()
 * .action("action")
 * .firewallDomainListId("firewallDomainListId")
 * .priority(123)
 * // the properties below are optional
 * .blockOverrideDnsType("blockOverrideDnsType")
 * .blockOverrideDomain("blockOverrideDomain")
 * .blockOverrideTtl(123)
 * .blockResponse("blockResponse")
 * .build()))
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html)
 */
@CdkDslMarker
public class CfnFirewallRuleGroupPropsDsl {
    private val cdkBuilder: CfnFirewallRuleGroupProps.Builder = CfnFirewallRuleGroupProps.builder()

    private val _firewallRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param firewallRules A list of the rules that you have defined. */
    public fun firewallRules(vararg firewallRules: Any) {
        _firewallRules.addAll(listOf(*firewallRules))
    }

    /** @param firewallRules A list of the rules that you have defined. */
    public fun firewallRules(firewallRules: Collection<Any>) {
        _firewallRules.addAll(firewallRules)
    }

    /** @param firewallRules A list of the rules that you have defined. */
    public fun firewallRules(firewallRules: IResolvable) {
        cdkBuilder.firewallRules(firewallRules)
    }

    /** @param name The name of the rule group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFirewallRuleGroupProps {
        if (_firewallRules.isNotEmpty()) cdkBuilder.firewallRules(_firewallRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
