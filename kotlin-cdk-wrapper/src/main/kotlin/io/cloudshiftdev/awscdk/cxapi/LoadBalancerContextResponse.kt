@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties of a discovered load balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * LoadBalancerContextResponse loadBalancerContextResponse = LoadBalancerContextResponse.builder()
 * .ipAddressType(LoadBalancerIpAddressType.IPV4)
 * .loadBalancerArn("loadBalancerArn")
 * .loadBalancerCanonicalHostedZoneId("loadBalancerCanonicalHostedZoneId")
 * .loadBalancerDnsName("loadBalancerDnsName")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .vpcId("vpcId")
 * .build();
 * ```
 */
public interface LoadBalancerContextResponse {
  /**
   * Type of IP address.
   */
  public fun ipAddressType(): LoadBalancerIpAddressType

  /**
   * The ARN of the load balancer.
   */
  public fun loadBalancerArn(): String

  /**
   * The hosted zone ID of the load balancer's name.
   */
  public fun loadBalancerCanonicalHostedZoneId(): String

  /**
   * Load balancer's DNS name.
   */
  public fun loadBalancerDnsName(): String

  /**
   * Load balancer's security groups.
   */
  public fun securityGroupIds(): List<String>

  /**
   * Load balancer's VPC.
   */
  public fun vpcId(): String

  /**
   * A builder for [LoadBalancerContextResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipAddressType Type of IP address. 
     */
    public fun ipAddressType(ipAddressType: LoadBalancerIpAddressType)

    /**
     * @param loadBalancerArn The ARN of the load balancer. 
     */
    public fun loadBalancerArn(loadBalancerArn: String)

    /**
     * @param loadBalancerCanonicalHostedZoneId The hosted zone ID of the load balancer's name. 
     */
    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String)

    /**
     * @param loadBalancerDnsName Load balancer's DNS name. 
     */
    public fun loadBalancerDnsName(loadBalancerDnsName: String)

    /**
     * @param securityGroupIds Load balancer's security groups. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds Load balancer's security groups. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param vpcId Load balancer's VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.LoadBalancerContextResponse.Builder =
        software.amazon.awscdk.cxapi.LoadBalancerContextResponse.builder()

    /**
     * @param ipAddressType Type of IP address. 
     */
    override fun ipAddressType(ipAddressType: LoadBalancerIpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(LoadBalancerIpAddressType.Companion::unwrap))
    }

    /**
     * @param loadBalancerArn The ARN of the load balancer. 
     */
    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /**
     * @param loadBalancerCanonicalHostedZoneId The hosted zone ID of the load balancer's name. 
     */
    override fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
      cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    /**
     * @param loadBalancerDnsName Load balancer's DNS name. 
     */
    override fun loadBalancerDnsName(loadBalancerDnsName: String) {
      cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    /**
     * @param securityGroupIds Load balancer's security groups. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds Load balancer's security groups. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param vpcId Load balancer's VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.cxapi.LoadBalancerContextResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cxapi.LoadBalancerContextResponse,
  ) : CdkObject(cdkObject),
      LoadBalancerContextResponse {
    /**
     * Type of IP address.
     */
    override fun ipAddressType(): LoadBalancerIpAddressType =
        unwrap(this).getIpAddressType().let(LoadBalancerIpAddressType::wrap)

    /**
     * The ARN of the load balancer.
     */
    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    /**
     * The hosted zone ID of the load balancer's name.
     */
    override fun loadBalancerCanonicalHostedZoneId(): String =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    /**
     * Load balancer's DNS name.
     */
    override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

    /**
     * Load balancer's security groups.
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    /**
     * Load balancer's VPC.
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.LoadBalancerContextResponse):
        LoadBalancerContextResponse = CdkObjectWrappers.wrap(cdkObject) as?
        LoadBalancerContextResponse ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerContextResponse):
        software.amazon.awscdk.cxapi.LoadBalancerContextResponse = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cxapi.LoadBalancerContextResponse
  }
}
