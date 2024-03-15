@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Configuration for a using Docker image.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * DockerImageConfig dockerImageConfig = DockerImageConfig.builder()
 * .imageUri("imageUri")
 * .build();
 * ```
 */
public interface DockerImageConfig {
  /**
   * The fully qualified URI of the Docker image.
   */
  public fun imageUri(): String

  /**
   * A builder for [DockerImageConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param imageUri The fully qualified URI of the Docker image. 
     */
    public fun imageUri(imageUri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig.builder()

    /**
     * @param imageUri The fully qualified URI of the Docker image. 
     */
    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig,
  ) : CdkObject(cdkObject), DockerImageConfig {
    /**
     * The fully qualified URI of the Docker image.
     */
    override fun imageUri(): String = unwrap(this).getImageUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig):
        DockerImageConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig
  }
}
