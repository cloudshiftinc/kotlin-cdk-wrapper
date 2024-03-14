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

public open class CfnLocalGatewayRouteTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the local gateway route table.
   */
  public open fun attrLocalGatewayRouteTableArn(): String =
      unwrap(this).getAttrLocalGatewayRouteTableArn()

  /**
   * The ID of the local gateway route table.
   */
  public open fun attrLocalGatewayRouteTableId(): String =
      unwrap(this).getAttrLocalGatewayRouteTableId()

  /**
   * The Amazon Resource Name (ARN) of the Outpost.
   */
  public open fun attrOutpostArn(): String = unwrap(this).getAttrOutpostArn()

  /**
   * The ID of the AWS account that owns the local gateway route table.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The state of the local gateway route table.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the local gateway.
   */
  public open fun localGatewayId(): String = unwrap(this).getLocalGatewayId()

  /**
   * The ID of the local gateway.
   */
  public open fun localGatewayId(`value`: String) {
    unwrap(this).setLocalGatewayId(`value`)
  }

  /**
   * The mode of the local gateway route table.
   */
  public open fun mode(): String? = unwrap(this).getMode()

  /**
   * The mode of the local gateway route table.
   */
  public open fun mode(`value`: String) {
    unwrap(this).setMode(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the local gateway route table.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the local gateway route table.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the local gateway route table.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnLocalGatewayRouteTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the local gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-localgatewayid)
     * @param localGatewayId The ID of the local gateway. 
     */
    public fun localGatewayId(localGatewayId: String)

    /**
     * The mode of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-mode)
     * @param mode The mode of the local gateway route table. 
     */
    public fun mode(mode: String)

    /**
     * The tags assigned to the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-tags)
     * @param tags The tags assigned to the local gateway route table. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-tags)
     * @param tags The tags assigned to the local gateway route table. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable.Builder.create(scope, id)

    /**
     * The ID of the local gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-localgatewayid)
     * @param localGatewayId The ID of the local gateway. 
     */
    override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    /**
     * The mode of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-mode)
     * @param mode The mode of the local gateway route table. 
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * The tags assigned to the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-tags)
     * @param tags The tags assigned to the local gateway route table. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetable.html#cfn-ec2-localgatewayroutetable-tags)
     * @param tags The tags assigned to the local gateway route table. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocalGatewayRouteTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocalGatewayRouteTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable):
        CfnLocalGatewayRouteTable = CfnLocalGatewayRouteTable(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTable):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable = wrapped.cdkObject
  }
}
