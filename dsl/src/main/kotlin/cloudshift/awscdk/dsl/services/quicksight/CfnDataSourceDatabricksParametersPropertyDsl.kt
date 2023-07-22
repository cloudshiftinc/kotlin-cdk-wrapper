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

  /**
   * @param host The host name of the Databricks data source. 
   */
  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  /**
   * @param port The port for the Databricks data source. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param sqlEndpointPath The HTTP path of the Databricks data source. 
   */
  public fun sqlEndpointPath(sqlEndpointPath: String) {
    cdkBuilder.sqlEndpointPath(sqlEndpointPath)
  }

  public fun build(): CfnDataSource.DatabricksParametersProperty = cdkBuilder.build()
}
