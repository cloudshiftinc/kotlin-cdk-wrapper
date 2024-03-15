@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String

/**
 * The operating system for Fargate Runtime Platform.
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
public open class OperatingSystemFamily internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.OperatingSystemFamily,
) : CdkObject(cdkObject) {
  /**
   * Returns true if the operating system family is Windows.
   */
  public open fun isWindows(): Boolean = unwrap(this).isWindows()

  public companion object {
    public val LINUX: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.LINUX)

    public val WINDOWS_SERVER_2004_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2004_CORE)

    public val WINDOWS_SERVER_2016_FULL: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2016_FULL)

    public val WINDOWS_SERVER_2019_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)

    public val WINDOWS_SERVER_2019_FULL: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2019_FULL)

    public val WINDOWS_SERVER_2022_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2022_CORE)

    public val WINDOWS_SERVER_2022_FULL: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_2022_FULL)

    public val WINDOWS_SERVER_20_H2_CORE: OperatingSystemFamily =
        OperatingSystemFamily.wrap(software.amazon.awscdk.services.ecs.OperatingSystemFamily.WINDOWS_SERVER_20_H2_CORE)

    public fun of(family: String): OperatingSystemFamily =
        software.amazon.awscdk.services.ecs.OperatingSystemFamily.of(family).let(OperatingSystemFamily::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.OperatingSystemFamily):
        OperatingSystemFamily = OperatingSystemFamily(cdkObject)

    internal fun unwrap(wrapped: OperatingSystemFamily):
        software.amazon.awscdk.services.ecs.OperatingSystemFamily = wrapped.cdkObject
  }
}
