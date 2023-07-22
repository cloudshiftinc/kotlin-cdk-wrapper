@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents information on how DataBrew can find data, in either the AWS Glue Data Catalog or
 * Amazon S3.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * InputProperty inputProperty = InputProperty.builder()
 * .databaseInputDefinition(DatabaseInputDefinitionProperty.builder()
 * .glueConnectionName("glueConnectionName")
 * // the properties below are optional
 * .databaseTableName("databaseTableName")
 * .queryString("queryString")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build())
 * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build())
 * .metadata(MetadataProperty.builder()
 * .sourceArn("sourceArn")
 * .build())
 * .s3InputDefinition(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html)
 */
@CdkDslMarker
public class CfnDatasetInputPropertyDsl {
  private val cdkBuilder: CfnDataset.InputProperty.Builder = CfnDataset.InputProperty.builder()

  /**
   * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
   */
  public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
    cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
  }

  /**
   * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
   */
  public
      fun dataCatalogInputDefinition(dataCatalogInputDefinition: CfnDataset.DataCatalogInputDefinitionProperty) {
    cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
  }

  /**
   * @param databaseInputDefinition Connection information for dataset input files stored in a
   * database.
   */
  public fun databaseInputDefinition(databaseInputDefinition: IResolvable) {
    cdkBuilder.databaseInputDefinition(databaseInputDefinition)
  }

  /**
   * @param databaseInputDefinition Connection information for dataset input files stored in a
   * database.
   */
  public
      fun databaseInputDefinition(databaseInputDefinition: CfnDataset.DatabaseInputDefinitionProperty) {
    cdkBuilder.databaseInputDefinition(databaseInputDefinition)
  }

  /**
   * @param metadata Contains additional resource information needed for specific datasets.
   */
  public fun metadata(metadata: IResolvable) {
    cdkBuilder.metadata(metadata)
  }

  /**
   * @param metadata Contains additional resource information needed for specific datasets.
   */
  public fun metadata(metadata: CfnDataset.MetadataProperty) {
    cdkBuilder.metadata(metadata)
  }

  /**
   * @param s3InputDefinition The Amazon S3 location where the data is stored.
   */
  public fun s3InputDefinition(s3InputDefinition: IResolvable) {
    cdkBuilder.s3InputDefinition(s3InputDefinition)
  }

  /**
   * @param s3InputDefinition The Amazon S3 location where the data is stored.
   */
  public fun s3InputDefinition(s3InputDefinition: CfnDataset.S3LocationProperty) {
    cdkBuilder.s3InputDefinition(s3InputDefinition)
  }

  public fun build(): CfnDataset.InputProperty = cdkBuilder.build()
}
