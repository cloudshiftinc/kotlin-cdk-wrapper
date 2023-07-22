@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rds.CfnDBParameterGroupProps

@CdkDslMarker
public class CfnDBParameterGroupPropsDsl {
  private val cdkBuilder: CfnDBParameterGroupProps.Builder = CfnDBParameterGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
  public fun dbParameterGroupName(dbParameterGroupName: String) {
    cdkBuilder.dbParameterGroupName(dbParameterGroupName)
  }

  /**
   * @param description Provides the customer-specified description for this DB parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param family The DB parameter group family name. 
   * A DB parameter group can be associated with one and only one DB parameter group family, and can
   * be applied only to a DB instance running a DB engine and engine version compatible with that DB
   * parameter group family.
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
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param parameters An array of parameter names and values for the parameter update.
   * At least one parameter name and value must be supplied. Subsequent arguments are optional.
   *
   * For more information about DB parameters and DB parameter groups for Amazon RDS DB engines, see
   * [Working with DB Parameter
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
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters An array of parameter names and values for the parameter update.
   * At least one parameter name and value must be supplied. Subsequent arguments are optional.
   *
   * For more information about DB parameters and DB parameter groups for Amazon RDS DB engines, see
   * [Working with DB Parameter
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
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param tags An optional array of key-value pairs to apply to this DB parameter group.
   *
   * Currently, this is the only property that supports drift detection.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An optional array of key-value pairs to apply to this DB parameter group.
   *
   * Currently, this is the only property that supports drift detection.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBParameterGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
