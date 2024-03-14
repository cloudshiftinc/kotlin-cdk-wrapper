package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface BuildImageBindOptions {
  /**
   * A builder for [BuildImageBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BuildImageBindOptions.Builder
        = software.amazon.awscdk.services.codebuild.BuildImageBindOptions.builder()

    public fun build(): software.amazon.awscdk.services.codebuild.BuildImageBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.BuildImageBindOptions,
  ) : CdkObject(cdkObject), BuildImageBindOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BuildImageBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildImageBindOptions):
        BuildImageBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildImageBindOptions):
        software.amazon.awscdk.services.codebuild.BuildImageBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BuildImageBindOptions
  }
}
