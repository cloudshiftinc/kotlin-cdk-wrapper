@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceAuroraParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.AuroraParametersProperty.Builder =
      CfnDataSource.AuroraParametersProperty.builder()

  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataSource.AuroraParametersProperty = cdkBuilder.build()
}
