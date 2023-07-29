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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.InventoryDestination

/**
 * The destination of the inventory.
 *
 * Example:
 * ```
 * Bucket inventoryBucket = new Bucket(this, "InventoryBucket");
 * Bucket dataBucket = Bucket.Builder.create(this, "DataBucket")
 * .inventories(List.of(Inventory.builder()
 * .frequency(InventoryFrequency.DAILY)
 * .includeObjectVersions(InventoryObjectVersion.CURRENT)
 * .destination(InventoryDestination.builder()
 * .bucket(inventoryBucket)
 * .build())
 * .build(), Inventory.builder()
 * .frequency(InventoryFrequency.WEEKLY)
 * .includeObjectVersions(InventoryObjectVersion.ALL)
 * .destination(InventoryDestination.builder()
 * .bucket(inventoryBucket)
 * .prefix("with-all-versions")
 * .build())
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class InventoryDestinationDsl {
    private val cdkBuilder: InventoryDestination.Builder = InventoryDestination.builder()

    /** @param bucket Bucket where all inventories will be saved in. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param bucketOwner The account ID that owns the destination S3 bucket. If no account ID is
     *   provided, the owner is not validated before exporting data. It's recommended to set an
     *   account ID to prevent problems if the destination bucket ownership changes.
     */
    public fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
    }

    /** @param prefix The prefix to be used when saving the inventory. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): InventoryDestination = cdkBuilder.build()
}
