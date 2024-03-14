package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCPeeringConnection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the peering connection.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS account ID of the owner of the accepter VPC.
   */
  public open fun peerOwnerId(): String? = unwrap(this).getPeerOwnerId()

  /**
   * The AWS account ID of the owner of the accepter VPC.
   */
  public open fun peerOwnerId(`value`: String) {
    unwrap(this).setPeerOwnerId(`value`)
  }

  /**
   * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the
   * Region in which you make the request.
   */
  public open fun peerRegion(): String? = unwrap(this).getPeerRegion()

  /**
   * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the
   * Region in which you make the request.
   */
  public open fun peerRegion(`value`: String) {
    unwrap(this).setPeerRegion(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS
   * account.
   */
  public open fun peerRoleArn(): String? = unwrap(this).getPeerRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS
   * account.
   */
  public open fun peerRoleArn(`value`: String) {
    unwrap(this).setPeerRoleArn(`value`)
  }

  /**
   * The ID of the VPC with which you are creating the VPC peering connection.
   */
  public open fun peerVpcId(): String = unwrap(this).getPeerVpcId()

  /**
   * The ID of the VPC with which you are creating the VPC peering connection.
   */
  public open fun peerVpcId(`value`: String) {
    unwrap(this).setPeerVpcId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags assigned to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCPeeringConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID of the owner of the accepter VPC.
     *
     * Default: Your AWS account ID
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
     * @param peerOwnerId The AWS account ID of the owner of the accepter VPC. 
     */
    public fun peerOwnerId(peerOwnerId: String)

    /**
     * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than
     * the Region in which you make the request.
     *
     * Default: The Region in which you make the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion)
     * @param peerRegion The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request. 
     */
    public fun peerRegion(peerRegion: String)

    /**
     * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS
     * account.
     *
     * This is required when you are peering a VPC in a different AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
     * @param peerRoleArn The Amazon Resource Name (ARN) of the VPC peer role for the peering
     * connection in another AWS account. 
     */
    public fun peerRoleArn(peerRoleArn: String)

    /**
     * The ID of the VPC with which you are creating the VPC peering connection.
     *
     * You must specify this parameter in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
     * @param peerVpcId The ID of the VPC with which you are creating the VPC peering connection. 
     */
    public fun peerVpcId(peerVpcId: String)

    /**
     * Any tags assigned to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
     * @param tags Any tags assigned to the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
     * @param tags Any tags assigned to the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection.Builder.create(scope, id)

    /**
     * The AWS account ID of the owner of the accepter VPC.
     *
     * Default: Your AWS account ID
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerownerid)
     * @param peerOwnerId The AWS account ID of the owner of the accepter VPC. 
     */
    override fun peerOwnerId(peerOwnerId: String) {
      cdkBuilder.peerOwnerId(peerOwnerId)
    }

    /**
     * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than
     * the Region in which you make the request.
     *
     * Default: The Region in which you make the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerregion)
     * @param peerRegion The Region code for the accepter VPC, if the accepter VPC is located in a
     * Region other than the Region in which you make the request. 
     */
    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    /**
     * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS
     * account.
     *
     * This is required when you are peering a VPC in a different AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peerrolearn)
     * @param peerRoleArn The Amazon Resource Name (ARN) of the VPC peer role for the peering
     * connection in another AWS account. 
     */
    override fun peerRoleArn(peerRoleArn: String) {
      cdkBuilder.peerRoleArn(peerRoleArn)
    }

    /**
     * The ID of the VPC with which you are creating the VPC peering connection.
     *
     * You must specify this parameter in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-peervpcid)
     * @param peerVpcId The ID of the VPC with which you are creating the VPC peering connection. 
     */
    override fun peerVpcId(peerVpcId: String) {
      cdkBuilder.peerVpcId(peerVpcId)
    }

    /**
     * Any tags assigned to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
     * @param tags Any tags assigned to the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags assigned to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-tags)
     * @param tags Any tags assigned to the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcpeeringconnection.html#cfn-ec2-vpcpeeringconnection-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCPeeringConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCPeeringConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection):
        CfnVPCPeeringConnection = CfnVPCPeeringConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVPCPeeringConnection):
        software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection = wrapped.cdkObject
  }
}
