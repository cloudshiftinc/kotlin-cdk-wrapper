@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

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

/**
 * The `AWS::Neptune::DBSubnetGroup` type creates an Amazon Neptune DB subnet group.
 *
 * Subnet groups must contain at least two subnets in two different Availability Zones in the same
 * AWS Region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptune.*;
 * CfnDBSubnetGroup cfnDBSubnetGroup = CfnDBSubnetGroup.Builder.create(this, "MyCfnDBSubnetGroup")
 * .dbSubnetGroupDescription("dbSubnetGroupDescription")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .dbSubnetGroupName("dbSubnetGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html)
 */
public open class CfnDBSubnetGroup(
  cdkObject: software.amazon.awscdk.services.neptune.CfnDBSubnetGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBSubnetGroupProps,
  ) :
      this(software.amazon.awscdk.services.neptune.CfnDBSubnetGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBSubnetGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBSubnetGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBSubnetGroupProps(props)
  )

  /**
   * Provides the description of the DB subnet group.
   */
  public open fun dbSubnetGroupDescription(): String = unwrap(this).getDbSubnetGroupDescription()

  /**
   * Provides the description of the DB subnet group.
   */
  public open fun dbSubnetGroupDescription(`value`: String) {
    unwrap(this).setDbSubnetGroupDescription(`value`)
  }

  /**
   * The name of the DB subnet group.
   */
  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * The name of the DB subnet group.
   */
  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon EC2 subnet IDs for the DB subnet group.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The Amazon EC2 subnet IDs for the DB subnet group.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The Amazon EC2 subnet IDs for the DB subnet group.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that you want to attach to the DB subnet group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags that you want to attach to the DB subnet group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags that you want to attach to the DB subnet group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.neptune.CfnDBSubnetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Provides the description of the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription)
     * @param dbSubnetGroupDescription Provides the description of the DB subnet group. 
     */
    public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String)

    /**
     * The name of the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname)
     * @param dbSubnetGroupName The name of the DB subnet group. 
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * The Amazon EC2 subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The Amazon EC2 subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags that you want to attach to the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags)
     * @param tags The tags that you want to attach to the DB subnet group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that you want to attach to the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags)
     * @param tags The tags that you want to attach to the DB subnet group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBSubnetGroup.Builder =
        software.amazon.awscdk.services.neptune.CfnDBSubnetGroup.Builder.create(scope, id)

    /**
     * Provides the description of the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription)
     * @param dbSubnetGroupDescription Provides the description of the DB subnet group. 
     */
    override fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
      cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
    }

    /**
     * The name of the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname)
     * @param dbSubnetGroupName The name of the DB subnet group. 
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * The Amazon EC2 subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The Amazon EC2 subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags that you want to attach to the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags)
     * @param tags The tags that you want to attach to the DB subnet group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags that you want to attach to the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags)
     * @param tags The tags that you want to attach to the DB subnet group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBSubnetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.neptune.CfnDBSubnetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBSubnetGroup):
        CfnDBSubnetGroup = CfnDBSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBSubnetGroup):
        software.amazon.awscdk.services.neptune.CfnDBSubnetGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.neptune.CfnDBSubnetGroup
  }
}
