package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

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
      cdkBuilder.cpuArchitecture(cpuArchitecture.let(CpuArchitecture::unwrap))
    }

    /**
     * @param operatingSystemFamily The operating system for Fargate Runtime Platform.
     */
    override fun operatingSystemFamily(operatingSystemFamily: OperatingSystemFamily) {
      cdkBuilder.operatingSystemFamily(operatingSystemFamily.let(OperatingSystemFamily::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RuntimePlatform = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.RuntimePlatform,
  ) : RuntimePlatform {
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
