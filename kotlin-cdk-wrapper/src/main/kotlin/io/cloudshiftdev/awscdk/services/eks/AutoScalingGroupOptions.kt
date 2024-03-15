@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
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

  @CdkDslMarker
  public interface Builder {
    public fun bootstrapEnabled(bootstrapEnabled: Boolean)

    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d4cc298e1a141bfe30c0688c4d52933f953d9ee9faabe7dce5297672fcb2ea6")
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit)

    public fun machineImageType(machineImageType: MachineImageType)

    public fun mapRole(mapRole: Boolean)

    public fun spotInterruptHandler(spotInterruptHandler: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AutoScalingGroupOptions.Builder =
        software.amazon.awscdk.services.eks.AutoScalingGroupOptions.builder()

    override fun bootstrapEnabled(bootstrapEnabled: Boolean) {
      cdkBuilder.bootstrapEnabled(bootstrapEnabled)
    }

    override fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
      cdkBuilder.bootstrapOptions(bootstrapOptions.let(BootstrapOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d4cc298e1a141bfe30c0688c4d52933f953d9ee9faabe7dce5297672fcb2ea6")
    override fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit): Unit =
        bootstrapOptions(BootstrapOptions(bootstrapOptions))

    override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    override fun mapRole(mapRole: Boolean) {
      cdkBuilder.mapRole(mapRole)
    }

    override fun spotInterruptHandler(spotInterruptHandler: Boolean) {
      cdkBuilder.spotInterruptHandler(spotInterruptHandler)
    }

    public fun build(): software.amazon.awscdk.services.eks.AutoScalingGroupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupOptions,
  ) : CdkObject(cdkObject), AutoScalingGroupOptions {
    override fun bootstrapEnabled(): Boolean? = unwrap(this).getBootstrapEnabled()

    override fun bootstrapOptions(): BootstrapOptions? =
        unwrap(this).getBootstrapOptions()?.let(BootstrapOptions::wrap)

    override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    override fun mapRole(): Boolean? = unwrap(this).getMapRole()

    override fun spotInterruptHandler(): Boolean? = unwrap(this).getSpotInterruptHandler()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupOptions):
        AutoScalingGroupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoScalingGroupOptions):
        software.amazon.awscdk.services.eks.AutoScalingGroupOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.AutoScalingGroupOptions
  }
}
