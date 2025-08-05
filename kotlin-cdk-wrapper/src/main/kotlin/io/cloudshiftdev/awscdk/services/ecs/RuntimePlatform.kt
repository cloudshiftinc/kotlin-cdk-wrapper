@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * The interface for Runtime Platform.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService applicationLoadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .minHealthyPercent(100)
 * .runtimePlatform(RuntimePlatform.builder()
 * .cpuArchitecture(CpuArchitecture.ARM64)
 * .operatingSystemFamily(OperatingSystemFamily.LINUX)
 * .build())
 * .build();
 * ```
 */
public interface RuntimePlatform {
  /**
   * The CpuArchitecture for Fargate Runtime Platform.
   *
   * Default: - Undefined.
   */
  public fun cpuArchitecture(): CpuArchitecture? =
      unwrap(this).getCpuArchitecture()?.let(CpuArchitecture::wrap)

  /**
   * The operating system for Fargate Runtime Platform.
   *
   * Default: - Undefined.
   */
  public fun operatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  /**
   * A builder for [RuntimePlatform]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cpuArchitecture The CpuArchitecture for Fargate Runtime Platform.
     */
    public fun cpuArchitecture(cpuArchitecture: CpuArchitecture)

    /**
     * @param operatingSystemFamily The operating system for Fargate Runtime Platform.
     */
    public fun operatingSystemFamily(operatingSystemFamily: OperatingSystemFamily)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RuntimePlatform.Builder =
        software.amazon.awscdk.services.ecs.RuntimePlatform.builder()

    /**
     * @param cpuArchitecture The CpuArchitecture for Fargate Runtime Platform.
     */
    override fun cpuArchitecture(cpuArchitecture: CpuArchitecture) {
      cdkBuilder.cpuArchitecture(cpuArchitecture.let(CpuArchitecture.Companion::unwrap))
    }

    /**
     * @param operatingSystemFamily The operating system for Fargate Runtime Platform.
     */
    override fun operatingSystemFamily(operatingSystemFamily: OperatingSystemFamily) {
      cdkBuilder.operatingSystemFamily(operatingSystemFamily.let(OperatingSystemFamily.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RuntimePlatform = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.RuntimePlatform,
  ) : CdkObject(cdkObject),
      RuntimePlatform {
    /**
     * The CpuArchitecture for Fargate Runtime Platform.
     *
     * Default: - Undefined.
     */
    override fun cpuArchitecture(): CpuArchitecture? =
        unwrap(this).getCpuArchitecture()?.let(CpuArchitecture::wrap)

    /**
     * The operating system for Fargate Runtime Platform.
     *
     * Default: - Undefined.
     */
    override fun operatingSystemFamily(): OperatingSystemFamily? =
        unwrap(this).getOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatform {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RuntimePlatform):
        RuntimePlatform = CdkObjectWrappers.wrap(cdkObject) as? RuntimePlatform ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimePlatform):
        software.amazon.awscdk.services.ecs.RuntimePlatform = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.RuntimePlatform
  }
}
