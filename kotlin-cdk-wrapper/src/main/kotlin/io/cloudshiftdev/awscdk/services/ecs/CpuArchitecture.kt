@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The CpuArchitecture for Fargate Runtime Platform.
 *
 * Example:
 *
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
public open class CpuArchitecture internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CpuArchitecture,
) : CdkObject(cdkObject) {
  public companion object {
    public val ARM64: CpuArchitecture =
        CpuArchitecture.wrap(software.amazon.awscdk.services.ecs.CpuArchitecture.ARM64)

    public val X86_64: CpuArchitecture =
        CpuArchitecture.wrap(software.amazon.awscdk.services.ecs.CpuArchitecture.X86_64)

    public fun of(cpuArchitecture: String): CpuArchitecture =
        software.amazon.awscdk.services.ecs.CpuArchitecture.of(cpuArchitecture).let(CpuArchitecture::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CpuArchitecture):
        CpuArchitecture = CpuArchitecture(cdkObject)

    internal fun unwrap(wrapped: CpuArchitecture):
        software.amazon.awscdk.services.ecs.CpuArchitecture = wrapped.cdkObject
  }
}
