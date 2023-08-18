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

package io.cloudshiftdev.awscdkdsl.services.lambda.nodejs

import io.cloudshiftdev.awscdkdsl.DockerVolumeDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.BundlingFileAccess
import software.amazon.awscdk.DockerImage
import software.amazon.awscdk.DockerVolume
import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions
import software.amazon.awscdk.services.lambda.nodejs.Charset
import software.amazon.awscdk.services.lambda.nodejs.ICommandHooks
import software.amazon.awscdk.services.lambda.nodejs.LogLevel
import software.amazon.awscdk.services.lambda.nodejs.OutputFormat
import software.amazon.awscdk.services.lambda.nodejs.SourceMapMode

/**
 * Bundling options.
 *
 * Example:
 * ```
 * NodejsFunction.Builder.create(this, "my-handler")
 * .bundling(BundlingOptions.builder()
 * .dockerImage(DockerImage.fromBuild("/path/to/Dockerfile"))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class BundlingOptionsDsl {
    private val cdkBuilder: BundlingOptions.Builder = BundlingOptions.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _entrypoint: MutableList<String> = mutableListOf()

    private val _externalModules: MutableList<String> = mutableListOf()

    private val _inject: MutableList<String> = mutableListOf()

    private val _mainFields: MutableList<String> = mutableListOf()

    private val _nodeModules: MutableList<String> = mutableListOf()

    private val _volumes: MutableList<DockerVolume> = mutableListOf()

    private val _volumesFrom: MutableList<String> = mutableListOf()

    /**
     * @param assetHash Specify a custom hash for this asset. For consistency, this custom hash will
     *   be SHA256 hashed and encoded as hex. The resulting hash will be the asset hash.
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
     * @param banner Use this to insert an arbitrary string at the beginning of generated JavaScript
     *   files. This is similar to footer which inserts at the end instead of the beginning.
     *
     * This is commonly used to insert comments:
     */
    public fun banner(banner: String) {
        cdkBuilder.banner(banner)
    }

    /** @param buildArgs Build arguments to pass when building the bundling image. */
    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    /**
     * @param bundlingFileAccess Which option to use to copy the source files to the docker
     *   container and output files back.
     */
    public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
        cdkBuilder.bundlingFileAccess(bundlingFileAccess)
    }

    /**
     * @param charset The charset to use for esbuild's output. By default esbuild's output is
     *   ASCII-only. Any non-ASCII characters are escaped using backslash escape sequences. Using
     *   escape sequences makes the generated output slightly bigger, and also makes it harder to
     *   read. If you would like for esbuild to print the original characters without using escape
     *   sequences, use `Charset.UTF8`.
     */
    public fun charset(charset: Charset) {
        cdkBuilder.charset(charset)
    }

    /** @param command The command to run in the container. */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /** @param command The command to run in the container. */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /** @param commandHooks Command hooks. */
    public fun commandHooks(commandHooks: ICommandHooks) {
        cdkBuilder.commandHooks(commandHooks)
    }

    /**
     * @param define Replace global identifiers with constant expressions. For example, `{
     *   'process.env.DEBUG': 'true' }`.
     *
     * Another example, `{ 'process.env.API_KEY': JSON.stringify('xxx-xxxx-xxx') }`.
     */
    public fun define(define: Map<String, String>) {
        cdkBuilder.define(define)
    }

    /**
     * @param dockerImage A custom bundling Docker image. This image should have esbuild installed
     *   globally. If you plan to use `nodeModules` it should also have `npm`, `yarn` or `pnpm`
     *   depending on the lock file you're using.
     *
     * See
     * https://github.com/aws/aws-cdk/blob/main/packages/aws-cdk-lib/aws-lambda-nodejs/lib/Dockerfile
     * for the default image provided by aws-cdk-lib/aws-lambda-nodejs.
     */
    public fun dockerImage(dockerImage: DockerImage) {
        cdkBuilder.dockerImage(dockerImage)
    }

    /** @param entrypoint The entrypoint to run in the container. */
    public fun entrypoint(vararg entrypoint: String) {
        _entrypoint.addAll(listOf(*entrypoint))
    }

    /** @param entrypoint The entrypoint to run in the container. */
    public fun entrypoint(entrypoint: Collection<String>) {
        _entrypoint.addAll(entrypoint)
    }

    /** @param environment The environment variables to pass to the container. */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param esbuildArgs Build arguments to pass into esbuild. For example, to add the
     *   [--log-limit](https://esbuild.github.io/api/#log-limit) flag:
     * ```
     * new NodejsFunction(scope, id, {
     * ...
     * bundling: {
     * esbuildArgs: {
     * "--log-limit": "0",
     * }
     * }
     * });
     * ```
     */
    public fun esbuildArgs(esbuildArgs: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(esbuildArgs)
        cdkBuilder.esbuildArgs(builder.map)
    }

    /**
     * @param esbuildArgs Build arguments to pass into esbuild. For example, to add the
     *   [--log-limit](https://esbuild.github.io/api/#log-limit) flag:
     * ```
     * new NodejsFunction(scope, id, {
     * ...
     * bundling: {
     * esbuildArgs: {
     * "--log-limit": "0",
     * }
     * }
     * });
     * ```
     */
    public fun esbuildArgs(esbuildArgs: Map<String, Any>) {
        cdkBuilder.esbuildArgs(esbuildArgs)
    }

    /** @param esbuildVersion The version of esbuild to use when running in a Docker container. */
    public fun esbuildVersion(esbuildVersion: String) {
        cdkBuilder.esbuildVersion(esbuildVersion)
    }

    /**
     * @param externalModules A list of modules that should be considered as externals (already
     *   available in the runtime).
     */
    public fun externalModules(vararg externalModules: String) {
        _externalModules.addAll(listOf(*externalModules))
    }

    /**
     * @param externalModules A list of modules that should be considered as externals (already
     *   available in the runtime).
     */
    public fun externalModules(externalModules: Collection<String>) {
        _externalModules.addAll(externalModules)
    }

    /**
     * @param footer Use this to insert an arbitrary string at the end of generated JavaScript
     *   files. This is similar to banner which inserts at the beginning instead of the end.
     *
     * This is commonly used to insert comments
     */
    public fun footer(footer: String) {
        cdkBuilder.footer(footer)
    }

    /**
     * @param forceDockerBundling Force bundling in a Docker container even if local bundling is
     *   possible. This is useful if your function relies on node modules that should be installed
     *   (`nodeModules`) in a Lambda compatible environment.
     */
    public fun forceDockerBundling(forceDockerBundling: Boolean) {
        cdkBuilder.forceDockerBundling(forceDockerBundling)
    }

    /** @param format Output format for the generated JavaScript files. */
    public fun format(format: OutputFormat) {
        cdkBuilder.format(format)
    }

    /**
     * @param inject This option allows you to automatically replace a global variable with an
     *   import from another file.
     */
    public fun inject(vararg inject: String) {
        _inject.addAll(listOf(*inject))
    }

    /**
     * @param inject This option allows you to automatically replace a global variable with an
     *   import from another file.
     */
    public fun inject(inject: Collection<String>) {
        _inject.addAll(inject)
    }

    /**
     * @param keepNames Whether to preserve the original `name` values even in minified code. In
     *   JavaScript the `name` property on functions and classes defaults to a nearby identifier in
     *   the source code.
     *
     * However, minification renames symbols to reduce code size and bundling sometimes need to
     * rename symbols to avoid collisions. That changes value of the `name` property for many of
     * these cases. This is usually fine because the `name` property is normally only used for
     * debugging. However, some frameworks rely on the `name` property for registration and binding
     * purposes. If this is the case, you can enable this option to preserve the original `name`
     * values even in minified code.
     */
    public fun keepNames(keepNames: Boolean) {
        cdkBuilder.keepNames(keepNames)
    }

    /**
     * @param loader Use loaders to change how a given input file is interpreted. Configuring a
     *   loader for a given file type lets you load that file type with an `import` statement or a
     *   `require` call.
     *
     * For example, `{ '.png': 'dataurl' }`.
     */
    public fun loader(loader: Map<String, String>) {
        cdkBuilder.loader(loader)
    }

    /**
     * @param logLevel Log level for esbuild. This is also propagated to the package manager and
     *   applies to its specific install command.
     */
    public fun logLevel(logLevel: LogLevel) {
        cdkBuilder.logLevel(logLevel)
    }

    /**
     * @param mainFields How to determine the entry point for modules. Try ['module', 'main'] to
     *   default to ES module versions.
     */
    public fun mainFields(vararg mainFields: String) {
        _mainFields.addAll(listOf(*mainFields))
    }

    /**
     * @param mainFields How to determine the entry point for modules. Try ['module', 'main'] to
     *   default to ES module versions.
     */
    public fun mainFields(mainFields: Collection<String>) {
        _mainFields.addAll(mainFields)
    }

    /**
     * @param metafile This option tells esbuild to write out a JSON file relative to output
     *   directory with metadata about the build. The metadata in this JSON file follows this schema
     *   (specified using TypeScript syntax):
     * ```
     * {
     * outputs: {
     * [path: string]: {
     * bytes: number
     * inputs: {
     * [path: string]: { bytesInOutput: number }
     * }
     * imports: { path: string }[]
     * exports: string[]
     * }
     * }
     * }
     * ```
     *
     * This data can then be analyzed by other tools. For example, bundle buddy can consume
     * esbuild's metadata format and generates a treemap visualization of the modules in your bundle
     * and how much space each one takes up.
     */
    public fun metafile(metafile: Boolean) {
        cdkBuilder.metafile(metafile)
    }

    /** @param minify Whether to minify files when bundling. */
    public fun minify(minify: Boolean) {
        cdkBuilder.minify(minify)
    }

    /**
     * @param network Docker
     *   [Networking options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     */
    public fun network(network: String) {
        cdkBuilder.network(network)
    }

    /**
     * @param nodeModules A list of modules that should be installed instead of bundled. Modules are
     *   installed in a Lambda compatible environment only when bundling runs in Docker.
     */
    public fun nodeModules(vararg nodeModules: String) {
        _nodeModules.addAll(listOf(*nodeModules))
    }

    /**
     * @param nodeModules A list of modules that should be installed instead of bundled. Modules are
     *   installed in a Lambda compatible environment only when bundling runs in Docker.
     */
    public fun nodeModules(nodeModules: Collection<String>) {
        _nodeModules.addAll(nodeModules)
    }

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     *   v1.38+*. Example value: `linux/amd64`
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * @param preCompilation Run compilation using tsc before running file through bundling step.
     *   This usually is not required unless you are using new experimental features that are only
     *   supported by typescript's `tsc` compiler. One example of such feature is
     *   `emitDecoratorMetadata`.
     */
    public fun preCompilation(preCompilation: Boolean) {
        cdkBuilder.preCompilation(preCompilation)
    }

    /**
     * @param securityOpt
     *   [Security configuration](https://docs.docker.com/engine/reference/run/#security-configuration)
     *   when running the docker container.
     */
    public fun securityOpt(securityOpt: String) {
        cdkBuilder.securityOpt(securityOpt)
    }

    /** @param sourceMap Whether to include source maps when bundling. */
    public fun sourceMap(sourceMap: Boolean) {
        cdkBuilder.sourceMap(sourceMap)
    }

    /** @param sourceMapMode Source map mode to be used when bundling. */
    public fun sourceMapMode(sourceMapMode: SourceMapMode) {
        cdkBuilder.sourceMapMode(sourceMapMode)
    }

    /**
     * @param sourcesContent Whether to include original source code in source maps when bundling.
     */
    public fun sourcesContent(sourcesContent: Boolean) {
        cdkBuilder.sourcesContent(sourcesContent)
    }

    /** @param target Target environment for the generated JavaScript code. */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    /**
     * @param tsconfig Normally the esbuild automatically discovers `tsconfig.json` files and reads
     *   their contents during a build. However, you can also configure a custom `tsconfig.json`
     *   file to use instead.
     *
     * This is similar to entry path, you need to provide path to your custom `tsconfig.json`.
     *
     * This can be useful if you need to do multiple builds of the same code with different
     * settings.
     *
     * For example, `{ 'tsconfig': 'path/custom.tsconfig.json' }`.
     */
    public fun tsconfig(tsconfig: String) {
        cdkBuilder.tsconfig(tsconfig)
    }

    /** @param user The user to use when running the container. */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    /** @param volumes Docker volumes to mount. */
    public fun volumes(volumes: DockerVolumeDsl.() -> Unit) {
        _volumes.add(DockerVolumeDsl().apply(volumes).build())
    }

    /** @param volumes Docker volumes to mount. */
    public fun volumes(volumes: Collection<DockerVolume>) {
        _volumes.addAll(volumes)
    }

    /** @param volumesFrom Where to mount the specified volumes from. */
    public fun volumesFrom(vararg volumesFrom: String) {
        _volumesFrom.addAll(listOf(*volumesFrom))
    }

    /** @param volumesFrom Where to mount the specified volumes from. */
    public fun volumesFrom(volumesFrom: Collection<String>) {
        _volumesFrom.addAll(volumesFrom)
    }

    /** @param workingDirectory Working directory inside the container. */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): BundlingOptions {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
        if (_externalModules.isNotEmpty()) cdkBuilder.externalModules(_externalModules)
        if (_inject.isNotEmpty()) cdkBuilder.inject(_inject)
        if (_mainFields.isNotEmpty()) cdkBuilder.mainFields(_mainFields)
        if (_nodeModules.isNotEmpty()) cdkBuilder.nodeModules(_nodeModules)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        if (_volumesFrom.isNotEmpty()) cdkBuilder.volumesFrom(_volumesFrom)
        return cdkBuilder.build()
    }
}
