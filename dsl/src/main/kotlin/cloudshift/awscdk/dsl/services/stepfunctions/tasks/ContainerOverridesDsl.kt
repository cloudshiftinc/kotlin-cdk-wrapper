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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class ContainerOverridesDsl {
    private val cdkBuilder: ContainerOverrides.Builder = ContainerOverrides.builder()

    private val _command: MutableList<String> = mutableListOf()

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun gpuCount(gpuCount: Number) {
        cdkBuilder.gpuCount(gpuCount)
    }

    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun memory(memory: Number) {
        cdkBuilder.memory(memory)
    }

    public fun vcpus(vcpus: Number) {
        cdkBuilder.vcpus(vcpus)
    }

    public fun build(): ContainerOverrides {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        return cdkBuilder.build()
    }
}
