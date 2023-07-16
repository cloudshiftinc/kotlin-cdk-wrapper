@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@CdkDslMarker
public class CfnFeatureGroupDataCatalogConfigPropertyDsl {
  private val cdkBuilder: CfnFeatureGroup.DataCatalogConfigProperty.Builder =
      CfnFeatureGroup.DataCatalogConfigProperty.builder()

  public fun catalog(catalog: String) {
    cdkBuilder.catalog(catalog)
  }

  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnFeatureGroup.DataCatalogConfigProperty = cdkBuilder.build()
}
