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
 * The `AWS::RDS::DBParameterGroup` resource creates a custom parameter group for an RDS database
 * family.
 *
 * This type can be declared in a template and referenced in the `DBParameterGroupName` property of
 * an
 * `[AWS::RDS::DBInstance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html)`
 * resource.
 *
 * For information about configuring parameters for Amazon RDS DB instances, see [Working with
 * parameter
 * groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html) in
 * the *Amazon RDS User Guide* .
 *
 * For information about configuring parameters for Amazon Aurora DB instances, see [Working with
 * parameter
 * groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
 * in the *Amazon Aurora User Guide* .
 *
 *
 * Applying a parameter group to a DB instance may require the DB instance to reboot, resulting in a
 * database outage for the duration of the reboot.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * Object parameters;
 * CfnDBParameterGroup cfnDBParameterGroup = CfnDBParameterGroup.Builder.create(this,
 * "MyCfnDBParameterGroup")
 * .description("description")
 * .family("family")
 * // the properties below are optional
 * .dbParameterGroupName("dbParameterGroupName")
 * .parameters(parameters)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html)
 */
public open class CfnDBParameterGroup(
  cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBParameterGroupProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnDBParameterGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDBParameterGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDBParameterGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDBParameterGroupProps(props)
  )

  /**
   * The name of the DB parameter group.
   */
  public open fun attrDbParameterGroupName(): String = unwrap(this).getAttrDbParameterGroupName()

  /**
   * The name of the DB parameter group.
   */
  public open fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  /**
   * The name of the DB parameter group.
   */
  public open fun dbParameterGroupName(`value`: String) {
    unwrap(this).setDbParameterGroupName(`value`)
  }

  /**
   * Provides the customer-specified description for this DB parameter group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * Provides the customer-specified description for this DB parameter group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The DB parameter group family name.
   */
  public open fun family(): String = unwrap(this).getFamily()

  /**
   * The DB parameter group family name.
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
   * An array of parameter names and values for the parameter update.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * An array of parameter names and values for the parameter update.
   */
  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An optional array of key-value pairs to apply to this DB parameter group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An optional array of key-value pairs to apply to this DB parameter group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional array of key-value pairs to apply to this DB parameter group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the DB parameter group.
     *
     * Constraints:
     *
     * * Must be 1 to 255 letters, numbers, or hyphens.
     * * First character must be a letter
     * * Can't end with a hyphen or contain two consecutive hyphens
     *
     * If you don't specify a value for `DBParameterGroupName` property, a name is automatically
     * created for the DB parameter group.
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-dbparametergroupname)
     * @param dbParameterGroupName The name of the DB parameter group. 
     */
    public fun dbParameterGroupName(dbParameterGroupName: String)

    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description)
     * @param description Provides the customer-specified description for this DB parameter group. 
     */
    public fun description(description: String)

    /**
     * The DB parameter group family name.
     *
     * A DB parameter group can be associated with one and only one DB parameter group family, and
     * can be applied only to a DB instance running a DB engine and engine version compatible with that
     * DB parameter group family.
     *
     *
     * The DB parameter group family can't be changed when updating a DB parameter group.
     *
     *
     * To list all of the available parameter group families, use the following command:
     *
     * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
     *
     * The output contains duplicates.
     *
     * For more information, see
     * `[CreateDBParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBParameterGroup.html)`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family)
     * @param family The DB parameter group family name. 
     */
    public fun family(family: String)

    /**
     * An array of parameter names and values for the parameter update.
     *
     * At least one parameter name and value must be supplied. Subsequent arguments are optional.
     *
     * RDS for Db2 requires you to bring your own Db2 license. You must enter your IBM customer ID (
     * `rds.ibm_customer_id` ) and site number ( `rds.ibm_site_id` ) before starting a Db2 instance.
     *
     * For more information about DB parameters and DB parameter groups for Amazon RDS DB engines,
     * see [Working with DB Parameter
     * Groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* .
     *
     * For more information about DB cluster and DB instance parameters and parameter groups for
     * Amazon Aurora DB engines, see [Working with DB Parameter Groups and DB Cluster Parameter
     * Groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     *
     * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
     * The default apply method for each parameter is used.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters)
     * @param parameters An array of parameter names and values for the parameter update. 
     */
    public fun parameters(parameters: Any)

    /**
     * An optional array of key-value pairs to apply to this DB parameter group.
     *
     *
     * Currently, this is the only property that supports drift detection.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB parameter group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional array of key-value pairs to apply to this DB parameter group.
     *
     *
     * Currently, this is the only property that supports drift detection.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB parameter group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBParameterGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBParameterGroup.Builder.create(scope, id)

    /**
     * The name of the DB parameter group.
     *
     * Constraints:
     *
     * * Must be 1 to 255 letters, numbers, or hyphens.
     * * First character must be a letter
     * * Can't end with a hyphen or contain two consecutive hyphens
     *
     * If you don't specify a value for `DBParameterGroupName` property, a name is automatically
     * created for the DB parameter group.
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-dbparametergroupname)
     * @param dbParameterGroupName The name of the DB parameter group. 
     */
    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description)
     * @param description Provides the customer-specified description for this DB parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The DB parameter group family name.
     *
     * A DB parameter group can be associated with one and only one DB parameter group family, and
     * can be applied only to a DB instance running a DB engine and engine version compatible with that
     * DB parameter group family.
     *
     *
     * The DB parameter group family can't be changed when updating a DB parameter group.
     *
     *
     * To list all of the available parameter group families, use the following command:
     *
     * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
     *
     * The output contains duplicates.
     *
     * For more information, see
     * `[CreateDBParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBParameterGroup.html)`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family)
     * @param family The DB parameter group family name. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * An array of parameter names and values for the parameter update.
     *
     * At least one parameter name and value must be supplied. Subsequent arguments are optional.
     *
     * RDS for Db2 requires you to bring your own Db2 license. You must enter your IBM customer ID (
     * `rds.ibm_customer_id` ) and site number ( `rds.ibm_site_id` ) before starting a Db2 instance.
     *
     * For more information about DB parameters and DB parameter groups for Amazon RDS DB engines,
     * see [Working with DB Parameter
     * Groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* .
     *
     * For more information about DB cluster and DB instance parameters and parameter groups for
     * Amazon Aurora DB engines, see [Working with DB Parameter Groups and DB Cluster Parameter
     * Groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     *
     * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
     * The default apply method for each parameter is used.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters)
     * @param parameters An array of parameter names and values for the parameter update. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * An optional array of key-value pairs to apply to this DB parameter group.
     *
     *
     * Currently, this is the only property that supports drift detection.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB parameter group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional array of key-value pairs to apply to this DB parameter group.
     *
     *
     * Currently, this is the only property that supports drift detection.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
     * @param tags An optional array of key-value pairs to apply to this DB parameter group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBParameterGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBParameterGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroup):
        CfnDBParameterGroup = CfnDBParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBParameterGroup):
        software.amazon.awscdk.services.rds.CfnDBParameterGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.CfnDBParameterGroup
  }
}
