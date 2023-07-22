@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDeltaSyncConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.DeltaSyncConfigProperty.Builder =
      CfnDataSource.DeltaSyncConfigProperty.builder()

  /**
   * @param baseTableTtl The number of minutes that an Item is stored in the data source. 
   */
  public fun baseTableTtl(baseTableTtl: String) {
    cdkBuilder.baseTableTtl(baseTableTtl)
  }

  /**
   * @param deltaSyncTableName The Delta Sync table name. 
   */
  public fun deltaSyncTableName(deltaSyncTableName: String) {
    cdkBuilder.deltaSyncTableName(deltaSyncTableName)
  }

  /**
   * @param deltaSyncTableTtl The number of minutes that a Delta Sync log entry is stored in the
   * Delta Sync table. 
   */
  public fun deltaSyncTableTtl(deltaSyncTableTtl: String) {
    cdkBuilder.deltaSyncTableTtl(deltaSyncTableTtl)
  }

  public fun build(): CfnDataSource.DeltaSyncConfigProperty = cdkBuilder.build()
}
