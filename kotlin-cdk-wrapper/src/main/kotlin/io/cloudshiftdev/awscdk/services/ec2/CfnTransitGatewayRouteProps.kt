@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTransitGatewayRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteProps cfnTransitGatewayRouteProps = CfnTransitGatewayRouteProps.builder()
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
public interface CfnTransitGatewayRouteProps {
  /**
   * Indicates whether to drop traffic that matches this route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
   */
  public fun blackhole(): Any? = unwrap(this).getBlackhole()

  /**
   * The CIDR block used for destination matches.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock)
   */
  public fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  /**
   * The ID of the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid)
   */
  public fun transitGatewayAttachmentId(): String? = unwrap(this).getTransitGatewayAttachmentId()

  /**
   * The ID of the transit gateway route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid)
   */
  public fun transitGatewayRouteTableId(): String

  /**
   * A builder for [CfnTransitGatewayRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param blackhole Indicates whether to drop traffic that matches this route.
     */
    public fun blackhole(blackhole: Boolean)

    /**
     * @param blackhole Indicates whether to drop traffic that matches this route.
     */
    public fun blackhole(blackhole: IResolvable)

    /**
     * @param destinationCidrBlock The CIDR block used for destination matches.
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * @param transitGatewayAttachmentId The ID of the attachment.
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * @param transitGatewayRouteTableId The ID of the transit gateway route table. 
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps.builder()

    /**
     * @param blackhole Indicates whether to drop traffic that matches this route.
     */
    override fun blackhole(blackhole: Boolean) {
      cdkBuilder.blackhole(blackhole)
    }

    /**
     * @param blackhole Indicates whether to drop traffic that matches this route.
     */
    override fun blackhole(blackhole: IResolvable) {
      cdkBuilder.blackhole(blackhole.let(IResolvable::unwrap))
    }

    /**
     * @param destinationCidrBlock The CIDR block used for destination matches.
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param transitGatewayAttachmentId The ID of the attachment.
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * @param transitGatewayRouteTableId The ID of the transit gateway route table. 
     */
    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRouteProps {
    /**
     * Indicates whether to drop traffic that matches this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
     */
    override fun blackhole(): Any? = unwrap(this).getBlackhole()

    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock)
     */
    override fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid)
     */
    override fun transitGatewayAttachmentId(): String? =
        unwrap(this).getTransitGatewayAttachmentId()

    /**
     * The ID of the transit gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid)
     */
    override fun transitGatewayRouteTableId(): String = unwrap(this).getTransitGatewayRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps):
        CfnTransitGatewayRouteProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransitGatewayRouteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps
  }
}
