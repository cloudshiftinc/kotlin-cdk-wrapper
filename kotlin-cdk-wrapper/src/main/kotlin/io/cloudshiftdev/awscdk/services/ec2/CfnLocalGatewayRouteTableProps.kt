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
 * Properties for defining a `CfnLocalGatewayRouteTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteTableProps cfnLocalGatewayRouteTableProps =
 * CfnLocalGatewayRouteTableProps.builder()
 * .localGatewayId("localGatewayId")
 * // the properties below are optional
 * .mode("mode")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html)
 */
public interface CfnLocalGatewayRouteTableProps {
  /**
   * The ID of the local gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-localgatewayid)
   */
  public fun localGatewayId(): String

  /**
   * The mode of the local gateway route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-mode)
   */
  public fun mode(): String? = unwrap(this).getMode()

  /**
   * The tags assigned to the local gateway route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocalGatewayRouteTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param localGatewayId The ID of the local gateway. 
     */
    public fun localGatewayId(localGatewayId: String)

    /**
     * @param mode The mode of the local gateway route table.
     */
    public fun mode(mode: String)

    /**
     * @param tags The tags assigned to the local gateway route table.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the local gateway route table.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps.builder()

    /**
     * @param localGatewayId The ID of the local gateway. 
     */
    override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    /**
     * @param mode The mode of the local gateway route table.
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * @param tags The tags assigned to the local gateway route table.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the local gateway route table.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps,
  ) : CdkObject(cdkObject), CfnLocalGatewayRouteTableProps {
    /**
     * The ID of the local gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-localgatewayid)
     */
    override fun localGatewayId(): String = unwrap(this).getLocalGatewayId()

    /**
     * The mode of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-mode)
     */
    override fun mode(): String? = unwrap(this).getMode()

    /**
     * The tags assigned to the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocalGatewayRouteTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps):
        CfnLocalGatewayRouteTableProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnLocalGatewayRouteTableProps

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTableProps):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableProps
  }
}
