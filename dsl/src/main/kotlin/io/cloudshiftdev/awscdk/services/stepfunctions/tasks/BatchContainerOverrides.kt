package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface BatchContainerOverrides {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun gpuCount(): Number? = unwrap(this).getGpuCount()

  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  public fun memory(): Size? = unwrap(this).getMemory()?.let(Size::wrap)

  public fun vcpus(): Number? = unwrap(this).getVcpus()

  public interface Builder {
    public fun command(command: List<String>) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun gpuCount(gpuCount: Number) {
    }

    public fun instanceType(instanceType: InstanceType) {
    }

    public fun memory(memory: Size) {
    }

    public fun vcpus(vcpus: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides.builder()

    public override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    public override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    public override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size::unwrap))
    }

    public override fun vcpus(vcpus: Number) {
      cdkBuilder.vcpus(vcpus)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides,
  ) : BatchContainerOverrides {
    public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
        emptyMap()

    public override fun gpuCount(): Number? = unwrap(this).getGpuCount()

    public override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    public override fun memory(): Size? = unwrap(this).getMemory()?.let(Size::wrap)

    public override fun vcpus(): Number? = unwrap(this).getVcpus()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BatchContainerOverrides {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides):
        BatchContainerOverrides = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchContainerOverrides):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides = (wrapped as
        Wrapper).cdkObject
  }
}
