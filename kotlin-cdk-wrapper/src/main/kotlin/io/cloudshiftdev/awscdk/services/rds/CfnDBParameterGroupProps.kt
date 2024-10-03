@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * Object parameters;
 * CfnDBParameterGroupProps cfnDBParameterGroupProps = CfnDBParameterGroupProps.builder()
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
public interface CfnDBParameterGroupProps {
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
   */
  public fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  /**
   * Provides the customer-specified description for this DB parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description)
   */
  public fun description(): String

  /**
   * The DB parameter group family name.
   *
   * A DB parameter group can be associated with one and only one DB parameter group family, and can
   * be applied only to a DB instance running a database engine and engine version compatible with that
   * DB parameter group family.
   *
   * To list all of the available parameter group families for a DB engine, use the following
   * command:
   *
   * `aws rds describe-db-engine-versions --query
   * "DBEngineVersions[].DBParameterGroupFamily" --engine &lt;engine&gt;`
   *
   * For example, to list all of the available parameter group families for the MySQL DB engine, use
   * the following command:
   *
   * `aws rds describe-db-engine-versions --query
   * "DBEngineVersions[].DBParameterGroupFamily" --engine mysql`
   *
   *
   * The output contains duplicates.
   *
   *
   * The following are the valid DB engine values:
   *
   * * `aurora-mysql`
   * * `aurora-postgresql`
   * * `db2-ae`
   * * `db2-se`
   * * `mysql`
   * * `oracle-ee`
   * * `oracle-ee-cdb`
   * * `oracle-se2`
   * * `oracle-se2-cdb`
   * * `postgres`
   * * `sqlserver-ee`
   * * `sqlserver-se`
   * * `sqlserver-ex`
   * * `sqlserver-web`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family)
   */
  public fun family(): String

  /**
   * An array of parameter names and values for the parameter update.
   *
   * You must specify at least one parameter name and value.
   *
   * For more information about parameter groups, see [Working with parameter
   * groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
   * in the *Amazon RDS User Guide* , or [Working with parameter
   * groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
   * in the *Amazon Aurora User Guide* .
   *
   *
   * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
   * The default apply method for each parameter is used.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Tags to assign to the DB parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbParameterGroupName The name of the DB parameter group.
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
     */
    public fun dbParameterGroupName(dbParameterGroupName: String)

    /**
     * @param description Provides the customer-specified description for this DB parameter group. 
     */
    public fun description(description: String)

    /**
     * @param family The DB parameter group family name. 
     * A DB parameter group can be associated with one and only one DB parameter group family, and
     * can be applied only to a DB instance running a database engine and engine version compatible
     * with that DB parameter group family.
     *
     * To list all of the available parameter group families for a DB engine, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine &lt;engine&gt;`
     *
     * For example, to list all of the available parameter group families for the MySQL DB engine,
     * use the following command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine mysql`
     *
     *
     * The output contains duplicates.
     *
     *
     * The following are the valid DB engine values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `db2-ae`
     * * `db2-se`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     */
    public fun family(family: String)

    /**
     * @param parameters An array of parameter names and values for the parameter update.
     * You must specify at least one parameter name and value.
     *
     * For more information about parameter groups, see [Working with parameter
     * groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* , or [Working with parameter
     * groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     *
     * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
     * The default apply method for each parameter is used.
     */
    public fun parameters(parameters: Any)

    /**
     * @param tags Tags to assign to the DB parameter group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to assign to the DB parameter group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBParameterGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBParameterGroupProps.builder()

    /**
     * @param dbParameterGroupName The name of the DB parameter group.
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
     */
    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    /**
     * @param description Provides the customer-specified description for this DB parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param family The DB parameter group family name. 
     * A DB parameter group can be associated with one and only one DB parameter group family, and
     * can be applied only to a DB instance running a database engine and engine version compatible
     * with that DB parameter group family.
     *
     * To list all of the available parameter group families for a DB engine, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine &lt;engine&gt;`
     *
     * For example, to list all of the available parameter group families for the MySQL DB engine,
     * use the following command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine mysql`
     *
     *
     * The output contains duplicates.
     *
     *
     * The following are the valid DB engine values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `db2-ae`
     * * `db2-se`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param parameters An array of parameter names and values for the parameter update.
     * You must specify at least one parameter name and value.
     *
     * For more information about parameter groups, see [Working with parameter
     * groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* , or [Working with parameter
     * groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     *
     * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
     * The default apply method for each parameter is used.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags Tags to assign to the DB parameter group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags to assign to the DB parameter group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroupProps,
  ) : CdkObject(cdkObject),
      CfnDBParameterGroupProps {
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
     */
    override fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The DB parameter group family name.
     *
     * A DB parameter group can be associated with one and only one DB parameter group family, and
     * can be applied only to a DB instance running a database engine and engine version compatible
     * with that DB parameter group family.
     *
     * To list all of the available parameter group families for a DB engine, use the following
     * command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine &lt;engine&gt;`
     *
     * For example, to list all of the available parameter group families for the MySQL DB engine,
     * use the following command:
     *
     * `aws rds describe-db-engine-versions --query
     * "DBEngineVersions[].DBParameterGroupFamily" --engine mysql`
     *
     *
     * The output contains duplicates.
     *
     *
     * The following are the valid DB engine values:
     *
     * * `aurora-mysql`
     * * `aurora-postgresql`
     * * `db2-ae`
     * * `db2-se`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family)
     */
    override fun family(): String = unwrap(this).getFamily()

    /**
     * An array of parameter names and values for the parameter update.
     *
     * You must specify at least one parameter name and value.
     *
     * For more information about parameter groups, see [Working with parameter
     * groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* , or [Working with parameter
     * groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     *
     * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
     * The default apply method for each parameter is used.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Tags to assign to the DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroupProps):
        CfnDBParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBParameterGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBParameterGroupProps):
        software.amazon.awscdk.services.rds.CfnDBParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBParameterGroupProps
  }
}
