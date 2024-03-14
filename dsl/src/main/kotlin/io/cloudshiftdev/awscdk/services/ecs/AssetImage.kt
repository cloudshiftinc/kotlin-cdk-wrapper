package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerCacheOption
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import io.cloudshiftdev.awscdk.services.ecr.assets.NetworkMode
import io.cloudshiftdev.awscdk.services.ecr.assets.Platform
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class AssetImage
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecs.AssetImage,
) : ContainerImage(cdkObject) {
    /**
     * Called when the image is used by a ContainerDefinition.
     *
     * @param scope
     * @param containerDefinition
     */
    public override fun bind(
        scope: Construct,
        containerDefinition: ContainerDefinition
    ): ContainerImageConfig =
        unwrap(this)
            .bind(
                scope.let(Construct::unwrap),
                containerDefinition.let(ContainerDefinition::unwrap)
            )
            .let(ContainerImageConfig::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.AssetImage]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Unique identifier of the docker image asset and its potential revisions.
         *
         * Required if using AppScopedStagingSynthesizer.
         *
         * Default: - no asset name
         *
         * @param assetName Unique identifier of the docker image asset and its potential revisions.
         */
        public fun assetName(assetName: String)

        /**
         * Build args to pass to the `docker build` command.
         *
         * Since Docker build arguments are resolved before deployment, keys and values cannot refer
         * to unresolved tokens (such as `lambda.functionArn` or `queue.queueUrl`).
         *
         * Default: - no build args are passed
         *
         * @param buildArgs Build args to pass to the `docker build` command.
         */
        public fun buildArgs(buildArgs: Map<String, String>)

        /**
         * Build secrets.
         *
         * Docker BuildKit must be enabled to use build secrets.
         *
         * Default: - no build secrets
         *
         * Example:
         * ```
         * import io.cloudshiftdev.awscdk.DockerBuildSecret;
         * Map&lt;String, String&gt; buildSecrets = Map.of(
         * "MY_SECRET", DockerBuildSecret.fromSrc("file.txt"));
         * ```
         *
         * [Documentation](https://docs.docker.com/build/buildkit/)
         *
         * @param buildSecrets Build secrets.
         */
        public fun buildSecrets(buildSecrets: Map<String, String>)

        /**
         * SSH agent socket or keys to pass to the `docker build` command.
         *
         * Docker BuildKit must be enabled to use the ssh flag
         *
         * Default: - no --ssh flag
         *
         * [Documentation](https://docs.docker.com/build/buildkit/)
         *
         * @param buildSsh SSH agent socket or keys to pass to the `docker build` command.
         */
        public fun buildSsh(buildSsh: String)

        /**
         * Disable the cache and pass `--no-cache` to the `docker build` command.
         *
         * Default: - cache is used
         *
         * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build`
         *   command.
         */
        public fun cacheDisabled(cacheDisabled: Boolean)

        /**
         * Cache from options to pass to the `docker build` command.
         *
         * Default: - no cache from options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheFrom Cache from options to pass to the `docker build` command.
         */
        public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

        /**
         * Cache from options to pass to the `docker build` command.
         *
         * Default: - no cache from options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheFrom Cache from options to pass to the `docker build` command.
         */
        public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

        /**
         * Cache to options to pass to the `docker build` command.
         *
         * Default: - no cache to options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheTo Cache to options to pass to the `docker build` command.
         */
        public fun cacheTo(cacheTo: DockerCacheOption)

        /**
         * Cache to options to pass to the `docker build` command.
         *
         * Default: - no cache to options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheTo Cache to options to pass to the `docker build` command.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3dbd4b2abcd3ab31ce315d550cfbf46c6067f6871850d113e1366ca33f1b6cdf")
        public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

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
         * Path to the Dockerfile (relative to the directory).
         *
         * Default: 'Dockerfile'
         *
         * @param file Path to the Dockerfile (relative to the directory).
         */
        public fun `file`(`file`: String)

        /**
         * A strategy for how to handle symlinks.
         *
         * Default: SymlinkFollowMode.NEVER
         *
         * @param followSymlinks A strategy for how to handle symlinks.
         */
        public fun followSymlinks(followSymlinks: SymlinkFollowMode)

        /**
         * The ignore behavior to use for `exclude` patterns.
         *
         * Default: IgnoreMode.GLOB
         *
         * @param ignoreMode The ignore behavior to use for `exclude` patterns.
         */
        public fun ignoreMode(ignoreMode: IgnoreMode)

        /**
         * Options to control which parameters are used to invalidate the asset hash.
         *
         * Default: - hash all parameters
         *
         * @param invalidation Options to control which parameters are used to invalidate the asset
         *   hash.
         */
        public fun invalidation(invalidation: DockerImageAssetInvalidationOptions)

        /**
         * Options to control which parameters are used to invalidate the asset hash.
         *
         * Default: - hash all parameters
         *
         * @param invalidation Options to control which parameters are used to invalidate the asset
         *   hash.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("090b76bf3c87e88959d892da084be4ad746eb80512f3699f5ec4d70033e2578e")
        public fun invalidation(
            invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit
        )

        /**
         * Networking mode for the RUN commands during build.
         *
         * Support docker API 1.25+.
         *
         * Default: - no networking mode specified (the default networking mode
         * `NetworkMode.DEFAULT` will be used)
         *
         * @param networkMode Networking mode for the RUN commands during build.
         */
        public fun networkMode(networkMode: NetworkMode)

        /**
         * Outputs to pass to the `docker build` command.
         *
         * Default: - no outputs are passed to the build command (default outputs are used)
         *
         * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
         *
         * @param outputs Outputs to pass to the `docker build` command.
         */
        public fun outputs(outputs: List<String>)

        /**
         * Outputs to pass to the `docker build` command.
         *
         * Default: - no outputs are passed to the build command (default outputs are used)
         *
         * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
         *
         * @param outputs Outputs to pass to the `docker build` command.
         */
        public fun outputs(vararg outputs: String)

        /**
         * Platform to build for.
         *
         * *Requires Docker Buildx*.
         *
         * Default: - no platform specified (the current machine architecture will be used)
         *
         * @param platform Platform to build for.
         */
        public fun platform(platform: Platform)

        /**
         * Docker target to build to.
         *
         * Default: - no target
         *
         * @param target Docker target to build to.
         */
        public fun target(target: String)
    }

    private class BuilderImpl(
        directory: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.AssetImage.Builder =
            software.amazon.awscdk.services.ecs.AssetImage.Builder.create(directory)

        /**
         * Unique identifier of the docker image asset and its potential revisions.
         *
         * Required if using AppScopedStagingSynthesizer.
         *
         * Default: - no asset name
         *
         * @param assetName Unique identifier of the docker image asset and its potential revisions.
         */
        override fun assetName(assetName: String) {
            cdkBuilder.assetName(assetName)
        }

        /**
         * Build args to pass to the `docker build` command.
         *
         * Since Docker build arguments are resolved before deployment, keys and values cannot refer
         * to unresolved tokens (such as `lambda.functionArn` or `queue.queueUrl`).
         *
         * Default: - no build args are passed
         *
         * @param buildArgs Build args to pass to the `docker build` command.
         */
        override fun buildArgs(buildArgs: Map<String, String>) {
            cdkBuilder.buildArgs(buildArgs)
        }

        /**
         * Build secrets.
         *
         * Docker BuildKit must be enabled to use build secrets.
         *
         * Default: - no build secrets
         *
         * Example:
         * ```
         * import io.cloudshiftdev.awscdk.DockerBuildSecret;
         * Map&lt;String, String&gt; buildSecrets = Map.of(
         * "MY_SECRET", DockerBuildSecret.fromSrc("file.txt"));
         * ```
         *
         * [Documentation](https://docs.docker.com/build/buildkit/)
         *
         * @param buildSecrets Build secrets.
         */
        override fun buildSecrets(buildSecrets: Map<String, String>) {
            cdkBuilder.buildSecrets(buildSecrets)
        }

        /**
         * SSH agent socket or keys to pass to the `docker build` command.
         *
         * Docker BuildKit must be enabled to use the ssh flag
         *
         * Default: - no --ssh flag
         *
         * [Documentation](https://docs.docker.com/build/buildkit/)
         *
         * @param buildSsh SSH agent socket or keys to pass to the `docker build` command.
         */
        override fun buildSsh(buildSsh: String) {
            cdkBuilder.buildSsh(buildSsh)
        }

        /**
         * Disable the cache and pass `--no-cache` to the `docker build` command.
         *
         * Default: - cache is used
         *
         * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build`
         *   command.
         */
        override fun cacheDisabled(cacheDisabled: Boolean) {
            cdkBuilder.cacheDisabled(cacheDisabled)
        }

        /**
         * Cache from options to pass to the `docker build` command.
         *
         * Default: - no cache from options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheFrom Cache from options to pass to the `docker build` command.
         */
        override fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
            cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption::unwrap))
        }

        /**
         * Cache from options to pass to the `docker build` command.
         *
         * Default: - no cache from options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheFrom Cache from options to pass to the `docker build` command.
         */
        override fun cacheFrom(vararg cacheFrom: DockerCacheOption): Unit =
            cacheFrom(cacheFrom.toList())

        /**
         * Cache to options to pass to the `docker build` command.
         *
         * Default: - no cache to options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheTo Cache to options to pass to the `docker build` command.
         */
        override fun cacheTo(cacheTo: DockerCacheOption) {
            cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption::unwrap))
        }

        /**
         * Cache to options to pass to the `docker build` command.
         *
         * Default: - no cache to options are passed to the build command
         *
         * [Documentation](https://docs.docker.com/build/cache/backends/)
         *
         * @param cacheTo Cache to options to pass to the `docker build` command.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3dbd4b2abcd3ab31ce315d550cfbf46c6067f6871850d113e1366ca33f1b6cdf")
        override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
            cacheTo(DockerCacheOption(cacheTo))

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
         * Path to the Dockerfile (relative to the directory).
         *
         * Default: 'Dockerfile'
         *
         * @param file Path to the Dockerfile (relative to the directory).
         */
        override fun `file`(`file`: String) {
            cdkBuilder.`file`(`file`)
        }

        /**
         * A strategy for how to handle symlinks.
         *
         * Default: SymlinkFollowMode.NEVER
         *
         * @param followSymlinks A strategy for how to handle symlinks.
         */
        override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
            cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
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
         * Options to control which parameters are used to invalidate the asset hash.
         *
         * Default: - hash all parameters
         *
         * @param invalidation Options to control which parameters are used to invalidate the asset
         *   hash.
         */
        override fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
            cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions::unwrap))
        }

        /**
         * Options to control which parameters are used to invalidate the asset hash.
         *
         * Default: - hash all parameters
         *
         * @param invalidation Options to control which parameters are used to invalidate the asset
         *   hash.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("090b76bf3c87e88959d892da084be4ad746eb80512f3699f5ec4d70033e2578e")
        override fun invalidation(
            invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit
        ): Unit = invalidation(DockerImageAssetInvalidationOptions(invalidation))

        /**
         * Networking mode for the RUN commands during build.
         *
         * Support docker API 1.25+.
         *
         * Default: - no networking mode specified (the default networking mode
         * `NetworkMode.DEFAULT` will be used)
         *
         * @param networkMode Networking mode for the RUN commands during build.
         */
        override fun networkMode(networkMode: NetworkMode) {
            cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
        }

        /**
         * Outputs to pass to the `docker build` command.
         *
         * Default: - no outputs are passed to the build command (default outputs are used)
         *
         * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
         *
         * @param outputs Outputs to pass to the `docker build` command.
         */
        override fun outputs(outputs: List<String>) {
            cdkBuilder.outputs(outputs)
        }

        /**
         * Outputs to pass to the `docker build` command.
         *
         * Default: - no outputs are passed to the build command (default outputs are used)
         *
         * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
         *
         * @param outputs Outputs to pass to the `docker build` command.
         */
        override fun outputs(vararg outputs: String): Unit = outputs(outputs.toList())

        /**
         * Platform to build for.
         *
         * *Requires Docker Buildx*.
         *
         * Default: - no platform specified (the current machine architecture will be used)
         *
         * @param platform Platform to build for.
         */
        override fun platform(platform: Platform) {
            cdkBuilder.platform(platform.let(Platform::unwrap))
        }

        /**
         * Docker target to build to.
         *
         * Default: - no target
         *
         * @param target Docker target to build to.
         */
        override fun target(target: String) {
            cdkBuilder.target(target)
        }

        public fun build(): software.amazon.awscdk.services.ecs.AssetImage = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(directory: String, block: Builder.() -> Unit = {}): AssetImage {
            val builderImpl = BuilderImpl(directory)
            return AssetImage(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AssetImage): AssetImage =
            AssetImage(cdkObject)

        internal fun unwrap(wrapped: AssetImage): software.amazon.awscdk.services.ecs.AssetImage =
            wrapped.cdkObject
    }
}
