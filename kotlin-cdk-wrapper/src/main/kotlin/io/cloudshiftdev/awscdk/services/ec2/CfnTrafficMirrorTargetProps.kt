@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrafficMirrorTargetProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun gatewayLoadBalancerEndpointId(): String? =
      unwrap(this).getGatewayLoadBalancerEndpointId()

  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  public fun networkLoadBalancerArn(): String? = unwrap(this).getNetworkLoadBalancerArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun networkLoadBalancerArn(networkLoadBalancerArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
      cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
      cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps,
  ) : CdkObject(cdkObject), CfnTrafficMirrorTargetProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun gatewayLoadBalancerEndpointId(): String? =
        unwrap(this).getGatewayLoadBalancerEndpointId()

    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    override fun networkLoadBalancerArn(): String? = unwrap(this).getNetworkLoadBalancerArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficMirrorTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps):
        CfnTrafficMirrorTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorTargetProps):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps
  }
}
