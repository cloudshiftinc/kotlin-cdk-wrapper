@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * The return type from `IBuildImage.binder` - currently empty.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * BuildImageConfig buildImageConfig = BuildImageConfig.builder().build();
 * ```
 */
public interface BuildImageConfig {
  /**
   * A builder for [BuildImageConfig]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BuildImageConfig.Builder =
        software.amazon.awscdk.services.codebuild.BuildImageConfig.builder()

    public fun build(): software.amazon.awscdk.services.codebuild.BuildImageConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.BuildImageConfig,
  ) : CdkObject(cdkObject), BuildImageConfig

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BuildImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildImageConfig):
        BuildImageConfig = CdkObjectWrappers.wrap(cdkObject) as BuildImageConfig

    internal fun unwrap(wrapped: BuildImageConfig):
        software.amazon.awscdk.services.codebuild.BuildImageConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BuildImageConfig
  }
}
