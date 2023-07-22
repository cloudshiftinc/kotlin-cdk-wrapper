@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceAuroraPostgreSqlParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.AuroraPostgreSqlParametersProperty.Builder =
      CfnDataSource.AuroraPostgreSqlParametersProperty.builder()

  /**
   * @param database The Amazon Aurora PostgreSQL database to connect to. 
   */
  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  /**
   * @param host The Amazon Aurora PostgreSQL-Compatible host to connect to. 
   */
  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  /**
   * @param port The port that Amazon Aurora PostgreSQL is listening on. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataSource.AuroraPostgreSqlParametersProperty = cdkBuilder.build()
}
