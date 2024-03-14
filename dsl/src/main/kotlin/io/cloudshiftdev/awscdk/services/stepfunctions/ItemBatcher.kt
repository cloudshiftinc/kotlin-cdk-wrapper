package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class ItemBatcher internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcher,
) {
  public open fun render(): Any = unwrap(this).render()

  public open fun validateItemBatcher(): List<String> = unwrap(this).validateItemBatcher() ?:
      emptyList()

  public interface Builder {
    public fun batchInput(batchInput: ObjectNode)

    public fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number)

    public fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String)

    public fun maxItemsPerBatch(maxItemsPerBatch: Number)

    public fun maxItemsPerBatchPath(maxItemsPerBatchPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ItemBatcher.Builder =
        software.amazon.awscdk.services.stepfunctions.ItemBatcher.Builder.create()

    override fun batchInput(batchInput: ObjectNode) {
      cdkBuilder.batchInput(batchInput)
    }

    override fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number) {
      cdkBuilder.maxInputBytesPerBatch(maxInputBytesPerBatch)
    }

    override fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String) {
      cdkBuilder.maxInputBytesPerBatchPath(maxInputBytesPerBatchPath)
    }

    override fun maxItemsPerBatch(maxItemsPerBatch: Number) {
      cdkBuilder.maxItemsPerBatch(maxItemsPerBatch)
    }

    override fun maxItemsPerBatchPath(maxItemsPerBatchPath: String) {
      cdkBuilder.maxItemsPerBatchPath(maxItemsPerBatchPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ItemBatcher =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ItemBatcher {
      val builderImpl = BuilderImpl()
      return ItemBatcher(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcher):
        ItemBatcher = ItemBatcher(cdkObject)

    internal fun unwrap(wrapped: ItemBatcher):
        software.amazon.awscdk.services.stepfunctions.ItemBatcher = wrapped.cdkObject
  }
}
