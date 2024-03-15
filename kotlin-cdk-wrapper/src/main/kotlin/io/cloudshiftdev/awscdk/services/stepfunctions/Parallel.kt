@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Parallel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Parallel,
) : State(cdkObject), INextable {
  public open fun addCatch(handler: IChainable): Parallel =
      unwrap(this).addCatch(handler.let(IChainable::unwrap)).let(Parallel::wrap)

  public open fun addCatch(handler: IChainable, props: CatchProps): Parallel =
      unwrap(this).addCatch(handler.let(IChainable::unwrap),
      props.let(CatchProps::unwrap)).let(Parallel::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b719e950ad2c8299d268244d76691f679b7fa802f14b21a3fa3a73374f60d09")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit): Parallel =
      addCatch(handler, CatchProps(props))

  public open fun addRetry(): Parallel = unwrap(this).addRetry().let(Parallel::wrap)

  public open fun addRetry(props: RetryProps): Parallel =
      unwrap(this).addRetry(props.let(RetryProps::unwrap)).let(Parallel::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("001441e679998fc0a3c1b7097ba22af8e29f36fc68df94c1378ef16674041fba")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): Parallel =
      addRetry(RetryProps(props))

  public override fun bindToGraph(graph: StateGraph) {
    unwrap(this).bindToGraph(graph.let(StateGraph::unwrap))
  }

  public open fun branch(branches: IChainable): Parallel =
      unwrap(this).branch(branches.let(IChainable::unwrap)).let(Parallel::wrap)

  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Parallel.Builder =
        software.amazon.awscdk.services.stepfunctions.Parallel.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
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

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Parallel = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Parallel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Parallel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Parallel): Parallel =
        Parallel(cdkObject)

    internal fun unwrap(wrapped: Parallel): software.amazon.awscdk.services.stepfunctions.Parallel =
        wrapped.cdkObject
  }
}
