package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Pass internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Pass,
) : State(cdkObject), INextable {
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun outputPath(outputPath: String)

    public fun parameters(parameters: Map<String, Any>)

    public fun result(result: Result)

    public fun resultPath(resultPath: String)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Pass.Builder =
        software.amazon.awscdk.services.stepfunctions.Pass.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun result(result: Result) {
      cdkBuilder.result(result.let(Result::unwrap))
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Pass = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Pass {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Pass(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Pass): Pass =
        Pass(cdkObject)

    internal fun unwrap(wrapped: Pass): software.amazon.awscdk.services.stepfunctions.Pass =
        wrapped.cdkObject
  }
}
