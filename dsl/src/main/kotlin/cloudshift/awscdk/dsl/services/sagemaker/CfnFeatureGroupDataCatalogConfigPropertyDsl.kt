@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@CdkDslMarker
public class CfnFeatureGroupDataCatalogConfigPropertyDsl {
  private val cdkBuilder: CfnFeatureGroup.DataCatalogConfigProperty.Builder =
      CfnFeatureGroup.DataCatalogConfigProperty.builder()

  /**
   * @param catalog The name of the Glue table catalog. 
   */
  public fun catalog(catalog: String) {
    cdkBuilder.catalog(catalog)
  }

  /**
   * @param database The name of the Glue table database. 
   */
  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  /**
   * @param tableName The name of the Glue table. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnFeatureGroup.DataCatalogConfigProperty = cdkBuilder.build()
}
