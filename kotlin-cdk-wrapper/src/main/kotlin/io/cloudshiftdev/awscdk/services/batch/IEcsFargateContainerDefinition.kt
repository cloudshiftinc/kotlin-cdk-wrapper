@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.CpuArchitecture
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.OperatingSystemFamily
import kotlin.Boolean

/**
 * A container orchestrated by ECS that uses Fargate resources and is orchestrated by ECS.
 */
public interface IEcsFargateContainerDefinition : IEcsContainerDefinition {
  /**
   * Indicates whether the job has a public IP address.
   *
   * For a job that's running on Fargate resources in a private subnet to send outbound traffic to
   * the internet
   * (for example, to pull container images), the private subnet requires a NAT gateway be attached
   * to route requests to the internet.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
   */
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  /**
   * The size for ephemeral storage.
   *
   * Default: - 20 GiB
   */
  public fun ephemeralStorageSize(): Size? = unwrap(this).getEphemeralStorageSize()?.let(Size::wrap)

  /**
   * The vCPU architecture of Fargate Runtime.
   *
   * Default: - X86_64
   */
  public fun fargateCpuArchitecture(): CpuArchitecture? =
      unwrap(this).getFargateCpuArchitecture()?.let(CpuArchitecture::wrap)

  /**
   * The operating system for the compute environment.
   *
   * Default: - LINUX
   */
  public fun fargateOperatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getFargateOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  /**
   * Which version of Fargate to use when running this container.
   *
   * Default: LATEST
   */
  public fun fargatePlatformVersion(): FargatePlatformVersion? =
      unwrap(this).getFargatePlatformVersion()?.let(FargatePlatformVersion::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition):
        IEcsFargateContainerDefinition = CdkObjectWrappers.wrap(cdkObject) as
        IEcsFargateContainerDefinition

    internal fun unwrap(wrapped: IEcsFargateContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEcsFargateContainerDefinition
  }
}
