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
 * Properties for defining a `CfnVPCBlockPublicAccessExclusion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCBlockPublicAccessExclusionProps cfnVPCBlockPublicAccessExclusionProps =
 * CfnVPCBlockPublicAccessExclusionProps.builder()
 * .internetGatewayExclusionMode("internetGatewayExclusionMode")
 * // the properties below are optional
 * .subnetId("subnetId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html)
 */
public interface CfnVPCBlockPublicAccessExclusionProps {
  /**
   * The desired VPC Block Public Access mode for a specific VPC or subnet exclusion.
   *
   * * `allow-bidirectional` : Allow all internet traffic to and from the excluded VPCs and subnets.
   * * `allow-egress` : Allow outbound internet traffic from the excluded VPCs and subnets. Block
   * inbound internet traffic to the excluded VPCs and subnets. Only applies when VPC Block Public
   * Access is set to `block-bidirectional` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-internetgatewayexclusionmode)
   */
  public fun internetGatewayExclusionMode(): String

  /**
   * The ID of the subnet you want to exclude.
   *
   * Required only if you don't specify VpcId.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC you want to exclude.
   *
   * Required only if you don't specify SubnetId.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-vpcid)
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [CfnVPCBlockPublicAccessExclusionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param internetGatewayExclusionMode The desired VPC Block Public Access mode for a specific
     * VPC or subnet exclusion. 
     * * `allow-bidirectional` : Allow all internet traffic to and from the excluded VPCs and
     * subnets.
     * * `allow-egress` : Allow outbound internet traffic from the excluded VPCs and subnets. Block
     * inbound internet traffic to the excluded VPCs and subnets. Only applies when VPC Block Public
     * Access is set to `block-bidirectional` .
     */
    public fun internetGatewayExclusionMode(internetGatewayExclusionMode: String)

    /**
     * @param subnetId The ID of the subnet you want to exclude.
     * Required only if you don't specify VpcId.
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The ID of the VPC you want to exclude.
     * Required only if you don't specify SubnetId.
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps.builder()

    /**
     * @param internetGatewayExclusionMode The desired VPC Block Public Access mode for a specific
     * VPC or subnet exclusion. 
     * * `allow-bidirectional` : Allow all internet traffic to and from the excluded VPCs and
     * subnets.
     * * `allow-egress` : Allow outbound internet traffic from the excluded VPCs and subnets. Block
     * inbound internet traffic to the excluded VPCs and subnets. Only applies when VPC Block Public
     * Access is set to `block-bidirectional` .
     */
    override fun internetGatewayExclusionMode(internetGatewayExclusionMode: String) {
      cdkBuilder.internetGatewayExclusionMode(internetGatewayExclusionMode)
    }

    /**
     * @param subnetId The ID of the subnet you want to exclude.
     * Required only if you don't specify VpcId.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The ID of the VPC you want to exclude.
     * Required only if you don't specify SubnetId.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps,
  ) : CdkObject(cdkObject),
      CfnVPCBlockPublicAccessExclusionProps {
    /**
     * The desired VPC Block Public Access mode for a specific VPC or subnet exclusion.
     *
     * * `allow-bidirectional` : Allow all internet traffic to and from the excluded VPCs and
     * subnets.
     * * `allow-egress` : Allow outbound internet traffic from the excluded VPCs and subnets. Block
     * inbound internet traffic to the excluded VPCs and subnets. Only applies when VPC Block Public
     * Access is set to `block-bidirectional` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-internetgatewayexclusionmode)
     */
    override fun internetGatewayExclusionMode(): String =
        unwrap(this).getInternetGatewayExclusionMode()

    /**
     * The ID of the subnet you want to exclude.
     *
     * Required only if you don't specify VpcId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC you want to exclude.
     *
     * Required only if you don't specify SubnetId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-vpcid)
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVPCBlockPublicAccessExclusionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps):
        CfnVPCBlockPublicAccessExclusionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVPCBlockPublicAccessExclusionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCBlockPublicAccessExclusionProps):
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusionProps
  }
}
