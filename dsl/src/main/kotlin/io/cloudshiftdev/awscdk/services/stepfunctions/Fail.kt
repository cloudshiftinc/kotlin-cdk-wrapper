package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Fail internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Fail,
) : State(cdkObject) {
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  public interface Builder {
    public fun cause(cause: String) {
    }

    public fun causePath(causePath: String) {
    }

    public fun comment(comment: String) {
    }

    public fun error(error: String) {
    }

    public fun errorPath(errorPath: String) {
    }

    public fun stateName(stateName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Fail.Builder =
        software.amazon.awscdk.services.stepfunctions.Fail.Builder.create(scope, id)

    public override fun cause(cause: String) {
      cdkBuilder.cause(cause)
    }

    public override fun causePath(causePath: String) {
      cdkBuilder.causePath(causePath)
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun error(error: String) {
      cdkBuilder.error(error)
    }

    public override fun errorPath(errorPath: String) {
      cdkBuilder.errorPath(errorPath)
    }

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Fail = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Fail {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Fail(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Fail): Fail =
        Fail(cdkObject)

    internal fun unwrap(wrapped: Fail): software.amazon.awscdk.services.stepfunctions.Fail =
        wrapped.cdkObject
  }
}
