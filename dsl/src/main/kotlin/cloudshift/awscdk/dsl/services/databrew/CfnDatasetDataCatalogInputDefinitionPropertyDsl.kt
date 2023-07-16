@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetDataCatalogInputDefinitionPropertyDsl {
  private val cdkBuilder: CfnDataset.DataCatalogInputDefinitionProperty.Builder =
      CfnDataset.DataCatalogInputDefinitionProperty.builder()

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun tempDirectory(tempDirectory: IResolvable) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun tempDirectory(tempDirectory: CfnDataset.S3LocationProperty) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun build(): CfnDataset.DataCatalogInputDefinitionProperty = cdkBuilder.build()
}
