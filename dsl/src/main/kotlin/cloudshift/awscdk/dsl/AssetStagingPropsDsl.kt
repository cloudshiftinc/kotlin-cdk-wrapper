@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.AssetStagingProps
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode

/**
 * Initialization properties for `AssetStaging`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * DockerImage dockerImage;
 * ILocalBundling localBundling;
 * AssetStagingProps assetStagingProps = AssetStagingProps.builder()
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .assetHash("assetHash")
 * .assetHashType(AssetHashType.SOURCE)
 * .bundling(BundlingOptions.builder()
 * .image(dockerImage)
 * // the properties below are optional
 * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
 * .command(List.of("command"))
 * .entrypoint(List.of("entrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .local(localBundling)
 * .network("network")
 * .outputType(BundlingOutput.ARCHIVED)
 * .platform("platform")
 * .securityOpt("securityOpt")
 * .user("user")
 * .volumes(List.of(DockerVolume.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * // the properties below are optional
 * .consistency(DockerVolumeConsistency.CONSISTENT)
 * .build()))
 * .volumesFrom(List.of("volumesFrom"))
 * .workingDirectory("workingDirectory")
 * .build())
 * .exclude(List.of("exclude"))
 * .extraHash("extraHash")
 * .follow(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .build();
 * ```
 */
@CdkDslMarker
public class AssetStagingPropsDsl {
    private val cdkBuilder: AssetStagingProps.Builder = AssetStagingProps.builder()

    private val _exclude: MutableList<String> = mutableListOf()

    /**
     * @param assetHash Specify a custom hash for this asset. If `assetHashType` is set it must be
     *   set to `AssetHashType.CUSTOM`. For consistency, this custom hash will be SHA256 hashed and
     *   encoded as hex. The resulting hash will be the asset hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and used for
     * optimizing and caching deployment activities related to this asset such as packaging,
     * uploading to Amazon S3, etc. If you chose to customize the hash, you will need to make sure
     * it is updated every time the asset changes, or otherwise it is possible that some deployments
     * will not be invalidated.
     */
    public fun assetHash(assetHash: String) {
        cdkBuilder.assetHash(assetHash)
    }

    /**
     * @param assetHashType Specifies the type of hash to calculate for this asset. If `assetHash`
     *   is configured, this option must be `undefined` or `AssetHashType.CUSTOM`.
     */
    public fun assetHashType(assetHashType: AssetHashType) {
        cdkBuilder.assetHashType(assetHashType)
    }

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     *   bundling provider. The asset path will be mounted at `/asset-input`. The Docker container
     *   is responsible for putting content at `/asset-output`. The content at `/asset-output` will
     *   be zipped and used as the final asset.
     */
    public fun bundling(bundling: BundlingOptionsDsl.() -> Unit = {}) {
        val builder = BundlingOptionsDsl()
        builder.apply(bundling)
        cdkBuilder.bundling(builder.build())
    }

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     *   bundling provider. The asset path will be mounted at `/asset-input`. The Docker container
     *   is responsible for putting content at `/asset-output`. The content at `/asset-output` will
     *   be zipped and used as the final asset.
     */
    public fun bundling(bundling: BundlingOptions) {
        cdkBuilder.bundling(bundling)
    }

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /**
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     *   and other inputs).
     */
    public fun extraHash(extraHash: String) {
        cdkBuilder.extraHash(extraHash)
    }

    /** @param follow A strategy for how to handle symlinks. */
    public fun follow(follow: SymlinkFollowMode) {
        cdkBuilder.follow(follow)
    }

    /** @param ignoreMode The ignore behavior to use for `exclude` patterns. */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    /** @param sourcePath The source file or directory to copy from. */
    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): AssetStagingProps {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        return cdkBuilder.build()
    }
}
