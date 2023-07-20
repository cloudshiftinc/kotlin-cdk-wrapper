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
import software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps
import software.amazon.awscdk.services.ecs.ProxyConfiguration
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CommonTaskDefinitionPropsDsl {
    private val cdkBuilder: CommonTaskDefinitionProps.Builder = CommonTaskDefinitionProps.builder()

    private val _volumes: MutableList<Volume> = mutableListOf()

    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
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

    public fun build(): CommonTaskDefinitionProps {
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
