@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTransitGatewayRouteTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteTableProps cfnTransitGatewayRouteTableProps =
 * CfnTransitGatewayRouteTableProps.builder()
 * .transitGatewayId("transitGatewayId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html)
 */
public interface CfnTransitGatewayRouteTableProps {
  /**
   * Any tags assigned to the route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-transitgatewayid)
   */
  public fun transitGatewayId(): String

  /**
   * A builder for [CfnTransitGatewayRouteTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tags Any tags assigned to the route table.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the route table.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayId The ID of the transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps.builder()

    /**
     * @param tags Any tags assigned to the route table.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags assigned to the route table.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayId The ID of the transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRouteTableProps {
    /**
     * Any tags assigned to the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetable.html#cfn-ec2-transitgatewayroutetable-transitgatewayid)
     */
    override fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayRouteTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps):
        CfnTransitGatewayRouteTableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTableProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps
  }
}
