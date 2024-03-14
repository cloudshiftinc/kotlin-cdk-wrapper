package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface ParameterGroupInstanceBindOptions {
  /**
   * A builder for [ParameterGroupInstanceBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions.Builder =
        software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions.builder()

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions,
  ) : ParameterGroupInstanceBindOptions

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupInstanceBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions):
        ParameterGroupInstanceBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParameterGroupInstanceBindOptions):
        software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
