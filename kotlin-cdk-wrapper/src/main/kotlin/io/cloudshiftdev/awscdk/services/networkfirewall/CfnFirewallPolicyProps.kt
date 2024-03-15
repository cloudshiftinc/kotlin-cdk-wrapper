@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFirewallPolicyProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun firewallPolicy(): Any

  public fun firewallPolicyName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun firewallPolicy(firewallPolicy: IResolvable)

    public fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f6a994ff4df48a44dadb2bebc99c8b73450dbe1460b659c17a481fdb0e275b")
    public
        fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty.Builder.() -> Unit)

    public fun firewallPolicyName(firewallPolicyName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun firewallPolicy(firewallPolicy: IResolvable) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(IResolvable::unwrap))
    }

    override fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(CfnFirewallPolicy.FirewallPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f6a994ff4df48a44dadb2bebc99c8b73450dbe1460b659c17a481fdb0e275b")
    override
        fun firewallPolicy(firewallPolicy: CfnFirewallPolicy.FirewallPolicyProperty.Builder.() -> Unit):
        Unit = firewallPolicy(CfnFirewallPolicy.FirewallPolicyProperty(firewallPolicy))

    override fun firewallPolicyName(firewallPolicyName: String) {
      cdkBuilder.firewallPolicyName(firewallPolicyName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps,
  ) : CdkObject(cdkObject), CfnFirewallPolicyProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun firewallPolicy(): Any = unwrap(this).getFirewallPolicy()

    override fun firewallPolicyName(): String = unwrap(this).getFirewallPolicyName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps):
        CfnFirewallPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallPolicyProps):
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps
  }
}
