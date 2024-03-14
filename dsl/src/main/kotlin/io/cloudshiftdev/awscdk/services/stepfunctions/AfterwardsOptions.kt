package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.Boolean
import kotlin.Unit

public interface AfterwardsOptions {
  public fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()

  public fun includeOtherwise(): Boolean? = unwrap(this).getIncludeOtherwise()

  public interface Builder {
    public fun includeErrorHandlers(includeErrorHandlers: Boolean)

    public fun includeOtherwise(includeOtherwise: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder
        = software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.builder()

    override fun includeErrorHandlers(includeErrorHandlers: Boolean) {
      cdkBuilder.includeErrorHandlers(includeErrorHandlers)
    }

    override fun includeOtherwise(includeOtherwise: Boolean) {
      cdkBuilder.includeOtherwise(includeOtherwise)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.AfterwardsOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.AfterwardsOptions,
  ) : AfterwardsOptions {
    override fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()

    override fun includeOtherwise(): Boolean? = unwrap(this).getIncludeOtherwise()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AfterwardsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.AfterwardsOptions):
        AfterwardsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AfterwardsOptions):
        software.amazon.awscdk.services.stepfunctions.AfterwardsOptions = (wrapped as
        Wrapper).cdkObject
  }
}
