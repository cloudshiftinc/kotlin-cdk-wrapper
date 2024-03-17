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
 * Properties for defining a `CfnDBClusterParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * Object parameters;
 * CfnDBClusterParameterGroupProps cfnDBClusterParameterGroupProps =
 * CfnDBClusterParameterGroupProps.builder()
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
public interface CfnDBClusterParameterGroupProps {
  /**
   * The name of the DB cluster parameter group.
   *
   * Constraints:
   *
   * * Must not match the name of an existing DB cluster parameter group.
   *
   * If you don't specify a value for `DBClusterParameterGroupName` property, a name is
   * automatically created for the DB cluster parameter group.
   *
   *
   * This value is stored as a lowercase string.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-dbclusterparametergroupname)
   */
  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

  /**
   * A friendly description for this DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-description)
   */
  public fun description(): String

  /**
   * The DB cluster parameter group family name.
   *
   * A DB cluster parameter group can be associated with one and only one DB cluster parameter group
   * family, and can be applied only to a DB cluster running a DB engine and engine version compatible
   * with that DB cluster parameter group family.
   *
   *
   * The DB cluster parameter group family can't be changed when updating a DB cluster parameter
   * group.
   *
   *
   * To list all of the available parameter group families, use the following command:
   *
   * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
   *
   * The output contains duplicates.
   *
   * For more information, see
   * `[CreateDBClusterParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBClusterParameterGroup.html)`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-family)
   */
  public fun family(): String

  /**
   * Provides a list of parameters for the DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
   */
  public fun parameters(): Any

  /**
   * An optional array of key-value pairs to apply to this DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBClusterParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group.
     * Constraints:
     *
     * * Must not match the name of an existing DB cluster parameter group.
     *
     * If you don't specify a value for `DBClusterParameterGroupName` property, a name is
     * automatically created for the DB cluster parameter group.
     *
     *
     * This value is stored as a lowercase string.
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * @param description A friendly description for this DB cluster parameter group. 
     */
    public fun description(description: String)

    /**
     * @param family The DB cluster parameter group family name. 
     * A DB cluster parameter group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a DB engine and engine version
     * compatible with that DB cluster parameter group family.
     *
     *
     * The DB cluster parameter group family can't be changed when updating a DB cluster parameter
     * group.
     *
     *
     * To list all of the available parameter group families, use the following command:
     *
     * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
     *
     * The output contains duplicates.
     *
     * For more information, see
     * `[CreateDBClusterParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBClusterParameterGroup.html)`
     * .
     */
    public fun family(family: String)

    /**
     * @param parameters Provides a list of parameters for the DB cluster parameter group. 
     */
    public fun parameters(parameters: Any)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps.builder()

    /**
     * @param dbClusterParameterGroupName The name of the DB cluster parameter group.
     * Constraints:
     *
     * * Must not match the name of an existing DB cluster parameter group.
     *
     * If you don't specify a value for `DBClusterParameterGroupName` property, a name is
     * automatically created for the DB cluster parameter group.
     *
     *
     * This value is stored as a lowercase string.
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * @param description A friendly description for this DB cluster parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param family The DB cluster parameter group family name. 
     * A DB cluster parameter group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a DB engine and engine version
     * compatible with that DB cluster parameter group family.
     *
     *
     * The DB cluster parameter group family can't be changed when updating a DB cluster parameter
     * group.
     *
     *
     * To list all of the available parameter group families, use the following command:
     *
     * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
     *
     * The output contains duplicates.
     *
     * For more information, see
     * `[CreateDBClusterParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBClusterParameterGroup.html)`
     * .
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param parameters Provides a list of parameters for the DB cluster parameter group. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps,
  ) : CdkObject(cdkObject), CfnDBClusterParameterGroupProps {
    /**
     * The name of the DB cluster parameter group.
     *
     * Constraints:
     *
     * * Must not match the name of an existing DB cluster parameter group.
     *
     * If you don't specify a value for `DBClusterParameterGroupName` property, a name is
     * automatically created for the DB cluster parameter group.
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-dbclusterparametergroupname)
     */
    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    /**
     * A friendly description for this DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The DB cluster parameter group family name.
     *
     * A DB cluster parameter group can be associated with one and only one DB cluster parameter
     * group family, and can be applied only to a DB cluster running a DB engine and engine version
     * compatible with that DB cluster parameter group family.
     *
     *
     * The DB cluster parameter group family can't be changed when updating a DB cluster parameter
     * group.
     *
     *
     * To list all of the available parameter group families, use the following command:
     *
     * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
     *
     * The output contains duplicates.
     *
     * For more information, see
     * `[CreateDBClusterParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBClusterParameterGroup.html)`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-family)
     */
    override fun family(): String = unwrap(this).getFamily()

    /**
     * Provides a list of parameters for the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
     */
    override fun parameters(): Any = unwrap(this).getParameters()

    /**
     * An optional array of key-value pairs to apply to this DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps):
        CfnDBClusterParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDBClusterParameterGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterParameterGroupProps):
        software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps
  }
}
