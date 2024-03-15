@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class AmiHardwareType(
  private val cdkObject: software.amazon.awscdk.services.ecs.AmiHardwareType,
) {
  STANDARD(software.amazon.awscdk.services.ecs.AmiHardwareType.STANDARD),
  GPU(software.amazon.awscdk.services.ecs.AmiHardwareType.GPU),
  ARM(software.amazon.awscdk.services.ecs.AmiHardwareType.ARM),
  NEURON(software.amazon.awscdk.services.ecs.AmiHardwareType.NEURON),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AmiHardwareType):
        AmiHardwareType = when (cdkObject) {
      software.amazon.awscdk.services.ecs.AmiHardwareType.STANDARD -> AmiHardwareType.STANDARD
      software.amazon.awscdk.services.ecs.AmiHardwareType.GPU -> AmiHardwareType.GPU
      software.amazon.awscdk.services.ecs.AmiHardwareType.ARM -> AmiHardwareType.ARM
      software.amazon.awscdk.services.ecs.AmiHardwareType.NEURON -> AmiHardwareType.NEURON
    }

    internal fun unwrap(wrapped: AmiHardwareType):
        software.amazon.awscdk.services.ecs.AmiHardwareType = wrapped.cdkObject
  }
}
