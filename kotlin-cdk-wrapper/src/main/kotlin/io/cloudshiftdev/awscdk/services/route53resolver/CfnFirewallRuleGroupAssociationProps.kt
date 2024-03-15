@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFirewallRuleGroupAssociationProps {
  public fun firewallRuleGroupId(): String

  public fun mutationProtection(): String? = unwrap(this).getMutationProtection()

  public fun name(): String? = unwrap(this).getName()

  public fun priority(): Number

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun firewallRuleGroupId(firewallRuleGroupId: String)

    public fun mutationProtection(mutationProtection: String)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps.Builder
        =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps.builder()

    override fun firewallRuleGroupId(firewallRuleGroupId: String) {
      cdkBuilder.firewallRuleGroupId(firewallRuleGroupId)
    }

    override fun mutationProtection(mutationProtection: String) {
      cdkBuilder.mutationProtection(mutationProtection)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps,
  ) : CdkObject(cdkObject), CfnFirewallRuleGroupAssociationProps {
    override fun firewallRuleGroupId(): String = unwrap(this).getFirewallRuleGroupId()

    override fun mutationProtection(): String? = unwrap(this).getMutationProtection()

    override fun name(): String? = unwrap(this).getName()

    override fun priority(): Number = unwrap(this).getPriority()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnFirewallRuleGroupAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps):
        CfnFirewallRuleGroupAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallRuleGroupAssociationProps):
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps
  }
}
