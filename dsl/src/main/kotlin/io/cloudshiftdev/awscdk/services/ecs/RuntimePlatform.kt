package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Unit

public interface RuntimePlatform {
  public fun cpuArchitecture(): CpuArchitecture? =
      unwrap(this).getCpuArchitecture()?.let(CpuArchitecture::wrap)

  public fun operatingSystemFamily(): OperatingSystemFamily? =
      unwrap(this).getOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.RuntimePlatform,
  ) : RuntimePlatform {
    override fun cpuArchitecture(): CpuArchitecture? =
        unwrap(this).getCpuArchitecture()?.let(CpuArchitecture::wrap)

    override fun operatingSystemFamily(): OperatingSystemFamily? =
        unwrap(this).getOperatingSystemFamily()?.let(OperatingSystemFamily::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatform {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RuntimePlatform):
        RuntimePlatform = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimePlatform):
        software.amazon.awscdk.services.ecs.RuntimePlatform = (wrapped as Wrapper).cdkObject
  }
}
