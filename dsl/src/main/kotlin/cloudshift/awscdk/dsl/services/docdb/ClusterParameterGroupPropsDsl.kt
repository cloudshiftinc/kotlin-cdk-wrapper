@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.docdb.ClusterParameterGroupProps

@CdkDslMarker
public class ClusterParameterGroupPropsDsl {
  private val cdkBuilder: ClusterParameterGroupProps.Builder = ClusterParameterGroupProps.builder()

  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): ClusterParameterGroupProps = cdkBuilder.build()
}
