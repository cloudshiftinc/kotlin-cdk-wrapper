@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DistributedMapProps : MapBaseProps {
  public fun itemBatcher(): ItemBatcher? = unwrap(this).getItemBatcher()?.let(ItemBatcher::wrap)

  public fun itemReader(): IItemReader? = unwrap(this).getItemReader()?.let(IItemReader::wrap)

  public fun label(): String? = unwrap(this).getLabel()

  public fun mapExecutionType(): StateMachineType? =
      unwrap(this).getMapExecutionType()?.let(StateMachineType::wrap)

  public fun resultWriter(): ResultWriter? = unwrap(this).getResultWriter()?.let(ResultWriter::wrap)

  public fun toleratedFailureCount(): Number? = unwrap(this).getToleratedFailureCount()

  public fun toleratedFailureCountPath(): String? = unwrap(this).getToleratedFailureCountPath()

  public fun toleratedFailurePercentage(): Number? = unwrap(this).getToleratedFailurePercentage()

  public fun toleratedFailurePercentagePath(): String? =
      unwrap(this).getToleratedFailurePercentagePath()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun itemBatcher(itemBatcher: ItemBatcher)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfc466abd460c2258d435802d216d887efed2e899fe56f547c93866da73cf35a")
    public fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit)

    public fun itemReader(itemReader: IItemReader)

    public fun itemSelector(itemSelector: Map<String, Any>)

    public fun itemsPath(itemsPath: String)

    public fun label(label: String)

    public fun mapExecutionType(mapExecutionType: StateMachineType)

    public fun maxConcurrency(maxConcurrency: Number)

    public fun maxConcurrencyPath(maxConcurrencyPath: String)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun resultWriter(resultWriter: ResultWriter)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f1bea22b30405e0038adacd4b7e46eac1ba1932a0e4516c754b509f597dc076")
    public fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit)

    public fun stateName(stateName: String)

    public fun toleratedFailureCount(toleratedFailureCount: Number)

    public fun toleratedFailureCountPath(toleratedFailureCountPath: String)

    public fun toleratedFailurePercentage(toleratedFailurePercentage: Number)

    public fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.DistributedMapProps.Builder =
        software.amazon.awscdk.services.stepfunctions.DistributedMapProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun itemBatcher(itemBatcher: ItemBatcher) {
      cdkBuilder.itemBatcher(itemBatcher.let(ItemBatcher::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfc466abd460c2258d435802d216d887efed2e899fe56f547c93866da73cf35a")
    override fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit): Unit =
        itemBatcher(ItemBatcher(itemBatcher))

    override fun itemReader(itemReader: IItemReader) {
      cdkBuilder.itemReader(itemReader.let(IItemReader::unwrap))
    }

    override fun itemSelector(itemSelector: Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector)
    }

    override fun itemsPath(itemsPath: String) {
      cdkBuilder.itemsPath(itemsPath)
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun mapExecutionType(mapExecutionType: StateMachineType) {
      cdkBuilder.mapExecutionType(mapExecutionType.let(StateMachineType::unwrap))
    }

    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    override fun maxConcurrencyPath(maxConcurrencyPath: String) {
      cdkBuilder.maxConcurrencyPath(maxConcurrencyPath)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun resultWriter(resultWriter: ResultWriter) {
      cdkBuilder.resultWriter(resultWriter.let(ResultWriter::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f1bea22b30405e0038adacd4b7e46eac1ba1932a0e4516c754b509f597dc076")
    override fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit): Unit =
        resultWriter(ResultWriter(resultWriter))

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun toleratedFailureCount(toleratedFailureCount: Number) {
      cdkBuilder.toleratedFailureCount(toleratedFailureCount)
    }

    override fun toleratedFailureCountPath(toleratedFailureCountPath: String) {
      cdkBuilder.toleratedFailureCountPath(toleratedFailureCountPath)
    }

    override fun toleratedFailurePercentage(toleratedFailurePercentage: Number) {
      cdkBuilder.toleratedFailurePercentage(toleratedFailurePercentage)
    }

    override fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String) {
      cdkBuilder.toleratedFailurePercentagePath(toleratedFailurePercentagePath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.DistributedMapProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMapProps,
  ) : CdkObject(cdkObject), DistributedMapProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun itemBatcher(): ItemBatcher? = unwrap(this).getItemBatcher()?.let(ItemBatcher::wrap)

    override fun itemReader(): IItemReader? = unwrap(this).getItemReader()?.let(IItemReader::wrap)

    override fun itemSelector(): Map<String, Any> = unwrap(this).getItemSelector() ?: emptyMap()

    override fun itemsPath(): String? = unwrap(this).getItemsPath()

    override fun label(): String? = unwrap(this).getLabel()

    override fun mapExecutionType(): StateMachineType? =
        unwrap(this).getMapExecutionType()?.let(StateMachineType::wrap)

    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    override fun maxConcurrencyPath(): String? = unwrap(this).getMaxConcurrencyPath()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun resultWriter(): ResultWriter? =
        unwrap(this).getResultWriter()?.let(ResultWriter::wrap)

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun toleratedFailureCount(): Number? = unwrap(this).getToleratedFailureCount()

    override fun toleratedFailureCountPath(): String? = unwrap(this).getToleratedFailureCountPath()

    override fun toleratedFailurePercentage(): Number? =
        unwrap(this).getToleratedFailurePercentage()

    override fun toleratedFailurePercentagePath(): String? =
        unwrap(this).getToleratedFailurePercentagePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DistributedMapProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMapProps):
        DistributedMapProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DistributedMapProps):
        software.amazon.awscdk.services.stepfunctions.DistributedMapProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.DistributedMapProps
  }
}
