package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AssetManifest {
  /**
   * The Docker image assets in this manifest.
   *
   * Default: - No Docker images
   */
  public fun dockerImages(): Map<String, DockerImageAsset> =
      unwrap(this).getDockerImages()?.mapValues{DockerImageAsset.wrap(it.value)} ?: emptyMap()

  /**
   * The file assets in this manifest.
   *
   * Default: - No files
   */
  public fun files(): Map<String, FileAsset> =
      unwrap(this).getFiles()?.mapValues{FileAsset.wrap(it.value)} ?: emptyMap()

  /**
   * Version of the manifest.
   */
  public fun version(): String

  /**
   * A builder for [AssetManifest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dockerImages The Docker image assets in this manifest.
     */
    public fun dockerImages(dockerImages: Map<String, DockerImageAsset>)

    /**
     * @param files The file assets in this manifest.
     */
    public fun files(files: Map<String, FileAsset>)

    /**
     * @param version Version of the manifest. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AssetManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.AssetManifest.builder()

    /**
     * @param dockerImages The Docker image assets in this manifest.
     */
    override fun dockerImages(dockerImages: Map<String, DockerImageAsset>) {
      cdkBuilder.dockerImages(dockerImages.mapValues{DockerImageAsset.unwrap(it.value)})
    }

    /**
     * @param files The file assets in this manifest.
     */
    override fun files(files: Map<String, FileAsset>) {
      cdkBuilder.files(files.mapValues{FileAsset.unwrap(it.value)})
    }

    /**
     * @param version Version of the manifest. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssetManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifest,
  ) : CdkObject(cdkObject), AssetManifest {
    /**
     * The Docker image assets in this manifest.
     *
     * Default: - No Docker images
     */
    override fun dockerImages(): Map<String, DockerImageAsset> =
        unwrap(this).getDockerImages()?.mapValues{DockerImageAsset.wrap(it.value)} ?: emptyMap()

    /**
     * The file assets in this manifest.
     *
     * Default: - No files
     */
    override fun files(): Map<String, FileAsset> =
        unwrap(this).getFiles()?.mapValues{FileAsset.wrap(it.value)} ?: emptyMap()

    /**
     * Version of the manifest.
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifest):
        AssetManifest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifest):
        software.amazon.awscdk.cloudassembly.schema.AssetManifest = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.AssetManifest
  }
}
