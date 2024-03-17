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
 * Properties for defining a `CfnVPCPeeringConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCPeeringConnectionProps cfnVPCPeeringConnectionProps =
 * CfnVPCPeeringConnectionProps.builder()
 * .peerVpcId("peerVpcId")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .peerOwnerId("peerOwnerId")
 * .peerRegion("peerRegion")
 * .peerRoleArn("peerRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html)
 */
public interface CfnVPCPeeringConnectionProps {
  /**
   * The AWS account ID of the owner of the accepter VPC.
   *
   * Default: Your AWS account ID
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
   */
  public fun peerOwnerId(): String? = unwrap(this).getPeerOwnerId()

  /**
   * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the
   * Region in which you make the request.
   *
   * Default: The Region in which you make the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion)
   */
  public fun peerRegion(): String? = unwrap(this).getPeerRegion()

  /**
   * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS
   * account.
   *
   * This is required when you are peering a VPC in a different AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
   */
  public fun peerRoleArn(): String? = unwrap(this).getPeerRoleArn()

  /**
   * The ID of the VPC with which you are creating the VPC peering connection.
   *
   * You must specify this parameter in the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
   */
  public fun peerVpcId(): String

  /**
   * Any tags assigned to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnVPCPeeringConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param peerOwnerId The AWS account ID of the owner of the accepter VPC.
     * Default: Your AWS account ID
     */
    public fun peerOwnerId(peerOwnerId: String)

    /**
     * @param peerRegion The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request.
     * Default: The Region in which you make the request.
     */
    public fun peerRegion(peerRegion: String)

    /**
     * @param peerRoleArn The Amazon Resource Name (ARN) of the VPC peer role for the peering
     * connection in another AWS account.
     * This is required when you are peering a VPC in a different AWS account.
     */
    public fun peerRoleArn(peerRoleArn: String)

    /**
     * @param peerVpcId The ID of the VPC with which you are creating the VPC peering connection. 
     * You must specify this parameter in the request.
     */
    public fun peerVpcId(peerVpcId: String)

    /**
     * @param tags Any tags assigned to the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps.Builder
        = software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps.builder()

    /**
     * @param peerOwnerId The AWS account ID of the owner of the accepter VPC.
     * Default: Your AWS account ID
     */
    override fun peerOwnerId(peerOwnerId: String) {
      cdkBuilder.peerOwnerId(peerOwnerId)
    }

    /**
     * @param peerRegion The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request.
     * Default: The Region in which you make the request.
     */
    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    /**
     * @param peerRoleArn The Amazon Resource Name (ARN) of the VPC peer role for the peering
     * connection in another AWS account.
     * This is required when you are peering a VPC in a different AWS account.
     */
    override fun peerRoleArn(peerRoleArn: String) {
      cdkBuilder.peerRoleArn(peerRoleArn)
    }

    /**
     * @param peerVpcId The ID of the VPC with which you are creating the VPC peering connection. 
     * You must specify this parameter in the request.
     */
    override fun peerVpcId(peerVpcId: String) {
      cdkBuilder.peerVpcId(peerVpcId)
    }

    /**
     * @param tags Any tags assigned to the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags assigned to the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps,
  ) : CdkObject(cdkObject), CfnVPCPeeringConnectionProps {
    /**
     * The AWS account ID of the owner of the accepter VPC.
     *
     * Default: Your AWS account ID
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
     */
    override fun peerOwnerId(): String? = unwrap(this).getPeerOwnerId()

    /**
     * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than
     * the Region in which you make the request.
     *
     * Default: The Region in which you make the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion)
     */
    override fun peerRegion(): String? = unwrap(this).getPeerRegion()

    /**
     * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS
     * account.
     *
     * This is required when you are peering a VPC in a different AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
     */
    override fun peerRoleArn(): String? = unwrap(this).getPeerRoleArn()

    /**
     * The ID of the VPC with which you are creating the VPC peering connection.
     *
     * You must specify this parameter in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
     */
    override fun peerVpcId(): String = unwrap(this).getPeerVpcId()

    /**
     * Any tags assigned to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCPeeringConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps):
        CfnVPCPeeringConnectionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVPCPeeringConnectionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCPeeringConnectionProps):
        software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps
  }
}
