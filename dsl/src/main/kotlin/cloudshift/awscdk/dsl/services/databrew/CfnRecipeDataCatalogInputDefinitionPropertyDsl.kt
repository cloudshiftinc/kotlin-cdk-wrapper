@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeDataCatalogInputDefinitionPropertyDsl {
  private val cdkBuilder: CfnRecipe.DataCatalogInputDefinitionProperty.Builder =
      CfnRecipe.DataCatalogInputDefinitionProperty.builder()

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

  public fun tempDirectory(tempDirectory: CfnRecipe.S3LocationProperty) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun build(): CfnRecipe.DataCatalogInputDefinitionProperty = cdkBuilder.build()
}
