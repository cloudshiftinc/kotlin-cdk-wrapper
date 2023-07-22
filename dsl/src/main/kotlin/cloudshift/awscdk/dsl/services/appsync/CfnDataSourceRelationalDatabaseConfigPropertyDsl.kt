@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceRelationalDatabaseConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.RelationalDatabaseConfigProperty.Builder =
      CfnDataSource.RelationalDatabaseConfigProperty.builder()

  /**
   * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
   */
  public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: IResolvable) {
    cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig)
  }

  /**
   * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
   */
  public
      fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: CfnDataSource.RdsHttpEndpointConfigProperty) {
    cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig)
  }

  /**
   * @param relationalDatabaseSourceType The type of relational data source. 
   */
  public fun relationalDatabaseSourceType(relationalDatabaseSourceType: String) {
    cdkBuilder.relationalDatabaseSourceType(relationalDatabaseSourceType)
  }

  public fun build(): CfnDataSource.RelationalDatabaseConfigProperty = cdkBuilder.build()
}
