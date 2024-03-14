package io.cloudshiftdev.awscdk.services.dms

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

public open class CfnReplicationSubnetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
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
   * The description for the subnet group.
   */
  public open fun replicationSubnetGroupDescription(): String =
      unwrap(this).getReplicationSubnetGroupDescription()

  /**
   * The description for the subnet group.
   */
  public open fun replicationSubnetGroupDescription(`value`: String) {
    unwrap(this).setReplicationSubnetGroupDescription(`value`)
  }

  /**
   * The identifier for the replication subnet group.
   */
  public open fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  /**
   * The identifier for the replication subnet group.
   */
  public open fun replicationSubnetGroupIdentifier(`value`: String) {
    unwrap(this).setReplicationSubnetGroupIdentifier(`value`)
  }

  /**
   * One or more subnet IDs to be assigned to the subnet group.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * One or more subnet IDs to be assigned to the subnet group.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * One or more subnet IDs to be assigned to the subnet group.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags to be assigned to the subnet group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tags to be assigned to the subnet group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * One or more tags to be assigned to the subnet group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnReplicationSubnetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
     * @param replicationSubnetGroupDescription The description for the subnet group. 
     */
    public fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String)

    /**
     * The identifier for the replication subnet group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
     * @param replicationSubnetGroupIdentifier The identifier for the replication subnet group. 
     */
    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String)

    /**
     * One or more subnet IDs to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * One or more subnet IDs to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * One or more tags to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
     * @param tags One or more tags to be assigned to the subnet group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
     * @param tags One or more tags to be assigned to the subnet group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup.Builder.create(scope, id)

    /**
     * The description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupdescription)
     * @param replicationSubnetGroupDescription The description for the subnet group. 
     */
    override fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String) {
      cdkBuilder.replicationSubnetGroupDescription(replicationSubnetGroupDescription)
    }

    /**
     * The identifier for the replication subnet group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-replicationsubnetgroupidentifier)
     * @param replicationSubnetGroupIdentifier The identifier for the replication subnet group. 
     */
    override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    /**
     * One or more subnet IDs to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * One or more subnet IDs to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-subnetids)
     * @param subnetIds One or more subnet IDs to be assigned to the subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * One or more tags to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
     * @param tags One or more tags to be assigned to the subnet group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * One or more tags to be assigned to the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationsubnetgroup.html#cfn-dms-replicationsubnetgroup-tags)
     * @param tags One or more tags to be assigned to the subnet group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup):
        CfnReplicationSubnetGroup = CfnReplicationSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSubnetGroup):
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup = wrapped.cdkObject
  }
}
