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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable

/**
 * A structure used to define a table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * Object skewedColumnValueLocationMaps;
 * TableInputProperty tableInputProperty = TableInputProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html)
 */
@CdkDslMarker
public class CfnTableTableInputPropertyDsl {
    private val cdkBuilder: CfnTable.TableInputProperty.Builder =
        CfnTable.TableInputProperty.builder()

    private val _partitionKeys: MutableList<Any> = mutableListOf()

    /** @param description A description of the table. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The table name. For Hive compatibility, this is folded to lowercase when it is
     *   stored.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param owner The table owner. Included for Apache Hive compatibility. Not used in the normal
     *   course of AWS Glue operations.
     */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    /** @param parameters These key-value pairs define properties associated with the table. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters These key-value pairs define properties associated with the table. */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
     *   types are supported as partition keys. When you create a table used by Amazon Athena, and
     *   you do not specify any `partitionKeys` , you must at least set the value of `partitionKeys`
     *   to an empty list. For example:
     *
     * `"PartitionKeys": []`
     */
    public fun partitionKeys(vararg partitionKeys: Any) {
        _partitionKeys.addAll(listOf(*partitionKeys))
    }

    /**
     * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
     *   types are supported as partition keys. When you create a table used by Amazon Athena, and
     *   you do not specify any `partitionKeys` , you must at least set the value of `partitionKeys`
     *   to an empty list. For example:
     *
     * `"PartitionKeys": []`
     */
    public fun partitionKeys(partitionKeys: Collection<Any>) {
        _partitionKeys.addAll(partitionKeys)
    }

    /**
     * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
     *   types are supported as partition keys. When you create a table used by Amazon Athena, and
     *   you do not specify any `partitionKeys` , you must at least set the value of `partitionKeys`
     *   to an empty list. For example:
     *
     * `"PartitionKeys": []`
     */
    public fun partitionKeys(partitionKeys: IResolvable) {
        cdkBuilder.partitionKeys(partitionKeys)
    }

    /** @param retention The retention time for this table. */
    public fun retention(retention: Number) {
        cdkBuilder.retention(retention)
    }

    /**
     * @param storageDescriptor A storage descriptor containing information about the physical
     *   storage of this table.
     */
    public fun storageDescriptor(storageDescriptor: IResolvable) {
        cdkBuilder.storageDescriptor(storageDescriptor)
    }

    /**
     * @param storageDescriptor A storage descriptor containing information about the physical
     *   storage of this table.
     */
    public fun storageDescriptor(storageDescriptor: CfnTable.StorageDescriptorProperty) {
        cdkBuilder.storageDescriptor(storageDescriptor)
    }

    /**
     * @param tableType The type of this table. AWS Glue will create tables with the
     *   `EXTERNAL_TABLE` type. Other services, such as Athena, may create tables with additional
     *   table types.
     *
     * AWS Glue related table types:
     * * **EXTERNAL_TABLE** - Hive compatible attribute - indicates a non-Hive managed table.
     * * **GOVERNED** - Used by AWS Lake Formation . The AWS Glue Data Catalog understands
     *   `GOVERNED` .
     */
    public fun tableType(tableType: String) {
        cdkBuilder.tableType(tableType)
    }

    /**
     * @param targetTable A `TableIdentifier` structure that describes a target table for resource
     *   linking.
     */
    public fun targetTable(targetTable: IResolvable) {
        cdkBuilder.targetTable(targetTable)
    }

    /**
     * @param targetTable A `TableIdentifier` structure that describes a target table for resource
     *   linking.
     */
    public fun targetTable(targetTable: CfnTable.TableIdentifierProperty) {
        cdkBuilder.targetTable(targetTable)
    }

    /**
     * @param viewExpandedText Included for Apache Hive compatibility. Not used in the normal course
     *   of AWS Glue operations.
     */
    public fun viewExpandedText(viewExpandedText: String) {
        cdkBuilder.viewExpandedText(viewExpandedText)
    }

    /**
     * @param viewOriginalText Included for Apache Hive compatibility. Not used in the normal course
     *   of AWS Glue operations. If the table is a `VIRTUAL_VIEW` , certain Athena configuration
     *   encoded in base64.
     */
    public fun viewOriginalText(viewOriginalText: String) {
        cdkBuilder.viewOriginalText(viewOriginalText)
    }

    public fun build(): CfnTable.TableInputProperty {
        if (_partitionKeys.isNotEmpty()) cdkBuilder.partitionKeys(_partitionKeys)
        return cdkBuilder.build()
    }
}
