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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3.Inventory
import software.amazon.awscdk.services.s3.InventoryDestination
import software.amazon.awscdk.services.s3.InventoryFormat
import software.amazon.awscdk.services.s3.InventoryFrequency
import software.amazon.awscdk.services.s3.InventoryObjectVersion

/**
 * Specifies the inventory configuration of an S3 Bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * Inventory inventory = Inventory.builder()
 * .destination(InventoryDestination.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .enabled(false)
 * .format(InventoryFormat.CSV)
 * .frequency(InventoryFrequency.DAILY)
 * .includeObjectVersions(InventoryObjectVersion.ALL)
 * .inventoryId("inventoryId")
 * .objectsPrefix("objectsPrefix")
 * .optionalFields(List.of("optionalFields"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
 */
@CdkDslMarker
public class InventoryDsl {
    private val cdkBuilder: Inventory.Builder = Inventory.builder()

    private val _optionalFields: MutableList<String> = mutableListOf()

    /** @param destination The destination of the inventory. */
    public fun destination(destination: InventoryDestinationDsl.() -> Unit = {}) {
        val builder = InventoryDestinationDsl()
        builder.apply(destination)
        cdkBuilder.destination(builder.build())
    }

    /** @param destination The destination of the inventory. */
    public fun destination(destination: InventoryDestination) {
        cdkBuilder.destination(destination)
    }

    /** @param enabled Whether the inventory is enabled or disabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param format The format of the inventory. */
    public fun format(format: InventoryFormat) {
        cdkBuilder.format(format)
    }

    /** @param frequency Frequency at which the inventory should be generated. */
    public fun frequency(frequency: InventoryFrequency) {
        cdkBuilder.frequency(frequency)
    }

    /**
     * @param includeObjectVersions If the inventory should contain all the object versions or only
     *   the current one.
     */
    public fun includeObjectVersions(includeObjectVersions: InventoryObjectVersion) {
        cdkBuilder.includeObjectVersions(includeObjectVersions)
    }

    /** @param inventoryId The inventory configuration ID. */
    public fun inventoryId(inventoryId: String) {
        cdkBuilder.inventoryId(inventoryId)
    }

    /**
     * @param objectsPrefix The inventory will only include objects that meet the prefix filter
     *   criteria.
     */
    public fun objectsPrefix(objectsPrefix: String) {
        cdkBuilder.objectsPrefix(objectsPrefix)
    }

    /** @param optionalFields A list of optional fields to be included in the inventory result. */
    public fun optionalFields(vararg optionalFields: String) {
        _optionalFields.addAll(listOf(*optionalFields))
    }

    /** @param optionalFields A list of optional fields to be included in the inventory result. */
    public fun optionalFields(optionalFields: Collection<String>) {
        _optionalFields.addAll(optionalFields)
    }

    public fun build(): Inventory {
        if (_optionalFields.isNotEmpty()) cdkBuilder.optionalFields(_optionalFields)
        return cdkBuilder.build()
    }
}
