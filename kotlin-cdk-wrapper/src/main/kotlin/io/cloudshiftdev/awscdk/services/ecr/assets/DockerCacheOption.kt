@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options for configuring the Docker cache backend.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAsset;
 * import io.cloudshiftdev.awscdk.services.ecr.assets.Platform;
 * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
 * .directory(join(__dirname, "my-image"))
 * .cacheFrom(List.of(DockerCacheOption.builder().type("registry").params(Map.of("ref",
 * "ghcr.io/myorg/myimage:cache")).build()))
 * .cacheTo(DockerCacheOption.builder().type("registry").params(Map.of("ref",
 * "ghcr.io/myorg/myimage:cache", "mode", "max", "compression", "zstd")).build())
 * .build();
 * ```
 */
public interface DockerCacheOption {
  /**
   * Any parameters to pass into the docker cache backend configuration.
   *
   * Refer to https://docs.docker.com/build/cache/backends/ for cache backend configuration.
   *
   * Default: {} No options provided
   *
   * Example:
   *
   * ```
   * String branch;
   * Map&lt;String, Object&gt; params = Map.of(
   * "ref", String.format("12345678.dkr.ecr.us-west-2.amazonaws.com/cache:%s", branch),
   * "mode", "max");
   * ```
   */
  public fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

  /**
   * The type of cache to use.
   *
   * Refer to https://docs.docker.com/build/cache/backends/ for full list of backends.
   *
   * Default: - unspecified
   *
   * Example:
   *
   * ```
   * "registry";
   * ```
   */
  public fun type(): String

  /**
   * A builder for [DockerCacheOption]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param params Any parameters to pass into the docker cache backend configuration.
     * Refer to https://docs.docker.com/build/cache/backends/ for cache backend configuration.
     */
    public fun params(params: Map<String, String>)

    /**
     * @param type The type of cache to use. 
     * Refer to https://docs.docker.com/build/cache/backends/ for full list of backends.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.DockerCacheOption.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerCacheOption.builder()

    /**
     * @param params Any parameters to pass into the docker cache backend configuration.
     * Refer to https://docs.docker.com/build/cache/backends/ for cache backend configuration.
     */
    override fun params(params: Map<String, String>) {
      cdkBuilder.params(params)
    }

    /**
     * @param type The type of cache to use. 
     * Refer to https://docs.docker.com/build/cache/backends/ for full list of backends.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerCacheOption =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.assets.DockerCacheOption,
  ) : CdkObject(cdkObject),
      DockerCacheOption {
    /**
     * Any parameters to pass into the docker cache backend configuration.
     *
     * Refer to https://docs.docker.com/build/cache/backends/ for cache backend configuration.
     *
     * Default: {} No options provided
     *
     * Example:
     *
     * ```
     * String branch;
     * Map&lt;String, Object&gt; params = Map.of(
     * "ref", String.format("12345678.dkr.ecr.us-west-2.amazonaws.com/cache:%s", branch),
     * "mode", "max");
     * ```
     */
    override fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

    /**
     * The type of cache to use.
     *
     * Refer to https://docs.docker.com/build/cache/backends/ for full list of backends.
     *
     * Default: - unspecified
     *
     * Example:
     *
     * ```
     * "registry";
     * ```
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerCacheOption {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerCacheOption):
        DockerCacheOption = CdkObjectWrappers.wrap(cdkObject) as? DockerCacheOption ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerCacheOption):
        software.amazon.awscdk.services.ecr.assets.DockerCacheOption = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.assets.DockerCacheOption
  }
}
