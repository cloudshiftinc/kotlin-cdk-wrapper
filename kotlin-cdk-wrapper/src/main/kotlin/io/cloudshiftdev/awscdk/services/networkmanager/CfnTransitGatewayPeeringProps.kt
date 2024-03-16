@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTransitGatewayPeering`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnTransitGatewayPeeringProps cfnTransitGatewayPeeringProps =
 * CfnTransitGatewayPeeringProps.builder()
 * .coreNetworkId("coreNetworkId")
 * .transitGatewayArn("transitGatewayArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html)
 */
public interface CfnTransitGatewayPeeringProps {
  /**
   * The ID of the core network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-corenetworkid)
   */
  public fun coreNetworkId(): String

  /**
   * The list of key-value tags associated with the peering.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-transitgatewayarn)
   */
  public fun transitGatewayArn(): String

  /**
   * A builder for [CfnTransitGatewayPeeringProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param coreNetworkId The ID of the core network. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * @param tags The list of key-value tags associated with the peering.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value tags associated with the peering.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayArn The ARN of the transit gateway. 
     */
    public fun transitGatewayArn(transitGatewayArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps.builder()

    /**
     * @param coreNetworkId The ID of the core network. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * @param tags The list of key-value tags associated with the peering.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The list of key-value tags associated with the peering.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayArn The ARN of the transit gateway. 
     */
    override fun transitGatewayArn(transitGatewayArn: String) {
      cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayPeeringProps {
    /**
     * The ID of the core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-corenetworkid)
     */
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    /**
     * The list of key-value tags associated with the peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html#cfn-networkmanager-transitgatewaypeering-transitgatewayarn)
     */
    override fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayPeeringProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps):
        CfnTransitGatewayPeeringProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnTransitGatewayPeeringProps

    internal fun unwrap(wrapped: CfnTransitGatewayPeeringProps):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps
  }
}
