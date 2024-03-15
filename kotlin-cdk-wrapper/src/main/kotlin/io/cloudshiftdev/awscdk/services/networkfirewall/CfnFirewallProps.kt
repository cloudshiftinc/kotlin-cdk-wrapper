@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFirewallProps {
  public fun deleteProtection(): Any? = unwrap(this).getDeleteProtection()

  public fun description(): String? = unwrap(this).getDescription()

  public fun firewallName(): String

  public fun firewallPolicyArn(): String

  public fun firewallPolicyChangeProtection(): Any? =
      unwrap(this).getFirewallPolicyChangeProtection()

  public fun subnetChangeProtection(): Any? = unwrap(this).getSubnetChangeProtection()

  public fun subnetMappings(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun deleteProtection(deleteProtection: Boolean)

    public fun deleteProtection(deleteProtection: IResolvable)

    public fun description(description: String)

    public fun firewallName(firewallName: String)

    public fun firewallPolicyArn(firewallPolicyArn: String)

    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean)

    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable)

    public fun subnetChangeProtection(subnetChangeProtection: Boolean)

    public fun subnetChangeProtection(subnetChangeProtection: IResolvable)

    public fun subnetMappings(subnetMappings: IResolvable)

    public fun subnetMappings(subnetMappings: List<Any>)

    public fun subnetMappings(vararg subnetMappings: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkfirewall.CfnFirewallProps.Builder
        = software.amazon.awscdk.services.networkfirewall.CfnFirewallProps.builder()

    override fun deleteProtection(deleteProtection: Boolean) {
      cdkBuilder.deleteProtection(deleteProtection)
    }

    override fun deleteProtection(deleteProtection: IResolvable) {
      cdkBuilder.deleteProtection(deleteProtection.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    override fun firewallPolicyArn(firewallPolicyArn: String) {
      cdkBuilder.firewallPolicyArn(firewallPolicyArn)
    }

    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
    }

    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection.let(IResolvable::unwrap))
    }

    override fun subnetChangeProtection(subnetChangeProtection: Boolean) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection)
    }

    override fun subnetChangeProtection(subnetChangeProtection: IResolvable) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection.let(IResolvable::unwrap))
    }

    override fun subnetMappings(subnetMappings: IResolvable) {
      cdkBuilder.subnetMappings(subnetMappings.let(IResolvable::unwrap))
    }

    override fun subnetMappings(subnetMappings: List<Any>) {
      cdkBuilder.subnetMappings(subnetMappings)
    }

    override fun subnetMappings(vararg subnetMappings: Any): Unit =
        subnetMappings(subnetMappings.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewallProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallProps,
  ) : CdkObject(cdkObject), CfnFirewallProps {
    override fun deleteProtection(): Any? = unwrap(this).getDeleteProtection()

    override fun description(): String? = unwrap(this).getDescription()

    override fun firewallName(): String = unwrap(this).getFirewallName()

    override fun firewallPolicyArn(): String = unwrap(this).getFirewallPolicyArn()

    override fun firewallPolicyChangeProtection(): Any? =
        unwrap(this).getFirewallPolicyChangeProtection()

    override fun subnetChangeProtection(): Any? = unwrap(this).getSubnetChangeProtection()

    override fun subnetMappings(): Any = unwrap(this).getSubnetMappings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallProps):
        CfnFirewallProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallProps):
        software.amazon.awscdk.services.networkfirewall.CfnFirewallProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkfirewall.CfnFirewallProps
  }
}
