@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFirewallRuleGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
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
 * .qtype("qtype")
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
public interface CfnFirewallRuleGroupProps {
  /**
   * A list of the rules that you have defined.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
   */
  public fun firewallRules(): Any? = unwrap(this).getFirewallRules()

  /**
   * The name of the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFirewallRuleGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param firewallRules A list of the rules that you have defined.
     */
    public fun firewallRules(firewallRules: IResolvable)

    /**
     * @param firewallRules A list of the rules that you have defined.
     */
    public fun firewallRules(firewallRules: List<Any>)

    /**
     * @param firewallRules A list of the rules that you have defined.
     */
    public fun firewallRules(vararg firewallRules: Any)

    /**
     * @param name The name of the rule group.
     */
    public fun name(name: String)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps.builder()

    /**
     * @param firewallRules A list of the rules that you have defined.
     */
    override fun firewallRules(firewallRules: IResolvable) {
      cdkBuilder.firewallRules(firewallRules.let(IResolvable::unwrap))
    }

    /**
     * @param firewallRules A list of the rules that you have defined.
     */
    override fun firewallRules(firewallRules: List<Any>) {
      cdkBuilder.firewallRules(firewallRules)
    }

    /**
     * @param firewallRules A list of the rules that you have defined.
     */
    override fun firewallRules(vararg firewallRules: Any): Unit =
        firewallRules(firewallRules.toList())

    /**
     * @param name The name of the rule group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps,
  ) : CdkObject(cdkObject), CfnFirewallRuleGroupProps {
    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     */
    override fun firewallRules(): Any? = unwrap(this).getFirewallRules()

    /**
     * The name of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallRuleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps):
        CfnFirewallRuleGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFirewallRuleGroupProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallRuleGroupProps):
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps
  }
}
