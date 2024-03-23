@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Configuration for processing a group of items in a single child workflow execution.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
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
public open class ItemBatcher(
  cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcher,
) : CdkObject(cdkObject) {
  public constructor(props: ItemBatcherProps) :
      this(software.amazon.awscdk.services.stepfunctions.ItemBatcher(props.let(ItemBatcherProps::unwrap))
  )

  public constructor(props: ItemBatcherProps.Builder.() -> Unit) : this(ItemBatcherProps(props)
  )

  /**
   * Render ItemBatcher in ASL JSON format.
   */
  public open fun render(): Any = unwrap(this).render()

  /**
   * Validate this ItemBatcher.
   */
  public open fun validateItemBatcher(): List<String> = unwrap(this).validateItemBatcher()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.ItemBatcher].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * BatchInput.
     *
     * Fixed JSON input to include in each batch passed to each child workflow execution
     *
     * Default: - No batchInput
     *
     * @param batchInput BatchInput. 
     */
    public fun batchInput(batchInput: ObjectNode)

    /**
     * MaxInputBytesPerBatch.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxInputBytesPerBatchPath` as the max size per batch,
     * no limits on the batch size under the 256KB limit if that property was also not provided
     *
     * @param maxInputBytesPerBatch MaxInputBytesPerBatch. 
     */
    public fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number)

    /**
     * MaxInputBytesPerBatchPath.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxInputBytesPerBatch` as the max size per batch,
     * no limits on the batch size under the 256KB limit if that property was also not provided
     *
     * @param maxInputBytesPerBatchPath MaxInputBytesPerBatchPath. 
     */
    public fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String)

    /**
     * MaxItemsPerBatch.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxItemsPerBatchPath` as the max items per batch,
     * no limits on the number of items in a batch under the 256KB limit if that property was also
     * not provided
     *
     * @param maxItemsPerBatch MaxItemsPerBatch. 
     */
    public fun maxItemsPerBatch(maxItemsPerBatch: Number)

    /**
     * MaxItemsPerBatchPath.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxItemsPerBatch` as the max items per batch,
     * no limits on the number of items in a batch under the 256KB limit if that property was also
     * not provided
     *
     * @param maxItemsPerBatchPath MaxItemsPerBatchPath. 
     */
    public fun maxItemsPerBatchPath(maxItemsPerBatchPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ItemBatcher.Builder =
        software.amazon.awscdk.services.stepfunctions.ItemBatcher.Builder.create()

    /**
     * BatchInput.
     *
     * Fixed JSON input to include in each batch passed to each child workflow execution
     *
     * Default: - No batchInput
     *
     * @param batchInput BatchInput. 
     */
    override fun batchInput(batchInput: ObjectNode) {
      cdkBuilder.batchInput(batchInput)
    }

    /**
     * MaxInputBytesPerBatch.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxInputBytesPerBatchPath` as the max size per batch,
     * no limits on the batch size under the 256KB limit if that property was also not provided
     *
     * @param maxInputBytesPerBatch MaxInputBytesPerBatch. 
     */
    override fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number) {
      cdkBuilder.maxInputBytesPerBatch(maxInputBytesPerBatch)
    }

    /**
     * MaxInputBytesPerBatchPath.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxInputBytesPerBatch` as the max size per batch,
     * no limits on the batch size under the 256KB limit if that property was also not provided
     *
     * @param maxInputBytesPerBatchPath MaxInputBytesPerBatchPath. 
     */
    override fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String) {
      cdkBuilder.maxInputBytesPerBatchPath(maxInputBytesPerBatchPath)
    }

    /**
     * MaxItemsPerBatch.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxItemsPerBatchPath` as the max items per batch,
     * no limits on the number of items in a batch under the 256KB limit if that property was also
     * not provided
     *
     * @param maxItemsPerBatch MaxItemsPerBatch. 
     */
    override fun maxItemsPerBatch(maxItemsPerBatch: Number) {
      cdkBuilder.maxItemsPerBatch(maxItemsPerBatch)
    }

    /**
     * MaxItemsPerBatchPath.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxItemsPerBatch` as the max items per batch,
     * no limits on the number of items in a batch under the 256KB limit if that property was also
     * not provided
     *
     * @param maxItemsPerBatchPath MaxItemsPerBatchPath. 
     */
    override fun maxItemsPerBatchPath(maxItemsPerBatchPath: String) {
      cdkBuilder.maxItemsPerBatchPath(maxItemsPerBatchPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ItemBatcher =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ItemBatcher {
      val builderImpl = BuilderImpl()
      return ItemBatcher(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcher):
        ItemBatcher = ItemBatcher(cdkObject)

    internal fun unwrap(wrapped: ItemBatcher):
        software.amazon.awscdk.services.stepfunctions.ItemBatcher = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.ItemBatcher
  }
}
