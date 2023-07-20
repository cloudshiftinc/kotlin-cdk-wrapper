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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.DockerCacheOption
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class DockerImageSourceDsl {
    private val cdkBuilder: DockerImageSource.Builder = DockerImageSource.builder()

    private val _cacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    private val _dockerOutputs: MutableList<String> = mutableListOf()

    private val _executable: MutableList<String> = mutableListOf()

    public fun cacheFrom(cacheFrom: DockerCacheOptionDsl.() -> Unit) {
        _cacheFrom.add(DockerCacheOptionDsl().apply(cacheFrom).build())
    }

    public fun cacheFrom(cacheFrom: Collection<DockerCacheOption>) {
        _cacheFrom.addAll(cacheFrom)
    }

    public fun cacheTo(block: DockerCacheOptionDsl.() -> Unit = {}) {
        val builder = DockerCacheOptionDsl()
        builder.apply(block)
        cdkBuilder.cacheTo(builder.build())
    }

    public fun cacheTo(cacheTo: DockerCacheOption) {
        cdkBuilder.cacheTo(cacheTo)
    }

    public fun directory(directory: String) {
        cdkBuilder.directory(directory)
    }

    public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>) {
        cdkBuilder.dockerBuildArgs(dockerBuildArgs)
    }

    public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>) {
        cdkBuilder.dockerBuildSecrets(dockerBuildSecrets)
    }

    public fun dockerBuildTarget(dockerBuildTarget: String) {
        cdkBuilder.dockerBuildTarget(dockerBuildTarget)
    }

    public fun dockerFile(dockerFile: String) {
        cdkBuilder.dockerFile(dockerFile)
    }

    public fun dockerOutputs(vararg dockerOutputs: String) {
        _dockerOutputs.addAll(listOf(*dockerOutputs))
    }

    public fun dockerOutputs(dockerOutputs: Collection<String>) {
        _dockerOutputs.addAll(dockerOutputs)
    }

    public fun executable(vararg executable: String) {
        _executable.addAll(listOf(*executable))
    }

    public fun executable(executable: Collection<String>) {
        _executable.addAll(executable)
    }

    public fun networkMode(networkMode: String) {
        cdkBuilder.networkMode(networkMode)
    }

    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    public fun build(): DockerImageSource {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        if (_dockerOutputs.isNotEmpty()) cdkBuilder.dockerOutputs(_dockerOutputs)
        if (_executable.isNotEmpty()) cdkBuilder.executable(_executable)
        return cdkBuilder.build()
    }
}
