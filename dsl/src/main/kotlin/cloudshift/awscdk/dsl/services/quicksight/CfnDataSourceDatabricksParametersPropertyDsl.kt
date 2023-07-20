@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDatabricksParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.DatabricksParametersProperty.Builder =
      CfnDataSource.DatabricksParametersProperty.builder()

  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun sqlEndpointPath(sqlEndpointPath: String) {
    cdkBuilder.sqlEndpointPath(sqlEndpointPath)
  }

  public fun build(): CfnDataSource.DatabricksParametersProperty = cdkBuilder.build()
}
