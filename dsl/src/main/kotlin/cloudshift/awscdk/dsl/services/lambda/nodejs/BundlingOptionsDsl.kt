@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda.nodejs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.DockerVolumeDsl
import software.amazon.awscdk.BundlingFileAccess
import software.amazon.awscdk.DockerImage
import software.amazon.awscdk.DockerVolume
import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions
import software.amazon.awscdk.services.lambda.nodejs.Charset
import software.amazon.awscdk.services.lambda.nodejs.ICommandHooks
import software.amazon.awscdk.services.lambda.nodejs.LogLevel
import software.amazon.awscdk.services.lambda.nodejs.OutputFormat
import software.amazon.awscdk.services.lambda.nodejs.SourceMapMode
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

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

    public fun assetHash(assetHash: String) {
        cdkBuilder.assetHash(assetHash)
    }

    public fun banner(banner: String) {
        cdkBuilder.banner(banner)
    }

    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
        cdkBuilder.bundlingFileAccess(bundlingFileAccess)
    }

    public fun charset(charset: Charset) {
        cdkBuilder.charset(charset)
    }

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun commandHooks(commandHooks: ICommandHooks) {
        cdkBuilder.commandHooks(commandHooks)
    }

    public fun define(define: Map<String, String>) {
        cdkBuilder.define(define)
    }

    public fun dockerImage(dockerImage: DockerImage) {
        cdkBuilder.dockerImage(dockerImage)
    }

    public fun entrypoint(vararg entrypoint: String) {
        _entrypoint.addAll(listOf(*entrypoint))
    }

    public fun entrypoint(entrypoint: Collection<String>) {
        _entrypoint.addAll(entrypoint)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun esbuildArgs(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.esbuildArgs(builder.map)
    }

    public fun esbuildArgs(esbuildArgs: Map<String, Any>) {
        cdkBuilder.esbuildArgs(esbuildArgs)
    }

    public fun esbuildVersion(esbuildVersion: String) {
        cdkBuilder.esbuildVersion(esbuildVersion)
    }

    public fun externalModules(vararg externalModules: String) {
        _externalModules.addAll(listOf(*externalModules))
    }

    public fun externalModules(externalModules: Collection<String>) {
        _externalModules.addAll(externalModules)
    }

    public fun footer(footer: String) {
        cdkBuilder.footer(footer)
    }

    public fun forceDockerBundling(forceDockerBundling: Boolean) {
        cdkBuilder.forceDockerBundling(forceDockerBundling)
    }

    public fun format(format: OutputFormat) {
        cdkBuilder.format(format)
    }

    public fun inject(vararg inject: String) {
        _inject.addAll(listOf(*inject))
    }

    public fun inject(inject: Collection<String>) {
        _inject.addAll(inject)
    }

    public fun keepNames(keepNames: Boolean) {
        cdkBuilder.keepNames(keepNames)
    }

    public fun loader(loader: Map<String, String>) {
        cdkBuilder.loader(loader)
    }

    public fun logLevel(logLevel: LogLevel) {
        cdkBuilder.logLevel(logLevel)
    }

    public fun mainFields(vararg mainFields: String) {
        _mainFields.addAll(listOf(*mainFields))
    }

    public fun mainFields(mainFields: Collection<String>) {
        _mainFields.addAll(mainFields)
    }

    public fun metafile(metafile: Boolean) {
        cdkBuilder.metafile(metafile)
    }

    public fun minify(minify: Boolean) {
        cdkBuilder.minify(minify)
    }

    public fun network(network: String) {
        cdkBuilder.network(network)
    }

    public fun nodeModules(vararg nodeModules: String) {
        _nodeModules.addAll(listOf(*nodeModules))
    }

    public fun nodeModules(nodeModules: Collection<String>) {
        _nodeModules.addAll(nodeModules)
    }

    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    public fun preCompilation(preCompilation: Boolean) {
        cdkBuilder.preCompilation(preCompilation)
    }

    public fun securityOpt(securityOpt: String) {
        cdkBuilder.securityOpt(securityOpt)
    }

    public fun sourceMap(sourceMap: Boolean) {
        cdkBuilder.sourceMap(sourceMap)
    }

    public fun sourceMapMode(sourceMapMode: SourceMapMode) {
        cdkBuilder.sourceMapMode(sourceMapMode)
    }

    public fun sourcesContent(sourcesContent: Boolean) {
        cdkBuilder.sourcesContent(sourcesContent)
    }

    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun tsconfig(tsconfig: String) {
        cdkBuilder.tsconfig(tsconfig)
    }

    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun volumes(volumes: DockerVolumeDsl.() -> Unit) {
        _volumes.add(DockerVolumeDsl().apply(volumes).build())
    }

    public fun volumes(volumes: Collection<DockerVolume>) {
        _volumes.addAll(volumes)
    }

    public fun volumesFrom(vararg volumesFrom: String) {
        _volumesFrom.addAll(listOf(*volumesFrom))
    }

    public fun volumesFrom(volumesFrom: Collection<String>) {
        _volumesFrom.addAll(volumesFrom)
    }

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
