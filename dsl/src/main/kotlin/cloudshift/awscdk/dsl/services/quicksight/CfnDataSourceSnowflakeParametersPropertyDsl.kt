@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for Snowflake.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SnowflakeParametersProperty snowflakeParametersProperty = SnowflakeParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .warehouse("warehouse")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-snowflakeparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceSnowflakeParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.SnowflakeParametersProperty.Builder =
      CfnDataSource.SnowflakeParametersProperty.builder()

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
   * @param warehouse Warehouse. 
   */
  public fun warehouse(warehouse: String) {
    cdkBuilder.warehouse(warehouse)
  }

  public fun build(): CfnDataSource.SnowflakeParametersProperty = cdkBuilder.build()
}
