@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceRdsParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.RdsParametersProperty.Builder =
      CfnDataSource.RdsParametersProperty.builder()

  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun build(): CfnDataSource.RdsParametersProperty = cdkBuilder.build()
}
