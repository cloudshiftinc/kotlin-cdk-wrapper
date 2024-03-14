package io.cloudshiftdev.awscdk.services.lambda

import kotlin.Boolean
import kotlin.Unit

public interface EnvironmentOptions {
  public fun removeInEdge(): Boolean? = unwrap(this).getRemoveInEdge()

  public interface Builder {
    public fun removeInEdge(removeInEdge: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EnvironmentOptions.Builder =
        software.amazon.awscdk.services.lambda.EnvironmentOptions.builder()

    override fun removeInEdge(removeInEdge: Boolean) {
      cdkBuilder.removeInEdge(removeInEdge)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EnvironmentOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.EnvironmentOptions,
  ) : EnvironmentOptions {
    override fun removeInEdge(): Boolean? = unwrap(this).getRemoveInEdge()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EnvironmentOptions):
        EnvironmentOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentOptions):
        software.amazon.awscdk.services.lambda.EnvironmentOptions = (wrapped as Wrapper).cdkObject
  }
}
