@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
 * The `AWS::RDS::DBClusterParameterGroup` resource creates a new Amazon RDS DB cluster parameter
 * group.
 *
 * For information about configuring parameters for Amazon Aurora DB clusters, see [Working with
 * parameter
 * groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
 * in the *Amazon Aurora User Guide* .
 *
 *
 * If you apply a parameter group to a DB cluster, then its DB instances might need to reboot. This
 * can result in an outage while the DB instances are rebooting.
 *
 * If you apply a change to parameter group associated with a stopped DB cluster, then the updated
 * stack waits until the DB cluster is started.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * Object parameters;
 * CfnDBClusterParameterGroup cfnDBClusterParameterGroup =
 * CfnDBClusterParameterGroup.Builder.create(this, "MyCfnDBClusterParameterGroup")
 * .description("description")
 * .family("family")
 * .parameters(parameters)
 * // the properties below are optional
 * .dbClusterParameterGroupName("dbClusterParameterGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html)
 */
public open class CfnDBClusterParameterGroup(
  cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBClusterParameterGroupProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBClusterParameterGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBClusterParameterGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBClusterParameterGroupProps(props)
  )

  /**
   * The name of the DB cluster parameter group.
   */
  public open fun dbClusterParameterGroupName(): String? =
      unwrap(this).getDbClusterParameterGroupName()

  /**
   * The name of the DB cluster parameter group.
   */
  public open fun dbClusterParameterGroupName(`value`: String) {
    unwrap(this).setDbClusterParameterGroupName(`value`)
  }

  /**
   * The description for the DB cluster parameter group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description for the DB cluster parameter group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The DB cluster parameter group family name.
   */
  public open fun family(): String = unwrap(this).getFamily()

  /**
   * The DB cluster parameter group family name.
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
   * Provides a list of parameters for the DB cluster parameter group.
   */
  public open fun parameters(): Any = unwrap(this).getParameters()

  /**
   * Provides a list of parameters for the DB cluster parameter group.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags to assign to the DB cluster parameter group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags to assign to the DB cluster parameter group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags to assign to the DB cluster parameter group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBClusterParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the DB cluster parameter group.
     *
     * Constraints:
     *
     * * Must not match the name of an existing DB cluster parameter group.
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-dbclusterparametergroupname)
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group. 
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * The description for the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-description)
     * @param description The description for the DB cluster parameter group. 
     */
    public fun description(description: String)

    /**
     * The DB cluster parameter group family name.
     *
     * A DB cluster parameter group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a database engine and engine
     * version compatible with that DB cluster parameter group family.
     *
     * *Aurora MySQL*
     *
     * Example: `aurora-mysql5.7` , `aurora-mysql8.0`
     *
     * *Aurora PostgreSQL*
     *
     * Example: `aurora-postgresql14`
     *
     * *RDS for MySQL*
     *
     * Example: `mysql8.0`
     *
     * *RDS for PostgreSQL*
     *
     * Example: `postgres13`
     *
     * To list all of the available parameter group families for a DB engine, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine &lt;engine&gt;`
     *
     * For example, to list all of the available parameter group families for the Aurora PostgreSQL
     * DB engine, use the following command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine aurora-postgresql`
     *
     *
     * The output contains duplicates.
     *
     *
     * The following are the valid DB engine values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `mysql`
     * * `postgres`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-family)
     * @param family The DB cluster parameter group family name. 
     */
    public fun family(family: String)

    /**
     * Provides a list of parameters for the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
     * @param parameters Provides a list of parameters for the DB cluster parameter group. 
     */
    public fun parameters(parameters: Any)

    /**
     * Tags to assign to the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
     * @param tags Tags to assign to the DB cluster parameter group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to assign to the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
     * @param tags Tags to assign to the DB cluster parameter group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup.Builder.create(scope, id)

    /**
     * The name of the DB cluster parameter group.
     *
     * Constraints:
     *
     * * Must not match the name of an existing DB cluster parameter group.
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-dbclusterparametergroupname)
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group. 
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * The description for the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-description)
     * @param description The description for the DB cluster parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The DB cluster parameter group family name.
     *
     * A DB cluster parameter group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a database engine and engine
     * version compatible with that DB cluster parameter group family.
     *
     * *Aurora MySQL*
     *
     * Example: `aurora-mysql5.7` , `aurora-mysql8.0`
     *
     * *Aurora PostgreSQL*
     *
     * Example: `aurora-postgresql14`
     *
     * *RDS for MySQL*
     *
     * Example: `mysql8.0`
     *
     * *RDS for PostgreSQL*
     *
     * Example: `postgres13`
     *
     * To list all of the available parameter group families for a DB engine, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine &lt;engine&gt;`
     *
     * For example, to list all of the available parameter group families for the Aurora PostgreSQL
     * DB engine, use the following command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine aurora-postgresql`
     *
     *
     * The output contains duplicates.
     *
     *
     * The following are the valid DB engine values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `mysql`
     * * `postgres`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-family)
     * @param family The DB cluster parameter group family name. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * Provides a list of parameters for the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
     * @param parameters Provides a list of parameters for the DB cluster parameter group. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * Tags to assign to the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
     * @param tags Tags to assign to the DB cluster parameter group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to assign to the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
     * @param tags Tags to assign to the DB cluster parameter group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBClusterParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBClusterParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup):
        CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterParameterGroup):
        software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup
  }
}
