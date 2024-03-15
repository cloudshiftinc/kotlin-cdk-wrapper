@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * The location of the published docker image.
 *
 * This is where the image can be
 * consumed at runtime.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * DockerImageAssetLocation dockerImageAssetLocation = DockerImageAssetLocation.builder()
 * .imageUri("imageUri")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .imageTag("imageTag")
 * .build();
 * ```
 */
public interface DockerImageAssetLocation {
  /**
   * The tag of the image in Amazon ECR.
   *
   * Default: - the hash of the asset, or the `dockerTagPrefix` concatenated with the asset hash if
   * a `dockerTagPrefix` is specified in the stack synthesizer
   */
  public fun imageTag(): String? = unwrap(this).getImageTag()

  /**
   * The URI of the image in Amazon ECR (including a tag).
   */
  public fun imageUri(): String

  /**
   * The name of the ECR repository.
   */
  public fun repositoryName(): String

  /**
   * A builder for [DockerImageAssetLocation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param imageTag The tag of the image in Amazon ECR.
     */
    public fun imageTag(imageTag: String)

    /**
     * @param imageUri The URI of the image in Amazon ECR (including a tag). 
     */
    public fun imageUri(imageUri: String)

    /**
     * @param repositoryName The name of the ECR repository. 
     */
    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerImageAssetLocation.Builder =
        software.amazon.awscdk.DockerImageAssetLocation.builder()

    /**
     * @param imageTag The tag of the image in Amazon ECR.
     */
    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    /**
     * @param imageUri The URI of the image in Amazon ECR (including a tag). 
     */
    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    /**
     * @param repositoryName The name of the ECR repository. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.DockerImageAssetLocation = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.DockerImageAssetLocation,
  ) : CdkObject(cdkObject), DockerImageAssetLocation {
    /**
     * The tag of the image in Amazon ECR.
     *
     * Default: - the hash of the asset, or the `dockerTagPrefix` concatenated with the asset hash
     * if a `dockerTagPrefix` is specified in the stack synthesizer
     */
    override fun imageTag(): String? = unwrap(this).getImageTag()

    /**
     * The URI of the image in Amazon ECR (including a tag).
     */
    override fun imageUri(): String = unwrap(this).getImageUri()

    /**
     * The name of the ECR repository.
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerImageAssetLocation):
        DockerImageAssetLocation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetLocation):
        software.amazon.awscdk.DockerImageAssetLocation = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.DockerImageAssetLocation
  }
}
