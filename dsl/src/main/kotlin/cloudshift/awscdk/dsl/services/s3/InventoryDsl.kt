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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.Inventory
import software.amazon.awscdk.services.s3.InventoryDestination
import software.amazon.awscdk.services.s3.InventoryFormat
import software.amazon.awscdk.services.s3.InventoryFrequency
import software.amazon.awscdk.services.s3.InventoryObjectVersion
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class InventoryDsl {
    private val cdkBuilder: Inventory.Builder = Inventory.builder()

    private val _optionalFields: MutableList<String> = mutableListOf()

    public fun destination(block: InventoryDestinationDsl.() -> Unit = {}) {
        val builder = InventoryDestinationDsl()
        builder.apply(block)
        cdkBuilder.destination(builder.build())
    }

    public fun destination(destination: InventoryDestination) {
        cdkBuilder.destination(destination)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun format(format: InventoryFormat) {
        cdkBuilder.format(format)
    }

    public fun frequency(frequency: InventoryFrequency) {
        cdkBuilder.frequency(frequency)
    }

    public fun includeObjectVersions(includeObjectVersions: InventoryObjectVersion) {
        cdkBuilder.includeObjectVersions(includeObjectVersions)
    }

    public fun inventoryId(inventoryId: String) {
        cdkBuilder.inventoryId(inventoryId)
    }

    public fun objectsPrefix(objectsPrefix: String) {
        cdkBuilder.objectsPrefix(objectsPrefix)
    }

    public fun optionalFields(vararg optionalFields: String) {
        _optionalFields.addAll(listOf(*optionalFields))
    }

    public fun optionalFields(optionalFields: Collection<String>) {
        _optionalFields.addAll(optionalFields)
    }

    public fun build(): Inventory {
        if (_optionalFields.isNotEmpty()) cdkBuilder.optionalFields(_optionalFields)
        return cdkBuilder.build()
    }
}
