package io.cloudshiftdev.awscdk.services.eks

import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AutoScalingGroupOptions {
  public fun bootstrapEnabled(): Boolean? = unwrap(this).getBootstrapEnabled()

  public fun bootstrapOptions(): BootstrapOptions? =
      unwrap(this).getBootstrapOptions()?.let(BootstrapOptions::wrap)

  public fun machineImageType(): MachineImageType? =
      unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

  public fun mapRole(): Boolean? = unwrap(this).getMapRole()

  public fun spotInterruptHandler(): Boolean? = unwrap(this).getSpotInterruptHandler()

  public interface Builder {
    public fun bootstrapEnabled(bootstrapEnabled: Boolean) {
    }

    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d4cc298e1a141bfe30c0688c4d52933f953d9ee9faabe7dce5297672fcb2ea6")
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit) {
    }

    public fun machineImageType(machineImageType: MachineImageType) {
    }

    public fun mapRole(mapRole: Boolean) {
    }

    public fun spotInterruptHandler(spotInterruptHandler: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AutoScalingGroupOptions.Builder =
        software.amazon.awscdk.services.eks.AutoScalingGroupOptions.builder()

    public override fun bootstrapEnabled(bootstrapEnabled: Boolean) {
      cdkBuilder.bootstrapEnabled(bootstrapEnabled)
    }

    public override fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
      cdkBuilder.bootstrapOptions(bootstrapOptions.let(BootstrapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d4cc298e1a141bfe30c0688c4d52933f953d9ee9faabe7dce5297672fcb2ea6")
    public override fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit):
        Unit = bootstrapOptions(BootstrapOptions(bootstrapOptions))

    public override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    public override fun mapRole(mapRole: Boolean) {
      cdkBuilder.mapRole(mapRole)
    }

    public override fun spotInterruptHandler(spotInterruptHandler: Boolean) {
      cdkBuilder.spotInterruptHandler(spotInterruptHandler)
    }

    public fun build(): software.amazon.awscdk.services.eks.AutoScalingGroupOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupOptions,
  ) : AutoScalingGroupOptions {
    public override fun bootstrapEnabled(): Boolean? = unwrap(this).getBootstrapEnabled()

    public override fun bootstrapOptions(): BootstrapOptions? =
        unwrap(this).getBootstrapOptions()?.let(BootstrapOptions::wrap)

    public override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    public override fun mapRole(): Boolean? = unwrap(this).getMapRole()

    public override fun spotInterruptHandler(): Boolean? = unwrap(this).getSpotInterruptHandler()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupOptions):
        AutoScalingGroupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoScalingGroupOptions):
        software.amazon.awscdk.services.eks.AutoScalingGroupOptions = (wrapped as Wrapper).cdkObject
  }
}
