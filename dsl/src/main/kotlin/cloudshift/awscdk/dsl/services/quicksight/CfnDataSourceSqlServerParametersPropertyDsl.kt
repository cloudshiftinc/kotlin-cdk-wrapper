@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceSqlServerParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.SqlServerParametersProperty.Builder =
      CfnDataSource.SqlServerParametersProperty.builder()

  /**
   * @param database Database. 
   */
  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  /**
   * @param host Host. 
   */
  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  /**
   * @param port Port. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataSource.SqlServerParametersProperty = cdkBuilder.build()
}
