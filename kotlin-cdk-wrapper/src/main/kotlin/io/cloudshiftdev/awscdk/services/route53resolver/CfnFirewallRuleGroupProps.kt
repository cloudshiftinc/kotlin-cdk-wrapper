@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFirewallRuleGroupProps {
  public fun firewallRules(): Any? = unwrap(this).getFirewallRules()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun firewallRules(firewallRules: IResolvable)

    public fun firewallRules(firewallRules: List<Any>)

    public fun firewallRules(vararg firewallRules: Any)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps.builder()

    override fun firewallRules(firewallRules: IResolvable) {
      cdkBuilder.firewallRules(firewallRules.let(IResolvable::unwrap))
    }

    override fun firewallRules(firewallRules: List<Any>) {
      cdkBuilder.firewallRules(firewallRules)
    }

    override fun firewallRules(vararg firewallRules: Any): Unit =
        firewallRules(firewallRules.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps,
  ) : CdkObject(cdkObject), CfnFirewallRuleGroupProps {
    override fun firewallRules(): Any? = unwrap(this).getFirewallRules()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallRuleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps):
        CfnFirewallRuleGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallRuleGroupProps):
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps
  }
}
