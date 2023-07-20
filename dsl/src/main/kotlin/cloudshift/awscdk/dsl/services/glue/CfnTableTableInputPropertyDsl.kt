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
import software.amazon.awscdk.services.glue.CfnTable
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTableTableInputPropertyDsl {
    private val cdkBuilder: CfnTable.TableInputProperty.Builder =
        CfnTable.TableInputProperty.builder()

    private val _partitionKeys: MutableList<Any> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun partitionKeys(vararg partitionKeys: Any) {
        _partitionKeys.addAll(listOf(*partitionKeys))
    }

    public fun partitionKeys(partitionKeys: Collection<Any>) {
        _partitionKeys.addAll(partitionKeys)
    }

    public fun partitionKeys(partitionKeys: IResolvable) {
        cdkBuilder.partitionKeys(partitionKeys)
    }

    public fun retention(retention: Number) {
        cdkBuilder.retention(retention)
    }

    public fun storageDescriptor(storageDescriptor: IResolvable) {
        cdkBuilder.storageDescriptor(storageDescriptor)
    }

    public fun storageDescriptor(storageDescriptor: CfnTable.StorageDescriptorProperty) {
        cdkBuilder.storageDescriptor(storageDescriptor)
    }

    public fun tableType(tableType: String) {
        cdkBuilder.tableType(tableType)
    }

    public fun targetTable(targetTable: IResolvable) {
        cdkBuilder.targetTable(targetTable)
    }

    public fun targetTable(targetTable: CfnTable.TableIdentifierProperty) {
        cdkBuilder.targetTable(targetTable)
    }

    public fun viewExpandedText(viewExpandedText: String) {
        cdkBuilder.viewExpandedText(viewExpandedText)
    }

    public fun viewOriginalText(viewOriginalText: String) {
        cdkBuilder.viewOriginalText(viewOriginalText)
    }

    public fun build(): CfnTable.TableInputProperty {
        if (_partitionKeys.isNotEmpty()) cdkBuilder.partitionKeys(_partitionKeys)
        return cdkBuilder.build()
    }
}
