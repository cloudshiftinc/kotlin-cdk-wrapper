@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable
import software.constructs.Construct

/**
 * The `AWS::Glue::Table` resource specifies tabular data in the AWS Glue data catalog.
 *
 * For more information, see [Defining Tables in the AWS Glue Data
 * Catalog](https://docs.aws.amazon.com/glue/latest/dg/tables-described.html) and [Table
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-Table)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * Object skewedColumnValueLocationMaps;
 * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableInput(TableInputProperty.builder()
 * .description("description")
 * .name("name")
 * .owner("owner")
 * .parameters(parameters)
 * .partitionKeys(List.of(ColumnProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .type("type")
 * .build()))
 * .retention(123)
 * .storageDescriptor(StorageDescriptorProperty.builder()
 * .bucketColumns(List.of("bucketColumns"))
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .type("type")
 * .build()))
 * .compressed(false)
 * .inputFormat("inputFormat")
 * .location("location")
 * .numberOfBuckets(123)
 * .outputFormat("outputFormat")
 * .parameters(parameters)
 * .schemaReference(SchemaReferenceProperty.builder()
 * .schemaId(SchemaIdProperty.builder()
 * .registryName("registryName")
 * .schemaArn("schemaArn")
 * .schemaName("schemaName")
 * .build())
 * .schemaVersionId("schemaVersionId")
 * .schemaVersionNumber(123)
 * .build())
 * .serdeInfo(SerdeInfoProperty.builder()
 * .name("name")
 * .parameters(parameters)
 * .serializationLibrary("serializationLibrary")
 * .build())
 * .skewedInfo(SkewedInfoProperty.builder()
 * .skewedColumnNames(List.of("skewedColumnNames"))
 * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
 * .skewedColumnValues(List.of("skewedColumnValues"))
 * .build())
 * .sortColumns(List.of(OrderProperty.builder()
 * .column("column")
 * .sortOrder(123)
 * .build()))
 * .storedAsSubDirectories(false)
 * .build())
 * .tableType("tableType")
 * .targetTable(TableIdentifierProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .name("name")
 * .build())
 * .viewExpandedText("viewExpandedText")
 * .viewOriginalText("viewOriginalText")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
 */
@CdkDslMarker
public class CfnTableDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

  /**
   * The ID of the Data Catalog in which to create the `Table` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
   * @param catalogId The ID of the Data Catalog in which to create the `Table` . 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * The name of the database where the table metadata resides.
   *
   * For Hive compatibility, this must be all lowercase.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
   * @param databaseName The name of the database where the table metadata resides. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * A structure used to define a table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
   * @param tableInput A structure used to define a table. 
   */
  public fun tableInput(tableInput: IResolvable) {
    cdkBuilder.tableInput(tableInput)
  }

  /**
   * A structure used to define a table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
   * @param tableInput A structure used to define a table. 
   */
  public fun tableInput(tableInput: CfnTable.TableInputProperty) {
    cdkBuilder.tableInput(tableInput)
  }

  public fun build(): CfnTable = cdkBuilder.build()
}
