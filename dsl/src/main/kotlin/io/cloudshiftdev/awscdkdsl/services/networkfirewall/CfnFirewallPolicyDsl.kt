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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.constructs.Construct

/**
 * Use the `FirewallPolicy` to define the stateless and stateful network traffic filtering behavior
 * for your `Firewall` .
 *
 * You can use one firewall policy for multiple firewalls.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnFirewallPolicy cfnFirewallPolicy = CfnFirewallPolicy.Builder.create(this,
 * "MyCfnFirewallPolicy")
 * .firewallPolicy(FirewallPolicyProperty.builder()
 * .statelessDefaultActions(List.of("statelessDefaultActions"))
 * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
 * // the properties below are optional
 * .policyVariables(PolicyVariablesProperty.builder()
 * .ruleVariables(Map.of(
 * "ruleVariablesKey", Map.of(
 * "definition", List.of("definition"))))
 * .build())
 * .statefulDefaultActions(List.of("statefulDefaultActions"))
 * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
 * .ruleOrder("ruleOrder")
 * .streamExceptionPolicy("streamExceptionPolicy")
 * .build())
 * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
 * .resourceArn("resourceArn")
 * // the properties below are optional
 * .override(StatefulRuleGroupOverrideProperty.builder()
 * .action("action")
 * .build())
 * .priority(123)
 * .build()))
 * .statelessCustomActions(List.of(CustomActionProperty.builder()
 * .actionDefinition(ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .actionName("actionName")
 * .build()))
 * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
 * .priority(123)
 * .resourceArn("resourceArn")
 * .build()))
 * .build())
 * .firewallPolicyName("firewallPolicyName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFirewallPolicy.Builder = CfnFirewallPolicy.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the firewall policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-description)
     *
     * @param description A description of the firewall policy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     *
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     *   collection of stateless and stateful rule groups and other settings.
     */
    public fun firewallPolicy(firewallPolicy: IResolvable) {
        cdkBuilder.firewallPolicy(firewallPolicy)
    }

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicy)
     *
     * @param firewallPolicy The traffic filtering behavior of a firewall policy, defined in a
     *   collection of stateless and stateful rule groups and other settings.
     */
    public fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty) {
        cdkBuilder.firewallPolicy(firewallPolicy)
    }

    /**
     * The descriptive name of the firewall policy.
     *
     * You can't change the name of a firewall policy after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-firewallpolicyname)
     *
     * @param firewallPolicyName The descriptive name of the firewall policy.
     */
    public fun firewallPolicyName(firewallPolicyName: String) {
        cdkBuilder.firewallPolicyName(firewallPolicyName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html#cfn-networkfirewall-firewallpolicy-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFirewallPolicy {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
