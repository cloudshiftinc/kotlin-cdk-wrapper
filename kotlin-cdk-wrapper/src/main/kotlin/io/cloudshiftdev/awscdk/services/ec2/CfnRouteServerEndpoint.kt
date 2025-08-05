@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new endpoint for a route server in a specified subnet.
 *
 * A route server endpoint is an AWS -managed component inside a subnet that facilitates [BGP
 * (Border Gateway
 * Protocol)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Border_Gateway_Protocol)
 * connections between your route server and your BGP peers.
 *
 * For more information see [Dynamic routing in your VPC with VPC Route
 * Server](https://docs.aws.amazon.com/vpc/latest/userguide/dynamic-routing-route-server.html) in the
 * *Amazon VPC User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerEndpoint cfnRouteServerEndpoint = CfnRouteServerEndpoint.Builder.create(this,
 * "MyCfnRouteServerEndpoint")
 * .routeServerId("routeServerId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html)
 */
public open class CfnRouteServerEndpoint(
  cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerEndpointProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRouteServerEndpointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRouteServerEndpointProps(props)
  )

  /**
   * The ARN for the endpoint.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The IP address of the Elastic network interface for the endpoint.
   */
  public open fun attrEniAddress(): String = unwrap(this).getAttrEniAddress()

  /**
   * The ID of the Elastic network interface for the endpoint.
   */
  public open fun attrEniId(): String = unwrap(this).getAttrEniId()

  /**
   * The unique identifier of the route server endpoint.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the VPC containing the endpoint.
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the route server associated with this endpoint.
   */
  public open fun routeServerId(): String = unwrap(this).getRouteServerId()

  /**
   * The ID of the route server associated with this endpoint.
   */
  public open fun routeServerId(`value`: String) {
    unwrap(this).setRouteServerId(`value`)
  }

  /**
   * The ID of the subnet to place the route server endpoint into.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet to place the route server endpoint into.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * Any tags assigned to the route server endpoint.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Any tags assigned to the route server endpoint.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Any tags assigned to the route server endpoint.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnRouteServerEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the route server associated with this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-routeserverid)
     * @param routeServerId The ID of the route server associated with this endpoint. 
     */
    public fun routeServerId(routeServerId: String)

    /**
     * The ID of the subnet to place the route server endpoint into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-subnetid)
     * @param subnetId The ID of the subnet to place the route server endpoint into. 
     */
    public fun subnetId(subnetId: String)

    /**
     * Any tags assigned to the route server endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-tags)
     * @param tags Any tags assigned to the route server endpoint. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the route server endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-tags)
     * @param tags Any tags assigned to the route server endpoint. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint.Builder.create(scope, id)

    /**
     * The ID of the route server associated with this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-routeserverid)
     * @param routeServerId The ID of the route server associated with this endpoint. 
     */
    override fun routeServerId(routeServerId: String) {
      cdkBuilder.routeServerId(routeServerId)
    }

    /**
     * The ID of the subnet to place the route server endpoint into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-subnetid)
     * @param subnetId The ID of the subnet to place the route server endpoint into. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * Any tags assigned to the route server endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-tags)
     * @param tags Any tags assigned to the route server endpoint. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Any tags assigned to the route server endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-tags)
     * @param tags Any tags assigned to the route server endpoint. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteServerEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteServerEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint):
        CfnRouteServerEndpoint = CfnRouteServerEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerEndpoint):
        software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint
  }
}
