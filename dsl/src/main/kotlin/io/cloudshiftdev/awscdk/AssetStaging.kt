package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AssetStaging
internal constructor(
    private val cdkObject: software.amazon.awscdk.AssetStaging,
) : CloudshiftdevConstructsConstruct(cdkObject) {
    /**
     * Absolute path to the asset data.
     *
     * If asset staging is disabled, this will just be the source path or a temporary directory used
     * for bundling.
     *
     * If asset staging is enabled it will be the staged path.
     *
     * IMPORTANT: If you are going to call `addFileAsset()`, use `relativeStagedPath()` instead.
     */
    public open fun absoluteStagedPath(): String = unwrap(this).getAbsoluteStagedPath()

    /** A cryptographic hash of the asset. */
    public open fun assetHash(): String = unwrap(this).getAssetHash()

    /** Whether this asset is an archive (zip or jar). */
    public open fun isArchive(): Boolean = unwrap(this).getIsArchive()

    /** How this asset should be packaged. */
    public open fun packaging(): FileAssetPackaging =
        unwrap(this).getPackaging().let(FileAssetPackaging::wrap)

    /**
     * Return the path to the staged asset, relative to the Cloud Assembly (manifest) directory of
     * the given stack.
     *
     * Only returns a relative path if the asset was staged, returns an absolute path if it was not
     * staged.
     *
     * A bundled asset might end up in the outDir and still not count as "staged"; if asset staging
     * is disabled we're technically expected to reference source directories, but we don't have a
     * source directory for the bundled outputs (as the bundle output is written to a temporary
     * directory). Nevertheless, we will still return an absolute path.
     *
     * A non-obvious directory layout may look like this:
     * ```
     * CLOUD ASSEMBLY ROOT
     * +-- asset.12345abcdef/
     * +-- assembly-Stage
     * +-- MyStack.template.json
     * +-- MyStack.assets.json &lt;- will contain { "path": "../asset.12345abcdef" }
     * ```
     *
     * @param stack
     */
    public open fun relativeStagedPath(stack: Stack): String =
        unwrap(this).relativeStagedPath(stack.let(Stack::unwrap))

    /** The absolute path of the asset as it was referenced by the user. */
    public open fun sourcePath(): String = unwrap(this).getSourcePath()

    /** A fluent builder for [io.cloudshiftdev.awscdk.AssetStaging]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specify a custom hash for this asset.
         *
         * If `assetHashType` is set it must be set to `AssetHashType.CUSTOM`. For consistency, this
         * custom hash will be SHA256 hashed and encoded as hex. The resulting hash will be the
         * asset hash.
         *
         * NOTE: the hash is used in order to identify a specific revision of the asset, and used
         * for optimizing and caching deployment activities related to this asset such as packaging,
         * uploading to Amazon S3, etc. If you chose to customize the hash, you will need to make
         * sure it is updated every time the asset changes, or otherwise it is possible that some
         * deployments will not be invalidated.
         *
         * Default: - based on `assetHashType`
         *
         * @param assetHash Specify a custom hash for this asset.
         */
        public fun assetHash(assetHash: String)

        /**
         * Specifies the type of hash to calculate for this asset.
         *
         * If `assetHash` is configured, this option must be `undefined` or `AssetHashType.CUSTOM`.
         *
         * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is explicitly
         * specified this value defaults to `AssetHashType.CUSTOM`.
         *
         * @param assetHashType Specifies the type of hash to calculate for this asset.
         */
        public fun assetHashType(assetHashType: AssetHashType)

        /**
         * Bundle the asset by executing a command in a Docker container or a custom bundling
         * provider.
         *
         * The asset path will be mounted at `/asset-input`. The Docker container is responsible for
         * putting content at `/asset-output`. The content at `/asset-output` will be zipped and
         * used as the final asset.
         *
         * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file, archived
         * into a .zip file and uploaded to S3 otherwise
         *
         * @param bundling Bundle the asset by executing a command in a Docker container or a custom
         *   bundling provider.
         */
        public fun bundling(bundling: BundlingOptions)

        /**
         * Bundle the asset by executing a command in a Docker container or a custom bundling
         * provider.
         *
         * The asset path will be mounted at `/asset-input`. The Docker container is responsible for
         * putting content at `/asset-output`. The content at `/asset-output` will be zipped and
         * used as the final asset.
         *
         * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file, archived
         * into a .zip file and uploaded to S3 otherwise
         *
         * @param bundling Bundle the asset by executing a command in a Docker container or a custom
         *   bundling provider.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("051b0819f64bbb57788aa50ba0caecab92a6d0cb9e6d2d1c01f3b82d947476ca")
        public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

        /**
         * File paths matching the patterns will be excluded.
         *
         * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
         * `bundling` property.
         *
         * Default: - nothing is excluded
         *
         * @param exclude File paths matching the patterns will be excluded.
         */
        public fun exclude(exclude: List<String>)

        /**
         * File paths matching the patterns will be excluded.
         *
         * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
         * `bundling` property.
         *
         * Default: - nothing is excluded
         *
         * @param exclude File paths matching the patterns will be excluded.
         */
        public fun exclude(vararg exclude: String)

        /**
         * Extra information to encode into the fingerprint (e.g. build instructions and other
         * inputs).
         *
         * Default: - hash is only based on source content
         *
         * @param extraHash Extra information to encode into the fingerprint (e.g. build
         *   instructions and other inputs).
         */
        public fun extraHash(extraHash: String)

        /**
         * A strategy for how to handle symlinks.
         *
         * Default: SymlinkFollowMode.NEVER
         *
         * @param follow A strategy for how to handle symlinks.
         */
        public fun follow(follow: SymlinkFollowMode)

        /**
         * The ignore behavior to use for `exclude` patterns.
         *
         * Default: IgnoreMode.GLOB
         *
         * @param ignoreMode The ignore behavior to use for `exclude` patterns.
         */
        public fun ignoreMode(ignoreMode: IgnoreMode)

        /**
         * The source file or directory to copy from.
         *
         * @param sourcePath The source file or directory to copy from.
         */
        public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.AssetStaging.Builder =
            software.amazon.awscdk.AssetStaging.Builder.create(scope, id)

        /**
         * Specify a custom hash for this asset.
         *
         * If `assetHashType` is set it must be set to `AssetHashType.CUSTOM`. For consistency, this
         * custom hash will be SHA256 hashed and encoded as hex. The resulting hash will be the
         * asset hash.
         *
         * NOTE: the hash is used in order to identify a specific revision of the asset, and used
         * for optimizing and caching deployment activities related to this asset such as packaging,
         * uploading to Amazon S3, etc. If you chose to customize the hash, you will need to make
         * sure it is updated every time the asset changes, or otherwise it is possible that some
         * deployments will not be invalidated.
         *
         * Default: - based on `assetHashType`
         *
         * @param assetHash Specify a custom hash for this asset.
         */
        override fun assetHash(assetHash: String) {
            cdkBuilder.assetHash(assetHash)
        }

        /**
         * Specifies the type of hash to calculate for this asset.
         *
         * If `assetHash` is configured, this option must be `undefined` or `AssetHashType.CUSTOM`.
         *
         * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is explicitly
         * specified this value defaults to `AssetHashType.CUSTOM`.
         *
         * @param assetHashType Specifies the type of hash to calculate for this asset.
         */
        override fun assetHashType(assetHashType: AssetHashType) {
            cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
        }

        /**
         * Bundle the asset by executing a command in a Docker container or a custom bundling
         * provider.
         *
         * The asset path will be mounted at `/asset-input`. The Docker container is responsible for
         * putting content at `/asset-output`. The content at `/asset-output` will be zipped and
         * used as the final asset.
         *
         * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file, archived
         * into a .zip file and uploaded to S3 otherwise
         *
         * @param bundling Bundle the asset by executing a command in a Docker container or a custom
         *   bundling provider.
         */
        override fun bundling(bundling: BundlingOptions) {
            cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
        }

        /**
         * Bundle the asset by executing a command in a Docker container or a custom bundling
         * provider.
         *
         * The asset path will be mounted at `/asset-input`. The Docker container is responsible for
         * putting content at `/asset-output`. The content at `/asset-output` will be zipped and
         * used as the final asset.
         *
         * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file, archived
         * into a .zip file and uploaded to S3 otherwise
         *
         * @param bundling Bundle the asset by executing a command in a Docker container or a custom
         *   bundling provider.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("051b0819f64bbb57788aa50ba0caecab92a6d0cb9e6d2d1c01f3b82d947476ca")
        override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
            bundling(BundlingOptions(bundling))

        /**
         * File paths matching the patterns will be excluded.
         *
         * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
         * `bundling` property.
         *
         * Default: - nothing is excluded
         *
         * @param exclude File paths matching the patterns will be excluded.
         */
        override fun exclude(exclude: List<String>) {
            cdkBuilder.exclude(exclude)
        }

        /**
         * File paths matching the patterns will be excluded.
         *
         * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
         * `bundling` property.
         *
         * Default: - nothing is excluded
         *
         * @param exclude File paths matching the patterns will be excluded.
         */
        override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

        /**
         * Extra information to encode into the fingerprint (e.g. build instructions and other
         * inputs).
         *
         * Default: - hash is only based on source content
         *
         * @param extraHash Extra information to encode into the fingerprint (e.g. build
         *   instructions and other inputs).
         */
        override fun extraHash(extraHash: String) {
            cdkBuilder.extraHash(extraHash)
        }

        /**
         * A strategy for how to handle symlinks.
         *
         * Default: SymlinkFollowMode.NEVER
         *
         * @param follow A strategy for how to handle symlinks.
         */
        override fun follow(follow: SymlinkFollowMode) {
            cdkBuilder.follow(follow.let(SymlinkFollowMode::unwrap))
        }

        /**
         * The ignore behavior to use for `exclude` patterns.
         *
         * Default: IgnoreMode.GLOB
         *
         * @param ignoreMode The ignore behavior to use for `exclude` patterns.
         */
        override fun ignoreMode(ignoreMode: IgnoreMode) {
            cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
        }

        /**
         * The source file or directory to copy from.
         *
         * @param sourcePath The source file or directory to copy from.
         */
        override fun sourcePath(sourcePath: String) {
            cdkBuilder.sourcePath(sourcePath)
        }

        public fun build(): software.amazon.awscdk.AssetStaging = cdkBuilder.build()
    }

    public companion object {
        public fun clearAssetHashCache() {
            software.amazon.awscdk.AssetStaging.clearAssetHashCache()
        }

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): AssetStaging {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return AssetStaging(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.AssetStaging): AssetStaging =
            AssetStaging(cdkObject)

        internal fun unwrap(wrapped: AssetStaging): software.amazon.awscdk.AssetStaging =
            wrapped.cdkObject
    }
}
