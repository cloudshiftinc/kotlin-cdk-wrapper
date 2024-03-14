package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrafficMirrorTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of the Traffic Mirror target.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the Traffic Mirror target.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the Gateway Load Balancer endpoint.
   */
  public open fun gatewayLoadBalancerEndpointId(): String? =
      unwrap(this).getGatewayLoadBalancerEndpointId()

  /**
   * The ID of the Gateway Load Balancer endpoint.
   */
  public open fun gatewayLoadBalancerEndpointId(`value`: String) {
    unwrap(this).setGatewayLoadBalancerEndpointId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The network interface ID that is associated with the target.
   */
  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * The network interface ID that is associated with the target.
   */
  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
   */
  public open fun networkLoadBalancerArn(): String? = unwrap(this).getNetworkLoadBalancerArn()

  /**
   * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
   */
  public open fun networkLoadBalancerArn(`value`: String) {
    unwrap(this).setNetworkLoadBalancerArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to assign to the Traffic Mirror target.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to assign to the Traffic Mirror target.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to assign to the Traffic Mirror target.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTrafficMirrorTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-description)
     * @param description The description of the Traffic Mirror target. 
     */
    public fun description(description: String)

    /**
     * The ID of the Gateway Load Balancer endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-gatewayloadbalancerendpointid)
     * @param gatewayLoadBalancerEndpointId The ID of the Gateway Load Balancer endpoint. 
     */
    public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String)

    /**
     * The network interface ID that is associated with the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkinterfaceid)
     * @param networkInterfaceId The network interface ID that is associated with the target. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the
     * target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkloadbalancerarn)
     * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer
     * that is associated with the target. 
     */
    public fun networkLoadBalancerArn(networkLoadBalancerArn: String)

    /**
     * The tags to assign to the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
     * @param tags The tags to assign to the Traffic Mirror target. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
     * @param tags The tags to assign to the Traffic Mirror target. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget.Builder.create(scope, id)

    /**
     * The description of the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-description)
     * @param description The description of the Traffic Mirror target. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the Gateway Load Balancer endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-gatewayloadbalancerendpointid)
     * @param gatewayLoadBalancerEndpointId The ID of the Gateway Load Balancer endpoint. 
     */
    override fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
      cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
    }

    /**
     * The network interface ID that is associated with the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkinterfaceid)
     * @param networkInterfaceId The network interface ID that is associated with the target. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the
     * target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkloadbalancerarn)
     * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer
     * that is associated with the target. 
     */
    override fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
      cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
    }

    /**
     * The tags to assign to the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
     * @param tags The tags to assign to the Traffic Mirror target. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to assign to the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
     * @param tags The tags to assign to the Traffic Mirror target. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrafficMirrorTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrafficMirrorTarget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget):
        CfnTrafficMirrorTarget = CfnTrafficMirrorTarget(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorTarget):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget = wrapped.cdkObject
  }
}
