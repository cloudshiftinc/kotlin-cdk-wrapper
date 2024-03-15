@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface RuntimePlatform {
  public fun cpuArchitecture(): CpuArchitecture? =
      unwrap(this).getCpuArchitecture()?.let(CpuArchitecture::wrap)

  public fun operatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cpuArchitecture(cpuArchitecture: CpuArchitecture)

    public fun operatingSystemFamily(operatingSystemFamily: OperatingSystemFamily)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RuntimePlatform.Builder =
        software.amazon.awscdk.services.ecs.RuntimePlatform.builder()

    override fun cpuArchitecture(cpuArchitecture: CpuArchitecture) {
      cdkBuilder.cpuArchitecture(cpuArchitecture.let(CpuArchitecture::unwrap))
    }

    override fun operatingSystemFamily(operatingSystemFamily: OperatingSystemFamily) {
      cdkBuilder.operatingSystemFamily(operatingSystemFamily.let(OperatingSystemFamily::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RuntimePlatform = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.RuntimePlatform,
  ) : CdkObject(cdkObject), RuntimePlatform {
    override fun cpuArchitecture(): CpuArchitecture? =
        unwrap(this).getCpuArchitecture()?.let(CpuArchitecture::wrap)

    override fun operatingSystemFamily(): OperatingSystemFamily? =
        unwrap(this).getOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatform {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RuntimePlatform):
        RuntimePlatform = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimePlatform):
        software.amazon.awscdk.services.ecs.RuntimePlatform = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.RuntimePlatform
  }
}
