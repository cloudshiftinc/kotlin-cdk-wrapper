package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FargateServiceBaseProps {
  public fun cpu(): Number? = unwrap(this).getCpu()

  public fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  public fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

  public fun platformVersion(): FargatePlatformVersion? =
      unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

  public fun runtimePlatform(): RuntimePlatform? =
      unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

  public fun taskDefinition(): FargateTaskDefinition? =
      unwrap(this).getTaskDefinition()?.let(FargateTaskDefinition::wrap)

  public interface Builder {
    public fun cpu(cpu: Number)

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun platformVersion(platformVersion: FargatePlatformVersion)

    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad701131b10c34d9874ce28883035bf3ff7fc97460c81564c99f9214b961441c")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    public fun taskDefinition(taskDefinition: FargateTaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps.builder()

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad701131b10c34d9874ce28883035bf3ff7fc97460c81564c99f9214b961441c")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps,
  ) : FargateServiceBaseProps {
    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    override fun platformVersion(): FargatePlatformVersion? =
        unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

    override fun runtimePlatform(): RuntimePlatform? =
        unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

    override fun taskDefinition(): FargateTaskDefinition? =
        unwrap(this).getTaskDefinition()?.let(FargateTaskDefinition::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FargateServiceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps):
        FargateServiceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateServiceBaseProps):
        software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps = (wrapped as
        Wrapper).cdkObject
  }
}
