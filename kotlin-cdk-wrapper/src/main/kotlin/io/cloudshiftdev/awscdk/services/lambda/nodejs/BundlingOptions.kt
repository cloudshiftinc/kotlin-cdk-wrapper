@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.nodejs

import io.cloudshiftdev.awscdk.BundlingFileAccess
import io.cloudshiftdev.awscdk.DockerImage
import io.cloudshiftdev.awscdk.DockerRunOptions
import io.cloudshiftdev.awscdk.DockerVolume
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Bundling options.
 *
 * Example:
 *
 * ```
 * NodejsFunction.Builder.create(this, "my-handler")
 * .bundling(BundlingOptions.builder()
 * .dockerImage(DockerImage.fromBuild("/path/to/Dockerfile"))
 * .build())
 * .build();
 * ```
 */
public interface BundlingOptions : DockerRunOptions {
  /**
   * Specify a custom hash for this asset.
   *
   * For consistency, this custom hash will
   * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
   * hash.
   *
   * NOTE: the hash is used in order to identify a specific revision of the asset, and
   * used for optimizing and caching deployment activities related to this asset such as
   * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
   * need to make sure it is updated every time the asset changes, or otherwise it is
   * possible that some deployments will not be invalidated.
   *
   * Default: - asset hash is calculated based on the bundled output
   */
  public fun assetHash(): String? = unwrap(this).getAssetHash()

  /**
   * Use this to insert an arbitrary string at the beginning of generated JavaScript files.
   *
   * This is similar to footer which inserts at the end instead of the beginning.
   *
   * This is commonly used to insert comments:
   *
   * Default: - no comments are passed
   */
  public fun banner(): String? = unwrap(this).getBanner()

  /**
   * Build arguments to pass when building the bundling image.
   *
   * Default: - no build arguments are passed
   */
  public fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

  /**
   * Includes AWS SDK in the bundle asset.
   *
   * Default: - false
   * if `true` the `aws-sdk` will be included in the asset bundle and not be
   * resolved to the Lambda provided sdk.
   */
  public fun bundleAwsSdk(): Boolean? = unwrap(this).getBundleAwsSDK()

  /**
   * Which option to use to copy the source files to the docker container and output files back.
   *
   * Default: - BundlingFileAccess.BIND_MOUNT
   */
  public fun bundlingFileAccess(): BundlingFileAccess? =
      unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

  /**
   * The charset to use for esbuild's output.
   *
   * By default esbuild's output is ASCII-only. Any non-ASCII characters are escaped
   * using backslash escape sequences. Using escape sequences makes the generated output
   * slightly bigger, and also makes it harder to read. If you would like for esbuild to print
   * the original characters without using escape sequences, use `Charset.UTF8`.
   *
   * Default: Charset.ASCII
   *
   * [Documentation](https://esbuild.github.io/api/#charset)
   */
  public fun charset(): Charset? = unwrap(this).getCharset()?.let(Charset::wrap)

  /**
   * Command hooks.
   *
   * Default: - do not run additional commands
   */
  public fun commandHooks(): ICommandHooks? =
      unwrap(this).getCommandHooks()?.let(ICommandHooks::wrap)

  /**
   * Replace global identifiers with constant expressions.
   *
   * For example, `{ 'process.env.DEBUG': 'true' }`.
   *
   * Another example, `{ 'process.env.API_KEY': JSON.stringify('xxx-xxxx-xxx') }`.
   *
   * Default: - no replacements are made
   */
  public fun define(): Map<String, String> = unwrap(this).getDefine() ?: emptyMap()

  /**
   * A custom bundling Docker image.
   *
   * This image should have esbuild installed globally. If you plan to use `nodeModules`
   * it should also have `npm`, `yarn` or `pnpm` depending on the lock file you're using.
   *
   * See
   * https://github.com/aws/aws-cdk/blob/main/packages/aws-cdk-lib/aws-lambda-nodejs/lib/Dockerfile
   * for the default image provided by aws-cdk-lib/aws-lambda-nodejs.
   *
   * Default: - use the Docker image provided by aws-cdk-lib/aws-lambda-nodejs
   */
  public fun dockerImage(): DockerImage? = unwrap(this).getDockerImage()?.let(DockerImage::wrap)

  /**
   * Build arguments to pass into esbuild.
   *
   * For example, to add the [--log-limit](https://esbuild.github.io/api/#log-limit) flag:
   *
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
   *
   * Default: - no additional esbuild arguments are passed
   */
  public fun esbuildArgs(): Map<String, Any> = unwrap(this).getEsbuildArgs() ?: emptyMap()

  /**
   * The version of esbuild to use when running in a Docker container.
   *
   * Default: - latest v0
   */
  public fun esbuildVersion(): String? = unwrap(this).getEsbuildVersion()

  /**
   * A list of modules that should be considered as externals (already available in the runtime).
   *
   * Default: - no replacements are made
   */
  public fun externalModules(): List<String> = unwrap(this).getExternalModules() ?: emptyList()

  /**
   * Use this to insert an arbitrary string at the end of generated JavaScript files.
   *
   * This is similar to banner which inserts at the beginning instead of the end.
   *
   * This is commonly used to insert comments
   *
   * Default: - no comments are passed
   */
  public fun footer(): String? = unwrap(this).getFooter()

  /**
   * Force bundling in a Docker container even if local bundling is possible.
   *
   * This is useful if your function relies on node modules
   * that should be installed (`nodeModules`) in a Lambda compatible
   * environment.
   *
   * Default: false
   */
  public fun forceDockerBundling(): Boolean? = unwrap(this).getForceDockerBundling()

  /**
   * Output format for the generated JavaScript files.
   *
   * Default: OutputFormat.CJS
   */
  public fun format(): OutputFormat? = unwrap(this).getFormat()?.let(OutputFormat::wrap)

  /**
   * This option allows you to automatically replace a global variable with an import from another
   * file.
   *
   * Default: - no code is injected
   *
   * [Documentation](https://esbuild.github.io/api/#inject)
   */
  public fun inject(): List<String> = unwrap(this).getInject() ?: emptyList()

  /**
   * Whether to preserve the original `name` values even in minified code.
   *
   * In JavaScript the `name` property on functions and classes defaults to a
   * nearby identifier in the source code.
   *
   * However, minification renames symbols to reduce code size and bundling
   * sometimes need to rename symbols to avoid collisions. That changes value of
   * the `name` property for many of these cases. This is usually fine because
   * the `name` property is normally only used for debugging. However, some
   * frameworks rely on the `name` property for registration and binding purposes.
   * If this is the case, you can enable this option to preserve the original
   * `name` values even in minified code.
   *
   * Default: false
   */
  public fun keepNames(): Boolean? = unwrap(this).getKeepNames()

  /**
   * Use loaders to change how a given input file is interpreted.
   *
   * Configuring a loader for a given file type lets you load that file type with
   * an `import` statement or a `require` call.
   *
   * For example, `{ '.png': 'dataurl' }`.
   *
   * Default: - use esbuild default loaders
   *
   * [Documentation](https://esbuild.github.io/api/#loader)
   */
  public fun loader(): Map<String, String> = unwrap(this).getLoader() ?: emptyMap()

  /**
   * Log level for esbuild.
   *
   * This is also propagated to the package manager and
   * applies to its specific install command.
   *
   * Default: LogLevel.WARNING
   */
  public fun logLevel(): LogLevel? = unwrap(this).getLogLevel()?.let(LogLevel::wrap)

  /**
   * How to determine the entry point for modules.
   *
   * Try ['module', 'main'] to default to ES module versions.
   *
   * Default: []
   */
  public fun mainFields(): List<String> = unwrap(this).getMainFields() ?: emptyList()

  /**
   * This option tells esbuild to write out a JSON file relative to output directory with metadata
   * about the build.
   *
   * The metadata in this JSON file follows this schema (specified using TypeScript syntax):
   *
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
   * This data can then be analyzed by other tools. For example,
   * bundle buddy can consume esbuild's metadata format and generates a treemap visualization
   * of the modules in your bundle and how much space each one takes up.
   *
   * Default: false
   *
   * [Documentation](https://esbuild.github.io/api/#metafile)
   */
  public fun metafile(): Boolean? = unwrap(this).getMetafile()

  /**
   * Whether to minify files when bundling.
   *
   * Default: false
   */
  public fun minify(): Boolean? = unwrap(this).getMinify()

  /**
   * A list of modules that should be installed instead of bundled.
   *
   * Modules are
   * installed in a Lambda compatible environment only when bundling runs in
   * Docker.
   *
   * Default: - all modules are bundled
   */
  public fun nodeModules(): List<String> = unwrap(this).getNodeModules() ?: emptyList()

  /**
   * Run compilation using tsc before running file through bundling step.
   *
   * This usually is not required unless you are using new experimental features that
   * are only supported by typescript's `tsc` compiler.
   * One example of such feature is `emitDecoratorMetadata`.
   *
   * Default: false
   */
  public fun preCompilation(): Boolean? = unwrap(this).getPreCompilation()

  /**
   * Whether to include source maps when bundling.
   *
   * Default: false
   */
  public fun sourceMap(): Boolean? = unwrap(this).getSourceMap()

  /**
   * Source map mode to be used when bundling.
   *
   * Default: SourceMapMode.DEFAULT
   *
   * [Documentation](https://esbuild.github.io/api/#sourcemap)
   */
  public fun sourceMapMode(): SourceMapMode? =
      unwrap(this).getSourceMapMode()?.let(SourceMapMode::wrap)

  /**
   * Whether to include original source code in source maps when bundling.
   *
   * Default: true
   *
   * [Documentation](https://esbuild.github.io/api/#sources-content)
   */
  public fun sourcesContent(): Boolean? = unwrap(this).getSourcesContent()

  /**
   * Target environment for the generated JavaScript code.
   *
   * Default: - the node version of the runtime
   *
   * [Documentation](https://esbuild.github.io/api/#target)
   */
  public fun target(): String? = unwrap(this).getTarget()

  /**
   * Normally the esbuild automatically discovers `tsconfig.json` files and reads their contents
   * during a build.
   *
   * However, you can also configure a custom `tsconfig.json` file to use instead.
   *
   * This is similar to entry path, you need to provide path to your custom `tsconfig.json`.
   *
   * This can be useful if you need to do multiple builds of the same code with different settings.
   *
   * For example, `{ 'tsconfig': 'path/custom.tsconfig.json' }`.
   *
   * Default: - automatically discovered by `esbuild`
   */
  public fun tsconfig(): String? = unwrap(this).getTsconfig()

  /**
   * A builder for [BundlingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetHash Specify a custom hash for this asset.
     * For consistency, this custom hash will
     * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and
     * used for optimizing and caching deployment activities related to this asset such as
     * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
     * need to make sure it is updated every time the asset changes, or otherwise it is
     * possible that some deployments will not be invalidated.
     */
    public fun assetHash(assetHash: String)

    /**
     * @param banner Use this to insert an arbitrary string at the beginning of generated JavaScript
     * files.
     * This is similar to footer which inserts at the end instead of the beginning.
     *
     * This is commonly used to insert comments:
     */
    public fun banner(banner: String)

    /**
     * @param buildArgs Build arguments to pass when building the bundling image.
     */
    public fun buildArgs(buildArgs: Map<String, String>)

    /**
     * @param bundleAwsSdk Includes AWS SDK in the bundle asset.
     */
    public fun bundleAwsSdk(bundleAwsSdk: Boolean)

    /**
     * @param bundlingFileAccess Which option to use to copy the source files to the docker
     * container and output files back.
     */
    public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess)

    /**
     * @param charset The charset to use for esbuild's output.
     * By default esbuild's output is ASCII-only. Any non-ASCII characters are escaped
     * using backslash escape sequences. Using escape sequences makes the generated output
     * slightly bigger, and also makes it harder to read. If you would like for esbuild to print
     * the original characters without using escape sequences, use `Charset.UTF8`.
     */
    public fun charset(charset: Charset)

    /**
     * @param command The command to run in the container.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command to run in the container.
     */
    public fun command(vararg command: String)

    /**
     * @param commandHooks Command hooks.
     */
    public fun commandHooks(commandHooks: ICommandHooks)

    /**
     * @param define Replace global identifiers with constant expressions.
     * For example, `{ 'process.env.DEBUG': 'true' }`.
     *
     * Another example, `{ 'process.env.API_KEY': JSON.stringify('xxx-xxxx-xxx') }`.
     */
    public fun define(define: Map<String, String>)

    /**
     * @param dockerImage A custom bundling Docker image.
     * This image should have esbuild installed globally. If you plan to use `nodeModules`
     * it should also have `npm`, `yarn` or `pnpm` depending on the lock file you're using.
     *
     * See
     * https://github.com/aws/aws-cdk/blob/main/packages/aws-cdk-lib/aws-lambda-nodejs/lib/Dockerfile
     * for the default image provided by aws-cdk-lib/aws-lambda-nodejs.
     */
    public fun dockerImage(dockerImage: DockerImage)

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    public fun entrypoint(entrypoint: List<String>)

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    public fun entrypoint(vararg entrypoint: String)

    /**
     * @param environment The environment variables to pass to the container.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param esbuildArgs Build arguments to pass into esbuild.
     * For example, to add the [--log-limit](https://esbuild.github.io/api/#log-limit) flag:
     *
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
    public fun esbuildArgs(esbuildArgs: Map<String, Any>)

    /**
     * @param esbuildVersion The version of esbuild to use when running in a Docker container.
     */
    public fun esbuildVersion(esbuildVersion: String)

    /**
     * @param externalModules A list of modules that should be considered as externals (already
     * available in the runtime).
     */
    public fun externalModules(externalModules: List<String>)

    /**
     * @param externalModules A list of modules that should be considered as externals (already
     * available in the runtime).
     */
    public fun externalModules(vararg externalModules: String)

    /**
     * @param footer Use this to insert an arbitrary string at the end of generated JavaScript
     * files.
     * This is similar to banner which inserts at the beginning instead of the end.
     *
     * This is commonly used to insert comments
     */
    public fun footer(footer: String)

    /**
     * @param forceDockerBundling Force bundling in a Docker container even if local bundling is
     * possible.
     * This is useful if your function relies on node modules
     * that should be installed (`nodeModules`) in a Lambda compatible
     * environment.
     */
    public fun forceDockerBundling(forceDockerBundling: Boolean)

    /**
     * @param format Output format for the generated JavaScript files.
     */
    public fun format(format: OutputFormat)

    /**
     * @param inject This option allows you to automatically replace a global variable with an
     * import from another file.
     */
    public fun inject(inject: List<String>)

    /**
     * @param inject This option allows you to automatically replace a global variable with an
     * import from another file.
     */
    public fun inject(vararg inject: String)

    /**
     * @param keepNames Whether to preserve the original `name` values even in minified code.
     * In JavaScript the `name` property on functions and classes defaults to a
     * nearby identifier in the source code.
     *
     * However, minification renames symbols to reduce code size and bundling
     * sometimes need to rename symbols to avoid collisions. That changes value of
     * the `name` property for many of these cases. This is usually fine because
     * the `name` property is normally only used for debugging. However, some
     * frameworks rely on the `name` property for registration and binding purposes.
     * If this is the case, you can enable this option to preserve the original
     * `name` values even in minified code.
     */
    public fun keepNames(keepNames: Boolean)

    /**
     * @param loader Use loaders to change how a given input file is interpreted.
     * Configuring a loader for a given file type lets you load that file type with
     * an `import` statement or a `require` call.
     *
     * For example, `{ '.png': 'dataurl' }`.
     */
    public fun loader(loader: Map<String, String>)

    /**
     * @param logLevel Log level for esbuild.
     * This is also propagated to the package manager and
     * applies to its specific install command.
     */
    public fun logLevel(logLevel: LogLevel)

    /**
     * @param mainFields How to determine the entry point for modules.
     * Try ['module', 'main'] to default to ES module versions.
     */
    public fun mainFields(mainFields: List<String>)

    /**
     * @param mainFields How to determine the entry point for modules.
     * Try ['module', 'main'] to default to ES module versions.
     */
    public fun mainFields(vararg mainFields: String)

    /**
     * @param metafile This option tells esbuild to write out a JSON file relative to output
     * directory with metadata about the build.
     * The metadata in this JSON file follows this schema (specified using TypeScript syntax):
     *
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
     * This data can then be analyzed by other tools. For example,
     * bundle buddy can consume esbuild's metadata format and generates a treemap visualization
     * of the modules in your bundle and how much space each one takes up.
     */
    public fun metafile(metafile: Boolean)

    /**
     * @param minify Whether to minify files when bundling.
     */
    public fun minify(minify: Boolean)

    /**
     * @param network Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     */
    public fun network(network: String)

    /**
     * @param nodeModules A list of modules that should be installed instead of bundled.
     * Modules are
     * installed in a Lambda compatible environment only when bundling runs in
     * Docker.
     */
    public fun nodeModules(nodeModules: List<String>)

    /**
     * @param nodeModules A list of modules that should be installed instead of bundled.
     * Modules are
     * installed in a Lambda compatible environment only when bundling runs in
     * Docker.
     */
    public fun nodeModules(vararg nodeModules: String)

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     * v1.38+*.
     * Example value: `linux/amd64`
     */
    public fun platform(platform: String)

    /**
     * @param preCompilation Run compilation using tsc before running file through bundling step.
     * This usually is not required unless you are using new experimental features that
     * are only supported by typescript's `tsc` compiler.
     * One example of such feature is `emitDecoratorMetadata`.
     */
    public fun preCompilation(preCompilation: Boolean)

    /**
     * @param securityOpt [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     */
    public fun securityOpt(securityOpt: String)

    /**
     * @param sourceMap Whether to include source maps when bundling.
     */
    public fun sourceMap(sourceMap: Boolean)

    /**
     * @param sourceMapMode Source map mode to be used when bundling.
     */
    public fun sourceMapMode(sourceMapMode: SourceMapMode)

    /**
     * @param sourcesContent Whether to include original source code in source maps when bundling.
     */
    public fun sourcesContent(sourcesContent: Boolean)

    /**
     * @param target Target environment for the generated JavaScript code.
     */
    public fun target(target: String)

    /**
     * @param tsconfig Normally the esbuild automatically discovers `tsconfig.json` files and reads
     * their contents during a build.
     * However, you can also configure a custom `tsconfig.json` file to use instead.
     *
     * This is similar to entry path, you need to provide path to your custom `tsconfig.json`.
     *
     * This can be useful if you need to do multiple builds of the same code with different
     * settings.
     *
     * For example, `{ 'tsconfig': 'path/custom.tsconfig.json' }`.
     */
    public fun tsconfig(tsconfig: String)

    /**
     * @param user The user to use when running the container.
     */
    public fun user(user: String)

    /**
     * @param volumes Docker volumes to mount.
     */
    public fun volumes(volumes: List<DockerVolume>)

    /**
     * @param volumes Docker volumes to mount.
     */
    public fun volumes(vararg volumes: DockerVolume)

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    public fun volumesFrom(volumesFrom: List<String>)

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    public fun volumesFrom(vararg volumesFrom: String)

    /**
     * @param workingDirectory Working directory inside the container.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.nodejs.BundlingOptions.Builder =
        software.amazon.awscdk.services.lambda.nodejs.BundlingOptions.builder()

    /**
     * @param assetHash Specify a custom hash for this asset.
     * For consistency, this custom hash will
     * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and
     * used for optimizing and caching deployment activities related to this asset such as
     * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
     * need to make sure it is updated every time the asset changes, or otherwise it is
     * possible that some deployments will not be invalidated.
     */
    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    /**
     * @param banner Use this to insert an arbitrary string at the beginning of generated JavaScript
     * files.
     * This is similar to footer which inserts at the end instead of the beginning.
     *
     * This is commonly used to insert comments:
     */
    override fun banner(banner: String) {
      cdkBuilder.banner(banner)
    }

    /**
     * @param buildArgs Build arguments to pass when building the bundling image.
     */
    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    /**
     * @param bundleAwsSdk Includes AWS SDK in the bundle asset.
     */
    override fun bundleAwsSdk(bundleAwsSdk: Boolean) {
      cdkBuilder.bundleAwsSdk(bundleAwsSdk)
    }

    /**
     * @param bundlingFileAccess Which option to use to copy the source files to the docker
     * container and output files back.
     */
    override fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
      cdkBuilder.bundlingFileAccess(bundlingFileAccess.let(BundlingFileAccess::unwrap))
    }

    /**
     * @param charset The charset to use for esbuild's output.
     * By default esbuild's output is ASCII-only. Any non-ASCII characters are escaped
     * using backslash escape sequences. Using escape sequences makes the generated output
     * slightly bigger, and also makes it harder to read. If you would like for esbuild to print
     * the original characters without using escape sequences, use `Charset.UTF8`.
     */
    override fun charset(charset: Charset) {
      cdkBuilder.charset(charset.let(Charset::unwrap))
    }

    /**
     * @param command The command to run in the container.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command to run in the container.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param commandHooks Command hooks.
     */
    override fun commandHooks(commandHooks: ICommandHooks) {
      cdkBuilder.commandHooks(commandHooks.let(ICommandHooks::unwrap))
    }

    /**
     * @param define Replace global identifiers with constant expressions.
     * For example, `{ 'process.env.DEBUG': 'true' }`.
     *
     * Another example, `{ 'process.env.API_KEY': JSON.stringify('xxx-xxxx-xxx') }`.
     */
    override fun define(define: Map<String, String>) {
      cdkBuilder.define(define)
    }

    /**
     * @param dockerImage A custom bundling Docker image.
     * This image should have esbuild installed globally. If you plan to use `nodeModules`
     * it should also have `npm`, `yarn` or `pnpm` depending on the lock file you're using.
     *
     * See
     * https://github.com/aws/aws-cdk/blob/main/packages/aws-cdk-lib/aws-lambda-nodejs/lib/Dockerfile
     * for the default image provided by aws-cdk-lib/aws-lambda-nodejs.
     */
    override fun dockerImage(dockerImage: DockerImage) {
      cdkBuilder.dockerImage(dockerImage.let(DockerImage::unwrap))
    }

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    /**
     * @param entrypoint The entrypoint to run in the container.
     */
    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    /**
     * @param environment The environment variables to pass to the container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param esbuildArgs Build arguments to pass into esbuild.
     * For example, to add the [--log-limit](https://esbuild.github.io/api/#log-limit) flag:
     *
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
    override fun esbuildArgs(esbuildArgs: Map<String, Any>) {
      cdkBuilder.esbuildArgs(esbuildArgs)
    }

    /**
     * @param esbuildVersion The version of esbuild to use when running in a Docker container.
     */
    override fun esbuildVersion(esbuildVersion: String) {
      cdkBuilder.esbuildVersion(esbuildVersion)
    }

    /**
     * @param externalModules A list of modules that should be considered as externals (already
     * available in the runtime).
     */
    override fun externalModules(externalModules: List<String>) {
      cdkBuilder.externalModules(externalModules)
    }

    /**
     * @param externalModules A list of modules that should be considered as externals (already
     * available in the runtime).
     */
    override fun externalModules(vararg externalModules: String): Unit =
        externalModules(externalModules.toList())

    /**
     * @param footer Use this to insert an arbitrary string at the end of generated JavaScript
     * files.
     * This is similar to banner which inserts at the beginning instead of the end.
     *
     * This is commonly used to insert comments
     */
    override fun footer(footer: String) {
      cdkBuilder.footer(footer)
    }

    /**
     * @param forceDockerBundling Force bundling in a Docker container even if local bundling is
     * possible.
     * This is useful if your function relies on node modules
     * that should be installed (`nodeModules`) in a Lambda compatible
     * environment.
     */
    override fun forceDockerBundling(forceDockerBundling: Boolean) {
      cdkBuilder.forceDockerBundling(forceDockerBundling)
    }

    /**
     * @param format Output format for the generated JavaScript files.
     */
    override fun format(format: OutputFormat) {
      cdkBuilder.format(format.let(OutputFormat::unwrap))
    }

    /**
     * @param inject This option allows you to automatically replace a global variable with an
     * import from another file.
     */
    override fun inject(inject: List<String>) {
      cdkBuilder.inject(inject)
    }

    /**
     * @param inject This option allows you to automatically replace a global variable with an
     * import from another file.
     */
    override fun inject(vararg inject: String): Unit = inject(inject.toList())

    /**
     * @param keepNames Whether to preserve the original `name` values even in minified code.
     * In JavaScript the `name` property on functions and classes defaults to a
     * nearby identifier in the source code.
     *
     * However, minification renames symbols to reduce code size and bundling
     * sometimes need to rename symbols to avoid collisions. That changes value of
     * the `name` property for many of these cases. This is usually fine because
     * the `name` property is normally only used for debugging. However, some
     * frameworks rely on the `name` property for registration and binding purposes.
     * If this is the case, you can enable this option to preserve the original
     * `name` values even in minified code.
     */
    override fun keepNames(keepNames: Boolean) {
      cdkBuilder.keepNames(keepNames)
    }

    /**
     * @param loader Use loaders to change how a given input file is interpreted.
     * Configuring a loader for a given file type lets you load that file type with
     * an `import` statement or a `require` call.
     *
     * For example, `{ '.png': 'dataurl' }`.
     */
    override fun loader(loader: Map<String, String>) {
      cdkBuilder.loader(loader)
    }

    /**
     * @param logLevel Log level for esbuild.
     * This is also propagated to the package manager and
     * applies to its specific install command.
     */
    override fun logLevel(logLevel: LogLevel) {
      cdkBuilder.logLevel(logLevel.let(LogLevel::unwrap))
    }

    /**
     * @param mainFields How to determine the entry point for modules.
     * Try ['module', 'main'] to default to ES module versions.
     */
    override fun mainFields(mainFields: List<String>) {
      cdkBuilder.mainFields(mainFields)
    }

    /**
     * @param mainFields How to determine the entry point for modules.
     * Try ['module', 'main'] to default to ES module versions.
     */
    override fun mainFields(vararg mainFields: String): Unit = mainFields(mainFields.toList())

    /**
     * @param metafile This option tells esbuild to write out a JSON file relative to output
     * directory with metadata about the build.
     * The metadata in this JSON file follows this schema (specified using TypeScript syntax):
     *
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
     * This data can then be analyzed by other tools. For example,
     * bundle buddy can consume esbuild's metadata format and generates a treemap visualization
     * of the modules in your bundle and how much space each one takes up.
     */
    override fun metafile(metafile: Boolean) {
      cdkBuilder.metafile(metafile)
    }

    /**
     * @param minify Whether to minify files when bundling.
     */
    override fun minify(minify: Boolean) {
      cdkBuilder.minify(minify)
    }

    /**
     * @param network Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     */
    override fun network(network: String) {
      cdkBuilder.network(network)
    }

    /**
     * @param nodeModules A list of modules that should be installed instead of bundled.
     * Modules are
     * installed in a Lambda compatible environment only when bundling runs in
     * Docker.
     */
    override fun nodeModules(nodeModules: List<String>) {
      cdkBuilder.nodeModules(nodeModules)
    }

    /**
     * @param nodeModules A list of modules that should be installed instead of bundled.
     * Modules are
     * installed in a Lambda compatible environment only when bundling runs in
     * Docker.
     */
    override fun nodeModules(vararg nodeModules: String): Unit = nodeModules(nodeModules.toList())

    /**
     * @param platform Set platform if server is multi-platform capable. *Requires Docker Engine API
     * v1.38+*.
     * Example value: `linux/amd64`
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param preCompilation Run compilation using tsc before running file through bundling step.
     * This usually is not required unless you are using new experimental features that
     * are only supported by typescript's `tsc` compiler.
     * One example of such feature is `emitDecoratorMetadata`.
     */
    override fun preCompilation(preCompilation: Boolean) {
      cdkBuilder.preCompilation(preCompilation)
    }

    /**
     * @param securityOpt [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     */
    override fun securityOpt(securityOpt: String) {
      cdkBuilder.securityOpt(securityOpt)
    }

    /**
     * @param sourceMap Whether to include source maps when bundling.
     */
    override fun sourceMap(sourceMap: Boolean) {
      cdkBuilder.sourceMap(sourceMap)
    }

    /**
     * @param sourceMapMode Source map mode to be used when bundling.
     */
    override fun sourceMapMode(sourceMapMode: SourceMapMode) {
      cdkBuilder.sourceMapMode(sourceMapMode.let(SourceMapMode::unwrap))
    }

    /**
     * @param sourcesContent Whether to include original source code in source maps when bundling.
     */
    override fun sourcesContent(sourcesContent: Boolean) {
      cdkBuilder.sourcesContent(sourcesContent)
    }

    /**
     * @param target Target environment for the generated JavaScript code.
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * @param tsconfig Normally the esbuild automatically discovers `tsconfig.json` files and reads
     * their contents during a build.
     * However, you can also configure a custom `tsconfig.json` file to use instead.
     *
     * This is similar to entry path, you need to provide path to your custom `tsconfig.json`.
     *
     * This can be useful if you need to do multiple builds of the same code with different
     * settings.
     *
     * For example, `{ 'tsconfig': 'path/custom.tsconfig.json' }`.
     */
    override fun tsconfig(tsconfig: String) {
      cdkBuilder.tsconfig(tsconfig)
    }

    /**
     * @param user The user to use when running the container.
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    /**
     * @param volumes Docker volumes to mount.
     */
    override fun volumes(volumes: List<DockerVolume>) {
      cdkBuilder.volumes(volumes.map(DockerVolume::unwrap))
    }

    /**
     * @param volumes Docker volumes to mount.
     */
    override fun volumes(vararg volumes: DockerVolume): Unit = volumes(volumes.toList())

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    override fun volumesFrom(volumesFrom: List<String>) {
      cdkBuilder.volumesFrom(volumesFrom)
    }

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    override fun volumesFrom(vararg volumesFrom: String): Unit = volumesFrom(volumesFrom.toList())

    /**
     * @param workingDirectory Working directory inside the container.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.nodejs.BundlingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.nodejs.BundlingOptions,
  ) : CdkObject(cdkObject), BundlingOptions {
    /**
     * Specify a custom hash for this asset.
     *
     * For consistency, this custom hash will
     * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and
     * used for optimizing and caching deployment activities related to this asset such as
     * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
     * need to make sure it is updated every time the asset changes, or otherwise it is
     * possible that some deployments will not be invalidated.
     *
     * Default: - asset hash is calculated based on the bundled output
     */
    override fun assetHash(): String? = unwrap(this).getAssetHash()

    /**
     * Use this to insert an arbitrary string at the beginning of generated JavaScript files.
     *
     * This is similar to footer which inserts at the end instead of the beginning.
     *
     * This is commonly used to insert comments:
     *
     * Default: - no comments are passed
     */
    override fun banner(): String? = unwrap(this).getBanner()

    /**
     * Build arguments to pass when building the bundling image.
     *
     * Default: - no build arguments are passed
     */
    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    /**
     * Includes AWS SDK in the bundle asset.
     *
     * Default: - false
     * if `true` the `aws-sdk` will be included in the asset bundle and not be
     * resolved to the Lambda provided sdk.
     */
    override fun bundleAwsSdk(): Boolean? = unwrap(this).getBundleAwsSDK()

    /**
     * Which option to use to copy the source files to the docker container and output files back.
     *
     * Default: - BundlingFileAccess.BIND_MOUNT
     */
    override fun bundlingFileAccess(): BundlingFileAccess? =
        unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

    /**
     * The charset to use for esbuild's output.
     *
     * By default esbuild's output is ASCII-only. Any non-ASCII characters are escaped
     * using backslash escape sequences. Using escape sequences makes the generated output
     * slightly bigger, and also makes it harder to read. If you would like for esbuild to print
     * the original characters without using escape sequences, use `Charset.UTF8`.
     *
     * Default: Charset.ASCII
     *
     * [Documentation](https://esbuild.github.io/api/#charset)
     */
    override fun charset(): Charset? = unwrap(this).getCharset()?.let(Charset::wrap)

    /**
     * The command to run in the container.
     *
     * Default: - run the command defined in the image
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * Command hooks.
     *
     * Default: - do not run additional commands
     */
    override fun commandHooks(): ICommandHooks? =
        unwrap(this).getCommandHooks()?.let(ICommandHooks::wrap)

    /**
     * Replace global identifiers with constant expressions.
     *
     * For example, `{ 'process.env.DEBUG': 'true' }`.
     *
     * Another example, `{ 'process.env.API_KEY': JSON.stringify('xxx-xxxx-xxx') }`.
     *
     * Default: - no replacements are made
     */
    override fun define(): Map<String, String> = unwrap(this).getDefine() ?: emptyMap()

    /**
     * A custom bundling Docker image.
     *
     * This image should have esbuild installed globally. If you plan to use `nodeModules`
     * it should also have `npm`, `yarn` or `pnpm` depending on the lock file you're using.
     *
     * See
     * https://github.com/aws/aws-cdk/blob/main/packages/aws-cdk-lib/aws-lambda-nodejs/lib/Dockerfile
     * for the default image provided by aws-cdk-lib/aws-lambda-nodejs.
     *
     * Default: - use the Docker image provided by aws-cdk-lib/aws-lambda-nodejs
     */
    override fun dockerImage(): DockerImage? = unwrap(this).getDockerImage()?.let(DockerImage::wrap)

    /**
     * The entrypoint to run in the container.
     *
     * Default: - run the entrypoint defined in the image
     */
    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    /**
     * The environment variables to pass to the container.
     *
     * Default: - no environment variables.
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * Build arguments to pass into esbuild.
     *
     * For example, to add the [--log-limit](https://esbuild.github.io/api/#log-limit) flag:
     *
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
     *
     * Default: - no additional esbuild arguments are passed
     */
    override fun esbuildArgs(): Map<String, Any> = unwrap(this).getEsbuildArgs() ?: emptyMap()

    /**
     * The version of esbuild to use when running in a Docker container.
     *
     * Default: - latest v0
     */
    override fun esbuildVersion(): String? = unwrap(this).getEsbuildVersion()

    /**
     * A list of modules that should be considered as externals (already available in the runtime).
     *
     * Default: - no replacements are made
     */
    override fun externalModules(): List<String> = unwrap(this).getExternalModules() ?: emptyList()

    /**
     * Use this to insert an arbitrary string at the end of generated JavaScript files.
     *
     * This is similar to banner which inserts at the beginning instead of the end.
     *
     * This is commonly used to insert comments
     *
     * Default: - no comments are passed
     */
    override fun footer(): String? = unwrap(this).getFooter()

    /**
     * Force bundling in a Docker container even if local bundling is possible.
     *
     * This is useful if your function relies on node modules
     * that should be installed (`nodeModules`) in a Lambda compatible
     * environment.
     *
     * Default: false
     */
    override fun forceDockerBundling(): Boolean? = unwrap(this).getForceDockerBundling()

    /**
     * Output format for the generated JavaScript files.
     *
     * Default: OutputFormat.CJS
     */
    override fun format(): OutputFormat? = unwrap(this).getFormat()?.let(OutputFormat::wrap)

    /**
     * This option allows you to automatically replace a global variable with an import from another
     * file.
     *
     * Default: - no code is injected
     *
     * [Documentation](https://esbuild.github.io/api/#inject)
     */
    override fun inject(): List<String> = unwrap(this).getInject() ?: emptyList()

    /**
     * Whether to preserve the original `name` values even in minified code.
     *
     * In JavaScript the `name` property on functions and classes defaults to a
     * nearby identifier in the source code.
     *
     * However, minification renames symbols to reduce code size and bundling
     * sometimes need to rename symbols to avoid collisions. That changes value of
     * the `name` property for many of these cases. This is usually fine because
     * the `name` property is normally only used for debugging. However, some
     * frameworks rely on the `name` property for registration and binding purposes.
     * If this is the case, you can enable this option to preserve the original
     * `name` values even in minified code.
     *
     * Default: false
     */
    override fun keepNames(): Boolean? = unwrap(this).getKeepNames()

    /**
     * Use loaders to change how a given input file is interpreted.
     *
     * Configuring a loader for a given file type lets you load that file type with
     * an `import` statement or a `require` call.
     *
     * For example, `{ '.png': 'dataurl' }`.
     *
     * Default: - use esbuild default loaders
     *
     * [Documentation](https://esbuild.github.io/api/#loader)
     */
    override fun loader(): Map<String, String> = unwrap(this).getLoader() ?: emptyMap()

    /**
     * Log level for esbuild.
     *
     * This is also propagated to the package manager and
     * applies to its specific install command.
     *
     * Default: LogLevel.WARNING
     */
    override fun logLevel(): LogLevel? = unwrap(this).getLogLevel()?.let(LogLevel::wrap)

    /**
     * How to determine the entry point for modules.
     *
     * Try ['module', 'main'] to default to ES module versions.
     *
     * Default: []
     */
    override fun mainFields(): List<String> = unwrap(this).getMainFields() ?: emptyList()

    /**
     * This option tells esbuild to write out a JSON file relative to output directory with metadata
     * about the build.
     *
     * The metadata in this JSON file follows this schema (specified using TypeScript syntax):
     *
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
     * This data can then be analyzed by other tools. For example,
     * bundle buddy can consume esbuild's metadata format and generates a treemap visualization
     * of the modules in your bundle and how much space each one takes up.
     *
     * Default: false
     *
     * [Documentation](https://esbuild.github.io/api/#metafile)
     */
    override fun metafile(): Boolean? = unwrap(this).getMetafile()

    /**
     * Whether to minify files when bundling.
     *
     * Default: false
     */
    override fun minify(): Boolean? = unwrap(this).getMinify()

    /**
     * Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     *
     * Default: - no networking options
     */
    override fun network(): String? = unwrap(this).getNetwork()

    /**
     * A list of modules that should be installed instead of bundled.
     *
     * Modules are
     * installed in a Lambda compatible environment only when bundling runs in
     * Docker.
     *
     * Default: - all modules are bundled
     */
    override fun nodeModules(): List<String> = unwrap(this).getNodeModules() ?: emptyList()

    /**
     * Set platform if server is multi-platform capable. *Requires Docker Engine API v1.38+*.
     *
     * Example value: `linux/amd64`
     *
     * Default: - no platform specified
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * Run compilation using tsc before running file through bundling step.
     *
     * This usually is not required unless you are using new experimental features that
     * are only supported by typescript's `tsc` compiler.
     * One example of such feature is `emitDecoratorMetadata`.
     *
     * Default: false
     */
    override fun preCompilation(): Boolean? = unwrap(this).getPreCompilation()

    /**
     * [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     *
     * Default: - no security options
     */
    override fun securityOpt(): String? = unwrap(this).getSecurityOpt()

    /**
     * Whether to include source maps when bundling.
     *
     * Default: false
     */
    override fun sourceMap(): Boolean? = unwrap(this).getSourceMap()

    /**
     * Source map mode to be used when bundling.
     *
     * Default: SourceMapMode.DEFAULT
     *
     * [Documentation](https://esbuild.github.io/api/#sourcemap)
     */
    override fun sourceMapMode(): SourceMapMode? =
        unwrap(this).getSourceMapMode()?.let(SourceMapMode::wrap)

    /**
     * Whether to include original source code in source maps when bundling.
     *
     * Default: true
     *
     * [Documentation](https://esbuild.github.io/api/#sources-content)
     */
    override fun sourcesContent(): Boolean? = unwrap(this).getSourcesContent()

    /**
     * Target environment for the generated JavaScript code.
     *
     * Default: - the node version of the runtime
     *
     * [Documentation](https://esbuild.github.io/api/#target)
     */
    override fun target(): String? = unwrap(this).getTarget()

    /**
     * Normally the esbuild automatically discovers `tsconfig.json` files and reads their contents
     * during a build.
     *
     * However, you can also configure a custom `tsconfig.json` file to use instead.
     *
     * This is similar to entry path, you need to provide path to your custom `tsconfig.json`.
     *
     * This can be useful if you need to do multiple builds of the same code with different
     * settings.
     *
     * For example, `{ 'tsconfig': 'path/custom.tsconfig.json' }`.
     *
     * Default: - automatically discovered by `esbuild`
     */
    override fun tsconfig(): String? = unwrap(this).getTsconfig()

    /**
     * The user to use when running the container.
     *
     * Default: - root or image default
     */
    override fun user(): String? = unwrap(this).getUser()

    /**
     * Docker volumes to mount.
     *
     * Default: - no volumes are mounted
     */
    override fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap)
        ?: emptyList()

    /**
     * Where to mount the specified volumes from.
     *
     * Default: - no containers are specified to mount volumes from
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/run/#mount-volumes-from-container---volumes-from)
     */
    override fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

    /**
     * Working directory inside the container.
     *
     * Default: - image default
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BundlingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.BundlingOptions):
        BundlingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BundlingOptions):
        software.amazon.awscdk.services.lambda.nodejs.BundlingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.nodejs.BundlingOptions
  }
}
