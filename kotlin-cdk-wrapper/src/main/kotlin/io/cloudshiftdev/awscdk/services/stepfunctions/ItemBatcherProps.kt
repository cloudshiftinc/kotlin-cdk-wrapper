@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Interface for ItemBatcher configuration properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
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
public interface ItemBatcherProps {
  /**
   * BatchInput.
   *
   * Fixed JSON input to include in each batch passed to each child workflow execution
   *
   * Default: - No batchInput
   */
  public fun batchInput(): ObjectNode? = unwrap(this).getBatchInput()

  /**
   * MaxInputBytesPerBatch.
   *
   * Specifies the maximum number of bytes that each child workflow execution processes, as static
   * number
   *
   * Default: - uses value of `maxInputBytesPerBatchPath` as the max size per batch,
   * no limits on the batch size under the 256KB limit if that property was also not provided
   */
  public fun maxInputBytesPerBatch(): Number? = unwrap(this).getMaxInputBytesPerBatch()

  /**
   * MaxInputBytesPerBatchPath.
   *
   * Specifies the maximum number of bytes that each child workflow execution processes, as JsonPath
   *
   * Default: - uses value of `maxInputBytesPerBatch` as the max size per batch,
   * no limits on the batch size under the 256KB limit if that property was also not provided
   */
  public fun maxInputBytesPerBatchPath(): String? = unwrap(this).getMaxInputBytesPerBatchPath()

  /**
   * MaxItemsPerBatch.
   *
   * Specifies the maximum number of items that each child workflow execution processes, as static
   * number
   *
   * Default: - uses value of `maxItemsPerBatchPath` as the max items per batch,
   * no limits on the number of items in a batch under the 256KB limit if that property was also not
   * provided
   */
  public fun maxItemsPerBatch(): Number? = unwrap(this).getMaxItemsPerBatch()

  /**
   * MaxItemsPerBatchPath.
   *
   * Specifies the maximum number of items that each child workflow execution processes, as JsonPath
   *
   * Default: - uses value of `maxItemsPerBatch` as the max items per batch,
   * no limits on the number of items in a batch under the 256KB limit if that property was also not
   * provided
   */
  public fun maxItemsPerBatchPath(): String? = unwrap(this).getMaxItemsPerBatchPath()

  /**
   * A builder for [ItemBatcherProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param batchInput BatchInput.
     * Fixed JSON input to include in each batch passed to each child workflow execution
     */
    public fun batchInput(batchInput: ObjectNode)

    /**
     * @param maxInputBytesPerBatch MaxInputBytesPerBatch.
     * Specifies the maximum number of bytes that each child workflow execution processes, as static
     * number
     */
    public fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number)

    /**
     * @param maxInputBytesPerBatchPath MaxInputBytesPerBatchPath.
     * Specifies the maximum number of bytes that each child workflow execution processes, as
     * JsonPath
     */
    public fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String)

    /**
     * @param maxItemsPerBatch MaxItemsPerBatch.
     * Specifies the maximum number of items that each child workflow execution processes, as static
     * number
     */
    public fun maxItemsPerBatch(maxItemsPerBatch: Number)

    /**
     * @param maxItemsPerBatchPath MaxItemsPerBatchPath.
     * Specifies the maximum number of items that each child workflow execution processes, as
     * JsonPath
     */
    public fun maxItemsPerBatchPath(maxItemsPerBatchPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ItemBatcherProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ItemBatcherProps.builder()

    /**
     * @param batchInput BatchInput.
     * Fixed JSON input to include in each batch passed to each child workflow execution
     */
    override fun batchInput(batchInput: ObjectNode) {
      cdkBuilder.batchInput(batchInput)
    }

    /**
     * @param maxInputBytesPerBatch MaxInputBytesPerBatch.
     * Specifies the maximum number of bytes that each child workflow execution processes, as static
     * number
     */
    override fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number) {
      cdkBuilder.maxInputBytesPerBatch(maxInputBytesPerBatch)
    }

    /**
     * @param maxInputBytesPerBatchPath MaxInputBytesPerBatchPath.
     * Specifies the maximum number of bytes that each child workflow execution processes, as
     * JsonPath
     */
    override fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String) {
      cdkBuilder.maxInputBytesPerBatchPath(maxInputBytesPerBatchPath)
    }

    /**
     * @param maxItemsPerBatch MaxItemsPerBatch.
     * Specifies the maximum number of items that each child workflow execution processes, as static
     * number
     */
    override fun maxItemsPerBatch(maxItemsPerBatch: Number) {
      cdkBuilder.maxItemsPerBatch(maxItemsPerBatch)
    }

    /**
     * @param maxItemsPerBatchPath MaxItemsPerBatchPath.
     * Specifies the maximum number of items that each child workflow execution processes, as
     * JsonPath
     */
    override fun maxItemsPerBatchPath(maxItemsPerBatchPath: String) {
      cdkBuilder.maxItemsPerBatchPath(maxItemsPerBatchPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ItemBatcherProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcherProps,
  ) : CdkObject(cdkObject), ItemBatcherProps {
    /**
     * BatchInput.
     *
     * Fixed JSON input to include in each batch passed to each child workflow execution
     *
     * Default: - No batchInput
     */
    override fun batchInput(): ObjectNode? = unwrap(this).getBatchInput()

    /**
     * MaxInputBytesPerBatch.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxInputBytesPerBatchPath` as the max size per batch,
     * no limits on the batch size under the 256KB limit if that property was also not provided
     */
    override fun maxInputBytesPerBatch(): Number? = unwrap(this).getMaxInputBytesPerBatch()

    /**
     * MaxInputBytesPerBatchPath.
     *
     * Specifies the maximum number of bytes that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxInputBytesPerBatch` as the max size per batch,
     * no limits on the batch size under the 256KB limit if that property was also not provided
     */
    override fun maxInputBytesPerBatchPath(): String? = unwrap(this).getMaxInputBytesPerBatchPath()

    /**
     * MaxItemsPerBatch.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as static
     * number
     *
     * Default: - uses value of `maxItemsPerBatchPath` as the max items per batch,
     * no limits on the number of items in a batch under the 256KB limit if that property was also
     * not provided
     */
    override fun maxItemsPerBatch(): Number? = unwrap(this).getMaxItemsPerBatch()

    /**
     * MaxItemsPerBatchPath.
     *
     * Specifies the maximum number of items that each child workflow execution processes, as
     * JsonPath
     *
     * Default: - uses value of `maxItemsPerBatch` as the max items per batch,
     * no limits on the number of items in a batch under the 256KB limit if that property was also
     * not provided
     */
    override fun maxItemsPerBatchPath(): String? = unwrap(this).getMaxItemsPerBatchPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ItemBatcherProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcherProps):
        ItemBatcherProps = CdkObjectWrappers.wrap(cdkObject) as ItemBatcherProps

    internal fun unwrap(wrapped: ItemBatcherProps):
        software.amazon.awscdk.services.stepfunctions.ItemBatcherProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ItemBatcherProps
  }
}
