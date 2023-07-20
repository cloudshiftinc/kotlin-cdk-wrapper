@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnPartition
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPartitionStorageDescriptorPropertyDsl {
    private val cdkBuilder: CfnPartition.StorageDescriptorProperty.Builder =
        CfnPartition.StorageDescriptorProperty.builder()

    private val _bucketColumns: MutableList<String> = mutableListOf()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _sortColumns: MutableList<Any> = mutableListOf()

    public fun bucketColumns(vararg bucketColumns: String) {
        _bucketColumns.addAll(listOf(*bucketColumns))
    }

    public fun bucketColumns(bucketColumns: Collection<String>) {
        _bucketColumns.addAll(bucketColumns)
    }

    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    public fun compressed(compressed: Boolean) {
        cdkBuilder.compressed(compressed)
    }

    public fun compressed(compressed: IResolvable) {
        cdkBuilder.compressed(compressed)
    }

    public fun inputFormat(inputFormat: String) {
        cdkBuilder.inputFormat(inputFormat)
    }

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun numberOfBuckets(numberOfBuckets: Number) {
        cdkBuilder.numberOfBuckets(numberOfBuckets)
    }

    public fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun schemaReference(schemaReference: IResolvable) {
        cdkBuilder.schemaReference(schemaReference)
    }

    public fun schemaReference(schemaReference: CfnPartition.SchemaReferenceProperty) {
        cdkBuilder.schemaReference(schemaReference)
    }

    public fun serdeInfo(serdeInfo: IResolvable) {
        cdkBuilder.serdeInfo(serdeInfo)
    }

    public fun serdeInfo(serdeInfo: CfnPartition.SerdeInfoProperty) {
        cdkBuilder.serdeInfo(serdeInfo)
    }

    public fun skewedInfo(skewedInfo: IResolvable) {
        cdkBuilder.skewedInfo(skewedInfo)
    }

    public fun skewedInfo(skewedInfo: CfnPartition.SkewedInfoProperty) {
        cdkBuilder.skewedInfo(skewedInfo)
    }

    public fun sortColumns(vararg sortColumns: Any) {
        _sortColumns.addAll(listOf(*sortColumns))
    }

    public fun sortColumns(sortColumns: Collection<Any>) {
        _sortColumns.addAll(sortColumns)
    }

    public fun sortColumns(sortColumns: IResolvable) {
        cdkBuilder.sortColumns(sortColumns)
    }

    public fun storedAsSubDirectories(storedAsSubDirectories: Boolean) {
        cdkBuilder.storedAsSubDirectories(storedAsSubDirectories)
    }

    public fun storedAsSubDirectories(storedAsSubDirectories: IResolvable) {
        cdkBuilder.storedAsSubDirectories(storedAsSubDirectories)
    }

    public fun build(): CfnPartition.StorageDescriptorProperty {
        if (_bucketColumns.isNotEmpty()) cdkBuilder.bucketColumns(_bucketColumns)
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_sortColumns.isNotEmpty()) cdkBuilder.sortColumns(_sortColumns)
        return cdkBuilder.build()
    }
}
