package io.cloudshiftdev.awscdk.services.lambda.nodejs

import io.cloudshiftdev.awscdk.BundlingFileAccess
import io.cloudshiftdev.awscdk.DockerImage
import io.cloudshiftdev.awscdk.DockerRunOptions
import io.cloudshiftdev.awscdk.DockerVolume
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface BundlingOptions : DockerRunOptions {
  public fun assetHash(): String? = unwrap(this).getAssetHash()

  public fun banner(): String? = unwrap(this).getBanner()

  public fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

  public fun bundleAwsSdk(): Boolean? = unwrap(this).getBundleAwsSDK()

  public fun bundlingFileAccess(): BundlingFileAccess? =
      unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

  public fun charset(): Charset? = unwrap(this).getCharset()?.let(Charset::wrap)

  public fun commandHooks(): ICommandHooks? =
      unwrap(this).getCommandHooks()?.let(ICommandHooks::wrap)

  public fun define(): Map<String, String> = unwrap(this).getDefine() ?: emptyMap()

  public fun dockerImage(): DockerImage? = unwrap(this).getDockerImage()?.let(DockerImage::wrap)

  public fun esbuildArgs(): Map<String, Any> = unwrap(this).getEsbuildArgs() ?: emptyMap()

  public fun esbuildVersion(): String? = unwrap(this).getEsbuildVersion()

  public fun externalModules(): List<String> = unwrap(this).getExternalModules() ?: emptyList()

  public fun footer(): String? = unwrap(this).getFooter()

  public fun forceDockerBundling(): Boolean? = unwrap(this).getForceDockerBundling()

  public fun format(): OutputFormat? = unwrap(this).getFormat()?.let(OutputFormat::wrap)

  public fun inject(): List<String> = unwrap(this).getInject() ?: emptyList()

  public fun keepNames(): Boolean? = unwrap(this).getKeepNames()

  public fun loader(): Map<String, String> = unwrap(this).getLoader() ?: emptyMap()

  public fun logLevel(): LogLevel? = unwrap(this).getLogLevel()?.let(LogLevel::wrap)

  public fun mainFields(): List<String> = unwrap(this).getMainFields() ?: emptyList()

  public fun metafile(): Boolean? = unwrap(this).getMetafile()

  public fun minify(): Boolean? = unwrap(this).getMinify()

  public fun nodeModules(): List<String> = unwrap(this).getNodeModules() ?: emptyList()

  public fun preCompilation(): Boolean? = unwrap(this).getPreCompilation()

  public fun sourceMap(): Boolean? = unwrap(this).getSourceMap()

  public fun sourceMapMode(): SourceMapMode? =
      unwrap(this).getSourceMapMode()?.let(SourceMapMode::wrap)

  public fun sourcesContent(): Boolean? = unwrap(this).getSourcesContent()

  public fun target(): String? = unwrap(this).getTarget()

  public fun tsconfig(): String? = unwrap(this).getTsconfig()

  public interface Builder {
    public fun assetHash(assetHash: String)

    public fun banner(banner: String)

    public fun buildArgs(buildArgs: Map<String, String>)

    public fun bundleAwsSdk(bundleAwsSdk: Boolean)

    public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess)

    public fun charset(charset: Charset)

    public fun command(command: List<String>)

    public fun commandHooks(commandHooks: ICommandHooks)

    public fun define(define: Map<String, String>)

    public fun dockerImage(dockerImage: DockerImage)

    public fun entrypoint(entrypoint: List<String>)

    public fun environment(environment: Map<String, String>)

    public fun esbuildArgs(esbuildArgs: Map<String, Any>)

    public fun esbuildVersion(esbuildVersion: String)

    public fun externalModules(externalModules: List<String>)

    public fun footer(footer: String)

    public fun forceDockerBundling(forceDockerBundling: Boolean)

    public fun format(format: OutputFormat)

    public fun inject(inject: List<String>)

    public fun keepNames(keepNames: Boolean)

    public fun loader(loader: Map<String, String>)

    public fun logLevel(logLevel: LogLevel)

    public fun mainFields(mainFields: List<String>)

    public fun metafile(metafile: Boolean)

    public fun minify(minify: Boolean)

    public fun network(network: String)

    public fun nodeModules(nodeModules: List<String>)

    public fun platform(platform: String)

    public fun preCompilation(preCompilation: Boolean)

    public fun securityOpt(securityOpt: String)

    public fun sourceMap(sourceMap: Boolean)

    public fun sourceMapMode(sourceMapMode: SourceMapMode)

    public fun sourcesContent(sourcesContent: Boolean)

    public fun target(target: String)

    public fun tsconfig(tsconfig: String)

    public fun user(user: String)

    public fun volumes(volumes: List<DockerVolume>)

    public fun volumesFrom(volumesFrom: List<String>)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.nodejs.BundlingOptions.Builder =
        software.amazon.awscdk.services.lambda.nodejs.BundlingOptions.builder()

    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    override fun banner(banner: String) {
      cdkBuilder.banner(banner)
    }

    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    override fun bundleAwsSdk(bundleAwsSdk: Boolean) {
      cdkBuilder.bundleAwsSdk(bundleAwsSdk)
    }

    override fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
      cdkBuilder.bundlingFileAccess(bundlingFileAccess.let(BundlingFileAccess::unwrap))
    }

    override fun charset(charset: Charset) {
      cdkBuilder.charset(charset.let(Charset::unwrap))
    }

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun commandHooks(commandHooks: ICommandHooks) {
      cdkBuilder.commandHooks(commandHooks.let(ICommandHooks::unwrap))
    }

    override fun define(define: Map<String, String>) {
      cdkBuilder.define(define)
    }

    override fun dockerImage(dockerImage: DockerImage) {
      cdkBuilder.dockerImage(dockerImage.let(DockerImage::unwrap))
    }

    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun esbuildArgs(esbuildArgs: Map<String, Any>) {
      cdkBuilder.esbuildArgs(esbuildArgs)
    }

    override fun esbuildVersion(esbuildVersion: String) {
      cdkBuilder.esbuildVersion(esbuildVersion)
    }

    override fun externalModules(externalModules: List<String>) {
      cdkBuilder.externalModules(externalModules)
    }

    override fun footer(footer: String) {
      cdkBuilder.footer(footer)
    }

    override fun forceDockerBundling(forceDockerBundling: Boolean) {
      cdkBuilder.forceDockerBundling(forceDockerBundling)
    }

    override fun format(format: OutputFormat) {
      cdkBuilder.format(format.let(OutputFormat::unwrap))
    }

    override fun inject(inject: List<String>) {
      cdkBuilder.inject(inject)
    }

    override fun keepNames(keepNames: Boolean) {
      cdkBuilder.keepNames(keepNames)
    }

    override fun loader(loader: Map<String, String>) {
      cdkBuilder.loader(loader)
    }

    override fun logLevel(logLevel: LogLevel) {
      cdkBuilder.logLevel(logLevel.let(LogLevel::unwrap))
    }

    override fun mainFields(mainFields: List<String>) {
      cdkBuilder.mainFields(mainFields)
    }

    override fun metafile(metafile: Boolean) {
      cdkBuilder.metafile(metafile)
    }

    override fun minify(minify: Boolean) {
      cdkBuilder.minify(minify)
    }

    override fun network(network: String) {
      cdkBuilder.network(network)
    }

    override fun nodeModules(nodeModules: List<String>) {
      cdkBuilder.nodeModules(nodeModules)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun preCompilation(preCompilation: Boolean) {
      cdkBuilder.preCompilation(preCompilation)
    }

    override fun securityOpt(securityOpt: String) {
      cdkBuilder.securityOpt(securityOpt)
    }

    override fun sourceMap(sourceMap: Boolean) {
      cdkBuilder.sourceMap(sourceMap)
    }

    override fun sourceMapMode(sourceMapMode: SourceMapMode) {
      cdkBuilder.sourceMapMode(sourceMapMode.let(SourceMapMode::unwrap))
    }

    override fun sourcesContent(sourcesContent: Boolean) {
      cdkBuilder.sourcesContent(sourcesContent)
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    override fun tsconfig(tsconfig: String) {
      cdkBuilder.tsconfig(tsconfig)
    }

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    override fun volumes(volumes: List<DockerVolume>) {
      cdkBuilder.volumes(volumes.map(DockerVolume::unwrap))
    }

    override fun volumesFrom(volumesFrom: List<String>) {
      cdkBuilder.volumesFrom(volumesFrom)
    }

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.nodejs.BundlingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.nodejs.BundlingOptions,
  ) : BundlingOptions {
    override fun assetHash(): String? = unwrap(this).getAssetHash()

    override fun banner(): String? = unwrap(this).getBanner()

    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    override fun bundleAwsSdk(): Boolean? = unwrap(this).getBundleAwsSDK()

    override fun bundlingFileAccess(): BundlingFileAccess? =
        unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

    override fun charset(): Charset? = unwrap(this).getCharset()?.let(Charset::wrap)

    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun commandHooks(): ICommandHooks? =
        unwrap(this).getCommandHooks()?.let(ICommandHooks::wrap)

    override fun define(): Map<String, String> = unwrap(this).getDefine() ?: emptyMap()

    override fun dockerImage(): DockerImage? = unwrap(this).getDockerImage()?.let(DockerImage::wrap)

    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun esbuildArgs(): Map<String, Any> = unwrap(this).getEsbuildArgs() ?: emptyMap()

    override fun esbuildVersion(): String? = unwrap(this).getEsbuildVersion()

    override fun externalModules(): List<String> = unwrap(this).getExternalModules() ?: emptyList()

    override fun footer(): String? = unwrap(this).getFooter()

    override fun forceDockerBundling(): Boolean? = unwrap(this).getForceDockerBundling()

    override fun format(): OutputFormat? = unwrap(this).getFormat()?.let(OutputFormat::wrap)

    override fun inject(): List<String> = unwrap(this).getInject() ?: emptyList()

    override fun keepNames(): Boolean? = unwrap(this).getKeepNames()

    override fun loader(): Map<String, String> = unwrap(this).getLoader() ?: emptyMap()

    override fun logLevel(): LogLevel? = unwrap(this).getLogLevel()?.let(LogLevel::wrap)

    override fun mainFields(): List<String> = unwrap(this).getMainFields() ?: emptyList()

    override fun metafile(): Boolean? = unwrap(this).getMetafile()

    override fun minify(): Boolean? = unwrap(this).getMinify()

    override fun network(): String? = unwrap(this).getNetwork()

    override fun nodeModules(): List<String> = unwrap(this).getNodeModules() ?: emptyList()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun preCompilation(): Boolean? = unwrap(this).getPreCompilation()

    override fun securityOpt(): String? = unwrap(this).getSecurityOpt()

    override fun sourceMap(): Boolean? = unwrap(this).getSourceMap()

    override fun sourceMapMode(): SourceMapMode? =
        unwrap(this).getSourceMapMode()?.let(SourceMapMode::wrap)

    override fun sourcesContent(): Boolean? = unwrap(this).getSourcesContent()

    override fun target(): String? = unwrap(this).getTarget()

    override fun tsconfig(): String? = unwrap(this).getTsconfig()

    override fun user(): String? = unwrap(this).getUser()

    override fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap)
        ?: emptyList()

    override fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BundlingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.BundlingOptions):
        BundlingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BundlingOptions):
        software.amazon.awscdk.services.lambda.nodejs.BundlingOptions = (wrapped as
        Wrapper).cdkObject
  }
}
