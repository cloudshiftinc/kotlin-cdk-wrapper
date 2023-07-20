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

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ecs.RuntimePlatformDsl
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps
import kotlin.Number
import kotlin.Unit

@CdkDslMarker
public class FargateServiceBasePropsDsl {
    private val cdkBuilder: FargateServiceBaseProps.Builder = FargateServiceBaseProps.builder()

    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public fun platformVersion(platformVersion: FargatePlatformVersion) {
        cdkBuilder.platformVersion(platformVersion)
    }

    public fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}) {
        val builder = RuntimePlatformDsl()
        builder.apply(block)
        cdkBuilder.runtimePlatform(builder.build())
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
        cdkBuilder.runtimePlatform(runtimePlatform)
    }

    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): FargateServiceBaseProps = cdkBuilder.build()
}
