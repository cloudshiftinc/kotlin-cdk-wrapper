package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Succeed internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Succeed,
) : State(cdkObject) {
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun outputPath(outputPath: String)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Succeed.Builder =
        software.amazon.awscdk.services.stepfunctions.Succeed.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Succeed = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Succeed {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Succeed(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Succeed): Succeed =
        Succeed(cdkObject)

    internal fun unwrap(wrapped: Succeed): software.amazon.awscdk.services.stepfunctions.Succeed =
        wrapped.cdkObject
  }
}
