@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable
import software.amazon.awscdk.services.glue.CfnTableProps

/**
 * Properties for defining a `CfnTable`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * Object skewedColumnValueLocationMaps;
 * CfnTableProps cfnTableProps = CfnTableProps.builder()
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
 * .region("region")
 * .build())
 * .viewExpandedText("viewExpandedText")
 * .viewOriginalText("viewOriginalText")
 * .build())
 * // the properties below are optional
 * .openTableFormatInput(OpenTableFormatInputProperty.builder()
 * .icebergInput(IcebergInputProperty.builder()
 * .metadataOperation("metadataOperation")
 * .version("version")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
 */
@CdkDslMarker
public class CfnTablePropsDsl {
    private val cdkBuilder: CfnTableProps.Builder = CfnTableProps.builder()

    /** @param catalogId The ID of the Data Catalog in which to create the `Table` . */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param databaseName The name of the database where the table metadata resides. For Hive
     *   compatibility, this must be all lowercase.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param openTableFormatInput the value to be set. */
    public fun openTableFormatInput(openTableFormatInput: IResolvable) {
        cdkBuilder.openTableFormatInput(openTableFormatInput)
    }

    /** @param openTableFormatInput the value to be set. */
    public fun openTableFormatInput(openTableFormatInput: CfnTable.OpenTableFormatInputProperty) {
        cdkBuilder.openTableFormatInput(openTableFormatInput)
    }

    /** @param tableInput A structure used to define a table. */
    public fun tableInput(tableInput: IResolvable) {
        cdkBuilder.tableInput(tableInput)
    }

    /** @param tableInput A structure used to define a table. */
    public fun tableInput(tableInput: CfnTable.TableInputProperty) {
        cdkBuilder.tableInput(tableInput)
    }

    public fun build(): CfnTableProps = cdkBuilder.build()
}
