@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Definitions for the asset manifest.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * AssetManifest assetManifest = AssetManifest.builder()
 * .version("version")
 * // the properties below are optional
 * .dockerImages(Map.of(
 * "dockerImagesKey", DockerImageAsset.builder()
 * .destinations(Map.of(
 * "destinationsKey", DockerImageDestination.builder()
 * .imageTag("imageTag")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build()))
 * .source(DockerImageSource.builder()
 * .cacheDisabled(false)
 * .cacheFrom(List.of(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build()))
 * .cacheTo(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build())
 * .directory("directory")
 * .dockerBuildArgs(Map.of(
 * "dockerBuildArgsKey", "dockerBuildArgs"))
 * .dockerBuildSecrets(Map.of(
 * "dockerBuildSecretsKey", "dockerBuildSecrets"))
 * .dockerBuildSsh("dockerBuildSsh")
 * .dockerBuildTarget("dockerBuildTarget")
 * .dockerFile("dockerFile")
 * .dockerOutputs(List.of("dockerOutputs"))
 * .executable(List.of("executable"))
 * .networkMode("networkMode")
 * .platform("platform")
 * .build())
 * .build()))
 * .files(Map.of(
 * "filesKey", FileAsset.builder()
 * .destinations(Map.of(
 * "destinationsKey", FileDestination.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build()))
 * .source(FileSource.builder()
 * .executable(List.of("executable"))
 * .packaging(FileAssetPackaging.FILE)
 * .path("path")
 * .build())
 * .build()))
 * .build();
 * ```
 */
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
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.AssetManifest.Builder =
        software.amazon.awscdk.cloud_assembly_schema.AssetManifest.builder()

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

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.AssetManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.AssetManifest,
  ) : CdkObject(cdkObject),
      AssetManifest {
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

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.AssetManifest):
        AssetManifest = CdkObjectWrappers.wrap(cdkObject) as? AssetManifest ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifest):
        software.amazon.awscdk.cloud_assembly_schema.AssetManifest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.AssetManifest
  }
}
