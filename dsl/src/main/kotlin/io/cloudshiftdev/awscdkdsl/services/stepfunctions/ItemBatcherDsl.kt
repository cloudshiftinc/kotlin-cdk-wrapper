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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.ItemBatcher

/**
 * Configuration for processing a group of items in a single child workflow execution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Object batchInput;
 * ItemBatcher itemBatcher = ItemBatcher.Builder.create()
 * .batchInput(batchInput)
 * .maxInputBytesPerBatch(123)
 * .maxInputBytesPerBatchPath("maxInputBytesPerBatchPath")
 * .maxItemsPerBatch(123)
 * .maxItemsPerBatchPath("maxItemsPerBatchPath")
 * .build();
 * ```
 */
@CdkDslMarker
public class ItemBatcherDsl {
    private val cdkBuilder: ItemBatcher.Builder = ItemBatcher.Builder.create()

    /**
     * BatchInput.
     *
     * Fixed JSON input to include in each batch passed to each child workflow execution
     *
     * Default: - No batchInput
     *
     * @param batchInput BatchInput.
     */
    public fun batchInput(batchInput: ObjectNode) {
        cdkBuilder.batchInput(batchInput)
    }

    /**
     * MaxInputBytesPerBatch.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxInputBytesPerBatchPath` as the max size per batch, no limits on
     * the batch size under the 256KB limit if that property was also not provided
     *
     * @param maxInputBytesPerBatch MaxInputBytesPerBatch.
     */
    public fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number) {
        cdkBuilder.maxInputBytesPerBatch(maxInputBytesPerBatch)
    }

    /**
     * MaxInputBytesPerBatchPath.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxInputBytesPerBatch` as the max size per batch, no limits on the
     * batch size under the 256KB limit if that property was also not provided
     *
     * @param maxInputBytesPerBatchPath MaxInputBytesPerBatchPath.
     */
    public fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String) {
        cdkBuilder.maxInputBytesPerBatchPath(maxInputBytesPerBatchPath)
    }

    /**
     * MaxItemsPerBatch.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxItemsPerBatchPath` as the max items per batch, no limits on the
     * number of items in a batch under the 256KB limit if that property was also not provided
     *
     * @param maxItemsPerBatch MaxItemsPerBatch.
     */
    public fun maxItemsPerBatch(maxItemsPerBatch: Number) {
        cdkBuilder.maxItemsPerBatch(maxItemsPerBatch)
    }

    /**
     * MaxItemsPerBatchPath.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxItemsPerBatch` as the max items per batch, no limits on the
     * number of items in a batch under the 256KB limit if that property was also not provided
     *
     * @param maxItemsPerBatchPath MaxItemsPerBatchPath.
     */
    public fun maxItemsPerBatchPath(maxItemsPerBatchPath: String) {
        cdkBuilder.maxItemsPerBatchPath(maxItemsPerBatchPath)
    }

    public fun build(): ItemBatcher = cdkBuilder.build()
}
