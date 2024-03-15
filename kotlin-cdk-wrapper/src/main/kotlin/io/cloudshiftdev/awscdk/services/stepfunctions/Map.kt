@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Map internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Map,
) : MapBase(cdkObject), INextable {
  public open fun addCatch(handler: IChainable): Map =
      unwrap(this).addCatch(handler.let(IChainable::unwrap)).let(Map::wrap)

  public open fun addCatch(handler: IChainable, props: CatchProps): Map =
      unwrap(this).addCatch(handler.let(IChainable::unwrap),
      props.let(CatchProps::unwrap)).let(Map::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("649d9f3291ef4d0ef63a8c5a0298abac7d1de4b3e19759ec17eebcb73c9b5546")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit): Map =
      addCatch(handler, CatchProps(props))

  public open fun addRetry(): Map = unwrap(this).addRetry().let(Map::wrap)

  public open fun addRetry(props: RetryProps): Map =
      unwrap(this).addRetry(props.let(RetryProps::unwrap)).let(Map::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("661fedc3f68f12ca44a055f347012794aff87d8bc21e2414b45d66eeec8cda0f")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): Map = addRetry(RetryProps(props))

  public open fun itemProcessor(processor: IChainable): Map =
      unwrap(this).itemProcessor(processor.let(IChainable::unwrap)).let(Map::wrap)

  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig): Map =
      unwrap(this).itemProcessor(processor.let(IChainable::unwrap),
      config.let(ProcessorConfig::unwrap)).let(Map::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("71a7ba7c6943da14aead58a96c7a9536157cdb72a42de33acb42a1e121af8bfd")
  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig.Builder.() -> Unit):
      Map = itemProcessor(processor, ProcessorConfig(config))

  @Deprecated(message = "deprecated in CDK")
  public open fun iterator(iterator: IChainable): Map =
      unwrap(this).iterator(iterator.let(IChainable::unwrap)).let(Map::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun itemSelector(itemSelector: kotlin.collections.Map<String, Any>)

    public fun itemsPath(itemsPath: String)

    public fun maxConcurrency(maxConcurrency: Number)

    public fun maxConcurrencyPath(maxConcurrencyPath: String)

    public fun outputPath(outputPath: String)

    @Deprecated(message = "deprecated in CDK")
    public fun parameters(parameters: kotlin.collections.Map<String, Any>)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: kotlin.collections.Map<String, Any>)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Map.Builder =
        software.amazon.awscdk.services.stepfunctions.Map.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun itemSelector(itemSelector: kotlin.collections.Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector)
    }

    override fun itemsPath(itemsPath: String) {
      cdkBuilder.itemsPath(itemsPath)
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

    @Deprecated(message = "deprecated in CDK")
    override fun parameters(parameters: kotlin.collections.Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: kotlin.collections.Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Map = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Map {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Map(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Map): Map =
        Map(cdkObject)

    internal fun unwrap(wrapped: Map): software.amazon.awscdk.services.stepfunctions.Map =
        wrapped.cdkObject
  }
}
