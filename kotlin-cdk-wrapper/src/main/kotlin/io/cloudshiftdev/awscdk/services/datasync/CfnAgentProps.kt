@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAgentProps {
  public fun activationKey(): String? = unwrap(this).getActivationKey()

  public fun agentName(): String? = unwrap(this).getAgentName()

  public fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?: emptyList()

  public fun subnetArns(): List<String> = unwrap(this).getSubnetArns() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  @CdkDslMarker
  public interface Builder {
    public fun activationKey(activationKey: String)

    public fun agentName(agentName: String)

    public fun securityGroupArns(securityGroupArns: List<String>)

    public fun securityGroupArns(vararg securityGroupArns: String)

    public fun subnetArns(subnetArns: List<String>)

    public fun subnetArns(vararg subnetArns: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnAgentProps.Builder =
        software.amazon.awscdk.services.datasync.CfnAgentProps.builder()

    override fun activationKey(activationKey: String) {
      cdkBuilder.activationKey(activationKey)
    }

    override fun agentName(agentName: String) {
      cdkBuilder.agentName(agentName)
    }

    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    override fun subnetArns(subnetArns: List<String>) {
      cdkBuilder.subnetArns(subnetArns)
    }

    override fun subnetArns(vararg subnetArns: String): Unit = subnetArns(subnetArns.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnAgentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnAgentProps,
  ) : CdkObject(cdkObject), CfnAgentProps {
    override fun activationKey(): String? = unwrap(this).getActivationKey()

    override fun agentName(): String? = unwrap(this).getAgentName()

    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
        emptyList()

    override fun subnetArns(): List<String> = unwrap(this).getSubnetArns() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAgentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnAgentProps):
        CfnAgentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAgentProps):
        software.amazon.awscdk.services.datasync.CfnAgentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.datasync.CfnAgentProps
  }
}
