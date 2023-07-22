@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for PostgreSQL.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PostgreSqlParametersProperty postgreSqlParametersProperty =
 * PostgreSqlParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-postgresqlparameters.html)
 */
@CdkDslMarker
public class CfnDataSourcePostgreSqlParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.PostgreSqlParametersProperty.Builder =
      CfnDataSource.PostgreSqlParametersProperty.builder()

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

  public fun build(): CfnDataSource.PostgreSqlParametersProperty = cdkBuilder.build()
}
