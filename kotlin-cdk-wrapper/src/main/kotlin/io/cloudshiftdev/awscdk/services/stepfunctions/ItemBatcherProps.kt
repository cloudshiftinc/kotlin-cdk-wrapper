@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ItemBatcherProps {
  public fun batchInput(): ObjectNode? = unwrap(this).getBatchInput()

  public fun maxInputBytesPerBatch(): Number? = unwrap(this).getMaxInputBytesPerBatch()

  public fun maxInputBytesPerBatchPath(): String? = unwrap(this).getMaxInputBytesPerBatchPath()

  public fun maxItemsPerBatch(): Number? = unwrap(this).getMaxItemsPerBatch()

  public fun maxItemsPerBatchPath(): String? = unwrap(this).getMaxItemsPerBatchPath()

  @CdkDslMarker
  public interface Builder {
    public fun batchInput(batchInput: ObjectNode)

    public fun maxInputBytesPerBatch(maxInputBytesPerBatch: Number)

    public fun maxInputBytesPerBatchPath(maxInputBytesPerBatchPath: String)

    public fun maxItemsPerBatch(maxItemsPerBatch: Number)

    public fun maxItemsPerBatchPath(maxItemsPerBatchPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ItemBatcherProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ItemBatcherProps.builder()

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.ItemBatcherProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcherProps,
  ) : CdkObject(cdkObject), ItemBatcherProps {
    override fun batchInput(): ObjectNode? = unwrap(this).getBatchInput()

    override fun maxInputBytesPerBatch(): Number? = unwrap(this).getMaxInputBytesPerBatch()

    override fun maxInputBytesPerBatchPath(): String? = unwrap(this).getMaxInputBytesPerBatchPath()

    override fun maxItemsPerBatch(): Number? = unwrap(this).getMaxItemsPerBatch()

    override fun maxItemsPerBatchPath(): String? = unwrap(this).getMaxItemsPerBatchPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ItemBatcherProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ItemBatcherProps):
        ItemBatcherProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ItemBatcherProps):
        software.amazon.awscdk.services.stepfunctions.ItemBatcherProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ItemBatcherProps
  }
}
