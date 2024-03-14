package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

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
