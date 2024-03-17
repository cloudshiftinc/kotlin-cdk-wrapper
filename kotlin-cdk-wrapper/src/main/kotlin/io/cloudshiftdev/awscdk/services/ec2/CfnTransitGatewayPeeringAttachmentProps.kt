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
 * Properties for defining a `CfnTransitGatewayPeeringAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayPeeringAttachmentProps cfnTransitGatewayPeeringAttachmentProps =
 * CfnTransitGatewayPeeringAttachmentProps.builder()
 * .peerAccountId("peerAccountId")
 * .peerRegion("peerRegion")
 * .peerTransitGatewayId("peerTransitGatewayId")
 * .transitGatewayId("transitGatewayId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html)
 */
public interface CfnTransitGatewayPeeringAttachmentProps {
  /**
   * The ID of the AWS account that owns the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peeraccountid)
   */
  public fun peerAccountId(): String

  /**
   * The Region of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peerregion)
   */
  public fun peerRegion(): String

  /**
   * The ID of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peertransitgatewayid)
   */
  public fun peerTransitGatewayId(): String

  /**
   * The tags for the transit gateway peering attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the transit gateway peering attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-transitgatewayid)
   */
  public fun transitGatewayId(): String

  /**
   * A builder for [CfnTransitGatewayPeeringAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param peerAccountId The ID of the AWS account that owns the transit gateway. 
     */
    public fun peerAccountId(peerAccountId: String)

    /**
     * @param peerRegion The Region of the transit gateway. 
     */
    public fun peerRegion(peerRegion: String)

    /**
     * @param peerTransitGatewayId The ID of the transit gateway. 
     */
    public fun peerTransitGatewayId(peerTransitGatewayId: String)

    /**
     * @param tags The tags for the transit gateway peering attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the transit gateway peering attachment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayId The ID of the transit gateway peering attachment. 
     */
    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps.builder()

    /**
     * @param peerAccountId The ID of the AWS account that owns the transit gateway. 
     */
    override fun peerAccountId(peerAccountId: String) {
      cdkBuilder.peerAccountId(peerAccountId)
    }

    /**
     * @param peerRegion The Region of the transit gateway. 
     */
    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    /**
     * @param peerTransitGatewayId The ID of the transit gateway. 
     */
    override fun peerTransitGatewayId(peerTransitGatewayId: String) {
      cdkBuilder.peerTransitGatewayId(peerTransitGatewayId)
    }

    /**
     * @param tags The tags for the transit gateway peering attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the transit gateway peering attachment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayId The ID of the transit gateway peering attachment. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayPeeringAttachmentProps {
    /**
     * The ID of the AWS account that owns the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peeraccountid)
     */
    override fun peerAccountId(): String = unwrap(this).getPeerAccountId()

    /**
     * The Region of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peerregion)
     */
    override fun peerRegion(): String = unwrap(this).getPeerRegion()

    /**
     * The ID of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peertransitgatewayid)
     */
    override fun peerTransitGatewayId(): String = unwrap(this).getPeerTransitGatewayId()

    /**
     * The tags for the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the transit gateway peering attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-transitgatewayid)
     */
    override fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayPeeringAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps):
        CfnTransitGatewayPeeringAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransitGatewayPeeringAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayPeeringAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
  }
}
