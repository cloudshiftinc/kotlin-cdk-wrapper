package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface AssemblyBuildOptions {
  /**
   * A builder for [AssemblyBuildOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.AssemblyBuildOptions.Builder =
        software.amazon.awscdk.cxapi.AssemblyBuildOptions.builder()

    public fun build(): software.amazon.awscdk.cxapi.AssemblyBuildOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.AssemblyBuildOptions,
  ) : CdkObject(cdkObject), AssemblyBuildOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssemblyBuildOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.AssemblyBuildOptions):
        AssemblyBuildOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssemblyBuildOptions):
        software.amazon.awscdk.cxapi.AssemblyBuildOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.AssemblyBuildOptions
  }
}
