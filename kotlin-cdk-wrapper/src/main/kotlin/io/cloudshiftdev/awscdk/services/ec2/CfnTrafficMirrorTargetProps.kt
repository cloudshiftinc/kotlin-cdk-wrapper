@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTrafficMirrorTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTrafficMirrorTargetProps cfnTrafficMirrorTargetProps = CfnTrafficMirrorTargetProps.builder()
 * .description("description")
 * .gatewayLoadBalancerEndpointId("gatewayLoadBalancerEndpointId")
 * .networkInterfaceId("networkInterfaceId")
 * .networkLoadBalancerArn("networkLoadBalancerArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html)
 */
public interface CfnTrafficMirrorTargetProps {
  /**
   * The description of the Traffic Mirror target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the Gateway Load Balancer endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-gatewayloadbalancerendpointid)
   */
  public fun gatewayLoadBalancerEndpointId(): String? =
      unwrap(this).getGatewayLoadBalancerEndpointId()

  /**
   * The network interface ID that is associated with the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkinterfaceid)
   */
  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkloadbalancerarn)
   */
  public fun networkLoadBalancerArn(): String? = unwrap(this).getNetworkLoadBalancerArn()

  /**
   * The tags to assign to the Traffic Mirror target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTrafficMirrorTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the Traffic Mirror target.
     */
    public fun description(description: String)

    /**
     * @param gatewayLoadBalancerEndpointId The ID of the Gateway Load Balancer endpoint.
     */
    public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String)

    /**
     * @param networkInterfaceId The network interface ID that is associated with the target.
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer
     * that is associated with the target.
     */
    public fun networkLoadBalancerArn(networkLoadBalancerArn: String)

    /**
     * @param tags The tags to assign to the Traffic Mirror target.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the Traffic Mirror target.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps.builder()

    /**
     * @param description The description of the Traffic Mirror target.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param gatewayLoadBalancerEndpointId The ID of the Gateway Load Balancer endpoint.
     */
    override fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
      cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
    }

    /**
     * @param networkInterfaceId The network interface ID that is associated with the target.
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer
     * that is associated with the target.
     */
    override fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
      cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
    }

    /**
     * @param tags The tags to assign to the Traffic Mirror target.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to assign to the Traffic Mirror target.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps,
  ) : CdkObject(cdkObject), CfnTrafficMirrorTargetProps {
    /**
     * The description of the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the Gateway Load Balancer endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-gatewayloadbalancerendpointid)
     */
    override fun gatewayLoadBalancerEndpointId(): String? =
        unwrap(this).getGatewayLoadBalancerEndpointId()

    /**
     * The network interface ID that is associated with the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkinterfaceid)
     */
    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the
     * target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkloadbalancerarn)
     */
    override fun networkLoadBalancerArn(): String? = unwrap(this).getNetworkLoadBalancerArn()

    /**
     * The tags to assign to the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficMirrorTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps):
        CfnTrafficMirrorTargetProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTrafficMirrorTargetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorTargetProps):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps
  }
}
