package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DistributedMap internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMap,
) : MapBase(cdkObject), INextable {
  public open fun addCatch(handler: IChainable): DistributedMap =
      unwrap(this).addCatch(handler.let(IChainable::unwrap)).let(DistributedMap::wrap)

  public open fun addCatch(handler: IChainable, props: CatchProps): DistributedMap =
      unwrap(this).addCatch(handler.let(IChainable::unwrap),
      props.let(CatchProps::unwrap)).let(DistributedMap::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e6635925eb39e6635549b784d2bdbc4cd33319139abc889c8271e518085caea7")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit):
      DistributedMap = addCatch(handler, CatchProps(props))

  public open fun addRetry(): DistributedMap = unwrap(this).addRetry().let(DistributedMap::wrap)

  public open fun addRetry(props: RetryProps): DistributedMap =
      unwrap(this).addRetry(props.let(RetryProps::unwrap)).let(DistributedMap::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dce54c3cd0806411bf442674d791696bae21a79e691a761f2d5d8d2329efa375")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): DistributedMap =
      addRetry(RetryProps(props))

  public open fun itemProcessor(processor: IChainable): DistributedMap =
      unwrap(this).itemProcessor(processor.let(IChainable::unwrap)).let(DistributedMap::wrap)

  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig): DistributedMap =
      unwrap(this).itemProcessor(processor.let(IChainable::unwrap),
      config.let(ProcessorConfig::unwrap)).let(DistributedMap::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("252a9aadcff97f3e0a2ffd08ee67fa9299ca1ca7b082b6b7475ee45c4f2f40e9")
  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig.Builder.() -> Unit):
      DistributedMap = itemProcessor(processor, ProcessorConfig(config))

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  public interface Builder {
    public fun comment(comment: String) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun itemBatcher(itemBatcher: ItemBatcher) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aeab7f37a832a31bb89e715fbeb99a51fb9a2dd36e09f574eeec72eac44f70c")
    public fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit) {
    }

    public fun itemReader(itemReader: IItemReader) {
    }

    public fun itemSelector(itemSelector: Map<String, Any>) {
    }

    public fun itemsPath(itemsPath: String) {
    }

    public fun label(label: String) {
    }

    public fun mapExecutionType(mapExecutionType: StateMachineType) {
    }

    public fun maxConcurrency(maxConcurrency: Number) {
    }

    public fun maxConcurrencyPath(maxConcurrencyPath: String) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun resultPath(resultPath: String) {
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
    }

    public fun resultWriter(resultWriter: ResultWriter) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16ba6ed0c805133e4b1d136a01333f5d91a2ddba1b0a40565a0fd7525711bc3c")
    public fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit) {
    }

    public fun stateName(stateName: String) {
    }

    public fun toleratedFailureCount(toleratedFailureCount: Number) {
    }

    public fun toleratedFailureCountPath(toleratedFailureCountPath: String) {
    }

    public fun toleratedFailurePercentage(toleratedFailurePercentage: Number) {
    }

    public fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.DistributedMap.Builder =
        software.amazon.awscdk.services.stepfunctions.DistributedMap.Builder.create(scope, id)

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    public override fun itemBatcher(itemBatcher: ItemBatcher) {
      cdkBuilder.itemBatcher(itemBatcher.let(ItemBatcher::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aeab7f37a832a31bb89e715fbeb99a51fb9a2dd36e09f574eeec72eac44f70c")
    public override fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit): Unit =
        itemBatcher(ItemBatcher(itemBatcher))

    public override fun itemReader(itemReader: IItemReader) {
      cdkBuilder.itemReader(itemReader.let(IItemReader::unwrap))
    }

    public override fun itemSelector(itemSelector: Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector)
    }

    public override fun itemsPath(itemsPath: String) {
      cdkBuilder.itemsPath(itemsPath)
    }

    public override fun label(label: String) {
      cdkBuilder.label(label)
    }

    public override fun mapExecutionType(mapExecutionType: StateMachineType) {
      cdkBuilder.mapExecutionType(mapExecutionType.let(StateMachineType::unwrap))
    }

    public override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    public override fun maxConcurrencyPath(maxConcurrencyPath: String) {
      cdkBuilder.maxConcurrencyPath(maxConcurrencyPath)
    }

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    public override fun resultWriter(resultWriter: ResultWriter) {
      cdkBuilder.resultWriter(resultWriter.let(ResultWriter::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16ba6ed0c805133e4b1d136a01333f5d91a2ddba1b0a40565a0fd7525711bc3c")
    public override fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit): Unit =
        resultWriter(ResultWriter(resultWriter))

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public override fun toleratedFailureCount(toleratedFailureCount: Number) {
      cdkBuilder.toleratedFailureCount(toleratedFailureCount)
    }

    public override fun toleratedFailureCountPath(toleratedFailureCountPath: String) {
      cdkBuilder.toleratedFailureCountPath(toleratedFailureCountPath)
    }

    public override fun toleratedFailurePercentage(toleratedFailurePercentage: Number) {
      cdkBuilder.toleratedFailurePercentage(toleratedFailurePercentage)
    }

    public override fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String) {
      cdkBuilder.toleratedFailurePercentagePath(toleratedFailurePercentagePath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.DistributedMap =
        cdkBuilder.build()
  }

  public companion object {
    public open fun isDistributedMap(x: Any): Boolean =
        software.amazon.awscdk.services.stepfunctions.DistributedMap.isDistributedMap(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DistributedMap {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DistributedMap(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMap):
        DistributedMap = DistributedMap(cdkObject)

    internal fun unwrap(wrapped: DistributedMap):
        software.amazon.awscdk.services.stepfunctions.DistributedMap = wrapped.cdkObject
  }
}
