@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.docdb.ClusterParameterGroupProps

/**
 * Properties for a cluster parameter group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * ClusterParameterGroupProps clusterParameterGroupProps = ClusterParameterGroupProps.builder()
 * .family("family")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * // the properties below are optional
 * .dbClusterParameterGroupName("dbClusterParameterGroupName")
 * .description("description")
 * .build();
 * ```
 */
@CdkDslMarker
public class ClusterParameterGroupPropsDsl {
  private val cdkBuilder: ClusterParameterGroupProps.Builder = ClusterParameterGroupProps.builder()

  /**
   * @param dbClusterParameterGroupName The name of the cluster parameter group.
   */
  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  /**
   * @param description Description for this parameter group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param family Database family of this parameter group. 
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param parameters The parameters in this parameter group. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): ClusterParameterGroupProps = cdkBuilder.build()
}
