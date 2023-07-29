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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CpuArchitecture
import software.amazon.awscdk.services.ecs.OperatingSystemFamily
import software.amazon.awscdk.services.ecs.RuntimePlatform

/**
 * The interface for Runtime Platform.
 *
 * Example:
 * ```
 * // Create a Task Definition for the Windows container to start
 * FargateTaskDefinition taskDefinition = FargateTaskDefinition.Builder.create(this, "TaskDef")
 * .runtimePlatform(RuntimePlatform.builder()
 * .operatingSystemFamily(OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)
 * .cpuArchitecture(CpuArchitecture.X86_64)
 * .build())
 * .cpu(1024)
 * .memoryLimitMiB(2048)
 * .build();
 * taskDefinition.addContainer("windowsservercore", ContainerDefinitionOptions.builder()
 * .logging(LogDriver.awsLogs(AwsLogDriverProps.builder().streamPrefix("win-iis-on-fargate").build()))
 * .portMappings(List.of(PortMapping.builder().containerPort(80).build()))
 * .image(ContainerImage.fromRegistry("mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019"))
 * .build());
 * ```
 */
@CdkDslMarker
public class RuntimePlatformDsl {
    private val cdkBuilder: RuntimePlatform.Builder = RuntimePlatform.builder()

    /** @param cpuArchitecture The CpuArchitecture for Fargate Runtime Platform. */
    public fun cpuArchitecture(cpuArchitecture: CpuArchitecture) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
    }

    /** @param operatingSystemFamily The operating system for Fargate Runtime Platform. */
    public fun operatingSystemFamily(operatingSystemFamily: OperatingSystemFamily) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
    }

    public fun build(): RuntimePlatform = cdkBuilder.build()
}
