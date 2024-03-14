package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.Boolean
import kotlin.Unit

public interface FindStateOptions {
  public fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()

  public interface Builder {
    public fun includeErrorHandlers(includeErrorHandlers: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.FindStateOptions.builder()

    public override fun includeErrorHandlers(includeErrorHandlers: Boolean) {
      cdkBuilder.includeErrorHandlers(includeErrorHandlers)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.FindStateOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.FindStateOptions,
  ) : FindStateOptions {
    public override fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FindStateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FindStateOptions):
        FindStateOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FindStateOptions):
        software.amazon.awscdk.services.stepfunctions.FindStateOptions = (wrapped as
        Wrapper).cdkObject
  }
}
