@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ContainerOverrides {
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun gpuCount(): Number? = unwrap(this).getGpuCount()

  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  public fun memory(): Number? = unwrap(this).getMemory()

  public fun vcpus(): Number? = unwrap(this).getVcpus()

  @CdkDslMarker
  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun environment(environment: Map<String, String>)

    public fun gpuCount(gpuCount: Number)

    public fun instanceType(instanceType: InstanceType)

    public fun memory(memory: Number)

    public fun vcpus(vcpus: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun memory(memory: Number) {
      cdkBuilder.memory(memory)
    }

    override fun vcpus(vcpus: Number) {
      cdkBuilder.vcpus(vcpus)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides,
  ) : CdkObject(cdkObject), ContainerOverrides {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun gpuCount(): Number? = unwrap(this).getGpuCount()

    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    override fun memory(): Number? = unwrap(this).getMemory()

    override fun vcpus(): Number? = unwrap(this).getVcpus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerOverrides {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides):
        ContainerOverrides = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerOverrides):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides
  }
}
