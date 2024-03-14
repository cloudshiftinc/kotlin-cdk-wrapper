package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CatchProps {
  public fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

  public fun resultPath(): String? = unwrap(this).getResultPath()

  public interface Builder {
    public fun errors(errors: List<String>)

    public fun errors(vararg errors: String)

    public fun resultPath(resultPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CatchProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CatchProps.builder()

    override fun errors(errors: List<String>) {
      cdkBuilder.errors(errors)
    }

    override fun errors(vararg errors: String): Unit = errors(errors.toList())

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CatchProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.CatchProps,
  ) : CatchProps {
    override fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

    override fun resultPath(): String? = unwrap(this).getResultPath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CatchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CatchProps):
        CatchProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CatchProps):
        software.amazon.awscdk.services.stepfunctions.CatchProps = (wrapped as Wrapper).cdkObject
  }
}
