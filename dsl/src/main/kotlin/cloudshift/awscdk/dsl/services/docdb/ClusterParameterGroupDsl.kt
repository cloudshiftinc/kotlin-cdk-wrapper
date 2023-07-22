@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.docdb.ClusterParameterGroup
import software.constructs.Construct

@CdkDslMarker
public class ClusterParameterGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ClusterParameterGroup.Builder =
      ClusterParameterGroup.Builder.create(scope, id)

  /**
   * The name of the cluster parameter group.
   *
   * Default: A CDK generated name for the cluster parameter group
   *
   * @param dbClusterParameterGroupName The name of the cluster parameter group. 
   */
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * Description for this parameter group.
   *
   * Default: a CDK generated description
   *
   * @param description Description for this parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Database family of this parameter group.
   *
   * @param family Database family of this parameter group. 
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * The parameters in this parameter group.
   *
   * @param parameters The parameters in this parameter group. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): ClusterParameterGroup = cdkBuilder.build()
}
