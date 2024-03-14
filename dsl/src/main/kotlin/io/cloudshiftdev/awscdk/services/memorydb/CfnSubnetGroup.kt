package io.cloudshiftdev.awscdk.services.memorydb

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

public open class CfnSubnetGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.memorydb.CfnSubnetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the subnet group, such as
   * `arn:aws:memorydb:us-east-1:123456789012:subnetgroup/my-subnet-group`.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A description of the subnet group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the subnet group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the subnet group to be used for the cluster .
   */
  public open fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

  /**
   * The name of the subnet group to be used for the cluster .
   */
  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  /**
   * A list of Amazon VPC subnet IDs for the subnet group.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * A list of Amazon VPC subnet IDs for the subnet group.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * A list of Amazon VPC subnet IDs for the subnet group.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.memorydb.CfnSubnetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-description)
     * @param description A description of the subnet group. 
     */
    public fun description(description: String)

    /**
     * The name of the subnet group to be used for the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetgroupname)
     * @param subnetGroupName The name of the subnet group to be used for the cluster . 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * A list of Amazon VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetids)
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * A list of Amazon VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetids)
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnSubnetGroup.Builder =
        software.amazon.awscdk.services.memorydb.CfnSubnetGroup.Builder.create(scope, id)

    /**
     * A description of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-description)
     * @param description A description of the subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the subnet group to be used for the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetgroupname)
     * @param subnetGroupName The name of the subnet group to be used for the cluster . 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * A list of Amazon VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetids)
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * A list of Amazon VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetids)
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnSubnetGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.memorydb.CfnSubnetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnSubnetGroup):
        CfnSubnetGroup = CfnSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroup):
        software.amazon.awscdk.services.memorydb.CfnSubnetGroup = wrapped.cdkObject
  }
}
