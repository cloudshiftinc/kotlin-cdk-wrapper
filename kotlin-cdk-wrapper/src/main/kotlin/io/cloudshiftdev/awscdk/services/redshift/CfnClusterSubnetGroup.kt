@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

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
 * Specifies an Amazon Redshift subnet group.
 *
 * You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (
 * Amazon VPC ) when creating Amazon Redshift subnet group.
 *
 * For information about subnet groups, go to [Amazon Redshift Cluster Subnet
 * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html) in
 * the *Amazon Redshift Cluster Management Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnClusterSubnetGroup cfnClusterSubnetGroup = CfnClusterSubnetGroup.Builder.create(this,
 * "MyCfnClusterSubnetGroup")
 * .description("description")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html)
 */
public open class CfnClusterSubnetGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterSubnetGroupProps,
  ) :
      this(software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnClusterSubnetGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterSubnetGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterSubnetGroupProps(props)
  )

  /**
   * The name of the cluster subnet group.
   */
  public open fun attrClusterSubnetGroupName(): String =
      unwrap(this).getAttrClusterSubnetGroupName()

  /**
   * A description for the subnet group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description for the subnet group.
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
   * An array of VPC subnet IDs.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * An array of VPC subnet IDs.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * An array of VPC subnet IDs.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnClusterSubnetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-description)
     * @param description A description for the subnet group. 
     */
    public fun description(description: String)

    /**
     * An array of VPC subnet IDs.
     *
     * A maximum of 20 subnets can be modified in a single request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
     * @param subnetIds An array of VPC subnet IDs. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * An array of VPC subnet IDs.
     *
     * A maximum of 20 subnets can be modified in a single request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
     * @param subnetIds An array of VPC subnet IDs. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup.Builder.create(scope, id)

    /**
     * A description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-description)
     * @param description A description for the subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An array of VPC subnet IDs.
     *
     * A maximum of 20 subnets can be modified in a single request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
     * @param subnetIds An array of VPC subnet IDs. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * An array of VPC subnet IDs.
     *
     * A maximum of 20 subnets can be modified in a single request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
     * @param subnetIds An array of VPC subnet IDs. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     * subnet group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup):
        CfnClusterSubnetGroup = CfnClusterSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSubnetGroup):
        software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup = wrapped.cdkObject
  }
}
