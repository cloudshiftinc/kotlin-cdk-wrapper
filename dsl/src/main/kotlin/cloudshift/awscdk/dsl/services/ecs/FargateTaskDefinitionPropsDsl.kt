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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class FargateTaskDefinitionPropsDsl {
    private val cdkBuilder: FargateTaskDefinitionProps.Builder = FargateTaskDefinitionProps.builder()

    private val _volumes: MutableList<Volume> = mutableListOf()

    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
        cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    public fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}) {
        val builder = RuntimePlatformDsl()
        builder.apply(block)
        cdkBuilder.runtimePlatform(builder.build())
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
        cdkBuilder.runtimePlatform(runtimePlatform)
    }

    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    public fun volumes(volumes: VolumeDsl.() -> Unit) {
        _volumes.add(VolumeDsl().apply(volumes).build())
    }

    public fun volumes(volumes: Collection<Volume>) {
        _volumes.addAll(volumes)
    }

    public fun build(): FargateTaskDefinitionProps {
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
