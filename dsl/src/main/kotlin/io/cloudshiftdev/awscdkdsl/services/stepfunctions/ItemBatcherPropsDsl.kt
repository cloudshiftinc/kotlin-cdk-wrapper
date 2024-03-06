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
import software.amazon.awscdk.services.stepfunctions.ItemBatcherProps

/**
 * Interface for ItemBatcher configuration properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Object batchInput;
 * ItemBatcherProps itemBatcherProps = ItemBatcherProps.builder()
 * .batchInput(batchInput)
 * .maxInputBytesPerBatch(123)
 * .maxInputBytesPerBatchPath("maxInputBytesPerBatchPath")
 * .maxItemsPerBatch(123)
 * .maxItemsPerBatchPath("maxItemsPerBatchPath")
 * .build();
 * ```
 */
@CdkDslMarker
public class ItemBatcherPropsDsl {
    private val cdkBuilder: ItemBatcherProps.Builder = ItemBatcherProps.builder()

    /**
     * @param batchInput BatchInput. Fixed JSON input to include in each batch passed to each child
     *   workflow execution
     */
    public fun batchInput(batchInput: ObjectNode) {
        cdkBuilder.batchInput(batchInput)
    }

    /**
     * @param maxInputBytesPerBatch MaxInputBytesPerBatch. Specifies the maximum number of bytes
     *   that each child workflow execution processes, as static number
     */
    public fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number) {
        cdkBuilder.maxInputBytesPerBatch(maxInputBytesPerBatch)
    }

    /**
     * @param maxInputBytesPerBatchPath MaxInputBytesPerBatchPath. Specifies the maximum number of
     *   bytes that each child workflow execution processes, as JsonPath
     */
    public fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String) {
        cdkBuilder.maxInputBytesPerBatchPath(maxInputBytesPerBatchPath)
    }

    /**
     * @param maxItemsPerBatch MaxItemsPerBatch. Specifies the maximum number of items that each
     *   child workflow execution processes, as static number
     */
    public fun maxItemsPerBatch(maxItemsPerBatch: Number) {
        cdkBuilder.maxItemsPerBatch(maxItemsPerBatch)
    }

    /**
     * @param maxItemsPerBatchPath MaxItemsPerBatchPath. Specifies the maximum number of items that
     *   each child workflow execution processes, as JsonPath
     */
    public fun maxItemsPerBatchPath(maxItemsPerBatchPath: String) {
        cdkBuilder.maxItemsPerBatchPath(maxItemsPerBatchPath)
    }

    public fun build(): ItemBatcherProps = cdkBuilder.build()
}
