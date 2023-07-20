@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDeltaSyncConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.DeltaSyncConfigProperty.Builder =
      CfnDataSource.DeltaSyncConfigProperty.builder()

  public fun baseTableTtl(baseTableTtl: String) {
    cdkBuilder.baseTableTtl(baseTableTtl)
  }

  public fun deltaSyncTableName(deltaSyncTableName: String) {
    cdkBuilder.deltaSyncTableName(deltaSyncTableName)
  }

  public fun deltaSyncTableTtl(deltaSyncTableTtl: String) {
    cdkBuilder.deltaSyncTableTtl(deltaSyncTableTtl)
  }

  public fun build(): CfnDataSource.DeltaSyncConfigProperty = cdkBuilder.build()
}
