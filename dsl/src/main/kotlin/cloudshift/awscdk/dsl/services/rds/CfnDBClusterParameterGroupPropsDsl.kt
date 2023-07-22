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
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps

/**
 * Properties for defining a `CfnDBClusterParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
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
@CdkDslMarker
public class CfnDBClusterParameterGroupPropsDsl {
  private val cdkBuilder: CfnDBClusterParameterGroupProps.Builder =
      CfnDBClusterParameterGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * @param description A friendly description for this DB cluster parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param family The DB cluster parameter group family name. 
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
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param parameters Provides a list of parameters for the DB cluster parameter group. 
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters Provides a list of parameters for the DB cluster parameter group. 
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBClusterParameterGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
