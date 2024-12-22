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
 * Create a VPC Block Public Access (BPA) exclusion.
 *
 * A VPC BPA exclusion is a mode that can be applied to a single VPC or subnet that exempts it from
 * the account’s BPA mode and will allow bidirectional or egress-only access. You can create BPA
 * exclusions for VPCs and subnets even when BPA is not enabled on the account to ensure that there is
 * no traffic disruption to the exclusions when VPC BPA is turned on. To learn more about VPC BPA, see
 * [Block public access to VPCs and
 * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/security-vpc-bpa.html) in the *Amazon VPC
 * User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCBlockPublicAccessExclusion cfnVPCBlockPublicAccessExclusion =
 * CfnVPCBlockPublicAccessExclusion.Builder.create(this, "MyCfnVPCBlockPublicAccessExclusion")
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
public open class CfnVPCBlockPublicAccessExclusion(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCBlockPublicAccessExclusionProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPCBlockPublicAccessExclusionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCBlockPublicAccessExclusionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPCBlockPublicAccessExclusionProps(props)
  )

  /**
   * The ID of the exclusion.
   */
  public open fun attrExclusionId(): String = unwrap(this).getAttrExclusionId()

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
   * The desired VPC Block Public Access mode for a specific VPC or subnet exclusion.
   */
  public open fun internetGatewayExclusionMode(): String =
      unwrap(this).getInternetGatewayExclusionMode()

  /**
   * The desired VPC Block Public Access mode for a specific VPC or subnet exclusion.
   */
  public open fun internetGatewayExclusionMode(`value`: String) {
    unwrap(this).setInternetGatewayExclusionMode(`value`)
  }

  /**
   * The ID of the subnet you want to exclude.
   */
  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet you want to exclude.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The ID of the VPC you want to exclude.
   */
  public open fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * The ID of the VPC you want to exclude.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param internetGatewayExclusionMode The desired VPC Block Public Access mode for a specific
     * VPC or subnet exclusion. 
     */
    public fun internetGatewayExclusionMode(internetGatewayExclusionMode: String)

    /**
     * The ID of the subnet you want to exclude.
     *
     * Required only if you don't specify VpcId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-subnetid)
     * @param subnetId The ID of the subnet you want to exclude. 
     */
    public fun subnetId(subnetId: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC you want to exclude.
     *
     * Required only if you don't specify SubnetId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-vpcid)
     * @param vpcId The ID of the VPC you want to exclude. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion.Builder.create(scope,
        id)

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
     * @param internetGatewayExclusionMode The desired VPC Block Public Access mode for a specific
     * VPC or subnet exclusion. 
     */
    override fun internetGatewayExclusionMode(internetGatewayExclusionMode: String) {
      cdkBuilder.internetGatewayExclusionMode(internetGatewayExclusionMode)
    }

    /**
     * The ID of the subnet you want to exclude.
     *
     * Required only if you don't specify VpcId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-subnetid)
     * @param subnetId The ID of the subnet you want to exclude. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC you want to exclude.
     *
     * Required only if you don't specify SubnetId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcblockpublicaccessexclusion.html#cfn-ec2-vpcblockpublicaccessexclusion-vpcid)
     * @param vpcId The ID of the VPC you want to exclude. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCBlockPublicAccessExclusion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCBlockPublicAccessExclusion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion):
        CfnVPCBlockPublicAccessExclusion = CfnVPCBlockPublicAccessExclusion(cdkObject)

    internal fun unwrap(wrapped: CfnVPCBlockPublicAccessExclusion):
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCBlockPublicAccessExclusion
  }
}
