@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DocDB::DBClusterParameterGroup` Amazon DocumentDB (with MongoDB compatibility) resource
 * describes a DBClusterParameterGroup.
 *
 * For more information, see
 * [DBClusterParameterGroup](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBClusterParameterGroup.html)
 * in the *Amazon DocumentDB Developer Guide* .
 *
 * Parameters in a cluster parameter group apply to all of the instances in a cluster.
 *
 * A cluster parameter group is initially created with the default parameters for the database
 * engine used by instances in the cluster. To provide custom values for any of the parameters, you
 * must modify the group after you create it. After you create a DB cluster parameter group, you must
 * associate it with your cluster. For the new cluster parameter group and associated settings to take
 * effect, you must then reboot the DB instances in the cluster without failover.
 *
 *
 * After you create a cluster parameter group, you should wait at least 5 minutes before creating
 * your first cluster that uses that cluster parameter group as the default parameter group. This
 * allows Amazon DocumentDB to fully complete the create action before the cluster parameter group is
 * used as the default for a new cluster. This step is especially important for parameters that are
 * critical when creating the default database for a cluster, such as the character set for the default
 * database defined by the `character_set_database` parameter.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdb.*;
 * Object parameters;
 * CfnDBClusterParameterGroup cfnDBClusterParameterGroup =
 * CfnDBClusterParameterGroup.Builder.create(this, "MyCfnDBClusterParameterGroup")
 * .description("description")
 * .family("family")
 * .parameters(parameters)
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html)
 */
public open class CfnDBClusterParameterGroup(
  cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBClusterParameterGroupProps,
  ) :
      this(software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBClusterParameterGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBClusterParameterGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBClusterParameterGroupProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description for the cluster parameter group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description for the cluster parameter group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The cluster parameter group family name.
   */
  public open fun family(): String = unwrap(this).getFamily()

  /**
   * The cluster parameter group family name.
   */
  public open fun family(`value`: String) {
    unwrap(this).setFamily(`value`)
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
   * The name of the DB cluster parameter group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the DB cluster parameter group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Provides a list of parameters for the cluster parameter group.
   */
  public open fun parameters(): Any = unwrap(this).getParameters()

  /**
   * Provides a list of parameters for the cluster parameter group.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to be assigned to the cluster parameter group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to be assigned to the cluster parameter group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to be assigned to the cluster parameter group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.CfnDBClusterParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-description)
     * @param description The description for the cluster parameter group. 
     */
    public fun description(description: String)

    /**
     * The cluster parameter group family name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-family)
     * @param family The cluster parameter group family name. 
     */
    public fun family(family: String)

    /**
     * The name of the DB cluster parameter group.
     *
     * Constraints:
     *
     * * Must not match the name of an existing `DBClusterParameterGroup` .
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-name)
     * @param name The name of the DB cluster parameter group. 
     */
    public fun name(name: String)

    /**
     * Provides a list of parameters for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-parameters)
     * @param parameters Provides a list of parameters for the cluster parameter group. 
     */
    public fun parameters(parameters: Any)

    /**
     * The tags to be assigned to the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
     * @param tags The tags to be assigned to the cluster parameter group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to be assigned to the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
     * @param tags The tags to be assigned to the cluster parameter group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup.Builder
        = software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup.Builder.create(scope, id)

    /**
     * The description for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-description)
     * @param description The description for the cluster parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The cluster parameter group family name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-family)
     * @param family The cluster parameter group family name. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * The name of the DB cluster parameter group.
     *
     * Constraints:
     *
     * * Must not match the name of an existing `DBClusterParameterGroup` .
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-name)
     * @param name The name of the DB cluster parameter group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Provides a list of parameters for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-parameters)
     * @param parameters Provides a list of parameters for the cluster parameter group. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The tags to be assigned to the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
     * @param tags The tags to be assigned to the cluster parameter group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to be assigned to the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
     * @param tags The tags to be assigned to the cluster parameter group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBClusterParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBClusterParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup):
        CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterParameterGroup):
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup
  }
}
