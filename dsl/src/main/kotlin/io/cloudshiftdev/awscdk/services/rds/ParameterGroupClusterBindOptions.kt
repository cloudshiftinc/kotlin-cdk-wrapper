package io.cloudshiftdev.awscdk.services.rds

import kotlin.Unit

public interface ParameterGroupClusterBindOptions {
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions.Builder =
        software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions.builder()

    public fun build(): software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions,
  ) : ParameterGroupClusterBindOptions

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterGroupClusterBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions):
        ParameterGroupClusterBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParameterGroupClusterBindOptions):
        software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
