@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a static route for a transit gateway route table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayRoute cfnTransitGatewayRoute = CfnTransitGatewayRoute.Builder.create(this,
 * "MyCfnTransitGatewayRoute")
 * .transitGatewayRouteTableId("transitGatewayRouteTableId")
 * // the properties below are optional
 * .blackhole(false)
 * .destinationCidrBlock("destinationCidrBlock")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html)
 */
public open class CfnTransitGatewayRoute(
  cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRouteProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTransitGatewayRouteProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRouteProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayRouteProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates whether to drop traffic that matches this route.
   */
  public open fun blackhole(): Any? = unwrap(this).getBlackhole()

  /**
   * Indicates whether to drop traffic that matches this route.
   */
  public open fun blackhole(`value`: Boolean) {
    unwrap(this).setBlackhole(`value`)
  }

  /**
   * Indicates whether to drop traffic that matches this route.
   */
  public open fun blackhole(`value`: IResolvable) {
    unwrap(this).setBlackhole(`value`.let(IResolvable::unwrap))
  }

  /**
   * The CIDR block used for destination matches.
   */
  public open fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  /**
   * The CIDR block used for destination matches.
   */
  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
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
   * The ID of the attachment.
   */
  public open fun transitGatewayAttachmentId(): String? =
      unwrap(this).getTransitGatewayAttachmentId()

  /**
   * The ID of the attachment.
   */
  public open fun transitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransitGatewayAttachmentId(`value`)
  }

  /**
   * The ID of the transit gateway route table.
   */
  public open fun transitGatewayRouteTableId(): String =
      unwrap(this).getTransitGatewayRouteTableId()

  /**
   * The ID of the transit gateway route table.
   */
  public open fun transitGatewayRouteTableId(`value`: String) {
    unwrap(this).setTransitGatewayRouteTableId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether to drop traffic that matches this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
     * @param blackhole Indicates whether to drop traffic that matches this route. 
     */
    public fun blackhole(blackhole: Boolean)

    /**
     * Indicates whether to drop traffic that matches this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
     * @param blackhole Indicates whether to drop traffic that matches this route. 
     */
    public fun blackhole(blackhole: IResolvable)

    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock)
     * @param destinationCidrBlock The CIDR block used for destination matches. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * The ID of the transit gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid)
     * @param transitGatewayRouteTableId The ID of the transit gateway route table. 
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute.Builder.create(scope, id)

    /**
     * Indicates whether to drop traffic that matches this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
     * @param blackhole Indicates whether to drop traffic that matches this route. 
     */
    override fun blackhole(blackhole: Boolean) {
      cdkBuilder.blackhole(blackhole)
    }

    /**
     * Indicates whether to drop traffic that matches this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
     * @param blackhole Indicates whether to drop traffic that matches this route. 
     */
    override fun blackhole(blackhole: IResolvable) {
      cdkBuilder.blackhole(blackhole.let(IResolvable::unwrap))
    }

    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock)
     * @param destinationCidrBlock The CIDR block used for destination matches. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * The ID of the transit gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid)
     * @param transitGatewayRouteTableId The ID of the transit gateway route table. 
     */
    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute):
        CfnTransitGatewayRoute = CfnTransitGatewayRoute(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRoute):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
  }
}
