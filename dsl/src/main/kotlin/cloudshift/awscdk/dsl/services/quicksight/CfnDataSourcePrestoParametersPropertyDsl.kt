@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourcePrestoParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.PrestoParametersProperty.Builder =
      CfnDataSource.PrestoParametersProperty.builder()

  /**
   * @param catalog Catalog. 
   */
  public fun catalog(catalog: String) {
    cdkBuilder.catalog(catalog)
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

  public fun build(): CfnDataSource.PrestoParametersProperty = cdkBuilder.build()
}
