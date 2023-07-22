@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents how metadata stored in the AWS Glue Data Catalog is defined in a DataBrew dataset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * DataCatalogInputDefinitionProperty dataCatalogInputDefinitionProperty =
 * DataCatalogInputDefinitionProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html)
 */
@CdkDslMarker
public class CfnDatasetDataCatalogInputDefinitionPropertyDsl {
  private val cdkBuilder: CfnDataset.DataCatalogInputDefinitionProperty.Builder =
      CfnDataset.DataCatalogInputDefinitionProperty.builder()

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
   * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
   * directory.
   */
  public fun tempDirectory(tempDirectory: IResolvable) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  /**
   * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
   * directory.
   */
  public fun tempDirectory(tempDirectory: CfnDataset.S3LocationProperty) {
    cdkBuilder.tempDirectory(tempDirectory)
  }

  public fun build(): CfnDataset.DataCatalogInputDefinitionProperty = cdkBuilder.build()
}
