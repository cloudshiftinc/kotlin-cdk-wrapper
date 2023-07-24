@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.AssetManifest
import software.amazon.awscdk.cloudassembly.schema.DockerImageAsset
import software.amazon.awscdk.cloudassembly.schema.FileAsset
import kotlin.String
import kotlin.collections.Map

/**
 * Definitions for the asset manifest.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
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
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build()))
 * .source(DockerImageSource.builder()
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
@CdkDslMarker
public class AssetManifestDsl {
    private val cdkBuilder: AssetManifest.Builder = AssetManifest.builder()

    /**
     * @param dockerImages The Docker image assets in this manifest.
     */
    public fun dockerImages(dockerImages: Map<String, DockerImageAsset>) {
        cdkBuilder.dockerImages(dockerImages)
    }

    /**
     * @param files The file assets in this manifest.
     */
    public fun files(files: Map<String, FileAsset>) {
        cdkBuilder.files(files)
    }

    /**
     * @param version Version of the manifest.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): AssetManifest = cdkBuilder.build()
}
