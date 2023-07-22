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

  /**
   * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
   * stores the data.
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param databaseName The name of a database in the Data Catalog.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param tableName The name of a database table in the Data Catalog.
   * This table corresponds to a DataBrew dataset.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
   * results.
   */
  public fun tempDirectory(tempDirectory: IResolvable) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  /**
   * @param tempDirectory Represents an Amazon location where DataBrew can store intermediate
   * results.
   */
  public fun tempDirectory(tempDirectory: CfnRecipe.S3LocationProperty) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun build(): CfnRecipe.DataCatalogInputDefinitionProperty = cdkBuilder.build()
}
