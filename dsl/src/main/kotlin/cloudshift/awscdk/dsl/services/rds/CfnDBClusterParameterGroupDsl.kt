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
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup
import software.constructs.Construct

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
 * If you apply a change to parameter group associated with a stopped DB cluster, then the update
 * stack waits until the DB cluster is started.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
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
@CdkDslMarker
public class CfnDBClusterParameterGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDBClusterParameterGroup.Builder =
      CfnDBClusterParameterGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
   * @param dbClusterParameterGroupName The name of the DB cluster parameter group. 
   */
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * A friendly description for this DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-description)
   * @param description A friendly description for this DB cluster parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

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
   * @param family The DB cluster parameter group family name. 
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * Provides a list of parameters for the DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
   * @param parameters Provides a list of parameters for the DB cluster parameter group. 
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * Provides a list of parameters for the DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
   * @param parameters Provides a list of parameters for the DB cluster parameter group. 
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * An optional array of key-value pairs to apply to this DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
   * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An optional array of key-value pairs to apply to this DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
   * @param tags An optional array of key-value pairs to apply to this DB cluster parameter group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBClusterParameterGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
