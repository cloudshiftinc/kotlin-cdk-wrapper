@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerContextResponse {
  public fun ipAddressType(): LoadBalancerIpAddressType

  public fun loadBalancerArn(): String

  public fun loadBalancerCanonicalHostedZoneId(): String

  public fun loadBalancerDnsName(): String

  public fun securityGroupIds(): List<String>

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun ipAddressType(ipAddressType: LoadBalancerIpAddressType)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String)

    public fun loadBalancerDnsName(loadBalancerDnsName: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.LoadBalancerContextResponse.Builder =
        software.amazon.awscdk.cxapi.LoadBalancerContextResponse.builder()

    override fun ipAddressType(ipAddressType: LoadBalancerIpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(LoadBalancerIpAddressType::unwrap))
    }

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
      cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    override fun loadBalancerDnsName(loadBalancerDnsName: String) {
      cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.cxapi.LoadBalancerContextResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.LoadBalancerContextResponse,
  ) : CdkObject(cdkObject), LoadBalancerContextResponse {
    override fun ipAddressType(): LoadBalancerIpAddressType =
        unwrap(this).getIpAddressType().let(LoadBalancerIpAddressType::wrap)

    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerCanonicalHostedZoneId(): String =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.LoadBalancerContextResponse):
        LoadBalancerContextResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerContextResponse):
        software.amazon.awscdk.cxapi.LoadBalancerContextResponse = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cxapi.LoadBalancerContextResponse
  }
}
